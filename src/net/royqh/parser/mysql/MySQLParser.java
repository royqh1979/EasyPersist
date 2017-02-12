package net.royqh.parser.mysql;// Generated from E:/Workspaces/Tools/antlr.mysql/src/main/resources\MySQL.g4 by ANTLR 4.6

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

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
		K_IPC=266, K_IS=267, K_ISOLATION=268, K_ISSUER=269, K_ITERATE=270, K_JOIN=271, 
		K_KEY=272, K_KEYS=273, K_KEY_BLOCK_SIZE=274, K_KILL=275, K_LANGUAGE=276, 
		K_LAST=277, K_LEADING=278, K_LEAVE=279, K_LEAVES=280, K_LEFT=281, K_LESS=282, 
		K_LEVEL=283, K_LIKE=284, K_LIMIT=285, K_LINEAR=286, K_LINES=287, K_LINESTRING=288, 
		K_LIST=289, K_LOAD=290, K_LOCAL=291, K_LOCALTIME=292, K_LOCALTIMESTAMP=293, 
		K_LOCK=294, K_LOCKS=295, K_LOGFILE=296, K_LOGS=297, K_LONG=298, K_LONGBLOB=299, 
		K_LONGTEXT=300, K_LOOP=301, K_LOW_PRIORITY=302, K_MASTER=303, K_MASTER_CONNECT_RETRY=304, 
		K_MASTER_HEARTBEAT_PERIOD=305, K_MASTER_HOST=306, K_MASTER_LOG_FILE=307, 
		K_MASTER_LOG_POS=308, K_MASTER_PASSWORD=309, K_MASTER_PORT=310, K_MASTER_SERVER_ID=311, 
		K_MASTER_SSL=312, K_MASTER_SSL_CA=313, K_MASTER_SSL_CAPATH=314, K_MASTER_SSL_CERT=315, 
		K_MASTER_SSL_CIPHER=316, K_MASTER_SSL_KEY=317, K_MASTER_SSL_VERIFY_SERVER_CERT=318, 
		K_MASTER_USER=319, K_MATCH=320, K_MAXVALUE=321, K_MAX_CONNECTIONS_PER_HOUR=322, 
		K_MAX_QUERIES_PER_HOUR=323, K_MAX_ROWS=324, K_MAX_SIZE=325, K_MAX_UPDATES_PER_HOUR=326, 
		K_MAX_USER_CONNECTIONS=327, K_MEDIUM=328, K_MEDIUMBLOB=329, K_MEDIUMINT=330, 
		K_MEDIUMTEXT=331, K_MEMORY=332, K_MERGE=333, K_MESSAGE_TEXT=334, K_MICROSECOND=335, 
		K_MIDDLEINT=336, K_MIGRATE=337, K_MINUTE=338, K_MINUTE_MICROSECOND=339, 
		K_MINUTE_SECOND=340, K_MIN_ROWS=341, K_MOD=342, K_MODE=343, K_MODIFIES=344, 
		K_MODIFY=345, K_MONTH=346, K_MULTILINESTRING=347, K_MULTIPOINT=348, K_MULTIPOLYGON=349, 
		K_MUTEX=350, K_MYSQL_ERRNO=351, K_NAME=352, K_NAMES=353, K_NATIONAL=354, 
		K_NATURAL=355, K_NCHAR=356, K_NDB=357, K_NDBCLUSTER=358, K_NEW=359, K_NEXT=360, 
		K_NO=361, K_NODEGROUP=362, K_NONE=363, K_NOT=364, K_NO_WAIT=365, K_NO_WRITE_TO_BINLOG=366, 
		K_NULL=367, K_NUMERIC=368, K_NVARCHAR=369, K_OFFSET=370, K_OLD_PASSWORD=371, 
		K_ON=372, K_ONE=373, K_ONE_SHOT=374, K_OPEN=375, K_OPTIMIZE=376, K_OPTION=377, 
		K_OPTIONALLY=378, K_OPTIONS=379, K_OR=380, K_ORDER=381, K_OUT=382, K_OUTER=383, 
		K_OUTFILE=384, K_OWNER=385, K_PACK_KEYS=386, K_PAGE=387, K_PARSER=388, 
		K_PARTIAL=389, K_PARTITION=390, K_PARTITIONING=391, K_PARTITIONS=392, 
		K_PASSWORD=393, K_PHASE=394, K_PLUGIN=395, K_PLUGINS=396, K_POINT=397, 
		K_POLYGON=398, K_PORT=399, K_PRECISION=400, K_PREPARE=401, K_PRESERVE=402, 
		K_PREV=403, K_PRIMARY=404, K_PRIVILEGES=405, K_PROCEDURE=406, K_PROCESSLIST=407, 
		K_PROFILE=408, K_PROFILES=409, K_PROXY=410, K_PURGE=411, K_QUARTER=412, 
		K_QUERY=413, K_QUICK=414, K_RANGE=415, K_READ=416, K_READS=417, K_READ_ONLY=418, 
		K_READ_WRITE=419, K_REAL=420, K_REBUILD=421, K_RECOVER=422, K_REDOFILE=423, 
		K_REDO_BUFFER_SIZE=424, K_REDUNDANT=425, K_REFERENCES=426, K_REGEXP=427, 
		K_RELAY=428, K_RELAYLOG=429, K_RELAY_LOG_FILE=430, K_RELAY_LOG_POS=431, 
		K_RELAY_THREAD=432, K_RELEASE=433, K_RELOAD=434, K_REMOVE=435, K_RENAME=436, 
		K_REORGANIZE=437, K_REPAIR=438, K_REPEAT=439, K_REPEATABLE=440, K_REPLACE=441, 
		K_REPLICATION=442, K_REQUIRE=443, K_RESET=444, K_RESIGNAL=445, K_RESTORE=446, 
		K_RESTRICT=447, K_RESUME=448, K_RETURN=449, K_RETURNS=450, K_REVOKE=451, 
		K_RIGHT=452, K_RLIKE=453, K_ROLLBACK=454, K_ROLLUP=455, K_ROUTINE=456, 
		K_ROW=457, K_ROWS=458, K_ROW_FORMAT=459, K_RTREE=460, K_SAVEPOINT=461, 
		K_SCHEDULE=462, K_SCHEMA=463, K_SCHEMAS=464, K_SCHEMA_NAME=465, K_SECOND=466, 
		K_SECOND_MICROSECOND=467, K_SECURITY=468, K_SELECT=469, K_SENSITIVE=470, 
		K_SEPARATOR=471, K_SERIAL=472, K_SERIALIZABLE=473, K_SERVER=474, K_SESSION=475, 
		K_SET=476, K_SHARE=477, K_SHOW=478, K_SHUTDOWN=479, K_SIGNAL=480, K_SIGNED=481, 
		K_SIMPLE=482, K_SLAVE=483, K_SLOW=484, K_SMALLINT=485, K_SNAPSHOT=486, 
		K_SOCKET=487, K_SOME=488, K_SONAME=489, K_SOUNDS=490, K_SOURCE=491, K_SPATIAL=492, 
		K_SPECIFIC=493, K_SQL=494, K_SQLEXCEPTION=495, K_SQLSTATE=496, K_SQLWARNING=497, 
		K_SQL_BIG_RESULT=498, K_SQL_BUFFER_RESULT=499, K_SQL_CACHE=500, K_SQL_CALC_FOUND_ROWS=501, 
		K_SQL_NO_CACHE=502, K_SQL_SMALL_RESULT=503, K_SQL_THREAD=504, K_SQL_TSI_DAY=505, 
		K_SQL_TSI_FRAC_SECOND=506, K_SQL_TSI_HOUR=507, K_SQL_TSI_MINUTE=508, K_SQL_TSI_MONTH=509, 
		K_SQL_TSI_QUARTER=510, K_SQL_TSI_SECOND=511, K_SQL_TSI_WEEK=512, K_SQL_TSI_YEAR=513, 
		K_SSL=514, K_START=515, K_STARTING=516, K_STARTS=517, K_STATUS=518, K_STOP=519, 
		K_STORAGE=520, K_STRAIGHT_JOIN=521, K_STRING=522, K_SUBCLASS_ORIGIN=523, 
		K_SUBJECT=524, K_SUBPARTITION=525, K_SUBPARTITIONS=526, K_SUPER=527, K_SUSPEND=528, 
		K_SWAPS=529, K_SWITCHES=530, K_TABLE=531, K_TABLES=532, K_TABLESPACE=533, 
		K_TABLE_CHECKSUM=534, K_TABLE_NAME=535, K_TEMPORARY=536, K_TEMPTABLE=537, 
		K_TERMINATED=538, K_TEXT=539, K_THAN=540, K_THEN=541, K_TIME=542, K_TIMESTAMP=543, 
		K_TIMESTAMPADD=544, K_TIMESTAMPDIFF=545, K_TINYBLOB=546, K_TINYINT=547, 
		K_TINYTEXT=548, K_TO=549, K_TRAILING=550, K_TRANSACTION=551, K_TRIGGER=552, 
		K_TRIGGERS=553, K_TRUE=554, K_TRUNCATE=555, K_TYPE=556, K_TYPES=557, K_UNCOMMITTED=558, 
		K_UNDEFINED=559, K_UNDO=560, K_UNDOFILE=561, K_UNDO_BUFFER_SIZE=562, K_UNICODE=563, 
		K_UNINSTALL=564, K_UNION=565, K_UNIQUE=566, K_UNKNOWN=567, K_UNLOCK=568, 
		K_UNSIGNED=569, K_UNTIL=570, K_UPDATE=571, K_UPGRADE=572, K_USAGE=573, 
		K_USE=574, K_USER=575, K_USER_RESOURCES=576, K_USE_FRM=577, K_USING=578, 
		K_UTC_DATE=579, K_UTC_TIME=580, K_UTC_TIMESTAMP=581, K_VALUE=582, K_VALUES=583, 
		K_VARBINARY=584, K_VARCHAR=585, K_VARCHARACTER=586, K_VARIABLES=587, K_VARYING=588, 
		K_VIEW=589, K_WAIT=590, K_WARNINGS=591, K_WEEK=592, K_WHEN=593, K_WHERE=594, 
		K_WHILE=595, K_WITH=596, K_WORK=597, K_WRAPPER=598, K_WRITE=599, K_X509=600, 
		K_XA=601, K_XML=602, K_XOR=603, K_YEAR=604, K_YEAR_MONTH=605, K_ZEROFILL=606, 
		K_ONLINE=607, K_OFFLINE=608, K_FORMAT=609, K_CAST=610, K_STATS_AUTO_RECALC=611, 
		K_STATS_PERSISTENT=612, K_STATS_SAMPLE_PAGES=613, K_OJ=614, HEX_VALUE=615, 
		BIT_VALUE=616, SCIENTIFIC_VALUE=617, FLOAT_VALUE=618, INTEGER_VALUE=619, 
		DOUBLE_QUOTED_STRING=620, SINGLE_QUOTED_STRING=621, QUOTED_IDENTIFIER=622, 
		UNDERLINE_STARTED_IDENTIFIER=623, UNQUOTED_IDENTIFIER=624, SINGLE_LINE_COMMENT=625, 
		MULTILINE_COMMENT=626, SPACES=627, UNEXPECTED_CHAR=628;
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
		RULE_update_stmt = 32, RULE_select_stmt = 33, RULE_order_by_clause = 34, 
		RULE_procedure_name = 35, RULE_procedure_list = 36, RULE_select_option = 37, 
		RULE_select_from_clause = 38, RULE_select_into_clause = 39, RULE_variable_list = 40, 
		RULE_position = 41, RULE_offset = 42, RULE_row_count = 43, RULE_select_expr = 44, 
		RULE_table_references = 45, RULE_escaped_table_reference = 46, RULE_table_reference = 47, 
		RULE_table_factor = 48, RULE_partition_names = 49, RULE_join_table = 50, 
		RULE_join_right_part = 51, RULE_join_condition = 52, RULE_index_hint_list = 53, 
		RULE_index_hint = 54, RULE_index_list = 55, RULE_user = 56, RULE_column_list = 57, 
		RULE_view_name = 58, RULE_create_definition = 59, RULE_column_definition = 60, 
		RULE_column_reference_definition = 61, RULE_column_attribute = 62, RULE_data_type = 63, 
		RULE_index_col_name = 64, RULE_index_type = 65, RULE_index_option = 66, 
		RULE_reference_definition = 67, RULE_reference_option = 68, RULE_on_delete_action = 69, 
		RULE_on_update_action = 70, RULE_action = 71, RULE_table_options = 72, 
		RULE_table_option = 73, RULE_charset_name = 74, RULE_collation_name = 75, 
		RULE_engine_name = 76, RULE_parser_name = 77, RULE_function_name = 78, 
		RULE_database_name = 79, RULE_expr = 80, RULE_cast_expr = 81, RULE_between_expr = 82, 
		RULE_comparison_expr = 83, RULE_in_expr = 84, RULE_regexp_expr = 85, RULE_comparison_operator = 86, 
		RULE_is_expr = 87, RULE_like_expr = 88, RULE_bit_expr = 89, RULE_simple_expr = 90, 
		RULE_case_expr = 91, RULE_function_call = 92, RULE_interval_expr = 93, 
		RULE_time_unit = 94, RULE_literal_value = 95, RULE_numeric_literal = 96, 
		RULE_string_literal = 97, RULE_bit_literal = 98, RULE_hex_literal = 99, 
		RULE_underlinestarted_charset_name = 100, RULE_date_literal = 101, RULE_alias_name = 102, 
		RULE_keyword = 103, RULE_table_name = 104, RULE_schema_name = 105, RULE_column_name = 106, 
		RULE_index_name = 107, RULE_symbol = 108, RULE_length = 109, RULE_decimals = 110, 
		RULE_value = 111, RULE_identifier = 112;
	public static final String[] ruleNames = {
		"prog", "error", "sql_stmt_list", "sql_stmt", "set_stmt", "variable_assignment", 
		"user_var_name", "var_name", "use_stmt", "create_index_stmt", "algorithm_option", 
		"lock_option", "drop_index_stmt", "drop_table_stmt", "drop_view_stmt", 
		"create_table_stmt", "partition_options", "partition_type", "sub_partition_type", 
		"partition_definition", "partition_option", "subpartition_definition", 
		"partition_name", "tablespace_name", "value_list", "literal_value_list", 
		"create_view_stmt", "delete_stmt", "insert_stmt", "insert_first_part", 
		"insert_dup_key_update_part", "insert_value_list", "update_stmt", "select_stmt", 
		"order_by_clause", "procedure_name", "procedure_list", "select_option", 
		"select_from_clause", "select_into_clause", "variable_list", "position", 
		"offset", "row_count", "select_expr", "table_references", "escaped_table_reference", 
		"table_reference", "table_factor", "partition_names", "join_table", "join_right_part", 
		"join_condition", "index_hint_list", "index_hint", "index_list", "user", 
		"column_list", "view_name", "create_definition", "column_definition", 
		"column_reference_definition", "column_attribute", "data_type", "index_col_name", 
		"index_type", "index_option", "reference_definition", "reference_option", 
		"on_delete_action", "on_update_action", "action", "table_options", "table_option", 
		"charset_name", "collation_name", "engine_name", "parser_name", "function_name", 
		"database_name", "expr", "cast_expr", "between_expr", "comparison_expr", 
		"in_expr", "regexp_expr", "comparison_operator", "is_expr", "like_expr", 
		"bit_expr", "simple_expr", "case_expr", "function_call", "interval_expr", 
		"time_unit", "literal_value", "numeric_literal", "string_literal", "bit_literal", 
		"hex_literal", "underlinestarted_charset_name", "date_literal", "alias_name", 
		"keyword", "table_name", "schema_name", "column_name", "index_name", "symbol", 
		"length", "decimals", "value", "identifier"
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
		"K_JOIN", "K_KEY", "K_KEYS", "K_KEY_BLOCK_SIZE", "K_KILL", "K_LANGUAGE", 
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
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__7 || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (K_CREATE - 125)) | (1L << (K_DELETE - 125)) | (1L << (K_DROP - 125)))) != 0) || _la==K_INSERT || _la==K_SELECT || _la==K_SET || ((((_la - 571)) & ~0x3f) == 0 && ((1L << (_la - 571)) & ((1L << (K_UPDATE - 571)) | (1L << (K_USE - 571)) | (1L << (UNEXPECTED_CHAR - 571)))) != 0)) {
				{
				setState(228);
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
					setState(226);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(227);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
			setState(235);
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(238);
				match(T__0);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			sql_stmt();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(245);
						match(T__0);
						}
						}
						setState(248); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(250);
					sql_stmt();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					match(T__0);
					}
					} 
				}
				setState(261);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(262);
				create_index_stmt();
				}
				break;
			case 2:
				{
				setState(263);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(264);
				create_view_stmt();
				}
				break;
			case 4:
				{
				setState(265);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(266);
				drop_index_stmt();
				}
				break;
			case 6:
				{
				setState(267);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(268);
				drop_view_stmt();
				}
				break;
			case 8:
				{
				setState(269);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(270);
				select_stmt(0);
				}
				break;
			case 10:
				{
				setState(271);
				update_stmt();
				}
				break;
			case 11:
				{
				setState(272);
				set_stmt();
				}
				break;
			case 12:
				{
				setState(273);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(K_SET);
				setState(277);
				variable_assignment();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(278);
					match(T__1);
					setState(279);
					variable_assignment();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(K_SET);
				setState(286);
				match(K_ONE_SHOT);
				setState(287);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				user_var_name();
				setState(291);
				match(T__2);
				setState(292);
				expr(0);
				}
				break;
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				var_name();
				setState(295);
				match(T__2);
				setState(296);
				expr(0);
				}
				break;
			case K_GLOBAL:
			case K_SESSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==K_GLOBAL || _la==K_SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				var_name();
				setState(300);
				match(T__2);
				setState(301);
				expr(0);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				var_name();
				setState(305);
				match(T__2);
				setState(306);
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
			setState(310);
			match(T__6);
			setState(311);
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
			setState(313);
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
			setState(315);
			match(K_USE);
			setState(316);
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
			setState(318);
			match(K_CREATE);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLINE || _la==K_OFFLINE) {
				{
				setState(319);
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

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FULLTEXT || _la==K_SPATIAL || _la==K_UNIQUE) {
				{
				setState(322);
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

			setState(325);
			match(K_INDEX);
			setState(326);
			index_name();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(327);
				index_type();
				}
			}

			setState(330);
			match(K_ON);
			setState(331);
			table_name();
			setState(332);
			match(T__7);
			setState(333);
			index_col_name();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(334);
				match(T__1);
				setState(335);
				index_col_name();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(T__8);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
				{
				setState(342);
				index_option();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ALGORITHM || _la==K_LOCK) {
				{
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ALGORITHM:
					{
					setState(345);
					algorithm_option();
					}
					break;
				case K_LOCK:
					{
					setState(346);
					lock_option();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(351);
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
			setState(352);
			match(K_ALGORITHM);
			setState(353);
			match(T__2);
			setState(354);
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
			setState(356);
			match(K_LOCK);
			setState(357);
			match(T__2);
			setState(358);
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
			setState(360);
			match(K_DROP);
			setState(361);
			match(K_INDEX);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLINE || _la==K_OFFLINE) {
				{
				setState(362);
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

			setState(365);
			index_name();
			setState(366);
			match(K_ON);
			setState(367);
			table_name();
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALGORITHM:
				{
				setState(368);
				algorithm_option();
				}
				break;
			case K_LOCK:
				{
				setState(369);
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
			setState(372);
			match(K_DROP);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMPORARY) {
				{
				setState(373);
				match(K_TEMPORARY);
				}
			}

			setState(376);
			match(K_TABLE);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(377);
				match(K_IF);
				setState(378);
				match(K_EXISTS);
				}
				break;
			}
			setState(381);
			table_name();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(382);
				match(T__1);
				setState(383);
				table_name();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE || _la==K_RESTRICT) {
				{
				setState(389);
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
			setState(392);
			match(K_DROP);
			setState(393);
			match(K_VIEW);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(394);
				match(K_IF);
				setState(395);
				match(K_EXISTS);
				}
			}

			setState(398);
			view_name();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(399);
				match(T__1);
				setState(400);
				view_name();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE || _la==K_RESTRICT) {
				{
				setState(406);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(K_CREATE);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(410);
					match(K_TEMPORARY);
					}
				}

				setState(413);
				match(K_TABLE);
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(414);
					match(K_IF);
					setState(415);
					match(K_NOT);
					setState(416);
					match(K_EXISTS);
					}
					break;
				}
				setState(419);
				table_name();
				setState(420);
				match(T__7);
				setState(421);
				create_definition();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(422);
					match(T__1);
					setState(423);
					create_definition();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(T__8);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_AUTO_INCREMENT - 61)) | (1L << (K_AVG_ROW_LENGTH - 61)) | (1L << (K_CHARACTER - 61)) | (1L << (K_CHARSET - 61)) | (1L << (K_CHECKSUM - 61)) | (1L << (K_COLLATE - 61)) | (1L << (K_COMMENT - 61)) | (1L << (K_CONNECTION - 61)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_DATA - 134)) | (1L << (K_DEFAULT - 134)) | (1L << (K_DELAY_KEY_WRITE - 134)) | (1L << (K_ENGINE - 134)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (K_INDEX - 242)) | (1L << (K_INSERT_METHOD - 242)) | (1L << (K_KEY_BLOCK_SIZE - 242)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (K_MAX_ROWS - 324)) | (1L << (K_MIN_ROWS - 324)) | (1L << (K_PACK_KEYS - 324)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (K_STATS_AUTO_RECALC - 611)) | (1L << (K_STATS_PERSISTENT - 611)) | (1L << (K_STATS_SAMPLE_PAGES - 611)))) != 0)) {
					{
					setState(430);
					table_options();
					}
				}

				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(433);
					partition_options();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateTableSelectStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(K_CREATE);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(437);
					match(K_TEMPORARY);
					}
				}

				setState(440);
				match(K_TABLE);
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(441);
					match(K_IF);
					setState(442);
					match(K_NOT);
					setState(443);
					match(K_EXISTS);
					}
					break;
				}
				setState(446);
				table_name();
				setState(447);
				match(T__7);
				setState(448);
				create_definition();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(449);
					match(T__1);
					setState(450);
					create_definition();
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(T__8);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_AUTO_INCREMENT - 61)) | (1L << (K_AVG_ROW_LENGTH - 61)) | (1L << (K_CHARACTER - 61)) | (1L << (K_CHARSET - 61)) | (1L << (K_CHECKSUM - 61)) | (1L << (K_COLLATE - 61)) | (1L << (K_COMMENT - 61)) | (1L << (K_CONNECTION - 61)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_DATA - 134)) | (1L << (K_DEFAULT - 134)) | (1L << (K_DELAY_KEY_WRITE - 134)) | (1L << (K_ENGINE - 134)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (K_INDEX - 242)) | (1L << (K_INSERT_METHOD - 242)) | (1L << (K_KEY_BLOCK_SIZE - 242)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (K_MAX_ROWS - 324)) | (1L << (K_MIN_ROWS - 324)) | (1L << (K_PACK_KEYS - 324)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (K_STATS_AUTO_RECALC - 611)) | (1L << (K_STATS_PERSISTENT - 611)) | (1L << (K_STATS_SAMPLE_PAGES - 611)))) != 0)) {
					{
					setState(457);
					table_options();
					}
				}

				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(460);
					partition_options();
					}
				}

				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_IGNORE || _la==K_REPLACE) {
					{
					setState(463);
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

				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(466);
					match(K_AS);
					}
				}

				setState(469);
				select_stmt(0);
				}
				break;
			case 3:
				_localctx = new CreateTableLikeStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(K_CREATE);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TEMPORARY) {
					{
					setState(472);
					match(K_TEMPORARY);
					}
				}

				setState(475);
				match(K_TABLE);
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(476);
					match(K_IF);
					setState(477);
					match(K_NOT);
					setState(478);
					match(K_EXISTS);
					}
					break;
				}
				setState(481);
				table_name();
				setState(489);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LIKE:
					{
					{
					setState(482);
					match(K_LIKE);
					setState(483);
					table_name();
					}
					}
					break;
				case T__7:
					{
					{
					setState(484);
					match(T__7);
					setState(485);
					match(K_LIKE);
					setState(486);
					table_name();
					setState(487);
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
			setState(493);
			match(K_PARTITION);
			setState(494);
			match(K_BY);
			setState(495);
			partition_type();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PARTITIONS) {
				{
				setState(496);
				match(K_PARTITIONS);
				setState(497);
				value();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SUBPARTITION) {
				{
				setState(500);
				match(K_SUBPARTITION);
				setState(501);
				match(K_BY);
				setState(502);
				sub_partition_type();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITIONS) {
					{
					setState(503);
					match(K_PARTITIONS);
					setState(504);
					value();
					}
				}

				}
			}

			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(509);
				match(T__7);
				setState(510);
				partition_definition();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(511);
					match(T__1);
					setState(512);
					partition_definition();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
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
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(522);
					match(K_LINEAR);
					}
				}

				setState(525);
				match(K_HASH);
				setState(526);
				match(T__7);
				setState(527);
				expr(0);
				setState(528);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(530);
					match(K_LINEAR);
					}
				}

				setState(533);
				match(K_KEY);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALGORITHM) {
					{
					setState(534);
					match(K_ALGORITHM);
					setState(535);
					match(T__2);
					setState(536);
					value();
					}
				}

				setState(539);
				match(T__7);
				setState(540);
				column_list();
				setState(541);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				match(K_RANGE);
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(544);
					match(T__7);
					setState(545);
					expr(0);
					setState(546);
					match(T__8);
					}
					break;
				case K_COLUMNS:
					{
					setState(548);
					match(K_COLUMNS);
					setState(549);
					match(T__7);
					setState(550);
					column_list();
					setState(551);
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
				setState(555);
				match(K_LIST);
				setState(565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(556);
					match(T__7);
					setState(557);
					expr(0);
					setState(558);
					match(T__8);
					}
					break;
				case K_COLUMNS:
					{
					setState(560);
					match(K_COLUMNS);
					setState(561);
					match(T__7);
					setState(562);
					column_list();
					setState(563);
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
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(569);
					match(K_LINEAR);
					}
				}

				setState(572);
				match(K_HASH);
				setState(573);
				match(T__7);
				setState(574);
				expr(0);
				setState(575);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LINEAR) {
					{
					setState(577);
					match(K_LINEAR);
					}
				}

				setState(580);
				match(K_KEY);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALGORITHM) {
					{
					setState(581);
					match(K_ALGORITHM);
					setState(582);
					match(T__2);
					setState(583);
					value();
					}
				}

				setState(586);
				match(T__7);
				setState(587);
				column_list();
				setState(588);
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
			setState(592);
			match(K_PARTITION);
			setState(593);
			partition_name();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VALUES) {
				{
				setState(594);
				match(K_VALUES);
				setState(612);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LESS:
					{
					setState(595);
					match(K_LESS);
					setState(596);
					match(K_THAN);
					setState(605);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(597);
						match(T__7);
						setState(600);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(598);
							expr(0);
							}
							break;
						case 2:
							{
							setState(599);
							value_list();
							}
							break;
						}
						setState(602);
						match(T__8);
						}
						break;
					case K_MAXVALUE:
						{
						setState(604);
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
					setState(607);
					match(K_IN);
					setState(608);
					match(T__7);
					setState(609);
					value_list();
					setState(610);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT || _la==K_DATA || _la==K_ENGINE || _la==K_INDEX || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (K_MAX_ROWS - 324)) | (1L << (K_MIN_ROWS - 324)) | (1L << (K_NODEGROUP - 324)))) != 0) || _la==K_STORAGE || _la==K_TABLESPACE) {
				{
				{
				setState(616);
				partition_option();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(622);
				match(T__7);
				setState(623);
				subpartition_definition();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(624);
					match(T__1);
					setState(625);
					subpartition_definition();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
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
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ENGINE:
			case K_STORAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_STORAGE) {
					{
					setState(635);
					match(K_STORAGE);
					}
				}

				setState(638);
				match(K_ENGINE);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(639);
					match(T__2);
					}
				}

				setState(642);
				engine_name();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(K_COMMENT);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(644);
					match(T__2);
					}
				}

				setState(647);
				string_literal();
				}
				break;
			case K_DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				match(K_DATA);
				setState(649);
				match(K_DIRECTORY);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(650);
					match(T__2);
					}
				}

				setState(653);
				string_literal();
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				match(K_INDEX);
				setState(655);
				match(K_DIRECTORY);
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(656);
					match(T__2);
					}
				}

				setState(659);
				string_literal();
				}
				break;
			case K_MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				match(K_MAX_ROWS);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(661);
					match(T__2);
					}
				}

				setState(664);
				value();
				}
				break;
			case K_MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
				match(K_MIN_ROWS);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(666);
					match(T__2);
					}
				}

				setState(669);
				value();
				}
				break;
			case K_TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(670);
				match(K_TABLESPACE);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(671);
					match(T__2);
					}
				}

				setState(674);
				tablespace_name();
				}
				break;
			case K_NODEGROUP:
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				match(K_NODEGROUP);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(676);
					match(T__2);
					}
				}

				setState(679);
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
			setState(682);
			match(K_SUBPARTITION);
			setState(683);
			partition_name();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT || _la==K_DATA || _la==K_ENGINE || _la==K_INDEX || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (K_MAX_ROWS - 324)) | (1L << (K_MIN_ROWS - 324)) | (1L << (K_NODEGROUP - 324)))) != 0) || _la==K_STORAGE || _la==K_TABLESPACE) {
				{
				{
				setState(684);
				partition_option();
				}
				}
				setState(689);
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
			setState(690);
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
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(T__7);
				setState(695);
				literal_value_list();
				setState(696);
				match(T__8);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(697);
					match(T__1);
					setState(698);
					match(T__7);
					setState(699);
					literal_value_list();
					setState(700);
					match(T__8);
					}
					}
					setState(706);
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
				setState(707);
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
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_MAXVALUE:
				{
				setState(710);
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
				setState(711);
				literal_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(714);
				match(T__1);
				setState(717);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_MAXVALUE:
					{
					setState(715);
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
					setState(716);
					literal_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(723);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
			setState(724);
			match(K_CREATE);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(725);
				match(K_OR);
				setState(726);
				match(K_REPLACE);
				}
			}

			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALGORITHM) {
				{
				setState(729);
				match(K_ALGORITHM);
				setState(730);
				match(T__2);
				setState(731);
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

			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFINER) {
				{
				setState(734);
				match(K_DEFINER);
				setState(735);
				match(T__2);
				setState(738);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
				case DOUBLE_QUOTED_STRING:
				case SINGLE_QUOTED_STRING:
				case UNDERLINE_STARTED_IDENTIFIER:
					{
					setState(736);
					user();
					}
					break;
				case K_CURRENT_USER:
					{
					setState(737);
					match(K_CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SQL) {
				{
				setState(742);
				match(K_SQL);
				setState(743);
				match(K_SECURITY);
				setState(744);
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

			setState(747);
			match(K_VIEW);
			setState(748);
			view_name();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(749);
				match(T__7);
				setState(750);
				column_list();
				setState(751);
				match(T__8);
				}
			}

			setState(755);
			match(K_AS);
			setState(756);
			select_stmt(0);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(757);
				match(K_WITH);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CASCADED || _la==K_LOCAL) {
					{
					setState(758);
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

				setState(761);
				match(K_CHECK);
				setState(762);
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
			setState(765);
			match(K_DELETE);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOW_PRIORITY) {
				{
				setState(766);
				match(K_LOW_PRIORITY);
				}
			}

			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_QUICK) {
				{
				setState(769);
				match(K_QUICK);
				}
			}

			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IGNORE) {
				{
				setState(772);
				match(K_IGNORE);
				}
			}

			setState(775);
			match(K_FROM);
			setState(776);
			table_name();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(777);
				match(K_WHERE);
				setState(778);
				expr(0);
				}
			}

			setState(781);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				insert_first_part();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VALUE || _la==K_VALUES) {
					{
					setState(784);
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

				setState(787);
				insert_value_list();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(788);
					match(T__1);
					setState(789);
					insert_value_list();
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(795);
					insert_dup_key_update_part();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				insert_first_part();
				setState(799);
				select_stmt(0);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(800);
					insert_dup_key_update_part();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				insert_first_part();
				setState(804);
				match(K_SET);
				setState(805);
				column_name();
				setState(806);
				match(T__2);
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(807);
					expr(0);
					}
					break;
				case 2:
					{
					setState(808);
					match(K_DEFAULT);
					}
					break;
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(811);
					match(T__1);
					setState(812);
					column_name();
					setState(813);
					match(T__2);
					setState(816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(814);
						expr(0);
						}
						break;
					case 2:
						{
						setState(815);
						match(K_DEFAULT);
						}
						break;
					}
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(823);
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
		public List<TerminalNode> K_LOW_PRIORITY() { return getTokens(MySQLParser.K_LOW_PRIORITY); }
		public TerminalNode K_LOW_PRIORITY(int i) {
			return getToken(MySQLParser.K_LOW_PRIORITY, i);
		}
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
			setState(828);
			match(K_INSERT);
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(829);
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
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(832);
				match(K_IGNORE);
				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(835);
				match(K_INTO);
				}
				break;
			}
			setState(838);
			table_name();
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(839);
				match(T__7);
				setState(840);
				column_list();
				setState(841);
				match(T__8);
				}
				break;
			}
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PARTITION) {
				{
				setState(845);
				match(K_PARTITION);
				setState(846);
				match(T__7);
				setState(847);
				partition_names();
				setState(848);
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
			setState(852);
			match(K_ON);
			setState(853);
			match(K_DUPLICATE);
			setState(854);
			match(K_KEY);
			setState(855);
			match(K_UPDATE);
			setState(856);
			column_name();
			setState(857);
			match(T__2);
			setState(858);
			expr(0);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(859);
				match(T__1);
				setState(860);
				column_name();
				setState(861);
				match(T__2);
				setState(862);
				expr(0);
				}
				}
				setState(868);
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
			setState(869);
			match(T__7);
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(870);
				expr(0);
				}
				break;
			case 2:
				{
				setState(871);
				match(K_DEFAULT);
				}
				break;
			}
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(874);
				match(T__1);
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(875);
					expr(0);
					}
					break;
				case 2:
					{
					setState(876);
					match(K_DEFAULT);
					}
					break;
				}
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
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
			setState(886);
			match(K_UPDATE);
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(887);
				match(K_LOW_PRIORITY);
				}
				break;
			}
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(890);
				match(K_IGNORE);
				}
				break;
			}
			setState(893);
			table_reference(0);
			setState(894);
			match(K_SET);
			setState(895);
			column_name();
			setState(896);
			match(T__2);
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(897);
				expr(0);
				}
				break;
			case 2:
				{
				setState(898);
				match(K_DEFAULT);
				}
				break;
			}
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(901);
				match(T__1);
				setState(902);
				column_name();
				setState(903);
				match(T__2);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(904);
					expr(0);
					}
					break;
				case 2:
					{
					setState(905);
					match(K_DEFAULT);
					}
					break;
				}
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(913);
				match(K_WHERE);
				setState(914);
				expr(0);
				}
			}

			setState(917);
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
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	 
		public Select_stmtContext() { }
		public void copyFrom(Select_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectUnionContext extends Select_stmtContext {
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
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
		public SelectUnionContext(Select_stmtContext ctx) { copyFrom(ctx); }
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
	public static class EnclosedSelectContext extends Select_stmtContext {
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
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
		public EnclosedSelectContext(Select_stmtContext ctx) { copyFrom(ctx); }
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
	public static class SelectContext extends Select_stmtContext {
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
		public SelectContext(Select_stmtContext ctx) { copyFrom(ctx); }
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

	public final Select_stmtContext select_stmt() throws RecognitionException {
		return select_stmt(0);
	}

	private Select_stmtContext select_stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, _parentState);
		Select_stmtContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_select_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new EnclosedSelectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(920);
				match(T__7);
				setState(921);
				select_stmt(0);
				setState(922);
				match(T__8);
				setState(931); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(923);
						match(K_UNION);
						setState(925);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_ALL || _la==K_DISTINCT) {
							{
							setState(924);
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

						setState(927);
						match(T__7);
						setState(928);
						select_stmt(0);
						setState(929);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(933); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(935);
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
				setState(938);
				match(K_SELECT);
				setState(942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(939);
						select_option();
						}
						} 
					}
					setState(944);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(945);
				select_expr();
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(946);
						match(T__1);
						setState(947);
						select_expr();
						}
						} 
					}
					setState(952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					{
					setState(953);
					select_into_clause();
					setState(955);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(954);
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
					setState(957);
					select_from_clause();
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(958);
						select_into_clause();
						}
						break;
					}
					}
					}
					break;
				}
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(963);
					match(K_PROCEDURE);
					setState(964);
					procedure_name();
					setState(965);
					match(T__7);
					setState(966);
					procedure_list();
					setState(967);
					match(T__8);
					}
					break;
				}
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					{
					setState(971);
					match(K_FOR);
					setState(972);
					match(K_UPDATE);
					}
					}
					break;
				case 2:
					{
					{
					setState(973);
					match(K_LOCK);
					setState(974);
					match(K_IN);
					setState(975);
					match(K_SHARE);
					setState(976);
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
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectUnionContext(new Select_stmtContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_select_stmt);
					setState(981);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(987); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(982);
							match(K_UNION);
							setState(984);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==K_ALL || _la==K_DISTINCT) {
								{
								setState(983);
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

							setState(986);
							select_stmt(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(989); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(995);
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
		enterRule(_localctx, 68, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(K_ORDER);
			setState(997);
			match(K_BY);
			{
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(998);
				column_name();
				}
				break;
			case 2:
				{
				setState(999);
				expr(0);
				}
				break;
			case 3:
				{
				setState(1000);
				position();
				}
				break;
			}
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1003);
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
			setState(1017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					match(T__1);
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1007);
						column_name();
						}
						break;
					case 2:
						{
						setState(1008);
						expr(0);
						}
						break;
					case 3:
						{
						setState(1009);
						position();
						}
						break;
					}
					setState(1013);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						setState(1012);
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
				setState(1019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(K_LIMIT);
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					{
					setState(1024);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						setState(1021);
						offset();
						setState(1022);
						match(T__1);
						}
						break;
					}
					setState(1026);
					row_count();
					}
					}
					break;
				case 2:
					{
					{
					setState(1027);
					row_count();
					setState(1028);
					match(K_OFFSET);
					setState(1029);
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
		enterRule(_localctx, 70, RULE_procedure_name);
		try {
			setState(1037);
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
				setState(1035);
				keyword();
				}
				break;
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
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
		enterRule(_localctx, 72, RULE_procedure_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			expr(0);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1040);
				match(T__1);
				setState(1041);
				expr(0);
				}
				}
				setState(1046);
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
		enterRule(_localctx, 74, RULE_select_option);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
			case K_DISTINCT:
			case K_DISTINCTROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
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
				setState(1048);
				match(K_HIGH_PRIORITY);
				}
				break;
			case K_STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				match(K_STRAIGHT_JOIN);
				}
				break;
			case K_SQL_BIG_RESULT:
			case K_SQL_BUFFER_RESULT:
			case K_SQL_SMALL_RESULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1050);
				_la = _input.LA(1);
				if ( !(((((_la - 498)) & ~0x3f) == 0 && ((1L << (_la - 498)) & ((1L << (K_SQL_BIG_RESULT - 498)) | (1L << (K_SQL_BUFFER_RESULT - 498)) | (1L << (K_SQL_SMALL_RESULT - 498)))) != 0)) ) {
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
				setState(1051);
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
				setState(1052);
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
		enterRule(_localctx, 76, RULE_select_from_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(K_FROM);
			setState(1056);
			table_references();
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1057);
				match(K_WHERE);
				setState(1058);
				expr(0);
				}
				break;
			}
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1061);
				match(K_GROUP);
				setState(1062);
				match(K_BY);
				{
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1063);
					column_name();
					}
					break;
				case 2:
					{
					setState(1064);
					expr(0);
					}
					break;
				case 3:
					{
					setState(1065);
					position();
					}
					break;
				}
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1068);
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
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1071);
						match(T__1);
						setState(1075);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
						case 1:
							{
							setState(1072);
							column_name();
							}
							break;
						case 2:
							{
							setState(1073);
							expr(0);
							}
							break;
						case 3:
							{
							setState(1074);
							position();
							}
							break;
						}
						setState(1078);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(1077);
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
					setState(1084);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1085);
					match(K_WITH);
					setState(1086);
					match(K_ROLLUP);
					}
					break;
				}
				}
				break;
			}
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1091);
				match(K_HAVING);
				setState(1092);
				expr(0);
				}
				break;
			}
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1095);
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
		enterRule(_localctx, 78, RULE_select_into_clause);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				match(K_INTO);
				setState(1099);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(K_INTO);
				setState(1101);
				match(K_OUTFILE);
				setState(1102);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(K_INTO);
				setState(1104);
				match(K_DUMPFILE);
				setState(1105);
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
		enterRule(_localctx, 80, RULE_variable_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			user_var_name();
			setState(1113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1109);
					match(T__1);
					setState(1110);
					user_var_name();
					}
					} 
				}
				setState(1115);
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
		enterRule(_localctx, 82, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 84, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
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
		enterRule(_localctx, 86, RULE_row_count);
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
		enterRule(_localctx, 88, RULE_select_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1122);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1123);
				match(T__9);
				}
				break;
			}
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1126);
				match(K_AS);
				setState(1127);
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
		enterRule(_localctx, 90, RULE_table_references);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			escaped_table_reference();
			setState(1135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1131);
					match(T__1);
					setState(1132);
					escaped_table_reference();
					}
					} 
				}
				setState(1137);
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
		enterRule(_localctx, 92, RULE_escaped_table_reference);
		try {
			setState(1144);
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
				setState(1138);
				table_reference(0);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				match(T__10);
				setState(1140);
				match(K_OJ);
				setState(1141);
				table_reference(0);
				setState(1142);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_table_reference, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1147);
				table_factor();
				}
				break;
			case 2:
				{
				setState(1148);
				join_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
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
					setState(1151);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_LEFT || _la==K_RIGHT) {
						{
						setState(1152);
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

					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1155);
						match(K_OUTER);
						}
					}

					setState(1158);
					match(K_JOIN);
					setState(1159);
					table_reference(0);
					setState(1160);
					join_condition();
					}
					} 
				}
				setState(1166);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 96, RULE_table_factor);
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				table_name();
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1168);
					match(K_PARTITION);
					setState(1169);
					match(T__7);
					setState(1170);
					partition_names();
					setState(1171);
					match(T__8);
					}
					break;
				}
				setState(1179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1175);
						match(K_AS);
						}
						break;
					}
					setState(1178);
					alias_name();
					}
					break;
				}
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1181);
					index_hint_list();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				select_stmt(0);
				setState(1186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1185);
					match(K_AS);
					}
					break;
				}
				setState(1188);
				alias_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				match(T__7);
				setState(1191);
				select_stmt(0);
				setState(1192);
				match(T__8);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1193);
					match(K_AS);
					}
					break;
				}
				setState(1196);
				alias_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				match(T__7);
				setState(1199);
				table_references();
				setState(1200);
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
		enterRule(_localctx, 98, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			partition_name();
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1205);
				match(T__1);
				setState(1206);
				partition_name();
				}
				}
				setState(1211);
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
		enterRule(_localctx, 100, RULE_join_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			table_factor();
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					join_right_part();
					}
					} 
				}
				setState(1218);
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
		enterRule(_localctx, 102, RULE_join_right_part);
		int _la;
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CROSS || _la==K_INNER) {
					{
					setState(1219);
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

				setState(1222);
				match(K_JOIN);
				setState(1223);
				table_factor();
				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1224);
					join_condition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				match(K_STRAIGHT_JOIN);
				setState(1228);
				table_factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229);
				match(K_STRAIGHT_JOIN);
				setState(1230);
				table_factor();
				setState(1231);
				match(K_ON);
				setState(1232);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
				match(K_NATURAL);
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LEFT || _la==K_RIGHT) {
					{
					setState(1235);
					_la = _input.LA(1);
					if ( !(_la==K_LEFT || _la==K_RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1236);
						match(K_OUTER);
						}
					}

					}
				}

				setState(1241);
				match(K_JOIN);
				setState(1242);
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
		enterRule(_localctx, 104, RULE_join_condition);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				match(K_ON);
				setState(1246);
				expr(0);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				match(K_USING);
				setState(1248);
				match(T__7);
				setState(1249);
				column_list();
				setState(1250);
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
		enterRule(_localctx, 106, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			index_hint();
			setState(1259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1255);
					match(T__1);
					setState(1256);
					index_hint();
					}
					} 
				}
				setState(1261);
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
		enterRule(_localctx, 108, RULE_index_hint);
		int _la;
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				match(K_USE);
				setState(1263);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1264);
					match(K_FOR);
					setState(1270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1265);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1266);
						match(K_ORDER);
						setState(1267);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1268);
						match(K_GROUP);
						setState(1269);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1274);
				match(T__7);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1275);
					index_list();
					}
				}

				setState(1278);
				match(T__8);
				}
				break;
			case K_IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				match(K_IGNORE);
				setState(1280);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1281);
					match(K_FOR);
					setState(1287);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1282);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1283);
						match(K_ORDER);
						setState(1284);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1285);
						match(K_GROUP);
						setState(1286);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1291);
				match(T__7);
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1292);
					index_list();
					}
				}

				setState(1295);
				match(T__8);
				}
				break;
			case K_FORCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				match(K_FORCE);
				setState(1297);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FOR) {
					{
					setState(1298);
					match(K_FOR);
					setState(1304);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_JOIN:
						{
						setState(1299);
						match(K_JOIN);
						}
						break;
					case K_ORDER:
						{
						setState(1300);
						match(K_ORDER);
						setState(1301);
						match(K_BY);
						}
						break;
					case K_GROUP:
						{
						setState(1302);
						match(K_GROUP);
						setState(1303);
						match(K_BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1308);
				match(T__7);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1309);
					index_list();
					}
				}

				setState(1312);
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
		enterRule(_localctx, 110, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			index_name();
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1316);
				match(T__1);
				setState(1317);
				index_name();
				}
				}
				setState(1322);
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
		enterRule(_localctx, 112, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
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
		enterRule(_localctx, 114, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			column_name();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1326);
				match(T__1);
				setState(1327);
				column_name();
				}
				}
				setState(1332);
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
		enterRule(_localctx, 116, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
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
	public static class SpacialIndexDefContext extends Create_definitionContext {
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
		public SpacialIndexDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSpacialIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSpacialIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSpacialIndexDef(this);
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
		enterRule(_localctx, 118, RULE_create_definition);
		int _la;
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new ColumnDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1335);
				column_name();
				setState(1336);
				column_definition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1338);
						match(K_CONSTRAINT);
						}
					}

					setState(1341);
					symbol();
					}
				}

				setState(1344);
				match(K_PRIMARY);
				setState(1345);
				match(K_KEY);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1346);
					index_type();
					}
				}

				setState(1349);
				match(T__7);
				setState(1350);
				index_col_name();
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1351);
					match(T__1);
					setState(1352);
					index_col_name();
					}
					}
					setState(1357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1358);
				match(T__8);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1359);
					index_option();
					}
					}
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new IndexDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				_la = _input.LA(1);
				if ( !(_la==K_INDEX || _la==K_KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1366);
					index_name();
					}
				}

				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1369);
					index_type();
					}
				}

				setState(1372);
				match(T__7);
				setState(1373);
				index_col_name();
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1374);
					match(T__1);
					setState(1375);
					index_col_name();
					}
					}
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1381);
				match(T__8);
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1382);
					index_option();
					}
					}
					setState(1387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new UniqueDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1388);
						match(K_CONSTRAINT);
						}
					}

					setState(1391);
					symbol();
					}
				}

				setState(1394);
				match(K_UNIQUE);
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1395);
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

				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1398);
					index_name();
					}
				}

				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1401);
					index_type();
					}
				}

				setState(1404);
				match(T__7);
				setState(1405);
				index_col_name();
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1406);
					match(T__1);
					setState(1407);
					index_col_name();
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1413);
				match(T__8);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1414);
					index_option();
					}
					}
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new FullTextIndexDefContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1420);
				match(K_FULLTEXT);
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1421);
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

				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1424);
					index_name();
					}
				}

				setState(1427);
				match(T__7);
				setState(1428);
				index_col_name();
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1429);
					match(T__1);
					setState(1430);
					index_col_name();
					}
					}
					setState(1435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1436);
				match(T__8);
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1437);
					index_option();
					}
					}
					setState(1442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new SpacialIndexDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1443);
				match(K_SPATIAL);
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INDEX || _la==K_KEY) {
					{
					setState(1444);
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

				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1447);
					index_name();
					}
				}

				setState(1450);
				match(T__7);
				setState(1451);
				index_col_name();
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1452);
					match(T__1);
					setState(1453);
					index_col_name();
					}
					}
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1459);
				match(T__8);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_COMMENT || _la==K_KEY_BLOCK_SIZE || _la==K_USING || _la==K_WITH) {
					{
					{
					setState(1460);
					index_option();
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new ForeignKeyDefContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || ((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONSTRAINT) {
						{
						setState(1466);
						match(K_CONSTRAINT);
						}
					}

					setState(1469);
					symbol();
					}
				}

				setState(1472);
				match(K_FOREIGN);
				setState(1473);
				match(K_KEY);
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) {
					{
					setState(1474);
					index_name();
					}
				}

				setState(1477);
				match(T__7);
				setState(1478);
				index_col_name();
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1479);
					match(T__1);
					setState(1480);
					index_col_name();
					}
					}
					setState(1485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1486);
				match(T__8);
				setState(1487);
				reference_definition();
				}
				break;
			case 8:
				_localctx = new CheckDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1489);
				match(K_CHECK);
				setState(1490);
				match(T__7);
				setState(1491);
				expr(0);
				setState(1492);
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
		public Column_reference_definitionContext column_reference_definition() {
			return getRuleContext(Column_reference_definitionContext.class,0);
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
		enterRule(_localctx, 120, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			data_type();
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AUTO_INCREMENT || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (K_COLLATE - 100)) | (1L << (K_COLUMN - 100)) | (1L << (K_COMMENT - 100)) | (1L << (K_DEFAULT - 100)))) != 0) || _la==K_KEY || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (K_NOT - 364)) | (1L << (K_NULL - 364)) | (1L << (K_ON - 364)) | (1L << (K_PRIMARY - 364)))) != 0) || _la==K_STORAGE || _la==K_UNIQUE) {
				{
				{
				setState(1497);
				column_attribute();
				}
				}
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_REFERENCES) {
				{
				setState(1503);
				column_reference_definition();
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

	public static class Column_reference_definitionContext extends ParserRuleContext {
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
		public Column_reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumn_reference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumn_reference_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumn_reference_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_reference_definitionContext column_reference_definition() throws RecognitionException {
		Column_reference_definitionContext _localctx = new Column_reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(K_REFERENCES);
			setState(1507);
			table_name();
			setState(1508);
			match(T__7);
			setState(1509);
			index_col_name();
			setState(1510);
			match(T__8);
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1511);
				reference_option();
				}
				}
				setState(1516);
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
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NOT:
			case K_NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1517);
					match(K_NOT);
					}
				}

				setState(1520);
				match(K_NULL);
				}
				break;
			case K_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				match(K_AUTO_INCREMENT);
				}
				break;
			case K_UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				match(K_UNIQUE);
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1523);
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
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PRIMARY) {
					{
					setState(1526);
					match(K_PRIMARY);
					}
				}

				setState(1529);
				match(K_KEY);
				}
				break;
			case K_DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1530);
				match(K_DEFAULT);
				setState(1531);
				literal_value();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1532);
				match(K_COMMENT);
				setState(1533);
				string_literal();
				}
				break;
			case K_COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1534);
				match(K_COLUMN);
				setState(1535);
				match(K_FORMAT);
				setState(1536);
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
				setState(1537);
				match(K_STORAGE);
				setState(1538);
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
				setState(1539);
				match(K_COLLATE);
				setState(1540);
				collation_name();
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 10);
				{
				setState(1541);
				match(K_ON);
				setState(1542);
				match(K_UPDATE);
				setState(1543);
				date_literal();
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
			setState(1823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BIT:
				_localctx = new BitTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				match(K_BIT);
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1547);
					match(T__7);
					setState(1548);
					length();
					setState(1549);
					match(T__8);
					}
				}

				}
				break;
			case K_BOOL:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(K_BOOL);
				}
				break;
			case K_BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				match(K_BOOLEAN);
				}
				break;
			case K_TINYINT:
				_localctx = new TinyIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1555);
				match(K_TINYINT);
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1556);
					match(T__7);
					setState(1557);
					length();
					setState(1558);
					match(T__8);
					}
				}

				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1562);
					match(K_UNSIGNED);
					}
				}

				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1565);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_SMALLINT:
				_localctx = new SmallIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				match(K_SMALLINT);
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1569);
					match(T__7);
					setState(1570);
					length();
					setState(1571);
					match(T__8);
					}
				}

				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1575);
					match(K_UNSIGNED);
					}
				}

				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1578);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_MEDIUMINT:
				_localctx = new MediumIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1581);
				match(K_MEDIUMINT);
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1582);
					match(T__7);
					setState(1583);
					length();
					setState(1584);
					match(T__8);
					}
				}

				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1588);
					match(K_UNSIGNED);
					}
				}

				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1591);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1594);
				match(K_INT);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1595);
					match(T__7);
					setState(1596);
					length();
					setState(1597);
					match(T__8);
					}
				}

				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1601);
					match(K_UNSIGNED);
					}
				}

				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1604);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1607);
				match(K_INTEGER);
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1608);
					match(T__7);
					setState(1609);
					length();
					setState(1610);
					match(T__8);
					}
				}

				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1614);
					match(K_UNSIGNED);
					}
				}

				setState(1618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1617);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_BIGINT:
				_localctx = new BigIntTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1620);
				match(K_BIGINT);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1621);
					match(T__7);
					setState(1622);
					length();
					setState(1623);
					match(T__8);
					}
				}

				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1627);
					match(K_UNSIGNED);
					}
				}

				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1630);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_REAL:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1633);
				match(K_REAL);
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1634);
					match(T__7);
					setState(1635);
					length();
					setState(1636);
					match(T__1);
					setState(1637);
					decimals();
					setState(1638);
					match(T__8);
					}
				}

				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1642);
					match(K_UNSIGNED);
					}
				}

				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1645);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DOUBLE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1648);
				match(K_DOUBLE);
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1649);
					match(T__7);
					setState(1650);
					length();
					setState(1651);
					match(T__1);
					setState(1652);
					decimals();
					setState(1653);
					match(T__8);
					}
				}

				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1657);
					match(K_UNSIGNED);
					}
				}

				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1660);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1663);
				match(K_FLOAT);
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1664);
					match(T__7);
					setState(1665);
					length();
					setState(1666);
					match(T__1);
					setState(1667);
					decimals();
					setState(1668);
					match(T__8);
					}
				}

				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1672);
					match(K_UNSIGNED);
					}
				}

				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1675);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1678);
				match(K_DECIMAL);
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1679);
					match(T__7);
					setState(1680);
					length();
					setState(1681);
					match(T__1);
					setState(1682);
					decimals();
					setState(1683);
					match(T__8);
					}
				}

				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1687);
					match(K_UNSIGNED);
					}
				}

				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1690);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_NUMERIC:
				_localctx = new NumericTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1693);
				match(K_NUMERIC);
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1694);
					match(T__7);
					setState(1695);
					length();
					setState(1696);
					match(T__1);
					setState(1697);
					decimals();
					setState(1698);
					match(T__8);
					}
				}

				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(1702);
					match(K_UNSIGNED);
					}
				}

				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(1705);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1708);
				match(K_DATE);
				}
				break;
			case K_TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1709);
				match(K_TIME);
				}
				break;
			case K_TIMESTAMP:
				_localctx = new TimeStampTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1710);
				match(K_TIMESTAMP);
				}
				break;
			case K_DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1711);
				match(K_DATETIME);
				}
				break;
			case K_YEAR:
				_localctx = new YearTypeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1712);
				match(K_YEAR);
				}
				break;
			case K_CHAR:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1713);
				match(K_CHAR);
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1714);
					match(T__7);
					setState(1715);
					length();
					setState(1716);
					match(T__8);
					}
				}

				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1720);
					match(K_BINARY);
					}
				}

				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1723);
					match(K_CHARACTER);
					setState(1724);
					match(K_SET);
					setState(1725);
					charset_name();
					}
				}

				}
				break;
			case K_VARCHAR:
				_localctx = new VarcharTypeContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1728);
				match(K_VARCHAR);
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1729);
					match(T__7);
					setState(1730);
					length();
					setState(1731);
					match(T__8);
					}
				}

				setState(1736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1735);
					match(K_BINARY);
					}
				}

				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1738);
					match(K_CHARACTER);
					setState(1739);
					match(K_SET);
					setState(1740);
					charset_name();
					}
				}

				}
				break;
			case K_BINARY:
				_localctx = new BinaryTypeContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1743);
				match(K_BINARY);
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1744);
					match(T__7);
					setState(1745);
					length();
					setState(1746);
					match(T__8);
					}
				}

				}
				break;
			case K_VARBINARY:
				_localctx = new VarBinaryTypeContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1750);
				match(K_VARBINARY);
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1751);
					match(T__7);
					setState(1752);
					length();
					setState(1753);
					match(T__8);
					}
				}

				}
				break;
			case K_TINYBLOB:
				_localctx = new TinyBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1757);
				match(K_TINYBLOB);
				}
				break;
			case K_BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1758);
				match(K_BLOB);
				}
				break;
			case K_MEDIUMBLOB:
				_localctx = new MediumBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(1759);
				match(K_MEDIUMBLOB);
				}
				break;
			case K_LONGBLOB:
				_localctx = new LongBlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(1760);
				match(K_LONGBLOB);
				}
				break;
			case K_TINYTEXT:
				_localctx = new TinyTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(1761);
				match(K_TINYTEXT);
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1762);
					match(K_BINARY);
					}
				}

				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1765);
					match(K_CHARACTER);
					setState(1766);
					match(K_SET);
					setState(1767);
					charset_name();
					}
				}

				}
				break;
			case K_TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(1770);
				match(K_TEXT);
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1771);
					match(K_BINARY);
					}
				}

				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1774);
					match(K_CHARACTER);
					setState(1775);
					match(K_SET);
					setState(1776);
					charset_name();
					}
				}

				}
				break;
			case K_MEDIUMTEXT:
				_localctx = new MediumTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(1779);
				match(K_MEDIUMTEXT);
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1780);
					match(K_BINARY);
					}
				}

				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1783);
					match(K_CHARACTER);
					setState(1784);
					match(K_SET);
					setState(1785);
					charset_name();
					}
				}

				}
				break;
			case K_LONGTEXT:
				_localctx = new LongTextTypeContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(1788);
				match(K_LONGTEXT);
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(1789);
					match(K_BINARY);
					}
				}

				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1792);
					match(K_CHARACTER);
					setState(1793);
					match(K_SET);
					setState(1794);
					charset_name();
					}
				}

				}
				break;
			case K_ENUM:
				_localctx = new EnumTypeContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(1797);
				match(K_ENUM);
				setState(1798);
				match(T__7);
				setState(1799);
				string_literal();
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1800);
					match(T__1);
					setState(1801);
					string_literal();
					}
				}

				setState(1804);
				match(T__8);
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1805);
					match(K_CHARACTER);
					setState(1806);
					match(K_SET);
					setState(1807);
					charset_name();
					}
				}

				}
				break;
			case K_SET:
				_localctx = new SetTypeContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(1810);
				match(K_SET);
				setState(1811);
				match(T__7);
				setState(1812);
				string_literal();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1813);
					match(T__1);
					setState(1814);
					string_literal();
					}
				}

				setState(1817);
				match(T__8);
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(1818);
					match(K_CHARACTER);
					setState(1819);
					match(K_SET);
					setState(1820);
					charset_name();
					}
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
		enterRule(_localctx, 128, RULE_index_col_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			column_name();
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1826);
				match(T__7);
				setState(1827);
				length();
				setState(1828);
				match(T__8);
				}
			}

			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1832);
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
		enterRule(_localctx, 130, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(K_USING);
			setState(1836);
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
		enterRule(_localctx, 132, RULE_index_option);
		int _la;
		try {
			setState(1849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				match(K_KEY_BLOCK_SIZE);
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1839);
					match(T__2);
					}
				}

				setState(1842);
				value();
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1843);
				index_type();
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1844);
				match(K_WITH);
				setState(1845);
				match(K_PARSER);
				setState(1846);
				parser_name();
				}
				break;
			case K_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1847);
				match(K_COMMENT);
				setState(1848);
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
		enterRule(_localctx, 134, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(K_REFERENCES);
			setState(1852);
			table_name();
			setState(1853);
			match(T__7);
			setState(1854);
			index_col_name();
			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1855);
				match(T__1);
				setState(1856);
				index_col_name();
				}
				}
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1862);
			match(T__8);
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1863);
				reference_option();
				}
				}
				setState(1868);
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
		enterRule(_localctx, 136, RULE_reference_option);
		int _la;
		try {
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1869);
				match(K_MATCH);
				setState(1870);
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
				setState(1871);
				match(K_ON);
				setState(1872);
				match(K_DELETE);
				setState(1873);
				on_delete_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1874);
				match(K_ON);
				setState(1875);
				match(K_UPDATE);
				setState(1876);
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
		enterRule(_localctx, 138, RULE_on_delete_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
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
		enterRule(_localctx, 140, RULE_on_update_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
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
		enterRule(_localctx, 142, RULE_action);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				match(K_RESTRICT);
				}
				break;
			case K_CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884);
				match(K_CASCADE);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1885);
				match(K_SET);
				setState(1886);
				match(K_NULL);
				}
				break;
			case K_NO:
				enterOuterAlt(_localctx, 4);
				{
				setState(1887);
				match(K_NO);
				setState(1888);
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
		enterRule(_localctx, 144, RULE_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			table_option();
			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << K_AUTO_INCREMENT) | (1L << K_AVG_ROW_LENGTH))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_CHARACTER - 90)) | (1L << (K_CHARSET - 90)) | (1L << (K_CHECKSUM - 90)) | (1L << (K_COLLATE - 90)) | (1L << (K_COMMENT - 90)) | (1L << (K_CONNECTION - 90)) | (1L << (K_DATA - 90)) | (1L << (K_DEFAULT - 90)) | (1L << (K_DELAY_KEY_WRITE - 90)))) != 0) || _la==K_ENGINE || _la==K_INDEX || _la==K_INSERT_METHOD || _la==K_KEY_BLOCK_SIZE || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (K_MAX_ROWS - 324)) | (1L << (K_MIN_ROWS - 324)) | (1L << (K_PACK_KEYS - 324)))) != 0) || _la==K_PASSWORD || _la==K_ROW_FORMAT || _la==K_TABLESPACE || _la==K_UNION || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (K_STATS_AUTO_RECALC - 611)) | (1L << (K_STATS_PERSISTENT - 611)) | (1L << (K_STATS_SAMPLE_PAGES - 611)))) != 0)) {
				{
				{
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1892);
					match(T__1);
					}
				}

				setState(1895);
				table_option();
				}
				}
				setState(1900);
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
		enterRule(_localctx, 146, RULE_table_option);
		int _la;
		try {
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1901);
				match(K_ENGINE);
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1902);
					match(T__2);
					}
				}

				setState(1905);
				engine_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1906);
				match(K_AUTO_INCREMENT);
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
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1911);
				match(K_AVG_ROW_LENGTH);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1916);
					match(K_DEFAULT);
					}
				}

				setState(1922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_CHARACTER:
					{
					setState(1919);
					match(K_CHARACTER);
					setState(1920);
					match(K_SET);
					}
					break;
				case K_CHARSET:
					{
					setState(1921);
					match(K_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1924);
					match(T__2);
					}
				}

				setState(1927);
				charset_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1928);
				match(K_CHECKSUM);
				setState(1929);
				match(T__2);
				{
				setState(1930);
				value();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1931);
					match(K_DEFAULT);
					}
				}

				setState(1934);
				match(K_COLLATE);
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1935);
					match(T__2);
					}
				}

				setState(1938);
				collation_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1939);
				match(K_COMMENT);
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
				string_literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1944);
				match(K_CONNECTION);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1949);
				match(K_DATA);
				setState(1950);
				match(K_DIRECTORY);
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1951);
					match(T__2);
					}
				}

				setState(1954);
				string_literal();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1955);
				match(K_DELAY_KEY_WRITE);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1956);
					match(T__2);
					}
				}

				{
				setState(1959);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1960);
				match(K_INDEX);
				setState(1961);
				match(K_DIRECTORY);
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1962);
					match(T__2);
					}
				}

				setState(1965);
				string_literal();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1966);
				match(K_INSERT_METHOD);
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
				setState(1971);
				match(K_KEY_BLOCK_SIZE);
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
				value();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1976);
				match(K_MAX_ROWS);
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1981);
				match(K_MIN_ROWS);
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
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1986);
				match(K_PACK_KEYS);
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1987);
					match(T__2);
					}
				}

				setState(1992);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(1990);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(1991);
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
				setState(1994);
				match(K_PASSWORD);
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1995);
					match(T__2);
					}
				}

				setState(1998);
				string_literal();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1999);
				match(K_ROW_FORMAT);
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
				setState(2004);
				match(K_STATS_AUTO_RECALC);
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2005);
					match(T__2);
					}
				}

				setState(2010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(2008);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(2009);
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
				setState(2012);
				match(K_STATS_PERSISTENT);
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2013);
					match(T__2);
					}
				}

				setState(2018);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_VALUE:
					{
					setState(2016);
					value();
					}
					break;
				case K_DEFAULT:
					{
					setState(2017);
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
				setState(2020);
				match(K_STATS_SAMPLE_PAGES);
				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2021);
					match(T__2);
					}
				}

				setState(2024);
				value();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2025);
				match(K_TABLESPACE);
				setState(2026);
				tablespace_name();
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_STORAGE) {
					{
					setState(2027);
					match(K_STORAGE);
					setState(2028);
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
				setState(2031);
				match(K_UNION);
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(2032);
					match(T__2);
					}
				}

				setState(2035);
				match(T__7);
				setState(2036);
				table_name();
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2037);
					match(T__1);
					setState(2038);
					table_name();
					}
					}
					setState(2043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2044);
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
		enterRule(_localctx, 148, RULE_charset_name);
		try {
			setState(2050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2049);
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
		enterRule(_localctx, 150, RULE_collation_name);
		try {
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
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
		enterRule(_localctx, 152, RULE_engine_name);
		try {
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2056);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2058);
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
		enterRule(_localctx, 154, RULE_parser_name);
		try {
			setState(2063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
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
		enterRule(_localctx, 156, RULE_function_name);
		try {
			setState(2067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2065);
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
				setState(2066);
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
		enterRule(_localctx, 158, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				_localctx = new CompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2072);
					comparison_expr();
					}
					break;
				case 2:
					{
					setState(2073);
					is_expr();
					}
					break;
				case 3:
					{
					setState(2074);
					like_expr();
					}
					break;
				case 4:
					{
					setState(2075);
					regexp_expr();
					}
					break;
				case 5:
					{
					setState(2076);
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
				setState(2081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2079);
					case_expr();
					}
					break;
				case 2:
					{
					setState(2080);
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
				setState(2083);
				cast_expr();
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2084);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==K_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2085);
				expr(5);
				}
				break;
			case 5:
				{
				_localctx = new BitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2086);
				bit_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2098);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2089);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2090);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==K_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2091);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new XorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2092);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2093);
						match(K_XOR);
						setState(2094);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2095);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2096);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==K_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2097);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(2102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
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
		enterRule(_localctx, 162, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(K_CAST);
			setState(2104);
			match(T__7);
			setState(2105);
			expr(0);
			setState(2106);
			match(K_AS);
			setState(2107);
			data_type();
			setState(2108);
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
		enterRule(_localctx, 164, RULE_between_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			bit_expr(0);
			setState(2112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2111);
				match(K_NOT);
				}
			}

			setState(2114);
			match(K_BETWEEN);
			setState(2115);
			bit_expr(0);
			setState(2116);
			match(K_AND);
			setState(2117);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 166, RULE_comparison_expr);
		int _la;
		try {
			setState(2130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				bit_expr(0);
				setState(2120);
				comparison_operator();
				setState(2121);
				bit_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2123);
				bit_expr(0);
				setState(2124);
				comparison_operator();
				setState(2125);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_ANY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2126);
				match(T__7);
				setState(2127);
				select_stmt(0);
				setState(2128);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 168, RULE_in_expr);
		int _la;
		try {
			setState(2154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				bit_expr(0);
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2133);
					match(K_NOT);
					}
				}

				setState(2136);
				match(K_IN);
				setState(2137);
				match(T__7);
				setState(2138);
				select_stmt(0);
				setState(2139);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				bit_expr(0);
				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2142);
					match(K_NOT);
					}
				}

				setState(2145);
				match(K_IN);
				setState(2146);
				match(T__7);
				setState(2147);
				expr(0);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2148);
					match(T__1);
					setState(2149);
					expr(0);
					}
				}

				setState(2152);
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
		enterRule(_localctx, 170, RULE_regexp_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			bit_expr(0);
			setState(2158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2157);
				match(K_NOT);
				}
			}

			setState(2160);
			match(K_REGEXP);
			setState(2161);
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
		enterRule(_localctx, 172, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
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
		enterRule(_localctx, 174, RULE_is_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			simple_expr(0);
			setState(2166);
			match(K_IS);
			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(2167);
				match(K_NOT);
				}
			}

			setState(2170);
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
		enterRule(_localctx, 176, RULE_like_expr);
		int _la;
		try {
			setState(2187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2172);
				bit_expr(0);
				setState(2173);
				match(K_SOUNDS);
				setState(2174);
				match(K_LIKE);
				setState(2175);
				bit_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2177);
				bit_expr(0);
				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2178);
					match(K_NOT);
					}
				}

				setState(2181);
				match(K_LIKE);
				setState(2182);
				simple_expr(0);
				setState(2185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2183);
					match(K_ESCAPE);
					setState(2184);
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
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_bit_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2190);
			simple_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
					case 1:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2193);
						match(T__22);
						setState(2194);
						bit_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2197);
						bit_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2199);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2200);
						bit_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2202);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2203);
						bit_expr(5);
						}
						break;
					case 5:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2205);
						match(T__31);
						setState(2206);
						bit_expr(4);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(2207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2208);
						match(T__32);
						setState(2209);
						bit_expr(3);
						}
						break;
					}
					} 
				}
				setState(2214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_simple_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				{
				setState(2216);
				literal_value();
				}
				break;
			case 2:
				{
				setState(2217);
				function_call();
				}
				break;
			case 3:
				{
				setState(2218);
				var_name();
				}
				break;
			case 4:
				{
				setState(2219);
				user_var_name();
				}
				break;
			case 5:
				{
				setState(2223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2220);
					table_name();
					setState(2221);
					match(T__33);
					}
					break;
				}
				setState(2225);
				column_name();
				}
				break;
			case 6:
				{
				setState(2226);
				match(T__34);
				}
				break;
			case 7:
				{
				setState(2227);
				match(T__7);
				setState(2228);
				expr(0);
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2229);
					match(T__1);
					setState(2230);
					expr(0);
					}
				}

				setState(2233);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(2235);
				match(T__7);
				setState(2236);
				select_stmt(0);
				setState(2237);
				match(T__8);
				}
				break;
			case 9:
				{
				setState(2239);
				interval_expr();
				}
				break;
			case 10:
				{
				{
				setState(2240);
				match(K_BINARY);
				setState(2241);
				simple_expr(0);
				}
				}
				break;
			case 11:
				{
				setState(2242);
				match(T__12);
				setState(2243);
				simple_expr(5);
				}
				break;
			case 12:
				{
				setState(2244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__35))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2245);
				simple_expr(4);
				}
				break;
			case 13:
				{
				setState(2246);
				match(K_ROW);
				setState(2247);
				match(T__7);
				setState(2248);
				expr(0);
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2249);
					match(T__1);
					setState(2250);
					expr(0);
					}
				}

				setState(2253);
				match(T__8);
				}
				break;
			case 14:
				{
				setState(2255);
				match(K_EXISTS);
				setState(2256);
				match(T__7);
				setState(2257);
				select_stmt(0);
				setState(2258);
				match(T__8);
				}
				break;
			case 15:
				{
				setState(2260);
				match(T__10);
				setState(2261);
				identifier();
				setState(2262);
				expr(0);
				setState(2263);
				match(T__11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Simple_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
					setState(2267);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(2268);
					match(K_COLLATE);
					setState(2269);
					collation_name();
					}
					} 
				}
				setState(2274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
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
		enterRule(_localctx, 182, RULE_case_expr);
		int _la;
		try {
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2275);
				match(K_CASE);
				setState(2276);
				expr(0);
				setState(2277);
				match(K_WHEN);
				setState(2278);
				literal_value();
				setState(2279);
				match(K_THEN);
				setState(2280);
				expr(0);
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_WHEN) {
					{
					{
					setState(2281);
					match(K_WHEN);
					setState(2282);
					literal_value();
					setState(2283);
					match(K_THEN);
					setState(2284);
					expr(0);
					}
					}
					setState(2290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(2291);
					match(K_ELSE);
					setState(2292);
					expr(0);
					}
				}

				setState(2295);
				match(K_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				match(K_CASE);
				setState(2298);
				match(K_WHEN);
				setState(2299);
				expr(0);
				setState(2300);
				match(K_THEN);
				setState(2301);
				expr(0);
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_WHEN) {
					{
					{
					setState(2302);
					match(K_WHEN);
					setState(2303);
					expr(0);
					setState(2304);
					match(K_THEN);
					setState(2305);
					expr(0);
					}
					}
					setState(2311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(2312);
					match(K_ELSE);
					setState(2313);
					expr(0);
					}
				}

				setState(2316);
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
		enterRule(_localctx, 184, RULE_function_call);
		int _la;
		try {
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2320);
				function_name();
				setState(2321);
				match(T__7);
				setState(2322);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				function_name();
				setState(2325);
				match(T__7);
				setState(2326);
				expr(0);
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(2327);
					match(T__1);
					setState(2328);
					expr(0);
					}
					}
					setState(2333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2334);
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
		enterRule(_localctx, 186, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			match(K_INTERVAL);
			setState(2339);
			expr(0);
			setState(2340);
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
		enterRule(_localctx, 188, RULE_time_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			_la = _input.LA(1);
			if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_DAY - 140)) | (1L << (K_DAY_HOUR - 140)) | (1L << (K_DAY_MICROSECOND - 140)) | (1L << (K_DAY_MINUTE - 140)) | (1L << (K_DAY_SECOND - 140)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (K_HOUR - 232)) | (1L << (K_HOUR_MICROSECOND - 232)) | (1L << (K_HOUR_MINUTE - 232)) | (1L << (K_HOUR_SECOND - 232)))) != 0) || ((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & ((1L << (K_MICROSECOND - 335)) | (1L << (K_MINUTE - 335)) | (1L << (K_MINUTE_MICROSECOND - 335)) | (1L << (K_MINUTE_SECOND - 335)) | (1L << (K_MONTH - 335)))) != 0) || ((((_la - 412)) & ~0x3f) == 0 && ((1L << (_la - 412)) & ((1L << (K_QUARTER - 412)) | (1L << (K_SECOND - 412)) | (1L << (K_SECOND_MICROSECOND - 412)))) != 0) || ((((_la - 592)) & ~0x3f) == 0 && ((1L << (_la - 592)) & ((1L << (K_WEEK - 592)) | (1L << (K_YEAR - 592)) | (1L << (K_YEAR_MONTH - 592)))) != 0)) ) {
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
		enterRule(_localctx, 190, RULE_literal_value);
		int _la;
		try {
			setState(2351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2344);
				numeric_literal();
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2345);
				string_literal();
				}
				break;
			case 3:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2346);
				date_literal();
				}
				break;
			case 4:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2347);
				match(K_NULL);
				}
				break;
			case 5:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2348);
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
				setState(2349);
				hex_literal();
				}
				break;
			case 7:
				_localctx = new BitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2350);
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
		enterRule(_localctx, 192, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			_la = _input.LA(1);
			if ( !(((((_la - 617)) & ~0x3f) == 0 && ((1L << (_la - 617)) & ((1L << (SCIENTIFIC_VALUE - 617)) | (1L << (FLOAT_VALUE - 617)) | (1L << (INTEGER_VALUE - 617)))) != 0)) ) {
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
		enterRule(_localctx, 194, RULE_string_literal);
		int _la;
		try {
			setState(2366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2355);
				match(DOUBLE_QUOTED_STRING);
				}
				break;
			case SINGLE_QUOTED_STRING:
			case UNDERLINE_STARTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERLINE_STARTED_IDENTIFIER) {
					{
					setState(2356);
					underlinestarted_charset_name();
					}
				}

				setState(2359);
				match(SINGLE_QUOTED_STRING);
				setState(2362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
				case 1:
					{
					setState(2360);
					match(K_COLLATE);
					setState(2361);
					collation_name();
					}
					break;
				}
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(2364);
				match(T__36);
				setState(2365);
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
		enterRule(_localctx, 196, RULE_bit_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERLINE_STARTED_IDENTIFIER) {
				{
				setState(2368);
				underlinestarted_charset_name();
				}
			}

			setState(2371);
			match(BIT_VALUE);
			{
			setState(2372);
			match(K_COLLATE);
			setState(2373);
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
		enterRule(_localctx, 198, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2375);
			underlinestarted_charset_name();
			}
			setState(2376);
			match(HEX_VALUE);
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
		enterRule(_localctx, 200, RULE_underlinestarted_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
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
		enterRule(_localctx, 202, RULE_date_literal);
		int _la;
		try {
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DATE:
			case K_TIME:
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2382);
				_la = _input.LA(1);
				if ( !(_la==K_DATE || _la==K_TIME || _la==K_TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2383);
				string_literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(2384);
				match(T__10);
				{
				setState(2385);
				identifier();
				}
				setState(2386);
				string_literal();
				setState(2387);
				match(T__11);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2389);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(2390);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(2391);
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
		enterRule(_localctx, 204, RULE_alias_name);
		try {
			setState(2396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2394);
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
				setState(2395);
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
		public List<TerminalNode> K_FLOAT() { return getTokens(MySQLParser.K_FLOAT); }
		public TerminalNode K_FLOAT(int i) {
			return getToken(MySQLParser.K_FLOAT, i);
		}
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
		public List<TerminalNode> K_INT() { return getTokens(MySQLParser.K_INT); }
		public TerminalNode K_INT(int i) {
			return getToken(MySQLParser.K_INT, i);
		}
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
		enterRule(_localctx, 206, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (K_ACCESSIBLE - 42)) | (1L << (K_ACTION - 42)) | (1L << (K_ADD - 42)) | (1L << (K_AFTER - 42)) | (1L << (K_AGAINST - 42)) | (1L << (K_AGGREGATE - 42)) | (1L << (K_ALGORITHM - 42)) | (1L << (K_ALL - 42)) | (1L << (K_ALTER - 42)) | (1L << (K_ANALYZE - 42)) | (1L << (K_AND - 42)) | (1L << (K_ANY - 42)) | (1L << (K_AS - 42)) | (1L << (K_ASC - 42)) | (1L << (K_ASCII - 42)) | (1L << (K_ASENSITIVE - 42)) | (1L << (K_AT - 42)) | (1L << (K_AUTHORS - 42)) | (1L << (K_AUTOEXTEND_SIZE - 42)) | (1L << (K_AUTO_INCREMENT - 42)) | (1L << (K_AVG - 42)) | (1L << (K_AVG_ROW_LENGTH - 42)) | (1L << (K_BACKUP - 42)) | (1L << (K_BEFORE - 42)) | (1L << (K_BEGIN - 42)) | (1L << (K_BETWEEN - 42)) | (1L << (K_BIGINT - 42)) | (1L << (K_BINARY - 42)) | (1L << (K_BINLOG - 42)) | (1L << (K_BIT - 42)) | (1L << (K_BLOB - 42)) | (1L << (K_BLOCK - 42)) | (1L << (K_BOOL - 42)) | (1L << (K_BOOLEAN - 42)) | (1L << (K_BOTH - 42)) | (1L << (K_BTREE - 42)) | (1L << (K_BY - 42)) | (1L << (K_BYTE - 42)) | (1L << (K_CACHE - 42)) | (1L << (K_CALL - 42)) | (1L << (K_CASCADE - 42)) | (1L << (K_CASCADED - 42)) | (1L << (K_CASE - 42)) | (1L << (K_CATALOG_NAME - 42)) | (1L << (K_CHAIN - 42)) | (1L << (K_CHANGE - 42)) | (1L << (K_CHANGED - 42)) | (1L << (K_CHAR - 42)) | (1L << (K_CHARACTER - 42)) | (1L << (K_CHARSET - 42)) | (1L << (K_CHECK - 42)) | (1L << (K_CHECKSUM - 42)) | (1L << (K_CIPHER - 42)) | (1L << (K_CLASS_ORIGIN - 42)) | (1L << (K_CLIENT - 42)) | (1L << (K_CLOSE - 42)) | (1L << (K_COALESCE - 42)) | (1L << (K_CODE - 42)) | (1L << (K_COLLATE - 42)) | (1L << (K_COLLATION - 42)) | (1L << (K_COLUMN - 42)) | (1L << (K_COLUMNS - 42)) | (1L << (K_COLUMN_NAME - 42)) | (1L << (K_COMMENT - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (K_COMMIT - 106)) | (1L << (K_COMMITTED - 106)) | (1L << (K_COMPACT - 106)) | (1L << (K_COMPLETION - 106)) | (1L << (K_COMPRESSED - 106)) | (1L << (K_CONCURRENT - 106)) | (1L << (K_CONDITION - 106)) | (1L << (K_CONNECTION - 106)) | (1L << (K_CONSISTENT - 106)) | (1L << (K_CONSTRAINT - 106)) | (1L << (K_CONSTRAINT_CATALOG - 106)) | (1L << (K_CONSTRAINT_NAME - 106)) | (1L << (K_CONSTRAINT_SCHEMA - 106)) | (1L << (K_CONTAINS - 106)) | (1L << (K_CONTEXT - 106)) | (1L << (K_CONTINUE - 106)) | (1L << (K_CONTRIBUTORS - 106)) | (1L << (K_CONVERT - 106)) | (1L << (K_CPU - 106)) | (1L << (K_CREATE - 106)) | (1L << (K_CROSS - 106)) | (1L << (K_CUBE - 106)) | (1L << (K_CURRENT_DATE - 106)) | (1L << (K_CURRENT_TIME - 106)) | (1L << (K_CURRENT_TIMESTAMP - 106)) | (1L << (K_CURRENT_USER - 106)) | (1L << (K_CURSOR - 106)) | (1L << (K_CURSOR_NAME - 106)) | (1L << (K_DATA - 106)) | (1L << (K_DATABASE - 106)) | (1L << (K_DATABASES - 106)) | (1L << (K_DATAFILE - 106)) | (1L << (K_DATE - 106)) | (1L << (K_DATETIME - 106)) | (1L << (K_DAY - 106)) | (1L << (K_DAY_HOUR - 106)) | (1L << (K_DAY_MICROSECOND - 106)) | (1L << (K_DAY_MINUTE - 106)) | (1L << (K_DAY_SECOND - 106)) | (1L << (K_DEALLOCATE - 106)) | (1L << (K_DEC - 106)) | (1L << (K_DECIMAL - 106)) | (1L << (K_DECLARE - 106)) | (1L << (K_DEFAULT - 106)) | (1L << (K_DEFINER - 106)) | (1L << (K_DELAYED - 106)) | (1L << (K_DELAY_KEY_WRITE - 106)) | (1L << (K_DELETE - 106)) | (1L << (K_DESC - 106)) | (1L << (K_DESCRIBE - 106)) | (1L << (K_DES_KEY_FILE - 106)) | (1L << (K_DETERMINISTIC - 106)) | (1L << (K_DIRECTORY - 106)) | (1L << (K_DISABLE - 106)) | (1L << (K_DISCARD - 106)) | (1L << (K_DISK - 106)) | (1L << (K_DISTINCT - 106)) | (1L << (K_DISTINCTROW - 106)) | (1L << (K_DIV - 106)) | (1L << (K_DO - 106)) | (1L << (K_DOUBLE - 106)) | (1L << (K_DROP - 106)) | (1L << (K_DUAL - 106)) | (1L << (K_DUMPFILE - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_DUPLICATE - 170)) | (1L << (K_DYNAMIC - 170)) | (1L << (K_EACH - 170)) | (1L << (K_ELSE - 170)) | (1L << (K_ELSEIF - 170)) | (1L << (K_ENABLE - 170)) | (1L << (K_ENCLOSED - 170)) | (1L << (K_END - 170)) | (1L << (K_ENDS - 170)) | (1L << (K_ENGINE - 170)) | (1L << (K_ENGINES - 170)) | (1L << (K_ENUM - 170)) | (1L << (K_ERROR - 170)) | (1L << (K_ERRORS - 170)) | (1L << (K_ESCAPE - 170)) | (1L << (K_ESCAPED - 170)) | (1L << (K_EVENT - 170)) | (1L << (K_EVENTS - 170)) | (1L << (K_EVERY - 170)) | (1L << (K_EXECUTE - 170)) | (1L << (K_EXISTS - 170)) | (1L << (K_EXIT - 170)) | (1L << (K_EXPANSION - 170)) | (1L << (K_EXPLAIN - 170)) | (1L << (K_EXTENDED - 170)) | (1L << (K_EXTENT_SIZE - 170)) | (1L << (K_FALSE - 170)) | (1L << (K_FAST - 170)) | (1L << (K_FAULTS - 170)) | (1L << (K_FETCH - 170)) | (1L << (K_FIELDS - 170)) | (1L << (K_FILE - 170)) | (1L << (K_FIRST - 170)) | (1L << (K_FIXED - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_FLUSH - 170)) | (1L << (K_FOR - 170)) | (1L << (K_FORCE - 170)) | (1L << (K_FOREIGN - 170)) | (1L << (K_FOUND - 170)) | (1L << (K_FRAC_SECOND - 170)) | (1L << (K_FROM - 170)) | (1L << (K_FULL - 170)) | (1L << (K_FULLTEXT - 170)) | (1L << (K_FUNCTION - 170)) | (1L << (K_GENERAL - 170)) | (1L << (K_GEOMETRY - 170)) | (1L << (K_GEOMETRYCOLLECTION - 170)) | (1L << (K_GET_FORMAT - 170)) | (1L << (K_GLOBAL - 170)) | (1L << (K_GRANT - 170)) | (1L << (K_GRANTS - 170)) | (1L << (K_GROUP - 170)) | (1L << (K_HANDLER - 170)) | (1L << (K_HASH - 170)) | (1L << (K_HAVING - 170)) | (1L << (K_HELP - 170)) | (1L << (K_HIGH_PRIORITY - 170)) | (1L << (K_HOST - 170)) | (1L << (K_HOSTS - 170)) | (1L << (K_HOUR - 170)) | (1L << (K_HOUR_MICROSECOND - 170)))) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (K_HOUR_MINUTE - 234)) | (1L << (K_HOUR_SECOND - 234)) | (1L << (K_IDENTIFIED - 234)) | (1L << (K_IF - 234)) | (1L << (K_IGNORE - 234)) | (1L << (K_IGNORE_SERVER_IDS - 234)) | (1L << (K_IMPORT - 234)) | (1L << (K_IN - 234)) | (1L << (K_INDEX - 234)) | (1L << (K_INDEXES - 234)) | (1L << (K_INFILE - 234)) | (1L << (K_INITIAL_SIZE - 234)) | (1L << (K_INNER - 234)) | (1L << (K_INNOBASE - 234)) | (1L << (K_INNODB - 234)) | (1L << (K_INOUT - 234)) | (1L << (K_INSENSITIVE - 234)) | (1L << (K_INSERT - 234)) | (1L << (K_INSERT_METHOD - 234)) | (1L << (K_INSTALL - 234)) | (1L << (K_INT - 234)) | (1L << (K_INTEGER - 234)) | (1L << (K_INTERVAL - 234)) | (1L << (K_INTO - 234)) | (1L << (K_INVOKER - 234)) | (1L << (K_IO - 234)) | (1L << (K_IO_THREAD - 234)) | (1L << (K_IPC - 234)) | (1L << (K_IS - 234)) | (1L << (K_ISOLATION - 234)) | (1L << (K_ISSUER - 234)) | (1L << (K_ITERATE - 234)) | (1L << (K_JOIN - 234)) | (1L << (K_KEY - 234)) | (1L << (K_KEYS - 234)) | (1L << (K_KEY_BLOCK_SIZE - 234)) | (1L << (K_KILL - 234)) | (1L << (K_LANGUAGE - 234)) | (1L << (K_LAST - 234)) | (1L << (K_LEADING - 234)) | (1L << (K_LEAVE - 234)) | (1L << (K_LEAVES - 234)) | (1L << (K_LEFT - 234)) | (1L << (K_LESS - 234)) | (1L << (K_LEVEL - 234)) | (1L << (K_LIKE - 234)) | (1L << (K_LIMIT - 234)) | (1L << (K_LINEAR - 234)) | (1L << (K_LINES - 234)) | (1L << (K_LINESTRING - 234)) | (1L << (K_LIST - 234)) | (1L << (K_LOAD - 234)) | (1L << (K_LOCAL - 234)) | (1L << (K_LOCALTIME - 234)) | (1L << (K_LOCALTIMESTAMP - 234)) | (1L << (K_LOCK - 234)) | (1L << (K_LOCKS - 234)) | (1L << (K_LOGFILE - 234)) | (1L << (K_LOGS - 234)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (K_LONG - 298)) | (1L << (K_LONGBLOB - 298)) | (1L << (K_LONGTEXT - 298)) | (1L << (K_LOOP - 298)) | (1L << (K_LOW_PRIORITY - 298)) | (1L << (K_MASTER - 298)) | (1L << (K_MASTER_CONNECT_RETRY - 298)) | (1L << (K_MASTER_HEARTBEAT_PERIOD - 298)) | (1L << (K_MASTER_HOST - 298)) | (1L << (K_MASTER_LOG_FILE - 298)) | (1L << (K_MASTER_LOG_POS - 298)) | (1L << (K_MASTER_PASSWORD - 298)) | (1L << (K_MASTER_PORT - 298)) | (1L << (K_MASTER_SERVER_ID - 298)) | (1L << (K_MASTER_SSL - 298)) | (1L << (K_MASTER_SSL_CA - 298)) | (1L << (K_MASTER_SSL_CAPATH - 298)) | (1L << (K_MASTER_SSL_CERT - 298)) | (1L << (K_MASTER_SSL_CIPHER - 298)) | (1L << (K_MASTER_SSL_KEY - 298)) | (1L << (K_MASTER_SSL_VERIFY_SERVER_CERT - 298)) | (1L << (K_MASTER_USER - 298)) | (1L << (K_MATCH - 298)) | (1L << (K_MAXVALUE - 298)) | (1L << (K_MAX_CONNECTIONS_PER_HOUR - 298)) | (1L << (K_MAX_QUERIES_PER_HOUR - 298)) | (1L << (K_MAX_ROWS - 298)) | (1L << (K_MAX_SIZE - 298)) | (1L << (K_MAX_UPDATES_PER_HOUR - 298)) | (1L << (K_MAX_USER_CONNECTIONS - 298)) | (1L << (K_MEDIUM - 298)) | (1L << (K_MEDIUMBLOB - 298)) | (1L << (K_MEDIUMINT - 298)) | (1L << (K_MEDIUMTEXT - 298)) | (1L << (K_MEMORY - 298)) | (1L << (K_MERGE - 298)) | (1L << (K_MESSAGE_TEXT - 298)) | (1L << (K_MICROSECOND - 298)) | (1L << (K_MIDDLEINT - 298)) | (1L << (K_MIGRATE - 298)) | (1L << (K_MINUTE - 298)) | (1L << (K_MINUTE_MICROSECOND - 298)) | (1L << (K_MINUTE_SECOND - 298)) | (1L << (K_MIN_ROWS - 298)) | (1L << (K_MOD - 298)) | (1L << (K_MODE - 298)) | (1L << (K_MODIFIES - 298)) | (1L << (K_MODIFY - 298)) | (1L << (K_MONTH - 298)) | (1L << (K_MULTILINESTRING - 298)) | (1L << (K_MULTIPOINT - 298)) | (1L << (K_MULTIPOLYGON - 298)) | (1L << (K_MUTEX - 298)) | (1L << (K_MYSQL_ERRNO - 298)) | (1L << (K_NAME - 298)) | (1L << (K_NAMES - 298)) | (1L << (K_NATIONAL - 298)) | (1L << (K_NATURAL - 298)) | (1L << (K_NCHAR - 298)) | (1L << (K_NDB - 298)) | (1L << (K_NDBCLUSTER - 298)) | (1L << (K_NEW - 298)) | (1L << (K_NEXT - 298)) | (1L << (K_NO - 298)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (K_NODEGROUP - 362)) | (1L << (K_NONE - 362)) | (1L << (K_NOT - 362)) | (1L << (K_NO_WAIT - 362)) | (1L << (K_NO_WRITE_TO_BINLOG - 362)) | (1L << (K_NULL - 362)) | (1L << (K_NUMERIC - 362)) | (1L << (K_NVARCHAR - 362)) | (1L << (K_OFFSET - 362)) | (1L << (K_OLD_PASSWORD - 362)) | (1L << (K_ON - 362)) | (1L << (K_ONE - 362)) | (1L << (K_ONE_SHOT - 362)) | (1L << (K_OPEN - 362)) | (1L << (K_OPTIMIZE - 362)) | (1L << (K_OPTION - 362)) | (1L << (K_OPTIONALLY - 362)) | (1L << (K_OPTIONS - 362)) | (1L << (K_OR - 362)) | (1L << (K_ORDER - 362)) | (1L << (K_OUT - 362)) | (1L << (K_OUTER - 362)) | (1L << (K_OUTFILE - 362)) | (1L << (K_OWNER - 362)) | (1L << (K_PACK_KEYS - 362)) | (1L << (K_PAGE - 362)) | (1L << (K_PARSER - 362)) | (1L << (K_PARTIAL - 362)) | (1L << (K_PARTITION - 362)) | (1L << (K_PARTITIONING - 362)) | (1L << (K_PARTITIONS - 362)) | (1L << (K_PASSWORD - 362)) | (1L << (K_PHASE - 362)) | (1L << (K_PLUGIN - 362)) | (1L << (K_PLUGINS - 362)) | (1L << (K_POINT - 362)) | (1L << (K_POLYGON - 362)) | (1L << (K_PORT - 362)) | (1L << (K_PRECISION - 362)) | (1L << (K_PREPARE - 362)) | (1L << (K_PRESERVE - 362)) | (1L << (K_PREV - 362)) | (1L << (K_PRIMARY - 362)) | (1L << (K_PRIVILEGES - 362)) | (1L << (K_PROCEDURE - 362)) | (1L << (K_PROCESSLIST - 362)) | (1L << (K_PROFILE - 362)) | (1L << (K_PROFILES - 362)) | (1L << (K_PROXY - 362)) | (1L << (K_PURGE - 362)) | (1L << (K_QUARTER - 362)) | (1L << (K_QUERY - 362)) | (1L << (K_QUICK - 362)) | (1L << (K_RANGE - 362)) | (1L << (K_READ - 362)) | (1L << (K_READS - 362)) | (1L << (K_READ_ONLY - 362)) | (1L << (K_READ_WRITE - 362)) | (1L << (K_REAL - 362)) | (1L << (K_REBUILD - 362)) | (1L << (K_RECOVER - 362)) | (1L << (K_REDOFILE - 362)) | (1L << (K_REDO_BUFFER_SIZE - 362)) | (1L << (K_REDUNDANT - 362)))) != 0) || ((((_la - 426)) & ~0x3f) == 0 && ((1L << (_la - 426)) & ((1L << (K_REFERENCES - 426)) | (1L << (K_REGEXP - 426)) | (1L << (K_RELAY - 426)) | (1L << (K_RELAYLOG - 426)) | (1L << (K_RELAY_LOG_FILE - 426)) | (1L << (K_RELAY_LOG_POS - 426)) | (1L << (K_RELAY_THREAD - 426)) | (1L << (K_RELEASE - 426)) | (1L << (K_RELOAD - 426)) | (1L << (K_REMOVE - 426)) | (1L << (K_RENAME - 426)) | (1L << (K_REORGANIZE - 426)) | (1L << (K_REPAIR - 426)) | (1L << (K_REPEAT - 426)) | (1L << (K_REPEATABLE - 426)) | (1L << (K_REPLACE - 426)) | (1L << (K_REPLICATION - 426)) | (1L << (K_REQUIRE - 426)) | (1L << (K_RESET - 426)) | (1L << (K_RESIGNAL - 426)) | (1L << (K_RESTORE - 426)) | (1L << (K_RESTRICT - 426)) | (1L << (K_RESUME - 426)) | (1L << (K_RETURN - 426)) | (1L << (K_RETURNS - 426)) | (1L << (K_REVOKE - 426)) | (1L << (K_RIGHT - 426)) | (1L << (K_RLIKE - 426)) | (1L << (K_ROLLBACK - 426)) | (1L << (K_ROLLUP - 426)) | (1L << (K_ROUTINE - 426)) | (1L << (K_ROW - 426)) | (1L << (K_ROWS - 426)) | (1L << (K_ROW_FORMAT - 426)) | (1L << (K_RTREE - 426)) | (1L << (K_SAVEPOINT - 426)) | (1L << (K_SCHEDULE - 426)) | (1L << (K_SCHEMA - 426)) | (1L << (K_SCHEMAS - 426)) | (1L << (K_SCHEMA_NAME - 426)) | (1L << (K_SECOND - 426)) | (1L << (K_SECOND_MICROSECOND - 426)) | (1L << (K_SECURITY - 426)) | (1L << (K_SELECT - 426)) | (1L << (K_SENSITIVE - 426)) | (1L << (K_SEPARATOR - 426)) | (1L << (K_SERIAL - 426)) | (1L << (K_SERIALIZABLE - 426)) | (1L << (K_SERVER - 426)) | (1L << (K_SESSION - 426)) | (1L << (K_SET - 426)) | (1L << (K_SHARE - 426)) | (1L << (K_SHOW - 426)) | (1L << (K_SHUTDOWN - 426)) | (1L << (K_SIGNAL - 426)) | (1L << (K_SIGNED - 426)) | (1L << (K_SIMPLE - 426)) | (1L << (K_SLAVE - 426)) | (1L << (K_SLOW - 426)) | (1L << (K_SMALLINT - 426)) | (1L << (K_SNAPSHOT - 426)) | (1L << (K_SOCKET - 426)) | (1L << (K_SOME - 426)) | (1L << (K_SONAME - 426)))) != 0) || ((((_la - 490)) & ~0x3f) == 0 && ((1L << (_la - 490)) & ((1L << (K_SOUNDS - 490)) | (1L << (K_SOURCE - 490)) | (1L << (K_SPATIAL - 490)) | (1L << (K_SPECIFIC - 490)) | (1L << (K_SQL - 490)) | (1L << (K_SQLEXCEPTION - 490)) | (1L << (K_SQLSTATE - 490)) | (1L << (K_SQLWARNING - 490)) | (1L << (K_SQL_BIG_RESULT - 490)) | (1L << (K_SQL_BUFFER_RESULT - 490)) | (1L << (K_SQL_CACHE - 490)) | (1L << (K_SQL_CALC_FOUND_ROWS - 490)) | (1L << (K_SQL_NO_CACHE - 490)) | (1L << (K_SQL_SMALL_RESULT - 490)) | (1L << (K_SQL_THREAD - 490)) | (1L << (K_SQL_TSI_DAY - 490)) | (1L << (K_SQL_TSI_FRAC_SECOND - 490)) | (1L << (K_SQL_TSI_HOUR - 490)) | (1L << (K_SQL_TSI_MINUTE - 490)) | (1L << (K_SQL_TSI_MONTH - 490)) | (1L << (K_SQL_TSI_QUARTER - 490)) | (1L << (K_SQL_TSI_SECOND - 490)) | (1L << (K_SQL_TSI_WEEK - 490)) | (1L << (K_SQL_TSI_YEAR - 490)) | (1L << (K_SSL - 490)) | (1L << (K_START - 490)) | (1L << (K_STARTING - 490)) | (1L << (K_STARTS - 490)) | (1L << (K_STATUS - 490)) | (1L << (K_STOP - 490)) | (1L << (K_STORAGE - 490)) | (1L << (K_STRAIGHT_JOIN - 490)) | (1L << (K_STRING - 490)) | (1L << (K_SUBCLASS_ORIGIN - 490)) | (1L << (K_SUBJECT - 490)) | (1L << (K_SUBPARTITION - 490)) | (1L << (K_SUBPARTITIONS - 490)) | (1L << (K_SUPER - 490)) | (1L << (K_SUSPEND - 490)) | (1L << (K_SWAPS - 490)) | (1L << (K_SWITCHES - 490)) | (1L << (K_TABLE - 490)) | (1L << (K_TABLES - 490)) | (1L << (K_TABLESPACE - 490)) | (1L << (K_TABLE_CHECKSUM - 490)) | (1L << (K_TABLE_NAME - 490)) | (1L << (K_TEMPORARY - 490)) | (1L << (K_TEMPTABLE - 490)) | (1L << (K_TERMINATED - 490)) | (1L << (K_TEXT - 490)) | (1L << (K_THAN - 490)) | (1L << (K_THEN - 490)) | (1L << (K_TIME - 490)) | (1L << (K_TIMESTAMP - 490)) | (1L << (K_TIMESTAMPADD - 490)) | (1L << (K_TIMESTAMPDIFF - 490)) | (1L << (K_TINYBLOB - 490)) | (1L << (K_TINYINT - 490)) | (1L << (K_TINYTEXT - 490)) | (1L << (K_TO - 490)) | (1L << (K_TRAILING - 490)) | (1L << (K_TRANSACTION - 490)) | (1L << (K_TRIGGER - 490)) | (1L << (K_TRIGGERS - 490)))) != 0) || ((((_la - 554)) & ~0x3f) == 0 && ((1L << (_la - 554)) & ((1L << (K_TRUE - 554)) | (1L << (K_TRUNCATE - 554)) | (1L << (K_TYPE - 554)) | (1L << (K_TYPES - 554)) | (1L << (K_UNCOMMITTED - 554)) | (1L << (K_UNDEFINED - 554)) | (1L << (K_UNDO - 554)) | (1L << (K_UNDOFILE - 554)) | (1L << (K_UNDO_BUFFER_SIZE - 554)) | (1L << (K_UNICODE - 554)) | (1L << (K_UNINSTALL - 554)) | (1L << (K_UNION - 554)) | (1L << (K_UNIQUE - 554)) | (1L << (K_UNKNOWN - 554)) | (1L << (K_UNLOCK - 554)) | (1L << (K_UNSIGNED - 554)) | (1L << (K_UNTIL - 554)) | (1L << (K_UPDATE - 554)) | (1L << (K_UPGRADE - 554)) | (1L << (K_USAGE - 554)) | (1L << (K_USE - 554)) | (1L << (K_USER - 554)) | (1L << (K_USER_RESOURCES - 554)) | (1L << (K_USE_FRM - 554)) | (1L << (K_USING - 554)) | (1L << (K_UTC_DATE - 554)) | (1L << (K_UTC_TIME - 554)) | (1L << (K_UTC_TIMESTAMP - 554)) | (1L << (K_VALUE - 554)) | (1L << (K_VALUES - 554)) | (1L << (K_VARBINARY - 554)) | (1L << (K_VARCHAR - 554)) | (1L << (K_VARCHARACTER - 554)) | (1L << (K_VARIABLES - 554)) | (1L << (K_VARYING - 554)) | (1L << (K_VIEW - 554)) | (1L << (K_WAIT - 554)) | (1L << (K_WARNINGS - 554)) | (1L << (K_WEEK - 554)) | (1L << (K_WHEN - 554)) | (1L << (K_WHERE - 554)) | (1L << (K_WHILE - 554)) | (1L << (K_WITH - 554)) | (1L << (K_WORK - 554)) | (1L << (K_WRAPPER - 554)) | (1L << (K_WRITE - 554)) | (1L << (K_X509 - 554)) | (1L << (K_XA - 554)) | (1L << (K_XML - 554)) | (1L << (K_XOR - 554)) | (1L << (K_YEAR - 554)) | (1L << (K_YEAR_MONTH - 554)) | (1L << (K_ZEROFILL - 554)) | (1L << (K_ONLINE - 554)) | (1L << (K_OFFLINE - 554)) | (1L << (K_FORMAT - 554)) | (1L << (K_CAST - 554)) | (1L << (K_STATS_AUTO_RECALC - 554)) | (1L << (K_STATS_PERSISTENT - 554)) | (1L << (K_STATS_SAMPLE_PAGES - 554)) | (1L << (K_OJ - 554)))) != 0)) ) {
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
		enterRule(_localctx, 208, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2400);
				schema_name();
				setState(2401);
				match(T__33);
				}
				break;
			}
			setState(2407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(2405);
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
				setState(2406);
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
		enterRule(_localctx, 210, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
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
		enterRule(_localctx, 212, RULE_column_name);
		try {
			setState(2414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_STRING:
			case QUOTED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
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
				setState(2412);
				keyword();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(2413);
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
		enterRule(_localctx, 214, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
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
		enterRule(_localctx, 216, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
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
		enterRule(_localctx, 218, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
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
		enterRule(_localctx, 220, RULE_decimals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
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
		enterRule(_localctx, 222, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
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
		enterRule(_localctx, 224, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			_la = _input.LA(1);
			if ( !(((((_la - 620)) & ~0x3f) == 0 && ((1L << (_la - 620)) & ((1L << (DOUBLE_QUOTED_STRING - 620)) | (1L << (QUOTED_IDENTIFIER - 620)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 620)) | (1L << (UNQUOTED_IDENTIFIER - 620)))) != 0)) ) {
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
		case 33:
			return select_stmt_sempred((Select_stmtContext)_localctx, predIndex);
		case 47:
			return table_reference_sempred((Table_referenceContext)_localctx, predIndex);
		case 80:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 89:
			return bit_expr_sempred((Bit_exprContext)_localctx, predIndex);
		case 90:
			return simple_expr_sempred((Simple_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean select_stmt_sempred(Select_stmtContext _localctx, int predIndex) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0276\u097f\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\3\2\7\2\u00e7\n\2\f\2"+
		"\16\2\u00ea\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00f2\n\4\f\4\16\4\u00f5"+
		"\13\4\3\4\3\4\6\4\u00f9\n\4\r\4\16\4\u00fa\3\4\7\4\u00fe\n\4\f\4\16\4"+
		"\u0101\13\4\3\4\7\4\u0104\n\4\f\4\16\4\u0107\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0115\n\5\3\6\3\6\3\6\3\6\7\6\u011b\n"+
		"\6\f\6\16\6\u011e\13\6\3\6\3\6\3\6\5\6\u0123\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0137\n\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u0143\n\13\3\13\5\13\u0146\n"+
		"\13\3\13\3\13\3\13\5\13\u014b\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0153\n\13\f\13\16\13\u0156\13\13\3\13\3\13\5\13\u015a\n\13\3\13\3\13"+
		"\7\13\u015e\n\13\f\13\16\13\u0161\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\5\16\u016e\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0175"+
		"\n\16\3\17\3\17\5\17\u0179\n\17\3\17\3\17\3\17\5\17\u017e\n\17\3\17\3"+
		"\17\3\17\7\17\u0183\n\17\f\17\16\17\u0186\13\17\3\17\5\17\u0189\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u018f\n\20\3\20\3\20\3\20\7\20\u0194\n\20\f\20"+
		"\16\20\u0197\13\20\3\20\5\20\u019a\n\20\3\21\3\21\5\21\u019e\n\21\3\21"+
		"\3\21\3\21\3\21\5\21\u01a4\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ab\n"+
		"\21\f\21\16\21\u01ae\13\21\3\21\3\21\5\21\u01b2\n\21\3\21\5\21\u01b5\n"+
		"\21\3\21\3\21\5\21\u01b9\n\21\3\21\3\21\3\21\3\21\5\21\u01bf\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u01c6\n\21\f\21\16\21\u01c9\13\21\3\21\3\21"+
		"\5\21\u01cd\n\21\3\21\5\21\u01d0\n\21\3\21\5\21\u01d3\n\21\3\21\5\21\u01d6"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u01dc\n\21\3\21\3\21\3\21\3\21\5\21\u01e2"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ec\n\21\5\21\u01ee"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01f5\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u01fc\n\22\5\22\u01fe\n\22\3\22\3\22\3\22\3\22\7\22\u0204\n\22\f"+
		"\22\16\22\u0207\13\22\3\22\3\22\5\22\u020b\n\22\3\23\5\23\u020e\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0216\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u021c\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u022c\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0238\n\23\5\23\u023a\n\23\3\24\5\24\u023d\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0245\n\24\3\24\3\24\3\24\3\24\5\24\u024b\n\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0251\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u025b\n\25\3\25\3\25\3\25\5\25\u0260\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0267\n\25\5\25\u0269\n\25\3\25\7\25\u026c\n\25\f\25\16"+
		"\25\u026f\13\25\3\25\3\25\3\25\3\25\7\25\u0275\n\25\f\25\16\25\u0278\13"+
		"\25\3\25\3\25\5\25\u027c\n\25\3\26\5\26\u027f\n\26\3\26\3\26\5\26\u0283"+
		"\n\26\3\26\3\26\3\26\5\26\u0288\n\26\3\26\3\26\3\26\3\26\5\26\u028e\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0294\n\26\3\26\3\26\3\26\5\26\u0299\n\26"+
		"\3\26\3\26\3\26\5\26\u029e\n\26\3\26\3\26\3\26\5\26\u02a3\n\26\3\26\3"+
		"\26\3\26\5\26\u02a8\n\26\3\26\5\26\u02ab\n\26\3\27\3\27\3\27\7\27\u02b0"+
		"\n\27\f\27\16\27\u02b3\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u02c1\n\32\f\32\16\32\u02c4\13\32\3\32\5\32\u02c7"+
		"\n\32\3\33\3\33\5\33\u02cb\n\33\3\33\3\33\3\33\5\33\u02d0\n\33\7\33\u02d2"+
		"\n\33\f\33\16\33\u02d5\13\33\3\34\3\34\3\34\5\34\u02da\n\34\3\34\3\34"+
		"\3\34\5\34\u02df\n\34\3\34\3\34\3\34\3\34\5\34\u02e5\n\34\5\34\u02e7\n"+
		"\34\3\34\3\34\3\34\5\34\u02ec\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02f4\n\34\3\34\3\34\3\34\3\34\5\34\u02fa\n\34\3\34\3\34\5\34\u02fe\n"+
		"\34\3\35\3\35\5\35\u0302\n\35\3\35\5\35\u0305\n\35\3\35\5\35\u0308\n\35"+
		"\3\35\3\35\3\35\3\35\5\35\u030e\n\35\3\35\3\35\3\36\3\36\5\36\u0314\n"+
		"\36\3\36\3\36\3\36\7\36\u0319\n\36\f\36\16\36\u031c\13\36\3\36\5\36\u031f"+
		"\n\36\3\36\3\36\3\36\5\36\u0324\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u032c\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u0333\n\36\7\36\u0335\n\36\f"+
		"\36\16\36\u0338\13\36\3\36\5\36\u033b\n\36\5\36\u033d\n\36\3\37\3\37\5"+
		"\37\u0341\n\37\3\37\5\37\u0344\n\37\3\37\5\37\u0347\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u034e\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0355\n\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0363\n \f \16 \u0366\13 \3!\3!"+
		"\3!\5!\u036b\n!\3!\3!\3!\5!\u0370\n!\7!\u0372\n!\f!\16!\u0375\13!\3!\3"+
		"!\3\"\3\"\5\"\u037b\n\"\3\"\5\"\u037e\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0386\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u038d\n\"\7\"\u038f\n\"\f\"\16\"\u0392"+
		"\13\"\3\"\3\"\5\"\u0396\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u03a0\n#\3#\3"+
		"#\3#\3#\6#\u03a6\n#\r#\16#\u03a7\3#\5#\u03ab\n#\3#\3#\7#\u03af\n#\f#\16"+
		"#\u03b2\13#\3#\3#\3#\7#\u03b7\n#\f#\16#\u03ba\13#\3#\3#\5#\u03be\n#\3"+
		"#\3#\5#\u03c2\n#\5#\u03c4\n#\3#\3#\3#\3#\3#\3#\5#\u03cc\n#\3#\3#\3#\3"+
		"#\3#\3#\5#\u03d4\n#\5#\u03d6\n#\3#\3#\3#\5#\u03db\n#\3#\6#\u03de\n#\r"+
		"#\16#\u03df\7#\u03e2\n#\f#\16#\u03e5\13#\3$\3$\3$\3$\3$\5$\u03ec\n$\3"+
		"$\5$\u03ef\n$\3$\3$\3$\3$\5$\u03f5\n$\3$\5$\u03f8\n$\7$\u03fa\n$\f$\16"+
		"$\u03fd\13$\3$\3$\3$\3$\5$\u0403\n$\3$\3$\3$\3$\3$\5$\u040a\n$\5$\u040c"+
		"\n$\3%\3%\5%\u0410\n%\3&\3&\3&\7&\u0415\n&\f&\16&\u0418\13&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0420\n\'\3(\3(\3(\3(\5(\u0426\n(\3(\3(\3(\3(\3(\5"+
		"(\u042d\n(\3(\5(\u0430\n(\3(\3(\3(\3(\5(\u0436\n(\3(\5(\u0439\n(\7(\u043b"+
		"\n(\f(\16(\u043e\13(\3(\3(\5(\u0442\n(\5(\u0444\n(\3(\3(\5(\u0448\n(\3"+
		"(\5(\u044b\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0455\n)\3*\3*\3*\7*\u045a\n"+
		"*\f*\16*\u045d\13*\3+\3+\3,\3,\3-\3-\3.\3.\5.\u0467\n.\3.\3.\5.\u046b"+
		"\n.\3/\3/\3/\7/\u0470\n/\f/\16/\u0473\13/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u047b\n\60\3\61\3\61\3\61\5\61\u0480\n\61\3\61\3\61\5\61\u0484\n"+
		"\61\3\61\5\61\u0487\n\61\3\61\3\61\3\61\3\61\7\61\u048d\n\61\f\61\16\61"+
		"\u0490\13\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0498\n\62\3\62\5\62\u049b"+
		"\n\62\3\62\5\62\u049e\n\62\3\62\5\62\u04a1\n\62\3\62\3\62\5\62\u04a5\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04ad\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u04b5\n\62\3\63\3\63\3\63\7\63\u04ba\n\63\f\63\16\63\u04bd"+
		"\13\63\3\64\3\64\7\64\u04c1\n\64\f\64\16\64\u04c4\13\64\3\65\5\65\u04c7"+
		"\n\65\3\65\3\65\3\65\5\65\u04cc\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u04d8\n\65\5\65\u04da\n\65\3\65\3\65\5\65\u04de\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u04e7\n\66\3\67\3\67\3\67"+
		"\7\67\u04ec\n\67\f\67\16\67\u04ef\13\67\38\38\38\38\38\38\38\38\58\u04f9"+
		"\n8\58\u04fb\n8\38\38\58\u04ff\n8\38\38\38\38\38\38\38\38\38\58\u050a"+
		"\n8\58\u050c\n8\38\38\58\u0510\n8\38\38\38\38\38\38\38\38\38\58\u051b"+
		"\n8\58\u051d\n8\38\38\58\u0521\n8\38\58\u0524\n8\39\39\39\79\u0529\n9"+
		"\f9\169\u052c\139\3:\3:\3;\3;\3;\7;\u0533\n;\f;\16;\u0536\13;\3<\3<\3"+
		"=\3=\3=\3=\5=\u053e\n=\3=\5=\u0541\n=\3=\3=\3=\5=\u0546\n=\3=\3=\3=\3"+
		"=\7=\u054c\n=\f=\16=\u054f\13=\3=\3=\7=\u0553\n=\f=\16=\u0556\13=\3=\3"+
		"=\5=\u055a\n=\3=\5=\u055d\n=\3=\3=\3=\3=\7=\u0563\n=\f=\16=\u0566\13="+
		"\3=\3=\7=\u056a\n=\f=\16=\u056d\13=\3=\5=\u0570\n=\3=\5=\u0573\n=\3=\3"+
		"=\5=\u0577\n=\3=\5=\u057a\n=\3=\5=\u057d\n=\3=\3=\3=\3=\7=\u0583\n=\f"+
		"=\16=\u0586\13=\3=\3=\7=\u058a\n=\f=\16=\u058d\13=\3=\3=\5=\u0591\n=\3"+
		"=\5=\u0594\n=\3=\3=\3=\3=\7=\u059a\n=\f=\16=\u059d\13=\3=\3=\7=\u05a1"+
		"\n=\f=\16=\u05a4\13=\3=\3=\5=\u05a8\n=\3=\5=\u05ab\n=\3=\3=\3=\3=\7=\u05b1"+
		"\n=\f=\16=\u05b4\13=\3=\3=\7=\u05b8\n=\f=\16=\u05bb\13=\3=\5=\u05be\n"+
		"=\3=\5=\u05c1\n=\3=\3=\3=\5=\u05c6\n=\3=\3=\3=\3=\7=\u05cc\n=\f=\16=\u05cf"+
		"\13=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u05d9\n=\3>\3>\7>\u05dd\n>\f>\16>\u05e0"+
		"\13>\3>\5>\u05e3\n>\3?\3?\3?\3?\3?\3?\7?\u05eb\n?\f?\16?\u05ee\13?\3@"+
		"\5@\u05f1\n@\3@\3@\3@\3@\5@\u05f7\n@\3@\5@\u05fa\n@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u060b\n@\3A\3A\3A\3A\3A\5A\u0612\nA\3A"+
		"\3A\3A\3A\3A\3A\3A\5A\u061b\nA\3A\5A\u061e\nA\3A\5A\u0621\nA\3A\3A\3A"+
		"\3A\3A\5A\u0628\nA\3A\5A\u062b\nA\3A\5A\u062e\nA\3A\3A\3A\3A\3A\5A\u0635"+
		"\nA\3A\5A\u0638\nA\3A\5A\u063b\nA\3A\3A\3A\3A\3A\5A\u0642\nA\3A\5A\u0645"+
		"\nA\3A\5A\u0648\nA\3A\3A\3A\3A\3A\5A\u064f\nA\3A\5A\u0652\nA\3A\5A\u0655"+
		"\nA\3A\3A\3A\3A\3A\5A\u065c\nA\3A\5A\u065f\nA\3A\5A\u0662\nA\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u066b\nA\3A\5A\u066e\nA\3A\5A\u0671\nA\3A\3A\3A\3A\3A"+
		"\3A\3A\5A\u067a\nA\3A\5A\u067d\nA\3A\5A\u0680\nA\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u0689\nA\3A\5A\u068c\nA\3A\5A\u068f\nA\3A\3A\3A\3A\3A\3A\3A\5A\u0698"+
		"\nA\3A\5A\u069b\nA\3A\5A\u069e\nA\3A\3A\3A\3A\3A\3A\3A\5A\u06a7\nA\3A"+
		"\5A\u06aa\nA\3A\5A\u06ad\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u06b9\nA"+
		"\3A\5A\u06bc\nA\3A\3A\3A\5A\u06c1\nA\3A\3A\3A\3A\3A\5A\u06c8\nA\3A\5A"+
		"\u06cb\nA\3A\3A\3A\5A\u06d0\nA\3A\3A\3A\3A\3A\5A\u06d7\nA\3A\3A\3A\3A"+
		"\3A\5A\u06de\nA\3A\3A\3A\3A\3A\3A\5A\u06e6\nA\3A\3A\3A\5A\u06eb\nA\3A"+
		"\3A\5A\u06ef\nA\3A\3A\3A\5A\u06f4\nA\3A\3A\5A\u06f8\nA\3A\3A\3A\5A\u06fd"+
		"\nA\3A\3A\5A\u0701\nA\3A\3A\3A\5A\u0706\nA\3A\3A\3A\3A\3A\5A\u070d\nA"+
		"\3A\3A\3A\3A\5A\u0713\nA\3A\3A\3A\3A\3A\5A\u071a\nA\3A\3A\3A\3A\5A\u0720"+
		"\nA\5A\u0722\nA\3B\3B\3B\3B\3B\5B\u0729\nB\3B\5B\u072c\nB\3C\3C\3C\3D"+
		"\3D\5D\u0733\nD\3D\3D\3D\3D\3D\3D\3D\5D\u073c\nD\3E\3E\3E\3E\3E\3E\7E"+
		"\u0744\nE\fE\16E\u0747\13E\3E\3E\7E\u074b\nE\fE\16E\u074e\13E\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\5F\u0758\nF\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\5I\u0764\n"+
		"I\3J\3J\5J\u0768\nJ\3J\7J\u076b\nJ\fJ\16J\u076e\13J\3K\3K\5K\u0772\nK"+
		"\3K\3K\3K\5K\u0777\nK\3K\3K\3K\5K\u077c\nK\3K\3K\5K\u0780\nK\3K\3K\3K"+
		"\5K\u0785\nK\3K\5K\u0788\nK\3K\3K\3K\3K\3K\5K\u078f\nK\3K\3K\5K\u0793"+
		"\nK\3K\3K\3K\5K\u0798\nK\3K\3K\3K\5K\u079d\nK\3K\3K\3K\3K\5K\u07a3\nK"+
		"\3K\3K\3K\5K\u07a8\nK\3K\3K\3K\3K\5K\u07ae\nK\3K\3K\3K\5K\u07b3\nK\3K"+
		"\3K\3K\5K\u07b8\nK\3K\3K\3K\5K\u07bd\nK\3K\3K\3K\5K\u07c2\nK\3K\3K\3K"+
		"\5K\u07c7\nK\3K\3K\5K\u07cb\nK\3K\3K\5K\u07cf\nK\3K\3K\3K\5K\u07d4\nK"+
		"\3K\3K\3K\5K\u07d9\nK\3K\3K\5K\u07dd\nK\3K\3K\5K\u07e1\nK\3K\3K\5K\u07e5"+
		"\nK\3K\3K\5K\u07e9\nK\3K\3K\3K\3K\3K\5K\u07f0\nK\3K\3K\5K\u07f4\nK\3K"+
		"\3K\3K\3K\7K\u07fa\nK\fK\16K\u07fd\13K\3K\3K\5K\u0801\nK\3L\3L\5L\u0805"+
		"\nL\3M\3M\5M\u0809\nM\3N\3N\3N\5N\u080e\nN\3O\3O\5O\u0812\nO\3P\3P\5P"+
		"\u0816\nP\3Q\3Q\3R\3R\3R\3R\3R\3R\5R\u0820\nR\3R\3R\5R\u0824\nR\3R\3R"+
		"\3R\3R\5R\u082a\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u0835\nR\fR\16R\u0838"+
		"\13R\3S\3S\3S\3S\3S\3S\3S\3T\3T\5T\u0843\nT\3T\3T\3T\3T\3T\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\5U\u0855\nU\3V\3V\5V\u0859\nV\3V\3V\3V\3V\3V\3"+
		"V\3V\5V\u0862\nV\3V\3V\3V\3V\3V\5V\u0869\nV\3V\3V\5V\u086d\nV\3W\3W\5"+
		"W\u0871\nW\3W\3W\3W\3X\3X\3Y\3Y\3Y\5Y\u087b\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u0886\nZ\3Z\3Z\3Z\3Z\5Z\u088c\nZ\5Z\u088e\nZ\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u08a5\n[\f[\16[\u08a8"+
		"\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u08b2\n\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u08ba\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\5\\\u08ce\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u08dc\n\\\3\\\3\\\3\\\7\\\u08e1\n\\\f\\\16\\\u08e4\13"+
		"\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u08f1\n]\f]\16]\u08f4\13]\3]\3"+
		"]\5]\u08f8\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u0906\n]\f]\16]\u0909"+
		"\13]\3]\3]\5]\u090d\n]\3]\3]\5]\u0911\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\7"+
		"^\u091c\n^\f^\16^\u091f\13^\3^\3^\5^\u0923\n^\3_\3_\3_\3_\3`\3`\3a\3a"+
		"\3a\3a\3a\3a\3a\5a\u0932\na\3b\3b\3c\3c\5c\u0938\nc\3c\3c\3c\5c\u093d"+
		"\nc\3c\3c\5c\u0941\nc\3d\5d\u0944\nd\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u095b\ng\3h\3h\5h\u095f\nh\3i\3i\3j"+
		"\3j\3j\5j\u0966\nj\3j\3j\5j\u096a\nj\3k\3k\3l\3l\3l\5l\u0971\nl\3m\3m"+
		"\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\2\7D`\u00a2\u00b4\u00b6s\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\2-\4\2\u00df\u00df\u01dd\u01dd\3\2\6\b"+
		"\3\2\u0261\u0262\5\2\u00d9\u00d9\u01ee\u01ee\u0238\u0238\4\2()\u0097\u0097"+
		"\5\2*+\u0097\u0097\u016d\u016d\4\2TT\u01c1\u01c1\4\2\u00f0\u00f0\u01bb"+
		"\u01bb\5\2\u014f\u014f\u021b\u021b\u0231\u0231\4\2\u0098\u0098\u0109\u0109"+
		"\4\2UU\u0125\u0125\3\2\u0248\u0249\4\2\u0099\u0099\u0130\u0130\4\2\63"+
		"\63\u00a4\u00a4\4\299\u009c\u009c\4\2\63\63\u00a4\u00a5\4\2\u01f4\u01f5"+
		"\u01f9\u01f9\4\2\u01f6\u01f6\u01f8\u01f8\4\2\u011b\u011b\u01c6\u01c6\4"+
		"\2\u0080\u0080\u00f8\u00f8\4\2\u00f4\u00f4\u0112\u0112\5\2\u0097\u0097"+
		"\u00ad\u00ad\u00cd\u00cd\5\2\u0097\u0097\u00a3\u00a3\u014e\u014e\4\2O"+
		"O\u00e4\u00e4\5\2\u00d8\u00d8\u0187\u0187\u01e4\u01e4\5\2\u00cc\u00cc"+
		"\u0117\u0117\u016b\u016b\b\2nnpp\u0097\u0097\u00ad\u00ad\u00cd\u00cd\u01ab"+
		"\u01ab\4\2\17\17\u016e\u016e\4\2\20\20\66\66\4\2\21\21\u017e\u017e\4\2"+
		"\63\63\67\67\4\2\5\5\22\30\6\2\u00c6\u00c6\u0171\u0171\u022c\u022c\u0239"+
		"\u0239\4\2\f\f\32\35\3\2\36\37\3\2 !\4\2\36\37&&\13\2\u008e\u0092\u00ea"+
		"\u00ed\u0151\u0151\u0154\u0156\u015c\u015c\u019e\u019e\u01d4\u01d5\u0252"+
		"\u0252\u025e\u025f\4\2\u00c6\u00c6\u022c\u022c\3\2\u026b\u026d\4\2\u008c"+
		"\u008c\u0220\u0221\5\2,\u00ce\u00d1\u0100\u0106\u0268\4\2\u026e\u026e"+
		"\u0270\u0272\u0b0e\2\u00e8\3\2\2\2\4\u00ed\3\2\2\2\6\u00f3\3\2\2\2\b\u0114"+
		"\3\2\2\2\n\u0122\3\2\2\2\f\u0136\3\2\2\2\16\u0138\3\2\2\2\20\u013b\3\2"+
		"\2\2\22\u013d\3\2\2\2\24\u0140\3\2\2\2\26\u0162\3\2\2\2\30\u0166\3\2\2"+
		"\2\32\u016a\3\2\2\2\34\u0176\3\2\2\2\36\u018a\3\2\2\2 \u01ed\3\2\2\2\""+
		"\u01ef\3\2\2\2$\u0239\3\2\2\2&\u0250\3\2\2\2(\u0252\3\2\2\2*\u02aa\3\2"+
		"\2\2,\u02ac\3\2\2\2.\u02b4\3\2\2\2\60\u02b6\3\2\2\2\62\u02c6\3\2\2\2\64"+
		"\u02ca\3\2\2\2\66\u02d6\3\2\2\28\u02ff\3\2\2\2:\u033c\3\2\2\2<\u033e\3"+
		"\2\2\2>\u0356\3\2\2\2@\u0367\3\2\2\2B\u0378\3\2\2\2D\u03d5\3\2\2\2F\u03e6"+
		"\3\2\2\2H\u040f\3\2\2\2J\u0411\3\2\2\2L\u041f\3\2\2\2N\u0421\3\2\2\2P"+
		"\u0454\3\2\2\2R\u0456\3\2\2\2T\u045e\3\2\2\2V\u0460\3\2\2\2X\u0462\3\2"+
		"\2\2Z\u0466\3\2\2\2\\\u046c\3\2\2\2^\u047a\3\2\2\2`\u047f\3\2\2\2b\u04b4"+
		"\3\2\2\2d\u04b6\3\2\2\2f\u04be\3\2\2\2h\u04dd\3\2\2\2j\u04e6\3\2\2\2l"+
		"\u04e8\3\2\2\2n\u0523\3\2\2\2p\u0525\3\2\2\2r\u052d\3\2\2\2t\u052f\3\2"+
		"\2\2v\u0537\3\2\2\2x\u05d8\3\2\2\2z\u05da\3\2\2\2|\u05e4\3\2\2\2~\u060a"+
		"\3\2\2\2\u0080\u0721\3\2\2\2\u0082\u0723\3\2\2\2\u0084\u072d\3\2\2\2\u0086"+
		"\u073b\3\2\2\2\u0088\u073d\3\2\2\2\u008a\u0757\3\2\2\2\u008c\u0759\3\2"+
		"\2\2\u008e\u075b\3\2\2\2\u0090\u0763\3\2\2\2\u0092\u0765\3\2\2\2\u0094"+
		"\u0800\3\2\2\2\u0096\u0804\3\2\2\2\u0098\u0808\3\2\2\2\u009a\u080d\3\2"+
		"\2\2\u009c\u0811\3\2\2\2\u009e\u0815\3\2\2\2\u00a0\u0817\3\2\2\2\u00a2"+
		"\u0829\3\2\2\2\u00a4\u0839\3\2\2\2\u00a6\u0840\3\2\2\2\u00a8\u0854\3\2"+
		"\2\2\u00aa\u086c\3\2\2\2\u00ac\u086e\3\2\2\2\u00ae\u0875\3\2\2\2\u00b0"+
		"\u0877\3\2\2\2\u00b2\u088d\3\2\2\2\u00b4\u088f\3\2\2\2\u00b6\u08db\3\2"+
		"\2\2\u00b8\u0910\3\2\2\2\u00ba\u0922\3\2\2\2\u00bc\u0924\3\2\2\2\u00be"+
		"\u0928\3\2\2\2\u00c0\u0931\3\2\2\2\u00c2\u0933\3\2\2\2\u00c4\u0940\3\2"+
		"\2\2\u00c6\u0943\3\2\2\2\u00c8\u0949\3\2\2\2\u00ca\u094e\3\2\2\2\u00cc"+
		"\u095a\3\2\2\2\u00ce\u095e\3\2\2\2\u00d0\u0960\3\2\2\2\u00d2\u0965\3\2"+
		"\2\2\u00d4\u096b\3\2\2\2\u00d6\u0970\3\2\2\2\u00d8\u0972\3\2\2\2\u00da"+
		"\u0974\3\2\2\2\u00dc\u0976\3\2\2\2\u00de\u0978\3\2\2\2\u00e0\u097a\3\2"+
		"\2\2\u00e2\u097c\3\2\2\2\u00e4\u00e7\5\6\4\2\u00e5\u00e7\5\4\3\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00ee\7\u0276\2\2\u00ee\u00ef\b\3"+
		"\1\2\u00ef\5\3\2\2\2\u00f0\u00f2\7\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00ff\5\b\5\2\u00f7\u00f9\7\3\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\5\b\5\2\u00fd\u00f8\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0105\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0104\7\3\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\7\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u0115\5\24\13\2\u0109\u0115\5 \21\2\u010a\u0115\5\66\34"+
		"\2\u010b\u0115\58\35\2\u010c\u0115\5\32\16\2\u010d\u0115\5\34\17\2\u010e"+
		"\u0115\5\36\20\2\u010f\u0115\5:\36\2\u0110\u0115\5D#\2\u0111\u0115\5B"+
		"\"\2\u0112\u0115\5\n\6\2\u0113\u0115\5\22\n\2\u0114\u0108\3\2\2\2\u0114"+
		"\u0109\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010c\3\2"+
		"\2\2\u0114\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\t\3\2\2\2\u0116\u0117\7\u01de\2\2\u0117\u011c\5\f\7\2\u0118"+
		"\u0119\7\4\2\2\u0119\u011b\5\f\7\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0123\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\7\u01de\2\2\u0120\u0121\7\u0178\2\2\u0121\u0123"+
		"\5\u00a2R\2\u0122\u0116\3\2\2\2\u0122\u011f\3\2\2\2\u0123\13\3\2\2\2\u0124"+
		"\u0125\5\16\b\2\u0125\u0126\7\5\2\2\u0126\u0127\5\u00a2R\2\u0127\u0137"+
		"\3\2\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7\5\2\2\u012a\u012b\5\u00a2"+
		"R\2\u012b\u0137\3\2\2\2\u012c\u012d\t\2\2\2\u012d\u012e\5\20\t\2\u012e"+
		"\u012f\7\5\2\2\u012f\u0130\5\u00a2R\2\u0130\u0137\3\2\2\2\u0131\u0132"+
		"\t\3\2\2\u0132\u0133\5\20\t\2\u0133\u0134\7\5\2\2\u0134\u0135\5\u00a2"+
		"R\2\u0135\u0137\3\2\2\2\u0136\u0124\3\2\2\2\u0136\u0128\3\2\2\2\u0136"+
		"\u012c\3\2\2\2\u0136\u0131\3\2\2\2\u0137\r\3\2\2\2\u0138\u0139\7\t\2\2"+
		"\u0139\u013a\5\20\t\2\u013a\17\3\2\2\2\u013b\u013c\7\u0272\2\2\u013c\21"+
		"\3\2\2\2\u013d\u013e\7\u0240\2\2\u013e\u013f\5\u00a0Q\2\u013f\23\3\2\2"+
		"\2\u0140\u0142\7\177\2\2\u0141\u0143\t\4\2\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\t\5\2\2\u0145\u0144\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\u00f4\2\2\u0148"+
		"\u014a\5\u00d8m\2\u0149\u014b\5\u0084C\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\u0176\2\2\u014d\u014e\5\u00d2"+
		"j\2\u014e\u014f\7\n\2\2\u014f\u0154\5\u0082B\2\u0150\u0151\7\4\2\2\u0151"+
		"\u0153\5\u0082B\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\7\13\2\2\u0158\u015a\5\u0086D\2\u0159\u0158\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u015e\5\26\f\2\u015c\u015e\5\30\r\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\25\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7\62\2\2\u0163\u0164\7\5\2\2\u0164\u0165\t\6\2\2\u0165\27\3\2\2"+
		"\2\u0166\u0167\7\u0128\2\2\u0167\u0168\7\5\2\2\u0168\u0169\t\7\2\2\u0169"+
		"\31\3\2\2\2\u016a\u016b\7\u00a9\2\2\u016b\u016d\7\u00f4\2\2\u016c\u016e"+
		"\t\4\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\5\u00d8m\2\u0170\u0171\7\u0176\2\2\u0171\u0174\5\u00d2j\2\u0172"+
		"\u0175\5\26\f\2\u0173\u0175\5\30\r\2\u0174\u0172\3\2\2\2\u0174\u0173\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\33\3\2\2\2\u0176\u0178\7\u00a9\2\2\u0177"+
		"\u0179\7\u021a\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017d\7\u0215\2\2\u017b\u017c\7\u00ef\2\2\u017c\u017e\7"+
		"\u00c0\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u0184\5\u00d2j\2\u0180\u0181\7\4\2\2\u0181\u0183\5\u00d2j\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\t\b\2\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\35\3\2\2\2\u018a\u018b\7\u00a9"+
		"\2\2\u018b\u018e\7\u024f\2\2\u018c\u018d\7\u00ef\2\2\u018d\u018f\7\u00c0"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0195\5v<\2\u0191\u0192\7\4\2\2\u0192\u0194\5v<\2\u0193\u0191\3\2\2\2"+
		"\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\t\b\2\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\37\3\2\2\2\u019b\u019d\7\177\2\2\u019c\u019e\7\u021a"+
		"\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a3\7\u0215\2\2\u01a0\u01a1\7\u00ef\2\2\u01a1\u01a2\7\u016e\2\2\u01a2"+
		"\u01a4\7\u00c0\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a6\5\u00d2j\2\u01a6\u01a7\7\n\2\2\u01a7\u01ac\5x=\2"+
		"\u01a8\u01a9\7\4\2\2\u01a9\u01ab\5x=\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b1\7\13\2\2\u01b0\u01b2\5\u0092J\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5\"\22\2"+
		"\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ee\3\2\2\2\u01b6\u01b8"+
		"\7\177\2\2\u01b7\u01b9\7\u021a\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01be\7\u0215\2\2\u01bb\u01bc\7\u00ef\2"+
		"\2\u01bc\u01bd\7\u016e\2\2\u01bd\u01bf\7\u00c0\2\2\u01be\u01bb\3\2\2\2"+
		"\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5\u00d2j\2\u01c1"+
		"\u01c2\7\n\2\2\u01c2\u01c7\5x=\2\u01c3\u01c4\7\4\2\2\u01c4\u01c6\5x=\2"+
		"\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\7\13\2\2"+
		"\u01cb\u01cd\5\u0092J\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cf\3\2\2\2\u01ce\u01d0\5\"\22\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\t\t\2\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\78\2\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5D#\2\u01d8\u01ee"+
		"\3\2\2\2\u01d9\u01db\7\177\2\2\u01da\u01dc\7\u021a\2\2\u01db\u01da\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e1\7\u0215\2\2\u01de"+
		"\u01df\7\u00ef\2\2\u01df\u01e0\7\u016e\2\2\u01e0\u01e2\7\u00c0\2\2\u01e1"+
		"\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01eb\5\u00d2"+
		"j\2\u01e4\u01e5\7\u011e\2\2\u01e5\u01ec\5\u00d2j\2\u01e6\u01e7\7\n\2\2"+
		"\u01e7\u01e8\7\u011e\2\2\u01e8\u01e9\5\u00d2j\2\u01e9\u01ea\7\13\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e4\3\2\2\2\u01eb\u01e6\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u019b\3\2\2\2\u01ed\u01b6\3\2\2\2\u01ed\u01d9\3\2\2\2\u01ee"+
		"!\3\2\2\2\u01ef\u01f0\7\u0188\2\2\u01f0\u01f1\7P\2\2\u01f1\u01f4\5$\23"+
		"\2\u01f2\u01f3\7\u018a\2\2\u01f3\u01f5\5\u00e0q\2\u01f4\u01f2\3\2\2\2"+
		"\u01f4\u01f5\3\2\2\2\u01f5\u01fd\3\2\2\2\u01f6\u01f7\7\u020f\2\2\u01f7"+
		"\u01f8\7P\2\2\u01f8\u01fb\5&\24\2\u01f9\u01fa\7\u018a\2\2\u01fa\u01fc"+
		"\5\u00e0q\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2"+
		"\2\u01fd\u01f6\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u020a\3\2\2\2\u01ff\u0200"+
		"\7\n\2\2\u0200\u0205\5(\25\2\u0201\u0202\7\4\2\2\u0202\u0204\5(\25\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7\13\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u01ff\3\2\2\2\u020a\u020b\3\2\2\2\u020b#\3\2\2\2"+
		"\u020c\u020e\7\u0120\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\7\u00e4\2\2\u0210\u0211\7\n\2\2\u0211\u0212"+
		"\5\u00a2R\2\u0212\u0213\7\13\2\2\u0213\u023a\3\2\2\2\u0214\u0216\7\u0120"+
		"\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u021b\7\u0112\2\2\u0218\u0219\7\62\2\2\u0219\u021a\7\5\2\2\u021a\u021c"+
		"\5\u00e0q\2\u021b\u0218\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2"+
		"\2\u021d\u021e\7\n\2\2\u021e\u021f\5t;\2\u021f\u0220\7\13\2\2\u0220\u023a"+
		"\3\2\2\2\u0221\u022b\7\u01a1\2\2\u0222\u0223\7\n\2\2\u0223\u0224\5\u00a2"+
		"R\2\u0224\u0225\7\13\2\2\u0225\u022c\3\2\2\2\u0226\u0227\7i\2\2\u0227"+
		"\u0228\7\n\2\2\u0228\u0229\5t;\2\u0229\u022a\7\13\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0222\3\2\2\2\u022b\u0226\3\2\2\2\u022c\u023a\3\2\2\2\u022d"+
		"\u0237\7\u0123\2\2\u022e\u022f\7\n\2\2\u022f\u0230\5\u00a2R\2\u0230\u0231"+
		"\7\13\2\2\u0231\u0238\3\2\2\2\u0232\u0233\7i\2\2\u0233\u0234\7\n\2\2\u0234"+
		"\u0235\5t;\2\u0235\u0236\7\13\2\2\u0236\u0238\3\2\2\2\u0237\u022e\3\2"+
		"\2\2\u0237\u0232\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u020d\3\2\2\2\u0239"+
		"\u0215\3\2\2\2\u0239\u0221\3\2\2\2\u0239\u022d\3\2\2\2\u023a%\3\2\2\2"+
		"\u023b\u023d\7\u0120\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023f\7\u00e4\2\2\u023f\u0240\7\n\2\2\u0240\u0241"+
		"\5\u00a2R\2\u0241\u0242\7\13\2\2\u0242\u0251\3\2\2\2\u0243\u0245\7\u0120"+
		"\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u024a\7\u0112\2\2\u0247\u0248\7\62\2\2\u0248\u0249\7\5\2\2\u0249\u024b"+
		"\5\u00e0q\2\u024a\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u024d\7\n\2\2\u024d\u024e\5t;\2\u024e\u024f\7\13\2\2\u024f\u0251"+
		"\3\2\2\2\u0250\u023c\3\2\2\2\u0250\u0244\3\2\2\2\u0251\'\3\2\2\2\u0252"+
		"\u0253\7\u0188\2\2\u0253\u0268\5.\30\2\u0254\u0266\7\u0249\2\2\u0255\u0256"+
		"\7\u011c\2\2\u0256\u025f\7\u021e\2\2\u0257\u025a\7\n\2\2\u0258\u025b\5"+
		"\u00a2R\2\u0259\u025b\5\62\32\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025d\7\13\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u0260\7\u0143\2\2\u025f\u0257\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u0267"+
		"\3\2\2\2\u0261\u0262\7\u00f3\2\2\u0262\u0263\7\n\2\2\u0263\u0264\5\62"+
		"\32\2\u0264\u0265\7\13\2\2\u0265\u0267\3\2\2\2\u0266\u0255\3\2\2\2\u0266"+
		"\u0261\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0254\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026d\3\2\2\2\u026a\u026c\5*\26\2\u026b\u026a\3\2\2\2\u026c"+
		"\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u027b\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7\n\2\2\u0271\u0276\5,\27\2\u0272"+
		"\u0273\7\4\2\2\u0273\u0275\5,\27\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0279\u027a\7\13\2\2\u027a\u027c\3\2\2\2\u027b\u0270\3"+
		"\2\2\2\u027b\u027c\3\2\2\2\u027c)\3\2\2\2\u027d\u027f\7\u020a\2\2\u027e"+
		"\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\7\u00b5"+
		"\2\2\u0281\u0283\7\5\2\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u02ab\5\u009aN\2\u0285\u0287\7k\2\2\u0286\u0288\7"+
		"\5\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u02ab\5\u00c4c\2\u028a\u028b\7\u0088\2\2\u028b\u028d\7\u00a0\2\2\u028c"+
		"\u028e\7\5\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u02ab\5\u00c4c\2\u0290\u0291\7\u00f4\2\2\u0291\u0293\7\u00a0"+
		"\2\2\u0292\u0294\7\5\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u02ab\5\u00c4c\2\u0296\u0298\7\u0146\2\2\u0297\u0299"+
		"\7\5\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u02ab\5\u00e0q\2\u029b\u029d\7\u0157\2\2\u029c\u029e\7\5\2\2\u029d\u029c"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02ab\5\u00e0q"+
		"\2\u02a0\u02a2\7\u0217\2\2\u02a1\u02a3\7\5\2\2\u02a2\u02a1\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02ab\5\60\31\2\u02a5\u02a7\7"+
		"\u016c\2\2\u02a6\u02a8\7\5\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2"+
		"\u02a8\u02a9\3\2\2\2\u02a9\u02ab\5\u00e2r\2\u02aa\u027e\3\2\2\2\u02aa"+
		"\u0285\3\2\2\2\u02aa\u028a\3\2\2\2\u02aa\u0290\3\2\2\2\u02aa\u0296\3\2"+
		"\2\2\u02aa\u029b\3\2\2\2\u02aa\u02a0\3\2\2\2\u02aa\u02a5\3\2\2\2\u02ab"+
		"+\3\2\2\2\u02ac\u02ad\7\u020f\2\2\u02ad\u02b1\5.\30\2\u02ae\u02b0\5*\26"+
		"\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2-\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\5\u00e2r\2\u02b5"+
		"/\3\2\2\2\u02b6\u02b7\5\u00e2r\2\u02b7\61\3\2\2\2\u02b8\u02b9\7\n\2\2"+
		"\u02b9\u02ba\5\64\33\2\u02ba\u02c2\7\13\2\2\u02bb\u02bc\7\4\2\2\u02bc"+
		"\u02bd\7\n\2\2\u02bd\u02be\5\64\33\2\u02be\u02bf\7\13\2\2\u02bf\u02c1"+
		"\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c7\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c7\5\64"+
		"\33\2\u02c6\u02b8\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\63\3\2\2\2\u02c8\u02cb"+
		"\7\u0143\2\2\u02c9\u02cb\5\u00c0a\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3"+
		"\2\2\2\u02cb\u02d3\3\2\2\2\u02cc\u02cf\7\4\2\2\u02cd\u02d0\7\u0143\2\2"+
		"\u02ce\u02d0\5\u00c0a\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\65\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9"+
		"\7\177\2\2\u02d7\u02d8\7\u017e\2\2\u02d8\u02da\7\u01bb\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02de\3\2\2\2\u02db\u02dc\7\62\2\2"+
		"\u02dc\u02dd\7\5\2\2\u02dd\u02df\t\n\2\2\u02de\u02db\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e6\3\2\2\2\u02e0\u02e1\7\u0098\2\2\u02e1\u02e4\7\5\2"+
		"\2\u02e2\u02e5\5r:\2\u02e3\u02e5\7\u0085\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e0\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02eb\3\2\2\2\u02e8\u02e9\7\u01f0\2\2\u02e9\u02ea\7\u01d6\2"+
		"\2\u02ea\u02ec\t\13\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\7\u024f\2\2\u02ee\u02f3\5v<\2\u02ef\u02f0\7"+
		"\n\2\2\u02f0\u02f1\5t;\2\u02f1\u02f2\7\13\2\2\u02f2\u02f4\3\2\2\2\u02f3"+
		"\u02ef\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\78"+
		"\2\2\u02f6\u02fd\5D#\2\u02f7\u02f9\7\u0256\2\2\u02f8\u02fa\t\f\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7^"+
		"\2\2\u02fc\u02fe\7\u017b\2\2\u02fd\u02f7\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\67\3\2\2\2\u02ff\u0301\7\u009b\2\2\u0300\u0302\7\u0130\2\2\u0301\u0300"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0305\7\u01a0\2"+
		"\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0308"+
		"\7\u00f0\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2"+
		"\2\u0309\u030a\7\u00d7\2\2\u030a\u030d\5\u00d2j\2\u030b\u030c\7\u0254"+
		"\2\2\u030c\u030e\5\u00a2R\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0310\5F$\2\u03109\3\2\2\2\u0311\u0313\5<\37\2\u0312"+
		"\u0314\t\r\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u031a\5@!\2\u0316\u0317\7\4\2\2\u0317\u0319\5@!\2\u0318\u0316"+
		"\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031f\5> \2\u031e\u031d\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u033d\3\2\2\2\u0320\u0321\5<\37\2\u0321\u0323"+
		"\5D#\2\u0322\u0324\5> \2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u033d\3\2\2\2\u0325\u0326\5<\37\2\u0326\u0327\7\u01de\2\2\u0327\u0328"+
		"\5\u00d6l\2\u0328\u032b\7\5\2\2\u0329\u032c\5\u00a2R\2\u032a\u032c\7\u0097"+
		"\2\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u0336\3\2\2\2\u032d"+
		"\u032e\7\4\2\2\u032e\u032f\5\u00d6l\2\u032f\u0332\7\5\2\2\u0330\u0333"+
		"\5\u00a2R\2\u0331\u0333\7\u0097\2\2\u0332\u0330\3\2\2\2\u0332\u0331\3"+
		"\2\2\2\u0333\u0335\3\2\2\2\u0334\u032d\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2"+
		"\2\2\u0339\u033b\5> \2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d"+
		"\3\2\2\2\u033c\u0311\3\2\2\2\u033c\u0320\3\2\2\2\u033c\u0325\3\2\2\2\u033d"+
		";\3\2\2\2\u033e\u0340\7\u00fd\2\2\u033f\u0341\t\16\2\2\u0340\u033f\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0344\7\u00f0\2\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347\7\u0108"+
		"\2\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034d\5\u00d2j\2\u0349\u034a\7\n\2\2\u034a\u034b\5t;\2\u034b\u034c\7"+
		"\13\2\2\u034c\u034e\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u0354\3\2\2\2\u034f\u0350\7\u0188\2\2\u0350\u0351\7\n\2\2\u0351\u0352"+
		"\5d\63\2\u0352\u0353\7\13\2\2\u0353\u0355\3\2\2\2\u0354\u034f\3\2\2\2"+
		"\u0354\u0355\3\2\2\2\u0355=\3\2\2\2\u0356\u0357\7\u0176\2\2\u0357\u0358"+
		"\7\u00ac\2\2\u0358\u0359\7\u0112\2\2\u0359\u035a\7\u023d\2\2\u035a\u035b"+
		"\5\u00d6l\2\u035b\u035c\7\5\2\2\u035c\u0364\5\u00a2R\2\u035d\u035e\7\4"+
		"\2\2\u035e\u035f\5\u00d6l\2\u035f\u0360\7\5\2\2\u0360\u0361\5\u00a2R\2"+
		"\u0361\u0363\3\2\2\2\u0362\u035d\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365?\3\2\2\2\u0366\u0364\3\2\2\2\u0367"+
		"\u036a\7\n\2\2\u0368\u036b\5\u00a2R\2\u0369\u036b\7\u0097\2\2\u036a\u0368"+
		"\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u0373\3\2\2\2\u036c\u036f\7\4\2\2\u036d"+
		"\u0370\5\u00a2R\2\u036e\u0370\7\u0097\2\2\u036f\u036d\3\2\2\2\u036f\u036e"+
		"\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036c\3\2\2\2\u0372\u0375\3\2\2\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0376\u0377\7\13\2\2\u0377A\3\2\2\2\u0378\u037a\7\u023d\2\2\u0379"+
		"\u037b\7\u0130\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d"+
		"\3\2\2\2\u037c\u037e\7\u00f0\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0380\5`\61\2\u0380\u0381\7\u01de\2\2\u0381"+
		"\u0382\5\u00d6l\2\u0382\u0385\7\5\2\2\u0383\u0386\5\u00a2R\2\u0384\u0386"+
		"\7\u0097\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0390\3\2\2"+
		"\2\u0387\u0388\7\4\2\2\u0388\u0389\5\u00d6l\2\u0389\u038c\7\5\2\2\u038a"+
		"\u038d\5\u00a2R\2\u038b\u038d\7\u0097\2\2\u038c\u038a\3\2\2\2\u038c\u038b"+
		"\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u0387\3\2\2\2\u038f\u0392\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0395\3\2\2\2\u0392\u0390\3\2"+
		"\2\2\u0393\u0394\7\u0254\2\2\u0394\u0396\5\u00a2R\2\u0395\u0393\3\2\2"+
		"\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\5F$\2\u0398C\3"+
		"\2\2\2\u0399\u039a\b#\1\2\u039a\u039b\7\n\2\2\u039b\u039c\5D#\2\u039c"+
		"\u03a5\7\13\2\2\u039d\u039f\7\u0237\2\2\u039e\u03a0\t\17\2\2\u039f\u039e"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\7\n\2\2\u03a2"+
		"\u03a3\5D#\2\u03a3\u03a4\7\13\2\2\u03a4\u03a6\3\2\2\2\u03a5\u039d\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03ab\5F$\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2"+
		"\2\u03ab\u03d6\3\2\2\2\u03ac\u03b0\7\u01d7\2\2\u03ad\u03af\5L\'\2\u03ae"+
		"\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b8\5Z.\2\u03b4\u03b5"+
		"\7\4\2\2\u03b5\u03b7\5Z.\2\u03b6\u03b4\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03c3\3\2\2\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03bd\5P)\2\u03bc\u03be\5N(\2\u03bd\u03bc\3\2\2\2\u03bd\u03be"+
		"\3\2\2\2\u03be\u03c4\3\2\2\2\u03bf\u03c1\5N(\2\u03c0\u03c2\5P)\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03bb\3\2"+
		"\2\2\u03c3\u03bf\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03cb\3\2\2\2\u03c5"+
		"\u03c6\7\u0198\2\2\u03c6\u03c7\5H%\2\u03c7\u03c8\7\n\2\2\u03c8\u03c9\5"+
		"J&\2\u03c9\u03ca\7\13\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c5\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03d3\3\2\2\2\u03cd\u03ce\7\u00d2\2\2\u03ce\u03d4"+
		"\7\u023d\2\2\u03cf\u03d0\7\u0128\2\2\u03d0\u03d1\7\u00f3\2\2\u03d1\u03d2"+
		"\7\u01df\2\2\u03d2\u03d4\7\u0159\2\2\u03d3\u03cd\3\2\2\2\u03d3\u03cf\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u0399\3\2\2\2\u03d5"+
		"\u03ac\3\2\2\2\u03d6\u03e3\3\2\2\2\u03d7\u03dd\f\5\2\2\u03d8\u03da\7\u0237"+
		"\2\2\u03d9\u03db\t\17\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\5D#\2\u03dd\u03d8\3\2\2\2\u03de\u03df\3\2\2"+
		"\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03d7"+
		"\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"E\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\7\u017f\2\2\u03e7\u03eb\7P\2"+
		"\2\u03e8\u03ec\5\u00d6l\2\u03e9\u03ec\5\u00a2R\2\u03ea\u03ec\5T+\2\u03eb"+
		"\u03e8\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ec\u03ee\3\2"+
		"\2\2\u03ed\u03ef\t\20\2\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03fb\3\2\2\2\u03f0\u03f4\7\4\2\2\u03f1\u03f5\5\u00d6l\2\u03f2\u03f5"+
		"\5\u00a2R\2\u03f3\u03f5\5T+\2\u03f4\u03f1\3\2\2\2\u03f4\u03f2\3\2\2\2"+
		"\u03f4\u03f3\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\t\20\2\2\u03f7\u03f6"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f0\3\2\2\2\u03fa"+
		"\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u040b\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0409\7\u011f\2\2\u03ff\u0400\5V,\2\u0400"+
		"\u0401\7\4\2\2\u0401\u0403\3\2\2\2\u0402\u03ff\3\2\2\2\u0402\u0403\3\2"+
		"\2\2\u0403\u0404\3\2\2\2\u0404\u040a\5X-\2\u0405\u0406\5X-\2\u0406\u0407"+
		"\7\u0174\2\2\u0407\u0408\5V,\2\u0408\u040a\3\2\2\2\u0409\u0402\3\2\2\2"+
		"\u0409\u0405\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u03fe\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040cG\3\2\2\2\u040d\u0410\5\u00d0i\2\u040e\u0410\5\u00e2r\2"+
		"\u040f\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410I\3\2\2\2\u0411\u0416\5"+
		"\u00a2R\2\u0412\u0413\7\4\2\2\u0413\u0415\5\u00a2R\2\u0414\u0412\3\2\2"+
		"\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417K"+
		"\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u0420\t\21\2\2\u041a\u0420\7\u00e7"+
		"\2\2\u041b\u0420\7\u020b\2\2\u041c\u0420\t\22\2\2\u041d\u0420\t\23\2\2"+
		"\u041e\u0420\7\u01f7\2\2\u041f\u0419\3\2\2\2\u041f\u041a\3\2\2\2\u041f"+
		"\u041b\3\2\2\2\u041f\u041c\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u041e\3\2"+
		"\2\2\u0420M\3\2\2\2\u0421\u0422\7\u00d7\2\2\u0422\u0425\5\\/\2\u0423\u0424"+
		"\7\u0254\2\2\u0424\u0426\5\u00a2R\2\u0425\u0423\3\2\2\2\u0425\u0426\3"+
		"\2\2\2\u0426\u0443\3\2\2\2\u0427\u0428\7\u00e2\2\2\u0428\u042c\7P\2\2"+
		"\u0429\u042d\5\u00d6l\2\u042a\u042d\5\u00a2R\2\u042b\u042d\5T+\2\u042c"+
		"\u0429\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2\2\u042d\u042f\3\2"+
		"\2\2\u042e\u0430\t\20\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u043c\3\2\2\2\u0431\u0435\7\4\2\2\u0432\u0436\5\u00d6l\2\u0433\u0436"+
		"\5\u00a2R\2\u0434\u0436\5T+\2\u0435\u0432\3\2\2\2\u0435\u0433\3\2\2\2"+
		"\u0435\u0434\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0439\t\20\2\2\u0438\u0437"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0431\3\2\2\2\u043b"+
		"\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0441\3\2"+
		"\2\2\u043e\u043c\3\2\2\2\u043f\u0440\7\u0256\2\2\u0440\u0442\7\u01c9\2"+
		"\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0427"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0446\7\u00e5\2"+
		"\2\u0446\u0448\5\u00a2R\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u044a\3\2\2\2\u0449\u044b\5F$\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2"+
		"\2\u044bO\3\2\2\2\u044c\u044d\7\u0108\2\2\u044d\u0455\5R*\2\u044e\u044f"+
		"\7\u0108\2\2\u044f\u0450\7\u0182\2\2\u0450\u0455\5\u00c4c\2\u0451\u0452"+
		"\7\u0108\2\2\u0452\u0453\7\u00ab\2\2\u0453\u0455\5\u00c4c\2\u0454\u044c"+
		"\3\2\2\2\u0454\u044e\3\2\2\2\u0454\u0451\3\2\2\2\u0455Q\3\2\2\2\u0456"+
		"\u045b\5\16\b\2\u0457\u0458\7\4\2\2\u0458\u045a\5\16\b\2\u0459\u0457\3"+
		"\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"S\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\7\u026d\2\2\u045fU\3\2\2\2\u0460"+
		"\u0461\7\u026d\2\2\u0461W\3\2\2\2\u0462\u0463\7\u026d\2\2\u0463Y\3\2\2"+
		"\2\u0464\u0467\5\u00a2R\2\u0465\u0467\7\f\2\2\u0466\u0464\3\2\2\2\u0466"+
		"\u0465\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0469\78\2\2\u0469\u046b\5\u00ce"+
		"h\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b[\3\2\2\2\u046c\u0471"+
		"\5^\60\2\u046d\u046e\7\4\2\2\u046e\u0470\5^\60\2\u046f\u046d\3\2\2\2\u0470"+
		"\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472]\3\2\2\2"+
		"\u0473\u0471\3\2\2\2\u0474\u047b\5`\61\2\u0475\u0476\7\r\2\2\u0476\u0477"+
		"\7\u0268\2\2\u0477\u0478\5`\61\2\u0478\u0479\7\16\2\2\u0479\u047b\3\2"+
		"\2\2\u047a\u0474\3\2\2\2\u047a\u0475\3\2\2\2\u047b_\3\2\2\2\u047c\u047d"+
		"\b\61\1\2\u047d\u0480\5b\62\2\u047e\u0480\5f\64\2\u047f\u047c\3\2\2\2"+
		"\u047f\u047e\3\2\2\2\u0480\u048e\3\2\2\2\u0481\u0483\f\3\2\2\u0482\u0484"+
		"\t\24\2\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2"+
		"\u0485\u0487\7\u0181\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u0489\7\u0111\2\2\u0489\u048a\5`\61\2\u048a\u048b"+
		"\5j\66\2\u048b\u048d\3\2\2\2\u048c\u0481\3\2\2\2\u048d\u0490\3\2\2\2\u048e"+
		"\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048fa\3\2\2\2\u0490\u048e\3\2\2\2"+
		"\u0491\u0497\5\u00d2j\2\u0492\u0493\7\u0188\2\2\u0493\u0494\7\n\2\2\u0494"+
		"\u0495\5d\63\2\u0495\u0496\7\13\2\2\u0496\u0498\3\2\2\2\u0497\u0492\3"+
		"\2\2\2\u0497\u0498\3\2\2\2\u0498\u049d\3\2\2\2\u0499\u049b\78\2\2\u049a"+
		"\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\5\u00ce"+
		"h\2\u049d\u049a\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f"+
		"\u04a1\5l\67\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04b5\3\2"+
		"\2\2\u04a2\u04a4\5D#\2\u04a3\u04a5\78\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\5\u00ceh\2\u04a7\u04b5\3\2\2"+
		"\2\u04a8\u04a9\7\n\2\2\u04a9\u04aa\5D#\2\u04aa\u04ac\7\13\2\2\u04ab\u04ad"+
		"\78\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\5\u00ceh\2\u04af\u04b5\3\2\2\2\u04b0\u04b1\7\n\2\2\u04b1\u04b2"+
		"\5\\/\2\u04b2\u04b3\7\13\2\2\u04b3\u04b5\3\2\2\2\u04b4\u0491\3\2\2\2\u04b4"+
		"\u04a2\3\2\2\2\u04b4\u04a8\3\2\2\2\u04b4\u04b0\3\2\2\2\u04b5c\3\2\2\2"+
		"\u04b6\u04bb\5.\30\2\u04b7\u04b8\7\4\2\2\u04b8\u04ba\5.\30\2\u04b9\u04b7"+
		"\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc"+
		"e\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04c2\5b\62\2\u04bf\u04c1\5h\65\2"+
		"\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3g\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c7\t\25\2\2\u04c6"+
		"\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7\u0111"+
		"\2\2\u04c9\u04cb\5b\62\2\u04ca\u04cc\5j\66\2\u04cb\u04ca\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u04de\3\2\2\2\u04cd\u04ce\7\u020b\2\2\u04ce\u04de"+
		"\5b\62\2\u04cf\u04d0\7\u020b\2\2\u04d0\u04d1\5b\62\2\u04d1\u04d2\7\u0176"+
		"\2\2\u04d2\u04d3\5\u00a2R\2\u04d3\u04de\3\2\2\2\u04d4\u04d9\7\u0165\2"+
		"\2\u04d5\u04d7\t\24\2\2\u04d6\u04d8\7\u0181\2\2\u04d7\u04d6\3\2\2\2\u04d7"+
		"\u04d8\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d5\3\2\2\2\u04d9\u04da\3\2"+
		"\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\u0111\2\2\u04dc\u04de\5b\62\2\u04dd"+
		"\u04c6\3\2\2\2\u04dd\u04cd\3\2\2\2\u04dd\u04cf\3\2\2\2\u04dd\u04d4\3\2"+
		"\2\2\u04dei\3\2\2\2\u04df\u04e0\7\u0176\2\2\u04e0\u04e7\5\u00a2R\2\u04e1"+
		"\u04e2\7\u0244\2\2\u04e2\u04e3\7\n\2\2\u04e3\u04e4\5t;\2\u04e4\u04e5\7"+
		"\13\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04df\3\2\2\2\u04e6\u04e1\3\2\2\2\u04e7"+
		"k\3\2\2\2\u04e8\u04ed\5n8\2\u04e9\u04ea\7\4\2\2\u04ea\u04ec\5n8\2\u04eb"+
		"\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2"+
		"\2\2\u04eem\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f1\7\u0240\2\2\u04f1"+
		"\u04fa\t\26\2\2\u04f2\u04f8\7\u00d2\2\2\u04f3\u04f9\7\u0111\2\2\u04f4"+
		"\u04f5\7\u017f\2\2\u04f5\u04f9\7P\2\2\u04f6\u04f7\7\u00e2\2\2\u04f7\u04f9"+
		"\7P\2\2\u04f8\u04f3\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fb\3\2\2\2\u04fa\u04f2\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u04fe\7\n\2\2\u04fd\u04ff\5p9\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0524\7\13\2\2\u0501\u0502\7\u00f0"+
		"\2\2\u0502\u050b\t\26\2\2\u0503\u0509\7\u00d2\2\2\u0504\u050a\7\u0111"+
		"\2\2\u0505\u0506\7\u017f\2\2\u0506\u050a\7P\2\2\u0507\u0508\7\u00e2\2"+
		"\2\u0508\u050a\7P\2\2\u0509\u0504\3\2\2\2\u0509\u0505\3\2\2\2\u0509\u0507"+
		"\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u0503\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u050f\7\n\2\2\u050e\u0510\5p9\2\u050f\u050e\3\2\2"+
		"\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0524\7\13\2\2\u0512"+
		"\u0513\7\u00d3\2\2\u0513\u051c\t\26\2\2\u0514\u051a\7\u00d2\2\2\u0515"+
		"\u051b\7\u0111\2\2\u0516\u0517\7\u017f\2\2\u0517\u051b\7P\2\2\u0518\u0519"+
		"\7\u00e2\2\2\u0519\u051b\7P\2\2\u051a\u0515\3\2\2\2\u051a\u0516\3\2\2"+
		"\2\u051a\u0518\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u0514\3\2\2\2\u051c\u051d"+
		"\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\7\n\2\2\u051f\u0521\5p9\2\u0520"+
		"\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\7\13"+
		"\2\2\u0523\u04f0\3\2\2\2\u0523\u0501\3\2\2\2\u0523\u0512\3\2\2\2\u0524"+
		"o\3\2\2\2\u0525\u052a\5\u00d8m\2\u0526\u0527\7\4\2\2\u0527\u0529\5\u00d8"+
		"m\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052bq\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u052e\5\u00c4"+
		"c\2\u052es\3\2\2\2\u052f\u0534\5\u00d6l\2\u0530\u0531\7\4\2\2\u0531\u0533"+
		"\5\u00d6l\2\u0532\u0530\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2"+
		"\2\u0534\u0535\3\2\2\2\u0535u\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538"+
		"\5\u00e2r\2\u0538w\3\2\2\2\u0539\u053a\5\u00d6l\2\u053a\u053b\5z>\2\u053b"+
		"\u05d9\3\2\2\2\u053c\u053e\7u\2\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2"+
		"\2\2\u053e\u053f\3\2\2\2\u053f\u0541\5\u00dan\2\u0540\u053d\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\7\u0196\2\2\u0543\u0545"+
		"\7\u0112\2\2\u0544\u0546\5\u0084C\2\u0545\u0544\3\2\2\2\u0545\u0546\3"+
		"\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\7\n\2\2\u0548\u054d\5\u0082B\2"+
		"\u0549\u054a\7\4\2\2\u054a\u054c\5\u0082B\2\u054b\u0549\3\2\2\2\u054c"+
		"\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2"+
		"\2\2\u054f\u054d\3\2\2\2\u0550\u0554\7\13\2\2\u0551\u0553\5\u0086D\2\u0552"+
		"\u0551\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2"+
		"\2\2\u0555\u05d9\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u0559\t\26\2\2\u0558"+
		"\u055a\5\u00d8m\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c"+
		"\3\2\2\2\u055b\u055d\5\u0084C\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2"+
		"\2\u055d\u055e\3\2\2\2\u055e\u055f\7\n\2\2\u055f\u0564\5\u0082B\2\u0560"+
		"\u0561\7\4\2\2\u0561\u0563\5\u0082B\2\u0562\u0560\3\2\2\2\u0563\u0566"+
		"\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\3\2\2\2\u0566"+
		"\u0564\3\2\2\2\u0567\u056b\7\13\2\2\u0568\u056a\5\u0086D\2\u0569\u0568"+
		"\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u05d9\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u0570\7u\2\2\u056f\u056e\3\2"+
		"\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\5\u00dan\2\u0572"+
		"\u056f\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\7\u0238"+
		"\2\2\u0575\u0577\t\26\2\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u0579\3\2\2\2\u0578\u057a\5\u00d8m\2\u0579\u0578\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u057d\5\u0084C\2\u057c\u057b\3\2\2"+
		"\2\u057c\u057d\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\7\n\2\2\u057f\u0584"+
		"\5\u0082B\2\u0580\u0581\7\4\2\2\u0581\u0583\5\u0082B\2\u0582\u0580\3\2"+
		"\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u058b\7\13\2\2\u0588\u058a\5"+
		"\u0086D\2\u0589\u0588\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2"+
		"\u058b\u058c\3\2\2\2\u058c\u05d9\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u0590"+
		"\7\u00d9\2\2\u058f\u0591\t\26\2\2\u0590\u058f\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0593\3\2\2\2\u0592\u0594\5\u00d8m\2\u0593\u0592\3\2\2\2\u0593"+
		"\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\7\n\2\2\u0596\u059b\5\u0082"+
		"B\2\u0597\u0598\7\4\2\2\u0598\u059a\5\u0082B\2\u0599\u0597\3\2\2\2\u059a"+
		"\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2"+
		"\2\2\u059d\u059b\3\2\2\2\u059e\u05a2\7\13\2\2\u059f\u05a1\5\u0086D\2\u05a0"+
		"\u059f\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2"+
		"\2\2\u05a3\u05d9\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a7\7\u01ee\2\2\u05a6"+
		"\u05a8\t\26\2\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3"+
		"\2\2\2\u05a9\u05ab\5\u00d8m\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2"+
		"\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\n\2\2\u05ad\u05b2\5\u0082B\2\u05ae"+
		"\u05af\7\4\2\2\u05af\u05b1\5\u0082B\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4"+
		"\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4"+
		"\u05b2\3\2\2\2\u05b5\u05b9\7\13\2\2\u05b6\u05b8\5\u0086D\2\u05b7\u05b6"+
		"\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05d9\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05be\7u\2\2\u05bd\u05bc\3\2"+
		"\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\5\u00dan\2\u05c0"+
		"\u05bd\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\7\u00d4"+
		"\2\2\u05c3\u05c5\7\u0112\2\2\u05c4\u05c6\5\u00d8m\2\u05c5\u05c4\3\2\2"+
		"\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\7\n\2\2\u05c8\u05cd"+
		"\5\u0082B\2\u05c9\u05ca\7\4\2\2\u05ca\u05cc\5\u0082B\2\u05cb\u05c9\3\2"+
		"\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05d0\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7\13\2\2\u05d1\u05d2\5"+
		"\u0088E\2\u05d2\u05d9\3\2\2\2\u05d3\u05d4\7^\2\2\u05d4\u05d5\7\n\2\2\u05d5"+
		"\u05d6\5\u00a2R\2\u05d6\u05d7\7\13\2\2\u05d7\u05d9\3\2\2\2\u05d8\u0539"+
		"\3\2\2\2\u05d8\u0540\3\2\2\2\u05d8\u0557\3\2\2\2\u05d8\u0572\3\2\2\2\u05d8"+
		"\u058e\3\2\2\2\u05d8\u05a5\3\2\2\2\u05d8\u05c0\3\2\2\2\u05d8\u05d3\3\2"+
		"\2\2\u05d9y\3\2\2\2\u05da\u05de\5\u0080A\2\u05db\u05dd\5~@\2\u05dc\u05db"+
		"\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\5|?\2\u05e2\u05e1\3\2\2"+
		"\2\u05e2\u05e3\3\2\2\2\u05e3{\3\2\2\2\u05e4\u05e5\7\u01ac\2\2\u05e5\u05e6"+
		"\5\u00d2j\2\u05e6\u05e7\7\n\2\2\u05e7\u05e8\5\u0082B\2\u05e8\u05ec\7\13"+
		"\2\2\u05e9\u05eb\5\u008aF\2\u05ea\u05e9\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec"+
		"\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed}\3\2\2\2\u05ee\u05ec\3\2\2\2"+
		"\u05ef\u05f1\7\u016e\2\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u060b\7\u0171\2\2\u05f3\u060b\7?\2\2\u05f4\u05f6"+
		"\7\u0238\2\2\u05f5\u05f7\7\u0112\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3"+
		"\2\2\2\u05f7\u060b\3\2\2\2\u05f8\u05fa\7\u0196\2\2\u05f9\u05f8\3\2\2\2"+
		"\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u060b\7\u0112\2\2\u05fc"+
		"\u05fd\7\u0097\2\2\u05fd\u060b\5\u00c0a\2\u05fe\u05ff\7k\2\2\u05ff\u060b"+
		"\5\u00c4c\2\u0600\u0601\7h\2\2\u0601\u0602\7\u0263\2\2\u0602\u060b\t\27"+
		"\2\2\u0603\u0604\7\u020a\2\2\u0604\u060b\t\30\2\2\u0605\u0606\7f\2\2\u0606"+
		"\u060b\5\u0098M\2\u0607\u0608\7\u0176\2\2\u0608\u0609\7\u023d\2\2\u0609"+
		"\u060b\5\u00ccg\2\u060a\u05f0\3\2\2\2\u060a\u05f3\3\2\2\2\u060a\u05f4"+
		"\3\2\2\2\u060a\u05f9\3\2\2\2\u060a\u05fc\3\2\2\2\u060a\u05fe\3\2\2\2\u060a"+
		"\u0600\3\2\2\2\u060a\u0603\3\2\2\2\u060a\u0605\3\2\2\2\u060a\u0607\3\2"+
		"\2\2\u060b\177\3\2\2\2\u060c\u0611\7I\2\2\u060d\u060e\7\n\2\2\u060e\u060f"+
		"\5\u00dco\2\u060f\u0610\7\13\2\2\u0610\u0612\3\2\2\2\u0611\u060d\3\2\2"+
		"\2\u0611\u0612\3\2\2\2\u0612\u0722\3\2\2\2\u0613\u0722\7L\2\2\u0614\u0722"+
		"\7M\2\2\u0615\u061a\7\u0225\2\2\u0616\u0617\7\n\2\2\u0617\u0618\5\u00dc"+
		"o\2\u0618\u0619\7\13\2\2\u0619\u061b\3\2\2\2\u061a\u0616\3\2\2\2\u061a"+
		"\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\7\u023b\2\2\u061d\u061c"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u0621\7\u0260\2"+
		"\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0722\3\2\2\2\u0622\u0627"+
		"\7\u01e7\2\2\u0623\u0624\7\n\2\2\u0624\u0625\5\u00dco\2\u0625\u0626\7"+
		"\13\2\2\u0626\u0628\3\2\2\2\u0627\u0623\3\2\2\2\u0627\u0628\3\2\2\2\u0628"+
		"\u062a\3\2\2\2\u0629\u062b\7\u023b\2\2\u062a\u0629\3\2\2\2\u062a\u062b"+
		"\3\2\2\2\u062b\u062d\3\2\2\2\u062c\u062e\7\u0260\2\2\u062d\u062c\3\2\2"+
		"\2\u062d\u062e\3\2\2\2\u062e\u0722\3\2\2\2\u062f\u0634\7\u014c\2\2\u0630"+
		"\u0631\7\n\2\2\u0631\u0632\5\u00dco\2\u0632\u0633\7\13\2\2\u0633\u0635"+
		"\3\2\2\2\u0634\u0630\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0637\3\2\2\2\u0636"+
		"\u0638\7\u023b\2\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a"+
		"\3\2\2\2\u0639\u063b\7\u0260\2\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2"+
		"\2\u063b\u0722\3\2\2\2\u063c\u0641\7\u0100\2\2\u063d\u063e\7\n\2\2\u063e"+
		"\u063f\5\u00dco\2\u063f\u0640\7\13\2\2\u0640\u0642\3\2\2\2\u0641\u063d"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0645\7\u023b\2"+
		"\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0648"+
		"\7\u0260\2\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0722\3\2\2"+
		"\2\u0649\u064e\7\u0106\2\2\u064a\u064b\7\n\2\2\u064b\u064c\5\u00dco\2"+
		"\u064c\u064d\7\13\2\2\u064d\u064f\3\2\2\2\u064e\u064a\3\2\2\2\u064e\u064f"+
		"\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0652\7\u023b\2\2\u0651\u0650\3\2\2"+
		"\2\u0651\u0652\3\2\2\2\u0652\u0654\3\2\2\2\u0653\u0655\7\u0260\2\2\u0654"+
		"\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0722\3\2\2\2\u0656\u065b\7F"+
		"\2\2\u0657\u0658\7\n\2\2\u0658\u0659\5\u00dco\2\u0659\u065a\7\13\2\2\u065a"+
		"\u065c\3\2\2\2\u065b\u0657\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e\3\2"+
		"\2\2\u065d\u065f\7\u023b\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0661\3\2\2\2\u0660\u0662\7\u0260\2\2\u0661\u0660\3\2\2\2\u0661\u0662"+
		"\3\2\2\2\u0662\u0722\3\2\2\2\u0663\u066a\7\u01a6\2\2\u0664\u0665\7\n\2"+
		"\2\u0665\u0666\5\u00dco\2\u0666\u0667\7\4\2\2\u0667\u0668\5\u00dep\2\u0668"+
		"\u0669\7\13\2\2\u0669\u066b\3\2\2\2\u066a\u0664\3\2\2\2\u066a\u066b\3"+
		"\2\2\2\u066b\u066d\3\2\2\2\u066c\u066e\7\u023b\2\2\u066d\u066c\3\2\2\2"+
		"\u066d\u066e\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u0671\7\u0260\2\2\u0670"+
		"\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0722\3\2\2\2\u0672\u0679\7\u00a8"+
		"\2\2\u0673\u0674\7\n\2\2\u0674\u0675\5\u00dco\2\u0675\u0676\7\4\2\2\u0676"+
		"\u0677\5\u00dep\2\u0677\u0678\7\13\2\2\u0678\u067a\3\2\2\2\u0679\u0673"+
		"\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b\u067d\7\u023b\2"+
		"\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u0680"+
		"\7\u0260\2\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0722\3\2\2"+
		"\2\u0681\u0688\7\u00ce\2\2\u0682\u0683\7\n\2\2\u0683\u0684\5\u00dco\2"+
		"\u0684\u0685\7\4\2\2\u0685\u0686\5\u00dep\2\u0686\u0687\7\13\2\2\u0687"+
		"\u0689\3\2\2\2\u0688\u0682\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2"+
		"\2\2\u068a\u068c\7\u023b\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u068e\3\2\2\2\u068d\u068f\7\u0260\2\2\u068e\u068d\3\2\2\2\u068e\u068f"+
		"\3\2\2\2\u068f\u0722\3\2\2\2\u0690\u0697\7\u0095\2\2\u0691\u0692\7\n\2"+
		"\2\u0692\u0693\5\u00dco\2\u0693\u0694\7\4\2\2\u0694\u0695\5\u00dep\2\u0695"+
		"\u0696\7\13\2\2\u0696\u0698\3\2\2\2\u0697\u0691\3\2\2\2\u0697\u0698\3"+
		"\2\2\2\u0698\u069a\3\2\2\2\u0699\u069b\7\u023b\2\2\u069a\u0699\3\2\2\2"+
		"\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c\u069e\7\u0260\2\2\u069d"+
		"\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u0722\3\2\2\2\u069f\u06a6\7\u0172"+
		"\2\2\u06a0\u06a1\7\n\2\2\u06a1\u06a2\5\u00dco\2\u06a2\u06a3\7\4\2\2\u06a3"+
		"\u06a4\5\u00dep\2\u06a4\u06a5\7\13\2\2\u06a5\u06a7\3\2\2\2\u06a6\u06a0"+
		"\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06aa\7\u023b\2"+
		"\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ac\3\2\2\2\u06ab\u06ad"+
		"\7\u0260\2\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u0722\3\2\2"+
		"\2\u06ae\u0722\7\u008c\2\2\u06af\u0722\7\u0220\2\2\u06b0\u0722\7\u0221"+
		"\2\2\u06b1\u0722\7\u008d\2\2\u06b2\u0722\7\u025e\2\2\u06b3\u06b8\7[\2"+
		"\2\u06b4\u06b5\7\n\2\2\u06b5\u06b6\5\u00dco\2\u06b6\u06b7\7\13\2\2\u06b7"+
		"\u06b9\3\2\2\2\u06b8\u06b4\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2"+
		"\2\2\u06ba\u06bc\7G\2\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc"+
		"\u06c0\3\2\2\2\u06bd\u06be\7\\\2\2\u06be\u06bf\7\u01de\2\2\u06bf\u06c1"+
		"\5\u0096L\2\u06c0\u06bd\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u0722\3\2\2"+
		"\2\u06c2\u06c7\7\u024b\2\2\u06c3\u06c4\7\n\2\2\u06c4\u06c5\5\u00dco\2"+
		"\u06c5\u06c6\7\13\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06c3\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06cb\7G\2\2\u06ca\u06c9\3\2\2\2\u06ca"+
		"\u06cb\3\2\2\2\u06cb\u06cf\3\2\2\2\u06cc\u06cd\7\\\2\2\u06cd\u06ce\7\u01de"+
		"\2\2\u06ce\u06d0\5\u0096L\2\u06cf\u06cc\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u0722\3\2\2\2\u06d1\u06d6\7G\2\2\u06d2\u06d3\7\n\2\2\u06d3\u06d4\5\u00dc"+
		"o\2\u06d4\u06d5\7\13\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06d2\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u0722\3\2\2\2\u06d8\u06dd\7\u024a\2\2\u06d9\u06da"+
		"\7\n\2\2\u06da\u06db\5\u00dco\2\u06db\u06dc\7\13\2\2\u06dc\u06de\3\2\2"+
		"\2\u06dd\u06d9\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u0722\3\2\2\2\u06df\u0722"+
		"\7\u0224\2\2\u06e0\u0722\7J\2\2\u06e1\u0722\7\u014b\2\2\u06e2\u0722\7"+
		"\u012d\2\2\u06e3\u06e5\7\u0226\2\2\u06e4\u06e6\7G\2\2\u06e5\u06e4\3\2"+
		"\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06ea\3\2\2\2\u06e7\u06e8\7\\\2\2\u06e8"+
		"\u06e9\7\u01de\2\2\u06e9\u06eb\5\u0096L\2\u06ea\u06e7\3\2\2\2\u06ea\u06eb"+
		"\3\2\2\2\u06eb\u0722\3\2\2\2\u06ec\u06ee\7\u021d\2\2\u06ed\u06ef\7G\2"+
		"\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f3\3\2\2\2\u06f0\u06f1"+
		"\7\\\2\2\u06f1\u06f2\7\u01de\2\2\u06f2\u06f4\5\u0096L\2\u06f3\u06f0\3"+
		"\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u0722\3\2\2\2\u06f5\u06f7\7\u014d\2\2"+
		"\u06f6\u06f8\7G\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fc"+
		"\3\2\2\2\u06f9\u06fa\7\\\2\2\u06fa\u06fb\7\u01de\2\2\u06fb\u06fd\5\u0096"+
		"L\2\u06fc\u06f9\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0722\3\2\2\2\u06fe"+
		"\u0700\7\u012e\2\2\u06ff\u0701\7G\2\2\u0700\u06ff\3\2\2\2\u0700\u0701"+
		"\3\2\2\2\u0701\u0705\3\2\2\2\u0702\u0703\7\\\2\2\u0703\u0704\7\u01de\2"+
		"\2\u0704\u0706\5\u0096L\2\u0705\u0702\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0722\3\2\2\2\u0707\u0708\7\u00b7\2\2\u0708\u0709\7\n\2\2\u0709\u070c"+
		"\5\u00c4c\2\u070a\u070b\7\4\2\2\u070b\u070d\5\u00c4c\2\u070c\u070a\3\2"+
		"\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0712\7\13\2\2\u070f"+
		"\u0710\7\\\2\2\u0710\u0711\7\u01de\2\2\u0711\u0713\5\u0096L\2\u0712\u070f"+
		"\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0722\3\2\2\2\u0714\u0715\7\u01de\2"+
		"\2\u0715\u0716\7\n\2\2\u0716\u0719\5\u00c4c\2\u0717\u0718\7\4\2\2\u0718"+
		"\u071a\5\u00c4c\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b"+
		"\3\2\2\2\u071b\u071f\7\13\2\2\u071c\u071d\7\\\2\2\u071d\u071e\7\u01de"+
		"\2\2\u071e\u0720\5\u0096L\2\u071f\u071c\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0722\3\2\2\2\u0721\u060c\3\2\2\2\u0721\u0613\3\2\2\2\u0721\u0614\3\2"+
		"\2\2\u0721\u0615\3\2\2\2\u0721\u0622\3\2\2\2\u0721\u062f\3\2\2\2\u0721"+
		"\u063c\3\2\2\2\u0721\u0649\3\2\2\2\u0721\u0656\3\2\2\2\u0721\u0663\3\2"+
		"\2\2\u0721\u0672\3\2\2\2\u0721\u0681\3\2\2\2\u0721\u0690\3\2\2\2\u0721"+
		"\u069f\3\2\2\2\u0721\u06ae\3\2\2\2\u0721\u06af\3\2\2\2\u0721\u06b0\3\2"+
		"\2\2\u0721\u06b1\3\2\2\2\u0721\u06b2\3\2\2\2\u0721\u06b3\3\2\2\2\u0721"+
		"\u06c2\3\2\2\2\u0721\u06d1\3\2\2\2\u0721\u06d8\3\2\2\2\u0721\u06df\3\2"+
		"\2\2\u0721\u06e0\3\2\2\2\u0721\u06e1\3\2\2\2\u0721\u06e2\3\2\2\2\u0721"+
		"\u06e3\3\2\2\2\u0721\u06ec\3\2\2\2\u0721\u06f5\3\2\2\2\u0721\u06fe\3\2"+
		"\2\2\u0721\u0707\3\2\2\2\u0721\u0714\3\2\2\2\u0722\u0081\3\2\2\2\u0723"+
		"\u0728\5\u00d6l\2\u0724\u0725\7\n\2\2\u0725\u0726\5\u00dco\2\u0726\u0727"+
		"\7\13\2\2\u0727\u0729\3\2\2\2\u0728\u0724\3\2\2\2\u0728\u0729\3\2\2\2"+
		"\u0729\u072b\3\2\2\2\u072a\u072c\t\20\2\2\u072b\u072a\3\2\2\2\u072b\u072c"+
		"\3\2\2\2\u072c\u0083\3\2\2\2\u072d\u072e\7\u0244\2\2\u072e\u072f\t\31"+
		"\2\2\u072f\u0085\3\2\2\2\u0730\u0732\7\u0114\2\2\u0731\u0733\7\5\2\2\u0732"+
		"\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u073c\5\u00e0"+
		"q\2\u0735\u073c\5\u0084C\2\u0736\u0737\7\u0256\2\2\u0737\u0738\7\u0186"+
		"\2\2\u0738\u073c\5\u009cO\2\u0739\u073a\7k\2\2\u073a\u073c\5\u00c4c\2"+
		"\u073b\u0730\3\2\2\2\u073b\u0735\3\2\2\2\u073b\u0736\3\2\2\2\u073b\u0739"+
		"\3\2\2\2\u073c\u0087\3\2\2\2\u073d\u073e\7\u01ac\2\2\u073e\u073f\5\u00d2"+
		"j\2\u073f\u0740\7\n\2\2\u0740\u0745\5\u0082B\2\u0741\u0742\7\4\2\2\u0742"+
		"\u0744\5\u0082B\2\u0743\u0741\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743"+
		"\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u0745\3\2\2\2\u0748"+
		"\u074c\7\13\2\2\u0749\u074b\5\u008aF\2\u074a\u0749\3\2\2\2\u074b\u074e"+
		"\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0089\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074f\u0750\7\u0142\2\2\u0750\u0758\t\32\2\2\u0751\u0752"+
		"\7\u0176\2\2\u0752\u0753\7\u009b\2\2\u0753\u0758\5\u008cG\2\u0754\u0755"+
		"\7\u0176\2\2\u0755\u0756\7\u023d\2\2\u0756\u0758\5\u008eH\2\u0757\u074f"+
		"\3\2\2\2\u0757\u0751\3\2\2\2\u0757\u0754\3\2\2\2\u0758\u008b\3\2\2\2\u0759"+
		"\u075a\5\u0090I\2\u075a\u008d\3\2\2\2\u075b\u075c\5\u0090I\2\u075c\u008f"+
		"\3\2\2\2\u075d\u0764\7\u01c1\2\2\u075e\u0764\7T\2\2\u075f\u0760\7\u01de"+
		"\2\2\u0760\u0764\7\u0171\2\2\u0761\u0762\7\u016b\2\2\u0762\u0764\7-\2"+
		"\2\u0763\u075d\3\2\2\2\u0763\u075e\3\2\2\2\u0763\u075f\3\2\2\2\u0763\u0761"+
		"\3\2\2\2\u0764\u0091\3\2\2\2\u0765\u076c\5\u0094K\2\u0766\u0768\7\4\2"+
		"\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076b"+
		"\5\u0094K\2\u076a\u0767\3\2\2\2\u076b\u076e\3\2\2\2\u076c\u076a\3\2\2"+
		"\2\u076c\u076d\3\2\2\2\u076d\u0093\3\2\2\2\u076e\u076c\3\2\2\2\u076f\u0771"+
		"\7\u00b5\2\2\u0770\u0772\7\5\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2"+
		"\2\u0772\u0773\3\2\2\2\u0773\u0801\5\u009aN\2\u0774\u0776\7?\2\2\u0775"+
		"\u0777\7\5\2\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2"+
		"\2\2\u0778\u0801\5\u00e0q\2\u0779\u077b\7A\2\2\u077a\u077c\7\5\2\2\u077b"+
		"\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0801\5\u00e0"+
		"q\2\u077e\u0780\7\u0097\2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780"+
		"\u0784\3\2\2\2\u0781\u0782\7\\\2\2\u0782\u0785\7\u01de\2\2\u0783\u0785"+
		"\7]\2\2\u0784\u0781\3\2\2\2\u0784\u0783\3\2\2\2\u0785\u0787\3\2\2\2\u0786"+
		"\u0788\7\5\2\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\3\2"+
		"\2\2\u0789\u0801\5\u0096L\2\u078a\u078b\7_\2\2\u078b\u078c\7\5\2\2\u078c"+
		"\u0801\5\u00e0q\2\u078d\u078f\7\u0097\2\2\u078e\u078d\3\2\2\2\u078e\u078f"+
		"\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\7f\2\2\u0791\u0793\7\5\2\2\u0792"+
		"\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0801\5\u0098"+
		"M\2\u0795\u0797\7k\2\2\u0796\u0798\7\5\2\2\u0797\u0796\3\2\2\2\u0797\u0798"+
		"\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u0801\5\u00c4c\2\u079a\u079c\7s\2\2"+
		"\u079b\u079d\7\5\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e"+
		"\3\2\2\2\u079e\u0801\5\u00c4c\2\u079f\u07a0\7\u0088\2\2\u07a0\u07a2\7"+
		"\u00a0\2\2\u07a1\u07a3\7\5\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2"+
		"\u07a3\u07a4\3\2\2\2\u07a4\u0801\5\u00c4c\2\u07a5\u07a7\7\u009a\2\2\u07a6"+
		"\u07a8\7\5\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2"+
		"\2\2\u07a9\u0801\5\u00e0q\2\u07aa\u07ab\7\u00f4\2\2\u07ab\u07ad\7\u00a0"+
		"\2\2\u07ac\u07ae\7\5\2\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u0801\5\u00c4c\2\u07b0\u07b2\7\u00fe\2\2\u07b1\u07b3"+
		"\7\5\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4"+
		"\u0801\t\33\2\2\u07b5\u07b7\7\u0114\2\2\u07b6\u07b8\7\5\2\2\u07b7\u07b6"+
		"\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u0801\5\u00e0q"+
		"\2\u07ba\u07bc\7\u0146\2\2\u07bb\u07bd\7\5\2\2\u07bc\u07bb\3\2\2\2\u07bc"+
		"\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u0801\5\u00e0q\2\u07bf\u07c1"+
		"\7\u0157\2\2\u07c0\u07c2\7\5\2\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2"+
		"\2\u07c2\u07c3\3\2\2\2\u07c3\u0801\5\u00e0q\2\u07c4\u07c6\7\u0184\2\2"+
		"\u07c5\u07c7\7\5\2\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07ca"+
		"\3\2\2\2\u07c8\u07cb\5\u00e0q\2\u07c9\u07cb\7\u0097\2\2\u07ca\u07c8\3"+
		"\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u0801\3\2\2\2\u07cc\u07ce\7\u018b\2\2"+
		"\u07cd\u07cf\7\5\2\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u0801\5\u00c4c\2\u07d1\u07d3\7\u01cd\2\2\u07d2\u07d4\7"+
		"\5\2\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5"+
		"\u0801\t\34\2\2\u07d6\u07d8\7\u0265\2\2\u07d7\u07d9\7\5\2\2\u07d8\u07d7"+
		"\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07dc\3\2\2\2\u07da\u07dd\5\u00e0q"+
		"\2\u07db\u07dd\7\u0097\2\2\u07dc\u07da\3\2\2\2\u07dc\u07db\3\2\2\2\u07dd"+
		"\u0801\3\2\2\2\u07de\u07e0\7\u0266\2\2\u07df\u07e1\7\5\2\2\u07e0\u07df"+
		"\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e5\5\u00e0q"+
		"\2\u07e3\u07e5\7\u0097\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e3\3\2\2\2\u07e5"+
		"\u0801\3\2\2\2\u07e6\u07e8\7\u0267\2\2\u07e7\u07e9\7\5\2\2\u07e8\u07e7"+
		"\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u0801\5\u00e0q"+
		"\2\u07eb\u07ec\7\u0217\2\2\u07ec\u07ef\5\60\31\2\u07ed\u07ee\7\u020a\2"+
		"\2\u07ee\u07f0\t\30\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0"+
		"\u0801\3\2\2\2\u07f1\u07f3\7\u0237\2\2\u07f2\u07f4\7\5\2\2\u07f3\u07f2"+
		"\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\7\n\2\2\u07f6"+
		"\u07fb\5\u00d2j\2\u07f7\u07f8\7\4\2\2\u07f8\u07fa\5\u00d2j\2\u07f9\u07f7"+
		"\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u07fe\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07ff\7\13\2\2\u07ff\u0801\3"+
		"\2\2\2\u0800\u076f\3\2\2\2\u0800\u0774\3\2\2\2\u0800\u0779\3\2\2\2\u0800"+
		"\u077f\3\2\2\2\u0800\u078a\3\2\2\2\u0800\u078e\3\2\2\2\u0800\u0795\3\2"+
		"\2\2\u0800\u079a\3\2\2\2\u0800\u079f\3\2\2\2\u0800\u07a5\3\2\2\2\u0800"+
		"\u07aa\3\2\2\2\u0800\u07b0\3\2\2\2\u0800\u07b5\3\2\2\2\u0800\u07ba\3\2"+
		"\2\2\u0800\u07bf\3\2\2\2\u0800\u07c4\3\2\2\2\u0800\u07cc\3\2\2\2\u0800"+
		"\u07d1\3\2\2\2\u0800\u07d6\3\2\2\2\u0800\u07de\3\2\2\2\u0800\u07e6\3\2"+
		"\2\2\u0800\u07eb\3\2\2\2\u0800\u07f1\3\2\2\2\u0801\u0095\3\2\2\2\u0802"+
		"\u0805\5\u00e2r\2\u0803\u0805\5\u00c4c\2\u0804\u0802\3\2\2\2\u0804\u0803"+
		"\3\2\2\2\u0805\u0097\3\2\2\2\u0806\u0809\5\u00e2r\2\u0807\u0809\5\u00c4"+
		"c\2\u0808\u0806\3\2\2\2\u0808\u0807\3\2\2\2\u0809\u0099\3\2\2\2\u080a"+
		"\u080e\5\u00e2r\2\u080b\u080e\5\u00c4c\2\u080c\u080e\5\u00d0i\2\u080d"+
		"\u080a\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080c\3\2\2\2\u080e\u009b\3\2"+
		"\2\2\u080f\u0812\5\u00e2r\2\u0810\u0812\5\u00c4c\2\u0811\u080f\3\2\2\2"+
		"\u0811\u0810\3\2\2\2\u0812\u009d\3\2\2\2\u0813\u0816\5\u00e2r\2\u0814"+
		"\u0816\5\u00d0i\2\u0815\u0813\3\2\2\2\u0815\u0814\3\2\2\2\u0816\u009f"+
		"\3\2\2\2\u0817\u0818\5\u00e2r\2\u0818\u00a1\3\2\2\2\u0819\u081f\bR\1\2"+
		"\u081a\u0820\5\u00a8U\2\u081b\u0820\5\u00b0Y\2\u081c\u0820\5\u00b2Z\2"+
		"\u081d\u0820\5\u00acW\2\u081e\u0820\5\u00aaV\2\u081f\u081a\3\2\2\2\u081f"+
		"\u081b\3\2\2\2\u081f\u081c\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u081e\3\2"+
		"\2\2\u0820\u082a\3\2\2\2\u0821\u0824\5\u00b8]\2\u0822\u0824\5\u00a6T\2"+
		"\u0823\u0821\3\2\2\2\u0823\u0822\3\2\2\2\u0824\u082a\3\2\2\2\u0825\u082a"+
		"\5\u00a4S\2\u0826\u0827\t\35\2\2\u0827\u082a\5\u00a2R\7\u0828\u082a\5"+
		"\u00b4[\2\u0829\u0819\3\2\2\2\u0829\u0823\3\2\2\2\u0829\u0825\3\2\2\2"+
		"\u0829\u0826\3\2\2\2\u0829\u0828\3\2\2\2\u082a\u0836\3\2\2\2\u082b\u082c"+
		"\f\6\2\2\u082c\u082d\t\36\2\2\u082d\u0835\5\u00a2R\7\u082e\u082f\f\5\2"+
		"\2\u082f\u0830\7\u025d\2\2\u0830\u0835\5\u00a2R\6\u0831\u0832\f\4\2\2"+
		"\u0832\u0833\t\37\2\2\u0833\u0835\5\u00a2R\5\u0834\u082b\3\2\2\2\u0834"+
		"\u082e\3\2\2\2\u0834\u0831\3\2\2\2\u0835\u0838\3\2\2\2\u0836\u0834\3\2"+
		"\2\2\u0836\u0837\3\2\2\2\u0837\u00a3\3\2\2\2\u0838\u0836\3\2\2\2\u0839"+
		"\u083a\7\u0264\2\2\u083a\u083b\7\n\2\2\u083b\u083c\5\u00a2R\2\u083c\u083d"+
		"\78\2\2\u083d\u083e\5\u0080A\2\u083e\u083f\7\13\2\2\u083f\u00a5\3\2\2"+
		"\2\u0840\u0842\5\u00b4[\2\u0841\u0843\7\u016e\2\2\u0842\u0841\3\2\2\2"+
		"\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\7E\2\2\u0845\u0846"+
		"\5\u00b4[\2\u0846\u0847\7\66\2\2\u0847\u0848\5\u00b4[\2\u0848\u00a7\3"+
		"\2\2\2\u0849\u084a\5\u00b4[\2\u084a\u084b\5\u00aeX\2\u084b\u084c\5\u00b4"+
		"[\2\u084c\u0855\3\2\2\2\u084d\u084e\5\u00b4[\2\u084e\u084f\5\u00aeX\2"+
		"\u084f\u0850\t \2\2\u0850\u0851\7\n\2\2\u0851\u0852\5D#\2\u0852\u0853"+
		"\7\13\2\2\u0853\u0855\3\2\2\2\u0854\u0849\3\2\2\2\u0854\u084d\3\2\2\2"+
		"\u0855\u00a9\3\2\2\2\u0856\u0858\5\u00b4[\2\u0857\u0859\7\u016e\2\2\u0858"+
		"\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\7\u00f3"+
		"\2\2\u085b\u085c\7\n\2\2\u085c\u085d\5D#\2\u085d\u085e\7\13\2\2\u085e"+
		"\u086d\3\2\2\2\u085f\u0861\5\u00b4[\2\u0860\u0862\7\u016e\2\2\u0861\u0860"+
		"\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\7\u00f3\2"+
		"\2\u0864\u0865\7\n\2\2\u0865\u0868\5\u00a2R\2\u0866\u0867\7\4\2\2\u0867"+
		"\u0869\5\u00a2R\2\u0868\u0866\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a"+
		"\3\2\2\2\u086a\u086b\7\13\2\2\u086b\u086d\3\2\2\2\u086c\u0856\3\2\2\2"+
		"\u086c\u085f\3\2\2\2\u086d\u00ab\3\2\2\2\u086e\u0870\5\u00b4[\2\u086f"+
		"\u0871\7\u016e\2\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872"+
		"\3\2\2\2\u0872\u0873\7\u01ad\2\2\u0873\u0874\5\u00b4[\2\u0874\u00ad\3"+
		"\2\2\2\u0875\u0876\t!\2\2\u0876\u00af\3\2\2\2\u0877\u0878\5\u00b6\\\2"+
		"\u0878\u087a\7\u010d\2\2\u0879\u087b\7\u016e\2\2\u087a\u0879\3\2\2\2\u087a"+
		"\u087b\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\t\"\2\2\u087d\u00b1\3\2"+
		"\2\2\u087e\u087f\5\u00b4[\2\u087f\u0880\7\u01ec\2\2\u0880\u0881\7\u011e"+
		"\2\2\u0881\u0882\5\u00b4[\2\u0882\u088e\3\2\2\2\u0883\u0885\5\u00b4[\2"+
		"\u0884\u0886\7\u016e\2\2\u0885\u0884\3\2\2\2\u0885\u0886\3\2\2\2\u0886"+
		"\u0887\3\2\2\2\u0887\u0888\7\u011e\2\2\u0888\u088b\5\u00b6\\\2\u0889\u088a"+
		"\7\u00ba\2\2\u088a\u088c\5\u00b6\\\2\u088b\u0889\3\2\2\2\u088b\u088c\3"+
		"\2\2\2\u088c\u088e\3\2\2\2\u088d\u087e\3\2\2\2\u088d\u0883\3\2\2\2\u088e"+
		"\u00b3\3\2\2\2\u088f\u0890\b[\1\2\u0890\u0891\5\u00b6\\\2\u0891\u08a6"+
		"\3\2\2\2\u0892\u0893\f\t\2\2\u0893\u0894\7\31\2\2\u0894\u08a5\5\u00b4"+
		"[\n\u0895\u0896\f\b\2\2\u0896\u0897\t#\2\2\u0897\u08a5\5\u00b4[\t\u0898"+
		"\u0899\f\7\2\2\u0899\u089a\t$\2\2\u089a\u08a5\5\u00b4[\b\u089b\u089c\f"+
		"\6\2\2\u089c\u089d\t%\2\2\u089d\u08a5\5\u00b4[\7\u089e\u089f\f\5\2\2\u089f"+
		"\u08a0\7\"\2\2\u08a0\u08a5\5\u00b4[\6\u08a1\u08a2\f\4\2\2\u08a2\u08a3"+
		"\7#\2\2\u08a3\u08a5\5\u00b4[\5\u08a4\u0892\3\2\2\2\u08a4\u0895\3\2\2\2"+
		"\u08a4\u0898\3\2\2\2\u08a4\u089b\3\2\2\2\u08a4\u089e\3\2\2\2\u08a4\u08a1"+
		"\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7"+
		"\u00b5\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08aa\b\\\1\2\u08aa\u08dc\5\u00c0"+
		"a\2\u08ab\u08dc\5\u00ba^\2\u08ac\u08dc\5\20\t\2\u08ad\u08dc\5\16\b\2\u08ae"+
		"\u08af\5\u00d2j\2\u08af\u08b0\7$\2\2\u08b0\u08b2\3\2\2\2\u08b1\u08ae\3"+
		"\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08dc\5\u00d6l\2"+
		"\u08b4\u08dc\7%\2\2\u08b5\u08b6\7\n\2\2\u08b6\u08b9\5\u00a2R\2\u08b7\u08b8"+
		"\7\4\2\2\u08b8\u08ba\5\u00a2R\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2"+
		"\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\7\13\2\2\u08bc\u08dc\3\2\2\2\u08bd"+
		"\u08be\7\n\2\2\u08be\u08bf\5D#\2\u08bf\u08c0\7\13\2\2\u08c0\u08dc\3\2"+
		"\2\2\u08c1\u08dc\5\u00bc_\2\u08c2\u08c3\7G\2\2\u08c3\u08dc\5\u00b6\\\2"+
		"\u08c4\u08c5\7\17\2\2\u08c5\u08dc\5\u00b6\\\7\u08c6\u08c7\t&\2\2\u08c7"+
		"\u08dc\5\u00b6\\\6\u08c8\u08c9\7\u01cb\2\2\u08c9\u08ca\7\n\2\2\u08ca\u08cd"+
		"\5\u00a2R\2\u08cb\u08cc\7\4\2\2\u08cc\u08ce\5\u00a2R\2\u08cd\u08cb\3\2"+
		"\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\7\13\2\2\u08d0"+
		"\u08dc\3\2\2\2\u08d1\u08d2\7\u00c0\2\2\u08d2\u08d3\7\n\2\2\u08d3\u08d4"+
		"\5D#\2\u08d4\u08d5\7\13\2\2\u08d5\u08dc\3\2\2\2\u08d6\u08d7\7\r\2\2\u08d7"+
		"\u08d8\5\u00e2r\2\u08d8\u08d9\5\u00a2R\2\u08d9\u08da\7\16\2\2\u08da\u08dc"+
		"\3\2\2\2\u08db\u08a9\3\2\2\2\u08db\u08ab\3\2\2\2\u08db\u08ac\3\2\2\2\u08db"+
		"\u08ad\3\2\2\2\u08db\u08b1\3\2\2\2\u08db\u08b4\3\2\2\2\u08db\u08b5\3\2"+
		"\2\2\u08db\u08bd\3\2\2\2\u08db\u08c1\3\2\2\2\u08db\u08c2\3\2\2\2\u08db"+
		"\u08c4\3\2\2\2\u08db\u08c6\3\2\2\2\u08db\u08c8\3\2\2\2\u08db\u08d1\3\2"+
		"\2\2\u08db\u08d6\3\2\2\2\u08dc\u08e2\3\2\2\2\u08dd\u08de\f\b\2\2\u08de"+
		"\u08df\7f\2\2\u08df\u08e1\5\u0098M\2\u08e0\u08dd\3\2\2\2\u08e1\u08e4\3"+
		"\2\2\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u00b7\3\2\2\2\u08e4"+
		"\u08e2\3\2\2\2\u08e5\u08e6\7V\2\2\u08e6\u08e7\5\u00a2R\2\u08e7\u08e8\7"+
		"\u0253\2\2\u08e8\u08e9\5\u00c0a\2\u08e9\u08ea\7\u021f\2\2\u08ea\u08f2"+
		"\5\u00a2R\2\u08eb\u08ec\7\u0253\2\2\u08ec\u08ed\5\u00c0a\2\u08ed\u08ee"+
		"\7\u021f\2\2\u08ee\u08ef\5\u00a2R\2\u08ef\u08f1\3\2\2\2\u08f0\u08eb\3"+
		"\2\2\2\u08f1\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3"+
		"\u08f7\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08f6\7\u00af\2\2\u08f6\u08f8"+
		"\5\u00a2R\2\u08f7\u08f5\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\3\2\2"+
		"\2\u08f9\u08fa\7\u00b3\2\2\u08fa\u0911\3\2\2\2\u08fb\u08fc\7V\2\2\u08fc"+
		"\u08fd\7\u0253\2\2\u08fd\u08fe\5\u00a2R\2\u08fe\u08ff\7\u021f\2\2\u08ff"+
		"\u0907\5\u00a2R\2\u0900\u0901\7\u0253\2\2\u0901\u0902\5\u00a2R\2\u0902"+
		"\u0903\7\u021f\2\2\u0903\u0904\5\u00a2R\2\u0904\u0906\3\2\2\2\u0905\u0900"+
		"\3\2\2\2\u0906\u0909\3\2\2\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908"+
		"\u090c\3\2\2\2\u0909\u0907\3\2\2\2\u090a\u090b\7\u00af\2\2\u090b\u090d"+
		"\5\u00a2R\2";
	private static final String _serializedATNSegment1 =
		"\u090c\u090a\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f"+
		"\7\u00b3\2\2\u090f\u0911\3\2\2\2\u0910\u08e5\3\2\2\2\u0910\u08fb\3\2\2"+
		"\2\u0911\u00b9\3\2\2\2\u0912\u0913\5\u009eP\2\u0913\u0914\7\n\2\2\u0914"+
		"\u0915\7\13\2\2\u0915\u0923\3\2\2\2\u0916\u0917\5\u009eP\2\u0917\u0918"+
		"\7\n\2\2\u0918\u091d\5\u00a2R\2\u0919\u091a\7\4\2\2\u091a\u091c\5\u00a2"+
		"R\2\u091b\u0919\3\2\2\2\u091c\u091f\3\2\2\2\u091d\u091b\3\2\2\2\u091d"+
		"\u091e\3\2\2\2\u091e\u0920\3\2\2\2\u091f\u091d\3\2\2\2\u0920\u0921\7\13"+
		"\2\2\u0921\u0923\3\2\2\2\u0922\u0912\3\2\2\2\u0922\u0916\3\2\2\2\u0923"+
		"\u00bb\3\2\2\2\u0924\u0925\7\u0107\2\2\u0925\u0926\5\u00a2R\2\u0926\u0927"+
		"\5\u00be`\2\u0927\u00bd\3\2\2\2\u0928\u0929\t\'\2\2\u0929\u00bf\3\2\2"+
		"\2\u092a\u0932\5\u00c2b\2\u092b\u0932\5\u00c4c\2\u092c\u0932\5\u00ccg"+
		"\2\u092d\u0932\7\u0171\2\2\u092e\u0932\t(\2\2\u092f\u0932\5\u00c8e\2\u0930"+
		"\u0932\5\u00c6d\2\u0931\u092a\3\2\2\2\u0931\u092b\3\2\2\2\u0931\u092c"+
		"\3\2\2\2\u0931\u092d\3\2\2\2\u0931\u092e\3\2\2\2\u0931\u092f\3\2\2\2\u0931"+
		"\u0930\3\2\2\2\u0932\u00c1\3\2\2\2\u0933\u0934\t)\2\2\u0934\u00c3\3\2"+
		"\2\2\u0935\u0941\7\u026e\2\2\u0936\u0938\5\u00caf\2\u0937\u0936\3\2\2"+
		"\2\u0937\u0938\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093c\7\u026f\2\2\u093a"+
		"\u093b\7f\2\2\u093b\u093d\5\u0098M\2\u093c\u093a\3\2\2\2\u093c\u093d\3"+
		"\2\2\2\u093d\u0941\3\2\2\2\u093e\u093f\7\'\2\2\u093f\u0941\7\u026f\2\2"+
		"\u0940\u0935\3\2\2\2\u0940\u0937\3\2\2\2\u0940\u093e\3\2\2\2\u0941\u00c5"+
		"\3\2\2\2\u0942\u0944\5\u00caf\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2"+
		"\2\u0944\u0945\3\2\2\2\u0945\u0946\7\u026a\2\2\u0946\u0947\7f\2\2\u0947"+
		"\u0948\5\u0098M\2\u0948\u00c7\3\2\2\2\u0949\u094a\5\u00caf\2\u094a\u094b"+
		"\7\u0269\2\2\u094b\u094c\7f\2\2\u094c\u094d\5\u0098M\2\u094d\u00c9\3\2"+
		"\2\2\u094e\u094f\7\u0271\2\2\u094f\u00cb\3\2\2\2\u0950\u0951\t*\2\2\u0951"+
		"\u095b\5\u00c4c\2\u0952\u0953\7\r\2\2\u0953\u0954\5\u00e2r\2\u0954\u0955"+
		"\5\u00c4c\2\u0955\u0956\7\16\2\2\u0956\u095b\3\2\2\2\u0957\u095b\7\u0082"+
		"\2\2\u0958\u095b\7\u0083\2\2\u0959\u095b\7\u0084\2\2\u095a\u0950\3\2\2"+
		"\2\u095a\u0952\3\2\2\2\u095a\u0957\3\2\2\2\u095a\u0958\3\2\2\2\u095a\u0959"+
		"\3\2\2\2\u095b\u00cd\3\2\2\2\u095c\u095f\5\u00e2r\2\u095d\u095f\5\u00d0"+
		"i\2\u095e\u095c\3\2\2\2\u095e\u095d\3\2\2\2\u095f\u00cf\3\2\2\2\u0960"+
		"\u0961\t+\2\2\u0961\u00d1\3\2\2\2\u0962\u0963\5\u00d4k\2\u0963\u0964\7"+
		"$\2\2\u0964\u0966\3\2\2\2\u0965\u0962\3\2\2\2\u0965\u0966\3\2\2\2\u0966"+
		"\u0969\3\2\2\2\u0967\u096a\5\u00e2r\2\u0968\u096a\5\u00d0i\2\u0969\u0967"+
		"\3\2\2\2\u0969\u0968\3\2\2\2\u096a\u00d3\3\2\2\2\u096b\u096c\5\u00e2r"+
		"\2\u096c\u00d5\3\2\2\2\u096d\u0971\5\u00e2r\2\u096e\u0971\5\u00d0i\2\u096f"+
		"\u0971\7\f\2\2\u0970\u096d\3\2\2\2\u0970\u096e\3\2\2\2\u0970\u096f\3\2"+
		"\2\2\u0971\u00d7\3\2\2\2\u0972\u0973\5\u00e2r\2\u0973\u00d9\3\2\2\2\u0974"+
		"\u0975\5\u00e2r\2\u0975\u00db\3\2\2\2\u0976\u0977\7\u026d\2\2\u0977\u00dd"+
		"\3\2\2\2\u0978\u0979\7\u026d\2\2\u0979\u00df\3\2\2\2\u097a\u097b\7\u026d"+
		"\2\2\u097b\u00e1\3\2\2\2\u097c\u097d\t,\2\2\u097d\u00e3\3\2\2\2\u016f"+
		"\u00e6\u00e8\u00f3\u00fa\u00ff\u0105\u0114\u011c\u0122\u0136\u0142\u0145"+
		"\u014a\u0154\u0159\u015d\u015f\u016d\u0174\u0178\u017d\u0184\u0188\u018e"+
		"\u0195\u0199\u019d\u01a3\u01ac\u01b1\u01b4\u01b8\u01be\u01c7\u01cc\u01cf"+
		"\u01d2\u01d5\u01db\u01e1\u01eb\u01ed\u01f4\u01fb\u01fd\u0205\u020a\u020d"+
		"\u0215\u021b\u022b\u0237\u0239\u023c\u0244\u024a\u0250\u025a\u025f\u0266"+
		"\u0268\u026d\u0276\u027b\u027e\u0282\u0287\u028d\u0293\u0298\u029d\u02a2"+
		"\u02a7\u02aa\u02b1\u02c2\u02c6\u02ca\u02cf\u02d3\u02d9\u02de\u02e4\u02e6"+
		"\u02eb\u02f3\u02f9\u02fd\u0301\u0304\u0307\u030d\u0313\u031a\u031e\u0323"+
		"\u032b\u0332\u0336\u033a\u033c\u0340\u0343\u0346\u034d\u0354\u0364\u036a"+
		"\u036f\u0373\u037a\u037d\u0385\u038c\u0390\u0395\u039f\u03a7\u03aa\u03b0"+
		"\u03b8\u03bd\u03c1\u03c3\u03cb\u03d3\u03d5\u03da\u03df\u03e3\u03eb\u03ee"+
		"\u03f4\u03f7\u03fb\u0402\u0409\u040b\u040f\u0416\u041f\u0425\u042c\u042f"+
		"\u0435\u0438\u043c\u0441\u0443\u0447\u044a\u0454\u045b\u0466\u046a\u0471"+
		"\u047a\u047f\u0483\u0486\u048e\u0497\u049a\u049d\u04a0\u04a4\u04ac\u04b4"+
		"\u04bb\u04c2\u04c6\u04cb\u04d7\u04d9\u04dd\u04e6\u04ed\u04f8\u04fa\u04fe"+
		"\u0509\u050b\u050f\u051a\u051c\u0520\u0523\u052a\u0534\u053d\u0540\u0545"+
		"\u054d\u0554\u0559\u055c\u0564\u056b\u056f\u0572\u0576\u0579\u057c\u0584"+
		"\u058b\u0590\u0593\u059b\u05a2\u05a7\u05aa\u05b2\u05b9\u05bd\u05c0\u05c5"+
		"\u05cd\u05d8\u05de\u05e2\u05ec\u05f0\u05f6\u05f9\u060a\u0611\u061a\u061d"+
		"\u0620\u0627\u062a\u062d\u0634\u0637\u063a\u0641\u0644\u0647\u064e\u0651"+
		"\u0654\u065b\u065e\u0661\u066a\u066d\u0670\u0679\u067c\u067f\u0688\u068b"+
		"\u068e\u0697\u069a\u069d\u06a6\u06a9\u06ac\u06b8\u06bb\u06c0\u06c7\u06ca"+
		"\u06cf\u06d6\u06dd\u06e5\u06ea\u06ee\u06f3\u06f7\u06fc\u0700\u0705\u070c"+
		"\u0712\u0719\u071f\u0721\u0728\u072b\u0732\u073b\u0745\u074c\u0757\u0763"+
		"\u0767\u076c\u0771\u0776\u077b\u077f\u0784\u0787\u078e\u0792\u0797\u079c"+
		"\u07a2\u07a7\u07ad\u07b2\u07b7\u07bc\u07c1\u07c6\u07ca\u07ce\u07d3\u07d8"+
		"\u07dc\u07e0\u07e4\u07e8\u07ef\u07f3\u07fb\u0800\u0804\u0808\u080d\u0811"+
		"\u0815\u081f\u0823\u0829\u0834\u0836\u0842\u0854\u0858\u0861\u0868\u086c"+
		"\u0870\u087a\u0885\u088b\u088d\u08a4\u08a6\u08b1\u08b9\u08cd\u08db\u08e2"+
		"\u08f2\u08f7\u0907\u090c\u0910\u091d\u0922\u0931\u0937\u093c\u0940\u0943"+
		"\u095a\u095e\u0965\u0969\u0970";
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