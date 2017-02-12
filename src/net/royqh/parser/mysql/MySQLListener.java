package net.royqh.parser.mysql;// Generated from E:/Workspaces/Tools/antlr.mysql/src/main/resources\MySQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLParser}.
 */
public interface MySQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MySQLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MySQLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(MySQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(MySQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(MySQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(MySQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(MySQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(MySQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_stmt(MySQLParser.Set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_stmt(MySQLParser.Set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(MySQLParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(MySQLParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#user_var_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_var_name(MySQLParser.User_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#user_var_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_var_name(MySQLParser.User_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(MySQLParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(MySQLParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(MySQLParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(MySQLParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(MySQLParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(MySQLParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#algorithm_option}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm_option(MySQLParser.Algorithm_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#algorithm_option}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm_option(MySQLParser.Algorithm_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lock_option}.
	 * @param ctx the parse tree
	 */
	void enterLock_option(MySQLParser.Lock_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lock_option}.
	 * @param ctx the parse tree
	 */
	void exitLock_option(MySQLParser.Lock_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(MySQLParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(MySQLParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(MySQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(MySQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(MySQLParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(MySQLParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(MySQLParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(MySQLParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableSelectStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSelectStmt(MySQLParser.CreateTableSelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableSelectStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSelectStmt(MySQLParser.CreateTableSelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableLikeStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLikeStmt(MySQLParser.CreateTableLikeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableLikeStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLikeStmt(MySQLParser.CreateTableLikeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_options}.
	 * @param ctx the parse tree
	 */
	void enterPartition_options(MySQLParser.Partition_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_options}.
	 * @param ctx the parse tree
	 */
	void exitPartition_options(MySQLParser.Partition_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_type}.
	 * @param ctx the parse tree
	 */
	void enterPartition_type(MySQLParser.Partition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_type}.
	 * @param ctx the parse tree
	 */
	void exitPartition_type(MySQLParser.Partition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#sub_partition_type}.
	 * @param ctx the parse tree
	 */
	void enterSub_partition_type(MySQLParser.Sub_partition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#sub_partition_type}.
	 * @param ctx the parse tree
	 */
	void exitSub_partition_type(MySQLParser.Sub_partition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_definition}.
	 * @param ctx the parse tree
	 */
	void enterPartition_definition(MySQLParser.Partition_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_definition}.
	 * @param ctx the parse tree
	 */
	void exitPartition_definition(MySQLParser.Partition_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_option}.
	 * @param ctx the parse tree
	 */
	void enterPartition_option(MySQLParser.Partition_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_option}.
	 * @param ctx the parse tree
	 */
	void exitPartition_option(MySQLParser.Partition_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#subpartition_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_definition(MySQLParser.Subpartition_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#subpartition_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_definition(MySQLParser.Subpartition_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(MySQLParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(MySQLParser.Partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_name(MySQLParser.Tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_name(MySQLParser.Tablespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(MySQLParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(MySQLParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value_list(MySQLParser.Literal_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value_list(MySQLParser.Literal_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(MySQLParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(MySQLParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(MySQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(MySQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(MySQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(MySQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insert_first_part}.
	 * @param ctx the parse tree
	 */
	void enterInsert_first_part(MySQLParser.Insert_first_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insert_first_part}.
	 * @param ctx the parse tree
	 */
	void exitInsert_first_part(MySQLParser.Insert_first_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insert_dup_key_update_part}.
	 * @param ctx the parse tree
	 */
	void enterInsert_dup_key_update_part(MySQLParser.Insert_dup_key_update_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insert_dup_key_update_part}.
	 * @param ctx the parse tree
	 */
	void exitInsert_dup_key_update_part(MySQLParser.Insert_dup_key_update_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value_list(MySQLParser.Insert_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value_list(MySQLParser.Insert_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(MySQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(MySQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectUnion}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectUnion(MySQLParser.SelectUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectUnion}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectUnion(MySQLParser.SelectUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnclosedSelect}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedSelect(MySQLParser.EnclosedSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnclosedSelect}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedSelect(MySQLParser.EnclosedSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Select}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect(MySQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect(MySQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(MySQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(MySQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(MySQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(MySQLParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#procedure_list}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_list(MySQLParser.Procedure_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#procedure_list}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_list(MySQLParser.Procedure_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#select_option}.
	 * @param ctx the parse tree
	 */
	void enterSelect_option(MySQLParser.Select_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#select_option}.
	 * @param ctx the parse tree
	 */
	void exitSelect_option(MySQLParser.Select_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#select_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_from_clause(MySQLParser.Select_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#select_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_from_clause(MySQLParser.Select_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#select_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_clause(MySQLParser.Select_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#select_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_clause(MySQLParser.Select_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(MySQLParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(MySQLParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(MySQLParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(MySQLParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(MySQLParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(MySQLParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#row_count}.
	 * @param ctx the parse tree
	 */
	void enterRow_count(MySQLParser.Row_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#row_count}.
	 * @param ctx the parse tree
	 */
	void exitRow_count(MySQLParser.Row_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(MySQLParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(MySQLParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_references}.
	 * @param ctx the parse tree
	 */
	void enterTable_references(MySQLParser.Table_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_references}.
	 * @param ctx the parse tree
	 */
	void exitTable_references(MySQLParser.Table_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#escaped_table_reference}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_table_reference(MySQLParser.Escaped_table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#escaped_table_reference}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_table_reference(MySQLParser.Escaped_table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(MySQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(MySQLParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_factor}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor(MySQLParser.Table_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_factor}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor(MySQLParser.Table_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void enterPartition_names(MySQLParser.Partition_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void exitPartition_names(MySQLParser.Partition_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#join_table}.
	 * @param ctx the parse tree
	 */
	void enterJoin_table(MySQLParser.Join_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#join_table}.
	 * @param ctx the parse tree
	 */
	void exitJoin_table(MySQLParser.Join_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#join_right_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_right_part(MySQLParser.Join_right_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#join_right_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_right_part(MySQLParser.Join_right_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(MySQLParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(MySQLParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint_list(MySQLParser.Index_hint_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint_list(MySQLParser.Index_hint_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint(MySQLParser.Index_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint(MySQLParser.Index_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_list(MySQLParser.Index_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_list(MySQLParser.Index_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(MySQLParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(MySQLParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(MySQLParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(MySQLParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(MySQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(MySQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(MySQLParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(MySQLParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDef(MySQLParser.PrimaryKeyDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDef(MySQLParser.PrimaryKeyDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDef(MySQLParser.IndexDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDef(MySQLParser.IndexDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UniqueDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterUniqueDef(MySQLParser.UniqueDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UniqueDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitUniqueDef(MySQLParser.UniqueDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullTextIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterFullTextIndexDef(MySQLParser.FullTextIndexDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullTextIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitFullTextIndexDef(MySQLParser.FullTextIndexDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpacialIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterSpacialIndexDef(MySQLParser.SpacialIndexDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpacialIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitSpacialIndexDef(MySQLParser.SpacialIndexDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForeignKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyDef(MySQLParser.ForeignKeyDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForeignKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyDef(MySQLParser.ForeignKeyDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CheckDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterCheckDef(MySQLParser.CheckDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CheckDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitCheckDef(MySQLParser.CheckDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(MySQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(MySQLParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#column_reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_reference_definition(MySQLParser.Column_reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#column_reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_reference_definition(MySQLParser.Column_reference_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#column_attribute}.
	 * @param ctx the parse tree
	 */
	void enterColumn_attribute(MySQLParser.Column_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#column_attribute}.
	 * @param ctx the parse tree
	 */
	void exitColumn_attribute(MySQLParser.Column_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBitType(MySQLParser.BitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBitType(MySQLParser.BitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(MySQLParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(MySQLParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MySQLParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MySQLParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TinyIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntType(MySQLParser.TinyIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TinyIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntType(MySQLParser.TinyIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntType(MySQLParser.SmallIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntType(MySQLParser.SmallIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediumIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterMediumIntType(MySQLParser.MediumIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediumIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitMediumIntType(MySQLParser.MediumIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MySQLParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MySQLParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(MySQLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(MySQLParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BigIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBigIntType(MySQLParser.BigIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BigIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBigIntType(MySQLParser.BigIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterRealType(MySQLParser.RealTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitRealType(MySQLParser.RealTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(MySQLParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(MySQLParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(MySQLParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(MySQLParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(MySQLParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(MySQLParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(MySQLParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(MySQLParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterDateType(MySQLParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitDateType(MySQLParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(MySQLParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(MySQLParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeStampType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTimeStampType(MySQLParser.TimeStampTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeStampType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTimeStampType(MySQLParser.TimeStampTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(MySQLParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(MySQLParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YearType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterYearType(MySQLParser.YearTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YearType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitYearType(MySQLParser.YearTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(MySQLParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(MySQLParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarcharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterVarcharType(MySQLParser.VarcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarcharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitVarcharType(MySQLParser.VarcharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(MySQLParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(MySQLParser.BinaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarBinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterVarBinaryType(MySQLParser.VarBinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarBinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitVarBinaryType(MySQLParser.VarBinaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TinyBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTinyBlobType(MySQLParser.TinyBlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TinyBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTinyBlobType(MySQLParser.TinyBlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterBlobType(MySQLParser.BlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitBlobType(MySQLParser.BlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediumBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterMediumBlobType(MySQLParser.MediumBlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediumBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitMediumBlobType(MySQLParser.MediumBlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterLongBlobType(MySQLParser.LongBlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitLongBlobType(MySQLParser.LongBlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TinyTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTinyTextType(MySQLParser.TinyTextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TinyTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTinyTextType(MySQLParser.TinyTextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterTextType(MySQLParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitTextType(MySQLParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediumTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterMediumTextType(MySQLParser.MediumTextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediumTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitMediumTextType(MySQLParser.MediumTextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterLongTextType(MySQLParser.LongTextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitLongTextType(MySQLParser.LongTextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(MySQLParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(MySQLParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterSetType(MySQLParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitSetType(MySQLParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_col_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_col_name(MySQLParser.Index_col_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_col_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_col_name(MySQLParser.Index_col_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(MySQLParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(MySQLParser.Index_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(MySQLParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(MySQLParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition(MySQLParser.Reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition(MySQLParser.Reference_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void enterReference_option(MySQLParser.Reference_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void exitReference_option(MySQLParser.Reference_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete_action(MySQLParser.On_delete_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete_action(MySQLParser.On_delete_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#on_update_action}.
	 * @param ctx the parse tree
	 */
	void enterOn_update_action(MySQLParser.On_update_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#on_update_action}.
	 * @param ctx the parse tree
	 */
	void exitOn_update_action(MySQLParser.On_update_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MySQLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MySQLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(MySQLParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(MySQLParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(MySQLParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(MySQLParser.Table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void enterCharset_name(MySQLParser.Charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void exitCharset_name(MySQLParser.Charset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(MySQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(MySQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void enterEngine_name(MySQLParser.Engine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void exitEngine_name(MySQLParser.Engine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void enterParser_name(MySQLParser.Parser_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void exitParser_name(MySQLParser.Parser_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MySQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MySQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(MySQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(MySQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCast(MySQLParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCast(MySQLParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(MySQLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(MySQLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(MySQLParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(MySQLParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MySQLParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MySQLParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitExpr}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(MySQLParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitExpr}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(MySQLParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(MySQLParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(MySQLParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseBetween}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCaseBetween(MySQLParser.CaseBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseBetween}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCaseBetween(MySQLParser.CaseBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterXor(MySQLParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitXor(MySQLParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr(MySQLParser.Cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr(MySQLParser.Cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#between_expr}.
	 * @param ctx the parse tree
	 */
	void enterBetween_expr(MySQLParser.Between_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#between_expr}.
	 * @param ctx the parse tree
	 */
	void exitBetween_expr(MySQLParser.Between_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expr(MySQLParser.Comparison_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expr(MySQLParser.Comparison_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr(MySQLParser.In_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr(MySQLParser.In_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#regexp_expr}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_expr(MySQLParser.Regexp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#regexp_expr}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_expr(MySQLParser.Regexp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(MySQLParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(MySQLParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#is_expr}.
	 * @param ctx the parse tree
	 */
	void enterIs_expr(MySQLParser.Is_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#is_expr}.
	 * @param ctx the parse tree
	 */
	void exitIs_expr(MySQLParser.Is_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#like_expr}.
	 * @param ctx the parse tree
	 */
	void enterLike_expr(MySQLParser.Like_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#like_expr}.
	 * @param ctx the parse tree
	 */
	void exitLike_expr(MySQLParser.Like_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_expr(MySQLParser.Bit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_expr(MySQLParser.Bit_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(MySQLParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(MySQLParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(MySQLParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(MySQLParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MySQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MySQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expr(MySQLParser.Interval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expr(MySQLParser.Interval_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void enterTime_unit(MySQLParser.Time_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void exitTime_unit(MySQLParser.Time_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MySQLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MySQLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterString(MySQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitString(MySQLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Date}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterDate(MySQLParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitDate(MySQLParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterNull(MySQLParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitNull(MySQLParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MySQLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MySQLParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterHex(MySQLParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitHex(MySQLParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bit}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterBit(MySQLParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bit}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitBit(MySQLParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(MySQLParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(MySQLParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(MySQLParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(MySQLParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void enterBit_literal(MySQLParser.Bit_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void exitBit_literal(MySQLParser.Bit_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void enterHex_literal(MySQLParser.Hex_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void exitHex_literal(MySQLParser.Hex_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#underlinestarted_charset_name}.
	 * @param ctx the parse tree
	 */
	void enterUnderlinestarted_charset_name(MySQLParser.Underlinestarted_charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#underlinestarted_charset_name}.
	 * @param ctx the parse tree
	 */
	void exitUnderlinestarted_charset_name(MySQLParser.Underlinestarted_charset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(MySQLParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(MySQLParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(MySQLParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(MySQLParser.Alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(MySQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(MySQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(MySQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(MySQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(MySQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(MySQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(MySQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(MySQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(MySQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(MySQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(MySQLParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(MySQLParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(MySQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(MySQLParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#decimals}.
	 * @param ctx the parse tree
	 */
	void enterDecimals(MySQLParser.DecimalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#decimals}.
	 * @param ctx the parse tree
	 */
	void exitDecimals(MySQLParser.DecimalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MySQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MySQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MySQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MySQLParser.IdentifierContext ctx);
}