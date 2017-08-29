package net.royqh.easypersist.sql.parser.syntax.mysql;// Generated from E:/Workspaces/Tools/EasyPersist/grammar\MySQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MySQLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(MySQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(MySQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(MySQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_stmt(MySQLParser.Set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(MySQLParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#user_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_var_name(MySQLParser.User_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(MySQLParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(MySQLParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(MySQLParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#algorithm_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm_option(MySQLParser.Algorithm_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lock_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_option(MySQLParser.Lock_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(MySQLParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(MySQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(MySQLParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStmt(MySQLParser.CreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableSelectStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSelectStmt(MySQLParser.CreateTableSelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableLikeStmt}
	 * labeled alternative in {@link MySQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLikeStmt(MySQLParser.CreateTableLikeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_options(MySQLParser.Partition_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_type(MySQLParser.Partition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#sub_partition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_partition_type(MySQLParser.Sub_partition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_definition(MySQLParser.Partition_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_option(MySQLParser.Partition_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#subpartition_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_definition(MySQLParser.Subpartition_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(MySQLParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tablespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_name(MySQLParser.Tablespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(MySQLParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#literal_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value_list(MySQLParser.Literal_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(MySQLParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(MySQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(MySQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insert_first_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_first_part(MySQLParser.Insert_first_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insert_dup_key_update_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_dup_key_update_part(MySQLParser.Insert_dup_key_update_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insert_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value_list(MySQLParser.Insert_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(MySQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(MySQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectUnion}
	 * labeled alternative in {@link MySQLParser#select_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectUnion(MySQLParser.SelectUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnclosedSelect}
	 * labeled alternative in {@link MySQLParser#select_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclosedSelect(MySQLParser.EnclosedSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link MySQLParser#select_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MySQLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(MySQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(MySQLParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#procedure_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_list(MySQLParser.Procedure_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#select_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_option(MySQLParser.Select_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#select_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_from_clause(MySQLParser.Select_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#select_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_into_clause(MySQLParser.Select_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#variable_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_list(MySQLParser.Variable_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(MySQLParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(MySQLParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#row_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_count(MySQLParser.Row_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(MySQLParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_references(MySQLParser.Table_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#escaped_table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_table_reference(MySQLParser.Escaped_table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(MySQLParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_factor(MySQLParser.Table_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partition_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_names(MySQLParser.Partition_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#join_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_table(MySQLParser.Join_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#join_right_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_right_part(MySQLParser.Join_right_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(MySQLParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_hint_list(MySQLParser.Index_hint_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_hint(MySQLParser.Index_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_list(MySQLParser.Index_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(MySQLParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(MySQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(MySQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(MySQLParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyDef(MySQLParser.PrimaryKeyDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDef(MySQLParser.IndexDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UniqueDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueDef(MySQLParser.UniqueDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullTextIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextIndexDef(MySQLParser.FullTextIndexDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpacialIndexDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacialIndexDef(MySQLParser.SpacialIndexDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForeignKeyDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyDef(MySQLParser.ForeignKeyDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CheckDef}
	 * labeled alternative in {@link MySQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckDef(MySQLParser.CheckDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(MySQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#column_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_attribute(MySQLParser.Column_attributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitType(MySQLParser.BitTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(MySQLParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(MySQLParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TinyIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntType(MySQLParser.TinyIntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntType(MySQLParser.SmallIntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediumIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediumIntType(MySQLParser.MediumIntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MySQLParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(MySQLParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BigIntType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntType(MySQLParser.BigIntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(MySQLParser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(MySQLParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(MySQLParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalType(MySQLParser.DecimalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(MySQLParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DateType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateType(MySQLParser.DateTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeType(MySQLParser.TimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeStampType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeStampType(MySQLParser.TimeStampTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DateTimeType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeType(MySQLParser.DateTimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YearType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearType(MySQLParser.YearTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(MySQLParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarcharType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcharType(MySQLParser.VarcharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryType(MySQLParser.BinaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarBinaryType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBinaryType(MySQLParser.VarBinaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TinyBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyBlobType(MySQLParser.TinyBlobTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobType(MySQLParser.BlobTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediumBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediumBlobType(MySQLParser.MediumBlobTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongBlobType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongBlobType(MySQLParser.LongBlobTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TinyTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyTextType(MySQLParser.TinyTextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextType(MySQLParser.TextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediumTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediumTextType(MySQLParser.MediumTextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongTextType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongTextType(MySQLParser.LongTextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(MySQLParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link MySQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(MySQLParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_col_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_col_name(MySQLParser.Index_col_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_type(MySQLParser.Index_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(MySQLParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#reference_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_definition(MySQLParser.Reference_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#reference_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_option(MySQLParser.Reference_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#on_delete_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_action(MySQLParser.On_delete_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#on_update_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update_action(MySQLParser.On_update_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(MySQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(MySQLParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_option(MySQLParser.Table_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#charset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset_name(MySQLParser.Charset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(MySQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#engine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine_name(MySQLParser.Engine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#parser_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParser_name(MySQLParser.Parser_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(MySQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(MySQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(MySQLParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(MySQLParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(MySQLParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MySQLParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitExpr}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(MySQLParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(MySQLParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseBetween}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBetween(MySQLParser.CaseBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link MySQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(MySQLParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expr(MySQLParser.Cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#between_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_expr(MySQLParser.Between_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expr(MySQLParser.Comparison_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr(MySQLParser.In_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#regexp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp_expr(MySQLParser.Regexp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(MySQLParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#is_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_expr(MySQLParser.Is_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#like_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_expr(MySQLParser.Like_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#bit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_expr(MySQLParser.Bit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(MySQLParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(MySQLParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MySQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#interval_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expr(MySQLParser.Interval_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(MySQLParser.Time_unitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MySQLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MySQLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(MySQLParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(MySQLParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MySQLParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(MySQLParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bit}
	 * labeled alternative in {@link MySQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(MySQLParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(MySQLParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(MySQLParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#bit_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_literal(MySQLParser.Bit_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#hex_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_literal(MySQLParser.Hex_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#underlinestarted_charset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlinestarted_charset_name(MySQLParser.Underlinestarted_charset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(MySQLParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(MySQLParser.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(MySQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(MySQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(MySQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(MySQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(MySQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(MySQLParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(MySQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#decimals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimals(MySQLParser.DecimalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MySQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MySQLParser.IdentifierContext ctx);
}