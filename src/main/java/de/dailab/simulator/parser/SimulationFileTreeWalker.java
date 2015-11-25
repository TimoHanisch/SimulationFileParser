package de.dailab.simulator.parser;

import de.dailab.simulator.parser.generated.SimulationFileBaseListener;
import de.dailab.simulator.parser.generated.SimulationFileParser;
import de.dailab.simulator.parser.objects.expressions.*;
import de.dailab.simulator.parser.objects.scopes.*;
import de.dailab.simulator.parser.objects.statements.*;
import de.dailab.simulator.parser.utils.ScopeHelper;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

/**
 * @author Timo Hanisch
 * @version 1.0
 * @since 07.05.2015
 */
public class SimulationFileTreeWalker extends SimulationFileBaseListener {

    private final Stack<Scope> scopeStack = new Stack<>();
    private SimulationScope simulationScope;
    private PartialTaskCreationStatement partialTaskCreationStatement;
    private TaskCreationStmt taskCreationStmt;
    private MetaCreationStatement metaCreationStmt;

    public SimulationScope getSimulation() {
        return simulationScope;
    }

    @Override
    public void enterSimulation_stmt(@NotNull SimulationFileParser.Simulation_stmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        simulationScope = new SimulationScope(name);
        scopeStack.push(simulationScope);
    }

    @Override
    public void enterString_assign(@NotNull SimulationFileParser.String_assignContext ctx) {
        String value = ctx.STRING_LITERAL().getText();
        if (ctx.getParent() instanceof SimulationFileParser.Config_stmtContext) {
            SimulationFileParser.Config_stmtContext parentCtx = (SimulationFileParser.Config_stmtContext) ctx.getParent();
            if (parentCtx.START() != null) {
                simulationScope.setStart(value.substring(1, value.length() - 1));
            } else if (parentCtx.GOAL() != null) {
                simulationScope.setGoal(value.substring(1, value.length() - 1));
            }
        } else if (ctx.getParent() instanceof SimulationFileParser.Meta_assignContext) {
            SimulationFileParser.Meta_assignContext parentCtx = (SimulationFileParser.Meta_assignContext) ctx.getParent();
            if (parentCtx.META() != null) {
                String key = parentCtx.IDENTIFIER().getText();
                if (this.partialTaskCreationStatement != null) {
                    if (!this.partialTaskCreationStatement.addMetaInfo(key, value)) {
                        System.err.println("Error while adding Meta");
                    }
                } else {
                    Scope currentScope = scopeStack.peek();
                    if (!currentScope.addScopeMetaVar(key, value)) {
                        System.err.println(key + " " + value);
                        System.err.println("Error while adding Meta");
                    }
                }
            }
        }
    }

    @Override
    public void enterMeta_link(@NotNull SimulationFileParser.Meta_linkContext ctx) {
        if (ctx.getParent() instanceof SimulationFileParser.Meta_assignContext) {
            SimulationFileParser.Meta_assignContext parentCtx = (SimulationFileParser.Meta_assignContext) ctx.getParent();
            String value = ctx.IDENTIFIER().getText();
            String key = parentCtx.IDENTIFIER().getText();
            MetaExpression metaExpression = new MetaExpression(value);
            if (partialTaskCreationStatement != null) {
                partialTaskCreationStatement.addExpressionMeta(key, metaExpression);
            }
        }
    }

    @Override
    public void enterInteger_assign(@NotNull SimulationFileParser.Integer_assignContext ctx) {
        int value = Integer.parseInt(ctx.INTEGER().getText());
        if (ctx.getParent() instanceof SimulationFileParser.Config_stmtContext) {
            SimulationFileParser.Config_stmtContext parentCtx = (SimulationFileParser.Config_stmtContext) ctx.getParent();
            if (parentCtx.LOOP() != null) {
                simulationScope.setLoop(value);
            }
        }
    }

    @Override
    public void enterBoolean_assign(@NotNull SimulationFileParser.Boolean_assignContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        if (ctx.getParent() instanceof SimulationFileParser.Config_stmtContext) {
            SimulationFileParser.Config_stmtContext parentCtx = (SimulationFileParser.Config_stmtContext) ctx.getParent();
            if (parentCtx.AUTOCOMPLETE() != null) {
                simulationScope.setAutocomplete(value);
            }
        } else if (ctx.getParent() instanceof SimulationFileParser.Task_config_stmtContext) {
            SimulationFileParser.Task_config_stmtContext parentCtx = (SimulationFileParser.Task_config_stmtContext) ctx.getParent();
            if (parentCtx.SEQUENTIAL() != null) {
                PartialTaskScope currentScope = (PartialTaskScope) scopeStack.peek();
                currentScope.setSequential(value);
            }
        }
    }

    @Override
    public void enterPartial_task(@NotNull SimulationFileParser.Partial_taskContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        PartialTaskScope partialTaskScope = simulationScope.createPartialTask(name);
        if (partialTaskScope != null) {
            scopeStack.push(partialTaskScope);
        } else {
            System.err.println("An error occurred while creating a partialTask");
        }
    }

    @Override
    public void exitPartial_task(@NotNull SimulationFileParser.Partial_taskContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterIdentifier_assign(@NotNull SimulationFileParser.Identifier_assignContext ctx) {
        String assignedMeta = ctx.IDENTIFIER().getText();
        if (ctx.getParent() instanceof SimulationFileParser.Meta_assignContext) {
            SimulationFileParser.Meta_assignContext parentCtx = (SimulationFileParser.Meta_assignContext) ctx.getParent();
            if (parentCtx.META() != null) {
                String key = parentCtx.IDENTIFIER().getText();
                if (this.partialTaskCreationStatement != null) {
                    VarExpression varExpression = new VarExpression(assignedMeta);
                    if (!this.partialTaskCreationStatement.addExpressionMeta(key, varExpression)) {
                        System.err.println("Error while adding assigned Meta");
                    }
                } else {
                    Scope currentScope = scopeStack.peek();
                    if (!currentScope.addAssignedMetaInfo(key, assignedMeta)) {
                        System.err.println("Error while adding assigned Meta");
                    }
                }
            }
        }
    }

    @Override
    public void enterTask(@NotNull SimulationFileParser.TaskContext ctx) {
        int identifierCount = ctx.IDENTIFIER().size();
        TaskScope taskScope;
        if (identifierCount == 2) {
            String name = ctx.IDENTIFIER(0).getText();
            String partialTaskName = ctx.IDENTIFIER(1).getText();
            taskScope = simulationScope.createExtendingTask(name, partialTaskName);
        } else if (identifierCount == 1) {
            if (ctx.EXTENDS() != null) {
                String partialTaskName = ctx.IDENTIFIER(0).getText();
                taskScope = simulationScope.createExtendingTask(partialTaskName);
            } else {
                String name = ctx.IDENTIFIER(0).getText();
                taskScope = simulationScope.createTask(name);
            }
        } else {
            taskScope = simulationScope.createTask();
        }
        if (taskScope != null) {
            scopeStack.push(taskScope);
        } else {
            System.err.println("Error while creating task");
        }
    }

    @Override
    public void exitTask(@NotNull SimulationFileParser.TaskContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterKnowledge(@NotNull SimulationFileParser.KnowledgeContext ctx) {
        TaskScope taskScope = (TaskScope) scopeStack.peek();
        if (ctx.KNOWLEDGE() != null) {
            ctx.STRING_LITERAL().forEach(x ->
            {
                String knowledge = x.getText();
                knowledge = knowledge.substring(1, knowledge.length() - 1);
                taskScope.addKnowledge(knowledge);
            });
        }
    }

    @Override
    public void enterConstructor_stmt(@NotNull SimulationFileParser.Constructor_stmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ConstructorScope constructorScope = new ConstructorScope(simulationScope);
        if (!simulationScope.addConstructor(name, constructorScope)) {
            System.err.println("An error occurred while creating constructor");
        } else {
            scopeStack.push(constructorScope);
        }
    }

    @Override
    public void exitConstructor_stmt(@NotNull SimulationFileParser.Constructor_stmtContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterPartial_task_creation(@NotNull SimulationFileParser.Partial_task_creationContext ctx) {
        partialTaskCreationStatement = new PartialTaskCreationStatement(simulationScope);
        Scope currentScope = scopeStack.peek();
        currentScope.addStatement(partialTaskCreationStatement);
    }


    @Override
    public void enterElse_block(@NotNull SimulationFileParser.Else_blockContext ctx) {
        IfScope ifScope = (IfScope) scopeStack.pop();
        ElseScope elseScope = new ElseScope(ifScope.getParent());
        elseScope.setParentIfScope(ifScope);
        ifScope.setElseBlock(elseScope);
        scopeStack.push(elseScope);
    }

    @Override
    public void exitElse_block(@NotNull SimulationFileParser.Else_blockContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterAtomic_expr(@NotNull SimulationFileParser.Atomic_exprContext ctx) {
        if (partialTaskCreationStatement != null) {
            if (ctx.IDENTIFIER() != null) {
                VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                partialTaskCreationStatement.setNameVarExpression(varExpression);
            } else if (ctx.array_expr() != null) {
                partialTaskCreationStatement.setArrayExprStmt(evaluateArrayExpr(ctx.array_expr()));
            } else if (ctx.constructor_scope_var() != null) {
                VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                partialTaskCreationStatement.setNameVarExpression(varExpression);
            } else if (ctx.string_concat() != null) {
                partialTaskCreationStatement.setStringConcatExpression(evaluateStringConcat(ctx.string_concat()));
            }
        } else if (taskCreationStmt != null) {
            SimulationFileParser.Task_creationContext parentCtx = (SimulationFileParser.Task_creationContext) ctx.getParent();
            if (parentCtx.EXTENDING() != null && parentCtx.atomic_expr(1) == ctx) {
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    taskCreationStmt.setNameVarExpressionExtending(varExpression);
                } else if (ctx.array_expr() != null) {
                    taskCreationStmt.setArrayExprStmtExtending(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    taskCreationStmt.setNameVarExpressionExtending(varExpression);
                } else if (ctx.string_concat() != null) {
                    taskCreationStmt.setStringConcatExpressionExtending(evaluateStringConcat(ctx.string_concat()));
                }
            } else {
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    taskCreationStmt.setKnowledgeVarExpression(varExpression);
                } else if (ctx.array_expr() != null) {
                    taskCreationStmt.setArrayExprStmt(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    taskCreationStmt.setKnowledgeVarExpression(varExpression);
                } else if (ctx.string_concat() != null) {
                    taskCreationStmt.setStringConcatExpression(evaluateStringConcat(ctx.string_concat()));
                }
            }
        } else if (metaCreationStmt != null) {
            SimulationFileParser.Meta_creationContext parentCtx = (SimulationFileParser.Meta_creationContext) ctx.getParent();
            if (parentCtx.atomic_expr(0) == ctx) {
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    metaCreationStmt.setKeyVarExpression(varExpression);
                } else if (ctx.array_expr() != null) {
                    metaCreationStmt.setKeyArrayEval(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    metaCreationStmt.setKeyVarExpression(varExpression);
                } else if (ctx.string_concat() != null) {
                    metaCreationStmt.setKeyStringConcat(evaluateStringConcat(ctx.string_concat()));
                }
            } else {
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    metaCreationStmt.setValueVarExpression(varExpression);
                } else if (ctx.array_expr() != null) {
                    metaCreationStmt.setValueArrayEval(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    metaCreationStmt.setValueVarExpression(varExpression);
                } else if (ctx.string_concat() != null) {
                    metaCreationStmt.setValueStringConcat(evaluateStringConcat(ctx.string_concat()));
                }
            }
        } else if (ctx.getParent() instanceof SimulationFileParser.If_exprContext) {
            SimulationFileParser.If_exprContext parentCtx = (SimulationFileParser.If_exprContext) ctx.getParent();
            if (parentCtx.atomic_expr(0) == ctx) {
                IfScope ifScope = (IfScope) scopeStack.peek();
                BooleanExpression booleanExpression = ifScope.getBooleanExpression();
                booleanExpression = getBooleanExpression(parentCtx, booleanExpression);
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    booleanExpression.setLeftVarExpression(varExpression);
                } else if (ctx.array_expr() != null) {
                    booleanExpression.setLeftArrayEval(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    booleanExpression.setLeftVarExpression(varExpression);
                } else if (ctx.string_concat() != null) {
                    booleanExpression.setLeftStringConcat(evaluateStringConcat(ctx.string_concat()));
                }
                ifScope.setBooleanExpression(booleanExpression);
            } else {
                IfScope ifScope = (IfScope) scopeStack.peek();
                BooleanExpression booleanExpression = ifScope.getBooleanExpression();
                booleanExpression = getBooleanExpression(parentCtx, booleanExpression);
                if (ctx.IDENTIFIER() != null) {
                    VarExpression varExpression = new VarExpression(ctx.IDENTIFIER().getText());
                    booleanExpression.setRightVarExpression(varExpression);
                } else if (ctx.array_expr() != null) {
                    booleanExpression.setRightArrayEval(evaluateArrayExpr(ctx.array_expr()));
                } else if (ctx.constructor_scope_var() != null) {
                    VarExpression varExpression = new VarExpression(ctx.constructor_scope_var().IDENTIFIER().getText());
                    booleanExpression.setRightVarExpression(varExpression);
                } else if (ctx.string_concat() != null) {
                    booleanExpression.setRightStringConcat(evaluateStringConcat(ctx.string_concat()));
                }
                ifScope.setBooleanExpression(booleanExpression);
            }
        }
    }

    private BooleanExpression getBooleanExpression(SimulationFileParser.If_exprContext parentCtx, BooleanExpression booleanExpression) {
        if (booleanExpression == null) {
            booleanExpression = new BooleanExpression();
            if (parentCtx.EQUAL() != null) {
                booleanExpression.setOperator(BooleanExpression.Operators.Equal);
            } else {
                booleanExpression.setOperator(BooleanExpression.Operators.Unequal);
            }
        }
        return booleanExpression;
    }

    private StringConcatExpression evaluateStringConcat(@NotNull SimulationFileParser.String_concatContext ctx) {
        StringConcatExpression stmt = new StringConcatExpression();
        List<Token> tokens = new ArrayList<>();
        ctx.IDENTIFIER().forEach(x -> tokens.add(x.getSymbol()));
        ctx.INTEGER().forEach(x -> tokens.add(x.getSymbol()));
        ctx.STRING_LITERAL().forEach(x -> tokens.add(x.getSymbol()));
        ctx.constructor_scope_var().forEach(x -> tokens.add(extract_scope_var(x)));
        Collections.sort(tokens, (o1, o2) -> {
            if (o1.getStartIndex() < o2.getStartIndex()) {
                return -1;
            } else if (o1.getStartIndex() > o2.getStartIndex()) {
                return 1;
            }
            return 0;
        });
        for (Token t : tokens) {
            switch (t.getType()) {
                case SimulationFileParser.IDENTIFIER:
                    stmt.addExpression(new VarExpression(t.getText()));
                    break;
                case SimulationFileParser.INTEGER:
                    stmt.addExpression(new IntegerExpression(Integer.valueOf(t.getText())));
                    break;
                case SimulationFileParser.STRING_LITERAL:
                    stmt.addExpression(new StringExpression(t.getText().substring(1, t.getText().length() - 1)));
                    break;
            }
        }
        return stmt;
    }

    private Token extract_scope_var(@NotNull SimulationFileParser.Constructor_scope_varContext ctx) {
        return ctx.IDENTIFIER().getSymbol();
    }

    private ArrayEvaluationExpression evaluateArrayExpr(@NotNull SimulationFileParser.Array_exprContext ctx) {
        ArrayEvaluationExpression stmt = null;
        if (ctx.IDENTIFIER() != null) {
            String input = ctx.IDENTIFIER().getText();
            if (!input.equalsIgnoreCase("input")) {
                System.err.println("Currently only input allows array notation");
            } else {
                List<Integer> indices = extractIndices(ctx.array_index());
                stmt = new ArrayEvaluationExpression(indices);
            }
        }
        return stmt;
    }

    private List<Integer> extractIndices(@NotNull SimulationFileParser.Array_indexContext ctx) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        list.add(-1);
        if (ctx.to_array_index() != null) {
            eval_to_array_index(list, ctx.to_array_index());
        } else if (ctx.from_array_index() != null) {
            eval_from_array_index(list, ctx.from_array_index());
        } else if (ctx.INTEGER().size() == 2) {
            list.add(Integer.parseInt(ctx.INTEGER(0).getText()));
            list.add(Integer.parseInt(ctx.INTEGER(1).getText()));
        } else {
            list.set(2, Integer.parseInt(ctx.INTEGER(0).getText()));
        }
        return list;
    }

    private void eval_from_array_index(List<Integer> list, @NotNull SimulationFileParser.From_array_indexContext ctx) {
        Integer i = Integer.parseInt(ctx.INTEGER().getText());
        list.set(0, i);
    }

    private void eval_to_array_index(List<Integer> list, @NotNull SimulationFileParser.To_array_indexContext ctx) {
        Integer i = Integer.parseInt(ctx.INTEGER().getText());
        list.set(1, i);
    }

    @Override
    public void enterTask_creation(@NotNull SimulationFileParser.Task_creationContext ctx) {
        taskCreationStmt = new TaskCreationStmt(simulationScope);
        Scope currentScope = scopeStack.peek();
        currentScope.addStatement(taskCreationStmt);
    }

    @Override
    public void exitTask_creation(@NotNull SimulationFileParser.Task_creationContext ctx) {
        taskCreationStmt = null;
    }

    @Override
    public void exitPartial_task_creation(@NotNull SimulationFileParser.Partial_task_creationContext ctx) {
        partialTaskCreationStatement = null;
    }

    @Override
    public void enterMeta_creation(@NotNull SimulationFileParser.Meta_creationContext ctx) {
        // Statement
        metaCreationStmt = new MetaCreationStatement(simulationScope);
        Scope currentScope = scopeStack.peek();
        currentScope.addStatement(metaCreationStmt);
    }

    @Override
    public void exitMeta_creation(@NotNull SimulationFileParser.Meta_creationContext ctx) {
        metaCreationStmt = null;
    }

    @Override
    public void enterPre_block(@NotNull SimulationFileParser.Pre_blockContext ctx) {
        Scope parentScope = scopeStack.peek();
        if (parentScope instanceof ConstructorScope) {
            Scope preScope = new ScopeImpl(parentScope);
            scopeStack.push(preScope);
            ((ConstructorScope) parentScope).setPreBlock(preScope);
        }
    }

    @Override
    public void exitPre_block(@NotNull SimulationFileParser.Pre_blockContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterDo_block(@NotNull SimulationFileParser.Do_blockContext ctx) {
        Scope parentScope = scopeStack.peek();
        if (parentScope instanceof ConstructorScope) {
            Scope doScope = new ScopeImpl(parentScope);
            scopeStack.push(doScope);
            ((ConstructorScope) parentScope).setDoBlock(doScope);
        }
    }

    @Override
    public void exitDo_block(@NotNull SimulationFileParser.Do_blockContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterIf_stmt(@NotNull SimulationFileParser.If_stmtContext ctx) {
        // Statement
        IfScope ifScope = new IfScope(scopeStack.peek());
        IfStatement ifStatement = new IfStatement(ifScope);
        scopeStack.peek().addStatement(ifStatement);
        scopeStack.push(ifScope);
    }

    @Override
    public void exitIf_stmt(@NotNull SimulationFileParser.If_stmtContext ctx) {
        if (scopeStack.peek() instanceof IfScope) {
            scopeStack.pop();
        }
    }

    @Override
    public void enterIf_expr(@NotNull SimulationFileParser.If_exprContext ctx) {
        if (ctx.BOOLEAN() != null) {
            BooleanExpression booleanExpression = new BooleanExpression();
            booleanExpression.setBoolean(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
            ((IfScope) scopeStack.peek()).setBooleanExpression(booleanExpression);
        }
    }

    @Override
    public void enterVar_stmt(@NotNull SimulationFileParser.Var_stmtContext ctx) {
        // Statement
        String name = ctx.IDENTIFIER().getText();
        StringConcatExpression stringConcatExpression = evaluateStringConcat(ctx.string_concat());
        VarStatement varStatement = new VarStatement();
        varStatement.setName(name);
        varStatement.setStringConcatExpression(stringConcatExpression);
        Scope parentScope = scopeStack.peek();
        parentScope.addStatement(varStatement);
    }

    @Override
    public void enterInc_stmt(@NotNull SimulationFileParser.Inc_stmtContext ctx) {
        // Statement
        String name = "";
        if (ctx.IDENTIFIER() != null) {
            name = ctx.IDENTIFIER().getText();
        } else if (ctx.constructor_scope_var() != null) {
            name = ctx.constructor_scope_var().IDENTIFIER().getText();
        }
        IncStatement incStatement = new IncStatement();
        incStatement.setVarName(name);
        Scope parentScope = scopeStack.peek();
        parentScope.addStatement(incStatement);
    }

    @Override
    public void enterDec_stmt(@NotNull SimulationFileParser.Dec_stmtContext ctx) {
        // Statement
        String name = "";
        if (ctx.IDENTIFIER() != null) {
            name = ctx.IDENTIFIER().getText();
        } else if (ctx.constructor_scope_var() != null) {
            name = ctx.constructor_scope_var().IDENTIFIER().getText();
        }
        DecStatement decStatement = new DecStatement();
        decStatement.setVarName(name);
        Scope parentScope = scopeStack.peek();
        parentScope.addStatement(decStatement);
    }

    @Override
    public void enterTasks_stmt(@NotNull SimulationFileParser.Tasks_stmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String path = ctx.tasks_arguments().STRING_LITERAL().getText();
        path = path.substring(1, path.length() - 1);
        ConstructorStatement constructorStatement = new ConstructorStatement(name, path);
        if (ctx.tasks_arguments().constructor_scope_var_assign().size() > 0) {
            ctx.tasks_arguments().constructor_scope_var_assign().forEach(x -> {
                String varName = x.constructor_scope_var().IDENTIFIER().getText();
                String value = x.STRING_LITERAL().getText();
                value = value.substring(1, value.length() - 1);
                if (!constructorStatement.addInitVar(varName, value)) {
                    System.err.println("Scope var with name '" + varName + "' already defined!");
                }
            });
        }
        simulationScope.addStatement(constructorStatement);
    }

    //    @Override
//    public void visitTerminal(@NotNull TerminalNode node) {
//        super.visitTerminal(node);
//    }
//
//    @Override
//    public void visitErrorNode(@NotNull ErrorNode node) {
//        super.visitErrorNode(node);
//    }
}
