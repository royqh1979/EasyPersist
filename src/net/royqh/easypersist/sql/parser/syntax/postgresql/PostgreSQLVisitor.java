package net.royqh.easypersist.sql.parser.syntax.postgresql;// Generated from E:/Workspace/EasyPersist/grammar\PostgreSQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PostgreSQLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(PostgreSQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(PostgreSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(PostgreSQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(PostgreSQLParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_item(PostgreSQLParser.Index_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#opClass_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpClass_name(PostgreSQLParser.OpClass_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_param(PostgreSQLParser.Storage_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(PostgreSQLParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(PostgreSQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableOfTypeStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableOfTypeStatement(PostgreSQLParser.CreateTableOfTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableAsStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsStatement(PostgreSQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(PostgreSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateOfColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOfColumnDef(PostgreSQLParser.CreateOfColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateOfTableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOfTableConstraintDef(PostgreSQLParser.CreateOfTableConstraintDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_with_clause(PostgreSQLParser.Create_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#parent_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_table(PostgreSQLParser.Parent_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_name(PostgreSQLParser.Tablespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(PostgreSQLParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value_list(PostgreSQLParser.Literal_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_query_name(PostgreSQLParser.With_query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PostgreSQLParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#output_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_name(PostgreSQLParser.Output_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value_list(PostgreSQLParser.Insert_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#conflict_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_target(PostgreSQLParser.Conflict_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#conflict_def_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_def_item(PostgreSQLParser.Conflict_def_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(PostgreSQLParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_update_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_update_expr(PostgreSQLParser.Column_update_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocking_clause(PostgreSQLParser.Locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PostgreSQLParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(PostgreSQLParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#where_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_condition(PostgreSQLParser.Where_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_base_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_base_element(PostgreSQLParser.Grouping_base_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(PostgreSQLParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item_list(PostgreSQLParser.From_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(PostgreSQLParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_element(PostgreSQLParser.Function_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_name(PostgreSQLParser.Column_alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sampling_method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampling_method_name(PostgreSQLParser.Sampling_method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sampling_method_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampling_method_argument(PostgreSQLParser.Sampling_method_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#seed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed(PostgreSQLParser.SeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(PostgreSQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(PostgreSQLParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintDef(PostgreSQLParser.TableConstraintDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikeDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeDef(PostgreSQLParser.LikeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#deferrable_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferrable_option(PostgreSQLParser.Deferrable_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_contraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_contraint(PostgreSQLParser.Table_contraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#exclude_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_expr(PostgreSQLParser.Exclude_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#exclude_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_item(PostgreSQLParser.Exclude_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#check_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_expr(PostgreSQLParser.Check_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#default_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_expr(PostgreSQLParser.Default_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredict(PostgreSQLParser.PredictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#reftable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReftable(PostgreSQLParser.ReftableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#refColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefColumn(PostgreSQLParser.RefColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#source_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table(PostgreSQLParser.Source_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_action(PostgreSQLParser.On_delete_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#on_update_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update_action(PostgreSQLParser.On_update_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(PostgreSQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PostgreSQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PostgreSQLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#custom_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom_op(PostgreSQLParser.Custom_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expr(PostgreSQLParser.Condition_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr(PostgreSQLParser.Value_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#array_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_constructor(PostgreSQLParser.Array_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expr(PostgreSQLParser.Cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#time_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_function_call(PostgreSQLParser.Time_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#extract_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_field(PostgreSQLParser.Extract_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(PostgreSQLParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_expr(PostgreSQLParser.Aggregate_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_expr(PostgreSQLParser.Order_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_name(PostgreSQLParser.Aggregate_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_func_call(PostgreSQLParser.Window_func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_value(PostgreSQLParser.Frame_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(PostgreSQLParser.Window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(PostgreSQLParser.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(PostgreSQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(PostgreSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(PostgreSQLParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(PostgreSQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#decimals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimals(PostgreSQLParser.DecimalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PostgreSQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(PostgreSQLParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#boolean_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_constant(PostgreSQLParser.Boolean_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#typed_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_constant(PostgreSQLParser.Typed_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#bit_string_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string_constant(PostgreSQLParser.Bit_string_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#string_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_constant(PostgreSQLParser.String_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#numeric_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_constant(PostgreSQLParser.Numeric_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(PostgreSQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLParser.IdentifierContext ctx);
}