package net.royqh.easypersist.sql.parser.syntax.postgresql;// Generated from E:/Workspaces/Tools/EasyPersist/grammar\PostgreSQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLParser}.
 */
public interface PostgreSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PostgreSQLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PostgreSQLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(PostgreSQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(PostgreSQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(PostgreSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(PostgreSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(PostgreSQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(PostgreSQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(PostgreSQLParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(PostgreSQLParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 */
	void enterIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 */
	void exitIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_item}.
	 * @param ctx the parse tree
	 */
	void enterIndex_item(PostgreSQLParser.Index_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_item}.
	 * @param ctx the parse tree
	 */
	void exitIndex_item(PostgreSQLParser.Index_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#opClass_name}.
	 * @param ctx the parse tree
	 */
	void enterOpClass_name(PostgreSQLParser.OpClass_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#opClass_name}.
	 * @param ctx the parse tree
	 */
	void exitOpClass_name(PostgreSQLParser.OpClass_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_param}.
	 * @param ctx the parse tree
	 */
	void enterStorage_param(PostgreSQLParser.Storage_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_param}.
	 * @param ctx the parse tree
	 */
	void exitStorage_param(PostgreSQLParser.Storage_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(PostgreSQLParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(PostgreSQLParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(PostgreSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(PostgreSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableOfTypeStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableOfTypeStatement(PostgreSQLParser.CreateTableOfTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableOfTypeStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableOfTypeStatement(PostgreSQLParser.CreateTableOfTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableAsStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsStatement(PostgreSQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableAsStatement}
	 * labeled alternative in {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsStatement(PostgreSQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PostgreSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PostgreSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateOfColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreateOfColumnDef(PostgreSQLParser.CreateOfColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateOfColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreateOfColumnDef(PostgreSQLParser.CreateOfColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateOfTableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreateOfTableConstraintDef(PostgreSQLParser.CreateOfTableConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateOfTableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_of_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreateOfTableConstraintDef(PostgreSQLParser.CreateOfTableConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreate_with_clause(PostgreSQLParser.Create_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreate_with_clause(PostgreSQLParser.Create_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#parent_table}.
	 * @param ctx the parse tree
	 */
	void enterParent_table(PostgreSQLParser.Parent_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#parent_table}.
	 * @param ctx the parse tree
	 */
	void exitParent_table(PostgreSQLParser.Parent_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_name(PostgreSQLParser.Tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_name(PostgreSQLParser.Tablespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(PostgreSQLParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(PostgreSQLParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value_list(PostgreSQLParser.Literal_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value_list(PostgreSQLParser.Literal_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void enterWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void exitWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_query_name}.
	 * @param ctx the parse tree
	 */
	void enterWith_query_name(PostgreSQLParser.With_query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_query_name}.
	 * @param ctx the parse tree
	 */
	void exitWith_query_name(PostgreSQLParser.With_query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PostgreSQLParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PostgreSQLParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#output_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_name(PostgreSQLParser.Output_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#output_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_name(PostgreSQLParser.Output_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value_list(PostgreSQLParser.Insert_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value_list(PostgreSQLParser.Insert_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#conflict_target}.
	 * @param ctx the parse tree
	 */
	void enterConflict_target(PostgreSQLParser.Conflict_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#conflict_target}.
	 * @param ctx the parse tree
	 */
	void exitConflict_target(PostgreSQLParser.Conflict_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void enterConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void exitConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#conflict_def_item}.
	 * @param ctx the parse tree
	 */
	void enterConflict_def_item(PostgreSQLParser.Conflict_def_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#conflict_def_item}.
	 * @param ctx the parse tree
	 */
	void exitConflict_def_item(PostgreSQLParser.Conflict_def_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(PostgreSQLParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(PostgreSQLParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_update_expr}.
	 * @param ctx the parse tree
	 */
	void enterColumn_update_expr(PostgreSQLParser.Column_update_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_update_expr}.
	 * @param ctx the parse tree
	 */
	void exitColumn_update_expr(PostgreSQLParser.Column_update_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterLocking_clause(PostgreSQLParser.Locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitLocking_clause(PostgreSQLParser.Locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PostgreSQLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PostgreSQLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(PostgreSQLParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(PostgreSQLParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#where_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhere_condition(PostgreSQLParser.Where_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#where_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhere_condition(PostgreSQLParser.Where_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 */
	void enterHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 */
	void exitHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_base_element}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_base_element(PostgreSQLParser.Grouping_base_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_base_element}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_base_element(PostgreSQLParser.Grouping_base_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(PostgreSQLParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(PostgreSQLParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_item_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item_list(PostgreSQLParser.From_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_item_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item_list(PostgreSQLParser.From_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(PostgreSQLParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(PostgreSQLParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_element}.
	 * @param ctx the parse tree
	 */
	void enterFunction_element(PostgreSQLParser.Function_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_element}.
	 * @param ctx the parse tree
	 */
	void exitFunction_element(PostgreSQLParser.Function_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_name(PostgreSQLParser.Column_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_name(PostgreSQLParser.Column_alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sampling_method_name}.
	 * @param ctx the parse tree
	 */
	void enterSampling_method_name(PostgreSQLParser.Sampling_method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sampling_method_name}.
	 * @param ctx the parse tree
	 */
	void exitSampling_method_name(PostgreSQLParser.Sampling_method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sampling_method_argument}.
	 * @param ctx the parse tree
	 */
	void enterSampling_method_argument(PostgreSQLParser.Sampling_method_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sampling_method_argument}.
	 * @param ctx the parse tree
	 */
	void exitSampling_method_argument(PostgreSQLParser.Sampling_method_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#seed}.
	 * @param ctx the parse tree
	 */
	void enterSeed(PostgreSQLParser.SeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#seed}.
	 * @param ctx the parse tree
	 */
	void exitSeed(PostgreSQLParser.SeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(PostgreSQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(PostgreSQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(PostgreSQLParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(PostgreSQLParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintDef(PostgreSQLParser.TableConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableConstraintDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintDef(PostgreSQLParser.TableConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterLikeDef(PostgreSQLParser.LikeDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeDef}
	 * labeled alternative in {@link PostgreSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitLikeDef(PostgreSQLParser.LikeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#deferrable_option}.
	 * @param ctx the parse tree
	 */
	void enterDeferrable_option(PostgreSQLParser.Deferrable_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#deferrable_option}.
	 * @param ctx the parse tree
	 */
	void exitDeferrable_option(PostgreSQLParser.Deferrable_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_contraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_contraint(PostgreSQLParser.Table_contraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_contraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_contraint(PostgreSQLParser.Table_contraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void enterLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void exitLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#exclude_expr}.
	 * @param ctx the parse tree
	 */
	void enterExclude_expr(PostgreSQLParser.Exclude_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#exclude_expr}.
	 * @param ctx the parse tree
	 */
	void exitExclude_expr(PostgreSQLParser.Exclude_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#exclude_item}.
	 * @param ctx the parse tree
	 */
	void enterExclude_item(PostgreSQLParser.Exclude_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#exclude_item}.
	 * @param ctx the parse tree
	 */
	void exitExclude_item(PostgreSQLParser.Exclude_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#check_expr}.
	 * @param ctx the parse tree
	 */
	void enterCheck_expr(PostgreSQLParser.Check_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#check_expr}.
	 * @param ctx the parse tree
	 */
	void exitCheck_expr(PostgreSQLParser.Check_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#default_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefault_expr(PostgreSQLParser.Default_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#default_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefault_expr(PostgreSQLParser.Default_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterPredict(PostgreSQLParser.PredictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitPredict(PostgreSQLParser.PredictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#reftable}.
	 * @param ctx the parse tree
	 */
	void enterReftable(PostgreSQLParser.ReftableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#reftable}.
	 * @param ctx the parse tree
	 */
	void exitReftable(PostgreSQLParser.ReftableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#refColumn}.
	 * @param ctx the parse tree
	 */
	void enterRefColumn(PostgreSQLParser.RefColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#refColumn}.
	 * @param ctx the parse tree
	 */
	void exitRefColumn(PostgreSQLParser.RefColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#source_table}.
	 * @param ctx the parse tree
	 */
	void enterSource_table(PostgreSQLParser.Source_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#source_table}.
	 * @param ctx the parse tree
	 */
	void exitSource_table(PostgreSQLParser.Source_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete_action(PostgreSQLParser.On_delete_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete_action(PostgreSQLParser.On_delete_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#on_update_action}.
	 * @param ctx the parse tree
	 */
	void enterOn_update_action(PostgreSQLParser.On_update_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#on_update_action}.
	 * @param ctx the parse tree
	 */
	void exitOn_update_action(PostgreSQLParser.On_update_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(PostgreSQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(PostgreSQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PostgreSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PostgreSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PostgreSQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PostgreSQLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#custom_op}.
	 * @param ctx the parse tree
	 */
	void enterCustom_op(PostgreSQLParser.Custom_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#custom_op}.
	 * @param ctx the parse tree
	 */
	void exitCustom_op(PostgreSQLParser.Custom_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void enterOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void exitOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr(PostgreSQLParser.Condition_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr(PostgreSQLParser.Condition_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr(PostgreSQLParser.Value_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr(PostgreSQLParser.Value_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#array_constructor}.
	 * @param ctx the parse tree
	 */
	void enterArray_constructor(PostgreSQLParser.Array_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#array_constructor}.
	 * @param ctx the parse tree
	 */
	void exitArray_constructor(PostgreSQLParser.Array_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr(PostgreSQLParser.Cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr(PostgreSQLParser.Cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#time_function_call}.
	 * @param ctx the parse tree
	 */
	void enterTime_function_call(PostgreSQLParser.Time_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#time_function_call}.
	 * @param ctx the parse tree
	 */
	void exitTime_function_call(PostgreSQLParser.Time_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#extract_field}.
	 * @param ctx the parse tree
	 */
	void enterExtract_field(PostgreSQLParser.Extract_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#extract_field}.
	 * @param ctx the parse tree
	 */
	void exitExtract_field(PostgreSQLParser.Extract_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(PostgreSQLParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(PostgreSQLParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate_expr}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_expr(PostgreSQLParser.Aggregate_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate_expr}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_expr(PostgreSQLParser.Aggregate_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrder_expr(PostgreSQLParser.Order_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrder_expr(PostgreSQLParser.Order_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_name(PostgreSQLParser.Aggregate_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_name(PostgreSQLParser.Aggregate_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_func_call}.
	 * @param ctx the parse tree
	 */
	void enterWindow_func_call(PostgreSQLParser.Window_func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_func_call}.
	 * @param ctx the parse tree
	 */
	void exitWindow_func_call(PostgreSQLParser.Window_func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 */
	void enterFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 */
	void exitFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 */
	void enterFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 */
	void exitFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_value}.
	 * @param ctx the parse tree
	 */
	void enterFrame_value(PostgreSQLParser.Frame_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_value}.
	 * @param ctx the parse tree
	 */
	void exitFrame_value(PostgreSQLParser.Frame_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 */
	void enterWindow_name(PostgreSQLParser.Window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 */
	void exitWindow_name(PostgreSQLParser.Window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(PostgreSQLParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(PostgreSQLParser.Alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(PostgreSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(PostgreSQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(PostgreSQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(PostgreSQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(PostgreSQLParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(PostgreSQLParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(PostgreSQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(PostgreSQLParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#decimals}.
	 * @param ctx the parse tree
	 */
	void enterDecimals(PostgreSQLParser.DecimalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#decimals}.
	 * @param ctx the parse tree
	 */
	void exitDecimals(PostgreSQLParser.DecimalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PostgreSQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PostgreSQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(PostgreSQLParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(PostgreSQLParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_constant(PostgreSQLParser.Boolean_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_constant(PostgreSQLParser.Boolean_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#typed_constant}.
	 * @param ctx the parse tree
	 */
	void enterTyped_constant(PostgreSQLParser.Typed_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#typed_constant}.
	 * @param ctx the parse tree
	 */
	void exitTyped_constant(PostgreSQLParser.Typed_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#bit_string_constant}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_constant(PostgreSQLParser.Bit_string_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#bit_string_constant}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_constant(PostgreSQLParser.Bit_string_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void enterString_constant(PostgreSQLParser.String_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void exitString_constant(PostgreSQLParser.String_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#numeric_constant}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_constant(PostgreSQLParser.Numeric_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#numeric_constant}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_constant(PostgreSQLParser.Numeric_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void enterInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void exitInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(PostgreSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(PostgreSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLParser.IdentifierContext ctx);
}