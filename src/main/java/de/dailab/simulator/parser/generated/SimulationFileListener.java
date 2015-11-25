// Generated from C:/Users/thanisch/Documents/DAI-Labor/simulationfileparser/src/main/java/de/dailab/simulator/parser/grammar\SimulationFile.g4 by ANTLR 4.5
package de.dailab.simulator.parser.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimulationFileParser}.
 */
public interface SimulationFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SimulationFileParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SimulationFileParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#simulation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimulation_stmt(@NotNull SimulationFileParser.Simulation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#simulation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimulation_stmt(@NotNull SimulationFileParser.Simulation_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#body_content}.
	 * @param ctx the parse tree
	 */
	void enterBody_content(@NotNull SimulationFileParser.Body_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#body_content}.
	 * @param ctx the parse tree
	 */
	void exitBody_content(@NotNull SimulationFileParser.Body_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#config_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConfig_stmt(@NotNull SimulationFileParser.Config_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#config_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConfig_stmt(@NotNull SimulationFileParser.Config_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void enterString_assign(@NotNull SimulationFileParser.String_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void exitString_assign(@NotNull SimulationFileParser.String_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#integer_assign}.
	 * @param ctx the parse tree
	 */
	void enterInteger_assign(@NotNull SimulationFileParser.Integer_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#integer_assign}.
	 * @param ctx the parse tree
	 */
	void exitInteger_assign(@NotNull SimulationFileParser.Integer_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#boolean_assign}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_assign(@NotNull SimulationFileParser.Boolean_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#boolean_assign}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_assign(@NotNull SimulationFileParser.Boolean_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#partial_task}.
	 * @param ctx the parse tree
	 */
	void enterPartial_task(@NotNull SimulationFileParser.Partial_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#partial_task}.
	 * @param ctx the parse tree
	 */
	void exitPartial_task(@NotNull SimulationFileParser.Partial_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#task_config_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTask_config_stmt(@NotNull SimulationFileParser.Task_config_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#task_config_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTask_config_stmt(@NotNull SimulationFileParser.Task_config_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#meta_assign}.
	 * @param ctx the parse tree
	 */
	void enterMeta_assign(@NotNull SimulationFileParser.Meta_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#meta_assign}.
	 * @param ctx the parse tree
	 */
	void exitMeta_assign(@NotNull SimulationFileParser.Meta_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#meta_link}.
	 * @param ctx the parse tree
	 */
	void enterMeta_link(@NotNull SimulationFileParser.Meta_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#meta_link}.
	 * @param ctx the parse tree
	 */
	void exitMeta_link(@NotNull SimulationFileParser.Meta_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#identifier_assign}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_assign(@NotNull SimulationFileParser.Identifier_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#identifier_assign}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_assign(@NotNull SimulationFileParser.Identifier_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(@NotNull SimulationFileParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(@NotNull SimulationFileParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void enterKnowledge(@NotNull SimulationFileParser.KnowledgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void exitKnowledge(@NotNull SimulationFileParser.KnowledgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stmt(@NotNull SimulationFileParser.Create_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stmt(@NotNull SimulationFileParser.Create_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#partial_task_creation}.
	 * @param ctx the parse tree
	 */
	void enterPartial_task_creation(@NotNull SimulationFileParser.Partial_task_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#partial_task_creation}.
	 * @param ctx the parse tree
	 */
	void exitPartial_task_creation(@NotNull SimulationFileParser.Partial_task_creationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#task_creation}.
	 * @param ctx the parse tree
	 */
	void enterTask_creation(@NotNull SimulationFileParser.Task_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#task_creation}.
	 * @param ctx the parse tree
	 */
	void exitTask_creation(@NotNull SimulationFileParser.Task_creationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#meta_creation}.
	 * @param ctx the parse tree
	 */
	void enterMeta_creation(@NotNull SimulationFileParser.Meta_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#meta_creation}.
	 * @param ctx the parse tree
	 */
	void exitMeta_creation(@NotNull SimulationFileParser.Meta_creationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#string_concat}.
	 * @param ctx the parse tree
	 */
	void enterString_concat(@NotNull SimulationFileParser.String_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#string_concat}.
	 * @param ctx the parse tree
	 */
	void exitString_concat(@NotNull SimulationFileParser.String_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(@NotNull SimulationFileParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(@NotNull SimulationFileParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(@NotNull SimulationFileParser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(@NotNull SimulationFileParser.Array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#to_array_index}.
	 * @param ctx the parse tree
	 */
	void enterTo_array_index(@NotNull SimulationFileParser.To_array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#to_array_index}.
	 * @param ctx the parse tree
	 */
	void exitTo_array_index(@NotNull SimulationFileParser.To_array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#from_array_index}.
	 * @param ctx the parse tree
	 */
	void enterFrom_array_index(@NotNull SimulationFileParser.From_array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#from_array_index}.
	 * @param ctx the parse tree
	 */
	void exitFrom_array_index(@NotNull SimulationFileParser.From_array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#constructor_scope_var}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_scope_var(@NotNull SimulationFileParser.Constructor_scope_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#constructor_scope_var}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_scope_var(@NotNull SimulationFileParser.Constructor_scope_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#constructor_scope_var_assign}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_scope_var_assign(@NotNull SimulationFileParser.Constructor_scope_var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#constructor_scope_var_assign}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_scope_var_assign(@NotNull SimulationFileParser.Constructor_scope_var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_stmt(@NotNull SimulationFileParser.Constructor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_stmt(@NotNull SimulationFileParser.Constructor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#pre_block}.
	 * @param ctx the parse tree
	 */
	void enterPre_block(@NotNull SimulationFileParser.Pre_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#pre_block}.
	 * @param ctx the parse tree
	 */
	void exitPre_block(@NotNull SimulationFileParser.Pre_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#do_block}.
	 * @param ctx the parse tree
	 */
	void enterDo_block(@NotNull SimulationFileParser.Do_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#do_block}.
	 * @param ctx the parse tree
	 */
	void exitDo_block(@NotNull SimulationFileParser.Do_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimulationFileParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimulationFileParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimulationFileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimulationFileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull SimulationFileParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull SimulationFileParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(@NotNull SimulationFileParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(@NotNull SimulationFileParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(@NotNull SimulationFileParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(@NotNull SimulationFileParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_expr(@NotNull SimulationFileParser.Atomic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_expr(@NotNull SimulationFileParser.Atomic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt(@NotNull SimulationFileParser.Var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt(@NotNull SimulationFileParser.Var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInc_stmt(@NotNull SimulationFileParser.Inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInc_stmt(@NotNull SimulationFileParser.Inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#dec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDec_stmt(@NotNull SimulationFileParser.Dec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#dec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDec_stmt(@NotNull SimulationFileParser.Dec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#tasks_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTasks_stmt(@NotNull SimulationFileParser.Tasks_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#tasks_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTasks_stmt(@NotNull SimulationFileParser.Tasks_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimulationFileParser#tasks_arguments}.
	 * @param ctx the parse tree
	 */
	void enterTasks_arguments(@NotNull SimulationFileParser.Tasks_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimulationFileParser#tasks_arguments}.
	 * @param ctx the parse tree
	 */
	void exitTasks_arguments(@NotNull SimulationFileParser.Tasks_argumentsContext ctx);
}