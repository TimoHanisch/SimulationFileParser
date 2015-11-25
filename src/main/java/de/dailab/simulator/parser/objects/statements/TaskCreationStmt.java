package de.dailab.simulator.parser.objects.statements;

import de.dailab.simulator.parser.objects.scopes.Scope;
import de.dailab.simulator.parser.objects.scopes.SimulationScope;
import de.dailab.simulator.parser.objects.scopes.TaskScope;
import de.dailab.simulator.parser.objects.expressions.ArrayEvaluationExpression;
import de.dailab.simulator.parser.objects.expressions.StringConcatExpression;
import de.dailab.simulator.parser.objects.expressions.VarExpression;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class TaskCreationStmt implements Statement {

    private StringConcatExpression stringConcatExpression;

    private String knowledge;

    private SimulationScope simulationScope;
    private ArrayEvaluationExpression arrayExprStmtExtending;
    private StringConcatExpression stringConcatExpressionExtending;
    private String nameExtending;
    private ArrayEvaluationExpression arrayExprStmt;
    private VarExpression nameVarExpressionExtending;
    private VarExpression knowledgeVarExpression;

    public TaskCreationStmt(SimulationScope simulationScope) {
        this.simulationScope = simulationScope;
    }

    @Override
    public boolean execute(Scope scope) {
        TaskScope taskScope;
        if (nameVarExpressionExtending != null) {
            if (nameVarExpressionExtending.evaluate(scope)) {
                nameExtending = nameVarExpressionExtending.getValue();
            } else {
                return false;
            }
        } else if (arrayExprStmtExtending != null) {
            if (arrayExprStmtExtending.evaluate(scope)) {
                nameExtending = arrayExprStmtExtending.getValue();
            } else {
                return false;
            }
        } else if (stringConcatExpressionExtending != null) {
            if (stringConcatExpressionExtending.evaluate(scope)) {
                nameExtending = stringConcatExpressionExtending.getValue();
            } else {
                return false;
            }
        }
        if (nameExtending != null) {
            taskScope = this.simulationScope.createExtendingTask(nameExtending);
        } else {
            taskScope = this.simulationScope.createTask();
        }
        // Evaluate knowledge
        if (knowledgeVarExpression != null) {
            if (knowledgeVarExpression.evaluate(scope)) {
                knowledge = knowledgeVarExpression.getValue();
            } else {
                return false;
            }
        } else if (arrayExprStmt != null) {
            if (arrayExprStmt.evaluate(scope)) {
                knowledge = arrayExprStmt.getValue();
            } else {
                return false;
            }
        } else if (stringConcatExpression != null) {
            if (stringConcatExpression.evaluate(scope)) {
                knowledge = stringConcatExpression.getValue();
            } else {
                return false;
            }
        }
        if (taskScope != null && knowledge != null) {
            taskScope.addKnowledge(knowledge);
        } else {
            return false;
        }
        return true;
    }

    public void setArrayExprStmtExtending(ArrayEvaluationExpression arrayExprStmtExtending) {
        this.arrayExprStmtExtending = arrayExprStmtExtending;
    }

    public void setStringConcatExpressionExtending(StringConcatExpression stringConcatExpressionExtending) {
        this.stringConcatExpressionExtending = stringConcatExpressionExtending;
    }

    public void setArrayExprStmt(ArrayEvaluationExpression arrayExprStmt) {
        this.arrayExprStmt = arrayExprStmt;
    }

    public void setStringConcatExpression(StringConcatExpression stringConcatExpression) {
        this.stringConcatExpression = stringConcatExpression;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public void setNameVarExpressionExtending(VarExpression nameVarExpressionExtending) {
        this.nameVarExpressionExtending = nameVarExpressionExtending;
    }

    public void setKnowledgeVarExpression(VarExpression knowledgeVarExpression) {
        this.knowledgeVarExpression = knowledgeVarExpression;
    }
}
