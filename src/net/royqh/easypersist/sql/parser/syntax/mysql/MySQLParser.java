package net.royqh.easypersist.sql.parser.syntax.mysql;// Generated from E:/Workspace/EasyPersist/grammar\MySQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, K_INPLACE=38, 
		K_COPY=39, K_SHARED=40, K_EXCLUSIVE=41, K_ACCESSIBLE=42, K_ACTION=43, 
		K_ADD=44, K_AFTER=45, K_AGAINST=46, K_AGGREGATE=47, K_ALGORITHM=48, K_ALL=49, 
		K_ALTER=50, K_ANALYZE=51, K_AND=52, K_ANY=53, K_AS=54, K_ASC=55, K_ASCII=56, 
		K_ASENSITIVE=57, K_AT=58, K_AUTHORS=59, K_AUTOEXTEND_SIZE=60, K_AUTO_INCREMENT=61, 
		K_AVG=62, K_AVG_ROW_LENGTH=63, K_BACKUP=64, K_BEFORE=65, K_BEGIN=66, K_BETWEEN=67, 
		K_BIGINT=68, K_BINARY=69, K_BINLOG=70, K_BIT=71, K_BLOB=72, K_BLOCK=73, 
		K_BOOL=74, K_BOOLEAN=75, K_BOTH=76, K_BTREE=77, K_BY=78, K_BYTE=79, K_CACHE=80, 
		K_CALL=81, K_CASCADE=82, K_CASCADED=83, K_CASE=84, K_CATALOG_NAME=85, 
		K_CHAIN=86, K_CHANGE=87, K_CHANGED=88, K_CHAR=89, K_CHARACTER=90, K_CHARSET=91, 
		K_CHECK=92, K_CHECKSUM=93, K_CIPHER=94, K_CLASS_ORIGIN=95, K_CLIENT=96, 
		K_CLOSE=97, K_COALESCE=98, K_CODE=99, K_COLLATE=100, K_COLLATION=101, 
		K_COLUMN=102, K_COLUMNS=103, K_COLUMN_NAME=104, K_COMMENT=105, K_COMMIT=106, 
		K_COMMITTED=107, K_COMPACT=108, K_COMPLETION=109, K_COMPRESSED=110, K_CONCURRENT=111, 
		K_CONDITION=112, K_CONNECTION=113, K_CONSISTENT=114, K_CONSTRAINT=115, 
		K_CONSTRAINT_CATALOG=116, K_CONSTRAINT_NAME=117, K_CONSTRAINT_SCHEMA=118, 
		K_CONTAINS=119, K_CONTEXT=120, K_CONTINUE=121, K_CONTRIBUTORS=122, K_CONVERT=123, 
		K_CPU=124, K_CREATE=125, K_CROSS=126, K_CUBE=127, K_CURRENT_DATE=128, 
		K_CURRENT_TIME=129, K_CURRENT_TIMESTAMP=130, K_CURRENT_USER=131, K_CURSOR=132, 
		K_CURSOR_NAME=133, K_DATA=134, K_DATABASE=135, K_DATABASES=136, K_DATAFILE=137, 
		K_DATE=138, K_DATETIME=139, K_DAY=140, K_DAY_HOUR=141, K_DAY_MICROSECOND=142, 
		K_DAY_MINUTE=143, K_DAY_SECOND=144, K_DEALLOCATE=145, K_DEC=146, K_DECIMAL=147, 
		K_DECLARE=148, K_DEFAULT=149, K_DEFINER=150, K_DELAYED=151, K_DELAY_KEY_WRITE=152, 
		K_DELETE=153, K_DESC=154, K_DESCRIBE=155, K_DES_KEY_FILE=156, K_DETERMINISTIC=157, 
		K_DIRECTORY=158, K_DISABLE=159, K_DISCARD=160, K_DISK=161, K_DISTINCT=162, 
		K_DISTINCTROW=163, K_DIV=164, K_DO=165, K_DOUBLE=166, K_DROP=167, K_DUAL=168, 
		K_DUMPFILE=169, K_DUPLICATE=170, K_DYNAMIC=171, K_EACH=172, K_ELSE=173, 
		K_ELSEIF=174, K_ENABLE=175, K_ENCLOSED=176, K_END=177, K_ENDS=178, K_ENGINE=179, 
		K_ENGINES=180, K_ENUM=181, K_ERROR=182, K_ERRORS=183, K_ESCAPE=184, K_ESCAPED=185, 
		K_EVENT=186, K_EVENTS=187, K_EVERY=188, K_EXECUTE=189, K_EXISTS=190, K_EXIT=191, 
		K_EXPANSION=192, K_EXPLAIN=193, K_EXTENDED=194, K_EXTENT_SIZE=195, K_FALSE=196, 
		K_FAST=197, K_FAULTS=198, K_FETCH=199, K_FIELDS=200, K_FILE=201, K_FIRST=202, 
		K_FIXED=203, K_FLOAT=204, K_FLOAT4=205, K_FLOAT8=206, K_FLUSH=207, K_FOR=208, 
		K_FORCE=209, K_FOREIGN=210, K_FOUND=211, K_FRAC_SECOND=212, K_FROM=213, 
		K_FULL=214, K_FULLTEXT=215, K_FUNCTION=216, K_GENERAL=217, K_GEOMETRY=218, 
		K_GEOMETRYCOLLECTION=219, K_GET_FORMAT=220, K_GLOBAL=221, K_GRANT=222, 
		K_GRANTS=223, K_GROUP=224, K_HANDLER=225, K_HASH=226, K_HAVING=227, K_HELP=228, 
		K_HIGH_PRIORITY=229, K_HOST=230, K_HOSTS=231, K_HOUR=232, K_HOUR_MICROSECOND=233, 
		K_HOUR_MINUTE=234, K_HOUR_SECOND=235, K_IDENTIFIED=236, K_IF=237, K_IGNORE=238, 
		K_IGNORE_SERVER_IDS=239, K_IMPORT=240, K_IN=241, K_INDEX=242, K_INDEXES=243, 
		K_INFILE=244, K_INITIAL_SIZE=245, K_INNER=246, K_INNOBASE=247, K_INNODB=248, 
		K_INOUT=249, K_INSENSITIVE=250, K_INSERT=251, K_INSERT_METHOD=252, K_INSTALL=253, 
		K_INT=254, K_INT1=255, K_INT2=256, K_INT3=257, K_INT4=258, K_INT8=259, 
		K_INTEGER=260, K_INTERVAL=261, K_INTO=262, K_INVOKER=263, K_IO=264, K_IO_THREAD=265, 
		K_IPC=266, K_IS=267, K_ISOLATION=268, K_ISSUER=269, K_ITERATE=270, K_JSON=271, 
		K_JOIN=272, K_KEY=273, K_KEYS=274, K_KEY_BLOCK_SIZE=275, K_KILL=276, K_LANGUAGE=277, 
		K_LAST=278, K_LEADING=279, K_LEAVE=280, K_LEAVES=281, K_LEFT=282, K_LESS=283, 
		K_LEVEL=284, K_LIKE=285, K_LIMIT=286, K_LINEAR=287, K_LINES=288, K_LINESTRING=289, 
		K_LIST=290, K_LOAD=291, K_LOCAL=292, K_LOCALTIME=293, K_LOCALTIMESTAMP=294, 
		K_LOCK=295, K_LOCKS=296, K_LOGFILE=297, K_LOGS=298, K_LONG=299, K_LONGBLOB=300, 
		K_LONGTEXT=301, K_LOOP=302, K_LOW_PRIORITY=303, K_MASTER=304, K_MASTER_CONNECT_RETRY=305, 
		K_MASTER_HEARTBEAT_PERIOD=306, K_MASTER_HOST=307, K_MASTER_LOG_FILE=308, 
		K_MASTER_LOG_POS=309, K_MASTER_PASSWORD=310, K_MASTER_PORT=311, K_MASTER_SERVER_ID=312, 
		K_MASTER_SSL=313, K_MASTER_SSL_CA=314, K_MASTER_SSL_CAPATH=315, K_MASTER_SSL_CERT=316, 
		K_MASTER_SSL_CIPHER=317, K_MASTER_SSL_KEY=318, K_MASTER_SSL_VERIFY_SERVER_CERT=319, 
		K_MASTER_USER=320, K_MATCH=321, K_MAXVALUE=322, K_MAX_CONNECTIONS_PER_HOUR=323, 
		K_MAX_QUERIES_PER_HOUR=324, K_MAX_ROWS=325, K_MAX_SIZE=326, K_MAX_UPDATES_PER_HOUR=327, 
		K_MAX_USER_CONNECTIONS=328, K_MEDIUM=329, K_MEDIUMBLOB=330, K_MEDIUMINT=331, 
		K_MEDIUMTEXT=332, K_MEMORY=333, K_MERGE=334, K_MESSAGE_TEXT=335, K_MICROSECOND=336, 
		K_MIDDLEINT=337, K_MIGRATE=338, K_MINUTE=339, K_MINUTE_MICROSECOND=340, 
		K_MINUTE_SECOND=341, K_MIN_ROWS=342, K_MOD=343, K_MODE=344, K_MODIFIES=345, 
		K_MODIFY=346, K_MONTH=347, K_MULTILINESTRING=348, K_MULTIPOINT=349, K_MULTIPOLYGON=350, 
		K_MUTEX=351, K_MYSQL_ERRNO=352, K_NAME=353, K_NAMES=354, K_NATIONAL=355, 
		K_NATURAL=356, K_NCHAR=357, K_NDB=358, K_NDBCLUSTER=359, K_NEW=360, K_NEXT=361, 
		K_NO=362, K_NODEGROUP=363, K_NONE=364, K_NOT=365, K_NO_WAIT=366, K_NO_WRITE_TO_BINLOG=367, 
		K_NULL=368, K_NUMERIC=369, K_NVARCHAR=370, K_OFFSET=371, K_OLD_PASSWORD=372, 
		K_ON=373, K_ONE=374, K_ONE_SHOT=375, K_OPEN=376, K_OPTIMIZE=377, K_OPTION=378, 
		K_OPTIONALLY=379, K_OPTIONS=380, K_OR=381, K_ORDER=382, K_OUT=383, K_OUTER=384, 
		K_OUTFILE=385, K_OWNER=386, K_PACK_KEYS=387, K_PAGE=388, K_PARSER=389, 
		K_PARTIAL=390, K_PARTITION=391, K_PARTITIONING=392, K_PARTITIONS=393, 
		K_PASSWORD=394, K_PHASE=395, K_PLUGIN=396, K_PLUGINS=397, K_POINT=398, 
		K_POLYGON=399, K_PORT=400, K_PRECISION=401, K_PREPARE=402, K_PRESERVE=403, 
		K_PREV=404, K_PRIMARY=405, K_PRIVILEGES=406, K_PROCEDURE=407, K_PROCESSLIST=408, 
		K_PROFILE=409, K_PROFILES=410, K_PROXY=411, K_PURGE=412, K_QUARTER=413, 
		K_QUERY=414, K_QUICK=415, K_RANGE=416, K_READ=417, K_READS=418, K_READ_ONLY=419, 
		K_READ_WRITE=420, K_REAL=421, K_REBUILD=422, K_RECOVER=423, K_REDOFILE=424, 
		K_REDO_BUFFER_SIZE=425, K_REDUNDANT=426, K_REFERENCES=427, K_REGEXP=428, 
		K_RELAY=429, K_RELAYLOG=430, K_RELAY_LOG_FILE=431, K_RELAY_LOG_POS=432, 
		K_RELAY_THREAD=433, K_RELEASE=434, K_RELOAD=435, K_REMOVE=436, K_RENAME=437, 
		K_REORGANIZE=438, K_REPAIR=439, K_REPEAT=440, K_REPEATABLE=441, K_REPLACE=442, 
		K_REPLICATION=443, K_REQUIRE=444, K_RESET=445, K_RESIGNAL=446, K_RESTORE=447, 
		K_RESTRICT=448, K_RESUME=449, K_RETURN=450, K_RETURNS=451, K_REVOKE=452, 
		K_RIGHT=453, K_RLIKE=454, K_ROLLBACK=455, K_ROLLUP=456, K_ROUTINE=457, 
		K_ROW=458, K_ROWS=459, K_ROW_FORMAT=460, K_RTREE=461, K_SAVEPOINT=462, 
		K_SCHEDULE=463, K_SCHEMA=464, K_SCHEMAS=465, K_SCHEMA_NAME=466, K_SECOND=467, 
		K_SECOND_MICROSECOND=468, K_SECURITY=469, K_SELECT=470, K_SENSITIVE=471, 
		K_SEPARATOR=472, K_SERIAL=473, K_SERIALIZABLE=474, K_SERVER=475, K_SESSION=476, 
		K_SET=477, K_SHARE=478, K_SHOW=479, K_SHUTDOWN=480, K_SIGNAL=481, K_SIGNED=482, 
		K_SIMPLE=483, K_SLAVE=484, K_SLOW=485, K_SMALLINT=486, K_SNAPSHOT=487, 
		K_SOCKET=488, K_SOME=489, K_SONAME=490, K_SOUNDS=491, K_SOURCE=492, K_SPATIAL=493, 
		K_SPECIFIC=494, K_SQL=495, K_SQLEXCEPTION=496, K_SQLSTATE=497, K_SQLWARNING=498, 
		K_SQL_BIG_RESULT=499, K_SQL_BUFFER_RESULT=500, K_SQL_CACHE=501, K_SQL_CALC_FOUND_ROWS=502, 
		K_SQL_NO_CACHE=503, K_SQL_SMALL_RESULT=504, K_SQL_THREAD=505, K_SQL_TSI_DAY=506, 
		K_SQL_TSI_FRAC_SECOND=507, K_SQL_TSI_HOUR=508, K_SQL_TSI_MINUTE=509, K_SQL_TSI_MONTH=510, 
		K_SQL_TSI_QUARTER=511, K_SQL_TSI_SECOND=512, K_SQL_TSI_WEEK=513, K_SQL_TSI_YEAR=514, 
		K_SSL=515, K_START=516, K_STARTING=517, K_STARTS=518, K_STATUS=519, K_STOP=520, 
		K_STORAGE=521, K_STRAIGHT_JOIN=522, K_STRING=523, K_SUBCLASS_ORIGIN=524, 
		K_SUBJECT=525, K_SUBPARTITION=526, K_SUBPARTITIONS=527, K_SUPER=528, K_SUSPEND=529, 
		K_SWAPS=530, K_SWITCHES=531, K_TABLE=532, K_TABLES=533, K_TABLESPACE=534, 
		K_TABLE_CHECKSUM=535, K_TABLE_NAME=536, K_TEMPORARY=537, K_TEMPTABLE=538, 
		K_TERMINATED=539, K_TEXT=540, K_THAN=541, K_THEN=542, K_TIME=543, K_TIMESTAMP=544, 
		K_TIMESTAMPADD=545, K_TIMESTAMPDIFF=546, K_TINYBLOB=547, K_TINYINT=548, 
		K_TINYTEXT=549, K_TO=550, K_TRAILING=551, K_TRANSACTION=552, K_TRIGGER=553, 
		K_TRIGGERS=554, K_TRUE=555, K_TRUNCATE=556, K_TYPE=557, K_TYPES=558, K_UNCOMMITTED=559, 
		K_UNDEFINED=560, K_UNDO=561, K_UNDOFILE=562, K_UNDO_BUFFER_SIZE=563, K_UNICODE=564, 
		K_UNINSTALL=565, K_UNION=566, K_UNIQUE=567, K_UNKNOWN=568, K_UNLOCK=569, 
		K_UNSIGNED=570, K_UNTIL=571, K_UPDATE=572, K_UPGRADE=573, K_USAGE=574, 
		K_USE=575, K_USER=576, K_USER_RESOURCES=577, K_USE_FRM=578, K_USING=579, 
		K_UTC_DATE=580, K_UTC_TIME=581, K_UTC_TIMESTAMP=582, K_VALUE=583, K_VALUES=584, 
		K_VARBINARY=585, K_VARCHAR=586, K_VARCHARACTER=587, K_VARIABLES=588, K_VARYING=589, 
		K_VIEW=590, K_WAIT=591, K_WARNINGS=592, K_WEEK=593, K_WHEN=594, K_WHERE=595, 
		K_WHILE=596, K_WITH=597, K_WORK=598, K_WRAPPER=599, K_WRITE=600, K_X509=601, 
		K_XA=602, K_XML=603, K_XOR=604, K_YEAR=605, K_YEAR_MONTH=606, K_ZEROFILL=607, 
		K_ONLINE=608, K_OFFLINE=609, K_FORMAT=610, K_CAST=611, K_STATS_AUTO_RECALC=612, 
		K_STATS_PERSISTENT=613, K_STATS_SAMPLE_PAGES=614, K_OJ=615, HEX_VALUE=616, 
		BIT_VALUE=617, SCIENTIFIC_VALUE=618, FLOAT_VALUE=619, INTEGER_VALUE=620, 
		DOUBLE_QUOTED_STRING=621, SINGLE_QUOTED_STRING=622, QUOTED_IDENTIFIER=623, 
		UNDERLINE_STARTED_IDENTIFIER=624, UNQUOTED_IDENTIFIER=625, SINGLE_LINE_COMMENT=626, 
		MULTILINE_COMMENT=627, SPACES=628, UNEXPECTED_CHAR=629;
	public static final int
		RULE_prog = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_set_stmt = 4, RULE_variable_assignment = 5, RULE_user_var_name = 6, 
		RULE_var_name = 7, RULE_use_stmt = 8, RULE_create_index_stmt = 9, RULE_algorithm_option = 10, 
		RULE_lock_option = 11, RULE_drop_index_stmt = 12, RULE_drop_table_stmt = 13, 
		RULE_drop_view_stmt = 14, RULE_create_table_stmt = 15, RULE_partition_options = 16, 
		RULE_partition_type = 17, RULE_sub_partition_type = 18, RULE_partition_definition = 19, 
		RULE_partition_option = 20, RULE_subpartition_definition = 21, RULE_partition_name = 22, 
		RULE_tablespace_name = 23, RULE_value_list = 24, RULE_literal_value_list = 25, 
		RULE_create_view_stmt = 26, RULE_delete_stmt = 27, RULE_insert_stmt = 28, 
		RULE_insert_first_part = 29, RULE_insert_dup_key_update_part = 30, RULE_insert_value_list = 31, 
		RULE_update_stmt = 32, RULE_select_stmt = 33, RULE_select_query = 34, 
		RULE_order_by_clause = 35, RULE_procedure_name = 36, RULE_procedure_list = 37, 
		RULE_select_option = 38, RULE_select_from_clause = 39, RULE_select_into_clause = 40, 
		RULE_variable_list = 41, RULE_position = 42, RULE_offset = 43, RULE_row_count = 44, 
		RULE_select_expr = 45, RULE_table_references = 46, RULE_escaped_table_reference = 47, 
		RULE_table_reference = 48, RULE_table_factor = 49, RULE_partition_names = 50, 
		RULE_join_table = 51, RULE_join_right_part = 52, RULE_join_condition = 53, 
		RULE_index_hint_list = 54, RULE_index_hint = 55, RULE_index_list = 56, 
		RULE_user = 57, RULE_column_list = 58, RULE_view_name = 59, RULE_create_definition = 60, 
		RULE_column_definition = 61, RULE_column_attribute = 62, RULE_data_type = 63, 
		RULE_spatial_type = 64, RULE_index_col_name = 65, RULE_index_type = 66, 
		RULE_index_option = 67, RULE_reference_definition = 68, RULE_reference_option = 69, 
		RULE_on_delete_action = 70, RULE_on_update_action = 71, RULE_action = 72, 
		RULE_table_options = 73, RULE_table_option = 74, RULE_charset_name = 75, 
		RULE_collation_name = 76, RULE_engine_name = 77, RULE_parser_name = 78, 
		RULE_function_name = 79, RULE_database_name = 80, RULE_expr = 81, RULE_cast_expr = 82, 
		RULE_between_expr = 83, RULE_comparison_expr = 84, RULE_in_expr = 85, 
		RULE_regexp_expr = 86, RULE_comparison_operator = 87, RULE_is_expr = 88, 
		RULE_like_expr = 89, RULE_bit_expr = 90, RULE_simple_expr = 91, RULE_case_expr = 92, 
		RULE_function_call = 93, RULE_interval_expr = 94, RULE_time_unit = 95, 
		RULE_literal_value = 96, RULE_numeric_literal = 97, RULE_string_literal = 98, 
		RULE_bit_literal = 99, RULE_hex_literal = 100, RULE_underlinestarted_charset_name = 101, 
		RULE_date_literal = 102, RULE_alias_name = 103, RULE_keyword = 104, RULE_table_name = 105, 
		RULE_schema_name = 106, RULE_column_name = 107, RULE_index_name = 108, 
		RULE_symbol = 109, RULE_length = 110, RULE_decimals = 111, RULE_value = 112, 
		RULE_identifier = 113;
	public static final String[] ruleNames = {
		"prog", "error", "sql_stmt_list", "sql_stmt", "set_stmt", "variable_assignment", 
		"user_var_name", "var_name", "use_stmt", "create_index_stmt", "algorithm_option", 
		"lock_option", "drop_index_stmt", "drop_table_stmt", "drop_view_stmt", 
		"create_table_stmt", "partition_options", "partition_type", "sub_partition_type", 
		"partition_definition", "partition_option", "subpartition_definition", 
		"partition_name", "tablespace_name", "value_list", "literal_value_list", 
		"create_view_stmt", "delete_stmt", "insert_stmt", "insert_first_part", 
		"insert_dup_key_update_part", "insert_value_list", "update_stmt", "select_stmt", 
		"select_query", "order_by_clause", "procedure_name", "procedure_list", 
		"select_option", "select_from_clause", "select_into_clause", "variable_list", 
		"position", "offset", "row_count", "select_expr", "table_references", 
		"escaped_table_reference", "table_reference", "table_factor", "partition_names", 
		"join_table", "join_right_part", "join_condition", "index_hint_list", 
		"index_hint", "index_list", "user", "column_list", "view_name", "create_definition", 
		"column_definition", "column_attribute", "data_type", "spatial_type", 
		"index_col_name", "index_type", "index_option", "reference_definition", 
		"reference_option", "on_delete_action", "on_update_action", "action", 
		"table_options", "table_option", "charset_name", "collation_name", "engine_name", 
		"parser_name", "function_name", "database_name", "expr", "cast_expr", 
		"between_expr", "comparison_expr", "in_expr", "regexp_expr", "comparison_operator", 
		"is_expr", "like_expr", "bit_expr", "simple_expr", "case_expr", "function_call", 
		"interval_expr", "time_unit", "literal_value", "numeric_literal", "string_literal", 
		"bit_literal", "hex_literal", "underlinestarted_charset_name", "date_literal", 
		"alias_name", "keyword", "table_name", "schema_name", "column_name", "index_name", 
		"symbol", "length", "decimals", "value", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'@@global.'", "'@@session.'", "'@@'", "'@'", 
		"'('", "')'", "'*'", "'{'", "'}'", "'!'", "'&&'", "'||'", "'>='", "'>'", 
		"'<='", "'<'", "'<>'", "'!='", "'<=>'", "'^'", "'/'", "'DIV'", "'MOD'", 
		"'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'.'", "'?'", "'~'", 
		"'N'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "K_INPLACE", "K_COPY", "K_SHARED", "K_EXCLUSIVE", "K_ACCESSIBLE", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_AGAINST", "K_AGGREGATE", "K_ALGORITHM", 
		"K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_ANY", "K_AS", "K_ASC", "K_ASCII", 
		"K_ASENSITIVE", "K_AT", "K_AUTHORS", "K_AUTOEXTEND_SIZE", "K_AUTO_INCREMENT", 
		"K_AVG", "K_AVG_ROW_LENGTH", "K_BACKUP", "K_BEFORE", "K_BEGIN", "K_BETWEEN", 
		"K_BIGINT", "K_BINARY", "K_BINLOG", "K_BIT", "K_BLOB", "K_BLOCK", "K_BOOL", 
		"K_BOOLEAN", "K_BOTH", "K_BTREE", "K_BY", "K_BYTE", "K_CACHE", "K_CALL", 
		"K_CASCADE", "K_CASCADED", "K_CASE", "K_CATALOG_NAME", "K_CHAIN", "K_CHANGE", 
		"K_CHANGED", "K_CHAR", "K_CHARACTER", "K_CHARSET", "K_CHECK", "K_CHECKSUM", 
		"K_CIPHER", "K_CLASS_ORIGIN", "K_CLIENT", "K_CLOSE", "K_COALESCE", "K_CODE", 
		"K_COLLATE", "K_COLLATION", "K_COLUMN", "K_COLUMNS", "K_COLUMN_NAME", 
		"K_COMMENT", "K_COMMIT", "K_COMMITTED", "K_COMPACT", "K_COMPLETION", "K_COMPRESSED", 
		"K_CONCURRENT", "K_CONDITION", "K_CONNECTION", "K_CONSISTENT", "K_CONSTRAINT", 
		"K_CONSTRAINT_CATALOG", "K_CONSTRAINT_NAME", "K_CONSTRAINT_SCHEMA", "K_CONTAINS", 
		"K_CONTEXT", "K_CONTINUE", "K_CONTRIBUTORS", "K_CONVERT", "K_CPU", "K_CREATE", 
		"K_CROSS", "K_CUBE", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_CURRENT_USER", "K_CURSOR", "K_CURSOR_NAME", "K_DATA", "K_DATABASE", 
		"K_DATABASES", "K_DATAFILE", "K_DATE", "K_DATETIME", "K_DAY", "K_DAY_HOUR", 
		"K_DAY_MICROSECOND", "K_DAY_MINUTE", "K_DAY_SECOND", "K_DEALLOCATE", "K_DEC", 
		"K_DECIMAL", "K_DECLARE", "K_DEFAULT", "K_DEFINER", "K_DELAYED", "K_DELAY_KEY_WRITE", 
		"K_DELETE", "K_DESC", "K_DESCRIBE", "K_DES_KEY_FILE", "K_DETERMINISTIC", 
		"K_DIRECTORY", "K_DISABLE", "K_DISCARD", "K_DISK", "K_DISTINCT", "K_DISTINCTROW", 
		"K_DIV", "K_DO", "K_DOUBLE", "K_DROP", "K_DUAL", "K_DUMPFILE", "K_DUPLICATE", 
		"K_DYNAMIC", "K_EACH", "K_ELSE", "K_ELSEIF", "K_ENABLE", "K_ENCLOSED", 
		"K_END", "K_ENDS", "K_ENGINE", "K_ENGINES", "K_ENUM", "K_ERROR", "K_ERRORS", 
		"K_ESCAPE", "K_ESCAPED", "K_EVENT", "K_EVENTS", "K_EVERY", "K_EXECUTE", 
		"K_EXISTS", "K_EXIT", "K_EXPANSION", "K_EXPLAIN", "K_EXTENDED", "K_EXTENT_SIZE", 
		"K_FALSE", "K_FAST", "K_FAULTS", "K_FETCH", "K_FIELDS", "K_FILE", "K_FIRST", 
		"K_FIXED", "K_FLOAT", "K_FLOAT4", "K_FLOAT8", "K_FLUSH", "K_FOR", "K_FORCE", 
		"K_FOREIGN", "K_FOUND", "K_FRAC_SECOND", "K_FROM", "K_FULL", "K_FULLTEXT", 
		"K_FUNCTION", "K_GENERAL", "K_GEOMETRY", "K_GEOMETRYCOLLECTION", "K_GET_FORMAT", 
		"K_GLOBAL", "K_GRANT", "K_GRANTS", "K_GROUP", "K_HANDLER", "K_HASH", "K_HAVING", 
		"K_HELP", "K_HIGH_PRIORITY", "K_HOST", "K_HOSTS", "K_HOUR", "K_HOUR_MICROSECOND", 
		"K_HOUR_MINUTE", "K_HOUR_SECOND", "K_IDENTIFIED", "K_IF", "K_IGNORE", 
		"K_IGNORE_SERVER_IDS", "K_IMPORT", "K_IN", "K_INDEX", "K_INDEXES", "K_INFILE", 
		"K_INITIAL_SIZE", "K_INNER", "K_INNOBASE", "K_INNODB", "K_INOUT", "K_INSENSITIVE", 
		"K_INSERT", "K_INSERT_METHOD", "K_INSTALL", "K_INT", "K_INT1", "K_INT2", 
		"K_INT3", "K_INT4", "K_INT8", "K_INTEGER", "K_INTERVAL", "K_INTO", "K_INVOKER", 
		"K_IO", "K_IO_THREAD", "K_IPC", "K_IS", "K_ISOLATION", "K_ISSUER", "K_ITERATE", 
		"K_JSON", "K_JOIN", "K_KEY", "K_KEYS", "K_KEY_BLOCK_SIZE", "K_KILL", "K_LANGUAGE", 
		"K_LAST", "K_LEADING", "K_LEAVE", "K_LEAVES", "K_LEFT", "K_LESS", "K_LEVEL", 
		"K_LIKE", "K_LIMIT", "K_LINEAR", "K_LINES", "K_LINESTRING", "K_LIST", 
		"K_LOAD", "K_LOCAL", "K_LOCALTIME", "K_LOCALTIMESTAMP", "K_LOCK", "K_LOCKS", 
		"K_LOGFILE", "K_LOGS", "K_LONG", "K_LONGBLOB", "K_LONGTEXT", "K_LOOP", 
		"K_LOW_PRIORITY", "K_MASTER", "K_MASTER_CONNECT_RETRY", "K_MASTER_HEARTBEAT_PERIOD", 
		"K_MASTER_HOST", "K_MASTER_LOG_FILE", "K_MASTER_LOG_POS", "K_MASTER_PASSWORD", 
		"K_MASTER_PORT", "K_MASTER_SERVER_ID", "K_MASTER_SSL", "K_MASTER_SSL_CA", 
		"K_MASTER_SSL_CAPATH", "K_MASTER_SSL_CERT", "K_MASTER_SSL_CIPHER", "K_MASTER_SSL_KEY", 
		"K_MASTER_SSL_VERIFY_SERVER_CERT", "K_MASTER_USER", "K_MATCH", "K_MAXVALUE", 
		"K_MAX_CONNECTIONS_PER_HOUR", "K_MAX_QUERIES_PER_HOUR", "K_MAX_ROWS", 
		"K_MAX_SIZE", "K_MAX_UPDATES_PER_HOUR", "K_MAX_USER_CONNECTIONS", "K_MEDIUM", 
		"K_MEDIUMBLOB", "K_MEDIUMINT", "K_MEDIUMTEXT", "K_MEMORY", "K_MERGE", 
		"K_MESSAGE_TEXT", "K_MICROSECOND", "K_MIDDLEINT", "K_MIGRATE", "K_MINUTE", 
		"K_MINUTE_MICROSECOND", "K_MINUTE_SECOND", "K_MIN_ROWS", "K_MOD", "K_MODE", 
		"K_MODIFIES", "K_MODIFY", "K_MONTH", "K_MULTILINESTRING", "K_MULTIPOINT", 
		"K_MULTIPOLYGON", "K_MUTEX", "K_MYSQL_ERRNO", "K_NAME", "K_NAMES", "K_NATIONAL", 
		"K_NATURAL", "K_NCHAR", "K_NDB", "K_NDBCLUSTER", "K_NEW", "K_NEXT", "K_NO", 
		"K_NODEGROUP", "K_NONE", "K_NOT", "K_NO_WAIT", "K_NO_WRITE_TO_BINLOG", 
		"K_NULL", "K_NUMERIC", "K_NVARCHAR", "K_OFFSET", "K_OLD_PASSWORD", "K_ON", 
		"K_ONE", "K_ONE_SHOT", "K_OPEN", "K_OPTIMIZE", "K_OPTION", "K_OPTIONALLY", 
		"K_OPTIONS", "K_OR", "K_ORDER", "K_OUT", "K_OUTER", "K_OUTFILE", "K_OWNER", 
		"K_PACK_KEYS", "K_PAGE", "K_PARSER", "K_PARTIAL", "K_PARTITION", "K_PARTITIONING", 
		"K_PARTITIONS", "K_PASSWORD", "K_PHASE", "K_PLUGIN", "K_PLUGINS", "K_POINT", 
		"K_POLYGON", "K_PORT", "K_PRECISION", "K_PREPARE", "K_PRESERVE", "K_PREV", 
		"K_PRIMARY", "K_PRIVILEGES", "K_PROCEDURE", "K_PROCESSLIST", "K_PROFILE", 
		"K_PROFILES", "K_PROXY", "K_PURGE", "K_QUARTER", "K_QUERY", "K_QUICK", 
		"K_RANGE", "K_READ", "K_READS", "K_READ_ONLY", "K_READ_WRITE", "K_REAL", 
		"K_REBUILD", "K_RECOVER", "K_REDOFILE", "K_REDO_BUFFER_SIZE", "K_REDUNDANT", 
		"K_REFERENCES", "K_REGEXP", "K_RELAY", "K_RELAYLOG", "K_RELAY_LOG_FILE", 
		"K_RELAY_LOG_POS", "K_RELAY_THREAD", "K_RELEASE", "K_RELOAD", "K_REMOVE", 
		"K_RENAME", "K_REORGANIZE", "K_REPAIR", "K_REPEAT", "K_REPEATABLE", "K_REPLACE", 
		"K_REPLICATION", "K_REQUIRE", "K_RESET", "K_RESIGNAL", "K_RESTORE", "K_RESTRICT", 
		"K_RESUME", "K_RETURN", "K_RETURNS", "K_REVOKE", "K_RIGHT", "K_RLIKE", 
		"K_ROLLBACK", "K_ROLLUP", "K_ROUTINE", "K_ROW", "K_ROWS", "K_ROW_FORMAT", 
		"K_RTREE", "K_SAVEPOINT", "K_SCHEDULE", "K_SCHEMA", "K_SCHEMAS", "K_SCHEMA_NAME", 
		"K_SECOND", "K_SECOND_MICROSECOND", "K_SECURITY", "K_SELECT", "K_SENSITIVE", 
		"K_SEPARATOR", "K_SERIAL", "K_SERIALIZABLE", "K_SERVER", "K_SESSION", 
		"K_SET", "K_SHARE", "K_SHOW", "K_SHUTDOWN", "K_SIGNAL", "K_SIGNED", "K_SIMPLE", 
		"K_SLAVE", "K_SLOW", "K_SMALLINT", "K_SNAPSHOT", "K_SOCKET", "K_SOME", 
		"K_SONAME", "K_SOUNDS", "K_SOURCE", "K_SPATIAL", "K_SPECIFIC", "K_SQL", 
		"K_SQLEXCEPTION", "K_SQLSTATE", "K_SQLWARNING", "K_SQL_BIG_RESULT", "K_SQL_BUFFER_RESULT", 
		"K_SQL_CACHE", "K_SQL_CALC_FOUND_ROWS", "K_SQL_NO_CACHE", "K_SQL_SMALL_RESULT", 
		"K_SQL_THREAD", "K_SQL_TSI_DAY", "K_SQL_TSI_FRAC_SECOND", "K_SQL_TSI_HOUR", 
		"K_SQL_TSI_MINUTE", "K_SQL_TSI_MONTH", "K_SQL_TSI_QUARTER", "K_SQL_TSI_SECOND", 
		"K_SQL_TSI_WEEK", "K_SQL_TSI_YEAR", "K_SSL", "K_START", "K_STARTING", 
		"K_STARTS", "K_STATUS", "K_STOP", "K_STORAGE", "K_STRAIGHT_JOIN", "K_STRING", 
		"K_SUBCLASS_ORIGIN", "K_SUBJECT", "K_SUBPARTITION", "K_SUBPARTITIONS", 
		"K_SUPER", "K_SUSPEND", "K_SWAPS", "K_SWITCHES", "K_TABLE", "K_TABLES", 
		"K_TABLESPACE", "K_TABLE_CHECKSUM", "K_TABLE_NAME", "K_TEMPORARY", "K_TEMPTABLE", 
		"K_TERMINATED", "K_TEXT", "K_THAN", "K_THEN", "K_TIME", "K_TIMESTAMP", 
		"K_TIMESTAMPADD", "K_TIMESTAMPDIFF", "K_TINYBLOB", "K_TINYINT", "K_TINYTEXT", 
		"K_TO", "K_TRAILING", "K_TRANSACTION", "K_TRIGGER", "K_TRIGGERS", "K_TRUE", 
		"K_TRUNCATE", "K_TYPE", "K_TYPES", "K_UNCOMMITTED", "K_UNDEFINED", "K_UNDO", 
		"K_UNDOFILE", "K_UNDO_BUFFER_SIZE", "K_UNICODE", "K_UNINSTALL", "K_UNION", 
		"K_UNIQUE", "K_UNKNOWN", "K_UNLOCK", "K_UNSIGNED", "K_UNTIL", "K_UPDATE", 
		"K_UPGRADE", "K_USAGE", "K_USE", "K_USER", "K_USER_RESOURCES", "K_USE_FRM", 
		"K_USING", "K_UTC_DATE", "K_UTC_TIME", "K_UTC_TIMESTAMP", "K_VALUE", "K_VALUES", 
		"K_VARBINARY", "K_VARCHAR", "K_VARCHARACTER", "K_VARIABLES", "K_VARYING", 
		"K_VIEW", "K_WAIT", "K_WARNINGS", "K_WEEK", "K_WHEN", "K_WHERE", "K_WHILE", 
		"K_WITH", "K_WORK", "K_WRAPPER", "K_WRITE", "K_X509", "K_XA", "K_XML", 
		"K_XOR", "K_YEAR", "K_YEAR_MONTH", "K_ZEROFILL", "K_ONLINE", "K_OFFLINE", 
		"K_FORMAT", "K_CAST", "K_STATS_AUTO_RECALC", "K_STATS_PERSISTENT", "K_STATS_SAMPLE_PAGES", 
		"K_OJ", "HEX_VALUE", "BIT_VALUE", "SCIENTIFIC_VALUE", "FLOAT_VALUE", "INTEGER_VALUE", 
		"DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", "QUOTED_IDENTIFIER", "UNDERLINE_STARTED_IDENTIFIER", 
		"UNQUOTED_IDENTIFIER", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MySQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__7 || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (K_CREATE - 125)) | (1L << (K_DELETE - 125)) | (1L << (K_DROP - 125)))) != 0) || _la==K_INSERT || _la==K_SELECT || _la==K_SET || ((((_la - 572)) & ~0x3f) == 0 && ((1L << (_la - 572)) & ((1L << (K_UPDATE - 572)) | (1L << (K_USE - 572)) | (1L << (UNEXPECTED_CHAR - 572)))) != 0)) {
				{
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__7:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_INSERT:
				case K_SELECT:
				case K_SET:
				case K_UPDATE:
				case K_USE:
					{
					setState(228);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(229);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(MySQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(240);
				match(T__0);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			sql_stmt();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(247);
						match(T__0);
						}
						}
						setState(250); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(252);
					sql_stmt();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(T__0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Set_stmtContext set_stmt() {
			return getRuleContext(Set_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(264);
				create_index_stmt();
				}
				break;
			case 2:
				{
				setState(265);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(266);
				create_view_stmt();
				}
				break;
			case 4:
				{
				setState(267);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(268);
				drop_index_stmt();
				}
				break;
			case 6:
				{
				setState(269);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(270);
				drop_view_stmt();
				}
				break;
			case 8:
				{
				setState(271);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(272);
				select_stmt();
				}
				break;
			case 10:
				{
				setState(273);
				update_stmt();
				}
				break;
			case 11:
				{
				setState(274);
				set_stmt();
				}
				break;
			case 12:
				{
				setState(275);
				use_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_stmtContext extends ParserRuleContext {
		public ExprContext system_var_name;
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public TerminalNode K_ONE_SHOT() { return getToken(MySQLParser.K_ONE_SHOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSet_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSet_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set_stmt);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(K_SET);
				setState(279);
				variable_assignment();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(280);
					match(T__1);
					setState(281);
					variable_assignment();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(K_SET);
				setState(288);
				match(K_ONE_SHOT);
				setState(289);
				((Set_stmtContext)_localctx).system_var_name = expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignmentContext extends ParserRuleContext {
		public User_var_nameContext user_var_name() {
			return getRuleContext(User_var_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode K_GLOBAL() { return getToken(MySQLParser.K_GLOBAL, 0); }
		public TerminalNode K_SESSION() { return getToken(MySQLParser.K_SESSION, 0); }
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_assignment);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				user_var_name();
				setState(293);
				match(T__2);
				setState(294);
				expr(0);
				}
				break;
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				var_name();
				setState(297);
				match(T__2);
				setState(298);
				expr(0);
				}
				break;
			case K_GLOBAL:
			case K_SESSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==K_GLOBAL || _la==K_SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				var_name();
				setState(302);
				match(T__2);
				setState(303);
				expr(0);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				var_name();
				setState(307);
				match(T__2);
				setState(308);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_var_nameContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public User_var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUser_var_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUser_var_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUser_var_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_var_nameContext user_var_name() throws RecognitionException {
		User_var_nameContext _localctx = new User_var_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_user_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__6);
			setState(313);
			var_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(MySQLParser.UNQUOTED_IDENTIFIER, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(UNQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(MySQLParser.K_USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(K_USE);
			setState(318);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Index_optionContext index_option() {
			return getRuleContext(Index_optionContext.class,0);
		}
		public List<Algorithm_optionContext> algorithm_option() {
			return getRuleContexts(Algorithm_optionContext.class);
		}
		public Algorithm_optionContext algorithm_option(int i) {
			return getRuleContext(Algorithm_optionContext.class,i);
		}
		public List<Lock_optionContext> lock_option() {
			return getRuleContexts(Lock_optionContext.class);
		}
		public Lock_optionContext lock_option(int i) {
			return getRuleContext(Lock_optionContext.class,i);
		}
		public TerminalNode K_ONLINE() { return getToken(MySQLParser.K_ONLINE, 0); }
		public TerminalNode K_OFFLINE() { return getToken(MySQLParser.K_OFFLINE, 0); }
		public TerminalNode K_UNIQUE() { return getToken(MySQLParser.K_UNIQUE, 0); }
		public TerminalNode K_FULLTEXT() { return getToken(MySQLParser.K_FULLTEXT, 0); }
		public TerminalNode K_SPATIAL() { return getToken(MySQLParser.K_SPATIAL, 0); }
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(K_CREATE);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLINE || _la==K_OFFLINE) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==K_ONLINE || _la==K_OFFLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FULLTEXT || _la==K_SPATIAL || _la==K_UNIQUE) {
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==K_FULLTEXT || _la==K_SPATIAL || _la==K_UNIQUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(327);
			match(K_INDEX);
			setState(328);
			index_name();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(329);
				index_type();
				}
			}

			setState(332);
			match(K_ON);
			setState(333);
			table_name();
			setState(334);
			match(T__7);
			setState(335);
			index_col_name();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(336);
				match(T__1);
				setState(337);
				index_col_name();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(T__8);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
				{
				setState(344);
				index_option();
				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ALGORITHM || _la==K_LOCK) {
				{
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ALGORITHM:
					{
					setState(347);
					algorithm_option();
					}
					break;
				case K_LOCK:
					{
					setState(348);
					lock_option();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Algorithm_optionContext extends ParserRuleContext {
		public TerminalNode K_ALGORITHM() { return getToken(MySQLParser.K_ALGORITHM, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MySQLParser.K_DEFAULT, 0); }
		public TerminalNode K_INPLACE() { return getToken(MySQLParser.K_INPLACE, 0); }
		public TerminalNode K_COPY() { return getToken(MySQLParser.K_COPY, 0); }
		public Algorithm_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterAlgorithm_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitAlgorithm_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitAlgorithm_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Algorithm_optionContext algorithm_option() throws RecognitionException {
		Algorithm_optionContext _localctx = new Algorithm_optionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_algorithm_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(K_ALGORITHM);
			setState(355);
			match(T__2);
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==K_INPLACE || _la==K_COPY || _la==K_DEFAULT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_optionContext extends ParserRuleContext {
		public TerminalNode K_LOCK() { return getToken(MySQLParser.K_LOCK, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MySQLParser.K_DEFAULT, 0); }
		public TerminalNode K_NONE() { return getToken(MySQLParser.K_NONE, 0); }
		public TerminalNode K_SHARED() { return getToken(MySQLParser.K_SHARED, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(MySQLParser.K_EXCLUSIVE, 0); }
		public Lock_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLock_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLock_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLock_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lock_optionContext lock_option() throws RecognitionException {
		Lock_optionContext _localctx = new Lock_optionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lock_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(K_LOCK);
			setState(359);
			match(T__2);
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==K_SHARED || _la==K_EXCLUSIVE || _la==K_DEFAULT || _la==K_NONE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(MySQLParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Algorithm_optionContext algorithm_option() {
			return getRuleContext(Algorithm_optionContext.class,0);
		}
		public Lock_optionContext lock_option() {
			return getRuleContext(Lock_optionContext.class,0);
		}
		public TerminalNode K_ONLINE() { return getToken(MySQLParser.K_ONLINE, 0); }
		public TerminalNode K_OFFLINE() { return getToken(MySQLParser.K_OFFLINE, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(K_DROP);
			setState(363);
			match(K_INDEX);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLINE || _la==K_OFFLINE) {
				{
				setState(364);
				_la = _input.LA(1);
				if ( !(_la==K_ONLINE || _la==K_OFFLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(367);
			index_name();
			setState(368);
			match(K_ON);
			setState(369);
			table_name();
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALGORITHM:
				{
				setState(370);
				algorithm_option();
				}
				break;
			case K_LOCK:
				{
				setState(371);
				lock_option();
				}
				break;
			case EOF:
			case T__0:
			case T__7:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_USE:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(MySQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(MySQLParser.K_TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode K_TEMPORARY() { return getToken(MySQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public TerminalNode K_RESTRICT() { return getToken(MySQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(MySQLParser.K_CASCADE, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(K_DROP);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMPORARY) {
				{
				setState(375);
				match(K_TEMPORARY);
				}
			}

			setState(378);
			match(K_TABLE);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(379);
				match(K_IF);
				setState(380);
				match(K_EXISTS);
				}
				break;
			}
			setState(383);
			table_name();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(384);
				match(T__1);
				setState(385);
				table_name();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE || _la==K_RESTRICT) {
				{
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==K_CASCADE || _la==K_RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(MySQLParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(MySQLParser.K_VIEW, 0); }
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public TerminalNode K_RESTRICT() { return getToken(MySQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(MySQLParser.K_CASCADE, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_drop_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(K_DROP);
			setState(395);
			match(K_VIEW);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(396);
				match(K_IF);
				setState(397);
				match(K_EXISTS);
				}
			}

			setState(400);
			view_name();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(401);
				match(T__1);
				setState(402);
				view_name();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE || _la==K_RESTRICT) {
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==K_CASCADE || _la==K_RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	 
		public Create_table_stmtContext() { }
		public void copyFrom(Create_table_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableStmtContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(MySQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode K_TEMPORARY() { return getToken(MySQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public Partition_optionsContext partition_options() {
			return getRuleContext(Partition_optionsContext.class,0);
		}
		public CreateTableStmtContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableSelectStmtContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(MySQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(MySQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public Partition_optionsContext partition_options() {
			return getRuleContext(Partition_optionsContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(MySQLParser.K_REPLACE, 0); }
		public CreateTableSelectStmtContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCreateTableSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCreateTableSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCreateTableSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeStmtContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(MySQLParser.K_TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode K_TEMPORARY() { return getToken(MySQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public TerminalNode K_LIKE() { return getToken(MySQLParser.K_LIKE, 0); }
		public CreateTableLikeStmtContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCreateTableLikeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCreateTableLikeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCreateTableLikeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_table_stmt);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(K_CREATE);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(412);
					match(K_TEMPORARY);
					}
				}

				setState(415);
				match(K_TABLE);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(416);
					match(K_IF);
					setState(417);
					match(K_NOT);
					setState(418);
					match(K_EXISTS);
					}
					break;
				}
				setState(421);
				table_name();
				setState(422);
				match(T__7);
				setState(423);
				create_definition();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(424);
					match(T__1);
					setState(425);
					create_definition();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				match(T__8);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_AUTO_INCREMENT - 61)) | (1L << (K_AVG_ROW_LENGTH - 61)) | (1L << (K_CHARACTER - 61)) | (1L << (K_CHARSET - 61)) | (1L << (K_CHECKSUM - 61)) | (1L << (K_COLLATE - 61)) | (1L << (K_COMMENT - 61)) | (1L << (K_CONNECTION - 61)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_DATA - 134)) | (1L << (K_DEFAULT - 134)) | (1L << (K_DELAY_KEY_WRITE - 134)) | (1L << (K_ENGINE - 134)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (K_INDEX - 242)) | (1L << (K_INSERT_METHOD - 242)) | (1L << (K_KEY_BLOCK_SIZE - 242)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (K_MAX_ROWS - 325)) | (1L << (K_MIN_ROWS - 325)) | (1L << (K_PACK_KEYS - 325)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 612)) & ~0x3f) == 0 && ((1L << (_la - 612)) & ((1L << (K_STATS_AUTO_RECALC - 612)) | (1L << (K_STATS_PERSISTENT - 612)) | (1L << (K_STATS_SAMPLE_PAGES - 612)))) != 0)) {
					{
					setState(432);
					table_options();
					}
				}

				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(435);
					partition_options();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateTableSelectStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(K_CREATE);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(439);
					match(K_TEMPORARY);
					}
				}

				setState(442);
				match(K_TABLE);
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(443);
					match(K_IF);
					setState(444);
					match(K_NOT);
					setState(445);
					match(K_EXISTS);
					}
					break;
				}
				setState(448);
				table_name();
				setState(449);
				match(T__7);
				setState(450);
				create_definition();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(451);
					match(T__1);
					setState(452);
					create_definition();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				match(T__8);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_AUTO_INCREMENT - 61)) | (1L << (K_AVG_ROW_LENGTH - 61)) | (1L << (K_CHARACTER - 61)) | (1L << (K_CHARSET - 61)) | (1L << (K_CHECKSUM - 61)) | (1L << (K_COLLATE - 61)) | (1L << (K_COMMENT - 61)) | (1L << (K_CONNECTION - 61)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_DATA - 134)) | (1L << (K_DEFAULT - 134)) | (1L << (K_DELAY_KEY_WRITE - 134)) | (1L << (K_ENGINE - 134)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (K_INDEX - 242)) | (1L << (K_INSERT_METHOD - 242)) | (1L << (K_KEY_BLOCK_SIZE - 242)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (K_MAX_ROWS - 325)) | (1L << (K_MIN_ROWS - 325)) | (1L << (K_PACK_KEYS - 325)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 612)) & ~0x3f) == 0 && ((1L << (_la - 612)) & ((1L << (K_STATS_AUTO_RECALC - 612)) | (1L << (K_STATS_PERSISTENT - 612)) | (1L << (K_STATS_SAMPLE_PAGES - 612)))) != 0)) {
					{
					setState(459);
					table_options();
					}
				}

				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(462);
					partition_options();
					}
				}

				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_IGNORE || _la==K_REPLACE) {
					{
					setState(465);
					_la = _input.LA(1);
					if ( !(_la==K_IGNORE || _la==K_REPLACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(468);
					match(K_AS);
					}
				}

				setState(471);
				select_query(0);
				}
				break;
			case 3:
				_localctx = new CreateTableLikeStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(K_CREATE);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(474);
					match(K_TEMPORARY);
					}
				}

				setState(477);
				match(K_TABLE);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(478);
					match(K_IF);
					setState(479);
					match(K_NOT);
					setState(480);
					match(K_EXISTS);
					}
					break;
				}
				setState(483);
				table_name();
				setState(491);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LIKE:
					{
					{
					setState(484);
					match(K_LIKE);
					setState(485);
					table_name();
					}
					}
					break;
				case T__7:
					{
					{
					setState(486);
					match(T__7);
					setState(487);
					match(K_LIKE);
					setState(488);
					table_name();
					setState(489);
					match(T__8);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_optionsContext extends ParserRuleContext {
		public TerminalNode K_PARTITION() { return getToken(MySQLParser.K_PARTITION, 0); }
		public List<TerminalNode> K_BY() { return getTokens(MySQLParser.K_BY); }
		public TerminalNode K_BY(int i) {
			return getToken(MySQLParser.K_BY, i);
		}
		public Partition_typeContext partition_type() {
			return getRuleContext(Partition_typeContext.class,0);
		}
		public List<TerminalNode> K_PARTITIONS() { return getTokens(MySQLParser.K_PARTITIONS); }
		public TerminalNode K_PARTITIONS(int i) {
			return getToken(MySQLParser.K_PARTITIONS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode K_SUBPARTITION() { return getToken(MySQLParser.K_SUBPARTITION, 0); }
		public Sub_partition_typeContext sub_partition_type() {
			return getRuleContext(Sub_partition_typeContext.class,0);
		}
		public List<Partition_definitionContext> partition_definition() {
			return getRuleContexts(Partition_definitionContext.class);
		}
		public Partition_definitionContext partition_definition(int i) {
			return getRuleContext(Partition_definitionContext.class,i);
		}
		public Partition_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_optionsContext partition_options() throws RecognitionException {
		Partition_optionsContext _localctx = new Partition_optionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partition_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(K_PARTITION);
			setState(496);
			match(K_BY);
			setState(497);
			partition_type();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PARTITIONS) {
				{
				setState(498);
				match(K_PARTITIONS);
				setState(499);
				value();
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SUBPARTITION) {
				{
				setState(502);
				match(K_SUBPARTITION);
				setState(503);
				match(K_BY);
				setState(504);
				sub_partition_type();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITIONS) {
					{
					setState(505);
					match(K_PARTITIONS);
					setState(506);
					value();
					}
				}

				}
			}

			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(511);
				match(T__7);
				setState(512);
				partition_definition();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(513);
					match(T__1);
					setState(514);
					partition_definition();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(T__8);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_typeContext extends ParserRuleContext {
		public TerminalNode K_HASH() { return getToken(MySQLParser.K_HASH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_LINEAR() { return getToken(MySQLParser.K_LINEAR, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode K_ALGORITHM() { return getToken(MySQLParser.K_ALGORITHM, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode K_RANGE() { return getToken(MySQLParser.K_RANGE, 0); }
		public TerminalNode K_COLUMNS() { return getToken(MySQLParser.K_COLUMNS, 0); }
		public TerminalNode K_LIST() { return getToken(MySQLParser.K_LIST, 0); }
		public Partition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_typeContext partition_type() throws RecognitionException {
		Partition_typeContext _localctx = new Partition_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partition_type);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(524);
					match(K_LINEAR);
					}
				}

				setState(527);
				match(K_HASH);
				setState(528);
				match(T__7);
				setState(529);
				expr(0);
				setState(530);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(532);
					match(K_LINEAR);
					}
				}

				setState(535);
				match(K_KEY);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALGORITHM) {
					{
					setState(536);
					match(K_ALGORITHM);
					setState(537);
					match(T__2);
					setState(538);
					value();
					}
				}

				setState(541);
				match(T__7);
				setState(542);
				column_list();
				setState(543);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				match(K_RANGE);
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(546);
					match(T__7);
					setState(547);
					expr(0);
					setState(548);
					match(T__8);
					}
					break;
				case K_COLUMNS:
					{
					setState(550);
					match(K_COLUMNS);
					setState(551);
					match(T__7);
					setState(552);
					column_list();
					setState(553);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				match(K_LIST);
				setState(567);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(558);
					match(T__7);
					setState(559);
					expr(0);
					setState(560);
					match(T__8);
					}
					break;
				case K_COLUMNS:
					{
					setState(562);
					match(K_COLUMNS);
					setState(563);
					match(T__7);
					setState(564);
					column_list();
					setState(565);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_partition_typeContext extends ParserRuleContext {
		public TerminalNode K_HASH() { return getToken(MySQLParser.K_HASH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_LINEAR() { return getToken(MySQLParser.K_LINEAR, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode K_ALGORITHM() { return getToken(MySQLParser.K_ALGORITHM, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Sub_partition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_partition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSub_partition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSub_partition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSub_partition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_partition_typeContext sub_partition_type() throws RecognitionException {
		Sub_partition_typeContext _localctx = new Sub_partition_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sub_partition_type);
		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(571);
					match(K_LINEAR);
					}
				}

				setState(574);
				match(K_HASH);
				setState(575);
				match(T__7);
				setState(576);
				expr(0);
				setState(577);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(579);
					match(K_LINEAR);
					}
				}

				setState(582);
				match(K_KEY);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALGORITHM) {
					{
					setState(583);
					match(K_ALGORITHM);
					setState(584);
					match(T__2);
					setState(585);
					value();
					}
				}

				setState(588);
				match(T__7);
				setState(589);
				column_list();
				setState(590);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_definitionContext extends ParserRuleContext {
		public TerminalNode K_PARTITION() { return getToken(MySQLParser.K_PARTITION, 0); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(MySQLParser.K_VALUES, 0); }
		public List<Partition_optionContext> partition_option() {
			return getRuleContexts(Partition_optionContext.class);
		}
		public Partition_optionContext partition_option(int i) {
			return getRuleContext(Partition_optionContext.class,i);
		}
		public List<Subpartition_definitionContext> subpartition_definition() {
			return getRuleContexts(Subpartition_definitionContext.class);
		}
		public Subpartition_definitionContext subpartition_definition(int i) {
			return getRuleContext(Subpartition_definitionContext.class,i);
		}
		public TerminalNode K_LESS() { return getToken(MySQLParser.K_LESS, 0); }
		public TerminalNode K_THAN() { return getToken(MySQLParser.K_THAN, 0); }
		public TerminalNode K_IN() { return getToken(MySQLParser.K_IN, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode K_MAXVALUE() { return getToken(MySQLParser.K_MAXVALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Partition_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_definitionContext partition_definition() throws RecognitionException {
		Partition_definitionContext _localctx = new Partition_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partition_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(K_PARTITION);
			setState(595);
			partition_name();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VALUES) {
				{
				setState(596);
				match(K_VALUES);
				setState(614);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LESS:
					{
					setState(597);
					match(K_LESS);
					setState(598);
					match(K_THAN);
					setState(607);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(599);
						match(T__7);
						setState(602);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(600);
							expr(0);
							}
							break;
						case 2:
							{
							setState(601);
							value_list();
							}
							break;
						}
						setState(604);
						match(T__8);
						}
						break;
					case K_MAXVALUE:
						{
						setState(606);
						match(K_MAXVALUE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case K_IN:
					{
					setState(609);
					match(K_IN);
					setState(610);
					match(T__7);
					setState(611);
					value_list();
					setState(612);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT || _la==K_DATA || _la==K_ENGINE || _la==K_INDEX || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (K_MAX_ROWS - 325)) | (1L << (K_MIN_ROWS - 325)) | (1L << (K_NODEGROUP - 325)))) != 0) || _la==K_STORAGE || _la==K_TABLESPACE) {
				{
				{
				setState(618);
				partition_option();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(624);
				match(T__7);
				setState(625);
				subpartition_definition();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(626);
					match(T__1);
					setState(627);
					subpartition_definition();
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(T__8);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_optionContext extends ParserRuleContext {
		public TerminalNode K_ENGINE() { return getToken(MySQLParser.K_ENGINE, 0); }
		public Engine_nameContext engine_name() {
			return getRuleContext(Engine_nameContext.class,0);
		}
		public TerminalNode K_STORAGE() { return getToken(MySQLParser.K_STORAGE, 0); }
		public TerminalNode K_COMMENT() { return getToken(MySQLParser.K_COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode K_DATA() { return getToken(MySQLParser.K_DATA, 0); }
		public TerminalNode K_DIRECTORY() { return getToken(MySQLParser.K_DIRECTORY, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_MAX_ROWS() { return getToken(MySQLParser.K_MAX_ROWS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode K_MIN_ROWS() { return getToken(MySQLParser.K_MIN_ROWS, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(MySQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_NODEGROUP() { return getToken(MySQLParser.K_NODEGROUP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Partition_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_optionContext partition_option() throws RecognitionException {
		Partition_optionContext _localctx = new Partition_optionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partition_option);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ENGINE:
			case K_STORAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_STORAGE) {
					{
					setState(637);
					match(K_STORAGE);
					}
				}

				setState(640);
				match(K_ENGINE);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(641);
					match(T__2);
					}
				}

				setState(644);
				engine_name();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(K_COMMENT);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(646);
					match(T__2);
					}
				}

				setState(649);
				string_literal();
				}
				break;
			case K_DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(K_DATA);
				setState(651);
				match(K_DIRECTORY);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(652);
					match(T__2);
					}
				}

				setState(655);
				string_literal();
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				match(K_INDEX);
				setState(657);
				match(K_DIRECTORY);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(658);
					match(T__2);
					}
				}

				setState(661);
				string_literal();
				}
				break;
			case K_MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				match(K_MAX_ROWS);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(663);
					match(T__2);
					}
				}

				setState(666);
				value();
				}
				break;
			case K_MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(K_MIN_ROWS);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(668);
					match(T__2);
					}
				}

				setState(671);
				value();
				}
				break;
			case K_TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(672);
				match(K_TABLESPACE);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(673);
					match(T__2);
					}
				}

				setState(676);
				tablespace_name();
				}
				break;
			case K_NODEGROUP:
				enterOuterAlt(_localctx, 8);
				{
				setState(677);
				match(K_NODEGROUP);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(678);
					match(T__2);
					}
				}

				setState(681);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpartition_definitionContext extends ParserRuleContext {
		public TerminalNode K_SUBPARTITION() { return getToken(MySQLParser.K_SUBPARTITION, 0); }
		public Partition_nameContext partition_name() {
			return getRuleContext(Partition_nameContext.class,0);
		}
		public List<Partition_optionContext> partition_option() {
			return getRuleContexts(Partition_optionContext.class);
		}
		public Partition_optionContext partition_option(int i) {
			return getRuleContext(Partition_optionContext.class,i);
		}
		public Subpartition_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartition_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSubpartition_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSubpartition_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSubpartition_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subpartition_definitionContext subpartition_definition() throws RecognitionException {
		Subpartition_definitionContext _localctx = new Subpartition_definitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subpartition_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(K_SUBPARTITION);
			setState(685);
			partition_name();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT || _la==K_DATA || _la==K_ENGINE || _la==K_INDEX || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (K_MAX_ROWS - 325)) | (1L << (K_MIN_ROWS - 325)) | (1L << (K_NODEGROUP - 325)))) != 0) || _la==K_STORAGE || _la==K_TABLESPACE) {
				{
				{
				setState(686);
				partition_option();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tablespace_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tablespace_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespace_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTablespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTablespace_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTablespace_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tablespace_nameContext tablespace_name() throws RecognitionException {
		Tablespace_nameContext _localctx = new Tablespace_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablespace_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public List<Literal_value_listContext> literal_value_list() {
			return getRuleContexts(Literal_value_listContext.class);
		}
		public Literal_value_listContext literal_value_list(int i) {
			return getRuleContext(Literal_value_listContext.class,i);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value_list);
		int _la;
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(T__7);
				setState(697);
				literal_value_list();
				setState(698);
				match(T__8);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(699);
					match(T__1);
					setState(700);
					match(T__7);
					setState(701);
					literal_value_list();
					setState(702);
					match(T__8);
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
			case T__36:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATE:
			case K_FALSE:
			case K_MAXVALUE:
			case K_NULL:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TRUE:
			case BIT_VALUE:
			case SCIENTIFIC_VALUE:
			case FLOAT_VALUE:
			case INTEGER_VALUE:
			case DOUBLE_QUOTED_STRING:
			case SINGLE_QUOTED_STRING:
			case UNDERLINE_STARTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				literal_value_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_value_listContext extends ParserRuleContext {
		public List<TerminalNode> K_MAXVALUE() { return getTokens(MySQLParser.K_MAXVALUE); }
		public TerminalNode K_MAXVALUE(int i) {
			return getToken(MySQLParser.K_MAXVALUE, i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public Literal_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLiteral_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLiteral_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLiteral_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_value_listContext literal_value_list() throws RecognitionException {
		Literal_value_listContext _localctx = new Literal_value_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_MAXVALUE:
				{
				setState(712);
				match(K_MAXVALUE);
				}
				break;
			case T__10:
			case T__36:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATE:
			case K_FALSE:
			case K_NULL:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TRUE:
			case BIT_VALUE:
			case SCIENTIFIC_VALUE:
			case FLOAT_VALUE:
			case INTEGER_VALUE:
			case DOUBLE_QUOTED_STRING:
			case SINGLE_QUOTED_STRING:
			case UNDERLINE_STARTED_IDENTIFIER:
				{
				setState(713);
				literal_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(716);
				match(T__1);
				setState(719);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_MAXVALUE:
					{
					setState(717);
					match(K_MAXVALUE);
					}
					break;
				case T__10:
				case T__36:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATE:
				case K_FALSE:
				case K_NULL:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TRUE:
				case BIT_VALUE:
				case SCIENTIFIC_VALUE:
				case FLOAT_VALUE:
				case INTEGER_VALUE:
				case DOUBLE_QUOTED_STRING:
				case SINGLE_QUOTED_STRING:
				case UNDERLINE_STARTED_IDENTIFIER:
					{
					setState(718);
					literal_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(MySQLParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(MySQLParser.K_OR, 0); }
		public TerminalNode K_REPLACE() { return getToken(MySQLParser.K_REPLACE, 0); }
		public TerminalNode K_ALGORITHM() { return getToken(MySQLParser.K_ALGORITHM, 0); }
		public List<TerminalNode> K_DEFINER() { return getTokens(MySQLParser.K_DEFINER); }
		public TerminalNode K_DEFINER(int i) {
			return getToken(MySQLParser.K_DEFINER, i);
		}
		public TerminalNode K_SQL() { return getToken(MySQLParser.K_SQL, 0); }
		public TerminalNode K_SECURITY() { return getToken(MySQLParser.K_SECURITY, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(MySQLParser.K_WITH, 0); }
		public TerminalNode K_CHECK() { return getToken(MySQLParser.K_CHECK, 0); }
		public TerminalNode K_OPTION() { return getToken(MySQLParser.K_OPTION, 0); }
		public TerminalNode K_UNDEFINED() { return getToken(MySQLParser.K_UNDEFINED, 0); }
		public TerminalNode K_MERGE() { return getToken(MySQLParser.K_MERGE, 0); }
		public TerminalNode K_TEMPTABLE() { return getToken(MySQLParser.K_TEMPTABLE, 0); }
		public TerminalNode K_INVOKER() { return getToken(MySQLParser.K_INVOKER, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode K_CURRENT_USER() { return getToken(MySQLParser.K_CURRENT_USER, 0); }
		public TerminalNode K_CASCADED() { return getToken(MySQLParser.K_CASCADED, 0); }
		public TerminalNode K_LOCAL() { return getToken(MySQLParser.K_LOCAL, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(K_CREATE);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(727);
				match(K_OR);
				setState(728);
				match(K_REPLACE);
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALGORITHM) {
				{
				setState(731);
				match(K_ALGORITHM);
				setState(732);
				match(T__2);
				setState(733);
				_la = _input.LA(1);
				if ( !(_la==K_MERGE || _la==K_TEMPTABLE || _la==K_UNDEFINED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFINER) {
				{
				setState(736);
				match(K_DEFINER);
				setState(737);
				match(T__2);
				setState(740);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
				case DOUBLE_QUOTED_STRING:
				case SINGLE_QUOTED_STRING:
				case UNDERLINE_STARTED_IDENTIFIER:
					{
					setState(738);
					user();
					}
					break;
				case K_CURRENT_USER:
					{
					setState(739);
					match(K_CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SQL) {
				{
				setState(744);
				match(K_SQL);
				setState(745);
				match(K_SECURITY);
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==K_DEFINER || _la==K_INVOKER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(749);
			match(K_VIEW);
			setState(750);
			view_name();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(751);
				match(T__7);
				setState(752);
				column_list();
				setState(753);
				match(T__8);
				}
			}

			setState(757);
			match(K_AS);
			setState(758);
			select_query(0);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(759);
				match(K_WITH);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CASCADED || _la==K_LOCAL) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(_la==K_CASCADED || _la==K_LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(763);
				match(K_CHECK);
				setState(764);
				match(K_OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(MySQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(MySQLParser.K_FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode K_LOW_PRIORITY() { return getToken(MySQLParser.K_LOW_PRIORITY, 0); }
		public TerminalNode K_QUICK() { return getToken(MySQLParser.K_QUICK, 0); }
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(MySQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(K_DELETE);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOW_PRIORITY) {
				{
				setState(768);
				match(K_LOW_PRIORITY);
				}
			}

			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_QUICK) {
				{
				setState(771);
				match(K_QUICK);
				}
			}

			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IGNORE) {
				{
				setState(774);
				match(K_IGNORE);
				}
			}

			setState(777);
			match(K_FROM);
			setState(778);
			table_name();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(779);
				match(K_WHERE);
				setState(780);
				expr(0);
				}
			}

			setState(783);
			order_by_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public Insert_first_partContext insert_first_part() {
			return getRuleContext(Insert_first_partContext.class,0);
		}
		public List<Insert_value_listContext> insert_value_list() {
			return getRuleContexts(Insert_value_listContext.class);
		}
		public Insert_value_listContext insert_value_list(int i) {
			return getRuleContext(Insert_value_listContext.class,i);
		}
		public Insert_dup_key_update_partContext insert_dup_key_update_part() {
			return getRuleContext(Insert_dup_key_update_partContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(MySQLParser.K_VALUES, 0); }
		public TerminalNode K_VALUE() { return getToken(MySQLParser.K_VALUE, 0); }
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(MySQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(MySQLParser.K_DEFAULT, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_stmt);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				insert_first_part();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VALUE || _la==K_VALUES) {
					{
					setState(786);
					_la = _input.LA(1);
					if ( !(_la==K_VALUE || _la==K_VALUES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(789);
				insert_value_list();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(790);
					match(T__1);
					setState(791);
					insert_value_list();
					}
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(797);
					insert_dup_key_update_part();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				insert_first_part();
				setState(801);
				select_query(0);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(802);
					insert_dup_key_update_part();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				insert_first_part();
				setState(806);
				match(K_SET);
				setState(807);
				column_name();
				setState(808);
				match(T__2);
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(809);
					expr(0);
					}
					break;
				case 2:
					{
					setState(810);
					match(K_DEFAULT);
					}
					break;
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(813);
					match(T__1);
					setState(814);
					column_name();
					setState(815);
					match(T__2);
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(816);
						expr(0);
						}
						break;
					case 2:
						{
						setState(817);
						match(K_DEFAULT);
						}
						break;
					}
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(825);
					insert_dup_key_update_part();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_first_partContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(MySQLParser.K_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_INTO() { return getToken(MySQLParser.K_INTO, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode K_PARTITION() { return getToken(MySQLParser.K_PARTITION, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode K_LOW_PRIORITY() { return getToken(MySQLParser.K_LOW_PRIORITY, 0); }
		public TerminalNode K_DELAYED() { return getToken(MySQLParser.K_DELAYED, 0); }
		public Insert_first_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_first_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsert_first_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsert_first_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsert_first_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_first_partContext insert_first_part() throws RecognitionException {
		Insert_first_partContext _localctx = new Insert_first_partContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insert_first_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(K_INSERT);
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==K_DELAYED || _la==K_LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(834);
				match(K_IGNORE);
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(837);
				match(K_INTO);
				}
				break;
			}
			setState(840);
			table_name();
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(841);
				match(T__7);
				setState(842);
				column_list();
				setState(843);
				match(T__8);
				}
				break;
			}
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PARTITION) {
				{
				setState(847);
				match(K_PARTITION);
				setState(848);
				match(T__7);
				setState(849);
				partition_names();
				setState(850);
				match(T__8);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_dup_key_update_partContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public TerminalNode K_DUPLICATE() { return getToken(MySQLParser.K_DUPLICATE, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Insert_dup_key_update_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_dup_key_update_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsert_dup_key_update_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsert_dup_key_update_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsert_dup_key_update_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_dup_key_update_partContext insert_dup_key_update_part() throws RecognitionException {
		Insert_dup_key_update_partContext _localctx = new Insert_dup_key_update_partContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insert_dup_key_update_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(K_ON);
			setState(855);
			match(K_DUPLICATE);
			setState(856);
			match(K_KEY);
			setState(857);
			match(K_UPDATE);
			setState(858);
			column_name();
			setState(859);
			match(T__2);
			setState(860);
			expr(0);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(861);
				match(T__1);
				setState(862);
				column_name();
				setState(863);
				match(T__2);
				setState(864);
				expr(0);
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_value_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(MySQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(MySQLParser.K_DEFAULT, i);
		}
		public Insert_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsert_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsert_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsert_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_value_listContext insert_value_list() throws RecognitionException {
		Insert_value_listContext _localctx = new Insert_value_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_insert_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(T__7);
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(872);
				expr(0);
				}
				break;
			case 2:
				{
				setState(873);
				match(K_DEFAULT);
				}
				break;
			}
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(876);
				match(T__1);
				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(877);
					expr(0);
					}
					break;
				case 2:
					{
					setState(878);
					match(K_DEFAULT);
					}
					break;
				}
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(MySQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(MySQLParser.K_DEFAULT, i);
		}
		public TerminalNode K_LOW_PRIORITY() { return getToken(MySQLParser.K_LOW_PRIORITY, 0); }
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(MySQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(K_UPDATE);
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(889);
				match(K_LOW_PRIORITY);
				}
				break;
			}
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(892);
				match(K_IGNORE);
				}
				break;
			}
			setState(895);
			table_reference(0);
			setState(896);
			match(K_SET);
			setState(897);
			column_name();
			setState(898);
			match(T__2);
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(899);
				expr(0);
				}
				break;
			case 2:
				{
				setState(900);
				match(K_DEFAULT);
				}
				break;
			}
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(903);
				match(T__1);
				setState(904);
				column_name();
				setState(905);
				match(T__2);
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(906);
					expr(0);
					}
					break;
				case 2:
					{
					setState(907);
					match(K_DEFAULT);
					}
					break;
				}
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(915);
				match(K_WHERE);
				setState(916);
				expr(0);
				}
			}

			setState(919);
			order_by_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			select_query(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_queryContext extends ParserRuleContext {
		public Select_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_query; }
	 
		public Select_queryContext() { }
		public void copyFrom(Select_queryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectUnionContext extends Select_queryContext {
		public List<Select_queryContext> select_query() {
			return getRuleContexts(Select_queryContext.class);
		}
		public Select_queryContext select_query(int i) {
			return getRuleContext(Select_queryContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(MySQLParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(MySQLParser.K_UNION, i);
		}
		public List<TerminalNode> K_ALL() { return getTokens(MySQLParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(MySQLParser.K_ALL, i);
		}
		public List<TerminalNode> K_DISTINCT() { return getTokens(MySQLParser.K_DISTINCT); }
		public TerminalNode K_DISTINCT(int i) {
			return getToken(MySQLParser.K_DISTINCT, i);
		}
		public SelectUnionContext(Select_queryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnclosedSelectContext extends Select_queryContext {
		public List<Select_queryContext> select_query() {
			return getRuleContexts(Select_queryContext.class);
		}
		public Select_queryContext select_query(int i) {
			return getRuleContext(Select_queryContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(MySQLParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(MySQLParser.K_UNION, i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public List<TerminalNode> K_ALL() { return getTokens(MySQLParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(MySQLParser.K_ALL, i);
		}
		public List<TerminalNode> K_DISTINCT() { return getTokens(MySQLParser.K_DISTINCT); }
		public TerminalNode K_DISTINCT(int i) {
			return getToken(MySQLParser.K_DISTINCT, i);
		}
		public EnclosedSelectContext(Select_queryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterEnclosedSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitEnclosedSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitEnclosedSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectContext extends Select_queryContext {
		public TerminalNode K_SELECT() { return getToken(MySQLParser.K_SELECT, 0); }
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public List<Select_optionContext> select_option() {
			return getRuleContexts(Select_optionContext.class);
		}
		public Select_optionContext select_option(int i) {
			return getRuleContext(Select_optionContext.class,i);
		}
		public TerminalNode K_PROCEDURE() { return getToken(MySQLParser.K_PROCEDURE, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public Procedure_listContext procedure_list() {
			return getRuleContext(Procedure_listContext.class,0);
		}
		public Select_into_clauseContext select_into_clause() {
			return getRuleContext(Select_into_clauseContext.class,0);
		}
		public Select_from_clauseContext select_from_clause() {
			return getRuleContext(Select_from_clauseContext.class,0);
		}
		public TerminalNode K_FOR() { return getToken(MySQLParser.K_FOR, 0); }
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public TerminalNode K_LOCK() { return getToken(MySQLParser.K_LOCK, 0); }
		public TerminalNode K_IN() { return getToken(MySQLParser.K_IN, 0); }
		public TerminalNode K_SHARE() { return getToken(MySQLParser.K_SHARE, 0); }
		public TerminalNode K_MODE() { return getToken(MySQLParser.K_MODE, 0); }
		public SelectContext(Select_queryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_queryContext select_query() throws RecognitionException {
		return select_query(0);
	}

	private Select_queryContext select_query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Select_queryContext _localctx = new Select_queryContext(_ctx, _parentState);
		Select_queryContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_select_query, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new EnclosedSelectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(924);
				match(T__7);
				setState(925);
				select_query(0);
				setState(926);
				match(T__8);
				setState(935); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(927);
						match(K_UNION);
						setState(929);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_ALL || _la==K_DISTINCT) {
							{
							setState(928);
							_la = _input.LA(1);
							if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(931);
						match(T__7);
						setState(932);
						select_query(0);
						setState(933);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(937); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(939);
					order_by_clause();
					}
					break;
				}
				}
				break;
			case K_SELECT:
				{
				_localctx = new SelectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(942);
				match(K_SELECT);
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(943);
						select_option();
						}
						} 
					}
					setState(948);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(949);
				select_expr();
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(950);
						match(T__1);
						setState(951);
						select_expr();
						}
						} 
					}
					setState(956);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					{
					setState(957);
					select_into_clause();
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(958);
						select_from_clause();
						}
						break;
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(961);
					select_from_clause();
					setState(963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(962);
						select_into_clause();
						}
						break;
					}
					}
					}
					break;
				}
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(967);
					match(K_PROCEDURE);
					setState(968);
					procedure_name();
					setState(969);
					match(T__7);
					setState(970);
					procedure_list();
					setState(971);
					match(T__8);
					}
					break;
				}
				setState(981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					{
					setState(975);
					match(K_FOR);
					setState(976);
					match(K_UPDATE);
					}
					}
					break;
				case 2:
					{
					{
					setState(977);
					match(K_LOCK);
					setState(978);
					match(K_IN);
					setState(979);
					match(K_SHARE);
					setState(980);
					match(K_MODE);
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectUnionContext(new Select_queryContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_select_query);
					setState(985);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(991); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(986);
							match(K_UNION);
							setState(988);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==K_ALL || _la==K_DISTINCT) {
								{
								setState(987);
								_la = _input.LA(1);
								if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(990);
							select_query(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(993); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MySQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(MySQLParser.K_BY, 0); }
		public TerminalNode K_LIMIT() { return getToken(MySQLParser.K_LIMIT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public List<TerminalNode> K_ASC() { return getTokens(MySQLParser.K_ASC); }
		public TerminalNode K_ASC(int i) {
			return getToken(MySQLParser.K_ASC, i);
		}
		public List<TerminalNode> K_DESC() { return getTokens(MySQLParser.K_DESC); }
		public TerminalNode K_DESC(int i) {
			return getToken(MySQLParser.K_DESC, i);
		}
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public TerminalNode K_OFFSET() { return getToken(MySQLParser.K_OFFSET, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(K_ORDER);
			setState(1001);
			match(K_BY);
			{
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1002);
				column_name();
				}
				break;
			case 2:
				{
				setState(1003);
				expr(0);
				}
				break;
			case 3:
				{
				setState(1004);
				position();
				}
				break;
			}
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1007);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1010);
					match(T__1);
					setState(1014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1011);
						column_name();
						}
						break;
					case 2:
						{
						setState(1012);
						expr(0);
						}
						break;
					case 3:
						{
						setState(1013);
						position();
						}
						break;
					}
					setState(1017);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						setState(1016);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1024);
				match(K_LIMIT);
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					{
					setState(1028);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						setState(1025);
						offset();
						setState(1026);
						match(T__1);
						}
						break;
					}
					setState(1030);
					row_count();
					}
					}
					break;
				case 2:
					{
					{
					setState(1031);
					row_count();
					setState(1032);
					match(K_OFFSET);
					setState(1033);
					offset();
					}
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterProcedure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitProcedure_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_procedure_name);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				keyword();
				}
				break;
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Procedure_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterProcedure_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitProcedure_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitProcedure_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_listContext procedure_list() throws RecognitionException {
		Procedure_listContext _localctx = new Procedure_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_procedure_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			expr(0);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1044);
				match(T__1);
				setState(1045);
				expr(0);
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(MySQLParser.K_ALL, 0); }
		public TerminalNode K_DISTINCT() { return getToken(MySQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DISTINCTROW() { return getToken(MySQLParser.K_DISTINCTROW, 0); }
		public TerminalNode K_HIGH_PRIORITY() { return getToken(MySQLParser.K_HIGH_PRIORITY, 0); }
		public TerminalNode K_STRAIGHT_JOIN() { return getToken(MySQLParser.K_STRAIGHT_JOIN, 0); }
		public TerminalNode K_SQL_SMALL_RESULT() { return getToken(MySQLParser.K_SQL_SMALL_RESULT, 0); }
		public TerminalNode K_SQL_BIG_RESULT() { return getToken(MySQLParser.K_SQL_BIG_RESULT, 0); }
		public TerminalNode K_SQL_BUFFER_RESULT() { return getToken(MySQLParser.K_SQL_BUFFER_RESULT, 0); }
		public TerminalNode K_SQL_CACHE() { return getToken(MySQLParser.K_SQL_CACHE, 0); }
		public TerminalNode K_SQL_NO_CACHE() { return getToken(MySQLParser.K_SQL_NO_CACHE, 0); }
		public TerminalNode K_SQL_CALC_FOUND_ROWS() { return getToken(MySQLParser.K_SQL_CALC_FOUND_ROWS, 0); }
		public Select_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionContext select_option() throws RecognitionException {
		Select_optionContext _localctx = new Select_optionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_select_option);
		int _la;
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
			case K_DISTINCT:
			case K_DISTINCTROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT || _la==K_DISTINCTROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_HIGH_PRIORITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(K_HIGH_PRIORITY);
				}
				break;
			case K_STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				match(K_STRAIGHT_JOIN);
				}
				break;
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_SMALL_RESULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054);
				_la = _input.LA(1);
				if ( !(((((_la - 499)) & ~0x3f) == 0 && ((1L << (_la - 499)) & ((1L << (K_SQL_BIG_RESULT - 499)) | (1L << (K_SQL_BUFFER_RESULT - 499)) | (1L << (K_SQL_SMALL_RESULT - 499)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_SQL_CACHE:
			case K_SQL_NO_CACHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				_la = _input.LA(1);
				if ( !(_la==K_SQL_CACHE || _la==K_SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_SQL_CALC_FOUND_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1056);
				match(K_SQL_CALC_FOUND_ROWS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_from_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(MySQLParser.K_FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(MySQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(MySQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(MySQLParser.K_BY, 0); }
		public TerminalNode K_HAVING() { return getToken(MySQLParser.K_HAVING, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(MySQLParser.K_WITH, 0); }
		public TerminalNode K_ROLLUP() { return getToken(MySQLParser.K_ROLLUP, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public List<TerminalNode> K_ASC() { return getTokens(MySQLParser.K_ASC); }
		public TerminalNode K_ASC(int i) {
			return getToken(MySQLParser.K_ASC, i);
		}
		public List<TerminalNode> K_DESC() { return getTokens(MySQLParser.K_DESC); }
		public TerminalNode K_DESC(int i) {
			return getToken(MySQLParser.K_DESC, i);
		}
		public Select_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect_from_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_from_clauseContext select_from_clause() throws RecognitionException {
		Select_from_clauseContext _localctx = new Select_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_select_from_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(K_FROM);
			setState(1060);
			table_references();
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1061);
				match(K_WHERE);
				setState(1062);
				expr(0);
				}
				break;
			}
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1065);
				match(K_GROUP);
				setState(1066);
				match(K_BY);
				{
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1067);
					column_name();
					}
					break;
				case 2:
					{
					setState(1068);
					expr(0);
					}
					break;
				case 3:
					{
					setState(1069);
					position();
					}
					break;
				}
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1072);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				setState(1086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1075);
						match(T__1);
						setState(1079);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
						case 1:
							{
							setState(1076);
							column_name();
							}
							break;
						case 2:
							{
							setState(1077);
							expr(0);
							}
							break;
						case 3:
							{
							setState(1078);
							position();
							}
							break;
						}
						setState(1082);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(1081);
							_la = _input.LA(1);
							if ( !(_la==K_ASC || _la==K_DESC) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						}
						} 
					}
					setState(1088);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(1091);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1089);
					match(K_WITH);
					setState(1090);
					match(K_ROLLUP);
					}
					break;
				}
				}
				break;
			}
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1095);
				match(K_HAVING);
				setState(1096);
				expr(0);
				}
				break;
			}
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1099);
				order_by_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_into_clauseContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(MySQLParser.K_INTO, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public TerminalNode K_OUTFILE() { return getToken(MySQLParser.K_OUTFILE, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode K_DUMPFILE() { return getToken(MySQLParser.K_DUMPFILE, 0); }
		public Select_into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect_into_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect_into_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect_into_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_into_clauseContext select_into_clause() throws RecognitionException {
		Select_into_clauseContext _localctx = new Select_into_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_select_into_clause);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				match(K_INTO);
				setState(1103);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(K_INTO);
				setState(1105);
				match(K_OUTFILE);
				setState(1106);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				match(K_INTO);
				setState(1108);
				match(K_DUMPFILE);
				setState(1109);
				string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_listContext extends ParserRuleContext {
		public List<User_var_nameContext> user_var_name() {
			return getRuleContexts(User_var_nameContext.class);
		}
		public User_var_nameContext user_var_name(int i) {
			return getRuleContext(User_var_nameContext.class,i);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitVariable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitVariable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variable_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			user_var_name();
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1113);
					match(T__1);
					setState(1114);
					user_var_name();
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterRow_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitRow_count(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitRow_count(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelect_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelect_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_select_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1126);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1127);
				match(T__9);
				}
				break;
			}
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1130);
				match(K_AS);
				setState(1131);
				alias_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Escaped_table_referenceContext> escaped_table_reference() {
			return getRuleContexts(Escaped_table_referenceContext.class);
		}
		public Escaped_table_referenceContext escaped_table_reference(int i) {
			return getRuleContext(Escaped_table_referenceContext.class,i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_references(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_table_references);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			escaped_table_reference();
			setState(1139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1135);
					match(T__1);
					setState(1136);
					escaped_table_reference();
					}
					} 
				}
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Escaped_table_referenceContext extends ParserRuleContext {
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode K_OJ() { return getToken(MySQLParser.K_OJ, 0); }
		public Escaped_table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterEscaped_table_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitEscaped_table_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitEscaped_table_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Escaped_table_referenceContext escaped_table_reference() throws RecognitionException {
		Escaped_table_referenceContext _localctx = new Escaped_table_referenceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_escaped_table_reference);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				table_reference(0);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
				match(T__10);
				setState(1144);
				match(K_OJ);
				setState(1145);
				table_reference(0);
				setState(1146);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public Join_tableContext join_table() {
			return getRuleContext(Join_tableContext.class,0);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode K_JOIN() { return getToken(MySQLParser.K_JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode K_OUTER() { return getToken(MySQLParser.K_OUTER, 0); }
		public TerminalNode K_LEFT() { return getToken(MySQLParser.K_LEFT, 0); }
		public TerminalNode K_RIGHT() { return getToken(MySQLParser.K_RIGHT, 0); }
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		return table_reference(0);
	}

	private Table_referenceContext table_reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, _parentState);
		Table_referenceContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_table_reference, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1151);
				table_factor();
				}
				break;
			case 2:
				{
				setState(1152);
				join_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Table_referenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_table_reference);
					setState(1155);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_LEFT || _la==K_RIGHT) {
						{
						setState(1156);
						_la = _input.LA(1);
						if ( !(_la==K_LEFT || _la==K_RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1159);
						match(K_OUTER);
						}
					}

					setState(1162);
					match(K_JOIN);
					setState(1163);
					table_reference(0);
					setState(1164);
					join_condition();
					}
					} 
				}
				setState(1170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Table_factorContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_PARTITION() { return getToken(MySQLParser.K_PARTITION, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Table_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factorContext table_factor() throws RecognitionException {
		Table_factorContext _localctx = new Table_factorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table_factor);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				table_name();
				setState(1177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1172);
					match(K_PARTITION);
					setState(1173);
					match(T__7);
					setState(1174);
					partition_names();
					setState(1175);
					match(T__8);
					}
					break;
				}
				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1179);
						match(K_AS);
						}
						break;
					}
					setState(1182);
					alias_name();
					}
					break;
				}
				setState(1186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1185);
					index_hint_list();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				select_query(0);
				setState(1190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1189);
					match(K_AS);
					}
					break;
				}
				setState(1192);
				alias_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1194);
				match(T__7);
				setState(1195);
				select_query(0);
				setState(1196);
				match(T__8);
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1197);
					match(K_AS);
					}
					break;
				}
				setState(1200);
				alias_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1202);
				match(T__7);
				setState(1203);
				table_references();
				setState(1204);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPartition_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPartition_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			partition_name();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1209);
				match(T__1);
				setState(1210);
				partition_name();
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_tableContext extends ParserRuleContext {
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public List<Join_right_partContext> join_right_part() {
			return getRuleContexts(Join_right_partContext.class);
		}
		public Join_right_partContext join_right_part(int i) {
			return getRuleContext(Join_right_partContext.class,i);
		}
		public Join_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJoin_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJoin_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJoin_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_tableContext join_table() throws RecognitionException {
		Join_tableContext _localctx = new Join_tableContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			table_factor();
			setState(1220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1217);
					join_right_part();
					}
					} 
				}
				setState(1222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_right_partContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(MySQLParser.K_JOIN, 0); }
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode K_INNER() { return getToken(MySQLParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(MySQLParser.K_CROSS, 0); }
		public TerminalNode K_STRAIGHT_JOIN() { return getToken(MySQLParser.K_STRAIGHT_JOIN, 0); }
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_NATURAL() { return getToken(MySQLParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(MySQLParser.K_LEFT, 0); }
		public TerminalNode K_RIGHT() { return getToken(MySQLParser.K_RIGHT, 0); }
		public TerminalNode K_OUTER() { return getToken(MySQLParser.K_OUTER, 0); }
		public Join_right_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_right_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJoin_right_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJoin_right_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJoin_right_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_right_partContext join_right_part() throws RecognitionException {
		Join_right_partContext _localctx = new Join_right_partContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_right_part);
		int _la;
		try {
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CROSS || _la==K_INNER) {
					{
					setState(1223);
					_la = _input.LA(1);
					if ( !(_la==K_CROSS || _la==K_INNER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1226);
				match(K_JOIN);
				setState(1227);
				table_factor();
				setState(1229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1228);
					join_condition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(K_STRAIGHT_JOIN);
				setState(1232);
				table_factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1233);
				match(K_STRAIGHT_JOIN);
				setState(1234);
				table_factor();
				setState(1235);
				match(K_ON);
				setState(1236);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1238);
				match(K_NATURAL);
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LEFT || _la==K_RIGHT) {
					{
					setState(1239);
					_la = _input.LA(1);
					if ( !(_la==K_LEFT || _la==K_RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1240);
						match(K_OUTER);
						}
					}

					}
				}

				setState(1245);
				match(K_JOIN);
				setState(1246);
				table_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(MySQLParser.K_USING, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_condition);
		try {
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				match(K_ON);
				setState(1250);
				expr(0);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				match(K_USING);
				setState(1252);
				match(T__7);
				setState(1253);
				column_list();
				setState(1254);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_hint_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_hint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			index_hint();
			setState(1263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1259);
					match(T__1);
					setState(1260);
					index_hint();
					}
					} 
				}
				setState(1265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(MySQLParser.K_USE, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public TerminalNode K_FOR() { return getToken(MySQLParser.K_FOR, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode K_JOIN() { return getToken(MySQLParser.K_JOIN, 0); }
		public TerminalNode K_ORDER() { return getToken(MySQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(MySQLParser.K_BY, 0); }
		public TerminalNode K_GROUP() { return getToken(MySQLParser.K_GROUP, 0); }
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_FORCE() { return getToken(MySQLParser.K_FORCE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index_hint);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(K_USE);
				setState(1267);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1268);
					match(K_FOR);
					setState(1274);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1269);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1270);
						match(K_ORDER);
						setState(1271);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1272);
						match(K_GROUP);
						setState(1273);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1278);
				match(T__7);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1279);
					index_list();
					}
				}

				setState(1282);
				match(T__8);
				}
				break;
			case K_IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(K_IGNORE);
				setState(1284);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1285);
					match(K_FOR);
					setState(1291);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1286);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1287);
						match(K_ORDER);
						setState(1288);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1289);
						match(K_GROUP);
						setState(1290);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1295);
				match(T__7);
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1296);
					index_list();
					}
				}

				setState(1299);
				match(T__8);
				}
				break;
			case K_FORCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1300);
				match(K_FORCE);
				setState(1301);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1302);
					match(K_FOR);
					setState(1308);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1303);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1304);
						match(K_ORDER);
						setState(1305);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1306);
						match(K_GROUP);
						setState(1307);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1312);
				match(T__7);
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1313);
					index_list();
					}
				}

				setState(1316);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			index_name();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1320);
				match(T__1);
				setState(1321);
				index_name();
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			column_name();
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1330);
				match(T__1);
				setState(1331);
				column_name();
				}
				}
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
	 
		public Create_definitionContext() { }
		public void copyFrom(Create_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyDefContext extends Create_definitionContext {
		public TerminalNode K_PRIMARY() { return getToken(MySQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(MySQLParser.K_CONSTRAINT, 0); }
		public PrimaryKeyDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterPrimaryKeyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitPrimaryKeyDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitPrimaryKeyDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckDefContext extends Create_definitionContext {
		public TerminalNode K_CHECK() { return getToken(MySQLParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CheckDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCheckDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCheckDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCheckDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnDefContext extends Create_definitionContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public ColumnDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpatialIndexDefContext extends Create_definitionContext {
		public TerminalNode K_SPATIAL() { return getToken(MySQLParser.K_SPATIAL, 0); }
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public SpatialIndexDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSpatialIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSpatialIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSpatialIndexDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullTextIndexDefContext extends Create_definitionContext {
		public TerminalNode K_FULLTEXT() { return getToken(MySQLParser.K_FULLTEXT, 0); }
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public FullTextIndexDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFullTextIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFullTextIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFullTextIndexDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyDefContext extends Create_definitionContext {
		public TerminalNode K_FOREIGN() { return getToken(MySQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(MySQLParser.K_CONSTRAINT, 0); }
		public ForeignKeyDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterForeignKeyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitForeignKeyDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitForeignKeyDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexDefContext extends Create_definitionContext {
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public IndexDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndexDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniqueDefContext extends Create_definitionContext {
		public TerminalNode K_UNIQUE() { return getToken(MySQLParser.K_UNIQUE, 0); }
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(MySQLParser.K_CONSTRAINT, 0); }
		public UniqueDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUniqueDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUniqueDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUniqueDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_definition);
		int _la;
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new ColumnDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				column_name();
				setState(1340);
				column_definition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1342);
						match(K_CONSTRAINT);
						}
					}

					setState(1345);
					symbol();
					}
				}

				setState(1348);
				match(K_PRIMARY);
				setState(1349);
				match(K_KEY);
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1350);
					index_type();
					}
				}

				setState(1353);
				match(T__7);
				setState(1354);
				index_col_name();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1355);
					match(T__1);
					setState(1356);
					index_col_name();
					}
					}
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1362);
				match(T__8);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1363);
					index_option();
					}
					}
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new IndexDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1370);
					index_name();
					}
				}

				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1373);
					index_type();
					}
				}

				setState(1376);
				match(T__7);
				setState(1377);
				index_col_name();
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1378);
					match(T__1);
					setState(1379);
					index_col_name();
					}
					}
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1385);
				match(T__8);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1386);
					index_option();
					}
					}
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new UniqueDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1392);
						match(K_CONSTRAINT);
						}
					}

					setState(1395);
					symbol();
					}
				}

				setState(1398);
				match(K_UNIQUE);
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1399);
					_la = _input.LA(1);
					if ( !(_la==K_INDEX || _la==K_KEY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1402);
					index_name();
					}
				}

				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1405);
					index_type();
					}
				}

				setState(1408);
				match(T__7);
				setState(1409);
				index_col_name();
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1410);
					match(T__1);
					setState(1411);
					index_col_name();
					}
					}
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1417);
				match(T__8);
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1418);
					index_option();
					}
					}
					setState(1423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new FullTextIndexDefContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1424);
				match(K_FULLTEXT);
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1425);
					_la = _input.LA(1);
					if ( !(_la==K_INDEX || _la==K_KEY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1428);
					index_name();
					}
				}

				setState(1431);
				match(T__7);
				setState(1432);
				index_col_name();
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1433);
					match(T__1);
					setState(1434);
					index_col_name();
					}
					}
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1440);
				match(T__8);
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1441);
					index_option();
					}
					}
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new SpatialIndexDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1447);
				match(K_SPATIAL);
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1448);
					_la = _input.LA(1);
					if ( !(_la==K_INDEX || _la==K_KEY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1451);
					index_name();
					}
				}

				setState(1454);
				match(T__7);
				setState(1455);
				index_col_name();
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1456);
					match(T__1);
					setState(1457);
					index_col_name();
					}
					}
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1463);
				match(T__8);
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1464);
					index_option();
					}
					}
					setState(1469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new ForeignKeyDefContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1470);
						match(K_CONSTRAINT);
						}
					}

					setState(1473);
					symbol();
					}
				}

				setState(1476);
				match(K_FOREIGN);
				setState(1477);
				match(K_KEY);
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) {
					{
					setState(1478);
					index_name();
					}
				}

				setState(1481);
				match(T__7);
				setState(1482);
				index_col_name();
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1483);
					match(T__1);
					setState(1484);
					index_col_name();
					}
					}
					setState(1489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1490);
				match(T__8);
				setState(1491);
				reference_definition();
				}
				break;
			case 8:
				_localctx = new CheckDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1493);
				match(K_CHECK);
				setState(1494);
				match(T__7);
				setState(1495);
				expr(0);
				setState(1496);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Column_attributeContext> column_attribute() {
			return getRuleContexts(Column_attributeContext.class);
		}
		public Column_attributeContext column_attribute(int i) {
			return getRuleContext(Column_attributeContext.class,i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			data_type();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AUTO_INCREMENT || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (K_COLLATE - 100)) | (1L << (K_COLUMN - 100)) | (1L << (K_COMMENT - 100)) | (1L << (K_DEFAULT - 100)))) != 0) || _la==K_KEY || ((((_la - 365)) & ~0x3f) == 0 && ((1L << (_la - 365)) & ((1L << (K_NOT - 365)) | (1L << (K_NULL - 365)) | (1L << (K_ON - 365)) | (1L << (K_PRIMARY - 365)) | (1L << (K_REFERENCES - 365)))) != 0) || _la==K_STORAGE || _la==K_UNIQUE) {
				{
				{
				setState(1501);
				column_attribute();
				}
				}
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_attributeContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(MySQLParser.K_NULL, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_AUTO_INCREMENT() { return getToken(MySQLParser.K_AUTO_INCREMENT, 0); }
		public TerminalNode K_UNIQUE() { return getToken(MySQLParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public TerminalNode K_PRIMARY() { return getToken(MySQLParser.K_PRIMARY, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MySQLParser.K_DEFAULT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_COMMENT() { return getToken(MySQLParser.K_COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(MySQLParser.K_COLUMN, 0); }
		public TerminalNode K_FORMAT() { return getToken(MySQLParser.K_FORMAT, 0); }
		public TerminalNode K_FIXED() { return getToken(MySQLParser.K_FIXED, 0); }
		public TerminalNode K_DYNAMIC() { return getToken(MySQLParser.K_DYNAMIC, 0); }
		public TerminalNode K_STORAGE() { return getToken(MySQLParser.K_STORAGE, 0); }
		public TerminalNode K_DISK() { return getToken(MySQLParser.K_DISK, 0); }
		public TerminalNode K_MEMORY() { return getToken(MySQLParser.K_MEMORY, 0); }
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public TerminalNode K_REFERENCES() { return getToken(MySQLParser.K_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_col_nameContext index_col_name() {
			return getRuleContext(Index_col_nameContext.class,0);
		}
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public Column_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumn_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumn_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumn_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_attributeContext column_attribute() throws RecognitionException {
		Column_attributeContext _localctx = new Column_attributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_attribute);
		int _la;
		try {
			int _alt;
			setState(1545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NOT:
			case K_NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1507);
					match(K_NOT);
					}
				}

				setState(1510);
				match(K_NULL);
				}
				break;
			case K_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				match(K_AUTO_INCREMENT);
				}
				break;
			case K_UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1512);
				match(K_UNIQUE);
				setState(1514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1513);
					match(K_KEY);
					}
					break;
				}
				}
				break;
			case K_KEY:
			case K_PRIMARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PRIMARY) {
					{
					setState(1516);
					match(K_PRIMARY);
					}
				}

				setState(1519);
				match(K_KEY);
				}
				break;
			case K_DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1520);
				match(K_DEFAULT);
				setState(1521);
				literal_value();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1522);
				match(K_COMMENT);
				setState(1523);
				string_literal();
				}
				break;
			case K_COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1524);
				match(K_COLUMN);
				setState(1525);
				match(K_FORMAT);
				setState(1526);
				_la = _input.LA(1);
				if ( !(((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (K_DEFAULT - 149)) | (1L << (K_DYNAMIC - 149)) | (1L << (K_FIXED - 149)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_STORAGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1527);
				match(K_STORAGE);
				setState(1528);
				_la = _input.LA(1);
				if ( !(_la==K_DEFAULT || _la==K_DISK || _la==K_MEMORY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_COLLATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1529);
				match(K_COLLATE);
				setState(1530);
				collation_name();
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 10);
				{
				setState(1531);
				match(K_ON);
				setState(1532);
				match(K_UPDATE);
				setState(1533);
				date_literal();
				}
				break;
			case K_REFERENCES:
				enterOuterAlt(_localctx, 11);
				{
				setState(1534);
				match(K_REFERENCES);
				setState(1535);
				table_name();
				setState(1536);
				match(T__7);
				setState(1537);
				index_col_name();
				setState(1538);
				match(T__8);
				setState(1542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1539);
						reference_option();
						}
						} 
					}
					setState(1544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	 
		public Data_typeContext() { }
		public void copyFrom(Data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericTypeContext extends Data_typeContext {
		public TerminalNode K_NUMERIC() { return getToken(MySQLParser.K_NUMERIC, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public NumericTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends Data_typeContext {
		public TerminalNode K_BOOL() { return getToken(MySQLParser.K_BOOL, 0); }
		public BoolTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBinaryTypeContext extends Data_typeContext {
		public TerminalNode K_VARBINARY() { return getToken(MySQLParser.K_VARBINARY, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public VarBinaryTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterVarBinaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitVarBinaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitVarBinaryType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyTextTypeContext extends Data_typeContext {
		public TerminalNode K_TINYTEXT() { return getToken(MySQLParser.K_TINYTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TinyTextTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTinyTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTinyTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTinyTextType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JsonTypeContext extends Data_typeContext {
		public TerminalNode K_JSON() { return getToken(MySQLParser.K_JSON, 0); }
		public JsonTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJsonType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJsonType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJsonType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarcharTypeContext extends Data_typeContext {
		public TerminalNode K_VARCHAR() { return getToken(MySQLParser.K_VARCHAR, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public VarcharTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterVarcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitVarcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitVarcharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongTextTypeContext extends Data_typeContext {
		public TerminalNode K_LONGTEXT() { return getToken(MySQLParser.K_LONGTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public LongTextTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLongTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLongTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLongTextType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntTypeContext extends Data_typeContext {
		public TerminalNode K_BIGINT() { return getToken(MySQLParser.K_BIGINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public BigIntTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBigIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBigIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBigIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeStampTypeContext extends Data_typeContext {
		public TerminalNode K_TIMESTAMP() { return getToken(MySQLParser.K_TIMESTAMP, 0); }
		public TimeStampTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTimeStampType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTimeStampType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTimeStampType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealTypeContext extends Data_typeContext {
		public TerminalNode K_REAL() { return getToken(MySQLParser.K_REAL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public RealTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterRealType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitRealType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends Data_typeContext {
		public TerminalNode K_INT() { return getToken(MySQLParser.K_INT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public IntTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeContext extends Data_typeContext {
		public TerminalNode K_FLOAT() { return getToken(MySQLParser.K_FLOAT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public FloatTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeTypeContext extends Data_typeContext {
		public TerminalNode K_TIME() { return getToken(MySQLParser.K_TIME, 0); }
		public TimeTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongBlobTypeContext extends Data_typeContext {
		public TerminalNode K_LONGBLOB() { return getToken(MySQLParser.K_LONGBLOB, 0); }
		public LongBlobTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLongBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLongBlobType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLongBlobType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyBlobTypeContext extends Data_typeContext {
		public TerminalNode K_TINYBLOB() { return getToken(MySQLParser.K_TINYBLOB, 0); }
		public TinyBlobTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTinyBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTinyBlobType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTinyBlobType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitTypeContext extends Data_typeContext {
		public TerminalNode K_BIT() { return getToken(MySQLParser.K_BIT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public BitTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBitType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTypeContext extends Data_typeContext {
		public List<TerminalNode> K_SET() { return getTokens(MySQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(MySQLParser.K_SET, i);
		}
		public List<String_literalContext> string_literal() {
			return getRuleContexts(String_literalContext.class);
		}
		public String_literalContext string_literal(int i) {
			return getRuleContext(String_literalContext.class,i);
		}
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public SetTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumTypeContext extends Data_typeContext {
		public TerminalNode K_ENUM() { return getToken(MySQLParser.K_ENUM, 0); }
		public List<String_literalContext> string_literal() {
			return getRuleContexts(String_literalContext.class);
		}
		public String_literalContext string_literal(int i) {
			return getRuleContext(String_literalContext.class,i);
		}
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public EnumTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateTypeContext extends Data_typeContext {
		public TerminalNode K_DATE() { return getToken(MySQLParser.K_DATE, 0); }
		public DateTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDateType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDateType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MediumBlobTypeContext extends Data_typeContext {
		public TerminalNode K_MEDIUMBLOB() { return getToken(MySQLParser.K_MEDIUMBLOB, 0); }
		public MediumBlobTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterMediumBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitMediumBlobType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitMediumBlobType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryTypeContext extends Data_typeContext {
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public BinaryTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBinaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBinaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBinaryType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearTypeContext extends Data_typeContext {
		public TerminalNode K_YEAR() { return getToken(MySQLParser.K_YEAR, 0); }
		public YearTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterYearType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitYearType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitYearType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends Data_typeContext {
		public TerminalNode K_BOOLEAN() { return getToken(MySQLParser.K_BOOLEAN, 0); }
		public BooleanTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MediumTextTypeContext extends Data_typeContext {
		public TerminalNode K_MEDIUMTEXT() { return getToken(MySQLParser.K_MEDIUMTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public MediumTextTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterMediumTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitMediumTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitMediumTextType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntTypeContext extends Data_typeContext {
		public TerminalNode K_TINYINT() { return getToken(MySQLParser.K_TINYINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public TinyIntTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTinyIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTinyIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTinyIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextTypeContext extends Data_typeContext {
		public TerminalNode K_TEXT() { return getToken(MySQLParser.K_TEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TextTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTextType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerTypeContext extends Data_typeContext {
		public TerminalNode K_INTEGER() { return getToken(MySQLParser.K_INTEGER, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public IntegerTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntTypeContext extends Data_typeContext {
		public TerminalNode K_SMALLINT() { return getToken(MySQLParser.K_SMALLINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public SmallIntTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSmallIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSmallIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSmallIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateTimeTypeContext extends Data_typeContext {
		public TerminalNode K_DATETIME() { return getToken(MySQLParser.K_DATETIME, 0); }
		public DateTimeTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDateTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDateTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlobTypeContext extends Data_typeContext {
		public TerminalNode K_BLOB() { return getToken(MySQLParser.K_BLOB, 0); }
		public BlobTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBlobType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBlobType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpatialTypeContext extends Data_typeContext {
		public Spatial_typeContext spatial_type() {
			return getRuleContext(Spatial_typeContext.class,0);
		}
		public SpatialTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSpatialType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSpatialType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSpatialType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MediumIntTypeContext extends Data_typeContext {
		public TerminalNode K_MEDIUMINT() { return getToken(MySQLParser.K_MEDIUMINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public MediumIntTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterMediumIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitMediumIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitMediumIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends Data_typeContext {
		public TerminalNode K_DOUBLE() { return getToken(MySQLParser.K_DOUBLE, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public DoubleTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalTypeContext extends Data_typeContext {
		public TerminalNode K_DECIMAL() { return getToken(MySQLParser.K_DECIMAL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public DecimalTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDecimalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDecimalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends Data_typeContext {
		public TerminalNode K_CHAR() { return getToken(MySQLParser.K_CHAR, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public CharTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_data_type);
		int _la;
		try {
			setState(1826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BIT:
				_localctx = new BitTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				match(K_BIT);
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1548);
					match(T__7);
					setState(1549);
					length();
					setState(1550);
					match(T__8);
					}
				}

				}
				break;
			case K_BOOL:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				match(K_BOOL);
				}
				break;
			case K_BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1555);
				match(K_BOOLEAN);
				}
				break;
			case K_TINYINT:
				_localctx = new TinyIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1556);
				match(K_TINYINT);
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1557);
					match(T__7);
					setState(1558);
					length();
					setState(1559);
					match(T__8);
					}
				}

				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1563);
					match(K_UNSIGNED);
					}
				}

				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1566);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_SMALLINT:
				_localctx = new SmallIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1569);
				match(K_SMALLINT);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1570);
					match(T__7);
					setState(1571);
					length();
					setState(1572);
					match(T__8);
					}
				}

				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1576);
					match(K_UNSIGNED);
					}
				}

				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1579);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_MEDIUMINT:
				_localctx = new MediumIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1582);
				match(K_MEDIUMINT);
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1583);
					match(T__7);
					setState(1584);
					length();
					setState(1585);
					match(T__8);
					}
				}

				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1589);
					match(K_UNSIGNED);
					}
				}

				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1592);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1595);
				match(K_INT);
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1596);
					match(T__7);
					setState(1597);
					length();
					setState(1598);
					match(T__8);
					}
				}

				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1602);
					match(K_UNSIGNED);
					}
				}

				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1605);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1608);
				match(K_INTEGER);
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1609);
					match(T__7);
					setState(1610);
					length();
					setState(1611);
					match(T__8);
					}
				}

				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1615);
					match(K_UNSIGNED);
					}
				}

				setState(1619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1618);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_BIGINT:
				_localctx = new BigIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1621);
				match(K_BIGINT);
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1622);
					match(T__7);
					setState(1623);
					length();
					setState(1624);
					match(T__8);
					}
				}

				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1628);
					match(K_UNSIGNED);
					}
				}

				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1631);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_REAL:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1634);
				match(K_REAL);
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1635);
					match(T__7);
					setState(1636);
					length();
					setState(1637);
					match(T__1);
					setState(1638);
					decimals();
					setState(1639);
					match(T__8);
					}
				}

				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1643);
					match(K_UNSIGNED);
					}
				}

				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1646);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DOUBLE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1649);
				match(K_DOUBLE);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1650);
					match(T__7);
					setState(1651);
					length();
					setState(1652);
					match(T__1);
					setState(1653);
					decimals();
					setState(1654);
					match(T__8);
					}
				}

				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1658);
					match(K_UNSIGNED);
					}
				}

				setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1661);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1664);
				match(K_FLOAT);
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1665);
					match(T__7);
					setState(1666);
					length();
					setState(1667);
					match(T__1);
					setState(1668);
					decimals();
					setState(1669);
					match(T__8);
					}
				}

				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1673);
					match(K_UNSIGNED);
					}
				}

				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1676);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1679);
				match(K_DECIMAL);
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1680);
					match(T__7);
					setState(1681);
					length();
					setState(1682);
					match(T__1);
					setState(1683);
					decimals();
					setState(1684);
					match(T__8);
					}
				}

				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1688);
					match(K_UNSIGNED);
					}
				}

				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1691);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_NUMERIC:
				_localctx = new NumericTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1694);
				match(K_NUMERIC);
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1695);
					match(T__7);
					setState(1696);
					length();
					setState(1697);
					match(T__1);
					setState(1698);
					decimals();
					setState(1699);
					match(T__8);
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1703);
					match(K_UNSIGNED);
					}
				}

				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1706);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1709);
				match(K_DATE);
				}
				break;
			case K_TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1710);
				match(K_TIME);
				}
				break;
			case K_TIMESTAMP:
				_localctx = new TimeStampTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1711);
				match(K_TIMESTAMP);
				}
				break;
			case K_DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1712);
				match(K_DATETIME);
				}
				break;
			case K_YEAR:
				_localctx = new YearTypeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1713);
				match(K_YEAR);
				}
				break;
			case K_CHAR:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1714);
				match(K_CHAR);
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1715);
					match(T__7);
					setState(1716);
					length();
					setState(1717);
					match(T__8);
					}
				}

				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1721);
					match(K_BINARY);
					}
				}

				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1724);
					match(K_CHARACTER);
					setState(1725);
					match(K_SET);
					setState(1726);
					charset_name();
					}
				}

				}
				break;
			case K_VARCHAR:
				_localctx = new VarcharTypeContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1729);
				match(K_VARCHAR);
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1730);
					match(T__7);
					setState(1731);
					length();
					setState(1732);
					match(T__8);
					}
				}

				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1736);
					match(K_BINARY);
					}
				}

				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1739);
					match(K_CHARACTER);
					setState(1740);
					match(K_SET);
					setState(1741);
					charset_name();
					}
				}

				}
				break;
			case K_BINARY:
				_localctx = new BinaryTypeContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1744);
				match(K_BINARY);
				setState(1749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1745);
					match(T__7);
					setState(1746);
					length();
					setState(1747);
					match(T__8);
					}
				}

				}
				break;
			case K_VARBINARY:
				_localctx = new VarBinaryTypeContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1751);
				match(K_VARBINARY);
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1752);
					match(T__7);
					setState(1753);
					length();
					setState(1754);
					match(T__8);
					}
				}

				}
				break;
			case K_TINYBLOB:
				_localctx = new TinyBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1758);
				match(K_TINYBLOB);
				}
				break;
			case K_BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1759);
				match(K_BLOB);
				}
				break;
			case K_MEDIUMBLOB:
				_localctx = new MediumBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(1760);
				match(K_MEDIUMBLOB);
				}
				break;
			case K_LONGBLOB:
				_localctx = new LongBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(1761);
				match(K_LONGBLOB);
				}
				break;
			case K_TINYTEXT:
				_localctx = new TinyTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(1762);
				match(K_TINYTEXT);
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1763);
					match(K_BINARY);
					}
				}

				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1766);
					match(K_CHARACTER);
					setState(1767);
					match(K_SET);
					setState(1768);
					charset_name();
					}
				}

				}
				break;
			case K_TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(1771);
				match(K_TEXT);
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1772);
					match(K_BINARY);
					}
				}

				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1775);
					match(K_CHARACTER);
					setState(1776);
					match(K_SET);
					setState(1777);
					charset_name();
					}
				}

				}
				break;
			case K_MEDIUMTEXT:
				_localctx = new MediumTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(1780);
				match(K_MEDIUMTEXT);
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1781);
					match(K_BINARY);
					}
				}

				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1784);
					match(K_CHARACTER);
					setState(1785);
					match(K_SET);
					setState(1786);
					charset_name();
					}
				}

				}
				break;
			case K_LONGTEXT:
				_localctx = new LongTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(1789);
				match(K_LONGTEXT);
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1790);
					match(K_BINARY);
					}
				}

				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1793);
					match(K_CHARACTER);
					setState(1794);
					match(K_SET);
					setState(1795);
					charset_name();
					}
				}

				}
				break;
			case K_ENUM:
				_localctx = new EnumTypeContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(1798);
				match(K_ENUM);
				setState(1799);
				match(T__7);
				setState(1800);
				string_literal();
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1801);
					match(T__1);
					setState(1802);
					string_literal();
					}
				}

				setState(1805);
				match(T__8);
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1806);
					match(K_CHARACTER);
					setState(1807);
					match(K_SET);
					setState(1808);
					charset_name();
					}
				}

				}
				break;
			case K_SET:
				_localctx = new SetTypeContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(1811);
				match(K_SET);
				setState(1812);
				match(T__7);
				setState(1813);
				string_literal();
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1814);
					match(T__1);
					setState(1815);
					string_literal();
					}
				}

				setState(1818);
				match(T__8);
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1819);
					match(K_CHARACTER);
					setState(1820);
					match(K_SET);
					setState(1821);
					charset_name();
					}
				}

				}
				break;
			case K_JSON:
				_localctx = new JsonTypeContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(1824);
				match(K_JSON);
				}
				break;
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_LINESTRING:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_POINT:
			case K_POLYGON:
				_localctx = new SpatialTypeContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(1825);
				spatial_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spatial_typeContext extends ParserRuleContext {
		public TerminalNode K_POLYGON() { return getToken(MySQLParser.K_POLYGON, 0); }
		public TerminalNode K_GEOMETRY() { return getToken(MySQLParser.K_GEOMETRY, 0); }
		public TerminalNode K_POINT() { return getToken(MySQLParser.K_POINT, 0); }
		public TerminalNode K_LINESTRING() { return getToken(MySQLParser.K_LINESTRING, 0); }
		public TerminalNode K_MULTIPOINT() { return getToken(MySQLParser.K_MULTIPOINT, 0); }
		public TerminalNode K_MULTILINESTRING() { return getToken(MySQLParser.K_MULTILINESTRING, 0); }
		public TerminalNode K_MULTIPOLYGON() { return getToken(MySQLParser.K_MULTIPOLYGON, 0); }
		public TerminalNode K_GEOMETRYCOLLECTION() { return getToken(MySQLParser.K_GEOMETRYCOLLECTION, 0); }
		public Spatial_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSpatial_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSpatial_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSpatial_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spatial_typeContext spatial_type() throws RecognitionException {
		Spatial_typeContext _localctx = new Spatial_typeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_spatial_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			_la = _input.LA(1);
			if ( !(_la==K_GEOMETRY || _la==K_GEOMETRYCOLLECTION || ((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (K_LINESTRING - 289)) | (1L << (K_MULTILINESTRING - 289)) | (1L << (K_MULTIPOINT - 289)) | (1L << (K_MULTIPOLYGON - 289)))) != 0) || _la==K_POINT || _la==K_POLYGON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_col_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(MySQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(MySQLParser.K_DESC, 0); }
		public Index_col_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_col_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_col_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_col_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_col_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_col_nameContext index_col_name() throws RecognitionException {
		Index_col_nameContext _localctx = new Index_col_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_index_col_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			column_name();
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1831);
				match(T__7);
				setState(1832);
				length();
				setState(1833);
				match(T__8);
				}
			}

			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1837);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode K_USING() { return getToken(MySQLParser.K_USING, 0); }
		public TerminalNode K_BTREE() { return getToken(MySQLParser.K_BTREE, 0); }
		public TerminalNode K_HASH() { return getToken(MySQLParser.K_HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(K_USING);
			setState(1841);
			_la = _input.LA(1);
			if ( !(_la==K_BTREE || _la==K_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public TerminalNode K_KEY_BLOCK_SIZE() { return getToken(MySQLParser.K_KEY_BLOCK_SIZE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(MySQLParser.K_WITH, 0); }
		public TerminalNode K_PARSER() { return getToken(MySQLParser.K_PARSER, 0); }
		public Parser_nameContext parser_name() {
			return getRuleContext(Parser_nameContext.class,0);
		}
		public TerminalNode K_COMMENT() { return getToken(MySQLParser.K_COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_index_option);
		int _la;
		try {
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1843);
				match(K_KEY_BLOCK_SIZE);
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1844);
					match(T__2);
					}
				}

				setState(1847);
				value();
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1848);
				index_type();
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1849);
				match(K_WITH);
				setState(1850);
				match(K_PARSER);
				setState(1851);
				parser_name();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1852);
				match(K_COMMENT);
				setState(1853);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(MySQLParser.K_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Index_col_nameContext> index_col_name() {
			return getRuleContexts(Index_col_nameContext.class);
		}
		public Index_col_nameContext index_col_name(int i) {
			return getRuleContext(Index_col_nameContext.class,i);
		}
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitReference_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitReference_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(K_REFERENCES);
			setState(1857);
			table_name();
			setState(1858);
			match(T__7);
			setState(1859);
			index_col_name();
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1860);
				match(T__1);
				setState(1861);
				index_col_name();
				}
				}
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1867);
			match(T__8);
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1868);
				reference_option();
				}
				}
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode K_MATCH() { return getToken(MySQLParser.K_MATCH, 0); }
		public TerminalNode K_FULL() { return getToken(MySQLParser.K_FULL, 0); }
		public TerminalNode K_PARTIAL() { return getToken(MySQLParser.K_PARTIAL, 0); }
		public TerminalNode K_SIMPLE() { return getToken(MySQLParser.K_SIMPLE, 0); }
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public TerminalNode K_DELETE() { return getToken(MySQLParser.K_DELETE, 0); }
		public On_delete_actionContext on_delete_action() {
			return getRuleContext(On_delete_actionContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public On_update_actionContext on_update_action() {
			return getRuleContext(On_update_actionContext.class,0);
		}
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitReference_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitReference_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_reference_option);
		int _la;
		try {
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				match(K_MATCH);
				setState(1875);
				_la = _input.LA(1);
				if ( !(_la==K_FULL || _la==K_PARTIAL || _la==K_SIMPLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				match(K_ON);
				setState(1877);
				match(K_DELETE);
				setState(1878);
				on_delete_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				match(K_ON);
				setState(1880);
				match(K_UPDATE);
				setState(1881);
				on_update_action();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_delete_actionContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public On_delete_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_delete_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterOn_delete_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitOn_delete_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitOn_delete_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_delete_actionContext on_delete_action() throws RecognitionException {
		On_delete_actionContext _localctx = new On_delete_actionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_on_delete_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_update_actionContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public On_update_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_update_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterOn_update_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitOn_update_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitOn_update_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_update_actionContext on_update_action() throws RecognitionException {
		On_update_actionContext _localctx = new On_update_actionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_on_update_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode K_RESTRICT() { return getToken(MySQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(MySQLParser.K_CASCADE, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(MySQLParser.K_NULL, 0); }
		public TerminalNode K_NO() { return getToken(MySQLParser.K_NO, 0); }
		public TerminalNode K_ACTION() { return getToken(MySQLParser.K_ACTION, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_action);
		try {
			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888);
				match(K_RESTRICT);
				}
				break;
			case K_CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				match(K_CASCADE);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1890);
				match(K_SET);
				setState(1891);
				match(K_NULL);
				}
				break;
			case K_NO:
				enterOuterAlt(_localctx, 4);
				{
				setState(1892);
				match(K_NO);
				setState(1893);
				match(K_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionsContext extends ParserRuleContext {
		public List<Table_optionContext> table_option() {
			return getRuleContexts(Table_optionContext.class);
		}
		public Table_optionContext table_option(int i) {
			return getRuleContext(Table_optionContext.class,i);
		}
		public Table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_optionsContext table_options() throws RecognitionException {
		Table_optionsContext _localctx = new Table_optionsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			table_option();
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << K_AUTO_INCREMENT) | (1L << K_AVG_ROW_LENGTH))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_CHARACTER - 90)) | (1L << (K_CHARSET - 90)) | (1L << (K_CHECKSUM - 90)) | (1L << (K_COLLATE - 90)) | (1L << (K_COMMENT - 90)) | (1L << (K_CONNECTION - 90)) | (1L << (K_DATA - 90)) | (1L << (K_DEFAULT - 90)) | (1L << (K_DELAY_KEY_WRITE - 90)))) != 0) || _la==K_ENGINE || _la==K_INDEX || _la==K_INSERT_METHOD || _la==K_KEY_BLOCK_SIZE || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (K_MAX_ROWS - 325)) | (1L << (K_MIN_ROWS - 325)) | (1L << (K_PACK_KEYS - 325)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 612)) & ~0x3f) == 0 && ((1L << (_la - 612)) & ((1L << (K_STATS_AUTO_RECALC - 612)) | (1L << (K_STATS_PERSISTENT - 612)) | (1L << (K_STATS_SAMPLE_PAGES - 612)))) != 0)) {
				{
				{
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1897);
					match(T__1);
					}
				}

				setState(1900);
				table_option();
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionContext extends ParserRuleContext {
		public TerminalNode K_ENGINE() { return getToken(MySQLParser.K_ENGINE, 0); }
		public Engine_nameContext engine_name() {
			return getRuleContext(Engine_nameContext.class,0);
		}
		public TerminalNode K_AUTO_INCREMENT() { return getToken(MySQLParser.K_AUTO_INCREMENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode K_AVG_ROW_LENGTH() { return getToken(MySQLParser.K_AVG_ROW_LENGTH, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public TerminalNode K_CHARSET() { return getToken(MySQLParser.K_CHARSET, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MySQLParser.K_DEFAULT, 0); }
		public TerminalNode K_CHECKSUM() { return getToken(MySQLParser.K_CHECKSUM, 0); }
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COMMENT() { return getToken(MySQLParser.K_COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode K_CONNECTION() { return getToken(MySQLParser.K_CONNECTION, 0); }
		public TerminalNode K_DATA() { return getToken(MySQLParser.K_DATA, 0); }
		public TerminalNode K_DIRECTORY() { return getToken(MySQLParser.K_DIRECTORY, 0); }
		public TerminalNode K_DELAY_KEY_WRITE() { return getToken(MySQLParser.K_DELAY_KEY_WRITE, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_INSERT_METHOD() { return getToken(MySQLParser.K_INSERT_METHOD, 0); }
		public TerminalNode K_NO() { return getToken(MySQLParser.K_NO, 0); }
		public TerminalNode K_FIRST() { return getToken(MySQLParser.K_FIRST, 0); }
		public TerminalNode K_LAST() { return getToken(MySQLParser.K_LAST, 0); }
		public TerminalNode K_KEY_BLOCK_SIZE() { return getToken(MySQLParser.K_KEY_BLOCK_SIZE, 0); }
		public TerminalNode K_MAX_ROWS() { return getToken(MySQLParser.K_MAX_ROWS, 0); }
		public TerminalNode K_MIN_ROWS() { return getToken(MySQLParser.K_MIN_ROWS, 0); }
		public TerminalNode K_PACK_KEYS() { return getToken(MySQLParser.K_PACK_KEYS, 0); }
		public TerminalNode K_PASSWORD() { return getToken(MySQLParser.K_PASSWORD, 0); }
		public TerminalNode K_ROW_FORMAT() { return getToken(MySQLParser.K_ROW_FORMAT, 0); }
		public TerminalNode K_DYNAMIC() { return getToken(MySQLParser.K_DYNAMIC, 0); }
		public TerminalNode K_FIXED() { return getToken(MySQLParser.K_FIXED, 0); }
		public TerminalNode K_COMPRESSED() { return getToken(MySQLParser.K_COMPRESSED, 0); }
		public TerminalNode K_REDUNDANT() { return getToken(MySQLParser.K_REDUNDANT, 0); }
		public TerminalNode K_COMPACT() { return getToken(MySQLParser.K_COMPACT, 0); }
		public TerminalNode K_STATS_AUTO_RECALC() { return getToken(MySQLParser.K_STATS_AUTO_RECALC, 0); }
		public TerminalNode K_STATS_PERSISTENT() { return getToken(MySQLParser.K_STATS_PERSISTENT, 0); }
		public TerminalNode K_STATS_SAMPLE_PAGES() { return getToken(MySQLParser.K_STATS_SAMPLE_PAGES, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(MySQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_STORAGE() { return getToken(MySQLParser.K_STORAGE, 0); }
		public TerminalNode K_DISK() { return getToken(MySQLParser.K_DISK, 0); }
		public TerminalNode K_MEMORY() { return getToken(MySQLParser.K_MEMORY, 0); }
		public TerminalNode K_UNION() { return getToken(MySQLParser.K_UNION, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public Table_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_optionContext table_option() throws RecognitionException {
		Table_optionContext _localctx = new Table_optionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_option);
		int _la;
		try {
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1906);
				match(K_ENGINE);
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1907);
					match(T__2);
					}
				}

				setState(1910);
				engine_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				match(K_AUTO_INCREMENT);
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1912);
					match(T__2);
					}
				}

				setState(1915);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1916);
				match(K_AVG_ROW_LENGTH);
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1917);
					match(T__2);
					}
				}

				setState(1920);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1921);
					match(K_DEFAULT);
					}
				}

				setState(1927);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_CHARACTER:
					{
					setState(1924);
					match(K_CHARACTER);
					setState(1925);
					match(K_SET);
					}
					break;
				case K_CHARSET:
					{
					setState(1926);
					match(K_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1929);
					match(T__2);
					}
				}

				setState(1932);
				charset_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1933);
				match(K_CHECKSUM);
				setState(1934);
				match(T__2);
				{
				setState(1935);
				value();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1936);
					match(K_DEFAULT);
					}
				}

				setState(1939);
				match(K_COLLATE);
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1940);
					match(T__2);
					}
				}

				setState(1943);
				collation_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1944);
				match(K_COMMENT);
				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1945);
					match(T__2);
					}
				}

				setState(1948);
				string_literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1949);
				match(K_CONNECTION);
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1950);
					match(T__2);
					}
				}

				setState(1953);
				string_literal();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1954);
				match(K_DATA);
				setState(1955);
				match(K_DIRECTORY);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1956);
					match(T__2);
					}
				}

				setState(1959);
				string_literal();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1960);
				match(K_DELAY_KEY_WRITE);
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1961);
					match(T__2);
					}
				}

				{
				setState(1964);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1965);
				match(K_INDEX);
				setState(1966);
				match(K_DIRECTORY);
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1967);
					match(T__2);
					}
				}

				setState(1970);
				string_literal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1971);
				match(K_INSERT_METHOD);
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1972);
					match(T__2);
					}
				}

				setState(1975);
				_la = _input.LA(1);
				if ( !(_la==K_FIRST || _la==K_LAST || _la==K_NO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1976);
				match(K_KEY_BLOCK_SIZE);
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1977);
					match(T__2);
					}
				}

				setState(1980);
				value();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1981);
				match(K_MAX_ROWS);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1982);
					match(T__2);
					}
				}

				setState(1985);
				value();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1986);
				match(K_MIN_ROWS);
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1987);
					match(T__2);
					}
				}

				setState(1990);
				value();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1991);
				match(K_PACK_KEYS);
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1992);
					match(T__2);
					}
				}

				setState(1997);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(1995);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(1996);
					match(K_DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1999);
				match(K_PASSWORD);
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2000);
					match(T__2);
					}
				}

				setState(2003);
				string_literal();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2004);
				match(K_ROW_FORMAT);
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2005);
					match(T__2);
					}
				}

				setState(2008);
				_la = _input.LA(1);
				if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_COMPACT - 108)) | (1L << (K_COMPRESSED - 108)) | (1L << (K_DEFAULT - 108)) | (1L << (K_DYNAMIC - 108)))) != 0) || _la==K_FIXED || _la==K_REDUNDANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2009);
				match(K_STATS_AUTO_RECALC);
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2010);
					match(T__2);
					}
				}

				setState(2015);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(2013);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(2014);
					match(K_DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2017);
				match(K_STATS_PERSISTENT);
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2018);
					match(T__2);
					}
				}

				setState(2023);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(2021);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(2022);
					match(K_DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2025);
				match(K_STATS_SAMPLE_PAGES);
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2026);
					match(T__2);
					}
				}

				setState(2029);
				value();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2030);
				match(K_TABLESPACE);
				setState(2031);
				tablespace_name();
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_STORAGE) {
					{
					setState(2032);
					match(K_STORAGE);
					setState(2033);
					_la = _input.LA(1);
					if ( !(_la==K_DEFAULT || _la==K_DISK || _la==K_MEMORY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2036);
				match(K_UNION);
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2037);
					match(T__2);
					}
				}

				setState(2040);
				match(T__7);
				setState(2041);
				table_name();
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2042);
					match(T__1);
					setState(2043);
					table_name();
					}
					}
					setState(2048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2049);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCharset_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCharset_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_charset_name);
		try {
			setState(2055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2054);
				string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_collation_name);
		try {
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2057);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Engine_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Engine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterEngine_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitEngine_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitEngine_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Engine_nameContext engine_name() throws RecognitionException {
		Engine_nameContext _localctx = new Engine_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_engine_name);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2061);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2062);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
				keyword();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parser_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Parser_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterParser_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitParser_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitParser_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parser_nameContext parser_name() throws RecognitionException {
		Parser_nameContext _localctx = new Parser_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_parser_name);
		try {
			setState(2068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2066);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2067);
				string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_function_name);
		try {
			setState(2072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2070);
				identifier();
				}
				break;
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastContext extends ExprContext {
		public Cast_exprContext cast_expr() {
			return getRuleContext(Cast_exprContext.class,0);
		}
		public CastContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_OR() { return getToken(MySQLParser.K_OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(MySQLParser.K_AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitExprContext extends ExprContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public BitExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExprContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public Is_exprContext is_expr() {
			return getRuleContext(Is_exprContext.class,0);
		}
		public Like_exprContext like_expr() {
			return getRuleContext(Like_exprContext.class,0);
		}
		public Regexp_exprContext regexp_expr() {
			return getRuleContext(Regexp_exprContext.class,0);
		}
		public In_exprContext in_expr() {
			return getRuleContext(In_exprContext.class,0);
		}
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseBetweenContext extends ExprContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Between_exprContext between_expr() {
			return getRuleContext(Between_exprContext.class,0);
		}
		public CaseBetweenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCaseBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCaseBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCaseBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_XOR() { return getToken(MySQLParser.K_XOR, 0); }
		public XorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				_localctx = new CompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2077);
					comparison_expr();
					}
					break;
				case 2:
					{
					setState(2078);
					is_expr();
					}
					break;
				case 3:
					{
					setState(2079);
					like_expr();
					}
					break;
				case 4:
					{
					setState(2080);
					regexp_expr();
					}
					break;
				case 5:
					{
					setState(2081);
					in_expr();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new CaseBetweenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2084);
					case_expr();
					}
					break;
				case 2:
					{
					setState(2085);
					between_expr();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2088);
				cast_expr();
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2089);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==K_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2090);
				expr(5);
				}
				break;
			case 5:
				{
				_localctx = new BitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2091);
				bit_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2094);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2095);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==K_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2096);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2097);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2098);
						match(K_XOR);
						setState(2099);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2101);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==K_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2102);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cast_exprContext extends ParserRuleContext {
		public TerminalNode K_CAST() { return getToken(MySQLParser.K_CAST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_exprContext cast_expr() throws RecognitionException {
		Cast_exprContext _localctx = new Cast_exprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			match(K_CAST);
			setState(2109);
			match(T__7);
			setState(2110);
			expr(0);
			setState(2111);
			match(K_AS);
			setState(2112);
			data_type();
			setState(2113);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_exprContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode K_BETWEEN() { return getToken(MySQLParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(MySQLParser.K_AND, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public Between_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBetween_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBetween_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBetween_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_exprContext between_expr() throws RecognitionException {
		Between_exprContext _localctx = new Between_exprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_between_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			bit_expr(0);
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2116);
				match(K_NOT);
				}
			}

			setState(2119);
			match(K_BETWEEN);
			setState(2120);
			bit_expr(0);
			setState(2121);
			match(K_AND);
			setState(2122);
			bit_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_exprContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(MySQLParser.K_ALL, 0); }
		public TerminalNode K_ANY() { return getToken(MySQLParser.K_ANY, 0); }
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterComparison_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitComparison_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitComparison_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_comparison_expr);
		int _la;
		try {
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				bit_expr(0);
				setState(2125);
				comparison_operator();
				setState(2126);
				bit_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				bit_expr(0);
				setState(2129);
				comparison_operator();
				setState(2130);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_ANY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2131);
				match(T__7);
				setState(2132);
				select_query(0);
				setState(2133);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_exprContext extends ParserRuleContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(MySQLParser.K_IN, 0); }
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public In_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_exprContext in_expr() throws RecognitionException {
		In_exprContext _localctx = new In_exprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_in_expr);
		int _la;
		try {
			setState(2159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				bit_expr(0);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2138);
					match(K_NOT);
					}
				}

				setState(2141);
				match(K_IN);
				setState(2142);
				match(T__7);
				setState(2143);
				select_query(0);
				setState(2144);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2146);
				bit_expr(0);
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2147);
					match(K_NOT);
					}
				}

				setState(2150);
				match(K_IN);
				setState(2151);
				match(T__7);
				setState(2152);
				expr(0);
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2153);
					match(T__1);
					setState(2154);
					expr(0);
					}
				}

				setState(2157);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Regexp_exprContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode K_REGEXP() { return getToken(MySQLParser.K_REGEXP, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public Regexp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterRegexp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitRegexp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitRegexp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regexp_exprContext regexp_expr() throws RecognitionException {
		Regexp_exprContext _localctx = new Regexp_exprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_regexp_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			bit_expr(0);
			setState(2163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2162);
				match(K_NOT);
				}
			}

			setState(2165);
			match(K_REGEXP);
			setState(2166);
			bit_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_exprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(MySQLParser.K_IS, 0); }
		public TerminalNode K_TRUE() { return getToken(MySQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(MySQLParser.K_FALSE, 0); }
		public TerminalNode K_UNKNOWN() { return getToken(MySQLParser.K_UNKNOWN, 0); }
		public TerminalNode K_NULL() { return getToken(MySQLParser.K_NULL, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public Is_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIs_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIs_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIs_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_exprContext is_expr() throws RecognitionException {
		Is_exprContext _localctx = new Is_exprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_is_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			simple_expr(0);
			setState(2171);
			match(K_IS);
			setState(2173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2172);
				match(K_NOT);
				}
			}

			setState(2175);
			_la = _input.LA(1);
			if ( !(_la==K_FALSE || _la==K_NULL || _la==K_TRUE || _la==K_UNKNOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Like_exprContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode K_SOUNDS() { return getToken(MySQLParser.K_SOUNDS, 0); }
		public TerminalNode K_LIKE() { return getToken(MySQLParser.K_LIKE, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(MySQLParser.K_ESCAPE, 0); }
		public Like_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLike_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLike_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLike_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Like_exprContext like_expr() throws RecognitionException {
		Like_exprContext _localctx = new Like_exprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_like_expr);
		int _la;
		try {
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				bit_expr(0);
				setState(2178);
				match(K_SOUNDS);
				setState(2179);
				match(K_LIKE);
				setState(2180);
				bit_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				bit_expr(0);
				setState(2184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2183);
					match(K_NOT);
					}
				}

				setState(2186);
				match(K_LIKE);
				setState(2187);
				simple_expr(0);
				setState(2190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2188);
					match(K_ESCAPE);
					setState(2189);
					simple_expr(0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		return bit_expr(0);
	}

	private Bit_exprContext bit_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, _parentState);
		Bit_exprContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_bit_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2195);
			simple_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
					case 1:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2198);
						match(T__22);
						setState(2199);
						bit_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2201);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2202);
						bit_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2204);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2205);
						bit_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2207);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2208);
						bit_expr(5);
						}
						break;
					case 5:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2210);
						match(T__31);
						setState(2211);
						bit_expr(4);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2213);
						match(T__32);
						setState(2214);
						bit_expr(3);
						}
						break;
					}
					} 
				}
				setState(2219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public User_var_nameContext user_var_name() {
			return getRuleContext(User_var_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_queryContext select_query() {
			return getRuleContext(Select_queryContext.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode K_ROW() { return getToken(MySQLParser.K_ROW, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		return simple_expr(0);
	}

	private Simple_exprContext simple_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, _parentState);
		Simple_exprContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_simple_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2221);
				literal_value();
				}
				break;
			case 2:
				{
				setState(2222);
				function_call();
				}
				break;
			case 3:
				{
				setState(2223);
				var_name();
				}
				break;
			case 4:
				{
				setState(2224);
				user_var_name();
				}
				break;
			case 5:
				{
				setState(2228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2225);
					table_name();
					setState(2226);
					match(T__33);
					}
					break;
				}
				setState(2230);
				column_name();
				}
				break;
			case 6:
				{
				setState(2231);
				match(T__34);
				}
				break;
			case 7:
				{
				setState(2232);
				match(T__7);
				setState(2233);
				expr(0);
				setState(2236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2234);
					match(T__1);
					setState(2235);
					expr(0);
					}
				}

				setState(2238);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(2240);
				match(T__7);
				setState(2241);
				select_query(0);
				setState(2242);
				match(T__8);
				}
				break;
			case 9:
				{
				setState(2244);
				interval_expr();
				}
				break;
			case 10:
				{
				{
				setState(2245);
				match(K_BINARY);
				setState(2246);
				simple_expr(0);
				}
				}
				break;
			case 11:
				{
				setState(2247);
				match(T__12);
				setState(2248);
				simple_expr(5);
				}
				break;
			case 12:
				{
				setState(2249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__35))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2250);
				simple_expr(4);
				}
				break;
			case 13:
				{
				setState(2251);
				match(K_ROW);
				setState(2252);
				match(T__7);
				setState(2253);
				expr(0);
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2254);
					match(T__1);
					setState(2255);
					expr(0);
					}
				}

				setState(2258);
				match(T__8);
				}
				break;
			case 14:
				{
				setState(2260);
				match(K_EXISTS);
				setState(2261);
				match(T__7);
				setState(2262);
				select_query(0);
				setState(2263);
				match(T__8);
				}
				break;
			case 15:
				{
				setState(2265);
				match(T__10);
				setState(2266);
				identifier();
				setState(2267);
				expr(0);
				setState(2268);
				match(T__11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Simple_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
					setState(2272);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(2273);
					match(K_COLLATE);
					setState(2274);
					collation_name();
					}
					} 
				}
				setState(2279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(MySQLParser.K_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_WHEN() { return getTokens(MySQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(MySQLParser.K_WHEN, i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(MySQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(MySQLParser.K_THEN, i);
		}
		public TerminalNode K_END() { return getToken(MySQLParser.K_END, 0); }
		public TerminalNode K_ELSE() { return getToken(MySQLParser.K_ELSE, 0); }
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCase_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCase_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_case_expr);
		int _la;
		try {
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2280);
				match(K_CASE);
				setState(2281);
				expr(0);
				setState(2282);
				match(K_WHEN);
				setState(2283);
				literal_value();
				setState(2284);
				match(K_THEN);
				setState(2285);
				expr(0);
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_WHEN) {
					{
					{
					setState(2286);
					match(K_WHEN);
					setState(2287);
					literal_value();
					setState(2288);
					match(K_THEN);
					setState(2289);
					expr(0);
					}
					}
					setState(2295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(2296);
					match(K_ELSE);
					setState(2297);
					expr(0);
					}
				}

				setState(2300);
				match(K_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2302);
				match(K_CASE);
				setState(2303);
				match(K_WHEN);
				setState(2304);
				expr(0);
				setState(2305);
				match(K_THEN);
				setState(2306);
				expr(0);
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_WHEN) {
					{
					{
					setState(2307);
					match(K_WHEN);
					setState(2308);
					expr(0);
					setState(2309);
					match(K_THEN);
					setState(2310);
					expr(0);
					}
					}
					setState(2316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(2317);
					match(K_ELSE);
					setState(2318);
					expr(0);
					}
				}

				setState(2321);
				match(K_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_function_call);
		int _la;
		try {
			setState(2341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				function_name();
				setState(2326);
				match(T__7);
				setState(2327);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2329);
				function_name();
				setState(2330);
				match(T__7);
				setState(2331);
				expr(0);
				setState(2336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2332);
					match(T__1);
					setState(2333);
					expr(0);
					}
					}
					setState(2338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2339);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_exprContext extends ParserRuleContext {
		public TerminalNode K_INTERVAL() { return getToken(MySQLParser.K_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Time_unitContext time_unit() {
			return getRuleContext(Time_unitContext.class,0);
		}
		public Interval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInterval_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInterval_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInterval_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_exprContext interval_expr() throws RecognitionException {
		Interval_exprContext _localctx = new Interval_exprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			match(K_INTERVAL);
			setState(2344);
			expr(0);
			setState(2345);
			time_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_unitContext extends ParserRuleContext {
		public TerminalNode K_MICROSECOND() { return getToken(MySQLParser.K_MICROSECOND, 0); }
		public TerminalNode K_SECOND() { return getToken(MySQLParser.K_SECOND, 0); }
		public TerminalNode K_MINUTE() { return getToken(MySQLParser.K_MINUTE, 0); }
		public TerminalNode K_HOUR() { return getToken(MySQLParser.K_HOUR, 0); }
		public TerminalNode K_DAY() { return getToken(MySQLParser.K_DAY, 0); }
		public TerminalNode K_WEEK() { return getToken(MySQLParser.K_WEEK, 0); }
		public TerminalNode K_MONTH() { return getToken(MySQLParser.K_MONTH, 0); }
		public TerminalNode K_QUARTER() { return getToken(MySQLParser.K_QUARTER, 0); }
		public TerminalNode K_YEAR() { return getToken(MySQLParser.K_YEAR, 0); }
		public TerminalNode K_SECOND_MICROSECOND() { return getToken(MySQLParser.K_SECOND_MICROSECOND, 0); }
		public TerminalNode K_MINUTE_MICROSECOND() { return getToken(MySQLParser.K_MINUTE_MICROSECOND, 0); }
		public TerminalNode K_MINUTE_SECOND() { return getToken(MySQLParser.K_MINUTE_SECOND, 0); }
		public TerminalNode K_HOUR_MICROSECOND() { return getToken(MySQLParser.K_HOUR_MICROSECOND, 0); }
		public TerminalNode K_HOUR_MINUTE() { return getToken(MySQLParser.K_HOUR_MINUTE, 0); }
		public TerminalNode K_HOUR_SECOND() { return getToken(MySQLParser.K_HOUR_SECOND, 0); }
		public TerminalNode K_DAY_MICROSECOND() { return getToken(MySQLParser.K_DAY_MICROSECOND, 0); }
		public TerminalNode K_DAY_SECOND() { return getToken(MySQLParser.K_DAY_SECOND, 0); }
		public TerminalNode K_DAY_MINUTE() { return getToken(MySQLParser.K_DAY_MINUTE, 0); }
		public TerminalNode K_DAY_HOUR() { return getToken(MySQLParser.K_DAY_HOUR, 0); }
		public TerminalNode K_YEAR_MONTH() { return getToken(MySQLParser.K_YEAR_MONTH, 0); }
		public Time_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTime_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTime_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTime_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_unitContext time_unit() throws RecognitionException {
		Time_unitContext _localctx = new Time_unitContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_time_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			_la = _input.LA(1);
			if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_DAY - 140)) | (1L << (K_DAY_HOUR - 140)) | (1L << (K_DAY_MICROSECOND - 140)) | (1L << (K_DAY_MINUTE - 140)) | (1L << (K_DAY_SECOND - 140)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (K_HOUR - 232)) | (1L << (K_HOUR_MICROSECOND - 232)) | (1L << (K_HOUR_MINUTE - 232)) | (1L << (K_HOUR_SECOND - 232)))) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & ((1L << (K_MICROSECOND - 336)) | (1L << (K_MINUTE - 336)) | (1L << (K_MINUTE_MICROSECOND - 336)) | (1L << (K_MINUTE_SECOND - 336)) | (1L << (K_MONTH - 336)))) != 0) || ((((_la - 413)) & ~0x3f) == 0 && ((1L << (_la - 413)) & ((1L << (K_QUARTER - 413)) | (1L << (K_SECOND - 413)) | (1L << (K_SECOND_MICROSECOND - 413)))) != 0) || ((((_la - 593)) & ~0x3f) == 0 && ((1L << (_la - 593)) & ((1L << (K_WEEK - 593)) | (1L << (K_YEAR - 593)) | (1L << (K_YEAR_MONTH - 593)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	 
		public Literal_valueContext() { }
		public void copyFrom(Literal_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullContext extends Literal_valueContext {
		public TerminalNode K_NULL() { return getToken(MySQLParser.K_NULL, 0); }
		public NullContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends Literal_valueContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public NumberContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends Literal_valueContext {
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public HexContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends Literal_valueContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public StringContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends Literal_valueContext {
		public TerminalNode K_TRUE() { return getToken(MySQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(MySQLParser.K_FALSE, 0); }
		public BooleanContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitContext extends Literal_valueContext {
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public BitContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateContext extends Literal_valueContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public DateContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_literal_value);
		int _la;
		try {
			setState(2356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				numeric_literal();
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				string_literal();
				}
				break;
			case 3:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2351);
				date_literal();
				}
				break;
			case 4:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2352);
				match(K_NULL);
				}
				break;
			case 5:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2353);
				_la = _input.LA(1);
				if ( !(_la==K_FALSE || _la==K_TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2354);
				hex_literal();
				}
				break;
			case 7:
				_localctx = new BitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2355);
				bit_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(MySQLParser.FLOAT_VALUE, 0); }
		public TerminalNode SCIENTIFIC_VALUE() { return getToken(MySQLParser.SCIENTIFIC_VALUE, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			_la = _input.LA(1);
			if ( !(((((_la - 618)) & ~0x3f) == 0 && ((1L << (_la - 618)) & ((1L << (SCIENTIFIC_VALUE - 618)) | (1L << (FLOAT_VALUE - 618)) | (1L << (INTEGER_VALUE - 618)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(MySQLParser.DOUBLE_QUOTED_STRING, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(MySQLParser.SINGLE_QUOTED_STRING, 0); }
		public Underlinestarted_charset_nameContext underlinestarted_charset_name() {
			return getRuleContext(Underlinestarted_charset_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_string_literal);
		int _la;
		try {
			setState(2371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				match(DOUBLE_QUOTED_STRING);
				}
				break;
			case SINGLE_QUOTED_STRING:
			case UNDERLINE_STARTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERLINE_STARTED_IDENTIFIER) {
					{
					setState(2361);
					underlinestarted_charset_name();
					}
				}

				setState(2364);
				match(SINGLE_QUOTED_STRING);
				setState(2367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(2365);
					match(K_COLLATE);
					setState(2366);
					collation_name();
					}
					break;
				}
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(2369);
				match(T__36);
				setState(2370);
				match(SINGLE_QUOTED_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_VALUE() { return getToken(MySQLParser.BIT_VALUE, 0); }
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Underlinestarted_charset_nameContext underlinestarted_charset_name() {
			return getRuleContext(Underlinestarted_charset_nameContext.class,0);
		}
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterBit_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitBit_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitBit_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_bit_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERLINE_STARTED_IDENTIFIER) {
				{
				setState(2373);
				underlinestarted_charset_name();
				}
			}

			setState(2376);
			match(BIT_VALUE);
			{
			setState(2377);
			match(K_COLLATE);
			setState(2378);
			collation_name();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_VALUE() { return getToken(MySQLParser.HEX_VALUE, 0); }
		public Underlinestarted_charset_nameContext underlinestarted_charset_name() {
			return getRuleContext(Underlinestarted_charset_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitHex_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitHex_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2380);
			underlinestarted_charset_name();
			}
			setState(2381);
			match(HEX_VALUE);
			{
			setState(2382);
			match(K_COLLATE);
			setState(2383);
			collation_name();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Underlinestarted_charset_nameContext extends ParserRuleContext {
		public TerminalNode UNDERLINE_STARTED_IDENTIFIER() { return getToken(MySQLParser.UNDERLINE_STARTED_IDENTIFIER, 0); }
		public Underlinestarted_charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underlinestarted_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUnderlinestarted_charset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUnderlinestarted_charset_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUnderlinestarted_charset_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Underlinestarted_charset_nameContext underlinestarted_charset_name() throws RecognitionException {
		Underlinestarted_charset_nameContext _localctx = new Underlinestarted_charset_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_underlinestarted_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(UNDERLINE_STARTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode K_DATE() { return getToken(MySQLParser.K_DATE, 0); }
		public TerminalNode K_TIME() { return getToken(MySQLParser.K_TIME, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(MySQLParser.K_TIMESTAMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode K_CURRENT_DATE() { return getToken(MySQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(MySQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(MySQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_date_literal);
		int _la;
		try {
			setState(2397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DATE:
			case K_TIME:
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2387);
				_la = _input.LA(1);
				if ( !(_la==K_DATE || _la==K_TIME || _la==K_TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2388);
				string_literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(T__10);
				{
				setState(2390);
				identifier();
				}
				setState(2391);
				string_literal();
				setState(2392);
				match(T__11);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2394);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(2395);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(2396);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterAlias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitAlias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitAlias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_nameContext alias_name() throws RecognitionException {
		Alias_nameContext _localctx = new Alias_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_alias_name);
		try {
			setState(2401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				identifier();
				}
				break;
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2400);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ACCESSIBLE() { return getToken(MySQLParser.K_ACCESSIBLE, 0); }
		public TerminalNode K_ACTION() { return getToken(MySQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(MySQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(MySQLParser.K_AFTER, 0); }
		public TerminalNode K_AGAINST() { return getToken(MySQLParser.K_AGAINST, 0); }
		public TerminalNode K_AGGREGATE() { return getToken(MySQLParser.K_AGGREGATE, 0); }
		public TerminalNode K_ALGORITHM() { return getToken(MySQLParser.K_ALGORITHM, 0); }
		public TerminalNode K_ALL() { return getToken(MySQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(MySQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(MySQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(MySQLParser.K_AND, 0); }
		public TerminalNode K_ANY() { return getToken(MySQLParser.K_ANY, 0); }
		public TerminalNode K_AS() { return getToken(MySQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(MySQLParser.K_ASC, 0); }
		public TerminalNode K_ASCII() { return getToken(MySQLParser.K_ASCII, 0); }
		public TerminalNode K_ASENSITIVE() { return getToken(MySQLParser.K_ASENSITIVE, 0); }
		public TerminalNode K_AT() { return getToken(MySQLParser.K_AT, 0); }
		public TerminalNode K_AUTHORS() { return getToken(MySQLParser.K_AUTHORS, 0); }
		public TerminalNode K_AUTOEXTEND_SIZE() { return getToken(MySQLParser.K_AUTOEXTEND_SIZE, 0); }
		public TerminalNode K_AUTO_INCREMENT() { return getToken(MySQLParser.K_AUTO_INCREMENT, 0); }
		public TerminalNode K_AVG() { return getToken(MySQLParser.K_AVG, 0); }
		public TerminalNode K_AVG_ROW_LENGTH() { return getToken(MySQLParser.K_AVG_ROW_LENGTH, 0); }
		public TerminalNode K_BACKUP() { return getToken(MySQLParser.K_BACKUP, 0); }
		public TerminalNode K_BEFORE() { return getToken(MySQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(MySQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(MySQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BIGINT() { return getToken(MySQLParser.K_BIGINT, 0); }
		public TerminalNode K_BINARY() { return getToken(MySQLParser.K_BINARY, 0); }
		public TerminalNode K_BINLOG() { return getToken(MySQLParser.K_BINLOG, 0); }
		public TerminalNode K_BIT() { return getToken(MySQLParser.K_BIT, 0); }
		public TerminalNode K_BLOB() { return getToken(MySQLParser.K_BLOB, 0); }
		public TerminalNode K_BLOCK() { return getToken(MySQLParser.K_BLOCK, 0); }
		public TerminalNode K_BOOL() { return getToken(MySQLParser.K_BOOL, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(MySQLParser.K_BOOLEAN, 0); }
		public TerminalNode K_BOTH() { return getToken(MySQLParser.K_BOTH, 0); }
		public TerminalNode K_BTREE() { return getToken(MySQLParser.K_BTREE, 0); }
		public TerminalNode K_BY() { return getToken(MySQLParser.K_BY, 0); }
		public TerminalNode K_BYTE() { return getToken(MySQLParser.K_BYTE, 0); }
		public TerminalNode K_CACHE() { return getToken(MySQLParser.K_CACHE, 0); }
		public TerminalNode K_CALL() { return getToken(MySQLParser.K_CALL, 0); }
		public TerminalNode K_CASCADE() { return getToken(MySQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASCADED() { return getToken(MySQLParser.K_CASCADED, 0); }
		public TerminalNode K_CASE() { return getToken(MySQLParser.K_CASE, 0); }
		public TerminalNode K_CATALOG_NAME() { return getToken(MySQLParser.K_CATALOG_NAME, 0); }
		public TerminalNode K_CHAIN() { return getToken(MySQLParser.K_CHAIN, 0); }
		public TerminalNode K_CHANGE() { return getToken(MySQLParser.K_CHANGE, 0); }
		public TerminalNode K_CHANGED() { return getToken(MySQLParser.K_CHANGED, 0); }
		public TerminalNode K_CHAR() { return getToken(MySQLParser.K_CHAR, 0); }
		public TerminalNode K_CHARACTER() { return getToken(MySQLParser.K_CHARACTER, 0); }
		public TerminalNode K_CHARSET() { return getToken(MySQLParser.K_CHARSET, 0); }
		public TerminalNode K_CHECK() { return getToken(MySQLParser.K_CHECK, 0); }
		public TerminalNode K_CHECKSUM() { return getToken(MySQLParser.K_CHECKSUM, 0); }
		public TerminalNode K_CIPHER() { return getToken(MySQLParser.K_CIPHER, 0); }
		public TerminalNode K_CLASS_ORIGIN() { return getToken(MySQLParser.K_CLASS_ORIGIN, 0); }
		public TerminalNode K_CLIENT() { return getToken(MySQLParser.K_CLIENT, 0); }
		public TerminalNode K_CLOSE() { return getToken(MySQLParser.K_CLOSE, 0); }
		public TerminalNode K_COALESCE() { return getToken(MySQLParser.K_COALESCE, 0); }
		public TerminalNode K_CODE() { return getToken(MySQLParser.K_CODE, 0); }
		public TerminalNode K_COLLATE() { return getToken(MySQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLLATION() { return getToken(MySQLParser.K_COLLATION, 0); }
		public TerminalNode K_COLUMN() { return getToken(MySQLParser.K_COLUMN, 0); }
		public TerminalNode K_COLUMNS() { return getToken(MySQLParser.K_COLUMNS, 0); }
		public TerminalNode K_COLUMN_NAME() { return getToken(MySQLParser.K_COLUMN_NAME, 0); }
		public TerminalNode K_COMMENT() { return getToken(MySQLParser.K_COMMENT, 0); }
		public TerminalNode K_COMMIT() { return getToken(MySQLParser.K_COMMIT, 0); }
		public TerminalNode K_COMMITTED() { return getToken(MySQLParser.K_COMMITTED, 0); }
		public TerminalNode K_COMPACT() { return getToken(MySQLParser.K_COMPACT, 0); }
		public TerminalNode K_COMPLETION() { return getToken(MySQLParser.K_COMPLETION, 0); }
		public TerminalNode K_COMPRESSED() { return getToken(MySQLParser.K_COMPRESSED, 0); }
		public TerminalNode K_CONCURRENT() { return getToken(MySQLParser.K_CONCURRENT, 0); }
		public TerminalNode K_CONDITION() { return getToken(MySQLParser.K_CONDITION, 0); }
		public TerminalNode K_CONNECTION() { return getToken(MySQLParser.K_CONNECTION, 0); }
		public TerminalNode K_CONSISTENT() { return getToken(MySQLParser.K_CONSISTENT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(MySQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CONSTRAINT_CATALOG() { return getToken(MySQLParser.K_CONSTRAINT_CATALOG, 0); }
		public TerminalNode K_CONSTRAINT_NAME() { return getToken(MySQLParser.K_CONSTRAINT_NAME, 0); }
		public TerminalNode K_CONSTRAINT_SCHEMA() { return getToken(MySQLParser.K_CONSTRAINT_SCHEMA, 0); }
		public TerminalNode K_CONTAINS() { return getToken(MySQLParser.K_CONTAINS, 0); }
		public TerminalNode K_CONTEXT() { return getToken(MySQLParser.K_CONTEXT, 0); }
		public TerminalNode K_CONTINUE() { return getToken(MySQLParser.K_CONTINUE, 0); }
		public TerminalNode K_CONTRIBUTORS() { return getToken(MySQLParser.K_CONTRIBUTORS, 0); }
		public TerminalNode K_CONVERT() { return getToken(MySQLParser.K_CONVERT, 0); }
		public TerminalNode K_CPU() { return getToken(MySQLParser.K_CPU, 0); }
		public TerminalNode K_CREATE() { return getToken(MySQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(MySQLParser.K_CROSS, 0); }
		public TerminalNode K_CUBE() { return getToken(MySQLParser.K_CUBE, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(MySQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(MySQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(MySQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_USER() { return getToken(MySQLParser.K_CURRENT_USER, 0); }
		public TerminalNode K_CURSOR() { return getToken(MySQLParser.K_CURSOR, 0); }
		public TerminalNode K_CURSOR_NAME() { return getToken(MySQLParser.K_CURSOR_NAME, 0); }
		public TerminalNode K_DATA() { return getToken(MySQLParser.K_DATA, 0); }
		public TerminalNode K_DATABASE() { return getToken(MySQLParser.K_DATABASE, 0); }
		public TerminalNode K_DATABASES() { return getToken(MySQLParser.K_DATABASES, 0); }
		public TerminalNode K_DATAFILE() { return getToken(MySQLParser.K_DATAFILE, 0); }
		public TerminalNode K_DATE() { return getToken(MySQLParser.K_DATE, 0); }
		public TerminalNode K_DATETIME() { return getToken(MySQLParser.K_DATETIME, 0); }
		public TerminalNode K_DAY() { return getToken(MySQLParser.K_DAY, 0); }
		public TerminalNode K_DAY_HOUR() { return getToken(MySQLParser.K_DAY_HOUR, 0); }
		public TerminalNode K_DAY_MICROSECOND() { return getToken(MySQLParser.K_DAY_MICROSECOND, 0); }
		public TerminalNode K_DAY_MINUTE() { return getToken(MySQLParser.K_DAY_MINUTE, 0); }
		public TerminalNode K_DAY_SECOND() { return getToken(MySQLParser.K_DAY_SECOND, 0); }
		public TerminalNode K_DEALLOCATE() { return getToken(MySQLParser.K_DEALLOCATE, 0); }
		public TerminalNode K_DEC() { return getToken(MySQLParser.K_DEC, 0); }
		public TerminalNode K_DECIMAL() { return getToken(MySQLParser.K_DECIMAL, 0); }
		public TerminalNode K_DECLARE() { return getToken(MySQLParser.K_DECLARE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MySQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFINER() { return getToken(MySQLParser.K_DEFINER, 0); }
		public TerminalNode K_DELAYED() { return getToken(MySQLParser.K_DELAYED, 0); }
		public TerminalNode K_DELAY_KEY_WRITE() { return getToken(MySQLParser.K_DELAY_KEY_WRITE, 0); }
		public TerminalNode K_DELETE() { return getToken(MySQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(MySQLParser.K_DESC, 0); }
		public TerminalNode K_DESCRIBE() { return getToken(MySQLParser.K_DESCRIBE, 0); }
		public TerminalNode K_DES_KEY_FILE() { return getToken(MySQLParser.K_DES_KEY_FILE, 0); }
		public TerminalNode K_DETERMINISTIC() { return getToken(MySQLParser.K_DETERMINISTIC, 0); }
		public TerminalNode K_DIRECTORY() { return getToken(MySQLParser.K_DIRECTORY, 0); }
		public TerminalNode K_DISABLE() { return getToken(MySQLParser.K_DISABLE, 0); }
		public TerminalNode K_DISCARD() { return getToken(MySQLParser.K_DISCARD, 0); }
		public TerminalNode K_DISK() { return getToken(MySQLParser.K_DISK, 0); }
		public TerminalNode K_DISTINCT() { return getToken(MySQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DISTINCTROW() { return getToken(MySQLParser.K_DISTINCTROW, 0); }
		public TerminalNode K_DIV() { return getToken(MySQLParser.K_DIV, 0); }
		public TerminalNode K_DO() { return getToken(MySQLParser.K_DO, 0); }
		public TerminalNode K_DOUBLE() { return getToken(MySQLParser.K_DOUBLE, 0); }
		public TerminalNode K_DROP() { return getToken(MySQLParser.K_DROP, 0); }
		public TerminalNode K_DUAL() { return getToken(MySQLParser.K_DUAL, 0); }
		public TerminalNode K_DUMPFILE() { return getToken(MySQLParser.K_DUMPFILE, 0); }
		public TerminalNode K_DUPLICATE() { return getToken(MySQLParser.K_DUPLICATE, 0); }
		public TerminalNode K_DYNAMIC() { return getToken(MySQLParser.K_DYNAMIC, 0); }
		public TerminalNode K_EACH() { return getToken(MySQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(MySQLParser.K_ELSE, 0); }
		public TerminalNode K_ELSEIF() { return getToken(MySQLParser.K_ELSEIF, 0); }
		public TerminalNode K_ENABLE() { return getToken(MySQLParser.K_ENABLE, 0); }
		public TerminalNode K_ENCLOSED() { return getToken(MySQLParser.K_ENCLOSED, 0); }
		public TerminalNode K_END() { return getToken(MySQLParser.K_END, 0); }
		public TerminalNode K_ENDS() { return getToken(MySQLParser.K_ENDS, 0); }
		public TerminalNode K_ENGINE() { return getToken(MySQLParser.K_ENGINE, 0); }
		public TerminalNode K_ENGINES() { return getToken(MySQLParser.K_ENGINES, 0); }
		public TerminalNode K_ENUM() { return getToken(MySQLParser.K_ENUM, 0); }
		public TerminalNode K_ERROR() { return getToken(MySQLParser.K_ERROR, 0); }
		public TerminalNode K_ERRORS() { return getToken(MySQLParser.K_ERRORS, 0); }
		public TerminalNode K_ESCAPE() { return getToken(MySQLParser.K_ESCAPE, 0); }
		public TerminalNode K_ESCAPED() { return getToken(MySQLParser.K_ESCAPED, 0); }
		public TerminalNode K_EVENT() { return getToken(MySQLParser.K_EVENT, 0); }
		public TerminalNode K_EVENTS() { return getToken(MySQLParser.K_EVENTS, 0); }
		public TerminalNode K_EVERY() { return getToken(MySQLParser.K_EVERY, 0); }
		public TerminalNode K_EXECUTE() { return getToken(MySQLParser.K_EXECUTE, 0); }
		public TerminalNode K_EXISTS() { return getToken(MySQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXIT() { return getToken(MySQLParser.K_EXIT, 0); }
		public TerminalNode K_EXPANSION() { return getToken(MySQLParser.K_EXPANSION, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(MySQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_EXTENDED() { return getToken(MySQLParser.K_EXTENDED, 0); }
		public TerminalNode K_EXTENT_SIZE() { return getToken(MySQLParser.K_EXTENT_SIZE, 0); }
		public TerminalNode K_FALSE() { return getToken(MySQLParser.K_FALSE, 0); }
		public TerminalNode K_FAST() { return getToken(MySQLParser.K_FAST, 0); }
		public TerminalNode K_FAULTS() { return getToken(MySQLParser.K_FAULTS, 0); }
		public TerminalNode K_FETCH() { return getToken(MySQLParser.K_FETCH, 0); }
		public TerminalNode K_FIELDS() { return getToken(MySQLParser.K_FIELDS, 0); }
		public TerminalNode K_FILE() { return getToken(MySQLParser.K_FILE, 0); }
		public TerminalNode K_FIRST() { return getToken(MySQLParser.K_FIRST, 0); }
		public TerminalNode K_FIXED() { return getToken(MySQLParser.K_FIXED, 0); }
		public TerminalNode K_FLOAT() { return getToken(MySQLParser.K_FLOAT, 0); }
		public TerminalNode K_FLUSH() { return getToken(MySQLParser.K_FLUSH, 0); }
		public TerminalNode K_FOR() { return getToken(MySQLParser.K_FOR, 0); }
		public TerminalNode K_FORCE() { return getToken(MySQLParser.K_FORCE, 0); }
		public TerminalNode K_FOREIGN() { return getToken(MySQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FOUND() { return getToken(MySQLParser.K_FOUND, 0); }
		public TerminalNode K_FRAC_SECOND() { return getToken(MySQLParser.K_FRAC_SECOND, 0); }
		public TerminalNode K_FROM() { return getToken(MySQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(MySQLParser.K_FULL, 0); }
		public TerminalNode K_FULLTEXT() { return getToken(MySQLParser.K_FULLTEXT, 0); }
		public TerminalNode K_FUNCTION() { return getToken(MySQLParser.K_FUNCTION, 0); }
		public TerminalNode K_GENERAL() { return getToken(MySQLParser.K_GENERAL, 0); }
		public TerminalNode K_GEOMETRY() { return getToken(MySQLParser.K_GEOMETRY, 0); }
		public TerminalNode K_GEOMETRYCOLLECTION() { return getToken(MySQLParser.K_GEOMETRYCOLLECTION, 0); }
		public TerminalNode K_GET_FORMAT() { return getToken(MySQLParser.K_GET_FORMAT, 0); }
		public TerminalNode K_GLOBAL() { return getToken(MySQLParser.K_GLOBAL, 0); }
		public TerminalNode K_GRANT() { return getToken(MySQLParser.K_GRANT, 0); }
		public TerminalNode K_GRANTS() { return getToken(MySQLParser.K_GRANTS, 0); }
		public TerminalNode K_GROUP() { return getToken(MySQLParser.K_GROUP, 0); }
		public TerminalNode K_HANDLER() { return getToken(MySQLParser.K_HANDLER, 0); }
		public TerminalNode K_HASH() { return getToken(MySQLParser.K_HASH, 0); }
		public TerminalNode K_HAVING() { return getToken(MySQLParser.K_HAVING, 0); }
		public TerminalNode K_HELP() { return getToken(MySQLParser.K_HELP, 0); }
		public TerminalNode K_HIGH_PRIORITY() { return getToken(MySQLParser.K_HIGH_PRIORITY, 0); }
		public TerminalNode K_HOST() { return getToken(MySQLParser.K_HOST, 0); }
		public TerminalNode K_HOSTS() { return getToken(MySQLParser.K_HOSTS, 0); }
		public TerminalNode K_HOUR() { return getToken(MySQLParser.K_HOUR, 0); }
		public TerminalNode K_HOUR_MICROSECOND() { return getToken(MySQLParser.K_HOUR_MICROSECOND, 0); }
		public TerminalNode K_HOUR_MINUTE() { return getToken(MySQLParser.K_HOUR_MINUTE, 0); }
		public TerminalNode K_HOUR_SECOND() { return getToken(MySQLParser.K_HOUR_SECOND, 0); }
		public TerminalNode K_IDENTIFIED() { return getToken(MySQLParser.K_IDENTIFIED, 0); }
		public TerminalNode K_IF() { return getToken(MySQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(MySQLParser.K_IGNORE, 0); }
		public TerminalNode K_IGNORE_SERVER_IDS() { return getToken(MySQLParser.K_IGNORE_SERVER_IDS, 0); }
		public TerminalNode K_IMPORT() { return getToken(MySQLParser.K_IMPORT, 0); }
		public TerminalNode K_IN() { return getToken(MySQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(MySQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXES() { return getToken(MySQLParser.K_INDEXES, 0); }
		public TerminalNode K_INFILE() { return getToken(MySQLParser.K_INFILE, 0); }
		public TerminalNode K_INITIAL_SIZE() { return getToken(MySQLParser.K_INITIAL_SIZE, 0); }
		public TerminalNode K_INNER() { return getToken(MySQLParser.K_INNER, 0); }
		public TerminalNode K_INNOBASE() { return getToken(MySQLParser.K_INNOBASE, 0); }
		public TerminalNode K_INNODB() { return getToken(MySQLParser.K_INNODB, 0); }
		public TerminalNode K_INOUT() { return getToken(MySQLParser.K_INOUT, 0); }
		public TerminalNode K_INSENSITIVE() { return getToken(MySQLParser.K_INSENSITIVE, 0); }
		public TerminalNode K_INSERT() { return getToken(MySQLParser.K_INSERT, 0); }
		public TerminalNode K_INSERT_METHOD() { return getToken(MySQLParser.K_INSERT_METHOD, 0); }
		public TerminalNode K_INSTALL() { return getToken(MySQLParser.K_INSTALL, 0); }
		public TerminalNode K_INT() { return getToken(MySQLParser.K_INT, 0); }
		public TerminalNode K_INTEGER() { return getToken(MySQLParser.K_INTEGER, 0); }
		public TerminalNode K_INTERVAL() { return getToken(MySQLParser.K_INTERVAL, 0); }
		public TerminalNode K_INTO() { return getToken(MySQLParser.K_INTO, 0); }
		public TerminalNode K_INVOKER() { return getToken(MySQLParser.K_INVOKER, 0); }
		public TerminalNode K_IO() { return getToken(MySQLParser.K_IO, 0); }
		public TerminalNode K_IO_THREAD() { return getToken(MySQLParser.K_IO_THREAD, 0); }
		public TerminalNode K_IPC() { return getToken(MySQLParser.K_IPC, 0); }
		public TerminalNode K_IS() { return getToken(MySQLParser.K_IS, 0); }
		public TerminalNode K_ISOLATION() { return getToken(MySQLParser.K_ISOLATION, 0); }
		public TerminalNode K_ISSUER() { return getToken(MySQLParser.K_ISSUER, 0); }
		public TerminalNode K_ITERATE() { return getToken(MySQLParser.K_ITERATE, 0); }
		public TerminalNode K_JOIN() { return getToken(MySQLParser.K_JOIN, 0); }
		public TerminalNode K_JSON() { return getToken(MySQLParser.K_JSON, 0); }
		public TerminalNode K_KEY() { return getToken(MySQLParser.K_KEY, 0); }
		public TerminalNode K_KEYS() { return getToken(MySQLParser.K_KEYS, 0); }
		public TerminalNode K_KEY_BLOCK_SIZE() { return getToken(MySQLParser.K_KEY_BLOCK_SIZE, 0); }
		public TerminalNode K_KILL() { return getToken(MySQLParser.K_KILL, 0); }
		public TerminalNode K_LANGUAGE() { return getToken(MySQLParser.K_LANGUAGE, 0); }
		public TerminalNode K_LAST() { return getToken(MySQLParser.K_LAST, 0); }
		public TerminalNode K_LEADING() { return getToken(MySQLParser.K_LEADING, 0); }
		public TerminalNode K_LEAVE() { return getToken(MySQLParser.K_LEAVE, 0); }
		public TerminalNode K_LEAVES() { return getToken(MySQLParser.K_LEAVES, 0); }
		public TerminalNode K_LEFT() { return getToken(MySQLParser.K_LEFT, 0); }
		public TerminalNode K_LESS() { return getToken(MySQLParser.K_LESS, 0); }
		public TerminalNode K_LEVEL() { return getToken(MySQLParser.K_LEVEL, 0); }
		public TerminalNode K_LIKE() { return getToken(MySQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(MySQLParser.K_LIMIT, 0); }
		public TerminalNode K_LINEAR() { return getToken(MySQLParser.K_LINEAR, 0); }
		public TerminalNode K_LINES() { return getToken(MySQLParser.K_LINES, 0); }
		public TerminalNode K_LINESTRING() { return getToken(MySQLParser.K_LINESTRING, 0); }
		public TerminalNode K_LIST() { return getToken(MySQLParser.K_LIST, 0); }
		public TerminalNode K_LOAD() { return getToken(MySQLParser.K_LOAD, 0); }
		public TerminalNode K_LOCAL() { return getToken(MySQLParser.K_LOCAL, 0); }
		public TerminalNode K_LOCALTIME() { return getToken(MySQLParser.K_LOCALTIME, 0); }
		public TerminalNode K_LOCALTIMESTAMP() { return getToken(MySQLParser.K_LOCALTIMESTAMP, 0); }
		public TerminalNode K_LOCK() { return getToken(MySQLParser.K_LOCK, 0); }
		public TerminalNode K_LOCKS() { return getToken(MySQLParser.K_LOCKS, 0); }
		public TerminalNode K_LOGFILE() { return getToken(MySQLParser.K_LOGFILE, 0); }
		public TerminalNode K_LOGS() { return getToken(MySQLParser.K_LOGS, 0); }
		public TerminalNode K_LONG() { return getToken(MySQLParser.K_LONG, 0); }
		public TerminalNode K_LONGBLOB() { return getToken(MySQLParser.K_LONGBLOB, 0); }
		public TerminalNode K_LONGTEXT() { return getToken(MySQLParser.K_LONGTEXT, 0); }
		public TerminalNode K_LOOP() { return getToken(MySQLParser.K_LOOP, 0); }
		public TerminalNode K_LOW_PRIORITY() { return getToken(MySQLParser.K_LOW_PRIORITY, 0); }
		public TerminalNode K_MASTER() { return getToken(MySQLParser.K_MASTER, 0); }
		public TerminalNode K_MASTER_CONNECT_RETRY() { return getToken(MySQLParser.K_MASTER_CONNECT_RETRY, 0); }
		public TerminalNode K_MASTER_HEARTBEAT_PERIOD() { return getToken(MySQLParser.K_MASTER_HEARTBEAT_PERIOD, 0); }
		public TerminalNode K_MASTER_HOST() { return getToken(MySQLParser.K_MASTER_HOST, 0); }
		public TerminalNode K_MASTER_LOG_FILE() { return getToken(MySQLParser.K_MASTER_LOG_FILE, 0); }
		public TerminalNode K_MASTER_LOG_POS() { return getToken(MySQLParser.K_MASTER_LOG_POS, 0); }
		public TerminalNode K_MASTER_PASSWORD() { return getToken(MySQLParser.K_MASTER_PASSWORD, 0); }
		public TerminalNode K_MASTER_PORT() { return getToken(MySQLParser.K_MASTER_PORT, 0); }
		public TerminalNode K_MASTER_SERVER_ID() { return getToken(MySQLParser.K_MASTER_SERVER_ID, 0); }
		public TerminalNode K_MASTER_SSL() { return getToken(MySQLParser.K_MASTER_SSL, 0); }
		public TerminalNode K_MASTER_SSL_CA() { return getToken(MySQLParser.K_MASTER_SSL_CA, 0); }
		public TerminalNode K_MASTER_SSL_CAPATH() { return getToken(MySQLParser.K_MASTER_SSL_CAPATH, 0); }
		public TerminalNode K_MASTER_SSL_CERT() { return getToken(MySQLParser.K_MASTER_SSL_CERT, 0); }
		public TerminalNode K_MASTER_SSL_CIPHER() { return getToken(MySQLParser.K_MASTER_SSL_CIPHER, 0); }
		public TerminalNode K_MASTER_SSL_KEY() { return getToken(MySQLParser.K_MASTER_SSL_KEY, 0); }
		public TerminalNode K_MASTER_SSL_VERIFY_SERVER_CERT() { return getToken(MySQLParser.K_MASTER_SSL_VERIFY_SERVER_CERT, 0); }
		public TerminalNode K_MASTER_USER() { return getToken(MySQLParser.K_MASTER_USER, 0); }
		public TerminalNode K_MATCH() { return getToken(MySQLParser.K_MATCH, 0); }
		public TerminalNode K_MAXVALUE() { return getToken(MySQLParser.K_MAXVALUE, 0); }
		public TerminalNode K_MAX_CONNECTIONS_PER_HOUR() { return getToken(MySQLParser.K_MAX_CONNECTIONS_PER_HOUR, 0); }
		public TerminalNode K_MAX_QUERIES_PER_HOUR() { return getToken(MySQLParser.K_MAX_QUERIES_PER_HOUR, 0); }
		public TerminalNode K_MAX_ROWS() { return getToken(MySQLParser.K_MAX_ROWS, 0); }
		public TerminalNode K_MAX_SIZE() { return getToken(MySQLParser.K_MAX_SIZE, 0); }
		public TerminalNode K_MAX_UPDATES_PER_HOUR() { return getToken(MySQLParser.K_MAX_UPDATES_PER_HOUR, 0); }
		public TerminalNode K_MAX_USER_CONNECTIONS() { return getToken(MySQLParser.K_MAX_USER_CONNECTIONS, 0); }
		public TerminalNode K_MEDIUM() { return getToken(MySQLParser.K_MEDIUM, 0); }
		public TerminalNode K_MEDIUMBLOB() { return getToken(MySQLParser.K_MEDIUMBLOB, 0); }
		public TerminalNode K_MEDIUMINT() { return getToken(MySQLParser.K_MEDIUMINT, 0); }
		public TerminalNode K_MEDIUMTEXT() { return getToken(MySQLParser.K_MEDIUMTEXT, 0); }
		public TerminalNode K_MEMORY() { return getToken(MySQLParser.K_MEMORY, 0); }
		public TerminalNode K_MERGE() { return getToken(MySQLParser.K_MERGE, 0); }
		public TerminalNode K_MESSAGE_TEXT() { return getToken(MySQLParser.K_MESSAGE_TEXT, 0); }
		public TerminalNode K_MICROSECOND() { return getToken(MySQLParser.K_MICROSECOND, 0); }
		public TerminalNode K_MIDDLEINT() { return getToken(MySQLParser.K_MIDDLEINT, 0); }
		public TerminalNode K_MIGRATE() { return getToken(MySQLParser.K_MIGRATE, 0); }
		public TerminalNode K_MINUTE() { return getToken(MySQLParser.K_MINUTE, 0); }
		public TerminalNode K_MINUTE_MICROSECOND() { return getToken(MySQLParser.K_MINUTE_MICROSECOND, 0); }
		public TerminalNode K_MINUTE_SECOND() { return getToken(MySQLParser.K_MINUTE_SECOND, 0); }
		public TerminalNode K_MIN_ROWS() { return getToken(MySQLParser.K_MIN_ROWS, 0); }
		public TerminalNode K_MOD() { return getToken(MySQLParser.K_MOD, 0); }
		public TerminalNode K_MODE() { return getToken(MySQLParser.K_MODE, 0); }
		public TerminalNode K_MODIFIES() { return getToken(MySQLParser.K_MODIFIES, 0); }
		public TerminalNode K_MODIFY() { return getToken(MySQLParser.K_MODIFY, 0); }
		public TerminalNode K_MONTH() { return getToken(MySQLParser.K_MONTH, 0); }
		public TerminalNode K_MULTILINESTRING() { return getToken(MySQLParser.K_MULTILINESTRING, 0); }
		public TerminalNode K_MULTIPOINT() { return getToken(MySQLParser.K_MULTIPOINT, 0); }
		public TerminalNode K_MULTIPOLYGON() { return getToken(MySQLParser.K_MULTIPOLYGON, 0); }
		public TerminalNode K_MUTEX() { return getToken(MySQLParser.K_MUTEX, 0); }
		public TerminalNode K_MYSQL_ERRNO() { return getToken(MySQLParser.K_MYSQL_ERRNO, 0); }
		public TerminalNode K_NAME() { return getToken(MySQLParser.K_NAME, 0); }
		public TerminalNode K_NAMES() { return getToken(MySQLParser.K_NAMES, 0); }
		public TerminalNode K_NATIONAL() { return getToken(MySQLParser.K_NATIONAL, 0); }
		public TerminalNode K_NATURAL() { return getToken(MySQLParser.K_NATURAL, 0); }
		public TerminalNode K_NCHAR() { return getToken(MySQLParser.K_NCHAR, 0); }
		public TerminalNode K_NDB() { return getToken(MySQLParser.K_NDB, 0); }
		public TerminalNode K_NDBCLUSTER() { return getToken(MySQLParser.K_NDBCLUSTER, 0); }
		public TerminalNode K_NEW() { return getToken(MySQLParser.K_NEW, 0); }
		public TerminalNode K_NEXT() { return getToken(MySQLParser.K_NEXT, 0); }
		public TerminalNode K_NO() { return getToken(MySQLParser.K_NO, 0); }
		public TerminalNode K_NODEGROUP() { return getToken(MySQLParser.K_NODEGROUP, 0); }
		public TerminalNode K_NONE() { return getToken(MySQLParser.K_NONE, 0); }
		public TerminalNode K_NOT() { return getToken(MySQLParser.K_NOT, 0); }
		public TerminalNode K_NO_WAIT() { return getToken(MySQLParser.K_NO_WAIT, 0); }
		public TerminalNode K_NO_WRITE_TO_BINLOG() { return getToken(MySQLParser.K_NO_WRITE_TO_BINLOG, 0); }
		public TerminalNode K_NULL() { return getToken(MySQLParser.K_NULL, 0); }
		public TerminalNode K_NUMERIC() { return getToken(MySQLParser.K_NUMERIC, 0); }
		public TerminalNode K_NVARCHAR() { return getToken(MySQLParser.K_NVARCHAR, 0); }
		public TerminalNode K_OFFSET() { return getToken(MySQLParser.K_OFFSET, 0); }
		public TerminalNode K_OLD_PASSWORD() { return getToken(MySQLParser.K_OLD_PASSWORD, 0); }
		public TerminalNode K_ON() { return getToken(MySQLParser.K_ON, 0); }
		public TerminalNode K_ONE() { return getToken(MySQLParser.K_ONE, 0); }
		public TerminalNode K_ONE_SHOT() { return getToken(MySQLParser.K_ONE_SHOT, 0); }
		public TerminalNode K_OPEN() { return getToken(MySQLParser.K_OPEN, 0); }
		public TerminalNode K_OPTIMIZE() { return getToken(MySQLParser.K_OPTIMIZE, 0); }
		public TerminalNode K_OPTION() { return getToken(MySQLParser.K_OPTION, 0); }
		public TerminalNode K_OPTIONALLY() { return getToken(MySQLParser.K_OPTIONALLY, 0); }
		public TerminalNode K_OPTIONS() { return getToken(MySQLParser.K_OPTIONS, 0); }
		public TerminalNode K_OR() { return getToken(MySQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(MySQLParser.K_ORDER, 0); }
		public TerminalNode K_OUT() { return getToken(MySQLParser.K_OUT, 0); }
		public TerminalNode K_OUTER() { return getToken(MySQLParser.K_OUTER, 0); }
		public TerminalNode K_OUTFILE() { return getToken(MySQLParser.K_OUTFILE, 0); }
		public TerminalNode K_OWNER() { return getToken(MySQLParser.K_OWNER, 0); }
		public TerminalNode K_PACK_KEYS() { return getToken(MySQLParser.K_PACK_KEYS, 0); }
		public TerminalNode K_PAGE() { return getToken(MySQLParser.K_PAGE, 0); }
		public TerminalNode K_PARSER() { return getToken(MySQLParser.K_PARSER, 0); }
		public TerminalNode K_PARTIAL() { return getToken(MySQLParser.K_PARTIAL, 0); }
		public TerminalNode K_PARTITION() { return getToken(MySQLParser.K_PARTITION, 0); }
		public TerminalNode K_PARTITIONING() { return getToken(MySQLParser.K_PARTITIONING, 0); }
		public TerminalNode K_PARTITIONS() { return getToken(MySQLParser.K_PARTITIONS, 0); }
		public TerminalNode K_PASSWORD() { return getToken(MySQLParser.K_PASSWORD, 0); }
		public TerminalNode K_PHASE() { return getToken(MySQLParser.K_PHASE, 0); }
		public TerminalNode K_PLUGIN() { return getToken(MySQLParser.K_PLUGIN, 0); }
		public TerminalNode K_PLUGINS() { return getToken(MySQLParser.K_PLUGINS, 0); }
		public TerminalNode K_POINT() { return getToken(MySQLParser.K_POINT, 0); }
		public TerminalNode K_POLYGON() { return getToken(MySQLParser.K_POLYGON, 0); }
		public TerminalNode K_PORT() { return getToken(MySQLParser.K_PORT, 0); }
		public TerminalNode K_PRECISION() { return getToken(MySQLParser.K_PRECISION, 0); }
		public TerminalNode K_PREPARE() { return getToken(MySQLParser.K_PREPARE, 0); }
		public TerminalNode K_PRESERVE() { return getToken(MySQLParser.K_PRESERVE, 0); }
		public TerminalNode K_PREV() { return getToken(MySQLParser.K_PREV, 0); }
		public TerminalNode K_PRIMARY() { return getToken(MySQLParser.K_PRIMARY, 0); }
		public TerminalNode K_PRIVILEGES() { return getToken(MySQLParser.K_PRIVILEGES, 0); }
		public TerminalNode K_PROCEDURE() { return getToken(MySQLParser.K_PROCEDURE, 0); }
		public TerminalNode K_PROCESSLIST() { return getToken(MySQLParser.K_PROCESSLIST, 0); }
		public TerminalNode K_PROFILE() { return getToken(MySQLParser.K_PROFILE, 0); }
		public TerminalNode K_PROFILES() { return getToken(MySQLParser.K_PROFILES, 0); }
		public TerminalNode K_PROXY() { return getToken(MySQLParser.K_PROXY, 0); }
		public TerminalNode K_PURGE() { return getToken(MySQLParser.K_PURGE, 0); }
		public TerminalNode K_QUARTER() { return getToken(MySQLParser.K_QUARTER, 0); }
		public TerminalNode K_QUERY() { return getToken(MySQLParser.K_QUERY, 0); }
		public TerminalNode K_QUICK() { return getToken(MySQLParser.K_QUICK, 0); }
		public TerminalNode K_RANGE() { return getToken(MySQLParser.K_RANGE, 0); }
		public TerminalNode K_READ() { return getToken(MySQLParser.K_READ, 0); }
		public TerminalNode K_READS() { return getToken(MySQLParser.K_READS, 0); }
		public TerminalNode K_READ_ONLY() { return getToken(MySQLParser.K_READ_ONLY, 0); }
		public TerminalNode K_READ_WRITE() { return getToken(MySQLParser.K_READ_WRITE, 0); }
		public TerminalNode K_REAL() { return getToken(MySQLParser.K_REAL, 0); }
		public TerminalNode K_REBUILD() { return getToken(MySQLParser.K_REBUILD, 0); }
		public TerminalNode K_RECOVER() { return getToken(MySQLParser.K_RECOVER, 0); }
		public TerminalNode K_REDOFILE() { return getToken(MySQLParser.K_REDOFILE, 0); }
		public TerminalNode K_REDO_BUFFER_SIZE() { return getToken(MySQLParser.K_REDO_BUFFER_SIZE, 0); }
		public TerminalNode K_REDUNDANT() { return getToken(MySQLParser.K_REDUNDANT, 0); }
		public TerminalNode K_REFERENCES() { return getToken(MySQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(MySQLParser.K_REGEXP, 0); }
		public TerminalNode K_RELAY() { return getToken(MySQLParser.K_RELAY, 0); }
		public TerminalNode K_RELAYLOG() { return getToken(MySQLParser.K_RELAYLOG, 0); }
		public TerminalNode K_RELAY_LOG_FILE() { return getToken(MySQLParser.K_RELAY_LOG_FILE, 0); }
		public TerminalNode K_RELAY_LOG_POS() { return getToken(MySQLParser.K_RELAY_LOG_POS, 0); }
		public TerminalNode K_RELAY_THREAD() { return getToken(MySQLParser.K_RELAY_THREAD, 0); }
		public TerminalNode K_RELEASE() { return getToken(MySQLParser.K_RELEASE, 0); }
		public TerminalNode K_RELOAD() { return getToken(MySQLParser.K_RELOAD, 0); }
		public TerminalNode K_REMOVE() { return getToken(MySQLParser.K_REMOVE, 0); }
		public TerminalNode K_RENAME() { return getToken(MySQLParser.K_RENAME, 0); }
		public TerminalNode K_REORGANIZE() { return getToken(MySQLParser.K_REORGANIZE, 0); }
		public TerminalNode K_REPAIR() { return getToken(MySQLParser.K_REPAIR, 0); }
		public TerminalNode K_REPEAT() { return getToken(MySQLParser.K_REPEAT, 0); }
		public TerminalNode K_REPEATABLE() { return getToken(MySQLParser.K_REPEATABLE, 0); }
		public TerminalNode K_REPLACE() { return getToken(MySQLParser.K_REPLACE, 0); }
		public TerminalNode K_REPLICATION() { return getToken(MySQLParser.K_REPLICATION, 0); }
		public TerminalNode K_REQUIRE() { return getToken(MySQLParser.K_REQUIRE, 0); }
		public TerminalNode K_RESET() { return getToken(MySQLParser.K_RESET, 0); }
		public TerminalNode K_RESIGNAL() { return getToken(MySQLParser.K_RESIGNAL, 0); }
		public TerminalNode K_RESTORE() { return getToken(MySQLParser.K_RESTORE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(MySQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RESUME() { return getToken(MySQLParser.K_RESUME, 0); }
		public TerminalNode K_RETURN() { return getToken(MySQLParser.K_RETURN, 0); }
		public TerminalNode K_RETURNS() { return getToken(MySQLParser.K_RETURNS, 0); }
		public TerminalNode K_REVOKE() { return getToken(MySQLParser.K_REVOKE, 0); }
		public TerminalNode K_RIGHT() { return getToken(MySQLParser.K_RIGHT, 0); }
		public TerminalNode K_RLIKE() { return getToken(MySQLParser.K_RLIKE, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(MySQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROLLUP() { return getToken(MySQLParser.K_ROLLUP, 0); }
		public TerminalNode K_ROUTINE() { return getToken(MySQLParser.K_ROUTINE, 0); }
		public TerminalNode K_ROW() { return getToken(MySQLParser.K_ROW, 0); }
		public TerminalNode K_ROWS() { return getToken(MySQLParser.K_ROWS, 0); }
		public TerminalNode K_ROW_FORMAT() { return getToken(MySQLParser.K_ROW_FORMAT, 0); }
		public TerminalNode K_RTREE() { return getToken(MySQLParser.K_RTREE, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(MySQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SCHEDULE() { return getToken(MySQLParser.K_SCHEDULE, 0); }
		public TerminalNode K_SCHEMA() { return getToken(MySQLParser.K_SCHEMA, 0); }
		public TerminalNode K_SCHEMAS() { return getToken(MySQLParser.K_SCHEMAS, 0); }
		public TerminalNode K_SCHEMA_NAME() { return getToken(MySQLParser.K_SCHEMA_NAME, 0); }
		public TerminalNode K_SECOND() { return getToken(MySQLParser.K_SECOND, 0); }
		public TerminalNode K_SECOND_MICROSECOND() { return getToken(MySQLParser.K_SECOND_MICROSECOND, 0); }
		public TerminalNode K_SECURITY() { return getToken(MySQLParser.K_SECURITY, 0); }
		public TerminalNode K_SELECT() { return getToken(MySQLParser.K_SELECT, 0); }
		public TerminalNode K_SENSITIVE() { return getToken(MySQLParser.K_SENSITIVE, 0); }
		public TerminalNode K_SEPARATOR() { return getToken(MySQLParser.K_SEPARATOR, 0); }
		public TerminalNode K_SERIAL() { return getToken(MySQLParser.K_SERIAL, 0); }
		public TerminalNode K_SERIALIZABLE() { return getToken(MySQLParser.K_SERIALIZABLE, 0); }
		public TerminalNode K_SERVER() { return getToken(MySQLParser.K_SERVER, 0); }
		public TerminalNode K_SESSION() { return getToken(MySQLParser.K_SESSION, 0); }
		public TerminalNode K_SET() { return getToken(MySQLParser.K_SET, 0); }
		public TerminalNode K_SHARE() { return getToken(MySQLParser.K_SHARE, 0); }
		public TerminalNode K_SHOW() { return getToken(MySQLParser.K_SHOW, 0); }
		public TerminalNode K_SHUTDOWN() { return getToken(MySQLParser.K_SHUTDOWN, 0); }
		public TerminalNode K_SIGNAL() { return getToken(MySQLParser.K_SIGNAL, 0); }
		public TerminalNode K_SIGNED() { return getToken(MySQLParser.K_SIGNED, 0); }
		public TerminalNode K_SIMPLE() { return getToken(MySQLParser.K_SIMPLE, 0); }
		public TerminalNode K_SLAVE() { return getToken(MySQLParser.K_SLAVE, 0); }
		public TerminalNode K_SLOW() { return getToken(MySQLParser.K_SLOW, 0); }
		public TerminalNode K_SMALLINT() { return getToken(MySQLParser.K_SMALLINT, 0); }
		public TerminalNode K_SNAPSHOT() { return getToken(MySQLParser.K_SNAPSHOT, 0); }
		public TerminalNode K_SOCKET() { return getToken(MySQLParser.K_SOCKET, 0); }
		public TerminalNode K_SOME() { return getToken(MySQLParser.K_SOME, 0); }
		public TerminalNode K_SONAME() { return getToken(MySQLParser.K_SONAME, 0); }
		public TerminalNode K_SOUNDS() { return getToken(MySQLParser.K_SOUNDS, 0); }
		public TerminalNode K_SOURCE() { return getToken(MySQLParser.K_SOURCE, 0); }
		public TerminalNode K_SPATIAL() { return getToken(MySQLParser.K_SPATIAL, 0); }
		public TerminalNode K_SPECIFIC() { return getToken(MySQLParser.K_SPECIFIC, 0); }
		public TerminalNode K_SQL() { return getToken(MySQLParser.K_SQL, 0); }
		public TerminalNode K_SQLEXCEPTION() { return getToken(MySQLParser.K_SQLEXCEPTION, 0); }
		public TerminalNode K_SQLSTATE() { return getToken(MySQLParser.K_SQLSTATE, 0); }
		public TerminalNode K_SQLWARNING() { return getToken(MySQLParser.K_SQLWARNING, 0); }
		public TerminalNode K_SQL_BIG_RESULT() { return getToken(MySQLParser.K_SQL_BIG_RESULT, 0); }
		public TerminalNode K_SQL_BUFFER_RESULT() { return getToken(MySQLParser.K_SQL_BUFFER_RESULT, 0); }
		public TerminalNode K_SQL_CACHE() { return getToken(MySQLParser.K_SQL_CACHE, 0); }
		public TerminalNode K_SQL_CALC_FOUND_ROWS() { return getToken(MySQLParser.K_SQL_CALC_FOUND_ROWS, 0); }
		public TerminalNode K_SQL_NO_CACHE() { return getToken(MySQLParser.K_SQL_NO_CACHE, 0); }
		public TerminalNode K_SQL_SMALL_RESULT() { return getToken(MySQLParser.K_SQL_SMALL_RESULT, 0); }
		public TerminalNode K_SQL_THREAD() { return getToken(MySQLParser.K_SQL_THREAD, 0); }
		public TerminalNode K_SQL_TSI_DAY() { return getToken(MySQLParser.K_SQL_TSI_DAY, 0); }
		public TerminalNode K_SQL_TSI_FRAC_SECOND() { return getToken(MySQLParser.K_SQL_TSI_FRAC_SECOND, 0); }
		public TerminalNode K_SQL_TSI_HOUR() { return getToken(MySQLParser.K_SQL_TSI_HOUR, 0); }
		public TerminalNode K_SQL_TSI_MINUTE() { return getToken(MySQLParser.K_SQL_TSI_MINUTE, 0); }
		public TerminalNode K_SQL_TSI_MONTH() { return getToken(MySQLParser.K_SQL_TSI_MONTH, 0); }
		public TerminalNode K_SQL_TSI_QUARTER() { return getToken(MySQLParser.K_SQL_TSI_QUARTER, 0); }
		public TerminalNode K_SQL_TSI_SECOND() { return getToken(MySQLParser.K_SQL_TSI_SECOND, 0); }
		public TerminalNode K_SQL_TSI_WEEK() { return getToken(MySQLParser.K_SQL_TSI_WEEK, 0); }
		public TerminalNode K_SQL_TSI_YEAR() { return getToken(MySQLParser.K_SQL_TSI_YEAR, 0); }
		public TerminalNode K_SSL() { return getToken(MySQLParser.K_SSL, 0); }
		public TerminalNode K_START() { return getToken(MySQLParser.K_START, 0); }
		public TerminalNode K_STARTING() { return getToken(MySQLParser.K_STARTING, 0); }
		public TerminalNode K_STARTS() { return getToken(MySQLParser.K_STARTS, 0); }
		public TerminalNode K_STATUS() { return getToken(MySQLParser.K_STATUS, 0); }
		public TerminalNode K_STOP() { return getToken(MySQLParser.K_STOP, 0); }
		public TerminalNode K_STORAGE() { return getToken(MySQLParser.K_STORAGE, 0); }
		public TerminalNode K_STRAIGHT_JOIN() { return getToken(MySQLParser.K_STRAIGHT_JOIN, 0); }
		public TerminalNode K_STRING() { return getToken(MySQLParser.K_STRING, 0); }
		public TerminalNode K_SUBCLASS_ORIGIN() { return getToken(MySQLParser.K_SUBCLASS_ORIGIN, 0); }
		public TerminalNode K_SUBJECT() { return getToken(MySQLParser.K_SUBJECT, 0); }
		public TerminalNode K_SUBPARTITION() { return getToken(MySQLParser.K_SUBPARTITION, 0); }
		public TerminalNode K_SUBPARTITIONS() { return getToken(MySQLParser.K_SUBPARTITIONS, 0); }
		public TerminalNode K_SUPER() { return getToken(MySQLParser.K_SUPER, 0); }
		public TerminalNode K_SUSPEND() { return getToken(MySQLParser.K_SUSPEND, 0); }
		public TerminalNode K_SWAPS() { return getToken(MySQLParser.K_SWAPS, 0); }
		public TerminalNode K_SWITCHES() { return getToken(MySQLParser.K_SWITCHES, 0); }
		public TerminalNode K_TABLE() { return getToken(MySQLParser.K_TABLE, 0); }
		public TerminalNode K_TABLES() { return getToken(MySQLParser.K_TABLES, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(MySQLParser.K_TABLESPACE, 0); }
		public TerminalNode K_TABLE_CHECKSUM() { return getToken(MySQLParser.K_TABLE_CHECKSUM, 0); }
		public TerminalNode K_TABLE_NAME() { return getToken(MySQLParser.K_TABLE_NAME, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(MySQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_TEMPTABLE() { return getToken(MySQLParser.K_TEMPTABLE, 0); }
		public TerminalNode K_TERMINATED() { return getToken(MySQLParser.K_TERMINATED, 0); }
		public TerminalNode K_TEXT() { return getToken(MySQLParser.K_TEXT, 0); }
		public TerminalNode K_THAN() { return getToken(MySQLParser.K_THAN, 0); }
		public TerminalNode K_THEN() { return getToken(MySQLParser.K_THEN, 0); }
		public TerminalNode K_TIME() { return getToken(MySQLParser.K_TIME, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(MySQLParser.K_TIMESTAMP, 0); }
		public TerminalNode K_TIMESTAMPADD() { return getToken(MySQLParser.K_TIMESTAMPADD, 0); }
		public TerminalNode K_TIMESTAMPDIFF() { return getToken(MySQLParser.K_TIMESTAMPDIFF, 0); }
		public TerminalNode K_TINYBLOB() { return getToken(MySQLParser.K_TINYBLOB, 0); }
		public TerminalNode K_TINYINT() { return getToken(MySQLParser.K_TINYINT, 0); }
		public TerminalNode K_TINYTEXT() { return getToken(MySQLParser.K_TINYTEXT, 0); }
		public TerminalNode K_TO() { return getToken(MySQLParser.K_TO, 0); }
		public TerminalNode K_TRAILING() { return getToken(MySQLParser.K_TRAILING, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(MySQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(MySQLParser.K_TRIGGER, 0); }
		public TerminalNode K_TRIGGERS() { return getToken(MySQLParser.K_TRIGGERS, 0); }
		public TerminalNode K_TRUE() { return getToken(MySQLParser.K_TRUE, 0); }
		public TerminalNode K_TRUNCATE() { return getToken(MySQLParser.K_TRUNCATE, 0); }
		public TerminalNode K_TYPE() { return getToken(MySQLParser.K_TYPE, 0); }
		public TerminalNode K_TYPES() { return getToken(MySQLParser.K_TYPES, 0); }
		public TerminalNode K_UNCOMMITTED() { return getToken(MySQLParser.K_UNCOMMITTED, 0); }
		public TerminalNode K_UNDEFINED() { return getToken(MySQLParser.K_UNDEFINED, 0); }
		public TerminalNode K_UNDO() { return getToken(MySQLParser.K_UNDO, 0); }
		public TerminalNode K_UNDOFILE() { return getToken(MySQLParser.K_UNDOFILE, 0); }
		public TerminalNode K_UNDO_BUFFER_SIZE() { return getToken(MySQLParser.K_UNDO_BUFFER_SIZE, 0); }
		public TerminalNode K_UNICODE() { return getToken(MySQLParser.K_UNICODE, 0); }
		public TerminalNode K_UNINSTALL() { return getToken(MySQLParser.K_UNINSTALL, 0); }
		public TerminalNode K_UNION() { return getToken(MySQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(MySQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UNKNOWN() { return getToken(MySQLParser.K_UNKNOWN, 0); }
		public TerminalNode K_UNLOCK() { return getToken(MySQLParser.K_UNLOCK, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(MySQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_UNTIL() { return getToken(MySQLParser.K_UNTIL, 0); }
		public TerminalNode K_UPDATE() { return getToken(MySQLParser.K_UPDATE, 0); }
		public TerminalNode K_UPGRADE() { return getToken(MySQLParser.K_UPGRADE, 0); }
		public TerminalNode K_USAGE() { return getToken(MySQLParser.K_USAGE, 0); }
		public TerminalNode K_USE() { return getToken(MySQLParser.K_USE, 0); }
		public TerminalNode K_USER() { return getToken(MySQLParser.K_USER, 0); }
		public TerminalNode K_USER_RESOURCES() { return getToken(MySQLParser.K_USER_RESOURCES, 0); }
		public TerminalNode K_USE_FRM() { return getToken(MySQLParser.K_USE_FRM, 0); }
		public TerminalNode K_USING() { return getToken(MySQLParser.K_USING, 0); }
		public TerminalNode K_UTC_DATE() { return getToken(MySQLParser.K_UTC_DATE, 0); }
		public TerminalNode K_UTC_TIME() { return getToken(MySQLParser.K_UTC_TIME, 0); }
		public TerminalNode K_UTC_TIMESTAMP() { return getToken(MySQLParser.K_UTC_TIMESTAMP, 0); }
		public TerminalNode K_VALUE() { return getToken(MySQLParser.K_VALUE, 0); }
		public TerminalNode K_VALUES() { return getToken(MySQLParser.K_VALUES, 0); }
		public TerminalNode K_VARBINARY() { return getToken(MySQLParser.K_VARBINARY, 0); }
		public TerminalNode K_VARCHAR() { return getToken(MySQLParser.K_VARCHAR, 0); }
		public TerminalNode K_VARCHARACTER() { return getToken(MySQLParser.K_VARCHARACTER, 0); }
		public TerminalNode K_VARIABLES() { return getToken(MySQLParser.K_VARIABLES, 0); }
		public TerminalNode K_VARYING() { return getToken(MySQLParser.K_VARYING, 0); }
		public TerminalNode K_VIEW() { return getToken(MySQLParser.K_VIEW, 0); }
		public TerminalNode K_WAIT() { return getToken(MySQLParser.K_WAIT, 0); }
		public TerminalNode K_WARNINGS() { return getToken(MySQLParser.K_WARNINGS, 0); }
		public TerminalNode K_WEEK() { return getToken(MySQLParser.K_WEEK, 0); }
		public TerminalNode K_WHEN() { return getToken(MySQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(MySQLParser.K_WHERE, 0); }
		public TerminalNode K_WHILE() { return getToken(MySQLParser.K_WHILE, 0); }
		public TerminalNode K_WITH() { return getToken(MySQLParser.K_WITH, 0); }
		public TerminalNode K_WORK() { return getToken(MySQLParser.K_WORK, 0); }
		public TerminalNode K_WRAPPER() { return getToken(MySQLParser.K_WRAPPER, 0); }
		public TerminalNode K_WRITE() { return getToken(MySQLParser.K_WRITE, 0); }
		public TerminalNode K_X509() { return getToken(MySQLParser.K_X509, 0); }
		public TerminalNode K_XA() { return getToken(MySQLParser.K_XA, 0); }
		public TerminalNode K_XML() { return getToken(MySQLParser.K_XML, 0); }
		public TerminalNode K_XOR() { return getToken(MySQLParser.K_XOR, 0); }
		public TerminalNode K_YEAR() { return getToken(MySQLParser.K_YEAR, 0); }
		public TerminalNode K_YEAR_MONTH() { return getToken(MySQLParser.K_YEAR_MONTH, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(MySQLParser.K_ZEROFILL, 0); }
		public TerminalNode K_OFFLINE() { return getToken(MySQLParser.K_OFFLINE, 0); }
		public TerminalNode K_ONLINE() { return getToken(MySQLParser.K_ONLINE, 0); }
		public TerminalNode K_CAST() { return getToken(MySQLParser.K_CAST, 0); }
		public TerminalNode K_STATS_AUTO_RECALC() { return getToken(MySQLParser.K_STATS_AUTO_RECALC, 0); }
		public TerminalNode K_STATS_PERSISTENT() { return getToken(MySQLParser.K_STATS_PERSISTENT, 0); }
		public TerminalNode K_STATS_SAMPLE_PAGES() { return getToken(MySQLParser.K_STATS_SAMPLE_PAGES, 0); }
		public TerminalNode K_OJ() { return getToken(MySQLParser.K_OJ, 0); }
		public TerminalNode K_FORMAT() { return getToken(MySQLParser.K_FORMAT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ACCESSIBLE - 42)) | (1L << (K_ACTION - 42)) | (1L << (K_ADD - 42)) | (1L << (K_AFTER - 42)) | (1L << (K_AGAINST - 42)) | (1L << (K_AGGREGATE - 42)) | (1L << (K_ALGORITHM - 42)) | (1L << (K_ALL - 42)) | (1L << (K_ALTER - 42)) | (1L << (K_ANALYZE - 42)) | (1L << (K_AND - 42)) | (1L << (K_ANY - 42)) | (1L << (K_AS - 42)) | (1L << (K_ASC - 42)) | (1L << (K_ASCII - 42)) | (1L << (K_ASENSITIVE - 42)) | (1L << (K_AT - 42)) | (1L << (K_AUTHORS - 42)) | (1L << (K_AUTOEXTEND_SIZE - 42)) | (1L << (K_AUTO_INCREMENT - 42)) | (1L << (K_AVG - 42)) | (1L << (K_AVG_ROW_LENGTH - 42)) | (1L << (K_BACKUP - 42)) | (1L << (K_BEFORE - 42)) | (1L << (K_BEGIN - 42)) | (1L << (K_BETWEEN - 42)) | (1L << (K_BIGINT - 42)) | (1L << (K_BINARY - 42)) | (1L << (K_BINLOG - 42)) | (1L << (K_BIT - 42)) | (1L << (K_BLOB - 42)) | (1L << (K_BLOCK - 42)) | (1L << (K_BOOL - 42)) | (1L << (K_BOOLEAN - 42)) | (1L << (K_BOTH - 42)) | (1L << (K_BTREE - 42)) | (1L << (K_BY - 42)) | (1L << (K_BYTE - 42)) | (1L << (K_CACHE - 42)) | (1L << (K_CALL - 42)) | (1L << (K_CASCADE - 42)) | (1L << (K_CASCADED - 42)) | (1L << (K_CASE - 42)) | (1L << (K_CATALOG_NAME - 42)) | (1L << (K_CHAIN - 42)) | (1L << (K_CHANGE - 42)) | (1L << (K_CHANGED - 42)) | (1L << (K_CHAR - 42)) | (1L << (K_CHARACTER - 42)) | (1L << (K_CHARSET - 42)) | (1L << (K_CHECK - 42)) | (1L << (K_CHECKSUM - 42)) | (1L << (K_CIPHER - 42)) | (1L << (K_CLASS_ORIGIN - 42)) | (1L << (K_CLIENT - 42)) | (1L << (K_CLOSE - 42)) | (1L << (K_COALESCE - 42)) | (1L << (K_CODE - 42)) | (1L << (K_COLLATE - 42)) | (1L << (K_COLLATION - 42)) | (1L << (K_COLUMN - 42)) | (1L << (K_COLUMNS - 42)) | (1L << (K_COLUMN_NAME - 42)) | (1L << (K_COMMENT - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (K_COMMIT - 106)) | (1L << (K_COMMITTED - 106)) | (1L << (K_COMPACT - 106)) | (1L << (K_COMPLETION - 106)) | (1L << (K_COMPRESSED - 106)) | (1L << (K_CONCURRENT - 106)) | (1L << (K_CONDITION - 106)) | (1L << (K_CONNECTION - 106)) | (1L << (K_CONSISTENT - 106)) | (1L << (K_CONSTRAINT - 106)) | (1L << (K_CONSTRAINT_CATALOG - 106)) | (1L << (K_CONSTRAINT_NAME - 106)) | (1L << (K_CONSTRAINT_SCHEMA - 106)) | (1L << (K_CONTAINS - 106)) | (1L << (K_CONTEXT - 106)) | (1L << (K_CONTINUE - 106)) | (1L << (K_CONTRIBUTORS - 106)) | (1L << (K_CONVERT - 106)) | (1L << (K_CPU - 106)) | (1L << (K_CREATE - 106)) | (1L << (K_CROSS - 106)) | (1L << (K_CUBE - 106)) | (1L << (K_CURRENT_DATE - 106)) | (1L << (K_CURRENT_TIME - 106)) | (1L << (K_CURRENT_TIMESTAMP - 106)) | (1L << (K_CURRENT_USER - 106)) | (1L << (K_CURSOR - 106)) | (1L << (K_CURSOR_NAME - 106)) | (1L << (K_DATA - 106)) | (1L << (K_DATABASE - 106)) | (1L << (K_DATABASES - 106)) | (1L << (K_DATAFILE - 106)) | (1L << (K_DATE - 106)) | (1L << (K_DATETIME - 106)) | (1L << (K_DAY - 106)) | (1L << (K_DAY_HOUR - 106)) | (1L << (K_DAY_MICROSECOND - 106)) | (1L << (K_DAY_MINUTE - 106)) | (1L << (K_DAY_SECOND - 106)) | (1L << (K_DEALLOCATE - 106)) | (1L << (K_DEC - 106)) | (1L << (K_DECIMAL - 106)) | (1L << (K_DECLARE - 106)) | (1L << (K_DEFAULT - 106)) | (1L << (K_DEFINER - 106)) | (1L << (K_DELAYED - 106)) | (1L << (K_DELAY_KEY_WRITE - 106)) | (1L << (K_DELETE - 106)) | (1L << (K_DESC - 106)) | (1L << (K_DESCRIBE - 106)) | (1L << (K_DES_KEY_FILE - 106)) | (1L << (K_DETERMINISTIC - 106)) | (1L << (K_DIRECTORY - 106)) | (1L << (K_DISABLE - 106)) | (1L << (K_DISCARD - 106)) | (1L << (K_DISK - 106)) | (1L << (K_DISTINCT - 106)) | (1L << (K_DISTINCTROW - 106)) | (1L << (K_DIV - 106)) | (1L << (K_DO - 106)) | (1L << (K_DOUBLE - 106)) | (1L << (K_DROP - 106)) | (1L << (K_DUAL - 106)) | (1L << (K_DUMPFILE - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_DUPLICATE - 170)) | (1L << (K_DYNAMIC - 170)) | (1L << (K_EACH - 170)) | (1L << (K_ELSE - 170)) | (1L << (K_ELSEIF - 170)) | (1L << (K_ENABLE - 170)) | (1L << (K_ENCLOSED - 170)) | (1L << (K_END - 170)) | (1L << (K_ENDS - 170)) | (1L << (K_ENGINE - 170)) | (1L << (K_ENGINES - 170)) | (1L << (K_ENUM - 170)) | (1L << (K_ERROR - 170)) | (1L << (K_ERRORS - 170)) | (1L << (K_ESCAPE - 170)) | (1L << (K_ESCAPED - 170)) | (1L << (K_EVENT - 170)) | (1L << (K_EVENTS - 170)) | (1L << (K_EVERY - 170)) | (1L << (K_EXECUTE - 170)) | (1L << (K_EXISTS - 170)) | (1L << (K_EXIT - 170)) | (1L << (K_EXPANSION - 170)) | (1L << (K_EXPLAIN - 170)) | (1L << (K_EXTENDED - 170)) | (1L << (K_EXTENT_SIZE - 170)) | (1L << (K_FALSE - 170)) | (1L << (K_FAST - 170)) | (1L << (K_FAULTS - 170)) | (1L << (K_FETCH - 170)) | (1L << (K_FIELDS - 170)) | (1L << (K_FILE - 170)) | (1L << (K_FIRST - 170)) | (1L << (K_FIXED - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_FLUSH - 170)) | (1L << (K_FOR - 170)) | (1L << (K_FORCE - 170)) | (1L << (K_FOREIGN - 170)) | (1L << (K_FOUND - 170)) | (1L << (K_FRAC_SECOND - 170)) | (1L << (K_FROM - 170)) | (1L << (K_FULL - 170)) | (1L << (K_FULLTEXT - 170)) | (1L << (K_FUNCTION - 170)) | (1L << (K_GENERAL - 170)) | (1L << (K_GEOMETRY - 170)) | (1L << (K_GEOMETRYCOLLECTION - 170)) | (1L << (K_GET_FORMAT - 170)) | (1L << (K_GLOBAL - 170)) | (1L << (K_GRANT - 170)) | (1L << (K_GRANTS - 170)) | (1L << (K_GROUP - 170)) | (1L << (K_HANDLER - 170)) | (1L << (K_HASH - 170)) | (1L << (K_HAVING - 170)) | (1L << (K_HELP - 170)) | (1L << (K_HIGH_PRIORITY - 170)) | (1L << (K_HOST - 170)) | (1L << (K_HOSTS - 170)) | (1L << (K_HOUR - 170)) | (1L << (K_HOUR_MICROSECOND - 170)))) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (K_HOUR_MINUTE - 234)) | (1L << (K_HOUR_SECOND - 234)) | (1L << (K_IDENTIFIED - 234)) | (1L << (K_IF - 234)) | (1L << (K_IGNORE - 234)) | (1L << (K_IGNORE_SERVER_IDS - 234)) | (1L << (K_IMPORT - 234)) | (1L << (K_IN - 234)) | (1L << (K_INDEX - 234)) | (1L << (K_INDEXES - 234)) | (1L << (K_INFILE - 234)) | (1L << (K_INITIAL_SIZE - 234)) | (1L << (K_INNER - 234)) | (1L << (K_INNOBASE - 234)) | (1L << (K_INNODB - 234)) | (1L << (K_INOUT - 234)) | (1L << (K_INSENSITIVE - 234)) | (1L << (K_INSERT - 234)) | (1L << (K_INSERT_METHOD - 234)) | (1L << (K_INSTALL - 234)) | (1L << (K_INT - 234)) | (1L << (K_INTEGER - 234)) | (1L << (K_INTERVAL - 234)) | (1L << (K_INTO - 234)) | (1L << (K_INVOKER - 234)) | (1L << (K_IO - 234)) | (1L << (K_IO_THREAD - 234)) | (1L << (K_IPC - 234)) | (1L << (K_IS - 234)) | (1L << (K_ISOLATION - 234)) | (1L << (K_ISSUER - 234)) | (1L << (K_ITERATE - 234)) | (1L << (K_JSON - 234)) | (1L << (K_JOIN - 234)) | (1L << (K_KEY - 234)) | (1L << (K_KEYS - 234)) | (1L << (K_KEY_BLOCK_SIZE - 234)) | (1L << (K_KILL - 234)) | (1L << (K_LANGUAGE - 234)) | (1L << (K_LAST - 234)) | (1L << (K_LEADING - 234)) | (1L << (K_LEAVE - 234)) | (1L << (K_LEAVES - 234)) | (1L << (K_LEFT - 234)) | (1L << (K_LESS - 234)) | (1L << (K_LEVEL - 234)) | (1L << (K_LIKE - 234)) | (1L << (K_LIMIT - 234)) | (1L << (K_LINEAR - 234)) | (1L << (K_LINES - 234)) | (1L << (K_LINESTRING - 234)) | (1L << (K_LIST - 234)) | (1L << (K_LOAD - 234)) | (1L << (K_LOCAL - 234)) | (1L << (K_LOCALTIME - 234)) | (1L << (K_LOCALTIMESTAMP - 234)) | (1L << (K_LOCK - 234)) | (1L << (K_LOCKS - 234)) | (1L << (K_LOGFILE - 234)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (K_LOGS - 298)) | (1L << (K_LONG - 298)) | (1L << (K_LONGBLOB - 298)) | (1L << (K_LONGTEXT - 298)) | (1L << (K_LOOP - 298)) | (1L << (K_LOW_PRIORITY - 298)) | (1L << (K_MASTER - 298)) | (1L << (K_MASTER_CONNECT_RETRY - 298)) | (1L << (K_MASTER_HEARTBEAT_PERIOD - 298)) | (1L << (K_MASTER_HOST - 298)) | (1L << (K_MASTER_LOG_FILE - 298)) | (1L << (K_MASTER_LOG_POS - 298)) | (1L << (K_MASTER_PASSWORD - 298)) | (1L << (K_MASTER_PORT - 298)) | (1L << (K_MASTER_SERVER_ID - 298)) | (1L << (K_MASTER_SSL - 298)) | (1L << (K_MASTER_SSL_CA - 298)) | (1L << (K_MASTER_SSL_CAPATH - 298)) | (1L << (K_MASTER_SSL_CERT - 298)) | (1L << (K_MASTER_SSL_CIPHER - 298)) | (1L << (K_MASTER_SSL_KEY - 298)) | (1L << (K_MASTER_SSL_VERIFY_SERVER_CERT - 298)) | (1L << (K_MASTER_USER - 298)) | (1L << (K_MATCH - 298)) | (1L << (K_MAXVALUE - 298)) | (1L << (K_MAX_CONNECTIONS_PER_HOUR - 298)) | (1L << (K_MAX_QUERIES_PER_HOUR - 298)) | (1L << (K_MAX_ROWS - 298)) | (1L << (K_MAX_SIZE - 298)) | (1L << (K_MAX_UPDATES_PER_HOUR - 298)) | (1L << (K_MAX_USER_CONNECTIONS - 298)) | (1L << (K_MEDIUM - 298)) | (1L << (K_MEDIUMBLOB - 298)) | (1L << (K_MEDIUMINT - 298)) | (1L << (K_MEDIUMTEXT - 298)) | (1L << (K_MEMORY - 298)) | (1L << (K_MERGE - 298)) | (1L << (K_MESSAGE_TEXT - 298)) | (1L << (K_MICROSECOND - 298)) | (1L << (K_MIDDLEINT - 298)) | (1L << (K_MIGRATE - 298)) | (1L << (K_MINUTE - 298)) | (1L << (K_MINUTE_MICROSECOND - 298)) | (1L << (K_MINUTE_SECOND - 298)) | (1L << (K_MIN_ROWS - 298)) | (1L << (K_MOD - 298)) | (1L << (K_MODE - 298)) | (1L << (K_MODIFIES - 298)) | (1L << (K_MODIFY - 298)) | (1L << (K_MONTH - 298)) | (1L << (K_MULTILINESTRING - 298)) | (1L << (K_MULTIPOINT - 298)) | (1L << (K_MULTIPOLYGON - 298)) | (1L << (K_MUTEX - 298)) | (1L << (K_MYSQL_ERRNO - 298)) | (1L << (K_NAME - 298)) | (1L << (K_NAMES - 298)) | (1L << (K_NATIONAL - 298)) | (1L << (K_NATURAL - 298)) | (1L << (K_NCHAR - 298)) | (1L << (K_NDB - 298)) | (1L << (K_NDBCLUSTER - 298)) | (1L << (K_NEW - 298)) | (1L << (K_NEXT - 298)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (K_NO - 362)) | (1L << (K_NODEGROUP - 362)) | (1L << (K_NONE - 362)) | (1L << (K_NOT - 362)) | (1L << (K_NO_WAIT - 362)) | (1L << (K_NO_WRITE_TO_BINLOG - 362)) | (1L << (K_NULL - 362)) | (1L << (K_NUMERIC - 362)) | (1L << (K_NVARCHAR - 362)) | (1L << (K_OFFSET - 362)) | (1L << (K_OLD_PASSWORD - 362)) | (1L << (K_ON - 362)) | (1L << (K_ONE - 362)) | (1L << (K_ONE_SHOT - 362)) | (1L << (K_OPEN - 362)) | (1L << (K_OPTIMIZE - 362)) | (1L << (K_OPTION - 362)) | (1L << (K_OPTIONALLY - 362)) | (1L << (K_OPTIONS - 362)) | (1L << (K_OR - 362)) | (1L << (K_ORDER - 362)) | (1L << (K_OUT - 362)) | (1L << (K_OUTER - 362)) | (1L << (K_OUTFILE - 362)) | (1L << (K_OWNER - 362)) | (1L << (K_PACK_KEYS - 362)) | (1L << (K_PAGE - 362)) | (1L << (K_PARSER - 362)) | (1L << (K_PARTIAL - 362)) | (1L << (K_PARTITION - 362)) | (1L << (K_PARTITIONING - 362)) | (1L << (K_PARTITIONS - 362)) | (1L << (K_PASSWORD - 362)) | (1L << (K_PHASE - 362)) | (1L << (K_PLUGIN - 362)) | (1L << (K_PLUGINS - 362)) | (1L << (K_POINT - 362)) | (1L << (K_POLYGON - 362)) | (1L << (K_PORT - 362)) | (1L << (K_PRECISION - 362)) | (1L << (K_PREPARE - 362)) | (1L << (K_PRESERVE - 362)) | (1L << (K_PREV - 362)) | (1L << (K_PRIMARY - 362)) | (1L << (K_PRIVILEGES - 362)) | (1L << (K_PROCEDURE - 362)) | (1L << (K_PROCESSLIST - 362)) | (1L << (K_PROFILE - 362)) | (1L << (K_PROFILES - 362)) | (1L << (K_PROXY - 362)) | (1L << (K_PURGE - 362)) | (1L << (K_QUARTER - 362)) | (1L << (K_QUERY - 362)) | (1L << (K_QUICK - 362)) | (1L << (K_RANGE - 362)) | (1L << (K_READ - 362)) | (1L << (K_READS - 362)) | (1L << (K_READ_ONLY - 362)) | (1L << (K_READ_WRITE - 362)) | (1L << (K_REAL - 362)) | (1L << (K_REBUILD - 362)) | (1L << (K_RECOVER - 362)) | (1L << (K_REDOFILE - 362)) | (1L << (K_REDO_BUFFER_SIZE - 362)))) != 0) || ((((_la - 426)) & ~0x3f) == 0 && ((1L << (_la - 426)) & ((1L << (K_REDUNDANT - 426)) | (1L << (K_REFERENCES - 426)) | (1L << (K_REGEXP - 426)) | (1L << (K_RELAY - 426)) | (1L << (K_RELAYLOG - 426)) | (1L << (K_RELAY_LOG_FILE - 426)) | (1L << (K_RELAY_LOG_POS - 426)) | (1L << (K_RELAY_THREAD - 426)) | (1L << (K_RELEASE - 426)) | (1L << (K_RELOAD - 426)) | (1L << (K_REMOVE - 426)) | (1L << (K_RENAME - 426)) | (1L << (K_REORGANIZE - 426)) | (1L << (K_REPAIR - 426)) | (1L << (K_REPEAT - 426)) | (1L << (K_REPEATABLE - 426)) | (1L << (K_REPLACE - 426)) | (1L << (K_REPLICATION - 426)) | (1L << (K_REQUIRE - 426)) | (1L << (K_RESET - 426)) | (1L << (K_RESIGNAL - 426)) | (1L << (K_RESTORE - 426)) | (1L << (K_RESTRICT - 426)) | (1L << (K_RESUME - 426)) | (1L << (K_RETURN - 426)) | (1L << (K_RETURNS - 426)) | (1L << (K_REVOKE - 426)) | (1L << (K_RIGHT - 426)) | (1L << (K_RLIKE - 426)) | (1L << (K_ROLLBACK - 426)) | (1L << (K_ROLLUP - 426)) | (1L << (K_ROUTINE - 426)) | (1L << (K_ROW - 426)) | (1L << (K_ROWS - 426)) | (1L << (K_ROW_FORMAT - 426)) | (1L << (K_RTREE - 426)) | (1L << (K_SAVEPOINT - 426)) | (1L << (K_SCHEDULE - 426)) | (1L << (K_SCHEMA - 426)) | (1L << (K_SCHEMAS - 426)) | (1L << (K_SCHEMA_NAME - 426)) | (1L << (K_SECOND - 426)) | (1L << (K_SECOND_MICROSECOND - 426)) | (1L << (K_SECURITY - 426)) | (1L << (K_SELECT - 426)) | (1L << (K_SENSITIVE - 426)) | (1L << (K_SEPARATOR - 426)) | (1L << (K_SERIAL - 426)) | (1L << (K_SERIALIZABLE - 426)) | (1L << (K_SERVER - 426)) | (1L << (K_SESSION - 426)) | (1L << (K_SET - 426)) | (1L << (K_SHARE - 426)) | (1L << (K_SHOW - 426)) | (1L << (K_SHUTDOWN - 426)) | (1L << (K_SIGNAL - 426)) | (1L << (K_SIGNED - 426)) | (1L << (K_SIMPLE - 426)) | (1L << (K_SLAVE - 426)) | (1L << (K_SLOW - 426)) | (1L << (K_SMALLINT - 426)) | (1L << (K_SNAPSHOT - 426)) | (1L << (K_SOCKET - 426)) | (1L << (K_SOME - 426)))) != 0) || ((((_la - 490)) & ~0x3f) == 0 && ((1L << (_la - 490)) & ((1L << (K_SONAME - 490)) | (1L << (K_SOUNDS - 490)) | (1L << (K_SOURCE - 490)) | (1L << (K_SPATIAL - 490)) | (1L << (K_SPECIFIC - 490)) | (1L << (K_SQL - 490)) | (1L << (K_SQLEXCEPTION - 490)) | (1L << (K_SQLSTATE - 490)) | (1L << (K_SQLWARNING - 490)) | (1L << (K_SQL_BIG_RESULT - 490)) | (1L << (K_SQL_BUFFER_RESULT - 490)) | (1L << (K_SQL_CACHE - 490)) | (1L << (K_SQL_CALC_FOUND_ROWS - 490)) | (1L << (K_SQL_NO_CACHE - 490)) | (1L << (K_SQL_SMALL_RESULT - 490)) | (1L << (K_SQL_THREAD - 490)) | (1L << (K_SQL_TSI_DAY - 490)) | (1L << (K_SQL_TSI_FRAC_SECOND - 490)) | (1L << (K_SQL_TSI_HOUR - 490)) | (1L << (K_SQL_TSI_MINUTE - 490)) | (1L << (K_SQL_TSI_MONTH - 490)) | (1L << (K_SQL_TSI_QUARTER - 490)) | (1L << (K_SQL_TSI_SECOND - 490)) | (1L << (K_SQL_TSI_WEEK - 490)) | (1L << (K_SQL_TSI_YEAR - 490)) | (1L << (K_SSL - 490)) | (1L << (K_START - 490)) | (1L << (K_STARTING - 490)) | (1L << (K_STARTS - 490)) | (1L << (K_STATUS - 490)) | (1L << (K_STOP - 490)) | (1L << (K_STORAGE - 490)) | (1L << (K_STRAIGHT_JOIN - 490)) | (1L << (K_STRING - 490)) | (1L << (K_SUBCLASS_ORIGIN - 490)) | (1L << (K_SUBJECT - 490)) | (1L << (K_SUBPARTITION - 490)) | (1L << (K_SUBPARTITIONS - 490)) | (1L << (K_SUPER - 490)) | (1L << (K_SUSPEND - 490)) | (1L << (K_SWAPS - 490)) | (1L << (K_SWITCHES - 490)) | (1L << (K_TABLE - 490)) | (1L << (K_TABLES - 490)) | (1L << (K_TABLESPACE - 490)) | (1L << (K_TABLE_CHECKSUM - 490)) | (1L << (K_TABLE_NAME - 490)) | (1L << (K_TEMPORARY - 490)) | (1L << (K_TEMPTABLE - 490)) | (1L << (K_TERMINATED - 490)) | (1L << (K_TEXT - 490)) | (1L << (K_THAN - 490)) | (1L << (K_THEN - 490)) | (1L << (K_TIME - 490)) | (1L << (K_TIMESTAMP - 490)) | (1L << (K_TIMESTAMPADD - 490)) | (1L << (K_TIMESTAMPDIFF - 490)) | (1L << (K_TINYBLOB - 490)) | (1L << (K_TINYINT - 490)) | (1L << (K_TINYTEXT - 490)) | (1L << (K_TO - 490)) | (1L << (K_TRAILING - 490)) | (1L << (K_TRANSACTION - 490)) | (1L << (K_TRIGGER - 490)))) != 0) || ((((_la - 554)) & ~0x3f) == 0 && ((1L << (_la - 554)) & ((1L << (K_TRIGGERS - 554)) | (1L << (K_TRUE - 554)) | (1L << (K_TRUNCATE - 554)) | (1L << (K_TYPE - 554)) | (1L << (K_TYPES - 554)) | (1L << (K_UNCOMMITTED - 554)) | (1L << (K_UNDEFINED - 554)) | (1L << (K_UNDO - 554)) | (1L << (K_UNDOFILE - 554)) | (1L << (K_UNDO_BUFFER_SIZE - 554)) | (1L << (K_UNICODE - 554)) | (1L << (K_UNINSTALL - 554)) | (1L << (K_UNION - 554)) | (1L << (K_UNIQUE - 554)) | (1L << (K_UNKNOWN - 554)) | (1L << (K_UNLOCK - 554)) | (1L << (K_UNSIGNED - 554)) | (1L << (K_UNTIL - 554)) | (1L << (K_UPDATE - 554)) | (1L << (K_UPGRADE - 554)) | (1L << (K_USAGE - 554)) | (1L << (K_USE - 554)) | (1L << (K_USER - 554)) | (1L << (K_USER_RESOURCES - 554)) | (1L << (K_USE_FRM - 554)) | (1L << (K_USING - 554)) | (1L << (K_UTC_DATE - 554)) | (1L << (K_UTC_TIME - 554)) | (1L << (K_UTC_TIMESTAMP - 554)) | (1L << (K_VALUE - 554)) | (1L << (K_VALUES - 554)) | (1L << (K_VARBINARY - 554)) | (1L << (K_VARCHAR - 554)) | (1L << (K_VARCHARACTER - 554)) | (1L << (K_VARIABLES - 554)) | (1L << (K_VARYING - 554)) | (1L << (K_VIEW - 554)) | (1L << (K_WAIT - 554)) | (1L << (K_WARNINGS - 554)) | (1L << (K_WEEK - 554)) | (1L << (K_WHEN - 554)) | (1L << (K_WHERE - 554)) | (1L << (K_WHILE - 554)) | (1L << (K_WITH - 554)) | (1L << (K_WORK - 554)) | (1L << (K_WRAPPER - 554)) | (1L << (K_WRITE - 554)) | (1L << (K_X509 - 554)) | (1L << (K_XA - 554)) | (1L << (K_XML - 554)) | (1L << (K_XOR - 554)) | (1L << (K_YEAR - 554)) | (1L << (K_YEAR_MONTH - 554)) | (1L << (K_ZEROFILL - 554)) | (1L << (K_ONLINE - 554)) | (1L << (K_OFFLINE - 554)) | (1L << (K_FORMAT - 554)) | (1L << (K_CAST - 554)) | (1L << (K_STATS_AUTO_RECALC - 554)) | (1L << (K_STATS_PERSISTENT - 554)) | (1L << (K_STATS_SAMPLE_PAGES - 554)) | (1L << (K_OJ - 554)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2405);
				schema_name();
				setState(2406);
				match(T__33);
				}
				break;
			}
			setState(2412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(2410);
				identifier();
				}
				break;
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
				{
				setState(2411);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_column_name);
		try {
			setState(2419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				identifier();
				}
				break;
			case K_ACCESSIBLE:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_AGAINST:
			case K_AGGREGATE:
			case K_ALGORITHM:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_AS:
			case K_ASC:
			case K_ASCII:
			case K_ASENSITIVE:
			case K_AT:
			case K_AUTHORS:
			case K_AUTOEXTEND_SIZE:
			case K_AUTO_INCREMENT:
			case K_AVG:
			case K_AVG_ROW_LENGTH:
			case K_BACKUP:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BINLOG:
			case K_BIT:
			case K_BLOB:
			case K_BLOCK:
			case K_BOOL:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BTREE:
			case K_BY:
			case K_BYTE:
			case K_CACHE:
			case K_CALL:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CATALOG_NAME:
			case K_CHAIN:
			case K_CHANGE:
			case K_CHANGED:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARSET:
			case K_CHECK:
			case K_CHECKSUM:
			case K_CIPHER:
			case K_CLASS_ORIGIN:
			case K_CLIENT:
			case K_CLOSE:
			case K_COALESCE:
			case K_CODE:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMENT:
			case K_COMMIT:
			case K_COMMITTED:
			case K_COMPACT:
			case K_COMPLETION:
			case K_COMPRESSED:
			case K_CONCURRENT:
			case K_CONDITION:
			case K_CONNECTION:
			case K_CONSISTENT:
			case K_CONSTRAINT:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONTAINS:
			case K_CONTEXT:
			case K_CONTINUE:
			case K_CONTRIBUTORS:
			case K_CONVERT:
			case K_CPU:
			case K_CREATE:
			case K_CROSS:
			case K_CUBE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_DATA:
			case K_DATABASE:
			case K_DATABASES:
			case K_DATAFILE:
			case K_DATE:
			case K_DATETIME:
			case K_DAY:
			case K_DAY_HOUR:
			case K_DAY_MICROSECOND:
			case K_DAY_MINUTE:
			case K_DAY_SECOND:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFINER:
			case K_DELAYED:
			case K_DELAY_KEY_WRITE:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DES_KEY_FILE:
			case K_DETERMINISTIC:
			case K_DIRECTORY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISK:
			case K_DISTINCT:
			case K_DISTINCTROW:
			case K_DIV:
			case K_DO:
			case K_DOUBLE:
			case K_DROP:
			case K_DUAL:
			case K_DUMPFILE:
			case K_DUPLICATE:
			case K_DYNAMIC:
			case K_EACH:
			case K_ELSE:
			case K_ELSEIF:
			case K_ENABLE:
			case K_ENCLOSED:
			case K_END:
			case K_ENDS:
			case K_ENGINE:
			case K_ENGINES:
			case K_ENUM:
			case K_ERROR:
			case K_ERRORS:
			case K_ESCAPE:
			case K_ESCAPED:
			case K_EVENT:
			case K_EVENTS:
			case K_EVERY:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXIT:
			case K_EXPANSION:
			case K_EXPLAIN:
			case K_EXTENDED:
			case K_EXTENT_SIZE:
			case K_FALSE:
			case K_FAST:
			case K_FAULTS:
			case K_FETCH:
			case K_FIELDS:
			case K_FILE:
			case K_FIRST:
			case K_FIXED:
			case K_FLOAT:
			case K_FLUSH:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FOUND:
			case K_FRAC_SECOND:
			case K_FROM:
			case K_FULL:
			case K_FULLTEXT:
			case K_FUNCTION:
			case K_GENERAL:
			case K_GEOMETRY:
			case K_GEOMETRYCOLLECTION:
			case K_GET_FORMAT:
			case K_GLOBAL:
			case K_GRANT:
			case K_GRANTS:
			case K_GROUP:
			case K_HANDLER:
			case K_HASH:
			case K_HAVING:
			case K_HELP:
			case K_HIGH_PRIORITY:
			case K_HOST:
			case K_HOSTS:
			case K_HOUR:
			case K_HOUR_MICROSECOND:
			case K_HOUR_MINUTE:
			case K_HOUR_SECOND:
			case K_IDENTIFIED:
			case K_IF:
			case K_IGNORE:
			case K_IGNORE_SERVER_IDS:
			case K_IMPORT:
			case K_IN:
			case K_INDEX:
			case K_INDEXES:
			case K_INFILE:
			case K_INITIAL_SIZE:
			case K_INNER:
			case K_INNOBASE:
			case K_INNODB:
			case K_INOUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSERT_METHOD:
			case K_INSTALL:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IO:
			case K_IO_THREAD:
			case K_IPC:
			case K_IS:
			case K_ISOLATION:
			case K_ISSUER:
			case K_ITERATE:
			case K_JSON:
			case K_JOIN:
			case K_KEY:
			case K_KEYS:
			case K_KEY_BLOCK_SIZE:
			case K_KILL:
			case K_LANGUAGE:
			case K_LAST:
			case K_LEADING:
			case K_LEAVE:
			case K_LEAVES:
			case K_LEFT:
			case K_LESS:
			case K_LEVEL:
			case K_LIKE:
			case K_LIMIT:
			case K_LINEAR:
			case K_LINES:
			case K_LINESTRING:
			case K_LIST:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCK:
			case K_LOCKS:
			case K_LOGFILE:
			case K_LOGS:
			case K_LONG:
			case K_LONGBLOB:
			case K_LONGTEXT:
			case K_LOOP:
			case K_LOW_PRIORITY:
			case K_MASTER:
			case K_MASTER_CONNECT_RETRY:
			case K_MASTER_HEARTBEAT_PERIOD:
			case K_MASTER_HOST:
			case K_MASTER_LOG_FILE:
			case K_MASTER_LOG_POS:
			case K_MASTER_PASSWORD:
			case K_MASTER_PORT:
			case K_MASTER_SERVER_ID:
			case K_MASTER_SSL:
			case K_MASTER_SSL_CA:
			case K_MASTER_SSL_CAPATH:
			case K_MASTER_SSL_CERT:
			case K_MASTER_SSL_CIPHER:
			case K_MASTER_SSL_KEY:
			case K_MASTER_SSL_VERIFY_SERVER_CERT:
			case K_MASTER_USER:
			case K_MATCH:
			case K_MAXVALUE:
			case K_MAX_CONNECTIONS_PER_HOUR:
			case K_MAX_QUERIES_PER_HOUR:
			case K_MAX_ROWS:
			case K_MAX_SIZE:
			case K_MAX_UPDATES_PER_HOUR:
			case K_MAX_USER_CONNECTIONS:
			case K_MEDIUM:
			case K_MEDIUMBLOB:
			case K_MEDIUMINT:
			case K_MEDIUMTEXT:
			case K_MEMORY:
			case K_MERGE:
			case K_MESSAGE_TEXT:
			case K_MICROSECOND:
			case K_MIDDLEINT:
			case K_MIGRATE:
			case K_MINUTE:
			case K_MINUTE_MICROSECOND:
			case K_MINUTE_SECOND:
			case K_MIN_ROWS:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODIFY:
			case K_MONTH:
			case K_MULTILINESTRING:
			case K_MULTIPOINT:
			case K_MULTIPOLYGON:
			case K_MUTEX:
			case K_MYSQL_ERRNO:
			case K_NAME:
			case K_NAMES:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NDB:
			case K_NDBCLUSTER:
			case K_NEW:
			case K_NEXT:
			case K_NO:
			case K_NODEGROUP:
			case K_NONE:
			case K_NOT:
			case K_NO_WAIT:
			case K_NO_WRITE_TO_BINLOG:
			case K_NULL:
			case K_NUMERIC:
			case K_NVARCHAR:
			case K_OFFSET:
			case K_OLD_PASSWORD:
			case K_ON:
			case K_ONE:
			case K_ONE_SHOT:
			case K_OPEN:
			case K_OPTIMIZE:
			case K_OPTION:
			case K_OPTIONALLY:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_OUT:
			case K_OUTER:
			case K_OUTFILE:
			case K_OWNER:
			case K_PACK_KEYS:
			case K_PAGE:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PARTITIONING:
			case K_PARTITIONS:
			case K_PASSWORD:
			case K_PHASE:
			case K_PLUGIN:
			case K_PLUGINS:
			case K_POINT:
			case K_POLYGON:
			case K_PORT:
			case K_PRECISION:
			case K_PREPARE:
			case K_PRESERVE:
			case K_PREV:
			case K_PRIMARY:
			case K_PRIVILEGES:
			case K_PROCEDURE:
			case K_PROCESSLIST:
			case K_PROFILE:
			case K_PROFILES:
			case K_PROXY:
			case K_PURGE:
			case K_QUARTER:
			case K_QUERY:
			case K_QUICK:
			case K_RANGE:
			case K_READ:
			case K_READS:
			case K_READ_ONLY:
			case K_READ_WRITE:
			case K_REAL:
			case K_REBUILD:
			case K_RECOVER:
			case K_REDOFILE:
			case K_REDO_BUFFER_SIZE:
			case K_REDUNDANT:
			case K_REFERENCES:
			case K_REGEXP:
			case K_RELAY:
			case K_RELAYLOG:
			case K_RELAY_LOG_FILE:
			case K_RELAY_LOG_POS:
			case K_RELAY_THREAD:
			case K_RELEASE:
			case K_RELOAD:
			case K_REMOVE:
			case K_RENAME:
			case K_REORGANIZE:
			case K_REPAIR:
			case K_REPEAT:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICATION:
			case K_REQUIRE:
			case K_RESET:
			case K_RESIGNAL:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESUME:
			case K_RETURN:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_RLIKE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROW:
			case K_ROWS:
			case K_ROW_FORMAT:
			case K_RTREE:
			case K_SAVEPOINT:
			case K_SCHEDULE:
			case K_SCHEMA:
			case K_SCHEMAS:
			case K_SCHEMA_NAME:
			case K_SECOND:
			case K_SECOND_MICROSECOND:
			case K_SECURITY:
			case K_SELECT:
			case K_SENSITIVE:
			case K_SEPARATOR:
			case K_SERIAL:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SESSION:
			case K_SET:
			case K_SHARE:
			case K_SHOW:
			case K_SHUTDOWN:
			case K_SIGNAL:
			case K_SIGNED:
			case K_SIMPLE:
			case K_SLAVE:
			case K_SLOW:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOCKET:
			case K_SOME:
			case K_SONAME:
			case K_SOUNDS:
			case K_SOURCE:
			case K_SPATIAL:
			case K_SPECIFIC:
			case K_SQL:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_CACHE:
			case K_SQL_CALC_FOUND_ROWS:
			case K_SQL_NO_CACHE:
			case K_SQL_SMALL_RESULT:
			case K_SQL_THREAD:
			case K_SQL_TSI_DAY:
			case K_SQL_TSI_FRAC_SECOND:
			case K_SQL_TSI_HOUR:
			case K_SQL_TSI_MINUTE:
			case K_SQL_TSI_MONTH:
			case K_SQL_TSI_QUARTER:
			case K_SQL_TSI_SECOND:
			case K_SQL_TSI_WEEK:
			case K_SQL_TSI_YEAR:
			case K_SSL:
			case K_START:
			case K_STARTING:
			case K_STARTS:
			case K_STATUS:
			case K_STOP:
			case K_STORAGE:
			case K_STRAIGHT_JOIN:
			case K_STRING:
			case K_SUBCLASS_ORIGIN:
			case K_SUBJECT:
			case K_SUBPARTITION:
			case K_SUBPARTITIONS:
			case K_SUPER:
			case K_SUSPEND:
			case K_SWAPS:
			case K_SWITCHES:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESPACE:
			case K_TABLE_CHECKSUM:
			case K_TABLE_NAME:
			case K_TEMPORARY:
			case K_TEMPTABLE:
			case K_TERMINATED:
			case K_TEXT:
			case K_THAN:
			case K_THEN:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMESTAMPADD:
			case K_TIMESTAMPDIFF:
			case K_TINYBLOB:
			case K_TINYINT:
			case K_TINYTEXT:
			case K_TO:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRIGGERS:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TYPE:
			case K_TYPES:
			case K_UNCOMMITTED:
			case K_UNDEFINED:
			case K_UNDO:
			case K_UNDOFILE:
			case K_UNDO_BUFFER_SIZE:
			case K_UNICODE:
			case K_UNINSTALL:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLOCK:
			case K_UNSIGNED:
			case K_UNTIL:
			case K_UPDATE:
			case K_UPGRADE:
			case K_USAGE:
			case K_USE:
			case K_USER:
			case K_USER_RESOURCES:
			case K_USE_FRM:
			case K_USING:
			case K_UTC_DATE:
			case K_UTC_TIME:
			case K_UTC_TIMESTAMP:
			case K_VALUE:
			case K_VALUES:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARCHARACTER:
			case K_VARIABLES:
			case K_VARYING:
			case K_VIEW:
			case K_WAIT:
			case K_WARNINGS:
			case K_WEEK:
			case K_WHEN:
			case K_WHERE:
			case K_WHILE:
			case K_WITH:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_X509:
			case K_XA:
			case K_XML:
			case K_XOR:
			case K_YEAR:
			case K_YEAR_MONTH:
			case K_ZEROFILL:
			case K_ONLINE:
			case K_OFFLINE:
			case K_FORMAT:
			case K_CAST:
			case K_STATS_AUTO_RECALC:
			case K_STATS_PERSISTENT:
			case K_STATS_SAMPLE_PAGES:
			case K_OJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				keyword();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(2418);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalsContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public DecimalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDecimals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDecimals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDecimals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalsContext decimals() throws RecognitionException {
		DecimalsContext _localctx = new DecimalsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_decimals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(MySQLParser.INTEGER_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(MySQLParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(MySQLParser.UNQUOTED_IDENTIFIER, 0); }
		public TerminalNode UNDERLINE_STARTED_IDENTIFIER() { return getToken(MySQLParser.UNDERLINE_STARTED_IDENTIFIER, 0); }
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(MySQLParser.DOUBLE_QUOTED_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			_la = _input.LA(1);
			if ( !(((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (DOUBLE_QUOTED_STRING - 621)) | (1L << (QUOTED_IDENTIFIER - 621)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 621)) | (1L << (UNQUOTED_IDENTIFIER - 621)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return select_query_sempred((Select_queryContext)_localctx, predIndex);
		case 48:
			return table_reference_sempred((Table_referenceContext)_localctx, predIndex);
		case 81:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 90:
			return bit_expr_sempred((Bit_exprContext)_localctx, predIndex);
		case 91:
			return simple_expr_sempred((Simple_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean select_query_sempred(Select_queryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean table_reference_sempred(Table_referenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bit_expr_sempred(Bit_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simple_expr_sempred(Simple_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0277\u0984\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\7\2\u00e9\n"+
		"\2\f\2\16\2\u00ec\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00f4\n\4\f\4\16\4"+
		"\u00f7\13\4\3\4\3\4\6\4\u00fb\n\4\r\4\16\4\u00fc\3\4\7\4\u0100\n\4\f\4"+
		"\16\4\u0103\13\4\3\4\7\4\u0106\n\4\f\4\16\4\u0109\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0117\n\5\3\6\3\6\3\6\3\6\7\6\u011d"+
		"\n\6\f\6\16\6\u0120\13\6\3\6\3\6\3\6\5\6\u0125\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0139\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u0145\n\13\3\13\5\13\u0148"+
		"\n\13\3\13\3\13\3\13\5\13\u014d\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0155\n\13\f\13\16\13\u0158\13\13\3\13\3\13\5\13\u015c\n\13\3\13\3\13"+
		"\7\13\u0160\n\13\f\13\16\13\u0163\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\5\16\u0170\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0177"+
		"\n\16\3\17\3\17\5\17\u017b\n\17\3\17\3\17\3\17\5\17\u0180\n\17\3\17\3"+
		"\17\3\17\7\17\u0185\n\17\f\17\16\17\u0188\13\17\3\17\5\17\u018b\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0191\n\20\3\20\3\20\3\20\7\20\u0196\n\20\f\20"+
		"\16\20\u0199\13\20\3\20\5\20\u019c\n\20\3\21\3\21\5\21\u01a0\n\21\3\21"+
		"\3\21\3\21\3\21\5\21\u01a6\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ad\n"+
		"\21\f\21\16\21\u01b0\13\21\3\21\3\21\5\21\u01b4\n\21\3\21\5\21\u01b7\n"+
		"\21\3\21\3\21\5\21\u01bb\n\21\3\21\3\21\3\21\3\21\5\21\u01c1\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u01c8\n\21\f\21\16\21\u01cb\13\21\3\21\3\21"+
		"\5\21\u01cf\n\21\3\21\5\21\u01d2\n\21\3\21\5\21\u01d5\n\21\3\21\5\21\u01d8"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u01de\n\21\3\21\3\21\3\21\3\21\5\21\u01e4"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ee\n\21\5\21\u01f0"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01f7\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u01fe\n\22\5\22\u0200\n\22\3\22\3\22\3\22\3\22\7\22\u0206\n\22\f"+
		"\22\16\22\u0209\13\22\3\22\3\22\5\22\u020d\n\22\3\23\5\23\u0210\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0218\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u021e\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u022e\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u023a\n\23\5\23\u023c\n\23\3\24\5\24\u023f\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0247\n\24\3\24\3\24\3\24\3\24\5\24\u024d\n\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0253\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u025d\n\25\3\25\3\25\3\25\5\25\u0262\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0269\n\25\5\25\u026b\n\25\3\25\7\25\u026e\n\25\f\25\16"+
		"\25\u0271\13\25\3\25\3\25\3\25\3\25\7\25\u0277\n\25\f\25\16\25\u027a\13"+
		"\25\3\25\3\25\5\25\u027e\n\25\3\26\5\26\u0281\n\26\3\26\3\26\5\26\u0285"+
		"\n\26\3\26\3\26\3\26\5\26\u028a\n\26\3\26\3\26\3\26\3\26\5\26\u0290\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0296\n\26\3\26\3\26\3\26\5\26\u029b\n\26"+
		"\3\26\3\26\3\26\5\26\u02a0\n\26\3\26\3\26\3\26\5\26\u02a5\n\26\3\26\3"+
		"\26\3\26\5\26\u02aa\n\26\3\26\5\26\u02ad\n\26\3\27\3\27\3\27\7\27\u02b2"+
		"\n\27\f\27\16\27\u02b5\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u02c3\n\32\f\32\16\32\u02c6\13\32\3\32\5\32\u02c9"+
		"\n\32\3\33\3\33\5\33\u02cd\n\33\3\33\3\33\3\33\5\33\u02d2\n\33\7\33\u02d4"+
		"\n\33\f\33\16\33\u02d7\13\33\3\34\3\34\3\34\5\34\u02dc\n\34\3\34\3\34"+
		"\3\34\5\34\u02e1\n\34\3\34\3\34\3\34\3\34\5\34\u02e7\n\34\5\34\u02e9\n"+
		"\34\3\34\3\34\3\34\5\34\u02ee\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02f6\n\34\3\34\3\34\3\34\3\34\5\34\u02fc\n\34\3\34\3\34\5\34\u0300\n"+
		"\34\3\35\3\35\5\35\u0304\n\35\3\35\5\35\u0307\n\35\3\35\5\35\u030a\n\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0310\n\35\3\35\3\35\3\36\3\36\5\36\u0316\n"+
		"\36\3\36\3\36\3\36\7\36\u031b\n\36\f\36\16\36\u031e\13\36\3\36\5\36\u0321"+
		"\n\36\3\36\3\36\3\36\5\36\u0326\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u032e\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u0335\n\36\7\36\u0337\n\36\f"+
		"\36\16\36\u033a\13\36\3\36\5\36\u033d\n\36\5\36\u033f\n\36\3\37\3\37\5"+
		"\37\u0343\n\37\3\37\5\37\u0346\n\37\3\37\5\37\u0349\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0350\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0357\n\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0365\n \f \16 \u0368\13 \3!\3!"+
		"\3!\5!\u036d\n!\3!\3!\3!\5!\u0372\n!\7!\u0374\n!\f!\16!\u0377\13!\3!\3"+
		"!\3\"\3\"\5\"\u037d\n\"\3\"\5\"\u0380\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0388\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u038f\n\"\7\"\u0391\n\"\f\"\16\"\u0394"+
		"\13\"\3\"\3\"\5\"\u0398\n\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\5$\u03a4\n"+
		"$\3$\3$\3$\3$\6$\u03aa\n$\r$\16$\u03ab\3$\5$\u03af\n$\3$\3$\7$\u03b3\n"+
		"$\f$\16$\u03b6\13$\3$\3$\3$\7$\u03bb\n$\f$\16$\u03be\13$\3$\3$\5$\u03c2"+
		"\n$\3$\3$\5$\u03c6\n$\5$\u03c8\n$\3$\3$\3$\3$\3$\3$\5$\u03d0\n$\3$\3$"+
		"\3$\3$\3$\3$\5$\u03d8\n$\5$\u03da\n$\3$\3$\3$\5$\u03df\n$\3$\6$\u03e2"+
		"\n$\r$\16$\u03e3\7$\u03e6\n$\f$\16$\u03e9\13$\3%\3%\3%\3%\3%\5%\u03f0"+
		"\n%\3%\5%\u03f3\n%\3%\3%\3%\3%\5%\u03f9\n%\3%\5%\u03fc\n%\7%\u03fe\n%"+
		"\f%\16%\u0401\13%\3%\3%\3%\3%\5%\u0407\n%\3%\3%\3%\3%\3%\5%\u040e\n%\5"+
		"%\u0410\n%\3&\3&\5&\u0414\n&\3\'\3\'\3\'\7\'\u0419\n\'\f\'\16\'\u041c"+
		"\13\'\3(\3(\3(\3(\3(\3(\5(\u0424\n(\3)\3)\3)\3)\5)\u042a\n)\3)\3)\3)\3"+
		")\3)\5)\u0431\n)\3)\5)\u0434\n)\3)\3)\3)\3)\5)\u043a\n)\3)\5)\u043d\n"+
		")\7)\u043f\n)\f)\16)\u0442\13)\3)\3)\5)\u0446\n)\5)\u0448\n)\3)\3)\5)"+
		"\u044c\n)\3)\5)\u044f\n)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0459\n*\3+\3+\3+"+
		"\7+\u045e\n+\f+\16+\u0461\13+\3,\3,\3-\3-\3.\3.\3/\3/\5/\u046b\n/\3/\3"+
		"/\5/\u046f\n/\3\60\3\60\3\60\7\60\u0474\n\60\f\60\16\60\u0477\13\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u047f\n\61\3\62\3\62\3\62\5\62\u0484"+
		"\n\62\3\62\3\62\5\62\u0488\n\62\3\62\5\62\u048b\n\62\3\62\3\62\3\62\3"+
		"\62\7\62\u0491\n\62\f\62\16\62\u0494\13\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u049c\n\63\3\63\5\63\u049f\n\63\3\63\5\63\u04a2\n\63\3\63\5\63"+
		"\u04a5\n\63\3\63\3\63\5\63\u04a9\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5"+
		"\63\u04b1\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04b9\n\63\3\64\3\64"+
		"\3\64\7\64\u04be\n\64\f\64\16\64\u04c1\13\64\3\65\3\65\7\65\u04c5\n\65"+
		"\f\65\16\65\u04c8\13\65\3\66\5\66\u04cb\n\66\3\66\3\66\3\66\5\66\u04d0"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u04dc\n\66"+
		"\5\66\u04de\n\66\3\66\3\66\5\66\u04e2\n\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u04eb\n\67\38\38\38\78\u04f0\n8\f8\168\u04f3\138\39\39\3"+
		"9\39\39\39\39\39\59\u04fd\n9\59\u04ff\n9\39\39\59\u0503\n9\39\39\39\3"+
		"9\39\39\39\39\39\59\u050e\n9\59\u0510\n9\39\39\59\u0514\n9\39\39\39\3"+
		"9\39\39\39\39\39\59\u051f\n9\59\u0521\n9\39\39\59\u0525\n9\39\59\u0528"+
		"\n9\3:\3:\3:\7:\u052d\n:\f:\16:\u0530\13:\3;\3;\3<\3<\3<\7<\u0537\n<\f"+
		"<\16<\u053a\13<\3=\3=\3>\3>\3>\3>\5>\u0542\n>\3>\5>\u0545\n>\3>\3>\3>"+
		"\5>\u054a\n>\3>\3>\3>\3>\7>\u0550\n>\f>\16>\u0553\13>\3>\3>\7>\u0557\n"+
		">\f>\16>\u055a\13>\3>\3>\5>\u055e\n>\3>\5>\u0561\n>\3>\3>\3>\3>\7>\u0567"+
		"\n>\f>\16>\u056a\13>\3>\3>\7>\u056e\n>\f>\16>\u0571\13>\3>\5>\u0574\n"+
		">\3>\5>\u0577\n>\3>\3>\5>\u057b\n>\3>\5>\u057e\n>\3>\5>\u0581\n>\3>\3"+
		">\3>\3>\7>\u0587\n>\f>\16>\u058a\13>\3>\3>\7>\u058e\n>\f>\16>\u0591\13"+
		">\3>\3>\5>\u0595\n>\3>\5>\u0598\n>\3>\3>\3>\3>\7>\u059e\n>\f>\16>\u05a1"+
		"\13>\3>\3>\7>\u05a5\n>\f>\16>\u05a8\13>\3>\3>\5>\u05ac\n>\3>\5>\u05af"+
		"\n>\3>\3>\3>\3>\7>\u05b5\n>\f>\16>\u05b8\13>\3>\3>\7>\u05bc\n>\f>\16>"+
		"\u05bf\13>\3>\5>\u05c2\n>\3>\5>\u05c5\n>\3>\3>\3>\5>\u05ca\n>\3>\3>\3"+
		">\3>\7>\u05d0\n>\f>\16>\u05d3\13>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u05dd\n>"+
		"\3?\3?\7?\u05e1\n?\f?\16?\u05e4\13?\3@\5@\u05e7\n@\3@\3@\3@\3@\5@\u05ed"+
		"\n@\3@\5@\u05f0\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\7@\u0607\n@\f@\16@\u060a\13@\5@\u060c\n@\3A\3A\3A\3A\3A\5"+
		"A\u0613\nA\3A\3A\3A\3A\3A\3A\3A\5A\u061c\nA\3A\5A\u061f\nA\3A\5A\u0622"+
		"\nA\3A\3A\3A\3A\3A\5A\u0629\nA\3A\5A\u062c\nA\3A\5A\u062f\nA\3A\3A\3A"+
		"\3A\3A\5A\u0636\nA\3A\5A\u0639\nA\3A\5A\u063c\nA\3A\3A\3A\3A\3A\5A\u0643"+
		"\nA\3A\5A\u0646\nA\3A\5A\u0649\nA\3A\3A\3A\3A\3A\5A\u0650\nA\3A\5A\u0653"+
		"\nA\3A\5A\u0656\nA\3A\3A\3A\3A\3A\5A\u065d\nA\3A\5A\u0660\nA\3A\5A\u0663"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\5A\u066c\nA\3A\5A\u066f\nA\3A\5A\u0672\nA\3A"+
		"\3A\3A\3A\3A\3A\3A\5A\u067b\nA\3A\5A\u067e\nA\3A\5A\u0681\nA\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u068a\nA\3A\5A\u068d\nA\3A\5A\u0690\nA\3A\3A\3A\3A\3A"+
		"\3A\3A\5A\u0699\nA\3A\5A\u069c\nA\3A\5A\u069f\nA\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u06a8\nA\3A\5A\u06ab\nA\3A\5A\u06ae\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\5A\u06ba\nA\3A\5A\u06bd\nA\3A\3A\3A\5A\u06c2\nA\3A\3A\3A\3A\3A\5A"+
		"\u06c9\nA\3A\5A\u06cc\nA\3A\3A\3A\5A\u06d1\nA\3A\3A\3A\3A\3A\5A\u06d8"+
		"\nA\3A\3A\3A\3A\3A\5A\u06df\nA\3A\3A\3A\3A\3A\3A\5A\u06e7\nA\3A\3A\3A"+
		"\5A\u06ec\nA\3A\3A\5A\u06f0\nA\3A\3A\3A\5A\u06f5\nA\3A\3A\5A\u06f9\nA"+
		"\3A\3A\3A\5A\u06fe\nA\3A\3A\5A\u0702\nA\3A\3A\3A\5A\u0707\nA\3A\3A\3A"+
		"\3A\3A\5A\u070e\nA\3A\3A\3A\3A\5A\u0714\nA\3A\3A\3A\3A\3A\5A\u071b\nA"+
		"\3A\3A\3A\3A\5A\u0721\nA\3A\3A\5A\u0725\nA\3B\3B\3C\3C\3C\3C\3C\5C\u072e"+
		"\nC\3C\5C\u0731\nC\3D\3D\3D\3E\3E\5E\u0738\nE\3E\3E\3E\3E\3E\3E\3E\5E"+
		"\u0741\nE\3F\3F\3F\3F\3F\3F\7F\u0749\nF\fF\16F\u074c\13F\3F\3F\7F\u0750"+
		"\nF\fF\16F\u0753\13F\3G\3G\3G\3G\3G\3G\3G\3G\5G\u075d\nG\3H\3H\3I\3I\3"+
		"J\3J\3J\3J\3J\3J\5J\u0769\nJ\3K\3K\5K\u076d\nK\3K\7K\u0770\nK\fK\16K\u0773"+
		"\13K\3L\3L\5L\u0777\nL\3L\3L\3L\5L\u077c\nL\3L\3L\3L\5L\u0781\nL\3L\3"+
		"L\5L\u0785\nL\3L\3L\3L\5L\u078a\nL\3L\5L\u078d\nL\3L\3L\3L\3L\3L\5L\u0794"+
		"\nL\3L\3L\5L\u0798\nL\3L\3L\3L\5L\u079d\nL\3L\3L\3L\5L\u07a2\nL\3L\3L"+
		"\3L\3L\5L\u07a8\nL\3L\3L\3L\5L\u07ad\nL\3L\3L\3L\3L\5L\u07b3\nL\3L\3L"+
		"\3L\5L\u07b8\nL\3L\3L\3L\5L\u07bd\nL\3L\3L\3L\5L\u07c2\nL\3L\3L\3L\5L"+
		"\u07c7\nL\3L\3L\3L\5L\u07cc\nL\3L\3L\5L\u07d0\nL\3L\3L\5L\u07d4\nL\3L"+
		"\3L\3L\5L\u07d9\nL\3L\3L\3L\5L\u07de\nL\3L\3L\5L\u07e2\nL\3L\3L\5L\u07e6"+
		"\nL\3L\3L\5L\u07ea\nL\3L\3L\5L\u07ee\nL\3L\3L\3L\3L\3L\5L\u07f5\nL\3L"+
		"\3L\5L\u07f9\nL\3L\3L\3L\3L\7L\u07ff\nL\fL\16L\u0802\13L\3L\3L\5L\u0806"+
		"\nL\3M\3M\5M\u080a\nM\3N\3N\5N\u080e\nN\3O\3O\3O\5O\u0813\nO\3P\3P\5P"+
		"\u0817\nP\3Q\3Q\5Q\u081b\nQ\3R\3R\3S\3S\3S\3S\3S\3S\5S\u0825\nS\3S\3S"+
		"\5S\u0829\nS\3S\3S\3S\3S\5S\u082f\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\7S\u083a"+
		"\nS\fS\16S\u083d\13S\3T\3T\3T\3T\3T\3T\3T\3U\3U\5U\u0848\nU\3U\3U\3U\3"+
		"U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u085a\nV\3W\3W\5W\u085e\nW\3"+
		"W\3W\3W\3W\3W\3W\3W\5W\u0867\nW\3W\3W\3W\3W\3W\5W\u086e\nW\3W\3W\5W\u0872"+
		"\nW\3X\3X\5X\u0876\nX\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0880\nZ\3Z\3Z\3[\3["+
		"\3[\3[\3[\3[\3[\5[\u088b\n[\3[\3[\3[\3[\5[\u0891\n[\5[\u0893\n[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\7\\\u08aa\n\\\f\\\16\\\u08ad\13\\\3]\3]\3]\3]\3]\3]\3]\3]\5]"+
		"\u08b7\n]\3]\3]\3]\3]\3]\3]\5]\u08bf\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\5]\u08d3\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\5]\u08e1\n]\3]\3]\3]\7]\u08e6\n]\f]\16]\u08e9\13]\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\7^\u08f6\n^\f^\16^\u08f9\13^\3^\3^\5^\u08fd\n^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u090b\n^\f^\16^\u090e\13^\3^\3^\5^\u0912"+
		"\n^\3^\3^\5^\u0916\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0921\n_\f_\16_\u0924"+
		"\13_\3_\3_\5_\u0928\n_\3`\3`\3`\3`\3a\3a\3b\3b\3b\3b\3b\3b\3b\5b\u0937"+
		"\nb\3c\3c\3d\3d\5d\u093d\nd\3d\3d\3d\5d\u0942\nd\3d\3d\5d\u0946\nd\3e"+
		"\5e\u0949\ne\3e\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\5h\u0960\nh\3i\3i\5i\u0964\ni\3j\3j\3k\3k\3k\5k\u096b\nk\3k\3k"+
		"\5k\u096f\nk\3l\3l\3m\3m\3m\5m\u0976\nm\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r"+
		"\3s\3s\3s\2\7Fb\u00a4\u00b6\u00b8t\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\2.\4\2\u00df\u00df\u01de\u01de\3\2\6\b\3\2\u0262\u0263\5\2\u00d9"+
		"\u00d9\u01ef\u01ef\u0239\u0239\4\2()\u0097\u0097\5\2*+\u0097\u0097\u016e"+
		"\u016e\4\2TT\u01c2\u01c2\4\2\u00f0\u00f0\u01bc\u01bc\5\2\u0150\u0150\u021c"+
		"\u021c\u0232\u0232\4\2\u0098\u0098\u0109\u0109\4\2UU\u0126\u0126\3\2\u0249"+
		"\u024a\4\2\u0099\u0099\u0131\u0131\4\2\63\63\u00a4\u00a4\4\299\u009c\u009c"+
		"\4\2\63\63\u00a4\u00a5\4\2\u01f5\u01f6\u01fa\u01fa\4\2\u01f7\u01f7\u01f9"+
		"\u01f9\4\2\u011c\u011c\u01c7\u01c7\4\2\u0080\u0080\u00f8\u00f8\4\2\u00f4"+
		"\u00f4\u0113\u0113\5\2\u0097\u0097\u00ad\u00ad\u00cd\u00cd\5\2\u0097\u0097"+
		"\u00a3\u00a3\u014f\u014f\6\2\u00dc\u00dd\u0123\u0123\u015e\u0160\u0190"+
		"\u0191\4\2OO\u00e4\u00e4\5\2\u00d8\u00d8\u0188\u0188\u01e5\u01e5\5\2\u00cc"+
		"\u00cc\u0118\u0118\u016c\u016c\b\2nnpp\u0097\u0097\u00ad\u00ad\u00cd\u00cd"+
		"\u01ac\u01ac\4\2\17\17\u016f\u016f\4\2\20\20\66\66\4\2\21\21\u017f\u017f"+
		"\4\2\63\63\67\67\4\2\5\5\22\30\6\2\u00c6\u00c6\u0172\u0172\u022d\u022d"+
		"\u023a\u023a\4\2\f\f\32\35\3\2\36\37\3\2 !\4\2\36\37&&\13\2\u008e\u0092"+
		"\u00ea\u00ed\u0152\u0152\u0155\u0157\u015d\u015d\u019f\u019f\u01d5\u01d6"+
		"\u0253\u0253\u025f\u0260\4\2\u00c6\u00c6\u022d\u022d\3\2\u026c\u026e\4"+
		"\2\u008c\u008c\u0221\u0222\5\2,\u00ce\u00d1\u0100\u0106\u0269\4\2\u026f"+
		"\u026f\u0271\u0273\2\u0b14\2\u00ea\3\2\2\2\4\u00ef\3\2\2\2\6\u00f5\3\2"+
		"\2\2\b\u0116\3\2\2\2\n\u0124\3\2\2\2\f\u0138\3\2\2\2\16\u013a\3\2\2\2"+
		"\20\u013d\3\2\2\2\22\u013f\3\2\2\2\24\u0142\3\2\2\2\26\u0164\3\2\2\2\30"+
		"\u0168\3\2\2\2\32\u016c\3\2\2\2\34\u0178\3\2\2\2\36\u018c\3\2\2\2 \u01ef"+
		"\3\2\2\2\"\u01f1\3\2\2\2$\u023b\3\2\2\2&\u0252\3\2\2\2(\u0254\3\2\2\2"+
		"*\u02ac\3\2\2\2,\u02ae\3\2\2\2.\u02b6\3\2\2\2\60\u02b8\3\2\2\2\62\u02c8"+
		"\3\2\2\2\64\u02cc\3\2\2\2\66\u02d8\3\2\2\28\u0301\3\2\2\2:\u033e\3\2\2"+
		"\2<\u0340\3\2\2\2>\u0358\3\2\2\2@\u0369\3\2\2\2B\u037a\3\2\2\2D\u039b"+
		"\3\2\2\2F\u03d9\3\2\2\2H\u03ea\3\2\2\2J\u0413\3\2\2\2L\u0415\3\2\2\2N"+
		"\u0423\3\2\2\2P\u0425\3\2\2\2R\u0458\3\2\2\2T\u045a\3\2\2\2V\u0462\3\2"+
		"\2\2X\u0464\3\2\2\2Z\u0466\3\2\2\2\\\u046a\3\2\2\2^\u0470\3\2\2\2`\u047e"+
		"\3\2\2\2b\u0483\3\2\2\2d\u04b8\3\2\2\2f\u04ba\3\2\2\2h\u04c2\3\2\2\2j"+
		"\u04e1\3\2\2\2l\u04ea\3\2\2\2n\u04ec\3\2\2\2p\u0527\3\2\2\2r\u0529\3\2"+
		"\2\2t\u0531\3\2\2\2v\u0533\3\2\2\2x\u053b\3\2\2\2z\u05dc\3\2\2\2|\u05de"+
		"\3\2\2\2~\u060b\3\2\2\2\u0080\u0724\3\2\2\2\u0082\u0726\3\2\2\2\u0084"+
		"\u0728\3\2\2\2\u0086\u0732\3\2\2\2\u0088\u0740\3\2\2\2\u008a\u0742\3\2"+
		"\2\2\u008c\u075c\3\2\2\2\u008e\u075e\3\2\2\2\u0090\u0760\3\2\2\2\u0092"+
		"\u0768\3\2\2\2\u0094\u076a\3\2\2\2\u0096\u0805\3\2\2\2\u0098\u0809\3\2"+
		"\2\2\u009a\u080d\3\2\2\2\u009c\u0812\3\2\2\2\u009e\u0816\3\2\2\2\u00a0"+
		"\u081a\3\2\2\2\u00a2\u081c\3\2\2\2\u00a4\u082e\3\2\2\2\u00a6\u083e\3\2"+
		"\2\2\u00a8\u0845\3\2\2\2\u00aa\u0859\3\2\2\2\u00ac\u0871\3\2\2\2\u00ae"+
		"\u0873\3\2\2\2\u00b0\u087a\3\2\2\2\u00b2\u087c\3\2\2\2\u00b4\u0892\3\2"+
		"\2\2\u00b6\u0894\3\2\2\2\u00b8\u08e0\3\2\2\2\u00ba\u0915\3\2\2\2\u00bc"+
		"\u0927\3\2\2\2\u00be\u0929\3\2\2\2\u00c0\u092d\3\2\2\2\u00c2\u0936\3\2"+
		"\2\2\u00c4\u0938\3\2\2\2\u00c6\u0945\3\2\2\2\u00c8\u0948\3\2\2\2\u00ca"+
		"\u094e\3\2\2\2\u00cc\u0953\3\2\2\2\u00ce\u095f\3\2\2\2\u00d0\u0963\3\2"+
		"\2\2\u00d2\u0965\3\2\2\2\u00d4\u096a\3\2\2\2\u00d6\u0970\3\2\2\2\u00d8"+
		"\u0975\3\2\2\2\u00da\u0977\3\2\2\2\u00dc\u0979\3\2\2\2\u00de\u097b\3\2"+
		"\2\2\u00e0\u097d\3\2\2\2\u00e2\u097f\3\2\2\2\u00e4\u0981\3\2\2\2\u00e6"+
		"\u00e9\5\6\4\2\u00e7\u00e9\5\4\3\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\2\2\3\u00ee\3\3\2\2\2"+
		"\u00ef\u00f0\7\u0277\2\2\u00f0\u00f1\b\3\1\2\u00f1\5\3\2\2\2\u00f2\u00f4"+
		"\7\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0101\5\b"+
		"\5\2\u00f9\u00fb\7\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\5\b"+
		"\5\2\u00ff\u00fa\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0107\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\7\3"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\7\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0117\5\24\13"+
		"\2\u010b\u0117\5 \21\2\u010c\u0117\5\66\34\2\u010d\u0117\58\35\2\u010e"+
		"\u0117\5\32\16\2\u010f\u0117\5\34\17\2\u0110\u0117\5\36\20\2\u0111\u0117"+
		"\5:\36\2\u0112\u0117\5D#\2\u0113\u0117\5B\"\2\u0114\u0117\5\n\6\2\u0115"+
		"\u0117\5\22\n\2\u0116\u010a\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3"+
		"\2\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116"+
		"\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\t\3\2\2\2\u0118\u0119"+
		"\7\u01df\2\2\u0119\u011e\5\f\7\2\u011a\u011b\7\4\2\2\u011b\u011d\5\f\7"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\u01df\2"+
		"\2\u0122\u0123\7\u0179\2\2\u0123\u0125\5\u00a4S\2\u0124\u0118\3\2\2\2"+
		"\u0124\u0121\3\2\2\2\u0125\13\3\2\2\2\u0126\u0127\5\16\b\2\u0127\u0128"+
		"\7\5\2\2\u0128\u0129\5\u00a4S\2\u0129\u0139\3\2\2\2\u012a\u012b\5\20\t"+
		"\2\u012b\u012c\7\5\2\2\u012c\u012d\5\u00a4S\2\u012d\u0139\3\2\2\2\u012e"+
		"\u012f\t\2\2\2\u012f\u0130\5\20\t\2\u0130\u0131\7\5\2\2\u0131\u0132\5"+
		"\u00a4S\2\u0132\u0139\3\2\2\2\u0133\u0134\t\3\2\2\u0134\u0135\5\20\t\2"+
		"\u0135\u0136\7\5\2\2\u0136\u0137\5\u00a4S\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0126\3\2\2\2\u0138\u012a\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0133\3\2"+
		"\2\2\u0139\r\3\2\2\2\u013a\u013b\7\t\2\2\u013b\u013c\5\20\t\2\u013c\17"+
		"\3\2\2\2\u013d\u013e\7\u0273\2\2\u013e\21\3\2\2\2\u013f\u0140\7\u0241"+
		"\2\2\u0140\u0141\5\u00a2R\2\u0141\23\3\2\2\2\u0142\u0144\7\177\2\2\u0143"+
		"\u0145\t\4\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7\u00f4\2\2\u014a\u014c\5\u00dan\2\u014b\u014d"+
		"\5\u0086D\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u014f\7\u0177\2\2\u014f\u0150\5\u00d4k\2\u0150\u0151\7\n\2\2"+
		"\u0151\u0156\5\u0084C\2\u0152\u0153\7\4\2\2\u0153\u0155\5\u0084C\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\7\13\2\2\u015a"+
		"\u015c\5\u0088E\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0161"+
		"\3\2\2\2\u015d\u0160\5\26\f\2\u015e\u0160\5\30\r\2\u015f\u015d\3\2\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\25\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\62\2\2\u0165"+
		"\u0166\7\5\2\2\u0166\u0167\t\6\2\2\u0167\27\3\2\2\2\u0168\u0169\7\u0129"+
		"\2\2\u0169\u016a\7\5\2\2\u016a\u016b\t\7\2\2\u016b\31\3\2\2\2\u016c\u016d"+
		"\7\u00a9\2\2\u016d\u016f\7\u00f4\2\2\u016e\u0170\t\4\2\2\u016f\u016e\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\5\u00dan\2"+
		"\u0172\u0173\7\u0177\2\2\u0173\u0176\5\u00d4k\2\u0174\u0177\5\26\f\2\u0175"+
		"\u0177\5\30\r\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\33\3\2\2\2\u0178\u017a\7\u00a9\2\2\u0179\u017b\7\u021b\2"+
		"\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f"+
		"\7\u0216\2\2\u017d\u017e\7\u00ef\2\2\u017e\u0180\7\u00c0\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0186\5\u00d4k"+
		"\2\u0182\u0183\7\4\2\2\u0183\u0185\5\u00d4k\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018b\t\b\2\2\u018a\u0189\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\35\3\2\2\2\u018c\u018d\7\u00a9\2\2\u018d\u0190\7"+
		"\u0250\2\2\u018e\u018f\7\u00ef\2\2\u018f\u0191\7\u00c0\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0197\5x=\2\u0193"+
		"\u0194\7\4\2\2\u0194\u0196\5x=\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2"+
		"\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019c\t\b\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\37\3\2\2\2\u019d\u019f\7\177\2\2\u019e\u01a0\7\u021b\2\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\7\u0216\2"+
		"\2\u01a2\u01a3\7\u00ef\2\2\u01a3\u01a4\7\u016f\2\2\u01a4\u01a6\7\u00c0"+
		"\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\5\u00d4k\2\u01a8\u01a9\7\n\2\2\u01a9\u01ae\5z>\2\u01aa\u01ab\7"+
		"\4\2\2\u01ab\u01ad\5z>\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b3\7\13\2\2\u01b2\u01b4\5\u0094K\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b7\5\"\22\2\u01b6\u01b5\3"+
		"\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01f0\3\2\2\2\u01b8\u01ba\7\177\2\2\u01b9"+
		"\u01bb\7\u021b\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01c0\7\u0216\2\2\u01bd\u01be\7\u00ef\2\2\u01be\u01bf\7"+
		"\u016f\2\2\u01bf\u01c1\7\u00c0\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\5\u00d4k\2\u01c3\u01c4\7\n\2\2\u01c4"+
		"\u01c9\5z>\2\u01c5\u01c6\7\4\2\2\u01c6\u01c8\5z>\2\u01c7\u01c5\3\2\2\2"+
		"\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\7\13\2\2\u01cd\u01cf\5\u0094"+
		"K\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01d2\5\"\22\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3"+
		"\2\2\2\u01d3\u01d5\t\t\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d8\78\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\5F$\2\u01da\u01f0\3\2\2\2\u01db\u01dd"+
		"\7\177\2\2\u01dc\u01de\7\u021b\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e3\7\u0216\2\2\u01e0\u01e1\7\u00ef\2"+
		"\2\u01e1\u01e2\7\u016f\2\2\u01e2\u01e4\7\u00c0\2\2\u01e3\u01e0\3\2\2\2"+
		"\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ed\5\u00d4k\2\u01e6"+
		"\u01e7\7\u011f\2\2\u01e7\u01ee\5\u00d4k\2\u01e8\u01e9\7\n\2\2\u01e9\u01ea"+
		"\7\u011f\2\2\u01ea\u01eb\5\u00d4k\2\u01eb\u01ec\7\13\2\2\u01ec\u01ee\3"+
		"\2\2\2\u01ed\u01e6\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u019d\3\2\2\2\u01ef\u01b8\3\2\2\2\u01ef\u01db\3\2\2\2\u01f0!\3\2\2\2"+
		"\u01f1\u01f2\7\u0189\2\2\u01f2\u01f3\7P\2\2\u01f3\u01f6\5$\23\2\u01f4"+
		"\u01f5\7\u018b\2\2\u01f5\u01f7\5\u00e2r\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01ff\3\2\2\2\u01f8\u01f9\7\u0210\2\2\u01f9\u01fa\7P\2"+
		"\2\u01fa\u01fd\5&\24\2\u01fb\u01fc\7\u018b\2\2\u01fc\u01fe\5\u00e2r\2"+
		"\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f8"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u020c\3\2\2\2\u0201\u0202\7\n\2\2\u0202"+
		"\u0207\5(\25\2\u0203\u0204\7\4\2\2\u0204\u0206\5(\25\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\13\2\2\u020b\u020d\3"+
		"\2\2\2\u020c\u0201\3\2\2\2\u020c\u020d\3\2\2\2\u020d#\3\2\2\2\u020e\u0210"+
		"\7\u0121\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2"+
		"\2\u0211\u0212\7\u00e4\2\2\u0212\u0213\7\n\2\2\u0213\u0214\5\u00a4S\2"+
		"\u0214\u0215\7\13\2\2\u0215\u023c\3\2\2\2\u0216\u0218\7\u0121\2\2\u0217"+
		"\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d\7\u0113"+
		"\2\2\u021a\u021b\7\62\2\2\u021b\u021c\7\5\2\2\u021c\u021e\5\u00e2r\2\u021d"+
		"\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7\n"+
		"\2\2\u0220\u0221\5v<\2\u0221\u0222\7\13\2\2\u0222\u023c\3\2\2\2\u0223"+
		"\u022d\7\u01a2\2\2\u0224\u0225\7\n\2\2\u0225\u0226\5\u00a4S\2\u0226\u0227"+
		"\7\13\2\2\u0227\u022e\3\2\2\2\u0228\u0229\7i\2\2\u0229\u022a\7\n\2\2\u022a"+
		"\u022b\5v<\2\u022b\u022c\7\13\2\2\u022c\u022e\3\2\2\2\u022d\u0224\3\2"+
		"\2\2\u022d\u0228\3\2\2\2\u022e\u023c\3\2\2\2\u022f\u0239\7\u0124\2\2\u0230"+
		"\u0231\7\n\2\2\u0231\u0232\5\u00a4S\2\u0232\u0233\7\13\2\2\u0233\u023a"+
		"\3\2\2\2\u0234\u0235\7i\2\2\u0235\u0236\7\n\2\2\u0236\u0237\5v<\2\u0237"+
		"\u0238\7\13\2\2\u0238\u023a\3\2\2\2\u0239\u0230\3\2\2\2\u0239\u0234\3"+
		"\2\2\2\u023a\u023c\3\2\2\2\u023b\u020f\3\2\2\2\u023b\u0217\3\2\2\2\u023b"+
		"\u0223\3\2\2\2\u023b\u022f\3\2\2\2\u023c%\3\2\2\2\u023d\u023f\7\u0121"+
		"\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\7\u00e4\2\2\u0241\u0242\7\n\2\2\u0242\u0243\5\u00a4S\2\u0243\u0244"+
		"\7\13\2\2\u0244\u0253\3\2\2\2\u0245\u0247\7\u0121\2\2\u0246\u0245\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024c\7\u0113\2\2\u0249"+
		"\u024a\7\62\2\2\u024a\u024b\7\5\2\2\u024b\u024d\5\u00e2r\2\u024c\u0249"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\n\2\2\u024f"+
		"\u0250\5v<\2\u0250\u0251\7\13\2\2\u0251\u0253\3\2\2\2\u0252\u023e\3\2"+
		"\2\2\u0252\u0246\3\2\2\2\u0253\'\3\2\2\2\u0254\u0255\7\u0189\2\2\u0255"+
		"\u026a\5.\30\2\u0256\u0268\7\u024a\2\2\u0257\u0258\7\u011d\2\2\u0258\u0261"+
		"\7\u021f\2\2\u0259\u025c\7\n\2\2\u025a\u025d\5\u00a4S\2\u025b\u025d\5"+
		"\62\32\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\7\13\2\2\u025f\u0262\3\2\2\2\u0260\u0262\7\u0144\2\2\u0261\u0259"+
		"\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u0269\3\2\2\2\u0263\u0264\7\u00f3\2"+
		"\2\u0264\u0265\7\n\2\2\u0265\u0266\5\62\32\2\u0266\u0267\7\13\2\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0257\3\2\2\2\u0268\u0263\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0256\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026f\3\2\2\2\u026c"+
		"\u026e\5*\26\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u027d\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0273\7\n\2\2\u0273\u0278\5,\27\2\u0274\u0275\7\4\2\2\u0275\u0277\5,"+
		"\27\2\u0276\u0274\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7\13"+
		"\2\2\u027c\u027e\3\2\2\2\u027d\u0272\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		")\3\2\2\2\u027f\u0281\7\u020b\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0284\7\u00b5\2\2\u0283\u0285\7\5\2\2\u0284"+
		"\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u02ad\5\u009c"+
		"O\2\u0287\u0289\7k\2\2\u0288\u028a\7\5\2\2\u0289\u0288\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u02ad\5\u00c6d\2\u028c\u028d\7\u0088"+
		"\2\2\u028d\u028f\7\u00a0\2\2\u028e\u0290\7\5\2\2\u028f\u028e\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u02ad\5\u00c6d\2\u0292\u0293"+
		"\7\u00f4\2\2\u0293\u0295\7\u00a0\2\2\u0294\u0296\7\5\2\2\u0295\u0294\3"+
		"\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u02ad\5\u00c6d\2"+
		"\u0298\u029a\7\u0147\2\2\u0299\u029b\7\5\2\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02ad\5\u00e2r\2\u029d\u029f"+
		"\7\u0158\2\2\u029e\u02a0\7\5\2\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0\u02a1\3\2\2\2\u02a1\u02ad\5\u00e2r\2\u02a2\u02a4\7\u0218\2\2"+
		"\u02a3\u02a5\7\5\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02ad\5\60\31\2\u02a7\u02a9\7\u016d\2\2\u02a8\u02aa\7\5"+
		"\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ad\5\u00e4s\2\u02ac\u0280\3\2\2\2\u02ac\u0287\3\2\2\2\u02ac\u028c"+
		"\3\2\2\2\u02ac\u0292\3\2\2\2\u02ac\u0298\3\2\2\2\u02ac\u029d\3\2\2\2\u02ac"+
		"\u02a2\3\2\2\2\u02ac\u02a7\3\2\2\2\u02ad+\3\2\2\2\u02ae\u02af\7\u0210"+
		"\2\2\u02af\u02b3\5.\30\2\u02b0\u02b2\5*\26\2\u02b1\u02b0\3\2\2\2\u02b2"+
		"\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4-\3\2\2\2"+
		"\u02b5\u02b3\3\2\2\2\u02b6\u02b7\5\u00e4s\2\u02b7/\3\2\2\2\u02b8\u02b9"+
		"\5\u00e4s\2\u02b9\61\3\2\2\2\u02ba\u02bb\7\n\2\2\u02bb\u02bc\5\64\33\2"+
		"\u02bc\u02c4\7\13\2\2\u02bd\u02be\7\4\2\2\u02be\u02bf\7\n\2\2\u02bf\u02c0"+
		"\5\64\33\2\u02c0\u02c1\7\13\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02bd\3\2\2"+
		"\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c9"+
		"\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\5\64\33\2\u02c8\u02ba\3\2\2\2"+
		"\u02c8\u02c7\3\2\2\2\u02c9\63\3\2\2\2\u02ca\u02cd\7\u0144\2\2\u02cb\u02cd"+
		"\5\u00c2b\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02d5\3\2\2"+
		"\2\u02ce\u02d1\7\4\2\2\u02cf\u02d2\7\u0144\2\2\u02d0\u02d2\5\u00c2b\2"+
		"\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02ce"+
		"\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\65\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02db\7\177\2\2\u02d9\u02da\7\u017f"+
		"\2\2\u02da\u02dc\7\u01bc\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02e0\3\2\2\2\u02dd\u02de\7\62\2\2\u02de\u02df\7\5\2\2\u02df\u02e1\t"+
		"\n\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e8\3\2\2\2\u02e2"+
		"\u02e3\7\u0098\2\2\u02e3\u02e6\7\5\2\2\u02e4\u02e7\5t;\2\u02e5\u02e7\7"+
		"\u0085\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e9\3\2\2\2"+
		"\u02e8\u02e2\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ed\3\2\2\2\u02ea\u02eb"+
		"\7\u01f1\2\2\u02eb\u02ec\7\u01d7\2\2\u02ec\u02ee\t\13\2\2\u02ed\u02ea"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\u0250\2"+
		"\2\u02f0\u02f5\5x=\2\u02f1\u02f2\7\n\2\2\u02f2\u02f3\5v<\2\u02f3\u02f4"+
		"\7\13\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f6\3\2\2\2"+
		"\u02f6\u02f7\3\2\2\2\u02f7\u02f8\78\2\2\u02f8\u02ff\5F$\2\u02f9\u02fb"+
		"\7\u0257\2\2\u02fa\u02fc\t\f\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7^\2\2\u02fe\u0300\7\u017c\2\2\u02ff"+
		"\u02f9\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\67\3\2\2\2\u0301\u0303\7\u009b"+
		"\2\2\u0302\u0304\7\u0131\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0306\3\2\2\2\u0305\u0307\7\u01a1\2\2\u0306\u0305\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u030a\7\u00f0\2\2\u0309\u0308\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\7\u00d7\2\2\u030c"+
		"\u030f\5\u00d4k\2\u030d\u030e\7\u0255\2\2\u030e\u0310\5\u00a4S\2\u030f"+
		"\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\5H"+
		"%\2\u03129\3\2\2\2\u0313\u0315\5<\37\2\u0314\u0316\t\r\2\2\u0315\u0314"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u031c\5@!\2\u0318"+
		"\u0319\7\4\2\2\u0319\u031b\5@!\2\u031a\u0318\3\2\2\2\u031b\u031e\3\2\2"+
		"\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031f\u0321\5> \2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u033f\3\2\2\2\u0322\u0323\5<\37\2\u0323\u0325\5F$\2\u0324\u0326\5> \2"+
		"\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u033f\3\2\2\2\u0327\u0328"+
		"\5<\37\2\u0328\u0329\7\u01df\2\2\u0329\u032a\5\u00d8m\2\u032a\u032d\7"+
		"\5\2\2\u032b\u032e\5\u00a4S\2\u032c\u032e\7\u0097\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032c\3\2\2\2\u032e\u0338\3\2\2\2\u032f\u0330\7\4\2\2\u0330"+
		"\u0331\5\u00d8m\2\u0331\u0334\7\5\2\2\u0332\u0335\5\u00a4S\2\u0333\u0335"+
		"\7\u0097\2\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0337\3\2\2"+
		"\2\u0336\u032f\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339"+
		"\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033d\5> \2\u033c"+
		"\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0313\3\2"+
		"\2\2\u033e\u0322\3\2\2\2\u033e\u0327\3\2\2\2\u033f;\3\2\2\2\u0340\u0342"+
		"\7\u00fd\2\2\u0341\u0343\t\16\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343\u0345\3\2\2\2\u0344\u0346\7\u00f0\2\2\u0345\u0344\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\7\u0108\2\2\u0348\u0347"+
		"\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034f\5\u00d4k"+
		"\2\u034b\u034c\7\n\2\2\u034c\u034d\5v<\2\u034d\u034e\7\13\2\2\u034e\u0350"+
		"\3\2\2\2\u034f\u034b\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0356\3\2\2\2\u0351"+
		"\u0352\7\u0189\2\2\u0352\u0353\7\n\2\2\u0353\u0354\5f\64\2\u0354\u0355"+
		"\7\13\2\2\u0355\u0357\3\2\2\2\u0356\u0351\3\2\2\2\u0356\u0357\3\2\2\2"+
		"\u0357=\3\2\2\2\u0358\u0359\7\u0177\2\2\u0359\u035a\7\u00ac\2\2\u035a"+
		"\u035b\7\u0113\2\2\u035b\u035c\7\u023e\2\2\u035c\u035d\5\u00d8m\2\u035d"+
		"\u035e\7\5\2\2\u035e\u0366\5\u00a4S\2\u035f\u0360\7\4\2\2\u0360\u0361"+
		"\5\u00d8m\2\u0361\u0362\7\5\2\2\u0362\u0363\5\u00a4S\2\u0363\u0365\3\2"+
		"\2\2\u0364\u035f\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367?\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036c\7\n\2\2"+
		"\u036a\u036d\5\u00a4S\2\u036b\u036d\7\u0097\2\2\u036c\u036a\3\2\2\2\u036c"+
		"\u036b\3\2\2\2\u036d\u0375\3\2\2\2\u036e\u0371\7\4\2\2\u036f\u0372\5\u00a4"+
		"S\2\u0370\u0372\7\u0097\2\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372"+
		"\u0374\3\2\2\2\u0373\u036e\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0375\3\2\2\2\u0378"+
		"\u0379\7\13\2\2\u0379A\3\2\2\2\u037a\u037c\7\u023e\2\2\u037b\u037d\7\u0131"+
		"\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e"+
		"\u0380\7\u00f0\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0382\5b\62\2\u0382\u0383\7\u01df\2\2\u0383\u0384\5\u00d8"+
		"m\2\u0384\u0387\7\5\2\2\u0385\u0388\5\u00a4S\2\u0386\u0388\7\u0097\2\2"+
		"\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2\u0388\u0392\3\2\2\2\u0389\u038a"+
		"\7\4\2\2\u038a\u038b\5\u00d8m\2\u038b\u038e\7\5\2\2\u038c\u038f\5\u00a4"+
		"S\2\u038d\u038f\7\u0097\2\2\u038e\u038c\3\2\2\2\u038e\u038d\3\2\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u0389\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393\u0397\3\2\2\2\u0394\u0392\3\2\2\2\u0395"+
		"\u0396\7\u0255\2\2\u0396\u0398\5\u00a4S\2\u0397\u0395\3\2\2\2\u0397\u0398"+
		"\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\5H%\2\u039aC\3\2\2\2\u039b\u039c"+
		"\5F$\2\u039cE\3\2\2\2\u039d\u039e\b$\1\2\u039e\u039f\7\n\2\2\u039f\u03a0"+
		"\5F$\2\u03a0\u03a9\7\13\2\2\u03a1\u03a3\7\u0238\2\2\u03a2\u03a4\t\17\2"+
		"\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6"+
		"\7\n\2\2\u03a6\u03a7\5F$\2\u03a7\u03a8\7\13\2\2\u03a8\u03aa\3\2\2\2\u03a9"+
		"\u03a1\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\5H%\2\u03ae\u03ad\3\2\2\2\u03ae\u03af"+
		"\3\2\2\2\u03af\u03da\3\2\2\2\u03b0\u03b4\7\u01d8\2\2\u03b1\u03b3\5N(\2"+
		"\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03bc\5\\/\2\u03b8"+
		"\u03b9\7\4\2\2\u03b9\u03bb\5\\/\2\u03ba\u03b8\3\2\2\2\u03bb\u03be\3\2"+
		"\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c7\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c1\5R*\2\u03c0\u03c2\5P)\2\u03c1\u03c0\3\2\2\2"+
		"\u03c1\u03c2\3\2\2\2\u03c2\u03c8\3\2\2\2\u03c3\u03c5\5P)\2\u03c4\u03c6"+
		"\5R*\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u03bf\3\2\2\2\u03c7\u03c3\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cf\3\2"+
		"\2\2\u03c9\u03ca\7\u0199\2\2\u03ca\u03cb\5J&\2\u03cb\u03cc\7\n\2\2\u03cc"+
		"\u03cd\5L\'\2\u03cd\u03ce\7\13\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c9\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d7\3\2\2\2\u03d1\u03d2\7\u00d2\2\2\u03d2"+
		"\u03d8\7\u023e\2\2\u03d3\u03d4\7\u0129\2\2\u03d4\u03d5\7\u00f3\2\2\u03d5"+
		"\u03d6\7\u01e0\2\2\u03d6\u03d8\7\u015a\2\2\u03d7\u03d1\3\2\2\2\u03d7\u03d3"+
		"\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u039d\3\2\2\2\u03d9"+
		"\u03b0\3\2\2\2\u03da\u03e7\3\2\2\2\u03db\u03e1\f\5\2\2\u03dc\u03de\7\u0238"+
		"\2\2\u03dd\u03df\t\17\2\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\5F$\2\u03e1\u03dc\3\2\2\2\u03e2\u03e3\3\2\2"+
		"\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03db"+
		"\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"G\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\7\u0180\2\2\u03eb\u03ef\7P\2"+
		"\2\u03ec\u03f0\5\u00d8m\2\u03ed\u03f0\5\u00a4S\2\u03ee\u03f0\5V,\2\u03ef"+
		"\u03ec\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f2\3\2"+
		"\2\2\u03f1\u03f3\t\20\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03ff\3\2\2\2\u03f4\u03f8\7\4\2\2\u03f5\u03f9\5\u00d8m\2\u03f6\u03f9"+
		"\5\u00a4S\2\u03f7\u03f9\5V,\2\u03f8\u03f5\3\2\2\2\u03f8\u03f6\3\2\2\2"+
		"\u03f8\u03f7\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03fc\t\20\2\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03f4\3\2\2\2\u03fe"+
		"\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u040f\3\2"+
		"\2\2\u0401\u03ff\3\2\2\2\u0402\u040d\7\u0120\2\2\u0403\u0404\5X-\2\u0404"+
		"\u0405\7\4\2\2\u0405\u0407\3\2\2\2\u0406\u0403\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0408\3\2\2\2\u0408\u040e\5Z.\2\u0409\u040a\5Z.\2\u040a\u040b"+
		"\7\u0175\2\2\u040b\u040c\5X-\2\u040c\u040e\3\2\2\2\u040d\u0406\3\2\2\2"+
		"\u040d\u0409\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0402\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410I\3\2\2\2\u0411\u0414\5\u00d2j\2\u0412\u0414\5\u00e4s\2"+
		"\u0413\u0411\3\2\2\2\u0413\u0412\3\2\2\2\u0414K\3\2\2\2\u0415\u041a\5"+
		"\u00a4S\2\u0416\u0417\7\4\2\2\u0417\u0419\5\u00a4S\2\u0418\u0416\3\2\2"+
		"\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041bM"+
		"\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u0424\t\21\2\2\u041e\u0424\7\u00e7"+
		"\2\2\u041f\u0424\7\u020c\2\2\u0420\u0424\t\22\2\2\u0421\u0424\t\23\2\2"+
		"\u0422\u0424\7\u01f8\2\2\u0423\u041d\3\2\2\2\u0423\u041e\3\2\2\2\u0423"+
		"\u041f\3\2\2\2\u0423\u0420\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0422\3\2"+
		"\2\2\u0424O\3\2\2\2\u0425\u0426\7\u00d7\2\2\u0426\u0429\5^\60\2\u0427"+
		"\u0428\7\u0255\2\2\u0428\u042a\5\u00a4S\2\u0429\u0427\3\2\2\2\u0429\u042a"+
		"\3\2\2\2\u042a\u0447\3\2\2\2\u042b\u042c\7\u00e2\2\2\u042c\u0430\7P\2"+
		"\2\u042d\u0431\5\u00d8m\2\u042e\u0431\5\u00a4S\2\u042f\u0431\5V,\2\u0430"+
		"\u042d\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u0433\3\2"+
		"\2\2\u0432\u0434\t\20\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0440\3\2\2\2\u0435\u0439\7\4\2\2\u0436\u043a\5\u00d8m\2\u0437\u043a"+
		"\5\u00a4S\2\u0438\u043a\5V,\2\u0439\u0436\3\2\2\2\u0439\u0437\3\2\2\2"+
		"\u0439\u0438\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u043d\t\20\2\2\u043c\u043b"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043f\3\2\2\2\u043e\u0435\3\2\2\2\u043f"+
		"\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0445\3\2"+
		"\2\2\u0442\u0440\3\2\2\2\u0443\u0444\7\u0257\2\2\u0444\u0446\7\u01ca\2"+
		"\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u042b"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u044a\7\u00e5\2"+
		"\2\u044a\u044c\5\u00a4S\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044e\3\2\2\2\u044d\u044f\5H%\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2"+
		"\2\u044fQ\3\2\2\2\u0450\u0451\7\u0108\2\2\u0451\u0459\5T+\2\u0452\u0453"+
		"\7\u0108\2\2\u0453\u0454\7\u0183\2\2\u0454\u0459\5\u00c6d\2\u0455\u0456"+
		"\7\u0108\2\2\u0456\u0457\7\u00ab\2\2\u0457\u0459\5\u00c6d\2\u0458\u0450"+
		"\3\2\2\2\u0458\u0452\3\2\2\2\u0458\u0455\3\2\2\2\u0459S\3\2\2\2\u045a"+
		"\u045f\5\16\b\2\u045b\u045c\7\4\2\2\u045c\u045e\5\16\b\2\u045d\u045b\3"+
		"\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"U\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\7\u026e\2\2\u0463W\3\2\2\2\u0464"+
		"\u0465\7\u026e\2\2\u0465Y\3\2\2\2\u0466\u0467\7\u026e\2\2\u0467[\3\2\2"+
		"\2\u0468\u046b\5\u00a4S\2\u0469\u046b\7\f\2\2\u046a\u0468\3\2\2\2\u046a"+
		"\u0469\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046d\78\2\2\u046d\u046f\5\u00d0"+
		"i\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f]\3\2\2\2\u0470\u0475"+
		"\5`\61\2\u0471\u0472\7\4\2\2\u0472\u0474\5`\61\2\u0473\u0471\3\2\2\2\u0474"+
		"\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476_\3\2\2\2"+
		"\u0477\u0475\3\2\2\2\u0478\u047f\5b\62\2\u0479\u047a\7\r\2\2\u047a\u047b"+
		"\7\u0269\2\2\u047b\u047c\5b\62\2\u047c\u047d\7\16\2\2\u047d\u047f\3\2"+
		"\2\2\u047e\u0478\3\2\2\2\u047e\u0479\3\2\2\2\u047fa\3\2\2\2\u0480\u0481"+
		"\b\62\1\2\u0481\u0484\5d\63\2\u0482\u0484\5h\65\2\u0483\u0480\3\2\2\2"+
		"\u0483\u0482\3\2\2\2\u0484\u0492\3\2\2\2\u0485\u0487\f\3\2\2\u0486\u0488"+
		"\t\24\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\3\2\2\2"+
		"\u0489\u048b\7\u0182\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u048d\7\u0112\2\2\u048d\u048e\5b\62\2\u048e\u048f"+
		"\5l\67\2\u048f\u0491\3\2\2\2\u0490\u0485\3\2\2\2\u0491\u0494\3\2\2\2\u0492"+
		"\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493c\3\2\2\2\u0494\u0492\3\2\2\2"+
		"\u0495\u049b\5\u00d4k\2\u0496\u0497\7\u0189\2\2\u0497\u0498\7\n\2\2\u0498"+
		"\u0499\5f\64\2\u0499\u049a\7\13\2\2\u049a\u049c\3\2\2\2\u049b\u0496\3"+
		"\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a1\3\2\2\2\u049d\u049f\78\2\2\u049e"+
		"\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\5\u00d0"+
		"i\2\u04a1\u049e\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3"+
		"\u04a5\5n8\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04b9\3\2\2"+
		"\2\u04a6\u04a8\5F$\2\u04a7\u04a9\78\2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9"+
		"\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\5\u00d0i\2\u04ab\u04b9\3\2\2"+
		"\2\u04ac\u04ad\7\n\2\2\u04ad\u04ae\5F$\2\u04ae\u04b0\7\13\2\2\u04af\u04b1"+
		"\78\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b3\5\u00d0i\2\u04b3\u04b9\3\2\2\2\u04b4\u04b5\7\n\2\2\u04b5\u04b6"+
		"\5^\60\2\u04b6\u04b7\7\13\2\2\u04b7\u04b9\3\2\2\2\u04b8\u0495\3\2\2\2"+
		"\u04b8\u04a6\3\2\2\2\u04b8\u04ac\3\2\2\2\u04b8\u04b4\3\2\2\2\u04b9e\3"+
		"\2\2\2\u04ba\u04bf\5.\30\2\u04bb\u04bc\7\4\2\2\u04bc\u04be\5.\30\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0g\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c6\5d\63\2\u04c3\u04c5"+
		"\5j\66\2\u04c4\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7i\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cb\t\25\2\2"+
		"\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd"+
		"\7\u0112\2\2\u04cd\u04cf\5d\63\2\u04ce\u04d0\5l\67\2\u04cf\u04ce\3\2\2"+
		"\2\u04cf\u04d0\3\2\2\2\u04d0\u04e2\3\2\2\2\u04d1\u04d2\7\u020c\2\2\u04d2"+
		"\u04e2\5d\63\2\u04d3\u04d4\7\u020c\2\2\u04d4\u04d5\5d\63\2\u04d5\u04d6"+
		"\7\u0177\2\2\u04d6\u04d7\5\u00a4S\2\u04d7\u04e2\3\2\2\2\u04d8\u04dd\7"+
		"\u0166\2\2\u04d9\u04db\t\24\2\2\u04da\u04dc\7\u0182\2\2\u04db\u04da\3"+
		"\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d9\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7\u0112\2\2\u04e0\u04e2"+
		"\5d\63\2\u04e1\u04ca\3\2\2\2\u04e1\u04d1\3\2\2\2\u04e1\u04d3\3\2\2\2\u04e1"+
		"\u04d8\3\2\2\2\u04e2k\3\2\2\2\u04e3\u04e4\7\u0177\2\2\u04e4\u04eb\5\u00a4"+
		"S\2\u04e5\u04e6\7\u0245\2\2\u04e6\u04e7\7\n\2\2\u04e7\u04e8\5v<\2\u04e8"+
		"\u04e9\7\13\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e3\3\2\2\2\u04ea\u04e5\3"+
		"\2\2\2\u04ebm\3\2\2\2\u04ec\u04f1\5p9\2\u04ed\u04ee\7\4\2\2\u04ee\u04f0"+
		"\5p9\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2o\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\7\u0241"+
		"\2\2\u04f5\u04fe\t\26\2\2\u04f6\u04fc\7\u00d2\2\2\u04f7\u04fd\7\u0112"+
		"\2\2\u04f8\u04f9\7\u0180\2\2\u04f9\u04fd\7P\2\2\u04fa\u04fb\7\u00e2\2"+
		"\2\u04fb\u04fd\7P\2\2\u04fc\u04f7\3\2\2\2\u04fc\u04f8\3\2\2\2\u04fc\u04fa"+
		"\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04f6\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0502\7\n\2\2\u0501\u0503\5r:\2\u0502\u0501\3\2\2"+
		"\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0528\7\13\2\2\u0505"+
		"\u0506\7\u00f0\2\2\u0506\u050f\t\26\2\2\u0507\u050d\7\u00d2\2\2\u0508"+
		"\u050e\7\u0112\2\2\u0509\u050a\7\u0180\2\2\u050a\u050e\7P\2\2\u050b\u050c"+
		"\7\u00e2\2\2\u050c\u050e\7P\2\2\u050d\u0508\3\2\2\2\u050d\u0509\3\2\2"+
		"\2\u050d\u050b\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0507\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\7\n\2\2\u0512\u0514\5r:\2\u0513"+
		"\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0528\7\13"+
		"\2\2\u0516\u0517\7\u00d3\2\2\u0517\u0520\t\26\2\2\u0518\u051e\7\u00d2"+
		"\2\2\u0519\u051f\7\u0112\2\2\u051a\u051b\7\u0180\2\2\u051b\u051f\7P\2"+
		"\2\u051c\u051d\7\u00e2\2\2\u051d\u051f\7P\2\2\u051e\u0519\3\2\2\2\u051e"+
		"\u051a\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u0518\3\2"+
		"\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\7\n\2\2\u0523"+
		"\u0525\5r:\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2"+
		"\2\u0526\u0528\7\13\2\2\u0527\u04f4\3\2\2\2\u0527\u0505\3\2\2\2\u0527"+
		"\u0516\3\2\2\2\u0528q\3\2\2\2\u0529\u052e\5\u00dan\2\u052a\u052b\7\4\2"+
		"\2\u052b\u052d\5\u00dan\2\u052c\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e"+
		"\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052fs\3\2\2\2\u0530\u052e\3\2\2\2"+
		"\u0531\u0532\5\u00c6d\2\u0532u\3\2\2\2\u0533\u0538\5\u00d8m\2\u0534\u0535"+
		"\7\4\2\2\u0535\u0537\5\u00d8m\2\u0536\u0534\3\2\2\2\u0537\u053a\3\2\2"+
		"\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539w\3\2\2\2\u053a\u0538"+
		"\3\2\2\2\u053b\u053c\5\u00e4s\2\u053cy\3\2\2\2\u053d\u053e\5\u00d8m\2"+
		"\u053e\u053f\5|?\2\u053f\u05dd\3\2\2\2\u0540\u0542\7u\2\2\u0541\u0540"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\5\u00dco"+
		"\2\u0544\u0541\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547"+
		"\7\u0197\2\2\u0547\u0549\7\u0113\2\2\u0548\u054a\5\u0086D\2\u0549\u0548"+
		"\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\7\n\2\2\u054c"+
		"\u0551\5\u0084C\2\u054d\u054e\7\4\2\2\u054e\u0550\5\u0084C\2\u054f\u054d"+
		"\3\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0558\7\13\2\2\u0555\u0557\5"+
		"\u0088E\2\u0556\u0555\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2"+
		"\u0558\u0559\3\2\2\2\u0559\u05dd\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d"+
		"\t\26\2\2\u055c\u055e\5\u00dan\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2"+
		"\2\u055e\u0560\3\2\2\2\u055f\u0561\5\u0086D\2\u0560\u055f\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7\n\2\2\u0563\u0568\5\u0084"+
		"C\2\u0564\u0565\7\4\2\2\u0565\u0567\5\u0084C\2\u0566\u0564\3\2\2\2\u0567"+
		"\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2"+
		"\2\2\u056a\u0568\3\2\2\2\u056b\u056f\7\13\2\2\u056c\u056e\5\u0088E\2\u056d"+
		"\u056c\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2"+
		"\2\2\u0570\u05dd\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0574\7u\2\2\u0573"+
		"\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\5\u00dc"+
		"o\2\u0576\u0573\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u057a\7\u0239\2\2\u0579\u057b\t\26\2\2\u057a\u0579\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057e\5\u00dan\2\u057d\u057c\3\2\2"+
		"\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u0581\5\u0086D\2\u0580"+
		"\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7\n"+
		"\2\2\u0583\u0588\5\u0084C\2\u0584\u0585\7\4\2\2\u0585\u0587\5\u0084C\2"+
		"\u0586\u0584\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589"+
		"\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058f\7\13\2\2"+
		"\u058c\u058e\5\u0088E\2\u058d\u058c\3\2\2\2\u058e\u0591\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u05dd\3\2\2\2\u0591\u058f\3\2"+
		"\2\2\u0592\u0594\7\u00d9\2\2\u0593\u0595\t\26\2\2\u0594\u0593\3\2\2\2"+
		"\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\5\u00dan\2\u0597"+
		"\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\7\n"+
		"\2\2\u059a\u059f\5\u0084C\2\u059b\u059c\7\4\2\2\u059c\u059e\5\u0084C\2"+
		"\u059d\u059b\3\2\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0"+
		"\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a6\7\13\2\2"+
		"\u05a3\u05a5\5\u0088E\2\u05a4\u05a3\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05dd\3\2\2\2\u05a8\u05a6\3\2"+
		"\2\2\u05a9\u05ab\7\u01ef\2\2\u05aa\u05ac\t\26\2\2\u05ab\u05aa\3\2\2\2"+
		"\u05ab\u05ac\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05af\5\u00dan\2\u05ae"+
		"\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7\n"+
		"\2\2\u05b1\u05b6\5\u0084C\2\u05b2\u05b3\7\4\2\2\u05b3\u05b5\5\u0084C\2"+
		"\u05b4\u05b2\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05bd\7\13\2\2"+
		"\u05ba\u05bc\5\u0088E\2\u05bb\u05ba\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd"+
		"\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05dd\3\2\2\2\u05bf\u05bd\3\2"+
		"\2\2\u05c0\u05c2\7u\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c3\3\2\2\2\u05c3\u05c5\5\u00dco\2\u05c4\u05c1\3\2\2\2\u05c4\u05c5"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7\u00d4\2\2\u05c7\u05c9\7\u0113"+
		"\2\2\u05c8\u05ca\5\u00dan\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cc\7\n\2\2\u05cc\u05d1\5\u0084C\2\u05cd\u05ce"+
		"\7\4\2\2\u05ce\u05d0\5\u0084C\2\u05cf\u05cd\3\2\2\2\u05d0\u05d3\3\2\2"+
		"\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d1"+
		"\3\2\2\2\u05d4\u05d5\7\13\2\2\u05d5\u05d6\5\u008aF\2\u05d6\u05dd\3\2\2"+
		"\2\u05d7\u05d8\7^\2\2\u05d8\u05d9\7\n\2\2\u05d9\u05da\5\u00a4S\2\u05da"+
		"\u05db\7\13\2\2\u05db\u05dd\3\2\2\2\u05dc\u053d\3\2\2\2\u05dc\u0544\3"+
		"\2\2\2\u05dc\u055b\3\2\2\2\u05dc\u0576\3\2\2\2\u05dc\u0592\3\2\2\2\u05dc"+
		"\u05a9\3\2\2\2\u05dc\u05c4\3\2\2\2\u05dc\u05d7\3\2\2\2\u05dd{\3\2\2\2"+
		"\u05de\u05e2\5\u0080A\2\u05df\u05e1\5~@\2\u05e0\u05df\3\2\2\2\u05e1\u05e4"+
		"\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3}\3\2\2\2\u05e4"+
		"\u05e2\3\2\2\2\u05e5\u05e7\7\u016f\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u060c\7\u0172\2\2\u05e9\u060c\7?\2"+
		"\2\u05ea\u05ec\7\u0239\2\2\u05eb\u05ed\7\u0113\2\2\u05ec\u05eb\3\2\2\2"+
		"\u05ec\u05ed\3\2\2\2\u05ed\u060c\3\2\2\2\u05ee\u05f0\7\u0197\2\2\u05ef"+
		"\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u060c\7\u0113"+
		"\2\2\u05f2\u05f3\7\u0097\2\2\u05f3\u060c\5\u00c2b\2\u05f4\u05f5\7k\2\2"+
		"\u05f5\u060c\5\u00c6d\2\u05f6\u05f7\7h\2\2\u05f7\u05f8\7\u0264\2\2\u05f8"+
		"\u060c\t\27\2\2\u05f9\u05fa\7\u020b\2\2\u05fa\u060c\t\30\2\2\u05fb\u05fc"+
		"\7f\2\2\u05fc\u060c\5\u009aN\2\u05fd\u05fe\7\u0177\2\2\u05fe\u05ff\7\u023e"+
		"\2\2\u05ff\u060c\5\u00ceh\2\u0600\u0601\7\u01ad\2\2\u0601\u0602\5\u00d4"+
		"k\2\u0602\u0603\7\n\2\2\u0603\u0604\5\u0084C\2\u0604\u0608\7\13\2\2\u0605"+
		"\u0607\5\u008cG\2\u0606\u0605\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060b"+
		"\u05e6\3\2\2\2\u060b\u05e9\3\2\2\2\u060b\u05ea\3\2\2\2\u060b\u05ef\3\2"+
		"\2\2\u060b\u05f2\3\2\2\2\u060b\u05f4\3\2\2\2\u060b\u05f6\3\2\2\2\u060b"+
		"\u05f9\3\2\2\2\u060b\u05fb\3\2\2\2\u060b\u05fd\3\2\2\2\u060b\u0600\3\2"+
		"\2\2\u060c\177\3\2\2\2\u060d\u0612\7I\2\2\u060e\u060f\7\n\2\2\u060f\u0610"+
		"\5\u00dep\2\u0610\u0611\7\13\2\2\u0611\u0613\3\2\2\2\u0612\u060e\3\2\2"+
		"\2\u0612\u0613\3\2\2\2\u0613\u0725\3\2\2\2\u0614\u0725\7L\2\2\u0615\u0725"+
		"\7M\2\2\u0616\u061b\7\u0226\2\2\u0617\u0618\7\n\2\2\u0618\u0619\5\u00de"+
		"p\2\u0619\u061a\7\13\2\2\u061a\u061c\3\2\2\2\u061b\u0617\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061e\3\2\2\2\u061d\u061f\7\u023c\2\2\u061e\u061d"+
		"\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u0622\7\u0261\2"+
		"\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0725\3\2\2\2\u0623\u0628"+
		"\7\u01e8\2\2\u0624\u0625\7\n\2\2\u0625\u0626\5\u00dep\2\u0626\u0627\7"+
		"\13\2\2\u0627\u0629\3\2\2\2\u0628\u0624\3\2\2\2\u0628\u0629\3\2\2\2\u0629"+
		"\u062b\3\2\2\2\u062a\u062c\7\u023c\2\2\u062b\u062a\3\2\2\2\u062b\u062c"+
		"\3\2\2\2\u062c\u062e\3\2\2\2\u062d\u062f\7\u0261\2\2\u062e\u062d\3\2\2"+
		"\2\u062e\u062f\3\2\2\2\u062f\u0725\3\2\2\2\u0630\u0635\7\u014d\2\2\u0631"+
		"\u0632\7\n\2\2\u0632\u0633\5\u00dep\2\u0633\u0634\7\13\2\2\u0634\u0636"+
		"\3\2\2\2\u0635\u0631\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637"+
		"\u0639\7\u023c\2\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b"+
		"\3\2\2\2\u063a\u063c\7\u0261\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2"+
		"\2\u063c\u0725\3\2\2\2\u063d\u0642\7\u0100\2\2\u063e\u063f\7\n\2\2\u063f"+
		"\u0640\5\u00dep\2\u0640\u0641\7\13\2\2\u0641\u0643\3\2\2\2\u0642\u063e"+
		"\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0645\3\2\2\2\u0644\u0646\7\u023c\2"+
		"\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0649"+
		"\7\u0261\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u0725\3\2\2"+
		"\2\u064a\u064f\7\u0106\2\2\u064b\u064c\7\n\2\2\u064c\u064d\5\u00dep\2"+
		"\u064d\u064e\7\13\2\2\u064e\u0650\3\2\2\2\u064f\u064b\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0652\3\2\2\2\u0651\u0653\7\u023c\2\2\u0652\u0651\3\2\2"+
		"\2\u0652\u0653\3\2\2\2\u0653\u0655\3\2\2\2\u0654\u0656\7\u0261\2\2\u0655"+
		"\u0654\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0725\3\2\2\2\u0657\u065c\7F"+
		"\2\2\u0658\u0659\7\n\2\2\u0659\u065a\5\u00dep\2\u065a\u065b\7\13\2\2\u065b"+
		"\u065d\3\2\2\2\u065c\u0658\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2"+
		"\2\2\u065e\u0660\7\u023c\2\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"\u0662\3\2\2\2\u0661\u0663\7\u0261\2\2\u0662\u0661\3\2\2\2\u0662\u0663"+
		"\3\2\2\2\u0663\u0725\3\2\2\2\u0664\u066b\7\u01a7\2\2\u0665\u0666\7\n\2"+
		"\2\u0666\u0667\5\u00dep\2\u0667\u0668\7\4\2\2\u0668\u0669\5\u00e0q\2\u0669"+
		"\u066a\7\13\2\2\u066a\u066c\3\2\2\2\u066b\u0665\3\2\2\2\u066b\u066c\3"+
		"\2\2\2\u066c\u066e\3\2\2\2\u066d\u066f\7\u023c\2\2\u066e\u066d\3\2\2\2"+
		"\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670\u0672\7\u0261\2\2\u0671"+
		"\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0725\3\2\2\2\u0673\u067a\7\u00a8"+
		"\2\2\u0674\u0675\7\n\2\2\u0675\u0676\5\u00dep\2\u0676\u0677\7\4\2\2\u0677"+
		"\u0678\5\u00e0q\2\u0678\u0679\7\13\2\2\u0679\u067b\3\2\2\2\u067a\u0674"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067e\7\u023c\2"+
		"\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681"+
		"\7\u0261\2\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0725\3\2\2"+
		"\2\u0682\u0689\7\u00ce\2\2\u0683\u0684\7\n\2\2\u0684\u0685\5\u00dep\2"+
		"\u0685\u0686\7\4\2\2\u0686\u0687\5\u00e0q\2\u0687\u0688\7\13\2\2\u0688"+
		"\u068a\3\2\2\2\u0689\u0683\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2"+
		"\2\2\u068b\u068d\7\u023c\2\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d"+
		"\u068f\3\2\2\2\u068e\u0690\7\u0261\2\2\u068f\u068e\3\2\2\2\u068f\u0690"+
		"\3\2\2\2\u0690\u0725\3\2\2\2\u0691\u0698\7\u0095\2\2\u0692\u0693\7\n\2"+
		"\2\u0693\u0694\5\u00dep\2\u0694\u0695\7\4\2\2\u0695\u0696\5\u00e0q\2\u0696"+
		"\u0697\7\13\2\2\u0697\u0699\3\2\2\2\u0698\u0692\3\2\2\2\u0698\u0699\3"+
		"\2\2\2\u0699\u069b\3\2\2\2\u069a\u069c\7\u023c\2\2\u069b\u069a\3\2\2\2"+
		"\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u069f\7\u0261\2\2\u069e"+
		"\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u0725\3\2\2\2\u06a0\u06a7\7\u0173"+
		"\2\2\u06a1\u06a2\7\n\2\2\u06a2\u06a3\5\u00dep\2\u06a3\u06a4\7\4\2\2\u06a4"+
		"\u06a5\5\u00e0q\2\u06a5\u06a6\7\13\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a1"+
		"\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06ab\7\u023c\2"+
		"\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2\2\u06ac\u06ae"+
		"\7\u0261\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u0725\3\2\2"+
		"\2\u06af\u0725\7\u008c\2\2\u06b0\u0725\7\u0221\2\2\u06b1\u0725\7\u0222"+
		"\2\2\u06b2\u0725\7\u008d\2\2\u06b3\u0725\7\u025f\2\2\u06b4\u06b9\7[\2"+
		"\2\u06b5\u06b6\7\n\2\2\u06b6\u06b7\5\u00dep\2\u06b7\u06b8\7\13\2\2\u06b8"+
		"\u06ba\3\2\2\2\u06b9\u06b5\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\3\2"+
		"\2\2\u06bb\u06bd\7G\2\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd"+
		"\u06c1\3\2\2\2\u06be\u06bf\7\\\2\2\u06bf\u06c0\7\u01df\2\2\u06c0\u06c2"+
		"\5\u0098M\2\u06c1\u06be\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u0725\3\2\2"+
		"\2\u06c3\u06c8\7\u024c\2\2\u06c4\u06c5\7\n\2\2\u06c5\u06c6\5\u00dep\2"+
		"\u06c6\u06c7\7\13\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c4\3\2\2\2\u06c8\u06c9"+
		"\3\2\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06cc\7G\2\2\u06cb\u06ca\3\2\2\2\u06cb"+
		"\u06cc\3\2\2\2\u06cc\u06d0\3\2\2\2\u06cd\u06ce\7\\\2\2\u06ce\u06cf\7\u01df"+
		"\2\2\u06cf\u06d1\5\u0098M\2\u06d0\u06cd\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1"+
		"\u0725\3\2\2\2\u06d2\u06d7\7G\2\2\u06d3\u06d4\7\n\2\2\u06d4\u06d5\5\u00de"+
		"p\2\u06d5\u06d6\7\13\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d3\3\2\2\2\u06d7"+
		"\u06d8\3\2\2\2\u06d8\u0725\3\2\2\2\u06d9\u06de\7\u024b\2\2\u06da\u06db"+
		"\7\n\2\2\u06db\u06dc\5\u00dep\2\u06dc\u06dd\7\13\2\2\u06dd\u06df\3\2\2"+
		"\2\u06de\u06da\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u0725\3\2\2\2\u06e0\u0725"+
		"\7\u0225\2\2\u06e1\u0725\7J\2\2\u06e2\u0725\7\u014c\2\2\u06e3\u0725\7"+
		"\u012e\2\2\u06e4\u06e6\7\u0227\2\2\u06e5\u06e7\7G\2\2\u06e6\u06e5\3\2"+
		"\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06eb\3\2\2\2\u06e8\u06e9\7\\\2\2\u06e9"+
		"\u06ea\7\u01df\2\2\u06ea\u06ec\5\u0098M\2\u06eb\u06e8\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u0725\3\2\2\2\u06ed\u06ef\7\u021e\2\2\u06ee\u06f0\7G\2"+
		"\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f4\3\2\2\2\u06f1\u06f2"+
		"\7\\\2\2\u06f2\u06f3\7\u01df\2\2\u06f3\u06f5\5\u0098M\2\u06f4\u06f1\3"+
		"\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u0725\3\2\2\2\u06f6\u06f8\7\u014e\2\2"+
		"\u06f7\u06f9\7G\2\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fd"+
		"\3\2\2\2\u06fa\u06fb\7\\\2\2\u06fb\u06fc\7\u01df\2\2\u06fc\u06fe\5\u0098"+
		"M\2\u06fd\u06fa\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0725\3\2\2\2\u06ff"+
		"\u0701\7\u012f\2\2\u0700\u0702\7G\2\2\u0701\u0700\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0706\3\2\2\2\u0703\u0704\7\\\2\2\u0704\u0705\7\u01df\2"+
		"\2\u0705\u0707\5\u0098M\2\u0706\u0703\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u0725\3\2\2\2\u0708\u0709\7\u00b7\2\2\u0709\u070a\7\n\2\2\u070a\u070d"+
		"\5\u00c6d\2\u070b\u070c\7\4\2\2\u070c\u070e\5\u00c6d\2\u070d\u070b\3\2"+
		"\2\2\u070d\u070e\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0713\7\13\2\2\u0710"+
		"\u0711\7\\\2\2\u0711\u0712\7\u01df\2\2\u0712\u0714\5\u0098M\2\u0713\u0710"+
		"\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0725\3\2\2\2\u0715\u0716\7\u01df\2"+
		"\2\u0716\u0717\7\n\2\2\u0717\u071a\5\u00c6d\2\u0718\u0719\7\4\2\2\u0719"+
		"\u071b\5\u00c6d\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c"+
		"\3\2\2\2\u071c\u0720\7\13\2\2\u071d\u071e\7\\\2\2\u071e\u071f\7\u01df"+
		"\2\2\u071f\u0721\5\u0098M\2\u0720\u071d\3\2\2\2\u0720\u0721\3\2\2\2\u0721"+
		"\u0725\3\2\2\2\u0722\u0725\7\u0111\2\2\u0723\u0725\5\u0082B\2\u0724\u060d"+
		"\3\2\2\2\u0724\u0614\3\2\2\2\u0724\u0615\3\2\2\2\u0724\u0616\3\2\2\2\u0724"+
		"\u0623\3\2\2\2\u0724\u0630\3\2\2\2\u0724\u063d\3\2\2\2\u0724\u064a\3\2"+
		"\2\2\u0724\u0657\3\2\2\2\u0724\u0664\3\2\2\2\u0724\u0673\3\2\2\2\u0724"+
		"\u0682\3\2\2\2\u0724\u0691\3\2\2\2\u0724\u06a0\3\2\2\2\u0724\u06af\3\2"+
		"\2\2\u0724\u06b0\3\2\2\2\u0724\u06b1\3\2\2\2\u0724\u06b2\3\2\2\2\u0724"+
		"\u06b3\3\2\2\2\u0724\u06b4\3\2\2\2\u0724\u06c3\3\2\2\2\u0724\u06d2\3\2"+
		"\2\2\u0724\u06d9\3\2\2\2\u0724\u06e0\3\2\2\2\u0724\u06e1\3\2\2\2\u0724"+
		"\u06e2\3\2\2\2\u0724\u06e3\3\2\2\2\u0724\u06e4\3\2\2\2\u0724\u06ed\3\2"+
		"\2\2\u0724\u06f6\3\2\2\2\u0724\u06ff\3\2\2\2\u0724\u0708\3\2\2\2\u0724"+
		"\u0715\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0723\3\2\2\2\u0725\u0081\3\2"+
		"\2\2\u0726\u0727\t\31\2\2\u0727\u0083\3\2\2\2\u0728\u072d\5\u00d8m\2\u0729"+
		"\u072a\7\n\2\2\u072a\u072b\5\u00dep\2\u072b\u072c\7\13\2\2\u072c\u072e"+
		"\3\2\2\2\u072d\u0729\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f"+
		"\u0731\t\20\2\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0085\3"+
		"\2\2\2\u0732\u0733\7\u0245\2\2\u0733\u0734\t\32\2\2\u0734\u0087\3\2\2"+
		"\2\u0735\u0737\7\u0115\2\2\u0736\u0738\7\5\2\2\u0737\u0736\3\2\2\2\u0737"+
		"\u0738\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0741\5\u00e2r\2\u073a\u0741"+
		"\5\u0086D\2\u073b\u073c\7\u0257\2\2\u073c\u073d\7\u0187\2\2\u073d\u0741"+
		"\5\u009eP\2\u073e\u073f\7k\2\2\u073f\u0741\5\u00c6d\2\u0740\u0735\3\2"+
		"\2\2\u0740\u073a\3\2\2\2\u0740\u073b\3\2\2\2\u0740\u073e\3\2\2\2\u0741"+
		"\u0089\3\2\2\2\u0742\u0743\7\u01ad\2\2\u0743\u0744\5\u00d4k\2\u0744\u0745"+
		"\7\n\2\2\u0745\u074a\5\u0084C\2\u0746\u0747\7\4\2\2\u0747\u0749\5\u0084"+
		"C\2\u0748\u0746\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u074d\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u0751\7\13"+
		"\2\2\u074e\u0750\5\u008cG\2\u074f\u074e\3\2\2\2\u0750\u0753\3\2\2\2\u0751"+
		"\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u008b\3\2\2\2\u0753\u0751\3\2"+
		"\2\2\u0754\u0755\7\u0143\2\2\u0755\u075d\t\33\2\2\u0756\u0757\7\u0177"+
		"\2\2\u0757\u0758\7\u009b\2\2\u0758\u075d\5\u008eH\2\u0759\u075a\7\u0177"+
		"\2\2\u075a\u075b\7\u023e\2\2\u075b\u075d\5\u0090I\2\u075c\u0754\3\2\2"+
		"\2\u075c\u0756\3\2\2\2\u075c\u0759\3\2\2\2\u075d\u008d\3\2\2\2\u075e\u075f"+
		"\5\u0092J\2\u075f\u008f\3\2\2\2\u0760\u0761\5\u0092J\2\u0761\u0091\3\2"+
		"\2\2\u0762\u0769\7\u01c2\2\2\u0763\u0769\7T\2\2\u0764\u0765\7\u01df\2"+
		"\2\u0765\u0769\7\u0172\2\2\u0766\u0767\7\u016c\2\2\u0767\u0769\7-\2\2"+
		"\u0768\u0762\3\2\2\2\u0768\u0763\3\2\2\2\u0768\u0764\3\2\2\2\u0768\u0766"+
		"\3\2\2\2\u0769\u0093\3\2\2\2\u076a\u0771\5\u0096L\2\u076b\u076d\7\4\2"+
		"\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770"+
		"\5\u0096L\2\u076f\u076c\3\2\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2"+
		"\2\u0771\u0772\3\2\2\2\u0772\u0095\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0776"+
		"\7\u00b5\2\2\u0775\u0777\7\5\2\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2"+
		"\2\u0777\u0778\3\2\2\2\u0778\u0806\5\u009cO\2\u0779\u077b\7?\2\2\u077a"+
		"\u077c\7\5\2\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2"+
		"\2\2\u077d\u0806\5\u00e2r\2\u077e\u0780\7A\2\2\u077f\u0781\7\5\2\2\u0780"+
		"\u077f\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0806\5\u00e2"+
		"r\2\u0783\u0785\7\u0097\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0789\3\2\2\2\u0786\u0787\7\\\2\2\u0787\u078a\7\u01df\2\2\u0788\u078a"+
		"\7]\2\2\u0789\u0786\3\2\2\2\u0789\u0788\3\2\2\2\u078a\u078c\3\2\2\2\u078b"+
		"\u078d\7\5\2\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2"+
		"\2\2\u078e\u0806\5\u0098M\2\u078f\u0790\7_\2\2\u0790\u0791\7\5\2\2\u0791"+
		"\u0806\5\u00e2r\2\u0792\u0794\7\u0097\2\2\u0793\u0792\3\2\2\2\u0793\u0794"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0797\7f\2\2\u0796\u0798\7\5\2\2\u0797"+
		"\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u0806\5\u009a"+
		"N\2\u079a\u079c\7k\2\2\u079b\u079d\7\5\2\2\u079c\u079b\3\2\2\2\u079c\u079d"+
		"\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u0806\5\u00c6d\2\u079f\u07a1\7s\2\2"+
		"\u07a0\u07a2\7\5\2\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u0806\5\u00c6d\2\u07a4\u07a5\7\u0088\2\2\u07a5\u07a7\7"+
		"\u00a0\2\2\u07a6\u07a8\7\5\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2"+
		"\u07a8\u07a9\3\2\2\2\u07a9\u0806\5\u00c6d\2\u07aa\u07ac\7\u009a\2\2\u07ab"+
		"\u07ad\7\5\2\2\u07ac\u07ab\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2"+
		"\2\2\u07ae\u0806\5\u00e2r\2\u07af\u07b0\7\u00f4\2\2\u07b0\u07b2\7\u00a0"+
		"\2\2\u07b1\u07b3\7\5\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3"+
		"\u07b4\3\2\2\2\u07b4\u0806\5\u00c6d\2\u07b5\u07b7\7\u00fe\2\2\u07b6\u07b8"+
		"\7\5\2\2\u07b7\u07b6\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9"+
		"\u0806\t\34\2\2\u07ba\u07bc\7\u0115\2\2\u07bb\u07bd\7\5\2\2\u07bc\u07bb"+
		"\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u0806\5\u00e2r"+
		"\2\u07bf\u07c1\7\u0147\2\2\u07c0\u07c2\7\5\2\2\u07c1\u07c0\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u0806\5\u00e2r\2\u07c4\u07c6"+
		"\7\u0158\2\2\u07c5\u07c7\7\5\2\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2"+
		"\2\u07c7\u07c8\3\2\2\2\u07c8\u0806\5\u00e2r\2\u07c9\u07cb\7\u0185\2\2"+
		"\u07ca\u07cc\7\5\2\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cf"+
		"\3\2\2\2\u07cd\u07d0\5\u00e2r\2\u07ce\u07d0\7\u0097\2\2\u07cf\u07cd\3"+
		"\2\2\2\u07cf\u07ce\3\2\2\2\u07d0\u0806\3\2\2\2\u07d1\u07d3\7\u018c\2\2"+
		"\u07d2\u07d4\7\5\2\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5"+
		"\3\2\2\2\u07d5\u0806\5\u00c6d\2\u07d6\u07d8\7\u01ce\2\2\u07d7\u07d9\7"+
		"\5\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da"+
		"\u0806\t\35\2\2\u07db\u07dd\7\u0266\2\2\u07dc\u07de\7\5\2\2\u07dd\u07dc"+
		"\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07e2\5\u00e2r"+
		"\2\u07e0\u07e2\7\u0097\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e0\3\2\2\2\u07e2"+
		"\u0806\3\2\2\2\u07e3\u07e5\7\u0267\2\2\u07e4\u07e6\7\5\2\2\u07e5\u07e4"+
		"\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07ea\5\u00e2r"+
		"\2\u07e8\u07ea\7\u0097\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07e8\3\2\2\2\u07ea"+
		"\u0806\3\2\2\2\u07eb\u07ed\7\u0268\2\2\u07ec\u07ee\7\5\2\2\u07ed\u07ec"+
		"\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u0806\5\u00e2r"+
		"\2\u07f0\u07f1\7\u0218\2\2\u07f1\u07f4\5\60\31\2\u07f2\u07f3\7\u020b\2"+
		"\2\u07f3\u07f5\t\30\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u0806\3\2\2\2\u07f6\u07f8\7\u0238\2\2\u07f7\u07f9\7\5\2\2\u07f8\u07f7"+
		"\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\7\n\2\2\u07fb"+
		"\u0800\5\u00d4k\2\u07fc\u07fd\7\4\2\2\u07fd\u07ff\5\u00d4k\2\u07fe\u07fc"+
		"\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801"+
		"\u0803\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u0804\7\13\2\2\u0804\u0806\3"+
		"\2\2\2\u0805\u0774\3\2\2\2\u0805\u0779\3\2\2\2\u0805\u077e\3\2\2\2\u0805"+
		"\u0784\3\2\2\2\u0805\u078f\3\2\2\2\u0805\u0793\3\2\2\2\u0805\u079a\3\2"+
		"\2\2\u0805\u079f\3\2\2\2\u0805\u07a4\3\2\2\2\u0805\u07aa\3\2\2\2\u0805"+
		"\u07af\3\2\2\2\u0805\u07b5\3\2\2\2\u0805\u07ba\3\2\2\2\u0805\u07bf\3\2"+
		"\2\2\u0805\u07c4\3\2\2\2\u0805\u07c9\3\2\2\2\u0805\u07d1\3\2\2\2\u0805"+
		"\u07d6\3\2\2\2\u0805\u07db\3\2\2\2\u0805\u07e3\3\2\2\2\u0805\u07eb\3\2"+
		"\2\2\u0805\u07f0\3\2\2\2\u0805\u07f6\3\2\2\2\u0806\u0097\3\2\2\2\u0807"+
		"\u080a\5\u00e4s\2\u0808\u080a\5\u00c6d\2\u0809\u0807\3\2\2\2\u0809\u0808"+
		"\3\2\2\2\u080a\u0099\3\2\2\2\u080b\u080e\5\u00e4s\2\u080c\u080e\5\u00c6"+
		"d\2\u080d\u080b\3\2\2\2\u080d\u080c\3\2\2\2\u080e\u009b\3\2\2\2\u080f"+
		"\u0813\5\u00e4s\2\u0810\u0813\5\u00c6d\2\u0811\u0813\5\u00d2j\2\u0812"+
		"\u080f\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0811\3\2\2\2\u0813\u009d\3\2"+
		"\2\2\u0814\u0817\5\u00e4s\2\u0815\u0817\5\u00c6d\2\u0816\u0814\3\2\2\2"+
		"\u0816\u0815\3\2\2\2\u0817\u009f\3\2\2\2\u0818\u081b\5\u00e4s\2\u0819"+
		"\u081b\5\u00d2j\2\u081a\u0818\3\2\2\2\u081a\u0819\3\2\2\2\u081b\u00a1"+
		"\3\2\2\2\u081c\u081d\5\u00e4s\2\u081d\u00a3\3\2\2\2\u081e\u0824\bS\1\2"+
		"\u081f\u0825\5\u00aaV\2\u0820\u0825\5\u00b2Z\2\u0821\u0825\5\u00b4[\2"+
		"\u0822\u0825\5\u00aeX\2\u0823\u0825\5\u00acW\2\u0824\u081f\3\2\2\2\u0824"+
		"\u0820\3\2\2\2\u0824\u0821\3\2\2\2\u0824\u0822\3\2\2\2\u0824\u0823\3\2"+
		"\2\2\u0825\u082f\3\2\2\2\u0826\u0829\5\u00ba^\2\u0827\u0829\5\u00a8U\2"+
		"\u0828\u0826\3\2\2\2\u0828\u0827\3\2\2\2\u0829\u082f\3\2\2\2\u082a\u082f"+
		"\5\u00a6T\2\u082b\u082c\t\36\2\2\u082c\u082f\5\u00a4S\7\u082d\u082f\5"+
		"\u00b6\\\2\u082e\u081e\3\2\2\2\u082e\u0828\3\2\2\2\u082e\u082a\3\2\2\2"+
		"\u082e\u082b\3\2\2\2\u082e\u082d\3\2\2\2\u082f\u083b\3\2\2\2\u0830\u0831"+
		"\f\6\2\2\u0831\u0832\t\37\2\2\u0832\u083a\5\u00a4S\7\u0833\u0834\f\5\2"+
		"\2\u0834\u0835\7\u025e\2\2\u0835\u083a\5\u00a4S\6\u0836\u0837\f\4\2\2"+
		"\u0837\u0838\t \2\2\u0838\u083a\5\u00a4S\5\u0839\u0830\3\2\2\2\u0839\u0833"+
		"\3\2\2\2\u0839\u0836\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b"+
		"\u083c\3\2\2\2\u083c\u00a5\3\2\2\2\u083d\u083b\3\2\2\2\u083e\u083f\7\u0265"+
		"\2\2\u083f\u0840\7\n\2\2\u0840\u0841\5\u00a4S\2\u0841\u0842\78\2\2\u0842"+
		"\u0843\5\u0080A\2\u0843\u0844\7\13\2\2\u0844\u00a7\3\2\2\2\u0845\u0847"+
		"\5\u00b6\\\2\u0846\u0848\7\u016f\2\2\u0847\u0846\3\2\2\2\u0847\u0848\3"+
		"\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\7E\2\2\u084a\u084b\5\u00b6\\\2"+
		"\u084b\u084c\7\66\2\2\u084c\u084d\5\u00b6\\\2\u084d\u00a9\3\2\2\2\u084e"+
		"\u084f\5\u00b6\\\2\u084f\u0850\5\u00b0Y\2\u0850\u0851\5\u00b6\\\2\u0851"+
		"\u085a\3\2\2\2\u0852\u0853\5\u00b6\\\2\u0853\u0854\5\u00b0Y\2\u0854\u0855"+
		"\t!\2\2\u0855\u0856\7\n\2\2\u0856\u0857\5F$\2\u0857\u0858\7\13\2\2\u0858"+
		"\u085a\3\2\2\2\u0859\u084e\3\2\2\2\u0859\u0852\3\2\2\2\u085a\u00ab\3\2"+
		"\2\2\u085b\u085d\5\u00b6\\\2\u085c\u085e\7\u016f\2\2\u085d\u085c\3\2\2"+
		"\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\7\u00f3\2\2\u0860"+
		"\u0861\7\n\2\2\u0861\u0862\5F$\2\u0862\u0863\7\13\2\2\u0863\u0872\3\2"+
		"\2\2\u0864\u0866\5\u00b6\\\2\u0865\u0867\7\u016f\2\2\u0866\u0865\3\2\2"+
		"\2\u0866\u0867\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\7\u00f3\2\2\u0869"+
		"\u086a\7\n\2\2\u086a\u086d\5\u00a4S\2\u086b\u086c\7\4\2\2\u086c\u086e"+
		"\5\u00a4S\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\3\2\2"+
		"\2\u086f\u0870\7\13\2\2\u0870\u0872\3\2\2\2\u0871\u085b\3\2\2\2\u0871"+
		"\u0864\3\2\2\2\u0872\u00ad\3\2\2\2\u0873\u0875\5\u00b6\\\2\u0874\u0876"+
		"\7\u016f\2\2\u0875\u0874\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\3\2\2"+
		"\2\u0877\u0878\7\u01ae\2\2\u0878\u0879\5\u00b6\\\2\u0879\u00af\3\2\2\2"+
		"\u087a\u087b\t\"\2\2\u087b\u00b1\3\2\2\2\u087c\u087d\5\u00b8]\2\u087d"+
		"\u087f\7\u010d\2\2\u087e\u0880\7\u016f\2\2\u087f\u087e\3\2\2\2\u087f\u0880"+
		"\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\t#\2\2\u0882\u00b3\3\2\2\2\u0883"+
		"\u0884\5\u00b6\\\2\u0884\u0885\7\u01ed\2\2\u0885\u0886\7\u011f\2\2\u0886"+
		"\u0887\5\u00b6\\\2\u0887\u0893\3\2\2\2\u0888\u088a\5\u00b6\\\2\u0889\u088b"+
		"\7\u016f\2\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2"+
		"\2\u088c\u088d\7\u011f\2\2\u088d\u0890\5\u00b8]\2\u088e\u088f\7\u00ba"+
		"\2\2\u088f\u0891\5\u00b8]\2\u0890\u088e\3\2\2\2\u0890\u0891\3\2\2\2\u0891"+
		"\u0893\3\2\2\2\u0892\u0883\3\2\2\2\u0892\u0888\3\2\2\2\u0893\u00b5\3\2"+
		"\2\2\u0894\u0895\b\\\1\2\u0895\u0896\5\u00b8]\2\u0896\u08ab\3\2\2\2\u0897"+
		"\u0898\f\t\2\2\u0898\u0899\7\31\2\2\u0899\u08aa\5\u00b6\\\n\u089a\u089b"+
		"\f\b\2\2\u089b\u089c\t$\2\2\u089c\u08aa\5\u00b6\\\t\u089d\u089e\f\7\2"+
		"\2\u089e\u089f\t%\2\2\u089f\u08aa\5\u00b6\\\b\u08a0\u08a1\f\6\2\2\u08a1"+
		"\u08a2\t&\2\2\u08a2\u08aa\5\u00b6\\\7\u08a3\u08a4\f\5\2\2\u08a4\u08a5"+
		"\7\"\2\2\u08a5\u08aa\5\u00b6\\\6\u08a6\u08a7\f\4\2\2\u08a7\u08a8\7#\2"+
		"\2\u08a8\u08aa\5\u00b6\\\5\u08a9\u0897\3\2\2\2\u08a9\u089a\3\2\2\2\u08a9"+
		"\u089d\3\2\2\2\u08a9\u08a0\3\2\2\2\u08a9\u08a3\3\2\2\2\u08a9\u08a6\3\2"+
		"\2\2\u08aa\u08ad\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac"+
		"\u00b7\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ae\u08af\b]\1\2\u08af\u08e1\5\u00c2"+
		"b\2\u08b0\u08e1\5\u00bc_\2\u08b1\u08e1\5\20\t\2\u08b2\u08e1\5\16\b\2\u08b3"+
		"\u08b4\5\u00d4k\2\u08b4\u08b5\7$\2\2\u08b5\u08b7\3\2\2\2\u08b6\u08b3\3"+
		"\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08e1\5\u00d8m\2"+
		"\u08b9\u08e1\7%\2\2\u08ba\u08bb\7\n\2\2\u08bb\u08be\5\u00a4S\2\u08bc\u08bd"+
		"\7\4\2\2\u08bd\u08bf\5\u00a4S\2\u08be\u08bc\3\2\2\2\u08be\u08bf\3\2\2"+
		"\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\7\13\2\2\u08c1\u08e1\3\2\2\2\u08c2"+
		"\u08c3\7\n\2\2\u08c3\u08c4\5F$\2\u08c4\u08c5\7\13\2\2\u08c5\u08e1\3\2"+
		"\2\2\u08c6\u08e1\5\u00be`\2\u08c7\u08c8\7G\2\2\u08c8\u08e1\5\u00b8]\2"+
		"\u08c9\u08ca\7\17\2\2\u08ca\u08e1\5\u00b8]\7\u08cb\u08cc\t\'\2\2\u08cc"+
		"\u08e1\5\u00b8]\6\u08cd\u08ce\7\u01cc\2\2\u08ce\u08cf\7\n\2\2\u08cf\u08d2"+
		"\5\u00a4S\2\u08d0\u08d1\7\4\2\2\u08d1\u08d3\5\u00a4S\2\u08d2\u08d0\3\2"+
		"\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\7\13\2\2\u08d5"+
		"\u08e1\3\2\2\2\u08d6\u08d7\7\u00c0\2\2\u08d7\u08d8\7\n\2\2\u08d8\u08d9"+
		"\5F$\2\u08d9\u08da\7\13\2\2\u08da\u08e1\3\2\2\2\u08db\u08dc\7\r\2\2\u08dc"+
		"\u08dd\5\u00e4s\2\u08dd\u08de\5\u00a4S\2\u08de\u08df\7\16\2\2\u08df\u08e1"+
		"\3\2\2\2\u08e0\u08ae\3\2\2\2\u08e0\u08b0\3\2\2\2\u08e0\u08b1\3\2\2\2\u08e0"+
		"\u08b2\3\2\2\2\u08e0\u08b6\3\2\2\2\u08e0\u08b9\3\2\2\2\u08e0\u08ba\3\2"+
		"\2\2\u08e0\u08c2\3\2\2\2\u08e0\u08c6\3\2\2\2\u08e0\u08c7\3\2\2\2\u08e0"+
		"\u08c9\3\2\2\2\u08e0\u08cb\3\2\2\2\u08e0\u08cd\3\2\2\2\u08e0\u08d6\3\2"+
		"\2\2\u08e0\u08db\3\2\2\2\u08e1\u08e7\3\2\2\2\u08e2\u08e3\f\b\2\2\u08e3"+
		"\u08e4\7f\2\2\u08e4\u08e6\5\u009aN\2\u08e5\u08e2\3\2\2\2\u08e6\u08e9\3"+
		"\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u00b9\3\2\2\2\u08e9"+
		"\u08e7\3\2\2\2\u08ea\u08eb\7V\2\2\u08eb\u08ec\5\u00a4S\2\u08ec\u08ed\7"+
		"\u0254\2\2\u08ed\u08ee\5\u00c2b\2\u08ee\u08ef\7\u0220\2\2\u08ef\u08f7"+
		"\5\u00a4S\2\u08f0\u08f1\7\u0254\2\2\u08f1\u08f2\5\u00c2b\2\u08f2\u08f3"+
		"\7\u0220\2\2\u08f3\u08f4\5\u00a4S\2\u08f4\u08f6\3\2\2\2\u08f5\u08f0\3"+
		"\2\2\2\u08f6\u08f9\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8"+
		"\u08fc\3\2\2\2\u08f9\u08f7\3\2\2\2\u08fa\u08fb\7\u00af\2\2\u08fb\u08fd"+
		"\5\u00a4S\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08fe\3\2\2"+
		"\2\u08fe\u08ff\7\u00b3\2\2\u08ff\u0916\3\2\2\2\u0900\u0901\7V\2\2\u0901"+
		"\u0902\7\u0254\2\2\u0902\u0903\5\u00a4S\2\u0903\u0904\7\u0220\2\2\u0904"+
		"\u090c\5\u00a4S\2\u0905\u0906\7\u0254\2\2\u0906\u0907\5\u00a4S\2\u0907"+
		"\u0908\7\u0220\2\2\u0908\u0909\5";
	private static final String _serializedATNSegment1 =
		"\u00a4S\2\u0909\u090b\3\2\2\2\u090a\u0905\3\2\2\2\u090b\u090e\3\2\2\2"+
		"\u090c\u090a\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u0911\3\2\2\2\u090e\u090c"+
		"\3\2\2\2\u090f\u0910\7\u00af\2\2\u0910\u0912\5\u00a4S\2\u0911\u090f\3"+
		"\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\7\u00b3\2\2"+
		"\u0914\u0916\3\2\2\2\u0915\u08ea\3\2\2\2\u0915\u0900\3\2\2\2\u0916\u00bb"+
		"\3\2\2\2\u0917\u0918\5\u00a0Q\2\u0918\u0919\7\n\2\2\u0919\u091a\7\13\2"+
		"\2\u091a\u0928\3\2\2\2\u091b\u091c\5\u00a0Q\2\u091c\u091d\7\n\2\2\u091d"+
		"\u0922\5\u00a4S\2\u091e\u091f\7\4\2\2\u091f\u0921\5\u00a4S\2\u0920\u091e"+
		"\3\2\2\2\u0921\u0924\3\2\2\2\u0922\u0920\3\2\2\2\u0922\u0923\3\2\2\2\u0923"+
		"\u0925\3\2\2\2\u0924\u0922\3\2\2\2\u0925\u0926\7\13\2\2\u0926\u0928\3"+
		"\2\2\2\u0927\u0917\3\2\2\2\u0927\u091b\3\2\2\2\u0928\u00bd\3\2\2\2\u0929"+
		"\u092a\7\u0107\2\2\u092a\u092b\5\u00a4S\2\u092b\u092c\5\u00c0a\2\u092c"+
		"\u00bf\3\2\2\2\u092d\u092e\t(\2\2\u092e\u00c1\3\2\2\2\u092f\u0937\5\u00c4"+
		"c\2\u0930\u0937\5\u00c6d\2\u0931\u0937\5\u00ceh\2\u0932\u0937\7\u0172"+
		"\2\2\u0933\u0937\t)\2\2\u0934\u0937\5\u00caf\2\u0935\u0937\5\u00c8e\2"+
		"\u0936\u092f\3\2\2\2\u0936\u0930\3\2\2\2\u0936\u0931\3\2\2\2\u0936\u0932"+
		"\3\2\2\2\u0936\u0933\3\2\2\2\u0936\u0934\3\2\2\2\u0936\u0935\3\2\2\2\u0937"+
		"\u00c3\3\2\2\2\u0938\u0939\t*\2\2\u0939\u00c5\3\2\2\2\u093a\u0946\7\u026f"+
		"\2\2\u093b\u093d\5\u00ccg\2\u093c\u093b\3\2\2\2\u093c\u093d\3\2\2\2\u093d"+
		"\u093e\3\2\2\2\u093e\u0941\7\u0270\2\2\u093f\u0940\7f\2\2\u0940\u0942"+
		"\5\u009aN\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0946\3\2\2"+
		"\2\u0943\u0944\7\'\2\2\u0944\u0946\7\u0270\2\2\u0945\u093a\3\2\2\2\u0945"+
		"\u093c\3\2\2\2\u0945\u0943\3\2\2\2\u0946\u00c7\3\2\2\2\u0947\u0949\5\u00cc"+
		"g\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\3\2\2\2\u094a"+
		"\u094b\7\u026b\2\2\u094b\u094c\7f\2\2\u094c\u094d\5\u009aN\2\u094d\u00c9"+
		"\3\2\2\2\u094e\u094f\5\u00ccg\2\u094f\u0950\7\u026a\2\2\u0950\u0951\7"+
		"f\2\2\u0951\u0952\5\u009aN\2\u0952\u00cb\3\2\2\2\u0953\u0954\7\u0272\2"+
		"\2\u0954\u00cd\3\2\2\2\u0955\u0956\t+\2\2\u0956\u0960\5\u00c6d\2\u0957"+
		"\u0958\7\r\2\2\u0958\u0959\5\u00e4s\2\u0959\u095a\5\u00c6d\2\u095a\u095b"+
		"\7\16\2\2\u095b\u0960\3\2\2\2\u095c\u0960\7\u0082\2\2\u095d\u0960\7\u0083"+
		"\2\2\u095e\u0960\7\u0084\2\2\u095f\u0955\3\2\2\2\u095f\u0957\3\2\2\2\u095f"+
		"\u095c\3\2\2\2\u095f\u095d\3\2\2\2\u095f\u095e\3\2\2\2\u0960\u00cf\3\2"+
		"\2\2\u0961\u0964\5\u00e4s\2\u0962\u0964\5\u00d2j\2\u0963\u0961\3\2\2\2"+
		"\u0963\u0962\3\2\2\2\u0964\u00d1\3\2\2\2\u0965\u0966\t,\2\2\u0966\u00d3"+
		"\3\2\2\2\u0967\u0968\5\u00d6l\2\u0968\u0969\7$\2\2\u0969\u096b\3\2\2\2"+
		"\u096a\u0967\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096e\3\2\2\2\u096c\u096f"+
		"\5\u00e4s\2\u096d\u096f\5\u00d2j\2\u096e\u096c\3\2\2\2\u096e\u096d\3\2"+
		"\2\2\u096f\u00d5\3\2\2\2\u0970\u0971\5\u00e4s\2\u0971\u00d7\3\2\2\2\u0972"+
		"\u0976\5\u00e4s\2\u0973\u0976\5\u00d2j\2\u0974\u0976\7\f\2\2\u0975\u0972"+
		"\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0974\3\2\2\2\u0976\u00d9\3\2\2\2\u0977"+
		"\u0978\5\u00e4s\2\u0978\u00db\3\2\2\2\u0979\u097a\5\u00e4s\2\u097a\u00dd"+
		"\3\2\2\2\u097b\u097c\7\u026e\2\2\u097c\u00df\3\2\2\2\u097d\u097e\7\u026e"+
		"\2\2\u097e\u00e1\3\2\2\2\u097f\u0980\7\u026e\2\2\u0980\u00e3\3\2\2\2\u0981"+
		"\u0982\t-\2\2\u0982\u00e5\3\2\2\2\u016e\u00e8\u00ea\u00f5\u00fc\u0101"+
		"\u0107\u0116\u011e\u0124\u0138\u0144\u0147\u014c\u0156\u015b\u015f\u0161"+
		"\u016f\u0176\u017a\u017f\u0186\u018a\u0190\u0197\u019b\u019f\u01a5\u01ae"+
		"\u01b3\u01b6\u01ba\u01c0\u01c9\u01ce\u01d1\u01d4\u01d7\u01dd\u01e3\u01ed"+
		"\u01ef\u01f6\u01fd\u01ff\u0207\u020c\u020f\u0217\u021d\u022d\u0239\u023b"+
		"\u023e\u0246\u024c\u0252\u025c\u0261\u0268\u026a\u026f\u0278\u027d\u0280"+
		"\u0284\u0289\u028f\u0295\u029a\u029f\u02a4\u02a9\u02ac\u02b3\u02c4\u02c8"+
		"\u02cc\u02d1\u02d5\u02db\u02e0\u02e6\u02e8\u02ed\u02f5\u02fb\u02ff\u0303"+
		"\u0306\u0309\u030f\u0315\u031c\u0320\u0325\u032d\u0334\u0338\u033c\u033e"+
		"\u0342\u0345\u0348\u034f\u0356\u0366\u036c\u0371\u0375\u037c\u037f\u0387"+
		"\u038e\u0392\u0397\u03a3\u03ab\u03ae\u03b4\u03bc\u03c1\u03c5\u03c7\u03cf"+
		"\u03d7\u03d9\u03de\u03e3\u03e7\u03ef\u03f2\u03f8\u03fb\u03ff\u0406\u040d"+
		"\u040f\u0413\u041a\u0423\u0429\u0430\u0433\u0439\u043c\u0440\u0445\u0447"+
		"\u044b\u044e\u0458\u045f\u046a\u046e\u0475\u047e\u0483\u0487\u048a\u0492"+
		"\u049b\u049e\u04a1\u04a4\u04a8\u04b0\u04b8\u04bf\u04c6\u04ca\u04cf\u04db"+
		"\u04dd\u04e1\u04ea\u04f1\u04fc\u04fe\u0502\u050d\u050f\u0513\u051e\u0520"+
		"\u0524\u0527\u052e\u0538\u0541\u0544\u0549\u0551\u0558\u055d\u0560\u0568"+
		"\u056f\u0573\u0576\u057a\u057d\u0580\u0588\u058f\u0594\u0597\u059f\u05a6"+
		"\u05ab\u05ae\u05b6\u05bd\u05c1\u05c4\u05c9\u05d1\u05dc\u05e2\u05e6\u05ec"+
		"\u05ef\u0608\u060b\u0612\u061b\u061e\u0621\u0628\u062b\u062e\u0635\u0638"+
		"\u063b\u0642\u0645\u0648\u064f\u0652\u0655\u065c\u065f\u0662\u066b\u066e"+
		"\u0671\u067a\u067d\u0680\u0689\u068c\u068f\u0698\u069b\u069e\u06a7\u06aa"+
		"\u06ad\u06b9\u06bc\u06c1\u06c8\u06cb\u06d0\u06d7\u06de\u06e6\u06eb\u06ef"+
		"\u06f4\u06f8\u06fd\u0701\u0706\u070d\u0713\u071a\u0720\u0724\u072d\u0730"+
		"\u0737\u0740\u074a\u0751\u075c\u0768\u076c\u0771\u0776\u077b\u0780\u0784"+
		"\u0789\u078c\u0793\u0797\u079c\u07a1\u07a7\u07ac\u07b2\u07b7\u07bc\u07c1"+
		"\u07c6\u07cb\u07cf\u07d3\u07d8\u07dd\u07e1\u07e5\u07e9\u07ed\u07f4\u07f8"+
		"\u0800\u0805\u0809\u080d\u0812\u0816\u081a\u0824\u0828\u082e\u0839\u083b"+
		"\u0847\u0859\u085d\u0866\u086d\u0871\u0875\u087f\u088a\u0890\u0892\u08a9"+
		"\u08ab\u08b6\u08be\u08d2\u08e0\u08e7\u08f7\u08fc\u090c\u0911\u0915\u0922"+
		"\u0927\u0936\u093c\u0941\u0945\u0948\u095f\u0963\u096a\u096e\u0975";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}