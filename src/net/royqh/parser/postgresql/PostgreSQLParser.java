package net.royqh.parser.postgresql;// Generated from E:/Workspaces/Tools/EasyPersist/grammar\PostgreSQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostgreSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, K_A=24, K_ABORT=25, 
		K_ABS=26, K_ABSENT=27, K_ABSOLUTE=28, K_ACCESS=29, K_ACCORDING=30, K_ACTION=31, 
		K_ADA=32, K_ADD=33, K_ADMIN=34, K_AFTER=35, K_AGGREGATE=36, K_ALL=37, 
		K_ALLOCATE=38, K_ALSO=39, K_ALTER=40, K_ALWAYS=41, K_ANALYSE=42, K_ANALYZE=43, 
		K_AND=44, K_ANY=45, K_ARE=46, K_ARRAY=47, K_ARRAY_AGG=48, K_ARRAY_MAX_CARDINALITY=49, 
		K_AS=50, K_ASC=51, K_ASENSITIVE=52, K_ASSERTION=53, K_ASSIGNMENT=54, K_ASYMMETRIC=55, 
		K_AT=56, K_ATOMIC=57, K_ATTRIBUTE=58, K_ATTRIBUTES=59, K_AUTHORIZATION=60, 
		K_AVG=61, K_BACKWARD=62, K_BASE64=63, K_BEFORE=64, K_BEGIN=65, K_BEGIN_FRAME=66, 
		K_BEGIN_PARTITION=67, K_BERNOULLI=68, K_BETWEEN=69, K_BIGINT=70, K_BINARY=71, 
		K_BIT=72, K_BIT_LENGTH=73, K_BLOB=74, K_BLOCKED=75, K_BOM=76, K_BOOLEAN=77, 
		K_BOTH=78, K_BREADTH=79, K_BY=80, K_C=81, K_CACHE=82, K_CALL=83, K_CALLED=84, 
		K_CARDINALITY=85, K_CASCADE=86, K_CASCADED=87, K_CASE=88, K_CAST=89, K_CATALOG=90, 
		K_CATALOG_NAME=91, K_CEIL=92, K_CEILING=93, K_CHAIN=94, K_CHAR=95, K_CHARACTER=96, 
		K_CHARACTERISTICS=97, K_CHARACTERS=98, K_CHARACTER_LENGTH=99, K_CHARACTER_SET_CATALOG=100, 
		K_CHARACTER_SET_NAME=101, K_CHARACTER_SET_SCHEMA=102, K_CHAR_LENGTH=103, 
		K_CHECK=104, K_CHECKPOINT=105, K_CLASS=106, K_CLASS_ORIGIN=107, K_CLOB=108, 
		K_CLOSE=109, K_CLUSTER=110, K_COALESCE=111, K_COBOL=112, K_COLLATE=113, 
		K_COLLATION=114, K_COLLATION_CATALOG=115, K_COLLATION_NAME=116, K_COLLATION_SCHEMA=117, 
		K_COLLECT=118, K_COLUMN=119, K_COLUMNS=120, K_COLUMN_NAME=121, K_COMMAND_FUNCTION=122, 
		K_COMMAND_FUNCTION_CODE=123, K_COMMENT=124, K_COMMENTS=125, K_COMMIT=126, 
		K_COMMITTED=127, K_CONCURRENTLY=128, K_CONDITION=129, K_CONDITION_NUMBER=130, 
		K_CONFIGURATION=131, K_CONFLICT=132, K_CONNECT=133, K_CONNECTION=134, 
		K_CONNECTION_NAME=135, K_CONSTRAINT=136, K_CONSTRAINTS=137, K_CONSTRAINT_CATALOG=138, 
		K_CONSTRAINT_NAME=139, K_CONSTRAINT_SCHEMA=140, K_CONSTRUCTOR=141, K_CONTAINS=142, 
		K_CONTENT=143, K_CONTINUE=144, K_CONTROL=145, K_CONVERSION=146, K_CONVERT=147, 
		K_COPY=148, K_CORR=149, K_CORRESPONDING=150, K_COST=151, K_COUNT=152, 
		K_COVAR_POP=153, K_COVAR_SAMP=154, K_CREATE=155, K_CROSS=156, K_CSV=157, 
		K_CUBE=158, K_CUME_DIST=159, K_CURRENT=160, K_CURRENT_CATALOG=161, K_CURRENT_DATE=162, 
		K_CURRENT_DEFAULT_TRANSFORM_GROUP=163, K_CURRENT_PATH=164, K_CURRENT_ROLE=165, 
		K_CURRENT_ROW=166, K_CURRENT_SCHEMA=167, K_CURRENT_TIME=168, K_CURRENT_TIMESTAMP=169, 
		K_CURRENT_TRANSFORM_GROUP_FOR_TYPE=170, K_CURRENT_USER=171, K_CURSOR=172, 
		K_CURSOR_NAME=173, K_CYCLE=174, K_DATA=175, K_DATABASE=176, K_DATALINK=177, 
		K_DATE=178, K_DATETIME_INTERVAL_CODE=179, K_DATETIME_INTERVAL_PRECISION=180, 
		K_DAY=181, K_DB=182, K_DEALLOCATE=183, K_DEC=184, K_DECIMAL=185, K_DECLARE=186, 
		K_DEFAULT=187, K_DEFAULTS=188, K_DEFERRABLE=189, K_DEFERRED=190, K_DEFINED=191, 
		K_DEFINER=192, K_DEGREE=193, K_DELETE=194, K_DELIMITER=195, K_DELIMITERS=196, 
		K_DENSE_RANK=197, K_DEPENDS=198, K_DEPTH=199, K_DEREF=200, K_DERIVED=201, 
		K_DESC=202, K_DESCRIBE=203, K_DESCRIPTOR=204, K_DETERMINISTIC=205, K_DIAGNOSTICS=206, 
		K_DICTIONARY=207, K_DISABLE=208, K_DISCARD=209, K_DISCONNECT=210, K_DISPATCH=211, 
		K_DISTINCT=212, K_DLNEWCOPY=213, K_DLPREVIOUSCOPY=214, K_DLURLCOMPLETE=215, 
		K_DLURLCOMPLETEONLY=216, K_DLURLCOMPLETEWRITE=217, K_DLURLPATH=218, K_DLURLPATHONLY=219, 
		K_DLURLPATHWRITE=220, K_DLURLSCHEME=221, K_DLURLSERVER=222, K_DLVALUE=223, 
		K_DO=224, K_DOCUMENT=225, K_DOMAIN=226, K_DOUBLE=227, K_DROP=228, K_DYNAMIC=229, 
		K_DYNAMIC_FUNCTION=230, K_DYNAMIC_FUNCTION_CODE=231, K_EACH=232, K_ELEMENT=233, 
		K_ELSE=234, K_EMPTY=235, K_ENABLE=236, K_ENCODING=237, K_ENCRYPTED=238, 
		K_END=239, K_END_EXEC=240, K_END_FRAME=241, K_END_PARTITION=242, K_ENFORCED=243, 
		K_ENUM=244, K_EQUALS=245, K_ESCAPE=246, K_EVENT=247, K_EVERY=248, K_EXCEPT=249, 
		K_EXCEPTION=250, K_EXCLUDE=251, K_EXCLUDING=252, K_EXCLUSIVE=253, K_EXEC=254, 
		K_EXECUTE=255, K_EXISTS=256, K_EXP=257, K_EXPLAIN=258, K_EXPRESSION=259, 
		K_EXTENSION=260, K_EXTERNAL=261, K_EXTRACT=262, K_FALSE=263, K_FAMILY=264, 
		K_FETCH=265, K_FILE=266, K_FILTER=267, K_FINAL=268, K_FIRST=269, K_FIRST_VALUE=270, 
		K_FLAG=271, K_FLOAT=272, K_FLOOR=273, K_FOLLOWING=274, K_FOR=275, K_FORCE=276, 
		K_FOREIGN=277, K_FORTRAN=278, K_FORWARD=279, K_FOUND=280, K_FRAME_ROW=281, 
		K_FREE=282, K_FREEZE=283, K_FROM=284, K_FS=285, K_FULL=286, K_FUNCTION=287, 
		K_FUNCTIONS=288, K_FUSION=289, K_G=290, K_GENERAL=291, K_GENERATED=292, 
		K_GET=293, K_GLOBAL=294, K_GO=295, K_GOTO=296, K_GRANT=297, K_GRANTED=298, 
		K_GREATEST=299, K_GROUP=300, K_GROUPING=301, K_GROUPS=302, K_HANDLER=303, 
		K_HAVING=304, K_HEADER=305, K_HEX=306, K_HIERARCHY=307, K_HOLD=308, K_HOUR=309, 
		K_ID=310, K_IDENTITY=311, K_IF=312, K_IGNORE=313, K_ILIKE=314, K_IMMEDIATE=315, 
		K_IMMEDIATELY=316, K_IMMUTABLE=317, K_IMPLEMENTATION=318, K_IMPLICIT=319, 
		K_IMPORT=320, K_IN=321, K_INCLUDING=322, K_INCREMENT=323, K_INDENT=324, 
		K_INDEX=325, K_INDEXES=326, K_INDICATOR=327, K_INHERIT=328, K_INHERITS=329, 
		K_INITIALLY=330, K_INLINE=331, K_INNER=332, K_INOUT=333, K_INPUT=334, 
		K_INSENSITIVE=335, K_INSERT=336, K_INSTANCE=337, K_INSTANTIABLE=338, K_INSTEAD=339, 
		K_INT=340, K_INTEGER=341, K_INTEGRITY=342, K_INTERSECT=343, K_INTERSECTION=344, 
		K_INTERVAL=345, K_INTO=346, K_INVOKER=347, K_IS=348, K_ISNULL=349, K_ISOLATION=350, 
		K_JOIN=351, K_K=352, K_KEY=353, K_KEY_MEMBER=354, K_KEY_TYPE=355, K_LABEL=356, 
		K_LAG=357, K_LANGUAGE=358, K_LARGE=359, K_LAST=360, K_LAST_VALUE=361, 
		K_LATERAL=362, K_LEAD=363, K_LEADING=364, K_LEAKPROOF=365, K_LEAST=366, 
		K_LEFT=367, K_LENGTH=368, K_LEVEL=369, K_LIBRARY=370, K_LIKE=371, K_LIKE_REGEX=372, 
		K_LIMIT=373, K_LINK=374, K_LISTEN=375, K_LN=376, K_LOAD=377, K_LOCAL=378, 
		K_LOCALTIME=379, K_LOCALTIMESTAMP=380, K_LOCATION=381, K_LOCATOR=382, 
		K_LOCK=383, K_LOCKED=384, K_LOGGED=385, K_LOWER=386, K_M=387, K_MAP=388, 
		K_MAPPING=389, K_MATCH=390, K_MATCHED=391, K_MATERIALIZED=392, K_MAX=393, 
		K_MAXVALUE=394, K_MAX_CARDINALITY=395, K_MEMBER=396, K_MERGE=397, K_MESSAGE_LENGTH=398, 
		K_MESSAGE_OCTET_LENGTH=399, K_MESSAGE_TEXT=400, K_METHOD=401, K_MIN=402, 
		K_MINUTE=403, K_MINVALUE=404, K_MOD=405, K_MODE=406, K_MODIFIES=407, K_MODULE=408, 
		K_MONTH=409, K_MORE=410, K_MOVE=411, K_MULTISET=412, K_MUMPS=413, K_NAME=414, 
		K_NAMES=415, K_NAMESPACE=416, K_NATIONAL=417, K_NATURAL=418, K_NCHAR=419, 
		K_NCLOB=420, K_NESTING=421, K_NEW=422, K_NEXT=423, K_NFC=424, K_NFD=425, 
		K_NFKC=426, K_NFKD=427, K_NIL=428, K_NO=429, K_NONE=430, K_NORMALIZE=431, 
		K_NORMALIZED=432, K_NOT=433, K_NOTHING=434, K_NOTIFY=435, K_NOTNULL=436, 
		K_NOWAIT=437, K_NTH_VALUE=438, K_NTILE=439, K_NULL=440, K_NULLABLE=441, 
		K_NULLIF=442, K_NULLS=443, K_NUMBER=444, K_NUMERIC=445, K_OBJECT=446, 
		K_OCCURRENCES_REGEX=447, K_OCTETS=448, K_OCTET_LENGTH=449, K_OF=450, K_OFF=451, 
		K_OFFSET=452, K_OIDS=453, K_OLD=454, K_ON=455, K_ONLY=456, K_OPEN=457, 
		K_OPERATOR=458, K_OPTION=459, K_OPTIONS=460, K_OR=461, K_ORDER=462, K_ORDERING=463, 
		K_ORDINALITY=464, K_OTHERS=465, K_OUT=466, K_OUTER=467, K_OUTPUT=468, 
		K_OVER=469, K_OVERLAPS=470, K_OVERLAY=471, K_OVERRIDING=472, K_OWNED=473, 
		K_OWNER=474, K_P=475, K_PAD=476, K_PARALLEL=477, K_PARAMETER=478, K_PARAMETER_MODE=479, 
		K_PARAMETER_NAME=480, K_PARAMETER_ORDINAL_POSITION=481, K_PARAMETER_SPECIFIC_CATALOG=482, 
		K_PARAMETER_SPECIFIC_NAME=483, K_PARAMETER_SPECIFIC_SCHEMA=484, K_PARSER=485, 
		K_PARTIAL=486, K_PARTITION=487, K_PASCAL=488, K_PASSING=489, K_PASSTHROUGH=490, 
		K_PASSWORD=491, K_PATH=492, K_PERCENT=493, K_PERCENTILE_CONT=494, K_PERCENTILE_DISC=495, 
		K_PERCENT_RANK=496, K_PERIOD=497, K_PERMISSION=498, K_PLACING=499, K_PLANS=500, 
		K_PLI=501, K_POLICY=502, K_PORTION=503, K_POSITION=504, K_POSITION_REGEX=505, 
		K_POWER=506, K_PRECEDES=507, K_PRECEDING=508, K_PRECISION=509, K_PREPARE=510, 
		K_PREPARED=511, K_PRESERVE=512, K_PRIMARY=513, K_PRIOR=514, K_PRIVILEGES=515, 
		K_PROCEDURAL=516, K_PROCEDURE=517, K_PROGRAM=518, K_PUBLIC=519, K_QUOTE=520, 
		K_RANGE=521, K_RANK=522, K_READ=523, K_READS=524, K_REAL=525, K_REASSIGN=526, 
		K_RECHECK=527, K_RECOVERY=528, K_RECURSIVE=529, K_REF=530, K_REFERENCES=531, 
		K_REFERENCING=532, K_REFRESH=533, K_REGR_AVGX=534, K_REGR_AVGY=535, K_REGR_COUNT=536, 
		K_REGR_INTERCEPT=537, K_REGR_R2=538, K_REGR_SLOPE=539, K_REGR_SXX=540, 
		K_REGR_SXY=541, K_REGR_SYY=542, K_REINDEX=543, K_RELATIVE=544, K_RELEASE=545, 
		K_RENAME=546, K_REPEATABLE=547, K_REPLACE=548, K_REPLICA=549, K_REQUIRING=550, 
		K_RESET=551, K_RESPECT=552, K_RESTART=553, K_RESTORE=554, K_RESTRICT=555, 
		K_RESULT=556, K_RETURN=557, K_RETURNED_CARDINALITY=558, K_RETURNED_LENGTH=559, 
		K_RETURNED_OCTET_LENGTH=560, K_RETURNED_SQLSTATE=561, K_RETURNING=562, 
		K_RETURNS=563, K_REVOKE=564, K_RIGHT=565, K_ROLE=566, K_ROLLBACK=567, 
		K_ROLLUP=568, K_ROUTINE=569, K_ROUTINE_CATALOG=570, K_ROUTINE_NAME=571, 
		K_ROUTINE_SCHEMA=572, K_ROW=573, K_ROWS=574, K_ROW_COUNT=575, K_ROW_NUMBER=576, 
		K_RULE=577, K_SAVEPOINT=578, K_SCALE=579, K_SCHEMA=580, K_SCHEMA_NAME=581, 
		K_SCOPE=582, K_SCOPE_CATALOG=583, K_SCOPE_NAME=584, K_SCOPE_SCHEMA=585, 
		K_SCROLL=586, K_SEARCH=587, K_SECOND=588, K_SECTION=589, K_SECURITY=590, 
		K_SELECT=591, K_SELECTIVE=592, K_SELF=593, K_SENSITIVE=594, K_SEQUENCE=595, 
		K_SEQUENCES=596, K_SERIALIZABLE=597, K_SERVER=598, K_SERVER_NAME=599, 
		K_SESSION=600, K_SESSION_USER=601, K_SET=602, K_SETOF=603, K_SETS=604, 
		K_SHARE=605, K_SHOW=606, K_SIMILAR=607, K_SIMPLE=608, K_SIZE=609, K_SKIP=610, 
		K_SMALLINT=611, K_SNAPSHOT=612, K_SOME=613, K_SOURCE=614, K_SPACE=615, 
		K_SPECIFIC=616, K_SPECIFICTYPE=617, K_SPECIFIC_NAME=618, K_SQL=619, K_SQLCODE=620, 
		K_SQLERROR=621, K_SQLEXCEPTION=622, K_SQLSTATE=623, K_SQLWARNING=624, 
		K_SQRT=625, K_STABLE=626, K_STANDALONE=627, K_START=628, K_STATE=629, 
		K_STATEMENT=630, K_STATIC=631, K_STATISTICS=632, K_STDDEV_POP=633, K_STDDEV_SAMP=634, 
		K_STDIN=635, K_STDOUT=636, K_STORAGE=637, K_STRICT=638, K_STRIP=639, K_STRUCTURE=640, 
		K_STYLE=641, K_SUBCLASS_ORIGIN=642, K_SUBMULTISET=643, K_SUBSTRING=644, 
		K_SUBSTRING_REGEX=645, K_SUCCEEDS=646, K_SUM=647, K_SYMMETRIC=648, K_SYSID=649, 
		K_SYSTEM=650, K_SYSTEM_TIME=651, K_SYSTEM_USER=652, K_T=653, K_TABLE=654, 
		K_TABLES=655, K_TABLESAMPLE=656, K_TABLESPACE=657, K_TABLE_NAME=658, K_TEMP=659, 
		K_TEMPLATE=660, K_TEMPORARY=661, K_TEXT=662, K_THEN=663, K_TIES=664, K_TIME=665, 
		K_TIMESTAMP=666, K_TIMEZONE_HOUR=667, K_TIMEZONE_MINUTE=668, K_TO=669, 
		K_TOKEN=670, K_TOP_LEVEL_COUNT=671, K_TRAILING=672, K_TRANSACTION=673, 
		K_TRANSACTIONS_COMMITTED=674, K_TRANSACTIONS_ROLLED_BACK=675, K_TRANSACTION_ACTIVE=676, 
		K_TRANSFORM=677, K_TRANSFORMS=678, K_TRANSLATE=679, K_TRANSLATE_REGEX=680, 
		K_TRANSLATION=681, K_TREAT=682, K_TRIGGER=683, K_TRIGGER_CATALOG=684, 
		K_TRIGGER_NAME=685, K_TRIGGER_SCHEMA=686, K_TRIM=687, K_TRIM_ARRAY=688, 
		K_TRUE=689, K_TRUNCATE=690, K_TRUSTED=691, K_TYPE=692, K_TYPES=693, K_UESCAPE=694, 
		K_UNBOUNDED=695, K_UNCOMMITTED=696, K_UNDER=697, K_UNENCRYPTED=698, K_UNION=699, 
		K_UNIQUE=700, K_UNKNOWN=701, K_UNLINK=702, K_UNLISTEN=703, K_UNLOGGED=704, 
		K_UNNAMED=705, K_UNNEST=706, K_UNTIL=707, K_UNTYPED=708, K_UPDATE=709, 
		K_UPPER=710, K_URI=711, K_USAGE=712, K_USER=713, K_USER_DEFINED_TYPE_CATALOG=714, 
		K_USER_DEFINED_TYPE_CODE=715, K_USER_DEFINED_TYPE_NAME=716, K_USER_DEFINED_TYPE_SCHEMA=717, 
		K_USING=718, K_VACUUM=719, K_VALID=720, K_VALIDATE=721, K_VALIDATOR=722, 
		K_VALUE=723, K_VALUES=724, K_VALUE_OF=725, K_VARBINARY=726, K_VARCHAR=727, 
		K_VARIADIC=728, K_VARYING=729, K_VAR_POP=730, K_VAR_SAMP=731, K_VERBOSE=732, 
		K_VERSION=733, K_VERSIONING=734, K_VIEW=735, K_VIEWS=736, K_VOLATILE=737, 
		K_WHEN=738, K_WHENEVER=739, K_WHERE=740, K_WHITESPACE=741, K_WIDTH_BUCKET=742, 
		K_WINDOW=743, K_WITH=744, K_WITHIN=745, K_WITHOUT=746, K_WORK=747, K_WRAPPER=748, 
		K_WRITE=749, K_XML=750, K_XMLAGG=751, K_XMLATTRIBUTES=752, K_XMLBINARY=753, 
		K_XMLCAST=754, K_XMLCOMMENT=755, K_XMLCONCAT=756, K_XMLDECLARATION=757, 
		K_XMLDOCUMENT=758, K_XMLELEMENT=759, K_XMLEXISTS=760, K_XMLFOREST=761, 
		K_XMLITERATE=762, K_XMLNAMESPACES=763, K_XMLPARSE=764, K_XMLPI=765, K_XMLQUERY=766, 
		K_XMLROOT=767, K_XMLSCHEMA=768, K_XMLSERIALIZE=769, K_XMLTABLE=770, K_XMLTEXT=771, 
		K_XMLVALIDATE=772, K_YEAR=773, K_YES=774, K_ZONE=775, K_SERIAL=776, K_BIGSERIAL=777, 
		K_SMALLSERIAL=778, HEX_VALUE=779, BIT_VALUE=780, SCIENTIFIC_VALUE=781, 
		FLOAT_VALUE=782, INTEGER_VALUE=783, QUOTED_STRING=784, UNICODE_ESCAPED_STRING=785, 
		QUOTED_IDENTIFIER=786, UNICODE_ESCAPED_IDENTIFIER=787, UNDERLINE_STARTED_IDENTIFIER=788, 
		UNQUOTED_IDENTIFIER=789, SINGLE_LINE_COMMENT=790, MULTILINE_COMMENT=791, 
		SPACES=792, UNEXPECTED_CHAR=793, OPERATOR=794;
	public static final int
		RULE_prog = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_var_name = 4, RULE_create_index_stmt = 5, RULE_index_method = 6, 
		RULE_index_item = 7, RULE_opClass_name = 8, RULE_storage_param = 9, RULE_param_name = 10, 
		RULE_drop_index_stmt = 11, RULE_drop_table_stmt = 12, RULE_drop_view_stmt = 13, 
		RULE_create_table_stmt = 14, RULE_query = 15, RULE_create_of_definition = 16, 
		RULE_type_name = 17, RULE_create_with_clause = 18, RULE_parent_table = 19, 
		RULE_tablespace_name = 20, RULE_value_list = 21, RULE_literal_value_list = 22, 
		RULE_create_view_stmt = 23, RULE_delete_stmt = 24, RULE_with_query = 25, 
		RULE_with_query_name = 26, RULE_cursor_name = 27, RULE_output_name = 28, 
		RULE_insert_stmt = 29, RULE_insert_value_list = 30, RULE_conflict_target = 31, 
		RULE_conflict_action = 32, RULE_conflict_def_item = 33, RULE_constraint_name = 34, 
		RULE_update_stmt = 35, RULE_column_update_expr = 36, RULE_select_stmt = 37, 
		RULE_locking_clause = 38, RULE_start = 39, RULE_count = 40, RULE_where_condition = 41, 
		RULE_having_condition = 42, RULE_grouping_element = 43, RULE_grouping_base_element = 44, 
		RULE_select_expr = 45, RULE_from_item_list = 46, RULE_from_item = 47, 
		RULE_join_type = 48, RULE_join_condition = 49, RULE_function_element = 50, 
		RULE_alias_clause = 51, RULE_column_alias_name = 52, RULE_sampling_method_name = 53, 
		RULE_sampling_method_argument = 54, RULE_seed = 55, RULE_column_list = 56, 
		RULE_view_name = 57, RULE_create_definition = 58, RULE_column_constraint = 59, 
		RULE_deferrable_option = 60, RULE_table_contraint = 61, RULE_like_option = 62, 
		RULE_exclude_expr = 63, RULE_exclude_item = 64, RULE_check_expr = 65, 
		RULE_default_expr = 66, RULE_predict = 67, RULE_reftable = 68, RULE_refColumn = 69, 
		RULE_index_parameters = 70, RULE_source_table = 71, RULE_on_delete_action = 72, 
		RULE_on_update_action = 73, RULE_action = 74, RULE_collation_name = 75, 
		RULE_function_name = 76, RULE_expr = 77, RULE_operator = 78, RULE_custom_op = 79, 
		RULE_operator_name = 80, RULE_condition_expr = 81, RULE_value_expr = 82, 
		RULE_array_constructor = 83, RULE_cast_expr = 84, RULE_function_call = 85, 
		RULE_time_function_call = 86, RULE_extract_field = 87, RULE_precision = 88, 
		RULE_aggregate_expr = 89, RULE_order_by_clause = 90, RULE_order_expr = 91, 
		RULE_aggregate_name = 92, RULE_window_func_call = 93, RULE_window_definition = 94, 
		RULE_frame_clause = 95, RULE_frame_start = 96, RULE_frame_end = 97, RULE_frame_value = 98, 
		RULE_window_name = 99, RULE_alias_name = 100, RULE_table_name = 101, RULE_schema_name = 102, 
		RULE_column_name = 103, RULE_index_name = 104, RULE_symbol = 105, RULE_length = 106, 
		RULE_decimals = 107, RULE_value = 108, RULE_constants = 109, RULE_boolean_constant = 110, 
		RULE_typed_constant = 111, RULE_bit_string_constant = 112, RULE_string_constant = 113, 
		RULE_numeric_constant = 114, RULE_data_type = 115, RULE_interval_field = 116, 
		RULE_keyword = 117, RULE_identifier = 118;
	public static final String[] ruleNames = {
		"prog", "error", "sql_stmt_list", "sql_stmt", "var_name", "create_index_stmt", 
		"index_method", "index_item", "opClass_name", "storage_param", "param_name", 
		"drop_index_stmt", "drop_table_stmt", "drop_view_stmt", "create_table_stmt", 
		"query", "create_of_definition", "type_name", "create_with_clause", "parent_table", 
		"tablespace_name", "value_list", "literal_value_list", "create_view_stmt", 
		"delete_stmt", "with_query", "with_query_name", "cursor_name", "output_name", 
		"insert_stmt", "insert_value_list", "conflict_target", "conflict_action", 
		"conflict_def_item", "constraint_name", "update_stmt", "column_update_expr", 
		"select_stmt", "locking_clause", "start", "count", "where_condition", 
		"having_condition", "grouping_element", "grouping_base_element", "select_expr", 
		"from_item_list", "from_item", "join_type", "join_condition", "function_element", 
		"alias_clause", "column_alias_name", "sampling_method_name", "sampling_method_argument", 
		"seed", "column_list", "view_name", "create_definition", "column_constraint", 
		"deferrable_option", "table_contraint", "like_option", "exclude_expr", 
		"exclude_item", "check_expr", "default_expr", "predict", "reftable", "refColumn", 
		"index_parameters", "source_table", "on_delete_action", "on_update_action", 
		"action", "collation_name", "function_name", "expr", "operator", "custom_op", 
		"operator_name", "condition_expr", "value_expr", "array_constructor", 
		"cast_expr", "function_call", "time_function_call", "extract_field", "precision", 
		"aggregate_expr", "order_by_clause", "order_expr", "aggregate_name", "window_func_call", 
		"window_definition", "frame_clause", "frame_start", "frame_end", "frame_value", 
		"window_name", "alias_name", "table_name", "schema_name", "column_name", 
		"index_name", "symbol", "length", "decimals", "value", "constants", "boolean_constant", 
		"typed_constant", "bit_string_constant", "string_constant", "numeric_constant", 
		"data_type", "interval_field", "keyword", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "','", "')'", "'='", "'*'", "'::'", "'['", "':'", 
		"']'", "'+'", "'-'", "'^'", "'/'", "'%'", "'.'", "'<'", "'>'", "'>='", 
		"'<='", "'<>'", "'!'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"K_A", "K_ABORT", "K_ABS", "K_ABSENT", "K_ABSOLUTE", "K_ACCESS", "K_ACCORDING", 
		"K_ACTION", "K_ADA", "K_ADD", "K_ADMIN", "K_AFTER", "K_AGGREGATE", "K_ALL", 
		"K_ALLOCATE", "K_ALSO", "K_ALTER", "K_ALWAYS", "K_ANALYSE", "K_ANALYZE", 
		"K_AND", "K_ANY", "K_ARE", "K_ARRAY", "K_ARRAY_AGG", "K_ARRAY_MAX_CARDINALITY", 
		"K_AS", "K_ASC", "K_ASENSITIVE", "K_ASSERTION", "K_ASSIGNMENT", "K_ASYMMETRIC", 
		"K_AT", "K_ATOMIC", "K_ATTRIBUTE", "K_ATTRIBUTES", "K_AUTHORIZATION", 
		"K_AVG", "K_BACKWARD", "K_BASE64", "K_BEFORE", "K_BEGIN", "K_BEGIN_FRAME", 
		"K_BEGIN_PARTITION", "K_BERNOULLI", "K_BETWEEN", "K_BIGINT", "K_BINARY", 
		"K_BIT", "K_BIT_LENGTH", "K_BLOB", "K_BLOCKED", "K_BOM", "K_BOOLEAN", 
		"K_BOTH", "K_BREADTH", "K_BY", "K_C", "K_CACHE", "K_CALL", "K_CALLED", 
		"K_CARDINALITY", "K_CASCADE", "K_CASCADED", "K_CASE", "K_CAST", "K_CATALOG", 
		"K_CATALOG_NAME", "K_CEIL", "K_CEILING", "K_CHAIN", "K_CHAR", "K_CHARACTER", 
		"K_CHARACTERISTICS", "K_CHARACTERS", "K_CHARACTER_LENGTH", "K_CHARACTER_SET_CATALOG", 
		"K_CHARACTER_SET_NAME", "K_CHARACTER_SET_SCHEMA", "K_CHAR_LENGTH", "K_CHECK", 
		"K_CHECKPOINT", "K_CLASS", "K_CLASS_ORIGIN", "K_CLOB", "K_CLOSE", "K_CLUSTER", 
		"K_COALESCE", "K_COBOL", "K_COLLATE", "K_COLLATION", "K_COLLATION_CATALOG", 
		"K_COLLATION_NAME", "K_COLLATION_SCHEMA", "K_COLLECT", "K_COLUMN", "K_COLUMNS", 
		"K_COLUMN_NAME", "K_COMMAND_FUNCTION", "K_COMMAND_FUNCTION_CODE", "K_COMMENT", 
		"K_COMMENTS", "K_COMMIT", "K_COMMITTED", "K_CONCURRENTLY", "K_CONDITION", 
		"K_CONDITION_NUMBER", "K_CONFIGURATION", "K_CONFLICT", "K_CONNECT", "K_CONNECTION", 
		"K_CONNECTION_NAME", "K_CONSTRAINT", "K_CONSTRAINTS", "K_CONSTRAINT_CATALOG", 
		"K_CONSTRAINT_NAME", "K_CONSTRAINT_SCHEMA", "K_CONSTRUCTOR", "K_CONTAINS", 
		"K_CONTENT", "K_CONTINUE", "K_CONTROL", "K_CONVERSION", "K_CONVERT", "K_COPY", 
		"K_CORR", "K_CORRESPONDING", "K_COST", "K_COUNT", "K_COVAR_POP", "K_COVAR_SAMP", 
		"K_CREATE", "K_CROSS", "K_CSV", "K_CUBE", "K_CUME_DIST", "K_CURRENT", 
		"K_CURRENT_CATALOG", "K_CURRENT_DATE", "K_CURRENT_DEFAULT_TRANSFORM_GROUP", 
		"K_CURRENT_PATH", "K_CURRENT_ROLE", "K_CURRENT_ROW", "K_CURRENT_SCHEMA", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_CURRENT_TRANSFORM_GROUP_FOR_TYPE", 
		"K_CURRENT_USER", "K_CURSOR", "K_CURSOR_NAME", "K_CYCLE", "K_DATA", "K_DATABASE", 
		"K_DATALINK", "K_DATE", "K_DATETIME_INTERVAL_CODE", "K_DATETIME_INTERVAL_PRECISION", 
		"K_DAY", "K_DB", "K_DEALLOCATE", "K_DEC", "K_DECIMAL", "K_DECLARE", "K_DEFAULT", 
		"K_DEFAULTS", "K_DEFERRABLE", "K_DEFERRED", "K_DEFINED", "K_DEFINER", 
		"K_DEGREE", "K_DELETE", "K_DELIMITER", "K_DELIMITERS", "K_DENSE_RANK", 
		"K_DEPENDS", "K_DEPTH", "K_DEREF", "K_DERIVED", "K_DESC", "K_DESCRIBE", 
		"K_DESCRIPTOR", "K_DETERMINISTIC", "K_DIAGNOSTICS", "K_DICTIONARY", "K_DISABLE", 
		"K_DISCARD", "K_DISCONNECT", "K_DISPATCH", "K_DISTINCT", "K_DLNEWCOPY", 
		"K_DLPREVIOUSCOPY", "K_DLURLCOMPLETE", "K_DLURLCOMPLETEONLY", "K_DLURLCOMPLETEWRITE", 
		"K_DLURLPATH", "K_DLURLPATHONLY", "K_DLURLPATHWRITE", "K_DLURLSCHEME", 
		"K_DLURLSERVER", "K_DLVALUE", "K_DO", "K_DOCUMENT", "K_DOMAIN", "K_DOUBLE", 
		"K_DROP", "K_DYNAMIC", "K_DYNAMIC_FUNCTION", "K_DYNAMIC_FUNCTION_CODE", 
		"K_EACH", "K_ELEMENT", "K_ELSE", "K_EMPTY", "K_ENABLE", "K_ENCODING", 
		"K_ENCRYPTED", "K_END", "K_END_EXEC", "K_END_FRAME", "K_END_PARTITION", 
		"K_ENFORCED", "K_ENUM", "K_EQUALS", "K_ESCAPE", "K_EVENT", "K_EVERY", 
		"K_EXCEPT", "K_EXCEPTION", "K_EXCLUDE", "K_EXCLUDING", "K_EXCLUSIVE", 
		"K_EXEC", "K_EXECUTE", "K_EXISTS", "K_EXP", "K_EXPLAIN", "K_EXPRESSION", 
		"K_EXTENSION", "K_EXTERNAL", "K_EXTRACT", "K_FALSE", "K_FAMILY", "K_FETCH", 
		"K_FILE", "K_FILTER", "K_FINAL", "K_FIRST", "K_FIRST_VALUE", "K_FLAG", 
		"K_FLOAT", "K_FLOOR", "K_FOLLOWING", "K_FOR", "K_FORCE", "K_FOREIGN", 
		"K_FORTRAN", "K_FORWARD", "K_FOUND", "K_FRAME_ROW", "K_FREE", "K_FREEZE", 
		"K_FROM", "K_FS", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_FUSION", "K_G", 
		"K_GENERAL", "K_GENERATED", "K_GET", "K_GLOBAL", "K_GO", "K_GOTO", "K_GRANT", 
		"K_GRANTED", "K_GREATEST", "K_GROUP", "K_GROUPING", "K_GROUPS", "K_HANDLER", 
		"K_HAVING", "K_HEADER", "K_HEX", "K_HIERARCHY", "K_HOLD", "K_HOUR", "K_ID", 
		"K_IDENTITY", "K_IF", "K_IGNORE", "K_ILIKE", "K_IMMEDIATE", "K_IMMEDIATELY", 
		"K_IMMUTABLE", "K_IMPLEMENTATION", "K_IMPLICIT", "K_IMPORT", "K_IN", "K_INCLUDING", 
		"K_INCREMENT", "K_INDENT", "K_INDEX", "K_INDEXES", "K_INDICATOR", "K_INHERIT", 
		"K_INHERITS", "K_INITIALLY", "K_INLINE", "K_INNER", "K_INOUT", "K_INPUT", 
		"K_INSENSITIVE", "K_INSERT", "K_INSTANCE", "K_INSTANTIABLE", "K_INSTEAD", 
		"K_INT", "K_INTEGER", "K_INTEGRITY", "K_INTERSECT", "K_INTERSECTION", 
		"K_INTERVAL", "K_INTO", "K_INVOKER", "K_IS", "K_ISNULL", "K_ISOLATION", 
		"K_JOIN", "K_K", "K_KEY", "K_KEY_MEMBER", "K_KEY_TYPE", "K_LABEL", "K_LAG", 
		"K_LANGUAGE", "K_LARGE", "K_LAST", "K_LAST_VALUE", "K_LATERAL", "K_LEAD", 
		"K_LEADING", "K_LEAKPROOF", "K_LEAST", "K_LEFT", "K_LENGTH", "K_LEVEL", 
		"K_LIBRARY", "K_LIKE", "K_LIKE_REGEX", "K_LIMIT", "K_LINK", "K_LISTEN", 
		"K_LN", "K_LOAD", "K_LOCAL", "K_LOCALTIME", "K_LOCALTIMESTAMP", "K_LOCATION", 
		"K_LOCATOR", "K_LOCK", "K_LOCKED", "K_LOGGED", "K_LOWER", "K_M", "K_MAP", 
		"K_MAPPING", "K_MATCH", "K_MATCHED", "K_MATERIALIZED", "K_MAX", "K_MAXVALUE", 
		"K_MAX_CARDINALITY", "K_MEMBER", "K_MERGE", "K_MESSAGE_LENGTH", "K_MESSAGE_OCTET_LENGTH", 
		"K_MESSAGE_TEXT", "K_METHOD", "K_MIN", "K_MINUTE", "K_MINVALUE", "K_MOD", 
		"K_MODE", "K_MODIFIES", "K_MODULE", "K_MONTH", "K_MORE", "K_MOVE", "K_MULTISET", 
		"K_MUMPS", "K_NAME", "K_NAMES", "K_NAMESPACE", "K_NATIONAL", "K_NATURAL", 
		"K_NCHAR", "K_NCLOB", "K_NESTING", "K_NEW", "K_NEXT", "K_NFC", "K_NFD", 
		"K_NFKC", "K_NFKD", "K_NIL", "K_NO", "K_NONE", "K_NORMALIZE", "K_NORMALIZED", 
		"K_NOT", "K_NOTHING", "K_NOTIFY", "K_NOTNULL", "K_NOWAIT", "K_NTH_VALUE", 
		"K_NTILE", "K_NULL", "K_NULLABLE", "K_NULLIF", "K_NULLS", "K_NUMBER", 
		"K_NUMERIC", "K_OBJECT", "K_OCCURRENCES_REGEX", "K_OCTETS", "K_OCTET_LENGTH", 
		"K_OF", "K_OFF", "K_OFFSET", "K_OIDS", "K_OLD", "K_ON", "K_ONLY", "K_OPEN", 
		"K_OPERATOR", "K_OPTION", "K_OPTIONS", "K_OR", "K_ORDER", "K_ORDERING", 
		"K_ORDINALITY", "K_OTHERS", "K_OUT", "K_OUTER", "K_OUTPUT", "K_OVER", 
		"K_OVERLAPS", "K_OVERLAY", "K_OVERRIDING", "K_OWNED", "K_OWNER", "K_P", 
		"K_PAD", "K_PARALLEL", "K_PARAMETER", "K_PARAMETER_MODE", "K_PARAMETER_NAME", 
		"K_PARAMETER_ORDINAL_POSITION", "K_PARAMETER_SPECIFIC_CATALOG", "K_PARAMETER_SPECIFIC_NAME", 
		"K_PARAMETER_SPECIFIC_SCHEMA", "K_PARSER", "K_PARTIAL", "K_PARTITION", 
		"K_PASCAL", "K_PASSING", "K_PASSTHROUGH", "K_PASSWORD", "K_PATH", "K_PERCENT", 
		"K_PERCENTILE_CONT", "K_PERCENTILE_DISC", "K_PERCENT_RANK", "K_PERIOD", 
		"K_PERMISSION", "K_PLACING", "K_PLANS", "K_PLI", "K_POLICY", "K_PORTION", 
		"K_POSITION", "K_POSITION_REGEX", "K_POWER", "K_PRECEDES", "K_PRECEDING", 
		"K_PRECISION", "K_PREPARE", "K_PREPARED", "K_PRESERVE", "K_PRIMARY", "K_PRIOR", 
		"K_PRIVILEGES", "K_PROCEDURAL", "K_PROCEDURE", "K_PROGRAM", "K_PUBLIC", 
		"K_QUOTE", "K_RANGE", "K_RANK", "K_READ", "K_READS", "K_REAL", "K_REASSIGN", 
		"K_RECHECK", "K_RECOVERY", "K_RECURSIVE", "K_REF", "K_REFERENCES", "K_REFERENCING", 
		"K_REFRESH", "K_REGR_AVGX", "K_REGR_AVGY", "K_REGR_COUNT", "K_REGR_INTERCEPT", 
		"K_REGR_R2", "K_REGR_SLOPE", "K_REGR_SXX", "K_REGR_SXY", "K_REGR_SYY", 
		"K_REINDEX", "K_RELATIVE", "K_RELEASE", "K_RENAME", "K_REPEATABLE", "K_REPLACE", 
		"K_REPLICA", "K_REQUIRING", "K_RESET", "K_RESPECT", "K_RESTART", "K_RESTORE", 
		"K_RESTRICT", "K_RESULT", "K_RETURN", "K_RETURNED_CARDINALITY", "K_RETURNED_LENGTH", 
		"K_RETURNED_OCTET_LENGTH", "K_RETURNED_SQLSTATE", "K_RETURNING", "K_RETURNS", 
		"K_REVOKE", "K_RIGHT", "K_ROLE", "K_ROLLBACK", "K_ROLLUP", "K_ROUTINE", 
		"K_ROUTINE_CATALOG", "K_ROUTINE_NAME", "K_ROUTINE_SCHEMA", "K_ROW", "K_ROWS", 
		"K_ROW_COUNT", "K_ROW_NUMBER", "K_RULE", "K_SAVEPOINT", "K_SCALE", "K_SCHEMA", 
		"K_SCHEMA_NAME", "K_SCOPE", "K_SCOPE_CATALOG", "K_SCOPE_NAME", "K_SCOPE_SCHEMA", 
		"K_SCROLL", "K_SEARCH", "K_SECOND", "K_SECTION", "K_SECURITY", "K_SELECT", 
		"K_SELECTIVE", "K_SELF", "K_SENSITIVE", "K_SEQUENCE", "K_SEQUENCES", "K_SERIALIZABLE", 
		"K_SERVER", "K_SERVER_NAME", "K_SESSION", "K_SESSION_USER", "K_SET", "K_SETOF", 
		"K_SETS", "K_SHARE", "K_SHOW", "K_SIMILAR", "K_SIMPLE", "K_SIZE", "K_SKIP", 
		"K_SMALLINT", "K_SNAPSHOT", "K_SOME", "K_SOURCE", "K_SPACE", "K_SPECIFIC", 
		"K_SPECIFICTYPE", "K_SPECIFIC_NAME", "K_SQL", "K_SQLCODE", "K_SQLERROR", 
		"K_SQLEXCEPTION", "K_SQLSTATE", "K_SQLWARNING", "K_SQRT", "K_STABLE", 
		"K_STANDALONE", "K_START", "K_STATE", "K_STATEMENT", "K_STATIC", "K_STATISTICS", 
		"K_STDDEV_POP", "K_STDDEV_SAMP", "K_STDIN", "K_STDOUT", "K_STORAGE", "K_STRICT", 
		"K_STRIP", "K_STRUCTURE", "K_STYLE", "K_SUBCLASS_ORIGIN", "K_SUBMULTISET", 
		"K_SUBSTRING", "K_SUBSTRING_REGEX", "K_SUCCEEDS", "K_SUM", "K_SYMMETRIC", 
		"K_SYSID", "K_SYSTEM", "K_SYSTEM_TIME", "K_SYSTEM_USER", "K_T", "K_TABLE", 
		"K_TABLES", "K_TABLESAMPLE", "K_TABLESPACE", "K_TABLE_NAME", "K_TEMP", 
		"K_TEMPLATE", "K_TEMPORARY", "K_TEXT", "K_THEN", "K_TIES", "K_TIME", "K_TIMESTAMP", 
		"K_TIMEZONE_HOUR", "K_TIMEZONE_MINUTE", "K_TO", "K_TOKEN", "K_TOP_LEVEL_COUNT", 
		"K_TRAILING", "K_TRANSACTION", "K_TRANSACTIONS_COMMITTED", "K_TRANSACTIONS_ROLLED_BACK", 
		"K_TRANSACTION_ACTIVE", "K_TRANSFORM", "K_TRANSFORMS", "K_TRANSLATE", 
		"K_TRANSLATE_REGEX", "K_TRANSLATION", "K_TREAT", "K_TRIGGER", "K_TRIGGER_CATALOG", 
		"K_TRIGGER_NAME", "K_TRIGGER_SCHEMA", "K_TRIM", "K_TRIM_ARRAY", "K_TRUE", 
		"K_TRUNCATE", "K_TRUSTED", "K_TYPE", "K_TYPES", "K_UESCAPE", "K_UNBOUNDED", 
		"K_UNCOMMITTED", "K_UNDER", "K_UNENCRYPTED", "K_UNION", "K_UNIQUE", "K_UNKNOWN", 
		"K_UNLINK", "K_UNLISTEN", "K_UNLOGGED", "K_UNNAMED", "K_UNNEST", "K_UNTIL", 
		"K_UNTYPED", "K_UPDATE", "K_UPPER", "K_URI", "K_USAGE", "K_USER", "K_USER_DEFINED_TYPE_CATALOG", 
		"K_USER_DEFINED_TYPE_CODE", "K_USER_DEFINED_TYPE_NAME", "K_USER_DEFINED_TYPE_SCHEMA", 
		"K_USING", "K_VACUUM", "K_VALID", "K_VALIDATE", "K_VALIDATOR", "K_VALUE", 
		"K_VALUES", "K_VALUE_OF", "K_VARBINARY", "K_VARCHAR", "K_VARIADIC", "K_VARYING", 
		"K_VAR_POP", "K_VAR_SAMP", "K_VERBOSE", "K_VERSION", "K_VERSIONING", "K_VIEW", 
		"K_VIEWS", "K_VOLATILE", "K_WHEN", "K_WHENEVER", "K_WHERE", "K_WHITESPACE", 
		"K_WIDTH_BUCKET", "K_WINDOW", "K_WITH", "K_WITHIN", "K_WITHOUT", "K_WORK", 
		"K_WRAPPER", "K_WRITE", "K_XML", "K_XMLAGG", "K_XMLATTRIBUTES", "K_XMLBINARY", 
		"K_XMLCAST", "K_XMLCOMMENT", "K_XMLCONCAT", "K_XMLDECLARATION", "K_XMLDOCUMENT", 
		"K_XMLELEMENT", "K_XMLEXISTS", "K_XMLFOREST", "K_XMLITERATE", "K_XMLNAMESPACES", 
		"K_XMLPARSE", "K_XMLPI", "K_XMLQUERY", "K_XMLROOT", "K_XMLSCHEMA", "K_XMLSERIALIZE", 
		"K_XMLTABLE", "K_XMLTEXT", "K_XMLVALIDATE", "K_YEAR", "K_YES", "K_ZONE", 
		"K_SERIAL", "K_BIGSERIAL", "K_SMALLSERIAL", "HEX_VALUE", "BIT_VALUE", 
		"SCIENTIFIC_VALUE", "FLOAT_VALUE", "INTEGER_VALUE", "QUOTED_STRING", "UNICODE_ESCAPED_STRING", 
		"QUOTED_IDENTIFIER", "UNICODE_ESCAPED_IDENTIFIER", "UNDERLINE_STARTED_IDENTIFIER", 
		"UNQUOTED_IDENTIFIER", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR", "OPERATOR"
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
	public String getGrammarFileName() { return "PostgreSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PostgreSQLParser.EOF, 0); }
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitProg(this);
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
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==K_CREATE || _la==K_DELETE || _la==K_DROP || _la==K_INSERT || _la==K_SELECT || _la==K_UPDATE || _la==K_WITH || _la==UNEXPECTED_CHAR) {
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
				case K_WITH:
					{
					setState(238);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(239);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
		public TerminalNode UNEXPECTED_CHAR() { return getToken(PostgreSQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
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
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(250);
				match(T__0);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			sql_stmt();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(257);
						match(T__0);
						}
						}
						setState(260); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(262);
					sql_stmt();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					match(T__0);
					}
					} 
				}
				setState(273);
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
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(274);
				create_index_stmt();
				}
				break;
			case 2:
				{
				setState(275);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(276);
				create_view_stmt();
				}
				break;
			case 4:
				{
				setState(277);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(278);
				drop_index_stmt();
				}
				break;
			case 6:
				{
				setState(279);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(280);
				drop_view_stmt();
				}
				break;
			case 8:
				{
				setState(281);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(282);
				select_stmt();
				}
				break;
			case 10:
				{
				setState(283);
				update_stmt();
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

	public static class Var_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(PostgreSQLParser.K_INDEX, 0); }
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Index_itemContext> index_item() {
			return getRuleContexts(Index_itemContext.class);
		}
		public Index_itemContext index_item(int i) {
			return getRuleContext(Index_itemContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(PostgreSQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CONCURRENTLY() { return getToken(PostgreSQLParser.K_CONCURRENTLY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public Index_methodContext index_method() {
			return getRuleContext(Index_methodContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<Storage_paramContext> storage_param() {
			return getRuleContexts(Storage_paramContext.class);
		}
		public Storage_paramContext storage_param(int i) {
			return getRuleContext(Storage_paramContext.class,i);
		}
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(K_CREATE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(289);
				match(K_UNIQUE);
				}
			}

			setState(292);
			match(K_INDEX);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONCURRENTLY) {
				{
				setState(293);
				match(K_CONCURRENTLY);
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF || ((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) {
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_IF) {
					{
					setState(296);
					match(K_IF);
					setState(297);
					match(K_NOT);
					setState(298);
					match(K_EXISTS);
					}
				}

				setState(301);
				index_name();
				}
			}

			setState(304);
			match(K_ON);
			setState(305);
			table_name();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(306);
				match(K_USING);
				setState(307);
				index_method();
				}
			}

			setState(310);
			match(T__1);
			setState(311);
			index_item();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(312);
				match(T__2);
				setState(313);
				index_item();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__3);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(320);
				match(K_WITH);
				setState(321);
				match(T__1);
				setState(322);
				storage_param();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(323);
					match(T__2);
					setState(324);
					storage_param();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(T__3);
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TABLESPACE) {
				{
				setState(334);
				match(K_TABLESPACE);
				setState(335);
				tablespace_name();
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(338);
				match(K_WHERE);
				setState(339);
				expr(0);
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

	public static class Index_methodContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Index_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterIndex_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitIndex_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitIndex_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_methodContext index_method() throws RecognitionException {
		Index_methodContext _localctx = new Index_methodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_index_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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

	public static class Index_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PostgreSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public OpClass_nameContext opClass_name() {
			return getRuleContext(OpClass_nameContext.class,0);
		}
		public TerminalNode K_NULLS() { return getToken(PostgreSQLParser.K_NULLS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(PostgreSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(PostgreSQLParser.K_DESC, 0); }
		public TerminalNode K_FIRST() { return getToken(PostgreSQLParser.K_FIRST, 0); }
		public TerminalNode K_LAST() { return getToken(PostgreSQLParser.K_LAST, 0); }
		public Index_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterIndex_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitIndex_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitIndex_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_itemContext index_item() throws RecognitionException {
		Index_itemContext _localctx = new Index_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(344);
				match(T__1);
				setState(345);
				expr(0);
				setState(346);
				match(T__3);
				}
				}
				break;
			case T__5:
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(348);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(351);
				match(K_COLLATE);
				setState(352);
				collation_name();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) {
				{
				setState(355);
				opClass_name();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(358);
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

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NULLS) {
				{
				setState(361);
				match(K_NULLS);
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==K_FIRST || _la==K_LAST) ) {
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

	public static class OpClass_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpClass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opClass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOpClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOpClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOpClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpClass_nameContext opClass_name() throws RecognitionException {
		OpClass_nameContext _localctx = new OpClass_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opClass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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

	public static class Storage_paramContext extends ParserRuleContext {
		public Param_nameContext param_name() {
			return getRuleContext(Param_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Storage_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterStorage_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitStorage_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitStorage_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_paramContext storage_param() throws RecognitionException {
		Storage_paramContext _localctx = new Storage_paramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_storage_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			param_name();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(368);
				match(T__4);
				setState(369);
				expr(0);
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

	public static class Param_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Param_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterParam_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitParam_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitParam_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_nameContext param_name() throws RecognitionException {
		Param_nameContext _localctx = new Param_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(PostgreSQLParser.K_INDEX, 0); }
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public TerminalNode K_CONCURRENTLY() { return getToken(PostgreSQLParser.K_CONCURRENTLY, 0); }
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_CASCADE() { return getToken(PostgreSQLParser.K_CASCADE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(PostgreSQLParser.K_RESTRICT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drop_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(K_DROP);
			setState(375);
			match(K_INDEX);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONCURRENTLY) {
				{
				setState(376);
				match(K_CONCURRENTLY);
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(379);
				match(K_IF);
				setState(380);
				match(K_EXISTS);
				}
			}

			setState(383);
			index_name();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(384);
				match(T__2);
				setState(385);
				index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(PostgreSQLParser.K_TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_RESTRICT() { return getToken(PostgreSQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(PostgreSQLParser.K_CASCADE, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(K_DROP);
			setState(395);
			match(K_TABLE);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(396);
				match(K_IF);
				setState(397);
				match(K_EXISTS);
				}
				break;
			}
			setState(400);
			table_name();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(401);
				match(T__2);
				setState(402);
				table_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(PostgreSQLParser.K_VIEW, 0); }
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_RESTRICT() { return getToken(PostgreSQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(PostgreSQLParser.K_CASCADE, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drop_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(K_DROP);
			setState(412);
			match(K_VIEW);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(413);
				match(K_IF);
				setState(414);
				match(K_EXISTS);
				}
			}

			setState(417);
			view_name();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(418);
				match(T__2);
				setState(419);
				view_name();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE || _la==K_RESTRICT) {
				{
				setState(425);
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
	public static class CreateTableOfTypeStatementContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(PostgreSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_OF() { return getToken(PostgreSQLParser.K_OF, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Create_of_definitionContext> create_of_definition() {
			return getRuleContexts(Create_of_definitionContext.class);
		}
		public Create_of_definitionContext create_of_definition(int i) {
			return getRuleContext(Create_of_definitionContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public Create_with_clauseContext create_with_clause() {
			return getRuleContext(Create_with_clauseContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_COMMIT() { return getToken(PostgreSQLParser.K_COMMIT, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(PostgreSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_TEMP() { return getToken(PostgreSQLParser.K_TEMP, 0); }
		public TerminalNode K_UNLOGGED() { return getToken(PostgreSQLParser.K_UNLOGGED, 0); }
		public TerminalNode K_PRESERVE() { return getToken(PostgreSQLParser.K_PRESERVE, 0); }
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_GLOBAL() { return getToken(PostgreSQLParser.K_GLOBAL, 0); }
		public TerminalNode K_LOCAL() { return getToken(PostgreSQLParser.K_LOCAL, 0); }
		public CreateTableOfTypeStatementContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreateTableOfTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreateTableOfTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreateTableOfTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStatementContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(PostgreSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_INHERITS() { return getToken(PostgreSQLParser.K_INHERITS, 0); }
		public List<Parent_tableContext> parent_table() {
			return getRuleContexts(Parent_tableContext.class);
		}
		public Parent_tableContext parent_table(int i) {
			return getRuleContext(Parent_tableContext.class,i);
		}
		public Create_with_clauseContext create_with_clause() {
			return getRuleContext(Create_with_clauseContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_COMMIT() { return getToken(PostgreSQLParser.K_COMMIT, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(PostgreSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_TEMP() { return getToken(PostgreSQLParser.K_TEMP, 0); }
		public TerminalNode K_UNLOGGED() { return getToken(PostgreSQLParser.K_UNLOGGED, 0); }
		public TerminalNode K_PRESERVE() { return getToken(PostgreSQLParser.K_PRESERVE, 0); }
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_GLOBAL() { return getToken(PostgreSQLParser.K_GLOBAL, 0); }
		public TerminalNode K_LOCAL() { return getToken(PostgreSQLParser.K_LOCAL, 0); }
		public CreateTableStatementContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsStatementContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(PostgreSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Create_with_clauseContext create_with_clause() {
			return getRuleContext(Create_with_clauseContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_COMMIT() { return getToken(PostgreSQLParser.K_COMMIT, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_DATA() { return getToken(PostgreSQLParser.K_DATA, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(PostgreSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_TEMP() { return getToken(PostgreSQLParser.K_TEMP, 0); }
		public TerminalNode K_UNLOGGED() { return getToken(PostgreSQLParser.K_UNLOGGED, 0); }
		public TerminalNode K_PRESERVE() { return getToken(PostgreSQLParser.K_PRESERVE, 0); }
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_GLOBAL() { return getToken(PostgreSQLParser.K_GLOBAL, 0); }
		public TerminalNode K_LOCAL() { return getToken(PostgreSQLParser.K_LOCAL, 0); }
		public CreateTableAsStatementContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreateTableAsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreateTableAsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreateTableAsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_table_stmt);
		int _la;
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new CreateTableStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(K_CREATE);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GLOBAL || _la==K_LOCAL || ((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) {
					{
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_GLOBAL || _la==K_LOCAL) {
						{
						setState(429);
						_la = _input.LA(1);
						if ( !(_la==K_GLOBAL || _la==K_LOCAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(432);
					_la = _input.LA(1);
					if ( !(((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(435);
				match(K_TABLE);
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(436);
					match(K_IF);
					setState(437);
					match(K_NOT);
					setState(438);
					match(K_EXISTS);
					}
					break;
				}
				setState(441);
				table_name();
				setState(442);
				match(T__1);
				setState(443);
				create_definition();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(444);
					match(T__2);
					setState(445);
					create_definition();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				match(T__3);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INHERITS) {
					{
					setState(452);
					match(K_INHERITS);
					setState(453);
					match(T__1);
					setState(454);
					parent_table();
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(455);
						match(T__2);
						setState(456);
						parent_table();
						}
						}
						setState(461);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(462);
					match(T__3);
					}
				}

				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(466);
					create_with_clause();
					}
					break;
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(469);
					match(K_ON);
					setState(470);
					match(K_COMMIT);
					setState(476);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_PRESERVE:
						{
						setState(471);
						match(K_PRESERVE);
						setState(472);
						match(K_ROWS);
						}
						break;
					case K_DELETE:
						{
						setState(473);
						match(K_DELETE);
						setState(474);
						match(K_ROWS);
						}
						break;
					case K_DROP:
						{
						setState(475);
						match(K_DROP);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TABLESPACE) {
					{
					setState(480);
					match(K_TABLESPACE);
					setState(481);
					tablespace_name();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateTableOfTypeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(K_CREATE);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GLOBAL || _la==K_LOCAL || ((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) {
					{
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_GLOBAL || _la==K_LOCAL) {
						{
						setState(485);
						_la = _input.LA(1);
						if ( !(_la==K_GLOBAL || _la==K_LOCAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(488);
					_la = _input.LA(1);
					if ( !(((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(491);
				match(K_TABLE);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(492);
					match(K_IF);
					setState(493);
					match(K_NOT);
					setState(494);
					match(K_EXISTS);
					}
					break;
				}
				setState(497);
				table_name();
				setState(498);
				match(K_OF);
				setState(499);
				type_name();
				setState(500);
				match(T__1);
				setState(501);
				create_of_definition();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(502);
					match(T__2);
					setState(503);
					create_of_definition();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509);
				match(T__3);
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(510);
					create_with_clause();
					}
					break;
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(513);
					match(K_ON);
					setState(514);
					match(K_COMMIT);
					setState(520);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_PRESERVE:
						{
						setState(515);
						match(K_PRESERVE);
						setState(516);
						match(K_ROWS);
						}
						break;
					case K_DELETE:
						{
						setState(517);
						match(K_DELETE);
						setState(518);
						match(K_ROWS);
						}
						break;
					case K_DROP:
						{
						setState(519);
						match(K_DROP);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TABLESPACE) {
					{
					setState(524);
					match(K_TABLESPACE);
					setState(525);
					tablespace_name();
					}
				}

				}
				break;
			case 3:
				_localctx = new CreateTableAsStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(K_CREATE);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GLOBAL || _la==K_LOCAL || ((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) {
					{
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_GLOBAL || _la==K_LOCAL) {
						{
						setState(529);
						_la = _input.LA(1);
						if ( !(_la==K_GLOBAL || _la==K_LOCAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(532);
					_la = _input.LA(1);
					if ( !(((((_la - 659)) & ~0x3f) == 0 && ((1L << (_la - 659)) & ((1L << (K_TEMP - 659)) | (1L << (K_TEMPORARY - 659)) | (1L << (K_UNLOGGED - 659)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(535);
				match(K_TABLE);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(536);
					match(K_IF);
					setState(537);
					match(K_NOT);
					setState(538);
					match(K_EXISTS);
					}
					break;
				}
				setState(541);
				table_name();
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(542);
					match(T__1);
					setState(543);
					column_name();
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(544);
						match(T__2);
						setState(545);
						column_name();
						}
						}
						setState(550);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(551);
					match(T__3);
					}
				}

				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITH || _la==K_WITHOUT) {
					{
					setState(555);
					create_with_clause();
					}
				}

				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(558);
					match(K_ON);
					setState(559);
					match(K_COMMIT);
					setState(565);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_PRESERVE:
						{
						setState(560);
						match(K_PRESERVE);
						setState(561);
						match(K_ROWS);
						}
						break;
					case K_DELETE:
						{
						setState(562);
						match(K_DELETE);
						setState(563);
						match(K_ROWS);
						}
						break;
					case K_DROP:
						{
						setState(564);
						match(K_DROP);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_TABLESPACE) {
					{
					setState(569);
					match(K_TABLESPACE);
					setState(570);
					tablespace_name();
					}
				}

				setState(573);
				match(K_AS);
				setState(574);
				query();
				setState(580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(575);
					match(K_WITH);
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NO) {
						{
						setState(576);
						match(K_NO);
						}
					}

					setState(579);
					match(K_DATA);
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

	public static class QueryContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			select_stmt();
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

	public static class Create_of_definitionContext extends ParserRuleContext {
		public Create_of_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_of_definition; }
	 
		public Create_of_definitionContext() { }
		public void copyFrom(Create_of_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateOfTableConstraintDefContext extends Create_of_definitionContext {
		public Table_contraintContext table_contraint() {
			return getRuleContext(Table_contraintContext.class,0);
		}
		public CreateOfTableConstraintDefContext(Create_of_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreateOfTableConstraintDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreateOfTableConstraintDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreateOfTableConstraintDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateOfColumnDefContext extends Create_of_definitionContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_OPTIONS() { return getToken(PostgreSQLParser.K_OPTIONS, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public CreateOfColumnDefContext(Create_of_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreateOfColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreateOfColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreateOfColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_of_definitionContext create_of_definition() throws RecognitionException {
		Create_of_definitionContext _localctx = new Create_of_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_of_definition);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new CreateOfColumnDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				column_name();
				setState(587);
				match(K_WITH);
				setState(588);
				match(K_OPTIONS);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CHECK || _la==K_CONSTRAINT || _la==K_DEFAULT || _la==K_NOT || _la==K_NULL || _la==K_PRIMARY || _la==K_REFERENCES || _la==K_UNIQUE) {
					{
					{
					setState(589);
					column_constraint();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new CreateOfTableConstraintDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				table_contraint();
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

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
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

	public static class Create_with_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<Storage_paramContext> storage_param() {
			return getRuleContexts(Storage_paramContext.class);
		}
		public Storage_paramContext storage_param(int i) {
			return getRuleContext(Storage_paramContext.class,i);
		}
		public TerminalNode K_OIDS() { return getToken(PostgreSQLParser.K_OIDS, 0); }
		public TerminalNode K_WITHOUT() { return getToken(PostgreSQLParser.K_WITHOUT, 0); }
		public Create_with_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreate_with_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreate_with_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreate_with_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_with_clauseContext create_with_clause() throws RecognitionException {
		Create_with_clauseContext _localctx = new Create_with_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_with_clause);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(K_WITH);
				setState(601);
				match(T__1);
				setState(602);
				storage_param();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(603);
					match(T__2);
					setState(604);
					storage_param();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(K_WITH);
				setState(613);
				match(K_OIDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				match(K_WITHOUT);
				setState(615);
				match(K_OIDS);
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

	public static class Parent_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Parent_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterParent_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitParent_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitParent_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_tableContext parent_table() throws RecognitionException {
		Parent_tableContext _localctx = new Parent_tableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parent_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			table_name();
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTablespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTablespace_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTablespace_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tablespace_nameContext tablespace_name() throws RecognitionException {
		Tablespace_nameContext _localctx = new Tablespace_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tablespace_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_list);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(T__1);
				setState(623);
				literal_value_list();
				setState(624);
				match(T__3);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(625);
					match(T__2);
					setState(626);
					match(T__1);
					setState(627);
					literal_value_list();
					setState(628);
					match(T__3);
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_BIGINT:
			case K_BIT:
			case K_BOOLEAN:
			case K_CHAR:
			case K_CHARACTER:
			case K_DATE:
			case K_DOUBLE:
			case K_FALSE:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_MAXVALUE:
			case K_NUMERIC:
			case K_REAL:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TRUE:
			case K_VARCHAR:
			case K_XML:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case HEX_VALUE:
			case BIT_VALUE:
			case SCIENTIFIC_VALUE:
			case FLOAT_VALUE:
			case INTEGER_VALUE:
			case QUOTED_STRING:
			case UNICODE_ESCAPED_STRING:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
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
		public List<TerminalNode> K_MAXVALUE() { return getTokens(PostgreSQLParser.K_MAXVALUE); }
		public TerminalNode K_MAXVALUE(int i) {
			return getToken(PostgreSQLParser.K_MAXVALUE, i);
		}
		public List<ConstantsContext> constants() {
			return getRuleContexts(ConstantsContext.class);
		}
		public ConstantsContext constants(int i) {
			return getRuleContext(ConstantsContext.class,i);
		}
		public Literal_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLiteral_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLiteral_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLiteral_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_value_listContext literal_value_list() throws RecognitionException {
		Literal_value_listContext _localctx = new Literal_value_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_MAXVALUE:
				{
				setState(638);
				match(K_MAXVALUE);
				}
				break;
			case K_BIGINT:
			case K_BIT:
			case K_BOOLEAN:
			case K_CHAR:
			case K_CHARACTER:
			case K_DATE:
			case K_DOUBLE:
			case K_FALSE:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_NUMERIC:
			case K_REAL:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TRUE:
			case K_VARCHAR:
			case K_XML:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case HEX_VALUE:
			case BIT_VALUE:
			case SCIENTIFIC_VALUE:
			case FLOAT_VALUE:
			case INTEGER_VALUE:
			case QUOTED_STRING:
			case UNICODE_ESCAPED_STRING:
			case UNQUOTED_IDENTIFIER:
				{
				setState(639);
				constants();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(642);
				match(T__2);
				setState(645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_MAXVALUE:
					{
					setState(643);
					match(K_MAXVALUE);
					}
					break;
				case K_BIGINT:
				case K_BIT:
				case K_BOOLEAN:
				case K_CHAR:
				case K_CHARACTER:
				case K_DATE:
				case K_DOUBLE:
				case K_FALSE:
				case K_INT:
				case K_INTEGER:
				case K_INTERVAL:
				case K_NUMERIC:
				case K_REAL:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TRUE:
				case K_VARCHAR:
				case K_XML:
				case K_SERIAL:
				case K_BIGSERIAL:
				case K_SMALLSERIAL:
				case HEX_VALUE:
				case BIT_VALUE:
				case SCIENTIFIC_VALUE:
				case FLOAT_VALUE:
				case INTEGER_VALUE:
				case QUOTED_STRING:
				case UNICODE_ESCAPED_STRING:
				case UNQUOTED_IDENTIFIER:
					{
					setState(644);
					constants();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(651);
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
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(PostgreSQLParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(PostgreSQLParser.K_OR, 0); }
		public TerminalNode K_REPLACE() { return getToken(PostgreSQLParser.K_REPLACE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_CHECK() { return getToken(PostgreSQLParser.K_CHECK, 0); }
		public TerminalNode K_OPTION() { return getToken(PostgreSQLParser.K_OPTION, 0); }
		public TerminalNode K_TEMP() { return getToken(PostgreSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(PostgreSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_CASCADED() { return getToken(PostgreSQLParser.K_CASCADED, 0); }
		public TerminalNode K_LOCAL() { return getToken(PostgreSQLParser.K_LOCAL, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(K_CREATE);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(653);
				match(K_OR);
				setState(654);
				match(K_REPLACE);
				}
			}

			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(657);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(660);
				match(K_RECURSIVE);
				}
			}

			setState(663);
			match(K_VIEW);
			setState(664);
			view_name();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(665);
				match(T__1);
				setState(666);
				column_list();
				setState(667);
				match(T__3);
				}
			}

			setState(671);
			match(K_AS);
			setState(672);
			select_stmt();
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(673);
				match(K_WITH);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CASCADED || _la==K_LOCAL) {
					{
					setState(674);
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

				setState(677);
				match(K_CHECK);
				setState(678);
				match(K_OPTION);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<With_queryContext> with_query() {
			return getRuleContexts(With_queryContext.class);
		}
		public With_queryContext with_query(int i) {
			return getRuleContext(With_queryContext.class,i);
		}
		public TerminalNode K_ONLY() { return getToken(PostgreSQLParser.K_ONLY, 0); }
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public From_item_listContext from_item_list() {
			return getRuleContext(From_item_listContext.class,0);
		}
		public TerminalNode K_RETURNING() { return getToken(PostgreSQLParser.K_RETURNING, 0); }
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_CURRENT() { return getToken(PostgreSQLParser.K_CURRENT, 0); }
		public TerminalNode K_OF() { return getToken(PostgreSQLParser.K_OF, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public List<TerminalNode> K_AS() { return getTokens(PostgreSQLParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(PostgreSQLParser.K_AS, i);
		}
		public List<Output_nameContext> output_name() {
			return getRuleContexts(Output_nameContext.class);
		}
		public Output_nameContext output_name(int i) {
			return getRuleContext(Output_nameContext.class,i);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(681);
				match(K_WITH);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(682);
					match(K_RECURSIVE);
					}
				}

				setState(685);
				with_query();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(686);
					match(T__2);
					setState(687);
					with_query();
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(695);
			match(K_DELETE);
			setState(696);
			match(K_FROM);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(697);
				match(K_ONLY);
				}
				break;
			}
			setState(700);
			table_name();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(701);
				match(T__5);
				}
			}

			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || ((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) {
				{
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(704);
					match(K_AS);
					}
				}

				setState(707);
				alias_name();
				}
			}

			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(710);
				match(K_USING);
				setState(711);
				from_item_list();
				}
			}

			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				{
				setState(714);
				match(K_WHERE);
				setState(715);
				expr(0);
				}
				}
				break;
			case 2:
				{
				{
				setState(716);
				match(K_WHERE);
				setState(717);
				match(K_CURRENT);
				setState(718);
				match(K_OF);
				setState(719);
				cursor_name();
				}
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURNING) {
				{
				setState(722);
				match(K_RETURNING);
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(723);
					match(T__5);
					}
					break;
				case 2:
					{
					{
					setState(724);
					expr(0);
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(725);
						match(K_AS);
						setState(726);
						output_name();
						}
					}

					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(729);
						match(T__2);
						setState(730);
						expr(0);
						setState(733);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_AS) {
							{
							setState(731);
							match(K_AS);
							setState(732);
							output_name();
							}
						}

						}
						}
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
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

	public static class With_queryContext extends ParserRuleContext {
		public With_query_nameContext with_query_name() {
			return getRuleContext(With_query_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public With_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWith_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWith_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWith_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_queryContext with_query() throws RecognitionException {
		With_queryContext _localctx = new With_queryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_with_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			with_query_name();
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(745);
				match(T__1);
				setState(746);
				column_name();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(747);
					match(T__2);
					setState(748);
					column_name();
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(754);
				match(T__3);
				}
			}

			setState(758);
			match(K_AS);
			setState(759);
			match(T__1);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(760);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(761);
				insert_stmt();
				}
				break;
			case 3:
				{
				setState(762);
				update_stmt();
				}
				break;
			case 4:
				{
				setState(763);
				delete_stmt();
				}
				break;
			}
			setState(766);
			match(T__3);
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

	public static class With_query_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public With_query_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_query_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWith_query_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWith_query_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWith_query_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_query_nameContext with_query_name() throws RecognitionException {
		With_query_nameContext _localctx = new With_query_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_with_query_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCursor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cursor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
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

	public static class Output_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Output_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOutput_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOutput_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOutput_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_nameContext output_name() throws RecognitionException {
		Output_nameContext _localctx = new Output_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_output_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(PostgreSQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(PostgreSQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<With_queryContext> with_query() {
			return getRuleContexts(With_queryContext.class);
		}
		public With_queryContext with_query(int i) {
			return getRuleContext(With_queryContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(PostgreSQLParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(PostgreSQLParser.K_AS, i);
		}
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(PostgreSQLParser.K_CONFLICT, 0); }
		public Conflict_actionContext conflict_action() {
			return getRuleContext(Conflict_actionContext.class,0);
		}
		public TerminalNode K_RETURNING() { return getToken(PostgreSQLParser.K_RETURNING, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PostgreSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_VALUES() { return getToken(PostgreSQLParser.K_VALUES, 0); }
		public List<Insert_value_listContext> insert_value_list() {
			return getRuleContexts(Insert_value_listContext.class);
		}
		public Insert_value_listContext insert_value_list(int i) {
			return getRuleContext(Insert_value_listContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public Conflict_targetContext conflict_target() {
			return getRuleContext(Conflict_targetContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Output_nameContext> output_name() {
			return getRuleContexts(Output_nameContext.class);
		}
		public Output_nameContext output_name(int i) {
			return getRuleContext(Output_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(774);
				match(K_WITH);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(775);
					match(K_RECURSIVE);
					}
				}

				setState(778);
				with_query();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(779);
					match(T__2);
					setState(780);
					with_query();
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(788);
			match(K_INSERT);
			setState(789);
			match(K_INTO);
			setState(790);
			table_name();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(791);
				match(K_AS);
				setState(792);
				alias_name();
				}
			}

			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(795);
				match(T__1);
				setState(796);
				column_name();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(797);
					match(T__2);
					setState(798);
					column_name();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				match(T__3);
				}
			}

			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				{
				setState(808);
				match(K_DEFAULT);
				setState(809);
				match(K_VALUES);
				}
				}
				break;
			case K_VALUES:
				{
				{
				setState(810);
				match(K_VALUES);
				setState(811);
				insert_value_list();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(812);
					match(T__2);
					setState(813);
					insert_value_list();
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case K_SELECT:
			case K_WITH:
				{
				setState(819);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(822);
				match(K_ON);
				setState(823);
				match(K_CONFLICT);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==K_ON) {
					{
					setState(824);
					conflict_target();
					}
				}

				setState(827);
				conflict_action();
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURNING) {
				{
				setState(830);
				match(K_RETURNING);
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(831);
					match(T__5);
					}
					break;
				case 2:
					{
					{
					setState(832);
					expr(0);
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(833);
						match(K_AS);
						setState(834);
						output_name();
						}
					}

					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(837);
						match(T__2);
						setState(838);
						expr(0);
						setState(841);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_AS) {
							{
							setState(839);
							match(K_AS);
							setState(840);
							output_name();
							}
						}

						}
						}
						setState(847);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
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

	public static class Insert_value_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(PostgreSQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(PostgreSQLParser.K_DEFAULT, i);
		}
		public Insert_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterInsert_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitInsert_value_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitInsert_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_value_listContext insert_value_list() throws RecognitionException {
		Insert_value_listContext _localctx = new Insert_value_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insert_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(T__1);
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(853);
				expr(0);
				}
				break;
			case 2:
				{
				setState(854);
				match(K_DEFAULT);
				}
				break;
			}
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(857);
				match(T__2);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(858);
					expr(0);
					}
					break;
				case 2:
					{
					setState(859);
					match(K_DEFAULT);
					}
					break;
				}
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(T__3);
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

	public static class Conflict_targetContext extends ParserRuleContext {
		public List<Conflict_def_itemContext> conflict_def_item() {
			return getRuleContexts(Conflict_def_itemContext.class);
		}
		public Conflict_def_itemContext conflict_def_item(int i) {
			return getRuleContext(Conflict_def_itemContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(PostgreSQLParser.K_CONSTRAINT, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public Conflict_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterConflict_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitConflict_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitConflict_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_targetContext conflict_target() throws RecognitionException {
		Conflict_targetContext _localctx = new Conflict_targetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conflict_target);
		int _la;
		try {
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(T__1);
				setState(870);
				conflict_def_item();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(871);
					match(T__2);
					setState(872);
					conflict_def_item();
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
				match(T__3);
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(K_ON);
				setState(881);
				match(K_CONSTRAINT);
				setState(882);
				constraint_name();
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

	public static class Conflict_actionContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(PostgreSQLParser.K_DO, 0); }
		public TerminalNode K_NOTHING() { return getToken(PostgreSQLParser.K_NOTHING, 0); }
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public TerminalNode K_SET() { return getToken(PostgreSQLParser.K_SET, 0); }
		public List<Column_update_exprContext> column_update_expr() {
			return getRuleContexts(Column_update_exprContext.class);
		}
		public Column_update_exprContext column_update_expr(int i) {
			return getRuleContext(Column_update_exprContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conflict_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterConflict_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitConflict_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitConflict_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_actionContext conflict_action() throws RecognitionException {
		Conflict_actionContext _localctx = new Conflict_actionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conflict_action);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(K_DO);
				setState(886);
				match(K_NOTHING);
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(K_UPDATE);
				setState(888);
				match(K_SET);
				setState(889);
				column_update_expr();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(890);
					match(T__2);
					setState(891);
					column_update_expr();
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				match(K_WHERE);
				setState(898);
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

	public static class Conflict_def_itemContext extends ParserRuleContext {
		public OpClass_nameContext opClass_name() {
			return getRuleContext(OpClass_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PostgreSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conflict_def_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_def_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterConflict_def_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitConflict_def_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitConflict_def_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_def_itemContext conflict_def_item() throws RecognitionException {
		Conflict_def_itemContext _localctx = new Conflict_def_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conflict_def_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(902);
				column_name();
				}
				break;
			case T__1:
				{
				{
				setState(903);
				match(T__1);
				setState(904);
				expr(0);
				setState(905);
				match(T__3);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(909);
				match(K_COLLATE);
				setState(910);
				collation_name();
				}
			}

			setState(913);
			opClass_name();
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

	public static class Constraint_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Constraint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterConstraint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitConstraint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitConstraint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraint_nameContext constraint_name() throws RecognitionException {
		Constraint_nameContext _localctx = new Constraint_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constraint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(PostgreSQLParser.K_SET, 0); }
		public List<Column_update_exprContext> column_update_expr() {
			return getRuleContexts(Column_update_exprContext.class);
		}
		public Column_update_exprContext column_update_expr(int i) {
			return getRuleContext(Column_update_exprContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<With_queryContext> with_query() {
			return getRuleContexts(With_queryContext.class);
		}
		public With_queryContext with_query(int i) {
			return getRuleContext(With_queryContext.class,i);
		}
		public TerminalNode K_ONLY() { return getToken(PostgreSQLParser.K_ONLY, 0); }
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public From_item_listContext from_item_list() {
			return getRuleContext(From_item_listContext.class,0);
		}
		public TerminalNode K_RETURNING() { return getToken(PostgreSQLParser.K_RETURNING, 0); }
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_CURRENT() { return getToken(PostgreSQLParser.K_CURRENT, 0); }
		public TerminalNode K_OF() { return getToken(PostgreSQLParser.K_OF, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public List<TerminalNode> K_AS() { return getTokens(PostgreSQLParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(PostgreSQLParser.K_AS, i);
		}
		public List<Output_nameContext> output_name() {
			return getRuleContexts(Output_nameContext.class);
		}
		public Output_nameContext output_name(int i) {
			return getRuleContext(Output_nameContext.class,i);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(917);
				match(K_WITH);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(918);
					match(K_RECURSIVE);
					}
				}

				setState(921);
				with_query();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(922);
					match(T__2);
					setState(923);
					with_query();
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(931);
			match(K_UPDATE);
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(932);
				match(K_ONLY);
				}
				break;
			}
			setState(935);
			table_name();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(936);
				match(T__5);
				}
			}

			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || ((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) {
				{
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(939);
					match(K_AS);
					}
				}

				setState(942);
				alias_name();
				}
			}

			setState(945);
			match(K_SET);
			setState(946);
			column_update_expr();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(947);
				match(T__2);
				setState(948);
				column_update_expr();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(954);
				match(K_FROM);
				setState(955);
				from_item_list();
				}
			}

			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				{
				setState(958);
				match(K_WHERE);
				setState(959);
				expr(0);
				}
				}
				break;
			case 2:
				{
				{
				setState(960);
				match(K_WHERE);
				setState(961);
				match(K_CURRENT);
				setState(962);
				match(K_OF);
				setState(963);
				cursor_name();
				}
				}
				break;
			}
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURNING) {
				{
				setState(966);
				match(K_RETURNING);
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(967);
					match(T__5);
					}
					break;
				case 2:
					{
					{
					setState(968);
					expr(0);
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(969);
						match(K_AS);
						setState(970);
						output_name();
						}
					}

					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(973);
						match(T__2);
						setState(974);
						expr(0);
						setState(977);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_AS) {
							{
							setState(975);
							match(K_AS);
							setState(976);
							output_name();
							}
						}

						}
						}
						setState(983);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
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

	public static class Column_update_exprContext extends ParserRuleContext {
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
		public List<TerminalNode> K_DEFAULT() { return getTokens(PostgreSQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(PostgreSQLParser.K_DEFAULT, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Column_update_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_update_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_update_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_update_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_update_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_update_exprContext column_update_expr() throws RecognitionException {
		Column_update_exprContext _localctx = new Column_update_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column_update_expr);
		int _la;
		try {
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				column_name();
				setState(989);
				match(T__4);
				setState(992);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(990);
					expr(0);
					}
					break;
				case 2:
					{
					setState(991);
					match(K_DEFAULT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(T__1);
				setState(995);
				column_name();
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(996);
					match(T__2);
					setState(997);
					column_name();
					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1003);
				match(T__3);
				setState(1004);
				match(T__4);
				setState(1005);
				match(T__1);
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1006);
					expr(0);
					}
					break;
				case 2:
					{
					setState(1007);
					match(K_DEFAULT);
					}
					break;
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1010);
					match(T__2);
					setState(1013);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						setState(1011);
						expr(0);
						}
						break;
					case 2:
						{
						setState(1012);
						match(K_DEFAULT);
						}
						break;
					}
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				match(T__1);
				setState(1023);
				column_name();
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1024);
					match(T__2);
					setState(1025);
					column_name();
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				match(T__3);
				setState(1032);
				match(T__4);
				setState(1033);
				match(T__1);
				setState(1034);
				select_stmt();
				setState(1035);
				match(T__3);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(PostgreSQLParser.K_SELECT, 0); }
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<With_queryContext> with_query() {
			return getRuleContexts(With_queryContext.class);
		}
		public With_queryContext with_query(int i) {
			return getRuleContext(With_queryContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public From_item_listContext from_item_list() {
			return getRuleContext(From_item_listContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public Where_conditionContext where_condition() {
			return getRuleContext(Where_conditionContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(PostgreSQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(PostgreSQLParser.K_BY, 0); }
		public List<Grouping_elementContext> grouping_element() {
			return getRuleContexts(Grouping_elementContext.class);
		}
		public Grouping_elementContext grouping_element(int i) {
			return getRuleContext(Grouping_elementContext.class,i);
		}
		public TerminalNode K_HAVING() { return getToken(PostgreSQLParser.K_HAVING, 0); }
		public List<Having_conditionContext> having_condition() {
			return getRuleContexts(Having_conditionContext.class);
		}
		public Having_conditionContext having_condition(int i) {
			return getRuleContext(Having_conditionContext.class,i);
		}
		public TerminalNode K_WINDOW() { return getToken(PostgreSQLParser.K_WINDOW, 0); }
		public List<Window_nameContext> window_name() {
			return getRuleContexts(Window_nameContext.class);
		}
		public Window_nameContext window_name(int i) {
			return getRuleContext(Window_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(PostgreSQLParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(PostgreSQLParser.K_AS, i);
		}
		public List<Window_definitionContext> window_definition() {
			return getRuleContexts(Window_definitionContext.class);
		}
		public Window_definitionContext window_definition(int i) {
			return getRuleContext(Window_definitionContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode K_LIMIT() { return getToken(PostgreSQLParser.K_LIMIT, 0); }
		public TerminalNode K_OFFSET() { return getToken(PostgreSQLParser.K_OFFSET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode K_FETCH() { return getToken(PostgreSQLParser.K_FETCH, 0); }
		public TerminalNode K_ONLY() { return getToken(PostgreSQLParser.K_ONLY, 0); }
		public List<Locking_clauseContext> locking_clause() {
			return getRuleContexts(Locking_clauseContext.class);
		}
		public Locking_clauseContext locking_clause(int i) {
			return getRuleContext(Locking_clauseContext.class,i);
		}
		public List<TerminalNode> K_ALL() { return getTokens(PostgreSQLParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(PostgreSQLParser.K_ALL, i);
		}
		public List<TerminalNode> K_DISTINCT() { return getTokens(PostgreSQLParser.K_DISTINCT); }
		public TerminalNode K_DISTINCT(int i) {
			return getToken(PostgreSQLParser.K_DISTINCT, i);
		}
		public TerminalNode K_UNION() { return getToken(PostgreSQLParser.K_UNION, 0); }
		public TerminalNode K_INTERSECT() { return getToken(PostgreSQLParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(PostgreSQLParser.K_EXCEPT, 0); }
		public TerminalNode K_FIRST() { return getToken(PostgreSQLParser.K_FIRST, 0); }
		public TerminalNode K_NEXT() { return getToken(PostgreSQLParser.K_NEXT, 0); }
		public List<TerminalNode> K_ROW() { return getTokens(PostgreSQLParser.K_ROW); }
		public TerminalNode K_ROW(int i) {
			return getToken(PostgreSQLParser.K_ROW, i);
		}
		public List<TerminalNode> K_ROWS() { return getTokens(PostgreSQLParser.K_ROWS); }
		public TerminalNode K_ROWS(int i) {
			return getToken(PostgreSQLParser.K_ROWS, i);
		}
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public List<CountContext> count() {
			return getRuleContexts(CountContext.class);
		}
		public CountContext count(int i) {
			return getRuleContext(CountContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1039);
				match(K_WITH);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1040);
					match(K_RECURSIVE);
					}
				}

				setState(1043);
				with_query();
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1044);
					match(T__2);
					setState(1045);
					with_query();
					}
					}
					setState(1050);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1053);
			match(K_SELECT);
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1054);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1055);
					match(K_ON);
					setState(1056);
					match(T__1);
					setState(1057);
					expr(0);
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1058);
						match(T__2);
						setState(1059);
						expr(0);
						}
						}
						setState(1064);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1065);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1071);
				match(T__5);
				}
				break;
			case 2:
				{
				{
				setState(1072);
				select_expr();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1073);
					match(T__2);
					setState(1074);
					select_expr();
					}
					}
					setState(1079);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(1082);
				match(K_FROM);
				setState(1083);
				from_item_list();
				}
			}

			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1086);
				match(K_WHERE);
				setState(1087);
				where_condition();
				}
			}

			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(1090);
				match(K_GROUP);
				setState(1091);
				match(K_BY);
				setState(1092);
				grouping_element();
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1093);
					match(T__2);
					setState(1094);
					grouping_element();
					}
					}
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_HAVING) {
				{
				setState(1102);
				match(K_HAVING);
				setState(1103);
				having_condition();
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1104);
					match(T__2);
					setState(1105);
					having_condition();
					}
					}
					setState(1110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WINDOW) {
				{
				setState(1113);
				match(K_WINDOW);
				setState(1114);
				window_name();
				setState(1115);
				match(K_AS);
				setState(1116);
				match(T__1);
				setState(1117);
				window_definition();
				setState(1118);
				match(T__3);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1119);
					match(T__2);
					setState(1120);
					window_name();
					setState(1121);
					match(K_AS);
					setState(1122);
					match(T__1);
					setState(1123);
					window_definition();
					setState(1124);
					match(T__3);
					}
					}
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				setState(1133);
				_la = _input.LA(1);
				if ( !(_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1134);
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

				setState(1137);
				select_stmt();
				}
			}

			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1140);
				order_by_clause();
				}
				break;
			}
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1143);
				match(K_LIMIT);
				setState(1146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case INTEGER_VALUE:
					{
					setState(1144);
					count();
					}
					break;
				case K_ALL:
					{
					setState(1145);
					match(K_ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1150);
				match(K_OFFSET);
				setState(1151);
				start();
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ROW || _la==K_ROWS) {
					{
					setState(1152);
					_la = _input.LA(1);
					if ( !(_la==K_ROW || _la==K_ROWS) ) {
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
			}
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1157);
				match(K_FETCH);
				setState(1158);
				_la = _input.LA(1);
				if ( !(_la==K_FIRST || _la==K_NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==INTEGER_VALUE) {
					{
					setState(1159);
					count();
					}
				}

				setState(1162);
				_la = _input.LA(1);
				if ( !(_la==K_ROW || _la==K_ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1163);
				match(K_ONLY);
				}
				break;
			}
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1166);
					locking_clause();
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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

	public static class Locking_clauseContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(PostgreSQLParser.K_FOR, 0); }
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_KEY() { return getToken(PostgreSQLParser.K_KEY, 0); }
		public TerminalNode K_SHARE() { return getToken(PostgreSQLParser.K_SHARE, 0); }
		public TerminalNode K_OF() { return getToken(PostgreSQLParser.K_OF, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode K_NOWAIT() { return getToken(PostgreSQLParser.K_NOWAIT, 0); }
		public TerminalNode K_SKIP() { return getToken(PostgreSQLParser.K_SKIP, 0); }
		public TerminalNode K_LOCKED() { return getToken(PostgreSQLParser.K_LOCKED, 0); }
		public Locking_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locking_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLocking_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLocking_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLocking_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Locking_clauseContext locking_clause() throws RecognitionException {
		Locking_clauseContext _localctx = new Locking_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_locking_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(K_FOR);
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UPDATE:
				{
				setState(1173);
				match(K_UPDATE);
				}
				break;
			case K_NO:
				{
				setState(1174);
				match(K_NO);
				setState(1175);
				match(K_KEY);
				setState(1176);
				match(K_UPDATE);
				}
				break;
			case K_SHARE:
				{
				setState(1177);
				match(K_SHARE);
				}
				break;
			case K_KEY:
				{
				setState(1178);
				match(K_KEY);
				setState(1179);
				match(K_SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(1182);
				match(K_OF);
				setState(1183);
				table_name();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1184);
					match(T__2);
					setState(1185);
					table_name();
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NOWAIT:
				{
				setState(1193);
				match(K_NOWAIT);
				}
				break;
			case K_SKIP:
				{
				setState(1194);
				match(K_SKIP);
				setState(1195);
				match(K_LOCKED);
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FETCH:
			case K_FOR:
			case K_INSERT:
			case K_LIMIT:
			case K_OFFSET:
			case K_ON:
			case K_ORDER:
			case K_RETURNING:
			case K_SELECT:
			case K_UPDATE:
			case K_WITH:
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_start);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				match(INTEGER_VALUE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(T__1);
				setState(1200);
				expr(0);
				setState(1201);
				match(T__3);
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

	public static class CountContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_count);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(INTEGER_VALUE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(T__1);
				setState(1207);
				expr(0);
				setState(1208);
				match(T__3);
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

	public static class Where_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWhere_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWhere_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWhere_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_conditionContext where_condition() throws RecognitionException {
		Where_conditionContext _localctx = new Where_conditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_where_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			expr(0);
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

	public static class Having_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Having_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterHaving_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitHaving_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitHaving_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_conditionContext having_condition() throws RecognitionException {
		Having_conditionContext _localctx = new Having_conditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_having_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			expr(0);
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

	public static class Grouping_elementContext extends ParserRuleContext {
		public List<Grouping_base_elementContext> grouping_base_element() {
			return getRuleContexts(Grouping_base_elementContext.class);
		}
		public Grouping_base_elementContext grouping_base_element(int i) {
			return getRuleContext(Grouping_base_elementContext.class,i);
		}
		public TerminalNode K_ROLLUP() { return getToken(PostgreSQLParser.K_ROLLUP, 0); }
		public TerminalNode K_CUBE() { return getToken(PostgreSQLParser.K_CUBE, 0); }
		public TerminalNode K_GROUPING() { return getToken(PostgreSQLParser.K_GROUPING, 0); }
		public TerminalNode K_SETS() { return getToken(PostgreSQLParser.K_SETS, 0); }
		public List<Grouping_elementContext> grouping_element() {
			return getRuleContexts(Grouping_elementContext.class);
		}
		public Grouping_elementContext grouping_element(int i) {
			return getRuleContext(Grouping_elementContext.class,i);
		}
		public Grouping_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterGrouping_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitGrouping_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitGrouping_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_elementContext grouping_element() throws RecognitionException {
		Grouping_elementContext _localctx = new Grouping_elementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_grouping_element);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				match(T__1);
				setState(1217);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				grouping_base_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
				match(K_ROLLUP);
				setState(1220);
				match(T__1);
				setState(1221);
				grouping_base_element();
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1222);
					match(T__2);
					setState(1223);
					grouping_base_element();
					}
					}
					setState(1228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1229);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1231);
				match(K_CUBE);
				setState(1232);
				match(T__1);
				setState(1233);
				grouping_base_element();
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1234);
					match(T__2);
					setState(1235);
					grouping_base_element();
					}
					}
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1241);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1243);
				match(K_GROUPING);
				setState(1244);
				match(K_SETS);
				setState(1245);
				match(T__1);
				setState(1246);
				grouping_element();
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1247);
					match(T__2);
					setState(1248);
					grouping_element();
					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1254);
				match(T__3);
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

	public static class Grouping_base_elementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Grouping_base_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_base_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterGrouping_base_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitGrouping_base_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitGrouping_base_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_base_elementContext grouping_base_element() throws RecognitionException {
		Grouping_base_elementContext _localctx = new Grouping_base_elementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_grouping_base_element);
		int _la;
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(T__1);
				setState(1260);
				expr(0);
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1261);
					match(T__2);
					setState(1262);
					expr(0);
					}
					}
					setState(1267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1268);
				match(T__3);
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

	public static class Select_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSelect_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSelect_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_select_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			expr(0);
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(1273);
				match(K_AS);
				setState(1274);
				alias_name();
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

	public static class From_item_listContext extends ParserRuleContext {
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public From_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrom_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrom_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrom_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_item_listContext from_item_list() throws RecognitionException {
		From_item_listContext _localctx = new From_item_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_from_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			from_item(0);
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1278);
				match(T__2);
				setState(1279);
				from_item(0);
				}
				}
				setState(1284);
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

	public static class From_itemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(PostgreSQLParser.K_ONLY, 0); }
		public Alias_clauseContext alias_clause() {
			return getRuleContext(Alias_clauseContext.class,0);
		}
		public TerminalNode K_TABLESAMPLE() { return getToken(PostgreSQLParser.K_TABLESAMPLE, 0); }
		public Sampling_method_nameContext sampling_method_name() {
			return getRuleContext(Sampling_method_nameContext.class,0);
		}
		public List<Sampling_method_argumentContext> sampling_method_argument() {
			return getRuleContexts(Sampling_method_argumentContext.class);
		}
		public Sampling_method_argumentContext sampling_method_argument(int i) {
			return getRuleContext(Sampling_method_argumentContext.class,i);
		}
		public TerminalNode K_REPEATABLE() { return getToken(PostgreSQLParser.K_REPEATABLE, 0); }
		public SeedContext seed() {
			return getRuleContext(SeedContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_LATERAL() { return getToken(PostgreSQLParser.K_LATERAL, 0); }
		public With_query_nameContext with_query_name() {
			return getRuleContext(With_query_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_ORDINALITY() { return getToken(PostgreSQLParser.K_ORDINALITY, 0); }
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public List<Function_elementContext> function_element() {
			return getRuleContexts(Function_elementContext.class);
		}
		public Function_elementContext function_element(int i) {
			return getRuleContext(Function_elementContext.class,i);
		}
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode K_NATURAL() { return getToken(PostgreSQLParser.K_NATURAL, 0); }
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public From_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrom_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrom_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrom_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_itemContext from_item() throws RecognitionException {
		return from_item(0);
	}

	private From_itemContext from_item(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		From_itemContext _localctx = new From_itemContext(_ctx, _parentState);
		From_itemContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_from_item, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1286);
					match(K_ONLY);
					}
					break;
				}
				setState(1289);
				table_name();
				setState(1291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1290);
					match(T__5);
					}
					break;
				}
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1293);
					alias_clause();
					}
					break;
				}
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1296);
					match(K_TABLESAMPLE);
					setState(1297);
					sampling_method_name();
					setState(1298);
					match(T__1);
					setState(1299);
					sampling_method_argument();
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1300);
						match(T__2);
						setState(1301);
						sampling_method_argument();
						}
						}
						setState(1306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1307);
					match(T__3);
					setState(1313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1308);
						match(K_REPEATABLE);
						setState(1309);
						match(T__1);
						setState(1310);
						seed();
						setState(1311);
						match(T__3);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LATERAL) {
					{
					setState(1317);
					match(K_LATERAL);
					}
				}

				setState(1320);
				match(T__1);
				setState(1321);
				select_stmt();
				setState(1322);
				match(T__3);
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1323);
					alias_clause();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1326);
				with_query_name();
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1327);
					alias_clause();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1330);
					match(K_LATERAL);
					}
					break;
				}
				setState(1333);
				function_name();
				setState(1334);
				match(T__1);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(1335);
					expr(0);
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1336);
						match(T__2);
						setState(1337);
						expr(0);
						}
						}
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1345);
				match(T__3);
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1346);
					match(K_WITH);
					setState(1347);
					match(K_ORDINALITY);
					}
					break;
				}
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1350);
					alias_clause();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1353);
					match(K_LATERAL);
					}
					break;
				}
				setState(1356);
				function_name();
				setState(1357);
				match(T__1);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(1358);
					expr(0);
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1359);
						match(T__2);
						setState(1360);
						expr(0);
						}
						}
						setState(1365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1368);
				match(T__3);
				setState(1369);
				alias_clause();
				}
				break;
			case 6:
				{
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1371);
					match(K_LATERAL);
					}
					break;
				}
				setState(1374);
				function_name();
				setState(1375);
				match(T__1);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(1376);
					expr(0);
					setState(1381);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1377);
						match(T__2);
						setState(1378);
						expr(0);
						}
						}
						setState(1383);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1386);
				match(T__3);
				setState(1387);
				match(K_AS);
				setState(1388);
				match(T__1);
				setState(1389);
				column_name();
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1390);
					match(T__2);
					setState(1391);
					column_name();
					}
					}
					setState(1396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1397);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LATERAL) {
					{
					setState(1399);
					match(K_LATERAL);
					}
				}

				setState(1402);
				match(K_ROWS);
				setState(1403);
				match(K_FROM);
				setState(1404);
				match(T__1);
				setState(1405);
				function_element();
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1406);
					match(T__2);
					setState(1407);
					function_element();
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1413);
				match(T__3);
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1414);
					match(K_WITH);
					setState(1415);
					match(K_ORDINALITY);
					}
					break;
				}
				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1418);
					alias_clause();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new From_itemContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_from_item);
					setState(1423);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NATURAL) {
						{
						setState(1424);
						match(K_NATURAL);
						}
					}

					setState(1427);
					join_type();
					setState(1428);
					from_item(0);
					setState(1443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						{
						setState(1429);
						match(K_ON);
						setState(1430);
						join_condition();
						}
						}
						break;
					case 2:
						{
						{
						setState(1431);
						match(K_USING);
						setState(1432);
						match(T__1);
						setState(1433);
						column_name();
						setState(1438);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(1434);
							match(T__2);
							setState(1435);
							column_name();
							}
							}
							setState(1440);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1441);
						match(T__3);
						}
						}
						break;
					}
					}
					} 
				}
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(PostgreSQLParser.K_JOIN, 0); }
		public TerminalNode K_INNER() { return getToken(PostgreSQLParser.K_INNER, 0); }
		public TerminalNode K_LEFT() { return getToken(PostgreSQLParser.K_LEFT, 0); }
		public TerminalNode K_OUTER() { return getToken(PostgreSQLParser.K_OUTER, 0); }
		public TerminalNode K_RIGHT() { return getToken(PostgreSQLParser.K_RIGHT, 0); }
		public TerminalNode K_FULL() { return getToken(PostgreSQLParser.K_FULL, 0); }
		public TerminalNode K_CROSS() { return getToken(PostgreSQLParser.K_CROSS, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_join_type);
		int _la;
		try {
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INNER:
			case K_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INNER) {
					{
					setState(1450);
					match(K_INNER);
					}
				}

				setState(1453);
				match(K_JOIN);
				}
				break;
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				match(K_LEFT);
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OUTER) {
					{
					setState(1455);
					match(K_OUTER);
					}
				}

				setState(1458);
				match(K_JOIN);
				}
				break;
			case K_RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1459);
				match(K_RIGHT);
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OUTER) {
					{
					setState(1460);
					match(K_OUTER);
					}
				}

				setState(1463);
				match(K_JOIN);
				}
				break;
			case K_FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1464);
				match(K_FULL);
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OUTER) {
					{
					setState(1465);
					match(K_OUTER);
					}
				}

				setState(1468);
				match(K_JOIN);
				}
				break;
			case K_CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1469);
				match(K_CROSS);
				setState(1470);
				match(K_JOIN);
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

	public static class Join_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			expr(0);
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

	public static class Function_elementContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Function_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFunction_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFunction_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFunction_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_elementContext function_element() throws RecognitionException {
		Function_elementContext _localctx = new Function_elementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_function_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			function_name();
			setState(1476);
			match(T__1);
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
				{
				setState(1477);
				expr(0);
				{
				setState(1478);
				match(T__2);
				setState(1479);
				expr(0);
				}
				}
			}

			setState(1483);
			match(T__3);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(1484);
				match(K_AS);
				setState(1485);
				match(T__1);
				setState(1486);
				column_name();
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1487);
					match(T__2);
					setState(1488);
					column_name();
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1494);
				match(T__3);
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

	public static class Alias_clauseContext extends ParserRuleContext {
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public List<Column_alias_nameContext> column_alias_name() {
			return getRuleContexts(Column_alias_nameContext.class);
		}
		public Column_alias_nameContext column_alias_name(int i) {
			return getRuleContext(Column_alias_nameContext.class,i);
		}
		public Alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAlias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAlias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAlias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_clauseContext alias_clause() throws RecognitionException {
		Alias_clauseContext _localctx = new Alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(1498);
				match(K_AS);
				}
			}

			setState(1501);
			alias_name();
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1502);
				match(T__1);
				setState(1503);
				column_alias_name();
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1504);
					match(T__2);
					setState(1505);
					column_alias_name();
					}
					}
					setState(1510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1511);
				match(T__3);
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

	public static class Column_alias_nameContext extends ParserRuleContext {
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public Column_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_alias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_alias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_alias_nameContext column_alias_name() throws RecognitionException {
		Column_alias_nameContext _localctx = new Column_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			alias_name();
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

	public static class Sampling_method_nameContext extends ParserRuleContext {
		public TerminalNode K_BERNOULLI() { return getToken(PostgreSQLParser.K_BERNOULLI, 0); }
		public TerminalNode K_SYSTEM() { return getToken(PostgreSQLParser.K_SYSTEM, 0); }
		public Sampling_method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampling_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSampling_method_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSampling_method_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSampling_method_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sampling_method_nameContext sampling_method_name() throws RecognitionException {
		Sampling_method_nameContext _localctx = new Sampling_method_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sampling_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_la = _input.LA(1);
			if ( !(_la==K_BERNOULLI || _la==K_SYSTEM) ) {
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

	public static class Sampling_method_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sampling_method_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampling_method_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSampling_method_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSampling_method_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSampling_method_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sampling_method_argumentContext sampling_method_argument() throws RecognitionException {
		Sampling_method_argumentContext _localctx = new Sampling_method_argumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sampling_method_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			expr(0);
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

	public static class SeedContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeedContext seed() throws RecognitionException {
		SeedContext _localctx = new SeedContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_seed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			expr(0);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			column_name();
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1524);
				match(T__2);
				setState(1525);
				column_name();
				}
				}
				setState(1530);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
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
	public static class TableConstraintDefContext extends Create_definitionContext {
		public Table_contraintContext table_contraint() {
			return getRuleContext(Table_contraintContext.class,0);
		}
		public TableConstraintDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTableConstraintDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTableConstraintDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTableConstraintDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeDefContext extends Create_definitionContext {
		public TerminalNode K_LIKE() { return getToken(PostgreSQLParser.K_LIKE, 0); }
		public Source_tableContext source_table() {
			return getRuleContext(Source_tableContext.class,0);
		}
		public List<Like_optionContext> like_option() {
			return getRuleContexts(Like_optionContext.class);
		}
		public Like_optionContext like_option(int i) {
			return getRuleContext(Like_optionContext.class,i);
		}
		public LikeDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLikeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLikeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLikeDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnDefContext extends Create_definitionContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PostgreSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public ColumnDefContext(Create_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_definition);
		int _la;
		try {
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				_localctx = new ColumnDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				column_name();
				setState(1534);
				data_type(0);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(1535);
					match(K_COLLATE);
					setState(1536);
					collation_name();
					}
				}

				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CHECK || _la==K_CONSTRAINT || _la==K_DEFAULT || _la==K_NOT || _la==K_NULL || _la==K_PRIMARY || _la==K_REFERENCES || _la==K_UNIQUE) {
					{
					{
					setState(1539);
					column_constraint();
					}
					}
					setState(1544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new TableConstraintDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				table_contraint();
				}
				break;
			case 3:
				_localctx = new LikeDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1546);
				match(K_LIKE);
				setState(1547);
				source_table();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_EXCLUDING || _la==K_INCLUDING) {
					{
					{
					setState(1548);
					like_option();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(PostgreSQLParser.K_NULL, 0); }
		public TerminalNode K_CHECK() { return getToken(PostgreSQLParser.K_CHECK, 0); }
		public Check_exprContext check_expr() {
			return getRuleContext(Check_exprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(PostgreSQLParser.K_DEFAULT, 0); }
		public Default_exprContext default_expr() {
			return getRuleContext(Default_exprContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(PostgreSQLParser.K_UNIQUE, 0); }
		public Index_parametersContext index_parameters() {
			return getRuleContext(Index_parametersContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(PostgreSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(PostgreSQLParser.K_KEY, 0); }
		public TerminalNode K_REFERENCES() { return getToken(PostgreSQLParser.K_REFERENCES, 0); }
		public ReftableContext reftable() {
			return getRuleContext(ReftableContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(PostgreSQLParser.K_CONSTRAINT, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public Deferrable_optionContext deferrable_option() {
			return getRuleContext(Deferrable_optionContext.class,0);
		}
		public TerminalNode K_INITIALLY() { return getToken(PostgreSQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(PostgreSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PostgreSQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_INHERIT() { return getToken(PostgreSQLParser.K_INHERIT, 0); }
		public RefColumnContext refColumn() {
			return getRuleContext(RefColumnContext.class,0);
		}
		public TerminalNode K_MATCH() { return getToken(PostgreSQLParser.K_MATCH, 0); }
		public List<TerminalNode> K_ON() { return getTokens(PostgreSQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(PostgreSQLParser.K_ON, i);
		}
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public On_delete_actionContext on_delete_action() {
			return getRuleContext(On_delete_actionContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public On_update_actionContext on_update_action() {
			return getRuleContext(On_update_actionContext.class,0);
		}
		public TerminalNode K_FULL() { return getToken(PostgreSQLParser.K_FULL, 0); }
		public TerminalNode K_PARTIAL() { return getToken(PostgreSQLParser.K_PARTIAL, 0); }
		public TerminalNode K_SIMPLE() { return getToken(PostgreSQLParser.K_SIMPLE, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1556);
				match(K_CONSTRAINT);
				setState(1557);
				constraint_name();
				}
			}

			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NOT:
				{
				setState(1560);
				match(K_NOT);
				setState(1561);
				match(K_NULL);
				}
				break;
			case K_NULL:
				{
				setState(1562);
				match(K_NULL);
				}
				break;
			case K_CHECK:
				{
				setState(1563);
				match(K_CHECK);
				setState(1564);
				match(T__1);
				setState(1565);
				check_expr();
				setState(1566);
				match(T__3);
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NO) {
					{
					setState(1567);
					match(K_NO);
					setState(1568);
					match(K_INHERIT);
					}
				}

				}
				break;
			case K_DEFAULT:
				{
				setState(1571);
				match(K_DEFAULT);
				setState(1572);
				default_expr();
				}
				break;
			case K_UNIQUE:
				{
				setState(1573);
				match(K_UNIQUE);
				setState(1574);
				index_parameters();
				}
				break;
			case K_PRIMARY:
				{
				setState(1575);
				match(K_PRIMARY);
				setState(1576);
				match(K_KEY);
				setState(1577);
				index_parameters();
				}
				break;
			case K_REFERENCES:
				{
				setState(1578);
				match(K_REFERENCES);
				setState(1579);
				reftable();
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1580);
					match(T__1);
					setState(1581);
					refColumn();
					setState(1582);
					match(T__3);
					}
				}

				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_MATCH) {
					{
					setState(1586);
					match(K_MATCH);
					setState(1587);
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
				}

				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1590);
					match(K_ON);
					setState(1591);
					match(K_DELETE);
					setState(1592);
					on_delete_action();
					}
					break;
				}
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(1595);
					match(K_ON);
					setState(1596);
					match(K_UPDATE);
					setState(1597);
					on_update_action();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1602);
				deferrable_option();
				}
				break;
			}
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1605);
				match(K_INITIALLY);
				setState(1606);
				match(K_DEFERRED);
				}
				break;
			case 2:
				{
				setState(1607);
				match(K_INITIALLY);
				setState(1608);
				match(K_IMMEDIATE);
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

	public static class Deferrable_optionContext extends ParserRuleContext {
		public TerminalNode K_DEFERRABLE() { return getToken(PostgreSQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public Deferrable_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferrable_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDeferrable_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDeferrable_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDeferrable_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deferrable_optionContext deferrable_option() throws RecognitionException {
		Deferrable_optionContext _localctx = new Deferrable_optionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_deferrable_option);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(K_DEFERRABLE);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(K_NOT);
				setState(1613);
				match(K_DEFERRABLE);
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

	public static class Table_contraintContext extends ParserRuleContext {
		public TerminalNode K_CHECK() { return getToken(PostgreSQLParser.K_CHECK, 0); }
		public Check_exprContext check_expr() {
			return getRuleContext(Check_exprContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(PostgreSQLParser.K_UNIQUE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Index_parametersContext index_parameters() {
			return getRuleContext(Index_parametersContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(PostgreSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(PostgreSQLParser.K_KEY, 0); }
		public TerminalNode K_EXCLUDE() { return getToken(PostgreSQLParser.K_EXCLUDE, 0); }
		public List<Exclude_exprContext> exclude_expr() {
			return getRuleContexts(Exclude_exprContext.class);
		}
		public Exclude_exprContext exclude_expr(int i) {
			return getRuleContext(Exclude_exprContext.class,i);
		}
		public TerminalNode K_FOREIGN() { return getToken(PostgreSQLParser.K_FOREIGN, 0); }
		public TerminalNode K_REFERENCES() { return getToken(PostgreSQLParser.K_REFERENCES, 0); }
		public ReftableContext reftable() {
			return getRuleContext(ReftableContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(PostgreSQLParser.K_CONSTRAINT, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public Deferrable_optionContext deferrable_option() {
			return getRuleContext(Deferrable_optionContext.class,0);
		}
		public TerminalNode K_INITIALLY() { return getToken(PostgreSQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(PostgreSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PostgreSQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_INHERIT() { return getToken(PostgreSQLParser.K_INHERIT, 0); }
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public Index_methodContext index_method() {
			return getRuleContext(Index_methodContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public PredictContext predict() {
			return getRuleContext(PredictContext.class,0);
		}
		public List<RefColumnContext> refColumn() {
			return getRuleContexts(RefColumnContext.class);
		}
		public RefColumnContext refColumn(int i) {
			return getRuleContext(RefColumnContext.class,i);
		}
		public TerminalNode K_MATCH() { return getToken(PostgreSQLParser.K_MATCH, 0); }
		public List<TerminalNode> K_ON() { return getTokens(PostgreSQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(PostgreSQLParser.K_ON, i);
		}
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public On_delete_actionContext on_delete_action() {
			return getRuleContext(On_delete_actionContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public On_update_actionContext on_update_action() {
			return getRuleContext(On_update_actionContext.class,0);
		}
		public TerminalNode K_FULL() { return getToken(PostgreSQLParser.K_FULL, 0); }
		public TerminalNode K_PARTIAL() { return getToken(PostgreSQLParser.K_PARTIAL, 0); }
		public TerminalNode K_SIMPLE() { return getToken(PostgreSQLParser.K_SIMPLE, 0); }
		public Table_contraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_contraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_contraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_contraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_contraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_contraintContext table_contraint() throws RecognitionException {
		Table_contraintContext _localctx = new Table_contraintContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_table_contraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1616);
				match(K_CONSTRAINT);
				setState(1617);
				constraint_name();
				}
			}

			setState(1719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CHECK:
				{
				setState(1620);
				match(K_CHECK);
				setState(1621);
				match(T__1);
				setState(1622);
				check_expr();
				setState(1623);
				match(T__3);
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NO) {
					{
					setState(1624);
					match(K_NO);
					setState(1625);
					match(K_INHERIT);
					}
				}

				}
				break;
			case K_UNIQUE:
				{
				setState(1628);
				match(K_UNIQUE);
				setState(1629);
				match(T__1);
				setState(1630);
				column_name();
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1631);
					match(T__2);
					setState(1632);
					column_name();
					}
					}
					setState(1637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1638);
				match(T__3);
				setState(1639);
				index_parameters();
				}
				break;
			case K_PRIMARY:
				{
				setState(1641);
				match(K_PRIMARY);
				setState(1642);
				match(K_KEY);
				setState(1643);
				match(T__1);
				setState(1644);
				column_name();
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1645);
					match(T__2);
					setState(1646);
					column_name();
					}
					}
					setState(1651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1652);
				match(T__3);
				setState(1653);
				index_parameters();
				}
				break;
			case K_EXCLUDE:
				{
				setState(1655);
				match(K_EXCLUDE);
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_USING) {
					{
					setState(1656);
					match(K_USING);
					setState(1657);
					index_method();
					}
				}

				setState(1660);
				match(T__1);
				setState(1661);
				exclude_expr();
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1662);
					match(T__2);
					setState(1663);
					exclude_expr();
					}
					}
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1669);
				match(T__3);
				setState(1670);
				index_parameters();
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1671);
					match(K_WHERE);
					setState(1672);
					match(T__1);
					setState(1673);
					predict();
					setState(1674);
					match(T__3);
					}
				}

				}
				break;
			case K_FOREIGN:
				{
				setState(1678);
				match(K_FOREIGN);
				setState(1679);
				match(K_KEY);
				setState(1680);
				match(T__1);
				setState(1681);
				column_name();
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1682);
					match(T__2);
					setState(1683);
					column_name();
					}
					}
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1689);
				match(T__3);
				setState(1690);
				match(K_REFERENCES);
				setState(1691);
				reftable();
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1692);
					match(T__1);
					setState(1693);
					refColumn();
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1694);
						match(T__2);
						setState(1695);
						refColumn();
						}
						}
						setState(1700);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1701);
					match(T__3);
					}
				}

				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_MATCH) {
					{
					setState(1705);
					match(K_MATCH);
					setState(1706);
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
				}

				setState(1712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1709);
					match(K_ON);
					setState(1710);
					match(K_DELETE);
					setState(1711);
					on_delete_action();
					}
					break;
				}
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(1714);
					match(K_ON);
					setState(1715);
					match(K_UPDATE);
					setState(1716);
					on_update_action();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFERRABLE || _la==K_NOT) {
				{
				setState(1721);
				deferrable_option();
				}
			}

			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1724);
				match(K_INITIALLY);
				setState(1725);
				match(K_DEFERRED);
				}
				break;
			case 2:
				{
				setState(1726);
				match(K_INITIALLY);
				setState(1727);
				match(K_IMMEDIATE);
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

	public static class Like_optionContext extends ParserRuleContext {
		public TerminalNode K_INCLUDING() { return getToken(PostgreSQLParser.K_INCLUDING, 0); }
		public TerminalNode K_EXCLUDING() { return getToken(PostgreSQLParser.K_EXCLUDING, 0); }
		public TerminalNode K_DEFAULTS() { return getToken(PostgreSQLParser.K_DEFAULTS, 0); }
		public TerminalNode K_CONSTRAINTS() { return getToken(PostgreSQLParser.K_CONSTRAINTS, 0); }
		public TerminalNode K_INDEXES() { return getToken(PostgreSQLParser.K_INDEXES, 0); }
		public TerminalNode K_STORAGE() { return getToken(PostgreSQLParser.K_STORAGE, 0); }
		public TerminalNode K_COMMENTS() { return getToken(PostgreSQLParser.K_COMMENTS, 0); }
		public TerminalNode K_ALL() { return getToken(PostgreSQLParser.K_ALL, 0); }
		public Like_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLike_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLike_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLike_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Like_optionContext like_option() throws RecognitionException {
		Like_optionContext _localctx = new Like_optionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_like_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !(_la==K_EXCLUDING || _la==K_INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1731);
			_la = _input.LA(1);
			if ( !(_la==K_ALL || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (K_COMMENTS - 125)) | (1L << (K_CONSTRAINTS - 125)) | (1L << (K_DEFAULTS - 125)))) != 0) || _la==K_INDEXES || _la==K_STORAGE) ) {
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

	public static class Exclude_exprContext extends ParserRuleContext {
		public Exclude_itemContext exclude_item() {
			return getRuleContext(Exclude_itemContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Exclude_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterExclude_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitExclude_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitExclude_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_exprContext exclude_expr() throws RecognitionException {
		Exclude_exprContext _localctx = new Exclude_exprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exclude_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			exclude_item();
			setState(1734);
			match(K_WITH);
			setState(1735);
			operator();
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

	public static class Exclude_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpClass_nameContext opClass_name() {
			return getRuleContext(OpClass_nameContext.class,0);
		}
		public TerminalNode K_NULLS() { return getToken(PostgreSQLParser.K_NULLS, 0); }
		public TerminalNode K_ASC() { return getToken(PostgreSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(PostgreSQLParser.K_DESC, 0); }
		public TerminalNode K_FIRST() { return getToken(PostgreSQLParser.K_FIRST, 0); }
		public TerminalNode K_LAST() { return getToken(PostgreSQLParser.K_LAST, 0); }
		public Exclude_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterExclude_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitExclude_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitExclude_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_itemContext exclude_item() throws RecognitionException {
		Exclude_itemContext _localctx = new Exclude_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_exclude_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(1737);
				column_name();
				}
				break;
			case T__1:
				{
				setState(1738);
				match(T__1);
				setState(1739);
				expr(0);
				setState(1740);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) {
				{
				setState(1744);
				opClass_name();
				}
			}

			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1747);
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

			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NULLS) {
				{
				setState(1750);
				match(K_NULLS);
				setState(1751);
				_la = _input.LA(1);
				if ( !(_la==K_FIRST || _la==K_LAST) ) {
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

	public static class Check_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Check_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCheck_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCheck_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCheck_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_exprContext check_expr() throws RecognitionException {
		Check_exprContext _localctx = new Check_exprContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_check_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			expr(0);
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

	public static class Default_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Default_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDefault_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDefault_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDefault_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_exprContext default_expr() throws RecognitionException {
		Default_exprContext _localctx = new Default_exprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_default_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			expr(0);
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

	public static class PredictContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PredictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterPredict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitPredict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitPredict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredictContext predict() throws RecognitionException {
		PredictContext _localctx = new PredictContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_predict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			expr(0);
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

	public static class ReftableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ReftableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reftable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterReftable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitReftable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitReftable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReftableContext reftable() throws RecognitionException {
		ReftableContext _localctx = new ReftableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_reftable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			table_name();
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

	public static class RefColumnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public RefColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterRefColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitRefColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitRefColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefColumnContext refColumn() throws RecognitionException {
		RefColumnContext _localctx = new RefColumnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_refColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			column_name();
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

	public static class Index_parametersContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public List<Storage_paramContext> storage_param() {
			return getRuleContexts(Storage_paramContext.class);
		}
		public Storage_paramContext storage_param(int i) {
			return getRuleContext(Storage_paramContext.class,i);
		}
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public TerminalNode K_INDEX() { return getToken(PostgreSQLParser.K_INDEX, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public Tablespace_nameContext tablespace_name() {
			return getRuleContext(Tablespace_nameContext.class,0);
		}
		public Index_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterIndex_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitIndex_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitIndex_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_parametersContext index_parameters() throws RecognitionException {
		Index_parametersContext _localctx = new Index_parametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_index_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1764);
				match(K_WITH);
				setState(1765);
				match(T__1);
				setState(1766);
				storage_param();
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1767);
					match(T__2);
					setState(1768);
					storage_param();
					}
					}
					setState(1773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1774);
				match(T__3);
				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1778);
				match(K_USING);
				setState(1779);
				match(K_INDEX);
				setState(1780);
				match(K_TABLESPACE);
				setState(1781);
				tablespace_name();
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

	public static class Source_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Source_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSource_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSource_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSource_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_tableContext source_table() throws RecognitionException {
		Source_tableContext _localctx = new Source_tableContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_source_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			table_name();
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOn_delete_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOn_delete_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOn_delete_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_delete_actionContext on_delete_action() throws RecognitionException {
		On_delete_actionContext _localctx = new On_delete_actionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_on_delete_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOn_update_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOn_update_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOn_update_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_update_actionContext on_update_action() throws RecognitionException {
		On_update_actionContext _localctx = new On_update_actionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_on_update_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
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
		public TerminalNode K_RESTRICT() { return getToken(PostgreSQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(PostgreSQLParser.K_CASCADE, 0); }
		public TerminalNode K_SET() { return getToken(PostgreSQLParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(PostgreSQLParser.K_NULL, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_ACTION() { return getToken(PostgreSQLParser.K_ACTION, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_action);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1790);
				match(K_RESTRICT);
				}
				break;
			case K_CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1791);
				match(K_CASCADE);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1792);
				match(K_SET);
				setState(1793);
				match(K_NULL);
				}
				break;
			case K_NO:
				enterOuterAlt(_localctx, 4);
				{
				setState(1794);
				match(K_NO);
				setState(1795);
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

	public static class Collation_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_constantContext string_constant() {
			return getRuleContext(String_constantContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_collation_name);
		try {
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				identifier();
				}
				break;
			case QUOTED_STRING:
			case UNICODE_ESCAPED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				string_constant();
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_name);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				identifier();
				}
				break;
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
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

	public static class ExprContext extends ParserRuleContext {
		public Array_constructorContext array_constructor() {
			return getRuleContext(Array_constructorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Custom_opContext custom_op() {
			return getRuleContext(Custom_opContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public Condition_exprContext condition_expr() {
			return getRuleContext(Condition_exprContext.class,0);
		}
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public TerminalNode K_BETWEEN() { return getToken(PostgreSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(PostgreSQLParser.K_AND, 0); }
		public TerminalNode K_SYMMETRIC() { return getToken(PostgreSQLParser.K_SYMMETRIC, 0); }
		public TerminalNode K_IN() { return getToken(PostgreSQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(PostgreSQLParser.K_LIKE, 0); }
		public TerminalNode K_ILIKE() { return getToken(PostgreSQLParser.K_ILIKE, 0); }
		public TerminalNode K_SIMILAR() { return getToken(PostgreSQLParser.K_SIMILAR, 0); }
		public TerminalNode K_TO() { return getToken(PostgreSQLParser.K_TO, 0); }
		public TerminalNode K_IS() { return getToken(PostgreSQLParser.K_IS, 0); }
		public TerminalNode K_DISTINCT() { return getToken(PostgreSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public TerminalNode K_OR() { return getToken(PostgreSQLParser.K_OR, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(PostgreSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(PostgreSQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(PostgreSQLParser.K_FALSE, 0); }
		public TerminalNode K_NULL() { return getToken(PostgreSQLParser.K_NULL, 0); }
		public TerminalNode K_UNKNOWN() { return getToken(PostgreSQLParser.K_UNKNOWN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1807);
				array_constructor();
				}
				break;
			case 2:
				{
				setState(1808);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1809);
				expr(20);
				}
				break;
			case 3:
				{
				setState(1810);
				custom_op();
				setState(1811);
				expr(16);
				}
				break;
			case 4:
				{
				{
				setState(1813);
				match(K_EXISTS);
				}
				setState(1814);
				match(T__1);
				setState(1815);
				select_stmt();
				setState(1816);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(1818);
				match(K_NOT);
				setState(1819);
				expr(5);
				}
				break;
			case 6:
				{
				setState(1820);
				condition_expr();
				}
				break;
			case 7:
				{
				setState(1821);
				value_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1911);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1824);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1825);
						match(T__12);
						setState(1826);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1827);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1828);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1829);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1830);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1831);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1832);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1833);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1834);
						custom_op();
						setState(1835);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1837);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1838);
							match(K_NOT);
							}
						}

						setState(1841);
						match(K_BETWEEN);
						setState(1843);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
						case 1:
							{
							setState(1842);
							match(K_SYMMETRIC);
							}
							break;
						}
						setState(1845);
						expr(0);
						setState(1846);
						match(K_AND);
						setState(1847);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1849);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1851);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1850);
							match(K_NOT);
							}
						}

						setState(1853);
						match(K_IN);
						setState(1854);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1855);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1857);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1856);
							match(K_NOT);
							}
						}

						setState(1863);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_LIKE:
							{
							setState(1859);
							match(K_LIKE);
							}
							break;
						case K_ILIKE:
							{
							setState(1860);
							match(K_ILIKE);
							}
							break;
						case K_SIMILAR:
							{
							{
							setState(1861);
							match(K_SIMILAR);
							setState(1862);
							match(K_TO);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1865);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1866);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1867);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1868);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1869);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1870);
						match(K_IS);
						setState(1872);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1871);
							match(K_NOT);
							}
						}

						setState(1874);
						match(K_DISTINCT);
						setState(1875);
						match(K_FROM);
						setState(1876);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1877);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1878);
						match(K_AND);
						setState(1879);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1880);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1881);
						match(K_OR);
						setState(1882);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1883);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1884);
						match(T__6);
						setState(1885);
						data_type(0);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1886);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1887);
						match(T__7);
						setState(1888);
						expr(0);
						setState(1891);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(1889);
							match(T__8);
							setState(1890);
							expr(0);
							}
						}

						setState(1893);
						match(T__9);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1895);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1896);
						custom_op();
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1897);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1898);
						match(K_COLLATE);
						setState(1902);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
						case 1:
							{
							setState(1899);
							schema_name();
							setState(1900);
							match(T__15);
							}
							break;
						}
						setState(1904);
						collation_name();
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1905);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1906);
						match(K_IS);
						setState(1908);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1907);
							match(K_NOT);
							}
						}

						setState(1910);
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
						break;
					}
					} 
				}
				setState(1915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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

	public static class OperatorContext extends ParserRuleContext {
		public Custom_opContext custom_op() {
			return getRuleContext(Custom_opContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(PostgreSQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(PostgreSQLParser.K_OR, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operator);
		try {
			setState(1932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case K_OPERATOR:
			case OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1916);
				custom_op();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1917);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(1918);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(1919);
				match(T__12);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1920);
				match(T__5);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(1921);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(1922);
				match(T__14);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(1923);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(1924);
				match(T__17);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1925);
				match(T__4);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(1926);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 12);
				{
				setState(1927);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 13);
				{
				setState(1928);
				match(T__20);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 14);
				{
				setState(1929);
				match(K_AND);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 15);
				{
				setState(1930);
				match(K_OR);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(1931);
				match(K_NOT);
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

	public static class Custom_opContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode K_OPERATOR() { return getToken(PostgreSQLParser.K_OPERATOR, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Operator_nameContext operator_name() {
			return getRuleContext(Operator_nameContext.class,0);
		}
		public Custom_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCustom_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCustom_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCustom_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custom_opContext custom_op() throws RecognitionException {
		Custom_opContext _localctx = new Custom_opContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_custom_op);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				match(OPERATOR);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				match(T__22);
				}
				break;
			case K_OPERATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1937);
				match(K_OPERATOR);
				setState(1938);
				match(T__1);
				setState(1939);
				schema_name();
				setState(1940);
				match(T__15);
				setState(1941);
				operator_name();
				setState(1942);
				match(T__3);
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

	public static class Operator_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Operator_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOperator_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOperator_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOperator_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_nameContext operator_name() throws RecognitionException {
		Operator_nameContext _localctx = new Operator_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_operator_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
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

	public static class Condition_exprContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(PostgreSQLParser.K_CASE, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(PostgreSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(PostgreSQLParser.K_WHEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(PostgreSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(PostgreSQLParser.K_THEN, i);
		}
		public TerminalNode K_END() { return getToken(PostgreSQLParser.K_END, 0); }
		public TerminalNode K_ELSE() { return getToken(PostgreSQLParser.K_ELSE, 0); }
		public Condition_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCondition_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCondition_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCondition_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_exprContext condition_expr() throws RecognitionException {
		Condition_exprContext _localctx = new Condition_exprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_condition_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			match(K_CASE);
			setState(1949);
			match(K_WHEN);
			setState(1950);
			expr(0);
			setState(1951);
			match(K_THEN);
			setState(1952);
			expr(0);
			setState(1960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_WHEN) {
				{
				{
				setState(1953);
				match(K_WHEN);
				setState(1954);
				expr(0);
				setState(1955);
				match(K_THEN);
				setState(1956);
				expr(0);
				}
				}
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(1963);
				match(K_ELSE);
				setState(1964);
				expr(0);
				}
			}

			setState(1967);
			match(K_END);
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

	public static class Value_exprContext extends ParserRuleContext {
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Aggregate_exprContext aggregate_expr() {
			return getRuleContext(Aggregate_exprContext.class,0);
		}
		public Window_func_callContext window_func_call() {
			return getRuleContext(Window_func_callContext.class,0);
		}
		public Cast_exprContext cast_expr() {
			return getRuleContext(Cast_exprContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode K_TIMESTAMP() { return getToken(PostgreSQLParser.K_TIMESTAMP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AT() { return getToken(PostgreSQLParser.K_AT, 0); }
		public List<TerminalNode> K_TIME() { return getTokens(PostgreSQLParser.K_TIME); }
		public TerminalNode K_TIME(int i) {
			return getToken(PostgreSQLParser.K_TIME, i);
		}
		public List<TerminalNode> K_ZONE() { return getTokens(PostgreSQLParser.K_ZONE); }
		public TerminalNode K_ZONE(int i) {
			return getToken(PostgreSQLParser.K_ZONE, i);
		}
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_ANY() { return getToken(PostgreSQLParser.K_ANY, 0); }
		public TerminalNode K_ALL() { return getToken(PostgreSQLParser.K_ALL, 0); }
		public TerminalNode K_SOME() { return getToken(PostgreSQLParser.K_SOME, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Value_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterValue_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitValue_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitValue_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_exprContext value_expr() throws RecognitionException {
		Value_exprContext _localctx = new Value_exprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_value_expr);
		int _la;
		try {
			setState(2035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969);
				constants();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1973);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						setState(1970);
						schema_name();
						setState(1971);
						match(T__15);
						}
						break;
					}
					setState(1975);
					table_name();
					setState(1976);
					match(T__15);
					}
					break;
				}
				setState(1980);
				column_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1981);
				match(T__1);
				setState(1990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1985);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
					case 1:
						{
						setState(1982);
						schema_name();
						setState(1983);
						match(T__15);
						}
						break;
					}
					setState(1987);
					table_name();
					setState(1988);
					match(T__15);
					}
					break;
				}
				setState(1992);
				column_name();
				setState(1993);
				match(T__3);
				setState(1994);
				match(T__15);
				setState(1995);
				column_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1997);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1998);
				aggregate_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1999);
				window_func_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2000);
				cast_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2001);
				var_name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2002);
				match(K_TIMESTAMP);
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2003);
					match(K_WITH);
					setState(2004);
					match(K_TIME);
					setState(2005);
					match(K_ZONE);
					}
					break;
				}
				setState(2008);
				expr(0);
				setState(2009);
				match(K_AT);
				setState(2010);
				match(K_TIME);
				setState(2011);
				match(K_ZONE);
				setState(2012);
				expr(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_ANY || _la==K_SOME) {
					{
					setState(2014);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_ANY || _la==K_SOME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2017);
				match(T__1);
				setState(2018);
				expr(0);
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2019);
					match(T__2);
					setState(2020);
					expr(0);
					}
					}
					setState(2025);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2026);
				match(T__3);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_ANY || _la==K_SOME) {
					{
					setState(2028);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_ANY || _la==K_SOME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2031);
				match(T__1);
				setState(2032);
				select_stmt();
				setState(2033);
				match(T__3);
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

	public static class Array_constructorContext extends ParserRuleContext {
		public TerminalNode K_ARRAY() { return getToken(PostgreSQLParser.K_ARRAY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Array_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterArray_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitArray_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitArray_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_constructorContext array_constructor() throws RecognitionException {
		Array_constructorContext _localctx = new Array_constructorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_array_constructor);
		int _la;
		try {
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2037);
				match(K_ARRAY);
				setState(2038);
				match(T__7);
				setState(2039);
				expr(0);
				setState(2042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2040);
					match(T__2);
					setState(2041);
					expr(0);
					}
					}
					setState(2044); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2046);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				match(K_ARRAY);
				setState(2049);
				match(T__1);
				setState(2050);
				select_stmt();
				setState(2051);
				match(T__3);
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

	public static class Cast_exprContext extends ParserRuleContext {
		public TerminalNode K_CAST() { return getToken(PostgreSQLParser.K_CAST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_exprContext cast_expr() throws RecognitionException {
		Cast_exprContext _localctx = new Cast_exprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			match(K_CAST);
			setState(2056);
			match(T__1);
			setState(2057);
			expr(0);
			setState(2058);
			match(K_AS);
			setState(2059);
			data_type(0);
			setState(2060);
			match(T__3);
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
		public Time_function_callContext time_function_call() {
			return getRuleContext(Time_function_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_function_call);
		int _la;
		try {
			setState(2079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2062);
				function_name();
				setState(2063);
				match(T__1);
				setState(2064);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				function_name();
				setState(2067);
				match(T__1);
				setState(2068);
				expr(0);
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2069);
					match(T__2);
					setState(2070);
					expr(0);
					}
					}
					setState(2075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2076);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2078);
				time_function_call();
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

	public static class Time_function_callContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(PostgreSQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(PostgreSQLParser.K_CURRENT_TIME, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(PostgreSQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_LOCALTIME() { return getToken(PostgreSQLParser.K_LOCALTIME, 0); }
		public TerminalNode K_LOCALTIMESTAMP() { return getToken(PostgreSQLParser.K_LOCALTIMESTAMP, 0); }
		public TerminalNode K_EXTRACT() { return getToken(PostgreSQLParser.K_EXTRACT, 0); }
		public Extract_fieldContext extract_field() {
			return getRuleContext(Extract_fieldContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Time_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTime_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTime_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTime_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_function_callContext time_function_call() throws RecognitionException {
		Time_function_callContext _localctx = new Time_function_callContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_time_function_call);
		try {
			setState(2111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2081);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				match(K_CURRENT_TIME);
				setState(2087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2083);
					match(T__1);
					setState(2084);
					precision();
					setState(2085);
					match(T__3);
					}
					break;
				}
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(2089);
				match(K_CURRENT_TIMESTAMP);
				{
				setState(2090);
				match(T__1);
				setState(2091);
				precision();
				setState(2092);
				match(T__3);
				}
				}
				break;
			case K_LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(2094);
				match(K_LOCALTIME);
				{
				setState(2095);
				match(T__1);
				setState(2096);
				precision();
				setState(2097);
				match(T__3);
				}
				}
				break;
			case K_LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(2099);
				match(K_LOCALTIMESTAMP);
				{
				setState(2100);
				match(T__1);
				setState(2101);
				precision();
				setState(2102);
				match(T__3);
				}
				}
				break;
			case K_EXTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2104);
				match(K_EXTRACT);
				setState(2105);
				match(T__1);
				setState(2106);
				extract_field();
				setState(2107);
				match(K_FROM);
				setState(2108);
				expr(0);
				setState(2109);
				match(T__3);
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

	public static class Extract_fieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Extract_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterExtract_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitExtract_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitExtract_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_fieldContext extract_field() throws RecognitionException {
		Extract_fieldContext _localctx = new Extract_fieldContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_extract_field);
		try {
			setState(2115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2113);
				identifier();
				}
				break;
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
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

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
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

	public static class Aggregate_exprContext extends ParserRuleContext {
		public Aggregate_nameContext aggregate_name() {
			return getRuleContext(Aggregate_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode K_FILTER() { return getToken(PostgreSQLParser.K_FILTER, 0); }
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public TerminalNode K_ALL() { return getToken(PostgreSQLParser.K_ALL, 0); }
		public TerminalNode K_DISTINCT() { return getToken(PostgreSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_WITHIN() { return getToken(PostgreSQLParser.K_WITHIN, 0); }
		public TerminalNode K_GROUP() { return getToken(PostgreSQLParser.K_GROUP, 0); }
		public Aggregate_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAggregate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAggregate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAggregate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_exprContext aggregate_expr() throws RecognitionException {
		Aggregate_exprContext _localctx = new Aggregate_exprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_aggregate_expr);
		int _la;
		try {
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2119);
					schema_name();
					setState(2120);
					match(T__15);
					}
					break;
				}
				setState(2124);
				aggregate_name();
				setState(2125);
				match(T__1);
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2126);
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
					break;
				}
				setState(2129);
				expr(0);
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2130);
					match(T__2);
					setState(2131);
					expr(0);
					}
					}
					setState(2136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(2137);
					order_by_clause();
					}
				}

				setState(2140);
				match(T__3);
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2141);
					match(K_FILTER);
					setState(2142);
					match(T__1);
					setState(2143);
					match(K_WHERE);
					setState(2144);
					expr(0);
					setState(2145);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2149);
					schema_name();
					setState(2150);
					match(T__15);
					}
					break;
				}
				setState(2154);
				aggregate_name();
				setState(2155);
				match(T__1);
				setState(2156);
				match(T__5);
				setState(2157);
				match(T__3);
				setState(2164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2158);
					match(K_FILTER);
					setState(2159);
					match(T__1);
					setState(2160);
					match(K_WHERE);
					setState(2161);
					expr(0);
					setState(2162);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2166);
					schema_name();
					setState(2167);
					match(T__15);
					}
					break;
				}
				setState(2171);
				aggregate_name();
				setState(2172);
				match(T__1);
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(2173);
					expr(0);
					setState(2178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2174);
						match(T__2);
						setState(2175);
						expr(0);
						}
						}
						setState(2180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2183);
				match(T__3);
				setState(2184);
				match(K_WITHIN);
				setState(2185);
				match(K_GROUP);
				setState(2186);
				match(T__1);
				setState(2187);
				order_by_clause();
				setState(2188);
				match(T__3);
				setState(2195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2189);
					match(K_FILTER);
					setState(2190);
					match(T__1);
					setState(2191);
					match(K_WHERE);
					setState(2192);
					expr(0);
					setState(2193);
					match(T__3);
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

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(PostgreSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(PostgreSQLParser.K_BY, 0); }
		public List<Order_exprContext> order_expr() {
			return getRuleContexts(Order_exprContext.class);
		}
		public Order_exprContext order_expr(int i) {
			return getRuleContext(Order_exprContext.class,i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(K_ORDER);
			setState(2200);
			match(K_BY);
			setState(2201);
			order_expr();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2202);
				match(T__2);
				setState(2203);
				order_expr();
				}
				}
				setState(2208);
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

	public static class Order_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(PostgreSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(PostgreSQLParser.K_DESC, 0); }
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode K_NULLS() { return getToken(PostgreSQLParser.K_NULLS, 0); }
		public TerminalNode K_FIRST() { return getToken(PostgreSQLParser.K_FIRST, 0); }
		public TerminalNode K_LAST() { return getToken(PostgreSQLParser.K_LAST, 0); }
		public Order_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOrder_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOrder_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOrder_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_exprContext order_expr() throws RecognitionException {
		Order_exprContext _localctx = new Order_exprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_order_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			expr(0);
			setState(2214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				{
				setState(2210);
				match(K_ASC);
				}
				break;
			case K_DESC:
				{
				setState(2211);
				match(K_DESC);
				}
				break;
			case K_USING:
				{
				setState(2212);
				match(K_USING);
				setState(2213);
				operator();
				}
				break;
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FETCH:
			case K_FOR:
			case K_INSERT:
			case K_LIMIT:
			case K_NULLS:
			case K_OFFSET:
			case K_ON:
			case K_ORDER:
			case K_RANGE:
			case K_RETURNING:
			case K_ROWS:
			case K_SELECT:
			case K_UPDATE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NULLS) {
				{
				setState(2216);
				match(K_NULLS);
				setState(2217);
				_la = _input.LA(1);
				if ( !(_la==K_FIRST || _la==K_LAST) ) {
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

	public static class Aggregate_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Aggregate_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAggregate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAggregate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAggregate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_nameContext aggregate_name() throws RecognitionException {
		Aggregate_nameContext _localctx = new Aggregate_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_aggregate_name);
		try {
			setState(2222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				identifier();
				}
				break;
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221);
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

	public static class Window_func_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_OVER() { return getToken(PostgreSQLParser.K_OVER, 0); }
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_FILTER() { return getToken(PostgreSQLParser.K_FILTER, 0); }
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public Window_func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWindow_func_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWindow_func_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWindow_func_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_func_callContext window_func_call() throws RecognitionException {
		Window_func_callContext _localctx = new Window_func_callContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_window_func_call);
		int _la;
		try {
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2224);
				function_name();
				setState(2225);
				match(T__1);
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(2226);
					expr(0);
					setState(2231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2227);
						match(T__2);
						setState(2228);
						expr(0);
						}
						}
						setState(2233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2236);
				match(T__3);
				setState(2243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FILTER) {
					{
					setState(2237);
					match(K_FILTER);
					setState(2238);
					match(T__1);
					setState(2239);
					match(K_WHERE);
					setState(2240);
					expr(0);
					setState(2241);
					match(T__3);
					}
				}

				setState(2245);
				match(K_OVER);
				setState(2246);
				match(T__1);
				setState(2247);
				window_definition();
				setState(2248);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2250);
				function_name();
				setState(2251);
				match(T__1);
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << K_A) | (1L << K_ABORT) | (1L << K_ABS) | (1L << K_ABSENT) | (1L << K_ABSOLUTE) | (1L << K_ACCESS) | (1L << K_ACCORDING) | (1L << K_ACTION) | (1L << K_ADA) | (1L << K_ADD) | (1L << K_ADMIN) | (1L << K_AFTER) | (1L << K_AGGREGATE) | (1L << K_ALL) | (1L << K_ALLOCATE) | (1L << K_ALSO) | (1L << K_ALTER) | (1L << K_ALWAYS) | (1L << K_ANALYSE) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_ANY) | (1L << K_ARE) | (1L << K_ARRAY) | (1L << K_ARRAY_AGG) | (1L << K_ARRAY_MAX_CARDINALITY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ASENSITIVE) | (1L << K_ASSERTION) | (1L << K_ASSIGNMENT) | (1L << K_ASYMMETRIC) | (1L << K_AT) | (1L << K_ATOMIC) | (1L << K_ATTRIBUTE) | (1L << K_ATTRIBUTES) | (1L << K_AUTHORIZATION) | (1L << K_AVG) | (1L << K_BACKWARD) | (1L << K_BASE64))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEFORE - 64)) | (1L << (K_BEGIN - 64)) | (1L << (K_BEGIN_FRAME - 64)) | (1L << (K_BEGIN_PARTITION - 64)) | (1L << (K_BERNOULLI - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BIGINT - 64)) | (1L << (K_BINARY - 64)) | (1L << (K_BIT - 64)) | (1L << (K_BIT_LENGTH - 64)) | (1L << (K_BLOB - 64)) | (1L << (K_BLOCKED - 64)) | (1L << (K_BOM - 64)) | (1L << (K_BOOLEAN - 64)) | (1L << (K_BOTH - 64)) | (1L << (K_BREADTH - 64)) | (1L << (K_BY - 64)) | (1L << (K_C - 64)) | (1L << (K_CACHE - 64)) | (1L << (K_CALL - 64)) | (1L << (K_CALLED - 64)) | (1L << (K_CARDINALITY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASCADED - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CATALOG - 64)) | (1L << (K_CATALOG_NAME - 64)) | (1L << (K_CEIL - 64)) | (1L << (K_CEILING - 64)) | (1L << (K_CHAIN - 64)) | (1L << (K_CHAR - 64)) | (1L << (K_CHARACTER - 64)) | (1L << (K_CHARACTERISTICS - 64)) | (1L << (K_CHARACTERS - 64)) | (1L << (K_CHARACTER_LENGTH - 64)) | (1L << (K_CHARACTER_SET_CATALOG - 64)) | (1L << (K_CHARACTER_SET_NAME - 64)) | (1L << (K_CHARACTER_SET_SCHEMA - 64)) | (1L << (K_CHAR_LENGTH - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_CHECKPOINT - 64)) | (1L << (K_CLASS - 64)) | (1L << (K_CLASS_ORIGIN - 64)) | (1L << (K_CLOB - 64)) | (1L << (K_CLOSE - 64)) | (1L << (K_CLUSTER - 64)) | (1L << (K_COALESCE - 64)) | (1L << (K_COBOL - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLLATION - 64)) | (1L << (K_COLLATION_CATALOG - 64)) | (1L << (K_COLLATION_NAME - 64)) | (1L << (K_COLLATION_SCHEMA - 64)) | (1L << (K_COLLECT - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COLUMNS - 64)) | (1L << (K_COLUMN_NAME - 64)) | (1L << (K_COMMAND_FUNCTION - 64)) | (1L << (K_COMMAND_FUNCTION_CODE - 64)) | (1L << (K_COMMENT - 64)) | (1L << (K_COMMENTS - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_COMMITTED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_CONCURRENTLY - 128)) | (1L << (K_CONDITION - 128)) | (1L << (K_CONDITION_NUMBER - 128)) | (1L << (K_CONFIGURATION - 128)) | (1L << (K_CONFLICT - 128)) | (1L << (K_CONNECT - 128)) | (1L << (K_CONNECTION - 128)) | (1L << (K_CONNECTION_NAME - 128)) | (1L << (K_CONSTRAINT - 128)) | (1L << (K_CONSTRAINTS - 128)) | (1L << (K_CONSTRAINT_CATALOG - 128)) | (1L << (K_CONSTRAINT_NAME - 128)) | (1L << (K_CONSTRAINT_SCHEMA - 128)) | (1L << (K_CONSTRUCTOR - 128)) | (1L << (K_CONTAINS - 128)) | (1L << (K_CONTENT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_CONTROL - 128)) | (1L << (K_CONVERSION - 128)) | (1L << (K_CONVERT - 128)) | (1L << (K_COPY - 128)) | (1L << (K_CORR - 128)) | (1L << (K_CORRESPONDING - 128)) | (1L << (K_COST - 128)) | (1L << (K_COUNT - 128)) | (1L << (K_COVAR_POP - 128)) | (1L << (K_COVAR_SAMP - 128)) | (1L << (K_CREATE - 128)) | (1L << (K_CROSS - 128)) | (1L << (K_CSV - 128)) | (1L << (K_CUBE - 128)) | (1L << (K_CUME_DIST - 128)) | (1L << (K_CURRENT - 128)) | (1L << (K_CURRENT_CATALOG - 128)) | (1L << (K_CURRENT_DATE - 128)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (K_CURRENT_PATH - 128)) | (1L << (K_CURRENT_ROLE - 128)) | (1L << (K_CURRENT_ROW - 128)) | (1L << (K_CURRENT_SCHEMA - 128)) | (1L << (K_CURRENT_TIME - 128)) | (1L << (K_CURRENT_TIMESTAMP - 128)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (K_CURRENT_USER - 128)) | (1L << (K_CURSOR - 128)) | (1L << (K_CURSOR_NAME - 128)) | (1L << (K_CYCLE - 128)) | (1L << (K_DATA - 128)) | (1L << (K_DATABASE - 128)) | (1L << (K_DATALINK - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DATETIME_INTERVAL_CODE - 128)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 128)) | (1L << (K_DAY - 128)) | (1L << (K_DB - 128)) | (1L << (K_DEALLOCATE - 128)) | (1L << (K_DEC - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DECLARE - 128)) | (1L << (K_DEFAULT - 128)) | (1L << (K_DEFAULTS - 128)) | (1L << (K_DEFERRABLE - 128)) | (1L << (K_DEFERRED - 128)) | (1L << (K_DEFINED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_DEFINER - 192)) | (1L << (K_DEGREE - 192)) | (1L << (K_DELETE - 192)) | (1L << (K_DELIMITER - 192)) | (1L << (K_DELIMITERS - 192)) | (1L << (K_DENSE_RANK - 192)) | (1L << (K_DEPENDS - 192)) | (1L << (K_DEPTH - 192)) | (1L << (K_DEREF - 192)) | (1L << (K_DERIVED - 192)) | (1L << (K_DESC - 192)) | (1L << (K_DESCRIBE - 192)) | (1L << (K_DESCRIPTOR - 192)) | (1L << (K_DETERMINISTIC - 192)) | (1L << (K_DIAGNOSTICS - 192)) | (1L << (K_DICTIONARY - 192)) | (1L << (K_DISABLE - 192)) | (1L << (K_DISCARD - 192)) | (1L << (K_DISCONNECT - 192)) | (1L << (K_DISPATCH - 192)) | (1L << (K_DISTINCT - 192)) | (1L << (K_DLNEWCOPY - 192)) | (1L << (K_DLPREVIOUSCOPY - 192)) | (1L << (K_DLURLCOMPLETE - 192)) | (1L << (K_DLURLCOMPLETEONLY - 192)) | (1L << (K_DLURLCOMPLETEWRITE - 192)) | (1L << (K_DLURLPATH - 192)) | (1L << (K_DLURLPATHONLY - 192)) | (1L << (K_DLURLPATHWRITE - 192)) | (1L << (K_DLURLSCHEME - 192)) | (1L << (K_DLURLSERVER - 192)) | (1L << (K_DLVALUE - 192)) | (1L << (K_DO - 192)) | (1L << (K_DOCUMENT - 192)) | (1L << (K_DOMAIN - 192)) | (1L << (K_DOUBLE - 192)) | (1L << (K_DROP - 192)) | (1L << (K_DYNAMIC - 192)) | (1L << (K_DYNAMIC_FUNCTION - 192)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 192)) | (1L << (K_EACH - 192)) | (1L << (K_ELEMENT - 192)) | (1L << (K_ELSE - 192)) | (1L << (K_EMPTY - 192)) | (1L << (K_ENABLE - 192)) | (1L << (K_ENCODING - 192)) | (1L << (K_ENCRYPTED - 192)) | (1L << (K_END - 192)) | (1L << (K_END_EXEC - 192)) | (1L << (K_END_FRAME - 192)) | (1L << (K_END_PARTITION - 192)) | (1L << (K_ENFORCED - 192)) | (1L << (K_ENUM - 192)) | (1L << (K_EQUALS - 192)) | (1L << (K_ESCAPE - 192)) | (1L << (K_EVENT - 192)) | (1L << (K_EVERY - 192)) | (1L << (K_EXCEPT - 192)) | (1L << (K_EXCEPTION - 192)) | (1L << (K_EXCLUDE - 192)) | (1L << (K_EXCLUDING - 192)) | (1L << (K_EXCLUSIVE - 192)) | (1L << (K_EXEC - 192)) | (1L << (K_EXECUTE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (K_EXISTS - 256)) | (1L << (K_EXP - 256)) | (1L << (K_EXPLAIN - 256)) | (1L << (K_EXPRESSION - 256)) | (1L << (K_EXTENSION - 256)) | (1L << (K_EXTERNAL - 256)) | (1L << (K_EXTRACT - 256)) | (1L << (K_FALSE - 256)) | (1L << (K_FAMILY - 256)) | (1L << (K_FETCH - 256)) | (1L << (K_FILE - 256)) | (1L << (K_FILTER - 256)) | (1L << (K_FINAL - 256)) | (1L << (K_FIRST - 256)) | (1L << (K_FIRST_VALUE - 256)) | (1L << (K_FLAG - 256)) | (1L << (K_FLOAT - 256)) | (1L << (K_FLOOR - 256)) | (1L << (K_FOLLOWING - 256)) | (1L << (K_FOR - 256)) | (1L << (K_FORCE - 256)) | (1L << (K_FOREIGN - 256)) | (1L << (K_FORTRAN - 256)) | (1L << (K_FORWARD - 256)) | (1L << (K_FOUND - 256)) | (1L << (K_FRAME_ROW - 256)) | (1L << (K_FREE - 256)) | (1L << (K_FREEZE - 256)) | (1L << (K_FROM - 256)) | (1L << (K_FS - 256)) | (1L << (K_FULL - 256)) | (1L << (K_FUNCTION - 256)) | (1L << (K_FUNCTIONS - 256)) | (1L << (K_FUSION - 256)) | (1L << (K_G - 256)) | (1L << (K_GENERAL - 256)) | (1L << (K_GENERATED - 256)) | (1L << (K_GET - 256)) | (1L << (K_GLOBAL - 256)) | (1L << (K_GO - 256)) | (1L << (K_GOTO - 256)) | (1L << (K_GRANT - 256)) | (1L << (K_GRANTED - 256)) | (1L << (K_GREATEST - 256)) | (1L << (K_GROUP - 256)) | (1L << (K_GROUPING - 256)) | (1L << (K_GROUPS - 256)) | (1L << (K_HANDLER - 256)) | (1L << (K_HAVING - 256)) | (1L << (K_HEADER - 256)) | (1L << (K_HEX - 256)) | (1L << (K_HIERARCHY - 256)) | (1L << (K_HOLD - 256)) | (1L << (K_HOUR - 256)) | (1L << (K_ID - 256)) | (1L << (K_IDENTITY - 256)) | (1L << (K_IF - 256)) | (1L << (K_IGNORE - 256)) | (1L << (K_ILIKE - 256)) | (1L << (K_IMMEDIATE - 256)) | (1L << (K_IMMEDIATELY - 256)) | (1L << (K_IMMUTABLE - 256)) | (1L << (K_IMPLEMENTATION - 256)) | (1L << (K_IMPLICIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (K_IMPORT - 320)) | (1L << (K_IN - 320)) | (1L << (K_INCLUDING - 320)) | (1L << (K_INCREMENT - 320)) | (1L << (K_INDENT - 320)) | (1L << (K_INDEX - 320)) | (1L << (K_INDEXES - 320)) | (1L << (K_INDICATOR - 320)) | (1L << (K_INHERIT - 320)) | (1L << (K_INHERITS - 320)) | (1L << (K_INITIALLY - 320)) | (1L << (K_INLINE - 320)) | (1L << (K_INNER - 320)) | (1L << (K_INOUT - 320)) | (1L << (K_INPUT - 320)) | (1L << (K_INSENSITIVE - 320)) | (1L << (K_INSERT - 320)) | (1L << (K_INSTANCE - 320)) | (1L << (K_INSTANTIABLE - 320)) | (1L << (K_INSTEAD - 320)) | (1L << (K_INT - 320)) | (1L << (K_INTEGER - 320)) | (1L << (K_INTEGRITY - 320)) | (1L << (K_INTERSECT - 320)) | (1L << (K_INTERSECTION - 320)) | (1L << (K_INTERVAL - 320)) | (1L << (K_INTO - 320)) | (1L << (K_INVOKER - 320)) | (1L << (K_IS - 320)) | (1L << (K_ISNULL - 320)) | (1L << (K_ISOLATION - 320)) | (1L << (K_JOIN - 320)) | (1L << (K_K - 320)) | (1L << (K_KEY - 320)) | (1L << (K_KEY_MEMBER - 320)) | (1L << (K_KEY_TYPE - 320)) | (1L << (K_LABEL - 320)) | (1L << (K_LAG - 320)) | (1L << (K_LANGUAGE - 320)) | (1L << (K_LARGE - 320)) | (1L << (K_LAST - 320)) | (1L << (K_LAST_VALUE - 320)) | (1L << (K_LATERAL - 320)) | (1L << (K_LEAD - 320)) | (1L << (K_LEADING - 320)) | (1L << (K_LEAKPROOF - 320)) | (1L << (K_LEAST - 320)) | (1L << (K_LEFT - 320)) | (1L << (K_LENGTH - 320)) | (1L << (K_LEVEL - 320)) | (1L << (K_LIBRARY - 320)) | (1L << (K_LIKE - 320)) | (1L << (K_LIKE_REGEX - 320)) | (1L << (K_LIMIT - 320)) | (1L << (K_LINK - 320)) | (1L << (K_LISTEN - 320)) | (1L << (K_LN - 320)) | (1L << (K_LOAD - 320)) | (1L << (K_LOCAL - 320)) | (1L << (K_LOCALTIME - 320)) | (1L << (K_LOCALTIMESTAMP - 320)) | (1L << (K_LOCATION - 320)) | (1L << (K_LOCATOR - 320)) | (1L << (K_LOCK - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (K_LOCKED - 384)) | (1L << (K_LOGGED - 384)) | (1L << (K_LOWER - 384)) | (1L << (K_M - 384)) | (1L << (K_MAP - 384)) | (1L << (K_MAPPING - 384)) | (1L << (K_MATCH - 384)) | (1L << (K_MATCHED - 384)) | (1L << (K_MATERIALIZED - 384)) | (1L << (K_MAX - 384)) | (1L << (K_MAXVALUE - 384)) | (1L << (K_MAX_CARDINALITY - 384)) | (1L << (K_MEMBER - 384)) | (1L << (K_MERGE - 384)) | (1L << (K_MESSAGE_LENGTH - 384)) | (1L << (K_MESSAGE_OCTET_LENGTH - 384)) | (1L << (K_MESSAGE_TEXT - 384)) | (1L << (K_METHOD - 384)) | (1L << (K_MIN - 384)) | (1L << (K_MINUTE - 384)) | (1L << (K_MINVALUE - 384)) | (1L << (K_MOD - 384)) | (1L << (K_MODE - 384)) | (1L << (K_MODIFIES - 384)) | (1L << (K_MODULE - 384)) | (1L << (K_MONTH - 384)) | (1L << (K_MORE - 384)) | (1L << (K_MOVE - 384)) | (1L << (K_MULTISET - 384)) | (1L << (K_MUMPS - 384)) | (1L << (K_NAME - 384)) | (1L << (K_NAMES - 384)) | (1L << (K_NAMESPACE - 384)) | (1L << (K_NATIONAL - 384)) | (1L << (K_NATURAL - 384)) | (1L << (K_NCHAR - 384)) | (1L << (K_NCLOB - 384)) | (1L << (K_NESTING - 384)) | (1L << (K_NEW - 384)) | (1L << (K_NEXT - 384)) | (1L << (K_NFC - 384)) | (1L << (K_NFD - 384)) | (1L << (K_NFKC - 384)) | (1L << (K_NFKD - 384)) | (1L << (K_NIL - 384)) | (1L << (K_NO - 384)) | (1L << (K_NONE - 384)) | (1L << (K_NORMALIZE - 384)) | (1L << (K_NORMALIZED - 384)) | (1L << (K_NOT - 384)) | (1L << (K_NOTHING - 384)) | (1L << (K_NOTIFY - 384)) | (1L << (K_NOTNULL - 384)) | (1L << (K_NOWAIT - 384)) | (1L << (K_NTH_VALUE - 384)) | (1L << (K_NTILE - 384)) | (1L << (K_NULL - 384)) | (1L << (K_NULLABLE - 384)) | (1L << (K_NULLIF - 384)) | (1L << (K_NULLS - 384)) | (1L << (K_NUMBER - 384)) | (1L << (K_NUMERIC - 384)) | (1L << (K_OBJECT - 384)) | (1L << (K_OCCURRENCES_REGEX - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (K_OCTETS - 448)) | (1L << (K_OCTET_LENGTH - 448)) | (1L << (K_OF - 448)) | (1L << (K_OFF - 448)) | (1L << (K_OFFSET - 448)) | (1L << (K_OIDS - 448)) | (1L << (K_OLD - 448)) | (1L << (K_ON - 448)) | (1L << (K_ONLY - 448)) | (1L << (K_OPEN - 448)) | (1L << (K_OPERATOR - 448)) | (1L << (K_OPTION - 448)) | (1L << (K_OPTIONS - 448)) | (1L << (K_OR - 448)) | (1L << (K_ORDER - 448)) | (1L << (K_ORDERING - 448)) | (1L << (K_ORDINALITY - 448)) | (1L << (K_OTHERS - 448)) | (1L << (K_OUT - 448)) | (1L << (K_OUTER - 448)) | (1L << (K_OUTPUT - 448)) | (1L << (K_OVER - 448)) | (1L << (K_OVERLAPS - 448)) | (1L << (K_OVERLAY - 448)) | (1L << (K_OVERRIDING - 448)) | (1L << (K_OWNED - 448)) | (1L << (K_OWNER - 448)) | (1L << (K_P - 448)) | (1L << (K_PAD - 448)) | (1L << (K_PARALLEL - 448)) | (1L << (K_PARAMETER - 448)) | (1L << (K_PARAMETER_MODE - 448)) | (1L << (K_PARAMETER_NAME - 448)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 448)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 448)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 448)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 448)) | (1L << (K_PARSER - 448)) | (1L << (K_PARTIAL - 448)) | (1L << (K_PARTITION - 448)) | (1L << (K_PASCAL - 448)) | (1L << (K_PASSING - 448)) | (1L << (K_PASSTHROUGH - 448)) | (1L << (K_PASSWORD - 448)) | (1L << (K_PATH - 448)) | (1L << (K_PERCENT - 448)) | (1L << (K_PERCENTILE_CONT - 448)) | (1L << (K_PERCENTILE_DISC - 448)) | (1L << (K_PERCENT_RANK - 448)) | (1L << (K_PERIOD - 448)) | (1L << (K_PERMISSION - 448)) | (1L << (K_PLACING - 448)) | (1L << (K_PLANS - 448)) | (1L << (K_PLI - 448)) | (1L << (K_POLICY - 448)) | (1L << (K_PORTION - 448)) | (1L << (K_POSITION - 448)) | (1L << (K_POSITION_REGEX - 448)) | (1L << (K_POWER - 448)) | (1L << (K_PRECEDES - 448)) | (1L << (K_PRECEDING - 448)) | (1L << (K_PRECISION - 448)) | (1L << (K_PREPARE - 448)) | (1L << (K_PREPARED - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (K_PRESERVE - 512)) | (1L << (K_PRIMARY - 512)) | (1L << (K_PRIOR - 512)) | (1L << (K_PRIVILEGES - 512)) | (1L << (K_PROCEDURAL - 512)) | (1L << (K_PROCEDURE - 512)) | (1L << (K_PROGRAM - 512)) | (1L << (K_PUBLIC - 512)) | (1L << (K_QUOTE - 512)) | (1L << (K_RANGE - 512)) | (1L << (K_RANK - 512)) | (1L << (K_READ - 512)) | (1L << (K_READS - 512)) | (1L << (K_REAL - 512)) | (1L << (K_REASSIGN - 512)) | (1L << (K_RECHECK - 512)) | (1L << (K_RECOVERY - 512)) | (1L << (K_RECURSIVE - 512)) | (1L << (K_REF - 512)) | (1L << (K_REFERENCES - 512)) | (1L << (K_REFERENCING - 512)) | (1L << (K_REFRESH - 512)) | (1L << (K_REGR_AVGX - 512)) | (1L << (K_REGR_AVGY - 512)) | (1L << (K_REGR_COUNT - 512)) | (1L << (K_REGR_INTERCEPT - 512)) | (1L << (K_REGR_R2 - 512)) | (1L << (K_REGR_SLOPE - 512)) | (1L << (K_REGR_SXX - 512)) | (1L << (K_REGR_SXY - 512)) | (1L << (K_REGR_SYY - 512)) | (1L << (K_REINDEX - 512)) | (1L << (K_RELATIVE - 512)) | (1L << (K_RELEASE - 512)) | (1L << (K_RENAME - 512)) | (1L << (K_REPEATABLE - 512)) | (1L << (K_REPLACE - 512)) | (1L << (K_REPLICA - 512)) | (1L << (K_REQUIRING - 512)) | (1L << (K_RESET - 512)) | (1L << (K_RESPECT - 512)) | (1L << (K_RESTART - 512)) | (1L << (K_RESTORE - 512)) | (1L << (K_RESTRICT - 512)) | (1L << (K_RESULT - 512)) | (1L << (K_RETURN - 512)) | (1L << (K_RETURNED_CARDINALITY - 512)) | (1L << (K_RETURNED_LENGTH - 512)) | (1L << (K_RETURNED_OCTET_LENGTH - 512)) | (1L << (K_RETURNED_SQLSTATE - 512)) | (1L << (K_RETURNING - 512)) | (1L << (K_RETURNS - 512)) | (1L << (K_REVOKE - 512)) | (1L << (K_RIGHT - 512)) | (1L << (K_ROLE - 512)) | (1L << (K_ROLLBACK - 512)) | (1L << (K_ROLLUP - 512)) | (1L << (K_ROUTINE - 512)) | (1L << (K_ROUTINE_CATALOG - 512)) | (1L << (K_ROUTINE_NAME - 512)) | (1L << (K_ROUTINE_SCHEMA - 512)) | (1L << (K_ROW - 512)) | (1L << (K_ROWS - 512)) | (1L << (K_ROW_COUNT - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (K_ROW_NUMBER - 576)) | (1L << (K_RULE - 576)) | (1L << (K_SAVEPOINT - 576)) | (1L << (K_SCALE - 576)) | (1L << (K_SCHEMA - 576)) | (1L << (K_SCHEMA_NAME - 576)) | (1L << (K_SCOPE - 576)) | (1L << (K_SCOPE_CATALOG - 576)) | (1L << (K_SCOPE_NAME - 576)) | (1L << (K_SCOPE_SCHEMA - 576)) | (1L << (K_SCROLL - 576)) | (1L << (K_SEARCH - 576)) | (1L << (K_SECOND - 576)) | (1L << (K_SECTION - 576)) | (1L << (K_SECURITY - 576)) | (1L << (K_SELECT - 576)) | (1L << (K_SELECTIVE - 576)) | (1L << (K_SELF - 576)) | (1L << (K_SENSITIVE - 576)) | (1L << (K_SEQUENCE - 576)) | (1L << (K_SEQUENCES - 576)) | (1L << (K_SERIALIZABLE - 576)) | (1L << (K_SERVER - 576)) | (1L << (K_SERVER_NAME - 576)) | (1L << (K_SESSION - 576)) | (1L << (K_SESSION_USER - 576)) | (1L << (K_SET - 576)) | (1L << (K_SETOF - 576)) | (1L << (K_SETS - 576)) | (1L << (K_SHARE - 576)) | (1L << (K_SHOW - 576)) | (1L << (K_SIMILAR - 576)) | (1L << (K_SIMPLE - 576)) | (1L << (K_SIZE - 576)) | (1L << (K_SKIP - 576)) | (1L << (K_SMALLINT - 576)) | (1L << (K_SNAPSHOT - 576)) | (1L << (K_SOME - 576)) | (1L << (K_SOURCE - 576)) | (1L << (K_SPACE - 576)) | (1L << (K_SPECIFIC - 576)) | (1L << (K_SPECIFICTYPE - 576)) | (1L << (K_SPECIFIC_NAME - 576)) | (1L << (K_SQL - 576)) | (1L << (K_SQLCODE - 576)) | (1L << (K_SQLERROR - 576)) | (1L << (K_SQLEXCEPTION - 576)) | (1L << (K_SQLSTATE - 576)) | (1L << (K_SQLWARNING - 576)) | (1L << (K_SQRT - 576)) | (1L << (K_STABLE - 576)) | (1L << (K_STANDALONE - 576)) | (1L << (K_START - 576)) | (1L << (K_STATE - 576)) | (1L << (K_STATEMENT - 576)) | (1L << (K_STATIC - 576)) | (1L << (K_STATISTICS - 576)) | (1L << (K_STDDEV_POP - 576)) | (1L << (K_STDDEV_SAMP - 576)) | (1L << (K_STDIN - 576)) | (1L << (K_STDOUT - 576)) | (1L << (K_STORAGE - 576)) | (1L << (K_STRICT - 576)) | (1L << (K_STRIP - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (K_STRUCTURE - 640)) | (1L << (K_STYLE - 640)) | (1L << (K_SUBCLASS_ORIGIN - 640)) | (1L << (K_SUBMULTISET - 640)) | (1L << (K_SUBSTRING - 640)) | (1L << (K_SUBSTRING_REGEX - 640)) | (1L << (K_SUCCEEDS - 640)) | (1L << (K_SUM - 640)) | (1L << (K_SYMMETRIC - 640)) | (1L << (K_SYSID - 640)) | (1L << (K_SYSTEM - 640)) | (1L << (K_SYSTEM_TIME - 640)) | (1L << (K_SYSTEM_USER - 640)) | (1L << (K_T - 640)) | (1L << (K_TABLE - 640)) | (1L << (K_TABLES - 640)) | (1L << (K_TABLESAMPLE - 640)) | (1L << (K_TABLESPACE - 640)) | (1L << (K_TABLE_NAME - 640)) | (1L << (K_TEMP - 640)) | (1L << (K_TEMPLATE - 640)) | (1L << (K_TEMPORARY - 640)) | (1L << (K_TEXT - 640)) | (1L << (K_THEN - 640)) | (1L << (K_TIES - 640)) | (1L << (K_TIME - 640)) | (1L << (K_TIMESTAMP - 640)) | (1L << (K_TIMEZONE_HOUR - 640)) | (1L << (K_TIMEZONE_MINUTE - 640)) | (1L << (K_TO - 640)) | (1L << (K_TOKEN - 640)) | (1L << (K_TOP_LEVEL_COUNT - 640)) | (1L << (K_TRAILING - 640)) | (1L << (K_TRANSACTION - 640)) | (1L << (K_TRANSACTIONS_COMMITTED - 640)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 640)) | (1L << (K_TRANSACTION_ACTIVE - 640)) | (1L << (K_TRANSFORM - 640)) | (1L << (K_TRANSFORMS - 640)) | (1L << (K_TRANSLATE - 640)) | (1L << (K_TRANSLATE_REGEX - 640)) | (1L << (K_TRANSLATION - 640)) | (1L << (K_TREAT - 640)) | (1L << (K_TRIGGER - 640)) | (1L << (K_TRIGGER_CATALOG - 640)) | (1L << (K_TRIGGER_NAME - 640)) | (1L << (K_TRIGGER_SCHEMA - 640)) | (1L << (K_TRIM - 640)) | (1L << (K_TRIM_ARRAY - 640)) | (1L << (K_TRUE - 640)) | (1L << (K_TRUNCATE - 640)) | (1L << (K_TRUSTED - 640)) | (1L << (K_TYPE - 640)) | (1L << (K_TYPES - 640)) | (1L << (K_UESCAPE - 640)) | (1L << (K_UNBOUNDED - 640)) | (1L << (K_UNCOMMITTED - 640)) | (1L << (K_UNDER - 640)) | (1L << (K_UNENCRYPTED - 640)) | (1L << (K_UNION - 640)) | (1L << (K_UNIQUE - 640)) | (1L << (K_UNKNOWN - 640)) | (1L << (K_UNLINK - 640)) | (1L << (K_UNLISTEN - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (K_UNLOGGED - 704)) | (1L << (K_UNNAMED - 704)) | (1L << (K_UNNEST - 704)) | (1L << (K_UNTIL - 704)) | (1L << (K_UNTYPED - 704)) | (1L << (K_UPDATE - 704)) | (1L << (K_UPPER - 704)) | (1L << (K_URI - 704)) | (1L << (K_USAGE - 704)) | (1L << (K_USER - 704)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 704)) | (1L << (K_USER_DEFINED_TYPE_CODE - 704)) | (1L << (K_USER_DEFINED_TYPE_NAME - 704)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 704)) | (1L << (K_USING - 704)) | (1L << (K_VACUUM - 704)) | (1L << (K_VALID - 704)) | (1L << (K_VALIDATE - 704)) | (1L << (K_VALIDATOR - 704)) | (1L << (K_VALUE - 704)) | (1L << (K_VALUES - 704)) | (1L << (K_VALUE_OF - 704)) | (1L << (K_VARBINARY - 704)) | (1L << (K_VARCHAR - 704)) | (1L << (K_VARIADIC - 704)) | (1L << (K_VARYING - 704)) | (1L << (K_VAR_POP - 704)) | (1L << (K_VAR_SAMP - 704)) | (1L << (K_VERBOSE - 704)) | (1L << (K_VERSION - 704)) | (1L << (K_VERSIONING - 704)) | (1L << (K_VIEW - 704)) | (1L << (K_VIEWS - 704)) | (1L << (K_VOLATILE - 704)) | (1L << (K_WHEN - 704)) | (1L << (K_WHENEVER - 704)) | (1L << (K_WHERE - 704)) | (1L << (K_WHITESPACE - 704)) | (1L << (K_WIDTH_BUCKET - 704)) | (1L << (K_WINDOW - 704)) | (1L << (K_WITH - 704)) | (1L << (K_WITHIN - 704)) | (1L << (K_WITHOUT - 704)) | (1L << (K_WORK - 704)) | (1L << (K_WRAPPER - 704)) | (1L << (K_WRITE - 704)) | (1L << (K_XML - 704)) | (1L << (K_XMLAGG - 704)) | (1L << (K_XMLATTRIBUTES - 704)) | (1L << (K_XMLBINARY - 704)) | (1L << (K_XMLCAST - 704)) | (1L << (K_XMLCOMMENT - 704)) | (1L << (K_XMLCONCAT - 704)) | (1L << (K_XMLDECLARATION - 704)) | (1L << (K_XMLDOCUMENT - 704)) | (1L << (K_XMLELEMENT - 704)) | (1L << (K_XMLEXISTS - 704)) | (1L << (K_XMLFOREST - 704)) | (1L << (K_XMLITERATE - 704)) | (1L << (K_XMLNAMESPACES - 704)) | (1L << (K_XMLPARSE - 704)) | (1L << (K_XMLPI - 704)) | (1L << (K_XMLQUERY - 704)) | (1L << (K_XMLROOT - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (K_XMLSCHEMA - 768)) | (1L << (K_XMLSERIALIZE - 768)) | (1L << (K_XMLTABLE - 768)) | (1L << (K_XMLTEXT - 768)) | (1L << (K_XMLVALIDATE - 768)) | (1L << (K_YEAR - 768)) | (1L << (K_YES - 768)) | (1L << (K_ZONE - 768)) | (1L << (K_SERIAL - 768)) | (1L << (K_BIGSERIAL - 768)) | (1L << (K_SMALLSERIAL - 768)) | (1L << (HEX_VALUE - 768)) | (1L << (BIT_VALUE - 768)) | (1L << (SCIENTIFIC_VALUE - 768)) | (1L << (FLOAT_VALUE - 768)) | (1L << (INTEGER_VALUE - 768)) | (1L << (QUOTED_STRING - 768)) | (1L << (UNICODE_ESCAPED_STRING - 768)) | (1L << (QUOTED_IDENTIFIER - 768)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 768)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 768)) | (1L << (UNQUOTED_IDENTIFIER - 768)) | (1L << (OPERATOR - 768)))) != 0)) {
					{
					setState(2252);
					expr(0);
					setState(2257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2253);
						match(T__2);
						setState(2254);
						expr(0);
						}
						}
						setState(2259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2262);
				match(T__3);
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FILTER) {
					{
					setState(2263);
					match(K_FILTER);
					setState(2264);
					match(T__1);
					setState(2265);
					match(K_WHERE);
					setState(2266);
					expr(0);
					setState(2267);
					match(T__3);
					}
				}

				setState(2271);
				match(K_OVER);
				setState(2272);
				window_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2274);
				function_name();
				setState(2275);
				match(T__1);
				setState(2276);
				match(T__5);
				setState(2277);
				match(T__3);
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FILTER) {
					{
					setState(2278);
					match(K_FILTER);
					setState(2279);
					match(T__1);
					setState(2280);
					match(K_WHERE);
					setState(2281);
					expr(0);
					setState(2282);
					match(T__3);
					}
				}

				setState(2286);
				match(K_OVER);
				setState(2287);
				match(T__1);
				setState(2288);
				window_definition();
				setState(2289);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2291);
				function_name();
				setState(2292);
				match(T__1);
				setState(2293);
				match(T__5);
				setState(2294);
				match(T__3);
				setState(2301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FILTER) {
					{
					setState(2295);
					match(K_FILTER);
					setState(2296);
					match(T__1);
					setState(2297);
					match(K_WHERE);
					setState(2298);
					expr(0);
					setState(2299);
					match(T__3);
					}
				}

				setState(2303);
				match(K_OVER);
				setState(2304);
				window_name();
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

	public static class Window_definitionContext extends ParserRuleContext {
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode K_PARTITION() { return getToken(PostgreSQLParser.K_PARTITION, 0); }
		public TerminalNode K_BY() { return getToken(PostgreSQLParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWindow_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWindow_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWindow_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(T__1);
			setState(2309);
			window_name();
			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PARTITION) {
				{
				setState(2310);
				match(K_PARTITION);
				setState(2311);
				match(K_BY);
				setState(2312);
				expr(0);
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2313);
					match(T__2);
					setState(2314);
					expr(0);
					}
					}
					setState(2319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(2322);
				order_by_clause();
				}
			}

			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RANGE || _la==K_ROWS) {
				{
				setState(2325);
				frame_clause();
				}
			}

			setState(2328);
			match(T__3);
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

	public static class Frame_clauseContext extends ParserRuleContext {
		public Frame_startContext frame_start() {
			return getRuleContext(Frame_startContext.class,0);
		}
		public TerminalNode K_RANGE() { return getToken(PostgreSQLParser.K_RANGE, 0); }
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_BETWEEN() { return getToken(PostgreSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(PostgreSQLParser.K_AND, 0); }
		public Frame_endContext frame_end() {
			return getRuleContext(Frame_endContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrame_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrame_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrame_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_frame_clause);
		int _la;
		try {
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2330);
				_la = _input.LA(1);
				if ( !(_la==K_RANGE || _la==K_ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2331);
				frame_start();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2332);
				_la = _input.LA(1);
				if ( !(_la==K_RANGE || _la==K_ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2333);
				match(K_BETWEEN);
				setState(2334);
				frame_start();
				setState(2335);
				match(K_AND);
				setState(2336);
				frame_end();
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

	public static class Frame_startContext extends ParserRuleContext {
		public Frame_valueContext frame_value() {
			return getRuleContext(Frame_valueContext.class,0);
		}
		public Frame_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrame_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrame_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrame_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_startContext frame_start() throws RecognitionException {
		Frame_startContext _localctx = new Frame_startContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_frame_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			frame_value();
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

	public static class Frame_endContext extends ParserRuleContext {
		public Frame_valueContext frame_value() {
			return getRuleContext(Frame_valueContext.class,0);
		}
		public Frame_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrame_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrame_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrame_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_endContext frame_end() throws RecognitionException {
		Frame_endContext _localctx = new Frame_endContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_frame_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			frame_value();
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

	public static class Frame_valueContext extends ParserRuleContext {
		public TerminalNode K_UNBOUNDED() { return getToken(PostgreSQLParser.K_UNBOUNDED, 0); }
		public TerminalNode K_PRECEDING() { return getToken(PostgreSQLParser.K_PRECEDING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_CURRENT() { return getToken(PostgreSQLParser.K_CURRENT, 0); }
		public TerminalNode K_ROW() { return getToken(PostgreSQLParser.K_ROW, 0); }
		public TerminalNode K_FOLLOWING() { return getToken(PostgreSQLParser.K_FOLLOWING, 0); }
		public Frame_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFrame_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFrame_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFrame_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_valueContext frame_value() throws RecognitionException {
		Frame_valueContext _localctx = new Frame_valueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_frame_value);
		try {
			setState(2356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2344);
				match(K_UNBOUNDED);
				setState(2345);
				match(K_PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				expr(0);
				setState(2347);
				match(K_PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2349);
				match(K_CURRENT);
				setState(2350);
				match(K_ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2351);
				expr(0);
				setState(2352);
				match(K_FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2354);
				match(K_UNBOUNDED);
				setState(2355);
				match(K_FOLLOWING);
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

	public static class Window_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitWindow_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
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

	public static class Alias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAlias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAlias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAlias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_nameContext alias_name() throws RecognitionException {
		Alias_nameContext _localctx = new Alias_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2362);
				schema_name();
				setState(2363);
				match(T__15);
				}
				break;
			}
			setState(2369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case UNICODE_ESCAPED_IDENTIFIER:
			case UNDERLINE_STARTED_IDENTIFIER:
			case UNQUOTED_IDENTIFIER:
				{
				setState(2367);
				identifier();
				}
				break;
			case K_A:
			case K_ABORT:
			case K_ABS:
			case K_ABSENT:
			case K_ABSOLUTE:
			case K_ACCESS:
			case K_ACCORDING:
			case K_ACTION:
			case K_ADA:
			case K_ADD:
			case K_ADMIN:
			case K_AFTER:
			case K_AGGREGATE:
			case K_ALL:
			case K_ALLOCATE:
			case K_ALSO:
			case K_ALTER:
			case K_ALWAYS:
			case K_ANALYSE:
			case K_ANALYZE:
			case K_AND:
			case K_ANY:
			case K_ARE:
			case K_ARRAY:
			case K_ARRAY_AGG:
			case K_ARRAY_MAX_CARDINALITY:
			case K_AS:
			case K_ASC:
			case K_ASENSITIVE:
			case K_ASSERTION:
			case K_ASSIGNMENT:
			case K_ASYMMETRIC:
			case K_AT:
			case K_ATOMIC:
			case K_ATTRIBUTE:
			case K_ATTRIBUTES:
			case K_AUTHORIZATION:
			case K_AVG:
			case K_BACKWARD:
			case K_BASE64:
			case K_BEFORE:
			case K_BEGIN:
			case K_BEGIN_FRAME:
			case K_BEGIN_PARTITION:
			case K_BERNOULLI:
			case K_BETWEEN:
			case K_BIGINT:
			case K_BINARY:
			case K_BIT:
			case K_BIT_LENGTH:
			case K_BLOB:
			case K_BLOCKED:
			case K_BOM:
			case K_BOOLEAN:
			case K_BOTH:
			case K_BREADTH:
			case K_BY:
			case K_C:
			case K_CACHE:
			case K_CALL:
			case K_CALLED:
			case K_CARDINALITY:
			case K_CASCADE:
			case K_CASCADED:
			case K_CASE:
			case K_CAST:
			case K_CATALOG:
			case K_CATALOG_NAME:
			case K_CEIL:
			case K_CEILING:
			case K_CHAIN:
			case K_CHAR:
			case K_CHARACTER:
			case K_CHARACTERISTICS:
			case K_CHARACTERS:
			case K_CHARACTER_LENGTH:
			case K_CHARACTER_SET_CATALOG:
			case K_CHARACTER_SET_NAME:
			case K_CHARACTER_SET_SCHEMA:
			case K_CHAR_LENGTH:
			case K_CHECK:
			case K_CHECKPOINT:
			case K_CLASS:
			case K_CLASS_ORIGIN:
			case K_CLOB:
			case K_CLOSE:
			case K_CLUSTER:
			case K_COALESCE:
			case K_COBOL:
			case K_COLLATE:
			case K_COLLATION:
			case K_COLLATION_CATALOG:
			case K_COLLATION_NAME:
			case K_COLLATION_SCHEMA:
			case K_COLLECT:
			case K_COLUMN:
			case K_COLUMNS:
			case K_COLUMN_NAME:
			case K_COMMAND_FUNCTION:
			case K_COMMAND_FUNCTION_CODE:
			case K_COMMENT:
			case K_COMMENTS:
			case K_COMMIT:
			case K_COMMITTED:
			case K_CONCURRENTLY:
			case K_CONDITION:
			case K_CONDITION_NUMBER:
			case K_CONFIGURATION:
			case K_CONFLICT:
			case K_CONNECT:
			case K_CONNECTION:
			case K_CONNECTION_NAME:
			case K_CONSTRAINT:
			case K_CONSTRAINTS:
			case K_CONSTRAINT_CATALOG:
			case K_CONSTRAINT_NAME:
			case K_CONSTRAINT_SCHEMA:
			case K_CONSTRUCTOR:
			case K_CONTAINS:
			case K_CONTENT:
			case K_CONTINUE:
			case K_CONTROL:
			case K_CONVERSION:
			case K_CONVERT:
			case K_COPY:
			case K_CORR:
			case K_CORRESPONDING:
			case K_COST:
			case K_COUNT:
			case K_COVAR_POP:
			case K_COVAR_SAMP:
			case K_CREATE:
			case K_CROSS:
			case K_CSV:
			case K_CUBE:
			case K_CUME_DIST:
			case K_CURRENT:
			case K_CURRENT_CATALOG:
			case K_CURRENT_DATE:
			case K_CURRENT_DEFAULT_TRANSFORM_GROUP:
			case K_CURRENT_PATH:
			case K_CURRENT_ROLE:
			case K_CURRENT_ROW:
			case K_CURRENT_SCHEMA:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case K_CURRENT_USER:
			case K_CURSOR:
			case K_CURSOR_NAME:
			case K_CYCLE:
			case K_DATA:
			case K_DATABASE:
			case K_DATALINK:
			case K_DATE:
			case K_DATETIME_INTERVAL_CODE:
			case K_DATETIME_INTERVAL_PRECISION:
			case K_DAY:
			case K_DB:
			case K_DEALLOCATE:
			case K_DEC:
			case K_DECIMAL:
			case K_DECLARE:
			case K_DEFAULT:
			case K_DEFAULTS:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DEFINED:
			case K_DEFINER:
			case K_DEGREE:
			case K_DELETE:
			case K_DELIMITER:
			case K_DELIMITERS:
			case K_DENSE_RANK:
			case K_DEPENDS:
			case K_DEPTH:
			case K_DEREF:
			case K_DERIVED:
			case K_DESC:
			case K_DESCRIBE:
			case K_DESCRIPTOR:
			case K_DETERMINISTIC:
			case K_DIAGNOSTICS:
			case K_DICTIONARY:
			case K_DISABLE:
			case K_DISCARD:
			case K_DISCONNECT:
			case K_DISPATCH:
			case K_DISTINCT:
			case K_DLNEWCOPY:
			case K_DLPREVIOUSCOPY:
			case K_DLURLCOMPLETE:
			case K_DLURLCOMPLETEONLY:
			case K_DLURLCOMPLETEWRITE:
			case K_DLURLPATH:
			case K_DLURLPATHONLY:
			case K_DLURLPATHWRITE:
			case K_DLURLSCHEME:
			case K_DLURLSERVER:
			case K_DLVALUE:
			case K_DO:
			case K_DOCUMENT:
			case K_DOMAIN:
			case K_DOUBLE:
			case K_DROP:
			case K_DYNAMIC:
			case K_DYNAMIC_FUNCTION:
			case K_DYNAMIC_FUNCTION_CODE:
			case K_EACH:
			case K_ELEMENT:
			case K_ELSE:
			case K_EMPTY:
			case K_ENABLE:
			case K_ENCODING:
			case K_ENCRYPTED:
			case K_END:
			case K_END_EXEC:
			case K_END_FRAME:
			case K_END_PARTITION:
			case K_ENFORCED:
			case K_ENUM:
			case K_EQUALS:
			case K_ESCAPE:
			case K_EVENT:
			case K_EVERY:
			case K_EXCEPT:
			case K_EXCEPTION:
			case K_EXCLUDE:
			case K_EXCLUDING:
			case K_EXCLUSIVE:
			case K_EXEC:
			case K_EXECUTE:
			case K_EXISTS:
			case K_EXP:
			case K_EXPLAIN:
			case K_EXPRESSION:
			case K_EXTENSION:
			case K_EXTERNAL:
			case K_EXTRACT:
			case K_FALSE:
			case K_FAMILY:
			case K_FETCH:
			case K_FILE:
			case K_FILTER:
			case K_FINAL:
			case K_FIRST:
			case K_FIRST_VALUE:
			case K_FLAG:
			case K_FLOAT:
			case K_FLOOR:
			case K_FOLLOWING:
			case K_FOR:
			case K_FORCE:
			case K_FOREIGN:
			case K_FORTRAN:
			case K_FORWARD:
			case K_FOUND:
			case K_FRAME_ROW:
			case K_FREE:
			case K_FREEZE:
			case K_FROM:
			case K_FS:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_FUSION:
			case K_G:
			case K_GENERAL:
			case K_GENERATED:
			case K_GET:
			case K_GLOBAL:
			case K_GO:
			case K_GOTO:
			case K_GRANT:
			case K_GRANTED:
			case K_GREATEST:
			case K_GROUP:
			case K_GROUPING:
			case K_GROUPS:
			case K_HANDLER:
			case K_HAVING:
			case K_HEADER:
			case K_HEX:
			case K_HIERARCHY:
			case K_HOLD:
			case K_HOUR:
			case K_ID:
			case K_IDENTITY:
			case K_IF:
			case K_IGNORE:
			case K_ILIKE:
			case K_IMMEDIATE:
			case K_IMMEDIATELY:
			case K_IMMUTABLE:
			case K_IMPLEMENTATION:
			case K_IMPLICIT:
			case K_IMPORT:
			case K_IN:
			case K_INCLUDING:
			case K_INCREMENT:
			case K_INDENT:
			case K_INDEX:
			case K_INDEXES:
			case K_INDICATOR:
			case K_INHERIT:
			case K_INHERITS:
			case K_INITIALLY:
			case K_INLINE:
			case K_INNER:
			case K_INOUT:
			case K_INPUT:
			case K_INSENSITIVE:
			case K_INSERT:
			case K_INSTANCE:
			case K_INSTANTIABLE:
			case K_INSTEAD:
			case K_INT:
			case K_INTEGER:
			case K_INTEGRITY:
			case K_INTERSECT:
			case K_INTERSECTION:
			case K_INTERVAL:
			case K_INTO:
			case K_INVOKER:
			case K_IS:
			case K_ISNULL:
			case K_ISOLATION:
			case K_JOIN:
			case K_K:
			case K_KEY:
			case K_KEY_MEMBER:
			case K_KEY_TYPE:
			case K_LABEL:
			case K_LAG:
			case K_LANGUAGE:
			case K_LARGE:
			case K_LAST:
			case K_LAST_VALUE:
			case K_LATERAL:
			case K_LEAD:
			case K_LEADING:
			case K_LEAKPROOF:
			case K_LEAST:
			case K_LEFT:
			case K_LENGTH:
			case K_LEVEL:
			case K_LIBRARY:
			case K_LIKE:
			case K_LIKE_REGEX:
			case K_LIMIT:
			case K_LINK:
			case K_LISTEN:
			case K_LN:
			case K_LOAD:
			case K_LOCAL:
			case K_LOCALTIME:
			case K_LOCALTIMESTAMP:
			case K_LOCATION:
			case K_LOCATOR:
			case K_LOCK:
			case K_LOCKED:
			case K_LOGGED:
			case K_LOWER:
			case K_M:
			case K_MAP:
			case K_MAPPING:
			case K_MATCH:
			case K_MATCHED:
			case K_MATERIALIZED:
			case K_MAX:
			case K_MAXVALUE:
			case K_MAX_CARDINALITY:
			case K_MEMBER:
			case K_MERGE:
			case K_MESSAGE_LENGTH:
			case K_MESSAGE_OCTET_LENGTH:
			case K_MESSAGE_TEXT:
			case K_METHOD:
			case K_MIN:
			case K_MINUTE:
			case K_MINVALUE:
			case K_MOD:
			case K_MODE:
			case K_MODIFIES:
			case K_MODULE:
			case K_MONTH:
			case K_MORE:
			case K_MOVE:
			case K_MULTISET:
			case K_MUMPS:
			case K_NAME:
			case K_NAMES:
			case K_NAMESPACE:
			case K_NATIONAL:
			case K_NATURAL:
			case K_NCHAR:
			case K_NCLOB:
			case K_NESTING:
			case K_NEW:
			case K_NEXT:
			case K_NFC:
			case K_NFD:
			case K_NFKC:
			case K_NFKD:
			case K_NIL:
			case K_NO:
			case K_NONE:
			case K_NORMALIZE:
			case K_NORMALIZED:
			case K_NOT:
			case K_NOTHING:
			case K_NOTIFY:
			case K_NOTNULL:
			case K_NOWAIT:
			case K_NTH_VALUE:
			case K_NTILE:
			case K_NULL:
			case K_NULLABLE:
			case K_NULLIF:
			case K_NULLS:
			case K_NUMBER:
			case K_NUMERIC:
			case K_OBJECT:
			case K_OCCURRENCES_REGEX:
			case K_OCTETS:
			case K_OCTET_LENGTH:
			case K_OF:
			case K_OFF:
			case K_OFFSET:
			case K_OIDS:
			case K_OLD:
			case K_ON:
			case K_ONLY:
			case K_OPEN:
			case K_OPERATOR:
			case K_OPTION:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_ORDERING:
			case K_ORDINALITY:
			case K_OTHERS:
			case K_OUT:
			case K_OUTER:
			case K_OUTPUT:
			case K_OVER:
			case K_OVERLAPS:
			case K_OVERLAY:
			case K_OVERRIDING:
			case K_OWNED:
			case K_OWNER:
			case K_P:
			case K_PAD:
			case K_PARALLEL:
			case K_PARAMETER:
			case K_PARAMETER_MODE:
			case K_PARAMETER_NAME:
			case K_PARAMETER_ORDINAL_POSITION:
			case K_PARAMETER_SPECIFIC_CATALOG:
			case K_PARAMETER_SPECIFIC_NAME:
			case K_PARAMETER_SPECIFIC_SCHEMA:
			case K_PARSER:
			case K_PARTIAL:
			case K_PARTITION:
			case K_PASCAL:
			case K_PASSING:
			case K_PASSTHROUGH:
			case K_PASSWORD:
			case K_PATH:
			case K_PERCENT:
			case K_PERCENTILE_CONT:
			case K_PERCENTILE_DISC:
			case K_PERCENT_RANK:
			case K_PERIOD:
			case K_PERMISSION:
			case K_PLACING:
			case K_PLANS:
			case K_PLI:
			case K_POLICY:
			case K_PORTION:
			case K_POSITION:
			case K_POSITION_REGEX:
			case K_POWER:
			case K_PRECEDES:
			case K_PRECEDING:
			case K_PRECISION:
			case K_PREPARE:
			case K_PREPARED:
			case K_PRESERVE:
			case K_PRIMARY:
			case K_PRIOR:
			case K_PRIVILEGES:
			case K_PROCEDURAL:
			case K_PROCEDURE:
			case K_PROGRAM:
			case K_PUBLIC:
			case K_QUOTE:
			case K_RANGE:
			case K_RANK:
			case K_READ:
			case K_READS:
			case K_REAL:
			case K_REASSIGN:
			case K_RECHECK:
			case K_RECOVERY:
			case K_RECURSIVE:
			case K_REF:
			case K_REFERENCES:
			case K_REFERENCING:
			case K_REFRESH:
			case K_REGR_AVGX:
			case K_REGR_AVGY:
			case K_REGR_COUNT:
			case K_REGR_INTERCEPT:
			case K_REGR_R2:
			case K_REGR_SLOPE:
			case K_REGR_SXX:
			case K_REGR_SXY:
			case K_REGR_SYY:
			case K_REINDEX:
			case K_RELATIVE:
			case K_RELEASE:
			case K_RENAME:
			case K_REPEATABLE:
			case K_REPLACE:
			case K_REPLICA:
			case K_REQUIRING:
			case K_RESET:
			case K_RESPECT:
			case K_RESTART:
			case K_RESTORE:
			case K_RESTRICT:
			case K_RESULT:
			case K_RETURN:
			case K_RETURNED_CARDINALITY:
			case K_RETURNED_LENGTH:
			case K_RETURNED_OCTET_LENGTH:
			case K_RETURNED_SQLSTATE:
			case K_RETURNING:
			case K_RETURNS:
			case K_REVOKE:
			case K_RIGHT:
			case K_ROLE:
			case K_ROLLBACK:
			case K_ROLLUP:
			case K_ROUTINE:
			case K_ROUTINE_CATALOG:
			case K_ROUTINE_NAME:
			case K_ROUTINE_SCHEMA:
			case K_ROW:
			case K_ROWS:
			case K_ROW_COUNT:
			case K_ROW_NUMBER:
			case K_RULE:
			case K_SAVEPOINT:
			case K_SCALE:
			case K_SCHEMA:
			case K_SCHEMA_NAME:
			case K_SCOPE:
			case K_SCOPE_CATALOG:
			case K_SCOPE_NAME:
			case K_SCOPE_SCHEMA:
			case K_SCROLL:
			case K_SEARCH:
			case K_SECOND:
			case K_SECTION:
			case K_SECURITY:
			case K_SELECT:
			case K_SELECTIVE:
			case K_SELF:
			case K_SENSITIVE:
			case K_SEQUENCE:
			case K_SEQUENCES:
			case K_SERIALIZABLE:
			case K_SERVER:
			case K_SERVER_NAME:
			case K_SESSION:
			case K_SESSION_USER:
			case K_SET:
			case K_SETOF:
			case K_SETS:
			case K_SHARE:
			case K_SHOW:
			case K_SIMILAR:
			case K_SIMPLE:
			case K_SIZE:
			case K_SKIP:
			case K_SMALLINT:
			case K_SNAPSHOT:
			case K_SOME:
			case K_SOURCE:
			case K_SPACE:
			case K_SPECIFIC:
			case K_SPECIFICTYPE:
			case K_SPECIFIC_NAME:
			case K_SQL:
			case K_SQLCODE:
			case K_SQLERROR:
			case K_SQLEXCEPTION:
			case K_SQLSTATE:
			case K_SQLWARNING:
			case K_SQRT:
			case K_STABLE:
			case K_STANDALONE:
			case K_START:
			case K_STATE:
			case K_STATEMENT:
			case K_STATIC:
			case K_STATISTICS:
			case K_STDDEV_POP:
			case K_STDDEV_SAMP:
			case K_STDIN:
			case K_STDOUT:
			case K_STORAGE:
			case K_STRICT:
			case K_STRIP:
			case K_STRUCTURE:
			case K_STYLE:
			case K_SUBCLASS_ORIGIN:
			case K_SUBMULTISET:
			case K_SUBSTRING:
			case K_SUBSTRING_REGEX:
			case K_SUCCEEDS:
			case K_SUM:
			case K_SYMMETRIC:
			case K_SYSID:
			case K_SYSTEM:
			case K_SYSTEM_TIME:
			case K_SYSTEM_USER:
			case K_T:
			case K_TABLE:
			case K_TABLES:
			case K_TABLESAMPLE:
			case K_TABLESPACE:
			case K_TABLE_NAME:
			case K_TEMP:
			case K_TEMPLATE:
			case K_TEMPORARY:
			case K_TEXT:
			case K_THEN:
			case K_TIES:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TO:
			case K_TOKEN:
			case K_TOP_LEVEL_COUNT:
			case K_TRAILING:
			case K_TRANSACTION:
			case K_TRANSACTIONS_COMMITTED:
			case K_TRANSACTIONS_ROLLED_BACK:
			case K_TRANSACTION_ACTIVE:
			case K_TRANSFORM:
			case K_TRANSFORMS:
			case K_TRANSLATE:
			case K_TRANSLATE_REGEX:
			case K_TRANSLATION:
			case K_TREAT:
			case K_TRIGGER:
			case K_TRIGGER_CATALOG:
			case K_TRIGGER_NAME:
			case K_TRIGGER_SCHEMA:
			case K_TRIM:
			case K_TRIM_ARRAY:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TRUSTED:
			case K_TYPE:
			case K_TYPES:
			case K_UESCAPE:
			case K_UNBOUNDED:
			case K_UNCOMMITTED:
			case K_UNDER:
			case K_UNENCRYPTED:
			case K_UNION:
			case K_UNIQUE:
			case K_UNKNOWN:
			case K_UNLINK:
			case K_UNLISTEN:
			case K_UNLOGGED:
			case K_UNNAMED:
			case K_UNNEST:
			case K_UNTIL:
			case K_UNTYPED:
			case K_UPDATE:
			case K_UPPER:
			case K_URI:
			case K_USAGE:
			case K_USER:
			case K_USER_DEFINED_TYPE_CATALOG:
			case K_USER_DEFINED_TYPE_CODE:
			case K_USER_DEFINED_TYPE_NAME:
			case K_USER_DEFINED_TYPE_SCHEMA:
			case K_USING:
			case K_VACUUM:
			case K_VALID:
			case K_VALIDATE:
			case K_VALIDATOR:
			case K_VALUE:
			case K_VALUES:
			case K_VALUE_OF:
			case K_VARBINARY:
			case K_VARCHAR:
			case K_VARIADIC:
			case K_VARYING:
			case K_VAR_POP:
			case K_VAR_SAMP:
			case K_VERBOSE:
			case K_VERSION:
			case K_VERSIONING:
			case K_VIEW:
			case K_VIEWS:
			case K_VOLATILE:
			case K_WHEN:
			case K_WHENEVER:
			case K_WHERE:
			case K_WHITESPACE:
			case K_WIDTH_BUCKET:
			case K_WINDOW:
			case K_WITH:
			case K_WITHIN:
			case K_WITHOUT:
			case K_WORK:
			case K_WRAPPER:
			case K_WRITE:
			case K_XML:
			case K_XMLAGG:
			case K_XMLATTRIBUTES:
			case K_XMLBINARY:
			case K_XMLCAST:
			case K_XMLCOMMENT:
			case K_XMLCONCAT:
			case K_XMLDECLARATION:
			case K_XMLDOCUMENT:
			case K_XMLELEMENT:
			case K_XMLEXISTS:
			case K_XMLFOREST:
			case K_XMLITERATE:
			case K_XMLNAMESPACES:
			case K_XMLPARSE:
			case K_XMLPI:
			case K_XMLQUERY:
			case K_XMLROOT:
			case K_XMLSCHEMA:
			case K_XMLSERIALIZE:
			case K_XMLTABLE:
			case K_XMLTEXT:
			case K_XMLVALIDATE:
			case K_YEAR:
			case K_YES:
			case K_ZONE:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
				{
				setState(2368);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_column_name);
		int _la;
		try {
			int _alt;
			setState(2389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2375);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2376);
				identifier();
				setState(2385); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2377);
						match(T__7);
						setState(2378);
						expr(0);
						setState(2381);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(2379);
							match(T__8);
							setState(2380);
							expr(0);
							}
						}

						setState(2383);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2387); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
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
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
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
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
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
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public DecimalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterDecimals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitDecimals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitDecimals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalsContext decimals() throws RecognitionException {
		DecimalsContext _localctx = new DecimalsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_decimals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
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
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
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

	public static class ConstantsContext extends ParserRuleContext {
		public String_constantContext string_constant() {
			return getRuleContext(String_constantContext.class,0);
		}
		public Bit_string_constantContext bit_string_constant() {
			return getRuleContext(Bit_string_constantContext.class,0);
		}
		public Numeric_constantContext numeric_constant() {
			return getRuleContext(Numeric_constantContext.class,0);
		}
		public Boolean_constantContext boolean_constant() {
			return getRuleContext(Boolean_constantContext.class,0);
		}
		public Typed_constantContext typed_constant() {
			return getRuleContext(Typed_constantContext.class,0);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_constants);
		try {
			setState(2406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
			case UNICODE_ESCAPED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2401);
				string_constant();
				}
				break;
			case HEX_VALUE:
			case BIT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2402);
				bit_string_constant();
				}
				break;
			case SCIENTIFIC_VALUE:
			case FLOAT_VALUE:
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2403);
				numeric_constant();
				}
				break;
			case K_FALSE:
			case K_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2404);
				boolean_constant();
				}
				break;
			case K_BIGINT:
			case K_BIT:
			case K_BOOLEAN:
			case K_CHAR:
			case K_CHARACTER:
			case K_DATE:
			case K_DOUBLE:
			case K_INT:
			case K_INTEGER:
			case K_INTERVAL:
			case K_NUMERIC:
			case K_REAL:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_VARCHAR:
			case K_XML:
			case K_SERIAL:
			case K_BIGSERIAL:
			case K_SMALLSERIAL:
			case UNQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2405);
				typed_constant();
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

	public static class Boolean_constantContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(PostgreSQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(PostgreSQLParser.K_FALSE, 0); }
		public Boolean_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterBoolean_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitBoolean_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitBoolean_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_constantContext boolean_constant() throws RecognitionException {
		Boolean_constantContext _localctx = new Boolean_constantContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_boolean_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2408);
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

	public static class Typed_constantContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode QUOTED_STRING() { return getToken(PostgreSQLParser.QUOTED_STRING, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public Typed_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTyped_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTyped_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTyped_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_constantContext typed_constant() throws RecognitionException {
		Typed_constantContext _localctx = new Typed_constantContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_typed_constant);
		try {
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2410);
				data_type(0);
				setState(2411);
				match(QUOTED_STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2413);
				data_type(0);
				setState(2414);
				match(T__1);
				setState(2415);
				match(INTEGER_VALUE);
				setState(2416);
				match(T__3);
				setState(2417);
				match(QUOTED_STRING);
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

	public static class Bit_string_constantContext extends ParserRuleContext {
		public TerminalNode BIT_VALUE() { return getToken(PostgreSQLParser.BIT_VALUE, 0); }
		public TerminalNode HEX_VALUE() { return getToken(PostgreSQLParser.HEX_VALUE, 0); }
		public Bit_string_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterBit_string_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitBit_string_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitBit_string_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_string_constantContext bit_string_constant() throws RecognitionException {
		Bit_string_constantContext _localctx = new Bit_string_constantContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_bit_string_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			_la = _input.LA(1);
			if ( !(_la==HEX_VALUE || _la==BIT_VALUE) ) {
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

	public static class String_constantContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(PostgreSQLParser.QUOTED_STRING, 0); }
		public TerminalNode UNICODE_ESCAPED_STRING() { return getToken(PostgreSQLParser.UNICODE_ESCAPED_STRING, 0); }
		public String_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterString_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitString_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitString_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_constantContext string_constant() throws RecognitionException {
		String_constantContext _localctx = new String_constantContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_string_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==UNICODE_ESCAPED_STRING) ) {
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

	public static class Numeric_constantContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PostgreSQLParser.INTEGER_VALUE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(PostgreSQLParser.FLOAT_VALUE, 0); }
		public TerminalNode SCIENTIFIC_VALUE() { return getToken(PostgreSQLParser.SCIENTIFIC_VALUE, 0); }
		public Numeric_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterNumeric_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitNumeric_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitNumeric_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_constantContext numeric_constant() throws RecognitionException {
		Numeric_constantContext _localctx = new Numeric_constantContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_numeric_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			_la = _input.LA(1);
			if ( !(((((_la - 781)) & ~0x3f) == 0 && ((1L << (_la - 781)) & ((1L << (SCIENTIFIC_VALUE - 781)) | (1L << (FLOAT_VALUE - 781)) | (1L << (INTEGER_VALUE - 781)))) != 0)) ) {
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode K_BIGINT() { return getToken(PostgreSQLParser.K_BIGINT, 0); }
		public TerminalNode K_BIGSERIAL() { return getToken(PostgreSQLParser.K_BIGSERIAL, 0); }
		public TerminalNode K_BIT() { return getToken(PostgreSQLParser.K_BIT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode K_VARYING() { return getToken(PostgreSQLParser.K_VARYING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(PostgreSQLParser.K_BOOLEAN, 0); }
		public TerminalNode K_CHARACTER() { return getToken(PostgreSQLParser.K_CHARACTER, 0); }
		public TerminalNode K_CHAR() { return getToken(PostgreSQLParser.K_CHAR, 0); }
		public TerminalNode K_VARCHAR() { return getToken(PostgreSQLParser.K_VARCHAR, 0); }
		public TerminalNode K_DATE() { return getToken(PostgreSQLParser.K_DATE, 0); }
		public TerminalNode K_DOUBLE() { return getToken(PostgreSQLParser.K_DOUBLE, 0); }
		public TerminalNode K_PRECISION() { return getToken(PostgreSQLParser.K_PRECISION, 0); }
		public TerminalNode K_INTEGER() { return getToken(PostgreSQLParser.K_INTEGER, 0); }
		public TerminalNode K_INT() { return getToken(PostgreSQLParser.K_INT, 0); }
		public TerminalNode K_INTERVAL() { return getToken(PostgreSQLParser.K_INTERVAL, 0); }
		public Interval_fieldContext interval_field() {
			return getRuleContext(Interval_fieldContext.class,0);
		}
		public TerminalNode K_NUMERIC() { return getToken(PostgreSQLParser.K_NUMERIC, 0); }
		public DecimalsContext decimals() {
			return getRuleContext(DecimalsContext.class,0);
		}
		public TerminalNode K_REAL() { return getToken(PostgreSQLParser.K_REAL, 0); }
		public TerminalNode K_SMALLINT() { return getToken(PostgreSQLParser.K_SMALLINT, 0); }
		public TerminalNode K_SMALLSERIAL() { return getToken(PostgreSQLParser.K_SMALLSERIAL, 0); }
		public TerminalNode K_SERIAL() { return getToken(PostgreSQLParser.K_SERIAL, 0); }
		public TerminalNode K_TEXT() { return getToken(PostgreSQLParser.K_TEXT, 0); }
		public List<TerminalNode> K_TIME() { return getTokens(PostgreSQLParser.K_TIME); }
		public TerminalNode K_TIME(int i) {
			return getToken(PostgreSQLParser.K_TIME, i);
		}
		public TerminalNode K_WITHOUT() { return getToken(PostgreSQLParser.K_WITHOUT, 0); }
		public TerminalNode K_ZONE() { return getToken(PostgreSQLParser.K_ZONE, 0); }
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(PostgreSQLParser.K_TIMESTAMP, 0); }
		public TerminalNode K_XML() { return getToken(PostgreSQLParser.K_XML, 0); }
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(PostgreSQLParser.UNQUOTED_IDENTIFIER, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		return data_type(0);
	}

	private Data_typeContext data_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Data_typeContext _localctx = new Data_typeContext(_ctx, _parentState);
		Data_typeContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_data_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2428);
				match(K_BIGINT);
				}
				break;
			case 2:
				{
				setState(2429);
				match(K_BIGSERIAL);
				}
				break;
			case 3:
				{
				setState(2430);
				match(K_BIT);
				setState(2435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2431);
					match(T__1);
					setState(2432);
					length();
					setState(2433);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(2437);
				match(K_BIT);
				setState(2438);
				match(K_VARYING);
				setState(2443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2439);
					match(T__1);
					setState(2440);
					length();
					setState(2441);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(2445);
				match(K_BOOLEAN);
				}
				break;
			case 6:
				{
				setState(2446);
				match(K_CHARACTER);
				setState(2451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2447);
					match(T__1);
					setState(2448);
					length();
					setState(2449);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(2453);
				match(K_CHAR);
				setState(2458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2454);
					match(T__1);
					setState(2455);
					length();
					setState(2456);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(2460);
				match(K_CHARACTER);
				setState(2461);
				match(K_VARYING);
				setState(2466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2462);
					match(T__1);
					setState(2463);
					length();
					setState(2464);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(2468);
				match(K_VARCHAR);
				setState(2473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2469);
					match(T__1);
					setState(2470);
					length();
					setState(2471);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(2475);
				match(K_DATE);
				}
				break;
			case 11:
				{
				setState(2476);
				match(K_DOUBLE);
				setState(2477);
				match(K_PRECISION);
				}
				break;
			case 12:
				{
				setState(2478);
				match(K_INTEGER);
				}
				break;
			case 13:
				{
				setState(2479);
				match(K_INT);
				}
				break;
			case 14:
				{
				setState(2480);
				match(K_INTERVAL);
				setState(2482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2481);
					interval_field();
					}
					break;
				}
				setState(2488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2484);
					match(T__1);
					setState(2485);
					length();
					setState(2486);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 15:
				{
				setState(2490);
				match(K_NUMERIC);
				setState(2497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2491);
					match(T__1);
					setState(2492);
					length();
					setState(2493);
					match(T__2);
					setState(2494);
					decimals();
					setState(2495);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 16:
				{
				setState(2499);
				match(K_REAL);
				}
				break;
			case 17:
				{
				setState(2500);
				match(K_SMALLINT);
				}
				break;
			case 18:
				{
				setState(2501);
				match(K_SMALLSERIAL);
				}
				break;
			case 19:
				{
				setState(2502);
				match(K_SERIAL);
				}
				break;
			case 20:
				{
				setState(2503);
				match(K_TEXT);
				}
				break;
			case 21:
				{
				setState(2504);
				match(K_TIME);
				setState(2509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2505);
					match(T__1);
					setState(2506);
					length();
					setState(2507);
					match(T__3);
					}
					break;
				}
				setState(2514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2511);
					match(K_WITHOUT);
					setState(2512);
					match(K_TIME);
					setState(2513);
					match(K_ZONE);
					}
					break;
				}
				}
				break;
			case 22:
				{
				setState(2516);
				match(K_TIME);
				setState(2521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2517);
					match(T__1);
					setState(2518);
					length();
					setState(2519);
					match(T__3);
					}
				}

				setState(2523);
				match(K_WITH);
				setState(2524);
				match(K_TIME);
				setState(2525);
				match(K_ZONE);
				}
				break;
			case 23:
				{
				setState(2526);
				match(K_TIMESTAMP);
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2527);
					match(T__1);
					setState(2528);
					length();
					setState(2529);
					match(T__3);
					}
					break;
				}
				setState(2536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2533);
					match(K_WITHOUT);
					setState(2534);
					match(K_TIME);
					setState(2535);
					match(K_ZONE);
					}
					break;
				}
				}
				break;
			case 24:
				{
				setState(2538);
				match(K_TIMESTAMP);
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2539);
					match(T__1);
					setState(2540);
					length();
					setState(2541);
					match(T__3);
					}
				}

				setState(2545);
				match(K_WITH);
				setState(2546);
				match(K_TIME);
				setState(2547);
				match(K_ZONE);
				}
				break;
			case 25:
				{
				setState(2548);
				match(K_XML);
				}
				break;
			case 26:
				{
				setState(2549);
				match(UNQUOTED_IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Data_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_data_type);
					setState(2552);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2553);
					match(T__7);
					setState(2554);
					match(T__9);
					}
					} 
				}
				setState(2559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
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

	public static class Interval_fieldContext extends ParserRuleContext {
		public TerminalNode K_YEAR() { return getToken(PostgreSQLParser.K_YEAR, 0); }
		public TerminalNode K_MONTH() { return getToken(PostgreSQLParser.K_MONTH, 0); }
		public TerminalNode K_DAY() { return getToken(PostgreSQLParser.K_DAY, 0); }
		public TerminalNode K_HOUR() { return getToken(PostgreSQLParser.K_HOUR, 0); }
		public TerminalNode K_MINUTE() { return getToken(PostgreSQLParser.K_MINUTE, 0); }
		public TerminalNode K_SECOND() { return getToken(PostgreSQLParser.K_SECOND, 0); }
		public TerminalNode K_TO() { return getToken(PostgreSQLParser.K_TO, 0); }
		public Interval_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterInterval_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitInterval_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitInterval_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_fieldContext interval_field() throws RecognitionException {
		Interval_fieldContext _localctx = new Interval_fieldContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_interval_field);
		try {
			setState(2587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				match(K_YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				match(K_MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				match(K_DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2563);
				match(K_HOUR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2564);
				match(K_MINUTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2565);
				match(K_SECOND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2566);
				match(K_YEAR);
				setState(2567);
				match(K_TO);
				setState(2568);
				match(K_MONTH);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2569);
				match(K_DAY);
				setState(2570);
				match(K_TO);
				setState(2571);
				match(K_HOUR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2572);
				match(K_DAY);
				setState(2573);
				match(K_TO);
				setState(2574);
				match(K_MINUTE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2575);
				match(K_DAY);
				setState(2576);
				match(K_TO);
				setState(2577);
				match(K_SECOND);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2578);
				match(K_HOUR);
				setState(2579);
				match(K_TO);
				setState(2580);
				match(K_MINUTE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2581);
				match(K_HOUR);
				setState(2582);
				match(K_TO);
				setState(2583);
				match(K_SECOND);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2584);
				match(K_MINUTE);
				setState(2585);
				match(K_TO);
				setState(2586);
				match(K_SECOND);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_A() { return getToken(PostgreSQLParser.K_A, 0); }
		public TerminalNode K_ABORT() { return getToken(PostgreSQLParser.K_ABORT, 0); }
		public TerminalNode K_ABS() { return getToken(PostgreSQLParser.K_ABS, 0); }
		public TerminalNode K_ABSENT() { return getToken(PostgreSQLParser.K_ABSENT, 0); }
		public TerminalNode K_ABSOLUTE() { return getToken(PostgreSQLParser.K_ABSOLUTE, 0); }
		public TerminalNode K_ACCESS() { return getToken(PostgreSQLParser.K_ACCESS, 0); }
		public TerminalNode K_ACCORDING() { return getToken(PostgreSQLParser.K_ACCORDING, 0); }
		public TerminalNode K_ACTION() { return getToken(PostgreSQLParser.K_ACTION, 0); }
		public TerminalNode K_ADA() { return getToken(PostgreSQLParser.K_ADA, 0); }
		public TerminalNode K_ADD() { return getToken(PostgreSQLParser.K_ADD, 0); }
		public TerminalNode K_ADMIN() { return getToken(PostgreSQLParser.K_ADMIN, 0); }
		public TerminalNode K_AFTER() { return getToken(PostgreSQLParser.K_AFTER, 0); }
		public TerminalNode K_AGGREGATE() { return getToken(PostgreSQLParser.K_AGGREGATE, 0); }
		public TerminalNode K_ALL() { return getToken(PostgreSQLParser.K_ALL, 0); }
		public TerminalNode K_ALLOCATE() { return getToken(PostgreSQLParser.K_ALLOCATE, 0); }
		public TerminalNode K_ALSO() { return getToken(PostgreSQLParser.K_ALSO, 0); }
		public TerminalNode K_ALTER() { return getToken(PostgreSQLParser.K_ALTER, 0); }
		public TerminalNode K_ALWAYS() { return getToken(PostgreSQLParser.K_ALWAYS, 0); }
		public TerminalNode K_ANALYSE() { return getToken(PostgreSQLParser.K_ANALYSE, 0); }
		public TerminalNode K_ANALYZE() { return getToken(PostgreSQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(PostgreSQLParser.K_AND, 0); }
		public TerminalNode K_ANY() { return getToken(PostgreSQLParser.K_ANY, 0); }
		public TerminalNode K_ARE() { return getToken(PostgreSQLParser.K_ARE, 0); }
		public TerminalNode K_ARRAY() { return getToken(PostgreSQLParser.K_ARRAY, 0); }
		public TerminalNode K_ARRAY_AGG() { return getToken(PostgreSQLParser.K_ARRAY_AGG, 0); }
		public TerminalNode K_ARRAY_MAX_CARDINALITY() { return getToken(PostgreSQLParser.K_ARRAY_MAX_CARDINALITY, 0); }
		public TerminalNode K_AS() { return getToken(PostgreSQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(PostgreSQLParser.K_ASC, 0); }
		public TerminalNode K_ASENSITIVE() { return getToken(PostgreSQLParser.K_ASENSITIVE, 0); }
		public TerminalNode K_ASSERTION() { return getToken(PostgreSQLParser.K_ASSERTION, 0); }
		public TerminalNode K_ASSIGNMENT() { return getToken(PostgreSQLParser.K_ASSIGNMENT, 0); }
		public TerminalNode K_ASYMMETRIC() { return getToken(PostgreSQLParser.K_ASYMMETRIC, 0); }
		public TerminalNode K_AT() { return getToken(PostgreSQLParser.K_AT, 0); }
		public TerminalNode K_ATOMIC() { return getToken(PostgreSQLParser.K_ATOMIC, 0); }
		public TerminalNode K_ATTRIBUTE() { return getToken(PostgreSQLParser.K_ATTRIBUTE, 0); }
		public TerminalNode K_ATTRIBUTES() { return getToken(PostgreSQLParser.K_ATTRIBUTES, 0); }
		public TerminalNode K_AUTHORIZATION() { return getToken(PostgreSQLParser.K_AUTHORIZATION, 0); }
		public TerminalNode K_AVG() { return getToken(PostgreSQLParser.K_AVG, 0); }
		public TerminalNode K_BACKWARD() { return getToken(PostgreSQLParser.K_BACKWARD, 0); }
		public TerminalNode K_BASE64() { return getToken(PostgreSQLParser.K_BASE64, 0); }
		public TerminalNode K_BEFORE() { return getToken(PostgreSQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(PostgreSQLParser.K_BEGIN, 0); }
		public TerminalNode K_BEGIN_FRAME() { return getToken(PostgreSQLParser.K_BEGIN_FRAME, 0); }
		public TerminalNode K_BEGIN_PARTITION() { return getToken(PostgreSQLParser.K_BEGIN_PARTITION, 0); }
		public TerminalNode K_BERNOULLI() { return getToken(PostgreSQLParser.K_BERNOULLI, 0); }
		public TerminalNode K_BETWEEN() { return getToken(PostgreSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BIGINT() { return getToken(PostgreSQLParser.K_BIGINT, 0); }
		public TerminalNode K_BINARY() { return getToken(PostgreSQLParser.K_BINARY, 0); }
		public TerminalNode K_BIT() { return getToken(PostgreSQLParser.K_BIT, 0); }
		public TerminalNode K_BIT_LENGTH() { return getToken(PostgreSQLParser.K_BIT_LENGTH, 0); }
		public TerminalNode K_BLOB() { return getToken(PostgreSQLParser.K_BLOB, 0); }
		public TerminalNode K_BLOCKED() { return getToken(PostgreSQLParser.K_BLOCKED, 0); }
		public TerminalNode K_BOM() { return getToken(PostgreSQLParser.K_BOM, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(PostgreSQLParser.K_BOOLEAN, 0); }
		public TerminalNode K_BOTH() { return getToken(PostgreSQLParser.K_BOTH, 0); }
		public TerminalNode K_BREADTH() { return getToken(PostgreSQLParser.K_BREADTH, 0); }
		public TerminalNode K_BY() { return getToken(PostgreSQLParser.K_BY, 0); }
		public TerminalNode K_C() { return getToken(PostgreSQLParser.K_C, 0); }
		public TerminalNode K_CACHE() { return getToken(PostgreSQLParser.K_CACHE, 0); }
		public TerminalNode K_CALL() { return getToken(PostgreSQLParser.K_CALL, 0); }
		public TerminalNode K_CALLED() { return getToken(PostgreSQLParser.K_CALLED, 0); }
		public TerminalNode K_CARDINALITY() { return getToken(PostgreSQLParser.K_CARDINALITY, 0); }
		public TerminalNode K_CASCADE() { return getToken(PostgreSQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASCADED() { return getToken(PostgreSQLParser.K_CASCADED, 0); }
		public TerminalNode K_CASE() { return getToken(PostgreSQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(PostgreSQLParser.K_CAST, 0); }
		public TerminalNode K_CATALOG() { return getToken(PostgreSQLParser.K_CATALOG, 0); }
		public TerminalNode K_CATALOG_NAME() { return getToken(PostgreSQLParser.K_CATALOG_NAME, 0); }
		public TerminalNode K_CEIL() { return getToken(PostgreSQLParser.K_CEIL, 0); }
		public TerminalNode K_CEILING() { return getToken(PostgreSQLParser.K_CEILING, 0); }
		public TerminalNode K_CHAIN() { return getToken(PostgreSQLParser.K_CHAIN, 0); }
		public TerminalNode K_CHAR() { return getToken(PostgreSQLParser.K_CHAR, 0); }
		public TerminalNode K_CHARACTER() { return getToken(PostgreSQLParser.K_CHARACTER, 0); }
		public TerminalNode K_CHARACTERISTICS() { return getToken(PostgreSQLParser.K_CHARACTERISTICS, 0); }
		public TerminalNode K_CHARACTERS() { return getToken(PostgreSQLParser.K_CHARACTERS, 0); }
		public TerminalNode K_CHARACTER_LENGTH() { return getToken(PostgreSQLParser.K_CHARACTER_LENGTH, 0); }
		public TerminalNode K_CHARACTER_SET_CATALOG() { return getToken(PostgreSQLParser.K_CHARACTER_SET_CATALOG, 0); }
		public TerminalNode K_CHARACTER_SET_NAME() { return getToken(PostgreSQLParser.K_CHARACTER_SET_NAME, 0); }
		public TerminalNode K_CHARACTER_SET_SCHEMA() { return getToken(PostgreSQLParser.K_CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode K_CHAR_LENGTH() { return getToken(PostgreSQLParser.K_CHAR_LENGTH, 0); }
		public TerminalNode K_CHECK() { return getToken(PostgreSQLParser.K_CHECK, 0); }
		public TerminalNode K_CHECKPOINT() { return getToken(PostgreSQLParser.K_CHECKPOINT, 0); }
		public TerminalNode K_CLASS() { return getToken(PostgreSQLParser.K_CLASS, 0); }
		public TerminalNode K_CLASS_ORIGIN() { return getToken(PostgreSQLParser.K_CLASS_ORIGIN, 0); }
		public TerminalNode K_CLOB() { return getToken(PostgreSQLParser.K_CLOB, 0); }
		public TerminalNode K_CLOSE() { return getToken(PostgreSQLParser.K_CLOSE, 0); }
		public TerminalNode K_CLUSTER() { return getToken(PostgreSQLParser.K_CLUSTER, 0); }
		public TerminalNode K_COALESCE() { return getToken(PostgreSQLParser.K_COALESCE, 0); }
		public TerminalNode K_COBOL() { return getToken(PostgreSQLParser.K_COBOL, 0); }
		public TerminalNode K_COLLATE() { return getToken(PostgreSQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLLATION() { return getToken(PostgreSQLParser.K_COLLATION, 0); }
		public TerminalNode K_COLLATION_CATALOG() { return getToken(PostgreSQLParser.K_COLLATION_CATALOG, 0); }
		public TerminalNode K_COLLATION_NAME() { return getToken(PostgreSQLParser.K_COLLATION_NAME, 0); }
		public TerminalNode K_COLLATION_SCHEMA() { return getToken(PostgreSQLParser.K_COLLATION_SCHEMA, 0); }
		public TerminalNode K_COLLECT() { return getToken(PostgreSQLParser.K_COLLECT, 0); }
		public TerminalNode K_COLUMN() { return getToken(PostgreSQLParser.K_COLUMN, 0); }
		public TerminalNode K_COLUMNS() { return getToken(PostgreSQLParser.K_COLUMNS, 0); }
		public TerminalNode K_COLUMN_NAME() { return getToken(PostgreSQLParser.K_COLUMN_NAME, 0); }
		public TerminalNode K_COMMAND_FUNCTION() { return getToken(PostgreSQLParser.K_COMMAND_FUNCTION, 0); }
		public TerminalNode K_COMMAND_FUNCTION_CODE() { return getToken(PostgreSQLParser.K_COMMAND_FUNCTION_CODE, 0); }
		public TerminalNode K_COMMENT() { return getToken(PostgreSQLParser.K_COMMENT, 0); }
		public TerminalNode K_COMMENTS() { return getToken(PostgreSQLParser.K_COMMENTS, 0); }
		public TerminalNode K_COMMIT() { return getToken(PostgreSQLParser.K_COMMIT, 0); }
		public TerminalNode K_COMMITTED() { return getToken(PostgreSQLParser.K_COMMITTED, 0); }
		public TerminalNode K_CONCURRENTLY() { return getToken(PostgreSQLParser.K_CONCURRENTLY, 0); }
		public TerminalNode K_CONDITION() { return getToken(PostgreSQLParser.K_CONDITION, 0); }
		public TerminalNode K_CONDITION_NUMBER() { return getToken(PostgreSQLParser.K_CONDITION_NUMBER, 0); }
		public TerminalNode K_CONFIGURATION() { return getToken(PostgreSQLParser.K_CONFIGURATION, 0); }
		public TerminalNode K_CONFLICT() { return getToken(PostgreSQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONNECT() { return getToken(PostgreSQLParser.K_CONNECT, 0); }
		public TerminalNode K_CONNECTION() { return getToken(PostgreSQLParser.K_CONNECTION, 0); }
		public TerminalNode K_CONNECTION_NAME() { return getToken(PostgreSQLParser.K_CONNECTION_NAME, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(PostgreSQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CONSTRAINTS() { return getToken(PostgreSQLParser.K_CONSTRAINTS, 0); }
		public TerminalNode K_CONSTRAINT_CATALOG() { return getToken(PostgreSQLParser.K_CONSTRAINT_CATALOG, 0); }
		public TerminalNode K_CONSTRAINT_NAME() { return getToken(PostgreSQLParser.K_CONSTRAINT_NAME, 0); }
		public TerminalNode K_CONSTRAINT_SCHEMA() { return getToken(PostgreSQLParser.K_CONSTRAINT_SCHEMA, 0); }
		public TerminalNode K_CONSTRUCTOR() { return getToken(PostgreSQLParser.K_CONSTRUCTOR, 0); }
		public TerminalNode K_CONTAINS() { return getToken(PostgreSQLParser.K_CONTAINS, 0); }
		public TerminalNode K_CONTENT() { return getToken(PostgreSQLParser.K_CONTENT, 0); }
		public TerminalNode K_CONTINUE() { return getToken(PostgreSQLParser.K_CONTINUE, 0); }
		public TerminalNode K_CONTROL() { return getToken(PostgreSQLParser.K_CONTROL, 0); }
		public TerminalNode K_CONVERSION() { return getToken(PostgreSQLParser.K_CONVERSION, 0); }
		public TerminalNode K_CONVERT() { return getToken(PostgreSQLParser.K_CONVERT, 0); }
		public TerminalNode K_COPY() { return getToken(PostgreSQLParser.K_COPY, 0); }
		public TerminalNode K_CORR() { return getToken(PostgreSQLParser.K_CORR, 0); }
		public TerminalNode K_CORRESPONDING() { return getToken(PostgreSQLParser.K_CORRESPONDING, 0); }
		public TerminalNode K_COST() { return getToken(PostgreSQLParser.K_COST, 0); }
		public TerminalNode K_COUNT() { return getToken(PostgreSQLParser.K_COUNT, 0); }
		public TerminalNode K_COVAR_POP() { return getToken(PostgreSQLParser.K_COVAR_POP, 0); }
		public TerminalNode K_COVAR_SAMP() { return getToken(PostgreSQLParser.K_COVAR_SAMP, 0); }
		public TerminalNode K_CREATE() { return getToken(PostgreSQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(PostgreSQLParser.K_CROSS, 0); }
		public TerminalNode K_CSV() { return getToken(PostgreSQLParser.K_CSV, 0); }
		public TerminalNode K_CUBE() { return getToken(PostgreSQLParser.K_CUBE, 0); }
		public TerminalNode K_CUME_DIST() { return getToken(PostgreSQLParser.K_CUME_DIST, 0); }
		public TerminalNode K_CURRENT() { return getToken(PostgreSQLParser.K_CURRENT, 0); }
		public TerminalNode K_CURRENT_CATALOG() { return getToken(PostgreSQLParser.K_CURRENT_CATALOG, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(PostgreSQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_DEFAULT_TRANSFORM_GROUP() { return getToken(PostgreSQLParser.K_CURRENT_DEFAULT_TRANSFORM_GROUP, 0); }
		public TerminalNode K_CURRENT_PATH() { return getToken(PostgreSQLParser.K_CURRENT_PATH, 0); }
		public TerminalNode K_CURRENT_ROLE() { return getToken(PostgreSQLParser.K_CURRENT_ROLE, 0); }
		public TerminalNode K_CURRENT_ROW() { return getToken(PostgreSQLParser.K_CURRENT_ROW, 0); }
		public TerminalNode K_CURRENT_SCHEMA() { return getToken(PostgreSQLParser.K_CURRENT_SCHEMA, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(PostgreSQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(PostgreSQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TRANSFORM_GROUP_FOR_TYPE() { return getToken(PostgreSQLParser.K_CURRENT_TRANSFORM_GROUP_FOR_TYPE, 0); }
		public TerminalNode K_CURRENT_USER() { return getToken(PostgreSQLParser.K_CURRENT_USER, 0); }
		public TerminalNode K_CURSOR() { return getToken(PostgreSQLParser.K_CURSOR, 0); }
		public TerminalNode K_CURSOR_NAME() { return getToken(PostgreSQLParser.K_CURSOR_NAME, 0); }
		public TerminalNode K_CYCLE() { return getToken(PostgreSQLParser.K_CYCLE, 0); }
		public TerminalNode K_DATA() { return getToken(PostgreSQLParser.K_DATA, 0); }
		public TerminalNode K_DATABASE() { return getToken(PostgreSQLParser.K_DATABASE, 0); }
		public TerminalNode K_DATALINK() { return getToken(PostgreSQLParser.K_DATALINK, 0); }
		public TerminalNode K_DATE() { return getToken(PostgreSQLParser.K_DATE, 0); }
		public TerminalNode K_DATETIME_INTERVAL_CODE() { return getToken(PostgreSQLParser.K_DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode K_DATETIME_INTERVAL_PRECISION() { return getToken(PostgreSQLParser.K_DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode K_DAY() { return getToken(PostgreSQLParser.K_DAY, 0); }
		public TerminalNode K_DB() { return getToken(PostgreSQLParser.K_DB, 0); }
		public TerminalNode K_DEALLOCATE() { return getToken(PostgreSQLParser.K_DEALLOCATE, 0); }
		public TerminalNode K_DEC() { return getToken(PostgreSQLParser.K_DEC, 0); }
		public TerminalNode K_DECIMAL() { return getToken(PostgreSQLParser.K_DECIMAL, 0); }
		public TerminalNode K_DECLARE() { return getToken(PostgreSQLParser.K_DECLARE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(PostgreSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFAULTS() { return getToken(PostgreSQLParser.K_DEFAULTS, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(PostgreSQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(PostgreSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DEFINED() { return getToken(PostgreSQLParser.K_DEFINED, 0); }
		public TerminalNode K_DEFINER() { return getToken(PostgreSQLParser.K_DEFINER, 0); }
		public TerminalNode K_DEGREE() { return getToken(PostgreSQLParser.K_DEGREE, 0); }
		public TerminalNode K_DELETE() { return getToken(PostgreSQLParser.K_DELETE, 0); }
		public TerminalNode K_DELIMITER() { return getToken(PostgreSQLParser.K_DELIMITER, 0); }
		public TerminalNode K_DELIMITERS() { return getToken(PostgreSQLParser.K_DELIMITERS, 0); }
		public TerminalNode K_DENSE_RANK() { return getToken(PostgreSQLParser.K_DENSE_RANK, 0); }
		public TerminalNode K_DEPENDS() { return getToken(PostgreSQLParser.K_DEPENDS, 0); }
		public TerminalNode K_DEPTH() { return getToken(PostgreSQLParser.K_DEPTH, 0); }
		public TerminalNode K_DEREF() { return getToken(PostgreSQLParser.K_DEREF, 0); }
		public TerminalNode K_DERIVED() { return getToken(PostgreSQLParser.K_DERIVED, 0); }
		public TerminalNode K_DESC() { return getToken(PostgreSQLParser.K_DESC, 0); }
		public TerminalNode K_DESCRIBE() { return getToken(PostgreSQLParser.K_DESCRIBE, 0); }
		public TerminalNode K_DESCRIPTOR() { return getToken(PostgreSQLParser.K_DESCRIPTOR, 0); }
		public TerminalNode K_DETERMINISTIC() { return getToken(PostgreSQLParser.K_DETERMINISTIC, 0); }
		public TerminalNode K_DIAGNOSTICS() { return getToken(PostgreSQLParser.K_DIAGNOSTICS, 0); }
		public TerminalNode K_DICTIONARY() { return getToken(PostgreSQLParser.K_DICTIONARY, 0); }
		public TerminalNode K_DISABLE() { return getToken(PostgreSQLParser.K_DISABLE, 0); }
		public TerminalNode K_DISCARD() { return getToken(PostgreSQLParser.K_DISCARD, 0); }
		public TerminalNode K_DISCONNECT() { return getToken(PostgreSQLParser.K_DISCONNECT, 0); }
		public TerminalNode K_DISPATCH() { return getToken(PostgreSQLParser.K_DISPATCH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(PostgreSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DLNEWCOPY() { return getToken(PostgreSQLParser.K_DLNEWCOPY, 0); }
		public TerminalNode K_DLPREVIOUSCOPY() { return getToken(PostgreSQLParser.K_DLPREVIOUSCOPY, 0); }
		public TerminalNode K_DLURLCOMPLETE() { return getToken(PostgreSQLParser.K_DLURLCOMPLETE, 0); }
		public TerminalNode K_DLURLCOMPLETEONLY() { return getToken(PostgreSQLParser.K_DLURLCOMPLETEONLY, 0); }
		public TerminalNode K_DLURLCOMPLETEWRITE() { return getToken(PostgreSQLParser.K_DLURLCOMPLETEWRITE, 0); }
		public TerminalNode K_DLURLPATH() { return getToken(PostgreSQLParser.K_DLURLPATH, 0); }
		public TerminalNode K_DLURLPATHONLY() { return getToken(PostgreSQLParser.K_DLURLPATHONLY, 0); }
		public TerminalNode K_DLURLPATHWRITE() { return getToken(PostgreSQLParser.K_DLURLPATHWRITE, 0); }
		public TerminalNode K_DLURLSCHEME() { return getToken(PostgreSQLParser.K_DLURLSCHEME, 0); }
		public TerminalNode K_DLURLSERVER() { return getToken(PostgreSQLParser.K_DLURLSERVER, 0); }
		public TerminalNode K_DLVALUE() { return getToken(PostgreSQLParser.K_DLVALUE, 0); }
		public TerminalNode K_DO() { return getToken(PostgreSQLParser.K_DO, 0); }
		public TerminalNode K_DOCUMENT() { return getToken(PostgreSQLParser.K_DOCUMENT, 0); }
		public TerminalNode K_DOMAIN() { return getToken(PostgreSQLParser.K_DOMAIN, 0); }
		public TerminalNode K_DOUBLE() { return getToken(PostgreSQLParser.K_DOUBLE, 0); }
		public TerminalNode K_DROP() { return getToken(PostgreSQLParser.K_DROP, 0); }
		public TerminalNode K_DYNAMIC() { return getToken(PostgreSQLParser.K_DYNAMIC, 0); }
		public TerminalNode K_DYNAMIC_FUNCTION() { return getToken(PostgreSQLParser.K_DYNAMIC_FUNCTION, 0); }
		public TerminalNode K_DYNAMIC_FUNCTION_CODE() { return getToken(PostgreSQLParser.K_DYNAMIC_FUNCTION_CODE, 0); }
		public TerminalNode K_EACH() { return getToken(PostgreSQLParser.K_EACH, 0); }
		public TerminalNode K_ELEMENT() { return getToken(PostgreSQLParser.K_ELEMENT, 0); }
		public TerminalNode K_ELSE() { return getToken(PostgreSQLParser.K_ELSE, 0); }
		public TerminalNode K_EMPTY() { return getToken(PostgreSQLParser.K_EMPTY, 0); }
		public TerminalNode K_ENABLE() { return getToken(PostgreSQLParser.K_ENABLE, 0); }
		public TerminalNode K_ENCODING() { return getToken(PostgreSQLParser.K_ENCODING, 0); }
		public TerminalNode K_ENCRYPTED() { return getToken(PostgreSQLParser.K_ENCRYPTED, 0); }
		public TerminalNode K_END() { return getToken(PostgreSQLParser.K_END, 0); }
		public TerminalNode K_END_EXEC() { return getToken(PostgreSQLParser.K_END_EXEC, 0); }
		public TerminalNode K_END_FRAME() { return getToken(PostgreSQLParser.K_END_FRAME, 0); }
		public TerminalNode K_END_PARTITION() { return getToken(PostgreSQLParser.K_END_PARTITION, 0); }
		public TerminalNode K_ENFORCED() { return getToken(PostgreSQLParser.K_ENFORCED, 0); }
		public TerminalNode K_ENUM() { return getToken(PostgreSQLParser.K_ENUM, 0); }
		public TerminalNode K_EQUALS() { return getToken(PostgreSQLParser.K_EQUALS, 0); }
		public TerminalNode K_ESCAPE() { return getToken(PostgreSQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EVENT() { return getToken(PostgreSQLParser.K_EVENT, 0); }
		public TerminalNode K_EVERY() { return getToken(PostgreSQLParser.K_EVERY, 0); }
		public TerminalNode K_EXCEPT() { return getToken(PostgreSQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCEPTION() { return getToken(PostgreSQLParser.K_EXCEPTION, 0); }
		public TerminalNode K_EXCLUDE() { return getToken(PostgreSQLParser.K_EXCLUDE, 0); }
		public TerminalNode K_EXCLUDING() { return getToken(PostgreSQLParser.K_EXCLUDING, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(PostgreSQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXEC() { return getToken(PostgreSQLParser.K_EXEC, 0); }
		public TerminalNode K_EXECUTE() { return getToken(PostgreSQLParser.K_EXECUTE, 0); }
		public TerminalNode K_EXISTS() { return getToken(PostgreSQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXP() { return getToken(PostgreSQLParser.K_EXP, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(PostgreSQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_EXPRESSION() { return getToken(PostgreSQLParser.K_EXPRESSION, 0); }
		public TerminalNode K_EXTENSION() { return getToken(PostgreSQLParser.K_EXTENSION, 0); }
		public TerminalNode K_EXTERNAL() { return getToken(PostgreSQLParser.K_EXTERNAL, 0); }
		public TerminalNode K_EXTRACT() { return getToken(PostgreSQLParser.K_EXTRACT, 0); }
		public TerminalNode K_FALSE() { return getToken(PostgreSQLParser.K_FALSE, 0); }
		public TerminalNode K_FAMILY() { return getToken(PostgreSQLParser.K_FAMILY, 0); }
		public TerminalNode K_FETCH() { return getToken(PostgreSQLParser.K_FETCH, 0); }
		public TerminalNode K_FILE() { return getToken(PostgreSQLParser.K_FILE, 0); }
		public TerminalNode K_FILTER() { return getToken(PostgreSQLParser.K_FILTER, 0); }
		public TerminalNode K_FINAL() { return getToken(PostgreSQLParser.K_FINAL, 0); }
		public TerminalNode K_FIRST() { return getToken(PostgreSQLParser.K_FIRST, 0); }
		public TerminalNode K_FIRST_VALUE() { return getToken(PostgreSQLParser.K_FIRST_VALUE, 0); }
		public TerminalNode K_FLAG() { return getToken(PostgreSQLParser.K_FLAG, 0); }
		public TerminalNode K_FLOAT() { return getToken(PostgreSQLParser.K_FLOAT, 0); }
		public TerminalNode K_FLOOR() { return getToken(PostgreSQLParser.K_FLOOR, 0); }
		public TerminalNode K_FOLLOWING() { return getToken(PostgreSQLParser.K_FOLLOWING, 0); }
		public TerminalNode K_FOR() { return getToken(PostgreSQLParser.K_FOR, 0); }
		public TerminalNode K_FORCE() { return getToken(PostgreSQLParser.K_FORCE, 0); }
		public TerminalNode K_FOREIGN() { return getToken(PostgreSQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FORTRAN() { return getToken(PostgreSQLParser.K_FORTRAN, 0); }
		public TerminalNode K_FORWARD() { return getToken(PostgreSQLParser.K_FORWARD, 0); }
		public TerminalNode K_FOUND() { return getToken(PostgreSQLParser.K_FOUND, 0); }
		public TerminalNode K_FRAME_ROW() { return getToken(PostgreSQLParser.K_FRAME_ROW, 0); }
		public TerminalNode K_FREE() { return getToken(PostgreSQLParser.K_FREE, 0); }
		public TerminalNode K_FREEZE() { return getToken(PostgreSQLParser.K_FREEZE, 0); }
		public TerminalNode K_FROM() { return getToken(PostgreSQLParser.K_FROM, 0); }
		public TerminalNode K_FS() { return getToken(PostgreSQLParser.K_FS, 0); }
		public TerminalNode K_FULL() { return getToken(PostgreSQLParser.K_FULL, 0); }
		public TerminalNode K_FUNCTION() { return getToken(PostgreSQLParser.K_FUNCTION, 0); }
		public TerminalNode K_FUNCTIONS() { return getToken(PostgreSQLParser.K_FUNCTIONS, 0); }
		public TerminalNode K_FUSION() { return getToken(PostgreSQLParser.K_FUSION, 0); }
		public TerminalNode K_G() { return getToken(PostgreSQLParser.K_G, 0); }
		public TerminalNode K_GENERAL() { return getToken(PostgreSQLParser.K_GENERAL, 0); }
		public TerminalNode K_GENERATED() { return getToken(PostgreSQLParser.K_GENERATED, 0); }
		public TerminalNode K_GET() { return getToken(PostgreSQLParser.K_GET, 0); }
		public TerminalNode K_GLOBAL() { return getToken(PostgreSQLParser.K_GLOBAL, 0); }
		public TerminalNode K_GO() { return getToken(PostgreSQLParser.K_GO, 0); }
		public TerminalNode K_GOTO() { return getToken(PostgreSQLParser.K_GOTO, 0); }
		public TerminalNode K_GRANT() { return getToken(PostgreSQLParser.K_GRANT, 0); }
		public TerminalNode K_GRANTED() { return getToken(PostgreSQLParser.K_GRANTED, 0); }
		public TerminalNode K_GREATEST() { return getToken(PostgreSQLParser.K_GREATEST, 0); }
		public TerminalNode K_GROUP() { return getToken(PostgreSQLParser.K_GROUP, 0); }
		public TerminalNode K_GROUPING() { return getToken(PostgreSQLParser.K_GROUPING, 0); }
		public TerminalNode K_GROUPS() { return getToken(PostgreSQLParser.K_GROUPS, 0); }
		public TerminalNode K_HANDLER() { return getToken(PostgreSQLParser.K_HANDLER, 0); }
		public TerminalNode K_HAVING() { return getToken(PostgreSQLParser.K_HAVING, 0); }
		public TerminalNode K_HEADER() { return getToken(PostgreSQLParser.K_HEADER, 0); }
		public TerminalNode K_HEX() { return getToken(PostgreSQLParser.K_HEX, 0); }
		public TerminalNode K_HIERARCHY() { return getToken(PostgreSQLParser.K_HIERARCHY, 0); }
		public TerminalNode K_HOLD() { return getToken(PostgreSQLParser.K_HOLD, 0); }
		public TerminalNode K_HOUR() { return getToken(PostgreSQLParser.K_HOUR, 0); }
		public TerminalNode K_ID() { return getToken(PostgreSQLParser.K_ID, 0); }
		public TerminalNode K_IDENTITY() { return getToken(PostgreSQLParser.K_IDENTITY, 0); }
		public TerminalNode K_IF() { return getToken(PostgreSQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(PostgreSQLParser.K_IGNORE, 0); }
		public TerminalNode K_ILIKE() { return getToken(PostgreSQLParser.K_ILIKE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(PostgreSQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IMMEDIATELY() { return getToken(PostgreSQLParser.K_IMMEDIATELY, 0); }
		public TerminalNode K_IMMUTABLE() { return getToken(PostgreSQLParser.K_IMMUTABLE, 0); }
		public TerminalNode K_IMPLEMENTATION() { return getToken(PostgreSQLParser.K_IMPLEMENTATION, 0); }
		public TerminalNode K_IMPLICIT() { return getToken(PostgreSQLParser.K_IMPLICIT, 0); }
		public TerminalNode K_IMPORT() { return getToken(PostgreSQLParser.K_IMPORT, 0); }
		public TerminalNode K_IN() { return getToken(PostgreSQLParser.K_IN, 0); }
		public TerminalNode K_INCLUDING() { return getToken(PostgreSQLParser.K_INCLUDING, 0); }
		public TerminalNode K_INCREMENT() { return getToken(PostgreSQLParser.K_INCREMENT, 0); }
		public TerminalNode K_INDENT() { return getToken(PostgreSQLParser.K_INDENT, 0); }
		public TerminalNode K_INDEX() { return getToken(PostgreSQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXES() { return getToken(PostgreSQLParser.K_INDEXES, 0); }
		public TerminalNode K_INDICATOR() { return getToken(PostgreSQLParser.K_INDICATOR, 0); }
		public TerminalNode K_INHERIT() { return getToken(PostgreSQLParser.K_INHERIT, 0); }
		public TerminalNode K_INHERITS() { return getToken(PostgreSQLParser.K_INHERITS, 0); }
		public TerminalNode K_INITIALLY() { return getToken(PostgreSQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INLINE() { return getToken(PostgreSQLParser.K_INLINE, 0); }
		public TerminalNode K_INNER() { return getToken(PostgreSQLParser.K_INNER, 0); }
		public TerminalNode K_INOUT() { return getToken(PostgreSQLParser.K_INOUT, 0); }
		public TerminalNode K_INPUT() { return getToken(PostgreSQLParser.K_INPUT, 0); }
		public TerminalNode K_INSENSITIVE() { return getToken(PostgreSQLParser.K_INSENSITIVE, 0); }
		public TerminalNode K_INSERT() { return getToken(PostgreSQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTANCE() { return getToken(PostgreSQLParser.K_INSTANCE, 0); }
		public TerminalNode K_INSTANTIABLE() { return getToken(PostgreSQLParser.K_INSTANTIABLE, 0); }
		public TerminalNode K_INSTEAD() { return getToken(PostgreSQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INT() { return getToken(PostgreSQLParser.K_INT, 0); }
		public TerminalNode K_INTEGER() { return getToken(PostgreSQLParser.K_INTEGER, 0); }
		public TerminalNode K_INTEGRITY() { return getToken(PostgreSQLParser.K_INTEGRITY, 0); }
		public TerminalNode K_INTERSECT() { return getToken(PostgreSQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTERSECTION() { return getToken(PostgreSQLParser.K_INTERSECTION, 0); }
		public TerminalNode K_INTERVAL() { return getToken(PostgreSQLParser.K_INTERVAL, 0); }
		public TerminalNode K_INTO() { return getToken(PostgreSQLParser.K_INTO, 0); }
		public TerminalNode K_INVOKER() { return getToken(PostgreSQLParser.K_INVOKER, 0); }
		public TerminalNode K_IS() { return getToken(PostgreSQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(PostgreSQLParser.K_ISNULL, 0); }
		public TerminalNode K_ISOLATION() { return getToken(PostgreSQLParser.K_ISOLATION, 0); }
		public TerminalNode K_JOIN() { return getToken(PostgreSQLParser.K_JOIN, 0); }
		public TerminalNode K_K() { return getToken(PostgreSQLParser.K_K, 0); }
		public TerminalNode K_KEY() { return getToken(PostgreSQLParser.K_KEY, 0); }
		public TerminalNode K_KEY_MEMBER() { return getToken(PostgreSQLParser.K_KEY_MEMBER, 0); }
		public TerminalNode K_KEY_TYPE() { return getToken(PostgreSQLParser.K_KEY_TYPE, 0); }
		public TerminalNode K_LABEL() { return getToken(PostgreSQLParser.K_LABEL, 0); }
		public TerminalNode K_LAG() { return getToken(PostgreSQLParser.K_LAG, 0); }
		public TerminalNode K_LANGUAGE() { return getToken(PostgreSQLParser.K_LANGUAGE, 0); }
		public TerminalNode K_LARGE() { return getToken(PostgreSQLParser.K_LARGE, 0); }
		public TerminalNode K_LAST() { return getToken(PostgreSQLParser.K_LAST, 0); }
		public TerminalNode K_LAST_VALUE() { return getToken(PostgreSQLParser.K_LAST_VALUE, 0); }
		public TerminalNode K_LATERAL() { return getToken(PostgreSQLParser.K_LATERAL, 0); }
		public TerminalNode K_LEAD() { return getToken(PostgreSQLParser.K_LEAD, 0); }
		public TerminalNode K_LEADING() { return getToken(PostgreSQLParser.K_LEADING, 0); }
		public TerminalNode K_LEAKPROOF() { return getToken(PostgreSQLParser.K_LEAKPROOF, 0); }
		public TerminalNode K_LEAST() { return getToken(PostgreSQLParser.K_LEAST, 0); }
		public TerminalNode K_LEFT() { return getToken(PostgreSQLParser.K_LEFT, 0); }
		public TerminalNode K_LENGTH() { return getToken(PostgreSQLParser.K_LENGTH, 0); }
		public TerminalNode K_LEVEL() { return getToken(PostgreSQLParser.K_LEVEL, 0); }
		public TerminalNode K_LIBRARY() { return getToken(PostgreSQLParser.K_LIBRARY, 0); }
		public TerminalNode K_LIKE() { return getToken(PostgreSQLParser.K_LIKE, 0); }
		public TerminalNode K_LIKE_REGEX() { return getToken(PostgreSQLParser.K_LIKE_REGEX, 0); }
		public TerminalNode K_LIMIT() { return getToken(PostgreSQLParser.K_LIMIT, 0); }
		public TerminalNode K_LINK() { return getToken(PostgreSQLParser.K_LINK, 0); }
		public TerminalNode K_LISTEN() { return getToken(PostgreSQLParser.K_LISTEN, 0); }
		public TerminalNode K_LN() { return getToken(PostgreSQLParser.K_LN, 0); }
		public TerminalNode K_LOAD() { return getToken(PostgreSQLParser.K_LOAD, 0); }
		public TerminalNode K_LOCAL() { return getToken(PostgreSQLParser.K_LOCAL, 0); }
		public TerminalNode K_LOCALTIME() { return getToken(PostgreSQLParser.K_LOCALTIME, 0); }
		public TerminalNode K_LOCALTIMESTAMP() { return getToken(PostgreSQLParser.K_LOCALTIMESTAMP, 0); }
		public TerminalNode K_LOCATION() { return getToken(PostgreSQLParser.K_LOCATION, 0); }
		public TerminalNode K_LOCATOR() { return getToken(PostgreSQLParser.K_LOCATOR, 0); }
		public TerminalNode K_LOCK() { return getToken(PostgreSQLParser.K_LOCK, 0); }
		public TerminalNode K_LOCKED() { return getToken(PostgreSQLParser.K_LOCKED, 0); }
		public TerminalNode K_LOGGED() { return getToken(PostgreSQLParser.K_LOGGED, 0); }
		public TerminalNode K_LOWER() { return getToken(PostgreSQLParser.K_LOWER, 0); }
		public TerminalNode K_M() { return getToken(PostgreSQLParser.K_M, 0); }
		public TerminalNode K_MAP() { return getToken(PostgreSQLParser.K_MAP, 0); }
		public TerminalNode K_MAPPING() { return getToken(PostgreSQLParser.K_MAPPING, 0); }
		public TerminalNode K_MATCH() { return getToken(PostgreSQLParser.K_MATCH, 0); }
		public TerminalNode K_MATCHED() { return getToken(PostgreSQLParser.K_MATCHED, 0); }
		public TerminalNode K_MATERIALIZED() { return getToken(PostgreSQLParser.K_MATERIALIZED, 0); }
		public TerminalNode K_MAX() { return getToken(PostgreSQLParser.K_MAX, 0); }
		public TerminalNode K_MAXVALUE() { return getToken(PostgreSQLParser.K_MAXVALUE, 0); }
		public TerminalNode K_MAX_CARDINALITY() { return getToken(PostgreSQLParser.K_MAX_CARDINALITY, 0); }
		public TerminalNode K_MEMBER() { return getToken(PostgreSQLParser.K_MEMBER, 0); }
		public TerminalNode K_MERGE() { return getToken(PostgreSQLParser.K_MERGE, 0); }
		public TerminalNode K_MESSAGE_LENGTH() { return getToken(PostgreSQLParser.K_MESSAGE_LENGTH, 0); }
		public TerminalNode K_MESSAGE_OCTET_LENGTH() { return getToken(PostgreSQLParser.K_MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode K_MESSAGE_TEXT() { return getToken(PostgreSQLParser.K_MESSAGE_TEXT, 0); }
		public TerminalNode K_METHOD() { return getToken(PostgreSQLParser.K_METHOD, 0); }
		public TerminalNode K_MIN() { return getToken(PostgreSQLParser.K_MIN, 0); }
		public TerminalNode K_MINUTE() { return getToken(PostgreSQLParser.K_MINUTE, 0); }
		public TerminalNode K_MINVALUE() { return getToken(PostgreSQLParser.K_MINVALUE, 0); }
		public TerminalNode K_MOD() { return getToken(PostgreSQLParser.K_MOD, 0); }
		public TerminalNode K_MODE() { return getToken(PostgreSQLParser.K_MODE, 0); }
		public TerminalNode K_MODIFIES() { return getToken(PostgreSQLParser.K_MODIFIES, 0); }
		public TerminalNode K_MODULE() { return getToken(PostgreSQLParser.K_MODULE, 0); }
		public TerminalNode K_MONTH() { return getToken(PostgreSQLParser.K_MONTH, 0); }
		public TerminalNode K_MORE() { return getToken(PostgreSQLParser.K_MORE, 0); }
		public TerminalNode K_MOVE() { return getToken(PostgreSQLParser.K_MOVE, 0); }
		public TerminalNode K_MULTISET() { return getToken(PostgreSQLParser.K_MULTISET, 0); }
		public TerminalNode K_MUMPS() { return getToken(PostgreSQLParser.K_MUMPS, 0); }
		public TerminalNode K_NAME() { return getToken(PostgreSQLParser.K_NAME, 0); }
		public TerminalNode K_NAMES() { return getToken(PostgreSQLParser.K_NAMES, 0); }
		public TerminalNode K_NAMESPACE() { return getToken(PostgreSQLParser.K_NAMESPACE, 0); }
		public TerminalNode K_NATIONAL() { return getToken(PostgreSQLParser.K_NATIONAL, 0); }
		public TerminalNode K_NATURAL() { return getToken(PostgreSQLParser.K_NATURAL, 0); }
		public TerminalNode K_NCHAR() { return getToken(PostgreSQLParser.K_NCHAR, 0); }
		public TerminalNode K_NCLOB() { return getToken(PostgreSQLParser.K_NCLOB, 0); }
		public TerminalNode K_NESTING() { return getToken(PostgreSQLParser.K_NESTING, 0); }
		public TerminalNode K_NEW() { return getToken(PostgreSQLParser.K_NEW, 0); }
		public TerminalNode K_NEXT() { return getToken(PostgreSQLParser.K_NEXT, 0); }
		public TerminalNode K_NFC() { return getToken(PostgreSQLParser.K_NFC, 0); }
		public TerminalNode K_NFD() { return getToken(PostgreSQLParser.K_NFD, 0); }
		public TerminalNode K_NFKC() { return getToken(PostgreSQLParser.K_NFKC, 0); }
		public TerminalNode K_NFKD() { return getToken(PostgreSQLParser.K_NFKD, 0); }
		public TerminalNode K_NIL() { return getToken(PostgreSQLParser.K_NIL, 0); }
		public TerminalNode K_NO() { return getToken(PostgreSQLParser.K_NO, 0); }
		public TerminalNode K_NONE() { return getToken(PostgreSQLParser.K_NONE, 0); }
		public TerminalNode K_NORMALIZE() { return getToken(PostgreSQLParser.K_NORMALIZE, 0); }
		public TerminalNode K_NORMALIZED() { return getToken(PostgreSQLParser.K_NORMALIZED, 0); }
		public TerminalNode K_NOT() { return getToken(PostgreSQLParser.K_NOT, 0); }
		public TerminalNode K_NOTHING() { return getToken(PostgreSQLParser.K_NOTHING, 0); }
		public TerminalNode K_NOTIFY() { return getToken(PostgreSQLParser.K_NOTIFY, 0); }
		public TerminalNode K_NOTNULL() { return getToken(PostgreSQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NOWAIT() { return getToken(PostgreSQLParser.K_NOWAIT, 0); }
		public TerminalNode K_NTH_VALUE() { return getToken(PostgreSQLParser.K_NTH_VALUE, 0); }
		public TerminalNode K_NTILE() { return getToken(PostgreSQLParser.K_NTILE, 0); }
		public TerminalNode K_NULL() { return getToken(PostgreSQLParser.K_NULL, 0); }
		public TerminalNode K_NULLABLE() { return getToken(PostgreSQLParser.K_NULLABLE, 0); }
		public TerminalNode K_NULLIF() { return getToken(PostgreSQLParser.K_NULLIF, 0); }
		public TerminalNode K_NULLS() { return getToken(PostgreSQLParser.K_NULLS, 0); }
		public TerminalNode K_NUMBER() { return getToken(PostgreSQLParser.K_NUMBER, 0); }
		public TerminalNode K_NUMERIC() { return getToken(PostgreSQLParser.K_NUMERIC, 0); }
		public TerminalNode K_OBJECT() { return getToken(PostgreSQLParser.K_OBJECT, 0); }
		public TerminalNode K_OCCURRENCES_REGEX() { return getToken(PostgreSQLParser.K_OCCURRENCES_REGEX, 0); }
		public TerminalNode K_OCTETS() { return getToken(PostgreSQLParser.K_OCTETS, 0); }
		public TerminalNode K_OCTET_LENGTH() { return getToken(PostgreSQLParser.K_OCTET_LENGTH, 0); }
		public TerminalNode K_OF() { return getToken(PostgreSQLParser.K_OF, 0); }
		public TerminalNode K_OFF() { return getToken(PostgreSQLParser.K_OFF, 0); }
		public TerminalNode K_OFFSET() { return getToken(PostgreSQLParser.K_OFFSET, 0); }
		public TerminalNode K_OIDS() { return getToken(PostgreSQLParser.K_OIDS, 0); }
		public TerminalNode K_OLD() { return getToken(PostgreSQLParser.K_OLD, 0); }
		public TerminalNode K_ON() { return getToken(PostgreSQLParser.K_ON, 0); }
		public TerminalNode K_ONLY() { return getToken(PostgreSQLParser.K_ONLY, 0); }
		public TerminalNode K_OPEN() { return getToken(PostgreSQLParser.K_OPEN, 0); }
		public TerminalNode K_OPERATOR() { return getToken(PostgreSQLParser.K_OPERATOR, 0); }
		public TerminalNode K_OPTION() { return getToken(PostgreSQLParser.K_OPTION, 0); }
		public TerminalNode K_OPTIONS() { return getToken(PostgreSQLParser.K_OPTIONS, 0); }
		public TerminalNode K_OR() { return getToken(PostgreSQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(PostgreSQLParser.K_ORDER, 0); }
		public TerminalNode K_ORDERING() { return getToken(PostgreSQLParser.K_ORDERING, 0); }
		public TerminalNode K_ORDINALITY() { return getToken(PostgreSQLParser.K_ORDINALITY, 0); }
		public TerminalNode K_OTHERS() { return getToken(PostgreSQLParser.K_OTHERS, 0); }
		public TerminalNode K_OUT() { return getToken(PostgreSQLParser.K_OUT, 0); }
		public TerminalNode K_OUTER() { return getToken(PostgreSQLParser.K_OUTER, 0); }
		public TerminalNode K_OUTPUT() { return getToken(PostgreSQLParser.K_OUTPUT, 0); }
		public TerminalNode K_OVER() { return getToken(PostgreSQLParser.K_OVER, 0); }
		public TerminalNode K_OVERLAPS() { return getToken(PostgreSQLParser.K_OVERLAPS, 0); }
		public TerminalNode K_OVERLAY() { return getToken(PostgreSQLParser.K_OVERLAY, 0); }
		public TerminalNode K_OVERRIDING() { return getToken(PostgreSQLParser.K_OVERRIDING, 0); }
		public TerminalNode K_OWNED() { return getToken(PostgreSQLParser.K_OWNED, 0); }
		public TerminalNode K_OWNER() { return getToken(PostgreSQLParser.K_OWNER, 0); }
		public TerminalNode K_P() { return getToken(PostgreSQLParser.K_P, 0); }
		public TerminalNode K_PAD() { return getToken(PostgreSQLParser.K_PAD, 0); }
		public TerminalNode K_PARALLEL() { return getToken(PostgreSQLParser.K_PARALLEL, 0); }
		public TerminalNode K_PARAMETER() { return getToken(PostgreSQLParser.K_PARAMETER, 0); }
		public TerminalNode K_PARAMETER_MODE() { return getToken(PostgreSQLParser.K_PARAMETER_MODE, 0); }
		public TerminalNode K_PARAMETER_NAME() { return getToken(PostgreSQLParser.K_PARAMETER_NAME, 0); }
		public TerminalNode K_PARAMETER_ORDINAL_POSITION() { return getToken(PostgreSQLParser.K_PARAMETER_ORDINAL_POSITION, 0); }
		public TerminalNode K_PARAMETER_SPECIFIC_CATALOG() { return getToken(PostgreSQLParser.K_PARAMETER_SPECIFIC_CATALOG, 0); }
		public TerminalNode K_PARAMETER_SPECIFIC_NAME() { return getToken(PostgreSQLParser.K_PARAMETER_SPECIFIC_NAME, 0); }
		public TerminalNode K_PARAMETER_SPECIFIC_SCHEMA() { return getToken(PostgreSQLParser.K_PARAMETER_SPECIFIC_SCHEMA, 0); }
		public TerminalNode K_PARSER() { return getToken(PostgreSQLParser.K_PARSER, 0); }
		public TerminalNode K_PARTIAL() { return getToken(PostgreSQLParser.K_PARTIAL, 0); }
		public TerminalNode K_PARTITION() { return getToken(PostgreSQLParser.K_PARTITION, 0); }
		public TerminalNode K_PASCAL() { return getToken(PostgreSQLParser.K_PASCAL, 0); }
		public TerminalNode K_PASSING() { return getToken(PostgreSQLParser.K_PASSING, 0); }
		public TerminalNode K_PASSTHROUGH() { return getToken(PostgreSQLParser.K_PASSTHROUGH, 0); }
		public TerminalNode K_PASSWORD() { return getToken(PostgreSQLParser.K_PASSWORD, 0); }
		public TerminalNode K_PATH() { return getToken(PostgreSQLParser.K_PATH, 0); }
		public TerminalNode K_PERCENT() { return getToken(PostgreSQLParser.K_PERCENT, 0); }
		public TerminalNode K_PERCENTILE_CONT() { return getToken(PostgreSQLParser.K_PERCENTILE_CONT, 0); }
		public TerminalNode K_PERCENTILE_DISC() { return getToken(PostgreSQLParser.K_PERCENTILE_DISC, 0); }
		public TerminalNode K_PERCENT_RANK() { return getToken(PostgreSQLParser.K_PERCENT_RANK, 0); }
		public TerminalNode K_PERIOD() { return getToken(PostgreSQLParser.K_PERIOD, 0); }
		public TerminalNode K_PERMISSION() { return getToken(PostgreSQLParser.K_PERMISSION, 0); }
		public TerminalNode K_PLACING() { return getToken(PostgreSQLParser.K_PLACING, 0); }
		public TerminalNode K_PLANS() { return getToken(PostgreSQLParser.K_PLANS, 0); }
		public TerminalNode K_PLI() { return getToken(PostgreSQLParser.K_PLI, 0); }
		public TerminalNode K_POLICY() { return getToken(PostgreSQLParser.K_POLICY, 0); }
		public TerminalNode K_PORTION() { return getToken(PostgreSQLParser.K_PORTION, 0); }
		public TerminalNode K_POSITION() { return getToken(PostgreSQLParser.K_POSITION, 0); }
		public TerminalNode K_POSITION_REGEX() { return getToken(PostgreSQLParser.K_POSITION_REGEX, 0); }
		public TerminalNode K_POWER() { return getToken(PostgreSQLParser.K_POWER, 0); }
		public TerminalNode K_PRECEDES() { return getToken(PostgreSQLParser.K_PRECEDES, 0); }
		public TerminalNode K_PRECEDING() { return getToken(PostgreSQLParser.K_PRECEDING, 0); }
		public TerminalNode K_PRECISION() { return getToken(PostgreSQLParser.K_PRECISION, 0); }
		public TerminalNode K_PREPARE() { return getToken(PostgreSQLParser.K_PREPARE, 0); }
		public TerminalNode K_PREPARED() { return getToken(PostgreSQLParser.K_PREPARED, 0); }
		public TerminalNode K_PRESERVE() { return getToken(PostgreSQLParser.K_PRESERVE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(PostgreSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_PRIOR() { return getToken(PostgreSQLParser.K_PRIOR, 0); }
		public TerminalNode K_PRIVILEGES() { return getToken(PostgreSQLParser.K_PRIVILEGES, 0); }
		public TerminalNode K_PROCEDURAL() { return getToken(PostgreSQLParser.K_PROCEDURAL, 0); }
		public TerminalNode K_PROCEDURE() { return getToken(PostgreSQLParser.K_PROCEDURE, 0); }
		public TerminalNode K_PROGRAM() { return getToken(PostgreSQLParser.K_PROGRAM, 0); }
		public TerminalNode K_PUBLIC() { return getToken(PostgreSQLParser.K_PUBLIC, 0); }
		public TerminalNode K_QUOTE() { return getToken(PostgreSQLParser.K_QUOTE, 0); }
		public TerminalNode K_RANGE() { return getToken(PostgreSQLParser.K_RANGE, 0); }
		public TerminalNode K_RANK() { return getToken(PostgreSQLParser.K_RANK, 0); }
		public TerminalNode K_READ() { return getToken(PostgreSQLParser.K_READ, 0); }
		public TerminalNode K_READS() { return getToken(PostgreSQLParser.K_READS, 0); }
		public TerminalNode K_REAL() { return getToken(PostgreSQLParser.K_REAL, 0); }
		public TerminalNode K_REASSIGN() { return getToken(PostgreSQLParser.K_REASSIGN, 0); }
		public TerminalNode K_RECHECK() { return getToken(PostgreSQLParser.K_RECHECK, 0); }
		public TerminalNode K_RECOVERY() { return getToken(PostgreSQLParser.K_RECOVERY, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(PostgreSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REF() { return getToken(PostgreSQLParser.K_REF, 0); }
		public TerminalNode K_REFERENCES() { return getToken(PostgreSQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REFERENCING() { return getToken(PostgreSQLParser.K_REFERENCING, 0); }
		public TerminalNode K_REFRESH() { return getToken(PostgreSQLParser.K_REFRESH, 0); }
		public TerminalNode K_REGR_AVGX() { return getToken(PostgreSQLParser.K_REGR_AVGX, 0); }
		public TerminalNode K_REGR_AVGY() { return getToken(PostgreSQLParser.K_REGR_AVGY, 0); }
		public TerminalNode K_REGR_COUNT() { return getToken(PostgreSQLParser.K_REGR_COUNT, 0); }
		public TerminalNode K_REGR_INTERCEPT() { return getToken(PostgreSQLParser.K_REGR_INTERCEPT, 0); }
		public TerminalNode K_REGR_R2() { return getToken(PostgreSQLParser.K_REGR_R2, 0); }
		public TerminalNode K_REGR_SLOPE() { return getToken(PostgreSQLParser.K_REGR_SLOPE, 0); }
		public TerminalNode K_REGR_SXX() { return getToken(PostgreSQLParser.K_REGR_SXX, 0); }
		public TerminalNode K_REGR_SXY() { return getToken(PostgreSQLParser.K_REGR_SXY, 0); }
		public TerminalNode K_REGR_SYY() { return getToken(PostgreSQLParser.K_REGR_SYY, 0); }
		public TerminalNode K_REINDEX() { return getToken(PostgreSQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELATIVE() { return getToken(PostgreSQLParser.K_RELATIVE, 0); }
		public TerminalNode K_RELEASE() { return getToken(PostgreSQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(PostgreSQLParser.K_RENAME, 0); }
		public TerminalNode K_REPEATABLE() { return getToken(PostgreSQLParser.K_REPEATABLE, 0); }
		public TerminalNode K_REPLACE() { return getToken(PostgreSQLParser.K_REPLACE, 0); }
		public TerminalNode K_REPLICA() { return getToken(PostgreSQLParser.K_REPLICA, 0); }
		public TerminalNode K_REQUIRING() { return getToken(PostgreSQLParser.K_REQUIRING, 0); }
		public TerminalNode K_RESET() { return getToken(PostgreSQLParser.K_RESET, 0); }
		public TerminalNode K_RESPECT() { return getToken(PostgreSQLParser.K_RESPECT, 0); }
		public TerminalNode K_RESTART() { return getToken(PostgreSQLParser.K_RESTART, 0); }
		public TerminalNode K_RESTORE() { return getToken(PostgreSQLParser.K_RESTORE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(PostgreSQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RESULT() { return getToken(PostgreSQLParser.K_RESULT, 0); }
		public TerminalNode K_RETURN() { return getToken(PostgreSQLParser.K_RETURN, 0); }
		public TerminalNode K_RETURNED_CARDINALITY() { return getToken(PostgreSQLParser.K_RETURNED_CARDINALITY, 0); }
		public TerminalNode K_RETURNED_LENGTH() { return getToken(PostgreSQLParser.K_RETURNED_LENGTH, 0); }
		public TerminalNode K_RETURNED_OCTET_LENGTH() { return getToken(PostgreSQLParser.K_RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode K_RETURNED_SQLSTATE() { return getToken(PostgreSQLParser.K_RETURNED_SQLSTATE, 0); }
		public TerminalNode K_RETURNING() { return getToken(PostgreSQLParser.K_RETURNING, 0); }
		public TerminalNode K_RETURNS() { return getToken(PostgreSQLParser.K_RETURNS, 0); }
		public TerminalNode K_REVOKE() { return getToken(PostgreSQLParser.K_REVOKE, 0); }
		public TerminalNode K_RIGHT() { return getToken(PostgreSQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLE() { return getToken(PostgreSQLParser.K_ROLE, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(PostgreSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROLLUP() { return getToken(PostgreSQLParser.K_ROLLUP, 0); }
		public TerminalNode K_ROUTINE() { return getToken(PostgreSQLParser.K_ROUTINE, 0); }
		public TerminalNode K_ROUTINE_CATALOG() { return getToken(PostgreSQLParser.K_ROUTINE_CATALOG, 0); }
		public TerminalNode K_ROUTINE_NAME() { return getToken(PostgreSQLParser.K_ROUTINE_NAME, 0); }
		public TerminalNode K_ROUTINE_SCHEMA() { return getToken(PostgreSQLParser.K_ROUTINE_SCHEMA, 0); }
		public TerminalNode K_ROW() { return getToken(PostgreSQLParser.K_ROW, 0); }
		public TerminalNode K_ROWS() { return getToken(PostgreSQLParser.K_ROWS, 0); }
		public TerminalNode K_ROW_COUNT() { return getToken(PostgreSQLParser.K_ROW_COUNT, 0); }
		public TerminalNode K_ROW_NUMBER() { return getToken(PostgreSQLParser.K_ROW_NUMBER, 0); }
		public TerminalNode K_RULE() { return getToken(PostgreSQLParser.K_RULE, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(PostgreSQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SCALE() { return getToken(PostgreSQLParser.K_SCALE, 0); }
		public TerminalNode K_SCHEMA() { return getToken(PostgreSQLParser.K_SCHEMA, 0); }
		public TerminalNode K_SCHEMA_NAME() { return getToken(PostgreSQLParser.K_SCHEMA_NAME, 0); }
		public TerminalNode K_SCOPE() { return getToken(PostgreSQLParser.K_SCOPE, 0); }
		public TerminalNode K_SCOPE_CATALOG() { return getToken(PostgreSQLParser.K_SCOPE_CATALOG, 0); }
		public TerminalNode K_SCOPE_NAME() { return getToken(PostgreSQLParser.K_SCOPE_NAME, 0); }
		public TerminalNode K_SCOPE_SCHEMA() { return getToken(PostgreSQLParser.K_SCOPE_SCHEMA, 0); }
		public TerminalNode K_SCROLL() { return getToken(PostgreSQLParser.K_SCROLL, 0); }
		public TerminalNode K_SEARCH() { return getToken(PostgreSQLParser.K_SEARCH, 0); }
		public TerminalNode K_SECOND() { return getToken(PostgreSQLParser.K_SECOND, 0); }
		public TerminalNode K_SECTION() { return getToken(PostgreSQLParser.K_SECTION, 0); }
		public TerminalNode K_SECURITY() { return getToken(PostgreSQLParser.K_SECURITY, 0); }
		public TerminalNode K_SELECT() { return getToken(PostgreSQLParser.K_SELECT, 0); }
		public TerminalNode K_SELECTIVE() { return getToken(PostgreSQLParser.K_SELECTIVE, 0); }
		public TerminalNode K_SELF() { return getToken(PostgreSQLParser.K_SELF, 0); }
		public TerminalNode K_SENSITIVE() { return getToken(PostgreSQLParser.K_SENSITIVE, 0); }
		public TerminalNode K_SEQUENCE() { return getToken(PostgreSQLParser.K_SEQUENCE, 0); }
		public TerminalNode K_SEQUENCES() { return getToken(PostgreSQLParser.K_SEQUENCES, 0); }
		public TerminalNode K_SERIALIZABLE() { return getToken(PostgreSQLParser.K_SERIALIZABLE, 0); }
		public TerminalNode K_SERVER() { return getToken(PostgreSQLParser.K_SERVER, 0); }
		public TerminalNode K_SERVER_NAME() { return getToken(PostgreSQLParser.K_SERVER_NAME, 0); }
		public TerminalNode K_SESSION() { return getToken(PostgreSQLParser.K_SESSION, 0); }
		public TerminalNode K_SESSION_USER() { return getToken(PostgreSQLParser.K_SESSION_USER, 0); }
		public TerminalNode K_SET() { return getToken(PostgreSQLParser.K_SET, 0); }
		public TerminalNode K_SETOF() { return getToken(PostgreSQLParser.K_SETOF, 0); }
		public TerminalNode K_SETS() { return getToken(PostgreSQLParser.K_SETS, 0); }
		public TerminalNode K_SHARE() { return getToken(PostgreSQLParser.K_SHARE, 0); }
		public TerminalNode K_SHOW() { return getToken(PostgreSQLParser.K_SHOW, 0); }
		public TerminalNode K_SIMILAR() { return getToken(PostgreSQLParser.K_SIMILAR, 0); }
		public TerminalNode K_SIMPLE() { return getToken(PostgreSQLParser.K_SIMPLE, 0); }
		public TerminalNode K_SIZE() { return getToken(PostgreSQLParser.K_SIZE, 0); }
		public TerminalNode K_SKIP() { return getToken(PostgreSQLParser.K_SKIP, 0); }
		public TerminalNode K_SMALLINT() { return getToken(PostgreSQLParser.K_SMALLINT, 0); }
		public TerminalNode K_SNAPSHOT() { return getToken(PostgreSQLParser.K_SNAPSHOT, 0); }
		public TerminalNode K_SOME() { return getToken(PostgreSQLParser.K_SOME, 0); }
		public TerminalNode K_SOURCE() { return getToken(PostgreSQLParser.K_SOURCE, 0); }
		public TerminalNode K_SPACE() { return getToken(PostgreSQLParser.K_SPACE, 0); }
		public TerminalNode K_SPECIFIC() { return getToken(PostgreSQLParser.K_SPECIFIC, 0); }
		public TerminalNode K_SPECIFICTYPE() { return getToken(PostgreSQLParser.K_SPECIFICTYPE, 0); }
		public TerminalNode K_SPECIFIC_NAME() { return getToken(PostgreSQLParser.K_SPECIFIC_NAME, 0); }
		public TerminalNode K_SQL() { return getToken(PostgreSQLParser.K_SQL, 0); }
		public TerminalNode K_SQLCODE() { return getToken(PostgreSQLParser.K_SQLCODE, 0); }
		public TerminalNode K_SQLERROR() { return getToken(PostgreSQLParser.K_SQLERROR, 0); }
		public TerminalNode K_SQLEXCEPTION() { return getToken(PostgreSQLParser.K_SQLEXCEPTION, 0); }
		public TerminalNode K_SQLSTATE() { return getToken(PostgreSQLParser.K_SQLSTATE, 0); }
		public TerminalNode K_SQLWARNING() { return getToken(PostgreSQLParser.K_SQLWARNING, 0); }
		public TerminalNode K_SQRT() { return getToken(PostgreSQLParser.K_SQRT, 0); }
		public TerminalNode K_STABLE() { return getToken(PostgreSQLParser.K_STABLE, 0); }
		public TerminalNode K_STANDALONE() { return getToken(PostgreSQLParser.K_STANDALONE, 0); }
		public TerminalNode K_START() { return getToken(PostgreSQLParser.K_START, 0); }
		public TerminalNode K_STATE() { return getToken(PostgreSQLParser.K_STATE, 0); }
		public TerminalNode K_STATEMENT() { return getToken(PostgreSQLParser.K_STATEMENT, 0); }
		public TerminalNode K_STATIC() { return getToken(PostgreSQLParser.K_STATIC, 0); }
		public TerminalNode K_STATISTICS() { return getToken(PostgreSQLParser.K_STATISTICS, 0); }
		public TerminalNode K_STDDEV_POP() { return getToken(PostgreSQLParser.K_STDDEV_POP, 0); }
		public TerminalNode K_STDDEV_SAMP() { return getToken(PostgreSQLParser.K_STDDEV_SAMP, 0); }
		public TerminalNode K_STDIN() { return getToken(PostgreSQLParser.K_STDIN, 0); }
		public TerminalNode K_STDOUT() { return getToken(PostgreSQLParser.K_STDOUT, 0); }
		public TerminalNode K_STORAGE() { return getToken(PostgreSQLParser.K_STORAGE, 0); }
		public TerminalNode K_STRICT() { return getToken(PostgreSQLParser.K_STRICT, 0); }
		public TerminalNode K_STRIP() { return getToken(PostgreSQLParser.K_STRIP, 0); }
		public TerminalNode K_STRUCTURE() { return getToken(PostgreSQLParser.K_STRUCTURE, 0); }
		public TerminalNode K_STYLE() { return getToken(PostgreSQLParser.K_STYLE, 0); }
		public TerminalNode K_SUBCLASS_ORIGIN() { return getToken(PostgreSQLParser.K_SUBCLASS_ORIGIN, 0); }
		public TerminalNode K_SUBMULTISET() { return getToken(PostgreSQLParser.K_SUBMULTISET, 0); }
		public TerminalNode K_SUBSTRING() { return getToken(PostgreSQLParser.K_SUBSTRING, 0); }
		public TerminalNode K_SUBSTRING_REGEX() { return getToken(PostgreSQLParser.K_SUBSTRING_REGEX, 0); }
		public TerminalNode K_SUCCEEDS() { return getToken(PostgreSQLParser.K_SUCCEEDS, 0); }
		public TerminalNode K_SUM() { return getToken(PostgreSQLParser.K_SUM, 0); }
		public TerminalNode K_SYMMETRIC() { return getToken(PostgreSQLParser.K_SYMMETRIC, 0); }
		public TerminalNode K_SYSID() { return getToken(PostgreSQLParser.K_SYSID, 0); }
		public TerminalNode K_SYSTEM() { return getToken(PostgreSQLParser.K_SYSTEM, 0); }
		public TerminalNode K_SYSTEM_TIME() { return getToken(PostgreSQLParser.K_SYSTEM_TIME, 0); }
		public TerminalNode K_SYSTEM_USER() { return getToken(PostgreSQLParser.K_SYSTEM_USER, 0); }
		public TerminalNode K_T() { return getToken(PostgreSQLParser.K_T, 0); }
		public TerminalNode K_TABLE() { return getToken(PostgreSQLParser.K_TABLE, 0); }
		public TerminalNode K_TABLES() { return getToken(PostgreSQLParser.K_TABLES, 0); }
		public TerminalNode K_TABLESAMPLE() { return getToken(PostgreSQLParser.K_TABLESAMPLE, 0); }
		public TerminalNode K_TABLESPACE() { return getToken(PostgreSQLParser.K_TABLESPACE, 0); }
		public TerminalNode K_TABLE_NAME() { return getToken(PostgreSQLParser.K_TABLE_NAME, 0); }
		public TerminalNode K_TEMP() { return getToken(PostgreSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPLATE() { return getToken(PostgreSQLParser.K_TEMPLATE, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(PostgreSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_TEXT() { return getToken(PostgreSQLParser.K_TEXT, 0); }
		public TerminalNode K_THEN() { return getToken(PostgreSQLParser.K_THEN, 0); }
		public TerminalNode K_TIES() { return getToken(PostgreSQLParser.K_TIES, 0); }
		public TerminalNode K_TIME() { return getToken(PostgreSQLParser.K_TIME, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(PostgreSQLParser.K_TIMESTAMP, 0); }
		public TerminalNode K_TIMEZONE_HOUR() { return getToken(PostgreSQLParser.K_TIMEZONE_HOUR, 0); }
		public TerminalNode K_TIMEZONE_MINUTE() { return getToken(PostgreSQLParser.K_TIMEZONE_MINUTE, 0); }
		public TerminalNode K_TO() { return getToken(PostgreSQLParser.K_TO, 0); }
		public TerminalNode K_TOKEN() { return getToken(PostgreSQLParser.K_TOKEN, 0); }
		public TerminalNode K_TOP_LEVEL_COUNT() { return getToken(PostgreSQLParser.K_TOP_LEVEL_COUNT, 0); }
		public TerminalNode K_TRAILING() { return getToken(PostgreSQLParser.K_TRAILING, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(PostgreSQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRANSACTIONS_COMMITTED() { return getToken(PostgreSQLParser.K_TRANSACTIONS_COMMITTED, 0); }
		public TerminalNode K_TRANSACTIONS_ROLLED_BACK() { return getToken(PostgreSQLParser.K_TRANSACTIONS_ROLLED_BACK, 0); }
		public TerminalNode K_TRANSACTION_ACTIVE() { return getToken(PostgreSQLParser.K_TRANSACTION_ACTIVE, 0); }
		public TerminalNode K_TRANSFORM() { return getToken(PostgreSQLParser.K_TRANSFORM, 0); }
		public TerminalNode K_TRANSFORMS() { return getToken(PostgreSQLParser.K_TRANSFORMS, 0); }
		public TerminalNode K_TRANSLATE() { return getToken(PostgreSQLParser.K_TRANSLATE, 0); }
		public TerminalNode K_TRANSLATE_REGEX() { return getToken(PostgreSQLParser.K_TRANSLATE_REGEX, 0); }
		public TerminalNode K_TRANSLATION() { return getToken(PostgreSQLParser.K_TRANSLATION, 0); }
		public TerminalNode K_TREAT() { return getToken(PostgreSQLParser.K_TREAT, 0); }
		public TerminalNode K_TRIGGER() { return getToken(PostgreSQLParser.K_TRIGGER, 0); }
		public TerminalNode K_TRIGGER_CATALOG() { return getToken(PostgreSQLParser.K_TRIGGER_CATALOG, 0); }
		public TerminalNode K_TRIGGER_NAME() { return getToken(PostgreSQLParser.K_TRIGGER_NAME, 0); }
		public TerminalNode K_TRIGGER_SCHEMA() { return getToken(PostgreSQLParser.K_TRIGGER_SCHEMA, 0); }
		public TerminalNode K_TRIM() { return getToken(PostgreSQLParser.K_TRIM, 0); }
		public TerminalNode K_TRIM_ARRAY() { return getToken(PostgreSQLParser.K_TRIM_ARRAY, 0); }
		public TerminalNode K_TRUE() { return getToken(PostgreSQLParser.K_TRUE, 0); }
		public TerminalNode K_TRUNCATE() { return getToken(PostgreSQLParser.K_TRUNCATE, 0); }
		public TerminalNode K_TRUSTED() { return getToken(PostgreSQLParser.K_TRUSTED, 0); }
		public TerminalNode K_TYPE() { return getToken(PostgreSQLParser.K_TYPE, 0); }
		public TerminalNode K_TYPES() { return getToken(PostgreSQLParser.K_TYPES, 0); }
		public TerminalNode K_UESCAPE() { return getToken(PostgreSQLParser.K_UESCAPE, 0); }
		public TerminalNode K_UNBOUNDED() { return getToken(PostgreSQLParser.K_UNBOUNDED, 0); }
		public TerminalNode K_UNCOMMITTED() { return getToken(PostgreSQLParser.K_UNCOMMITTED, 0); }
		public TerminalNode K_UNDER() { return getToken(PostgreSQLParser.K_UNDER, 0); }
		public TerminalNode K_UNENCRYPTED() { return getToken(PostgreSQLParser.K_UNENCRYPTED, 0); }
		public TerminalNode K_UNION() { return getToken(PostgreSQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(PostgreSQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UNKNOWN() { return getToken(PostgreSQLParser.K_UNKNOWN, 0); }
		public TerminalNode K_UNLINK() { return getToken(PostgreSQLParser.K_UNLINK, 0); }
		public TerminalNode K_UNLISTEN() { return getToken(PostgreSQLParser.K_UNLISTEN, 0); }
		public TerminalNode K_UNLOGGED() { return getToken(PostgreSQLParser.K_UNLOGGED, 0); }
		public TerminalNode K_UNNAMED() { return getToken(PostgreSQLParser.K_UNNAMED, 0); }
		public TerminalNode K_UNNEST() { return getToken(PostgreSQLParser.K_UNNEST, 0); }
		public TerminalNode K_UNTIL() { return getToken(PostgreSQLParser.K_UNTIL, 0); }
		public TerminalNode K_UNTYPED() { return getToken(PostgreSQLParser.K_UNTYPED, 0); }
		public TerminalNode K_UPDATE() { return getToken(PostgreSQLParser.K_UPDATE, 0); }
		public TerminalNode K_UPPER() { return getToken(PostgreSQLParser.K_UPPER, 0); }
		public TerminalNode K_URI() { return getToken(PostgreSQLParser.K_URI, 0); }
		public TerminalNode K_USAGE() { return getToken(PostgreSQLParser.K_USAGE, 0); }
		public TerminalNode K_USER() { return getToken(PostgreSQLParser.K_USER, 0); }
		public TerminalNode K_USER_DEFINED_TYPE_CATALOG() { return getToken(PostgreSQLParser.K_USER_DEFINED_TYPE_CATALOG, 0); }
		public TerminalNode K_USER_DEFINED_TYPE_CODE() { return getToken(PostgreSQLParser.K_USER_DEFINED_TYPE_CODE, 0); }
		public TerminalNode K_USER_DEFINED_TYPE_NAME() { return getToken(PostgreSQLParser.K_USER_DEFINED_TYPE_NAME, 0); }
		public TerminalNode K_USER_DEFINED_TYPE_SCHEMA() { return getToken(PostgreSQLParser.K_USER_DEFINED_TYPE_SCHEMA, 0); }
		public TerminalNode K_USING() { return getToken(PostgreSQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(PostgreSQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALID() { return getToken(PostgreSQLParser.K_VALID, 0); }
		public TerminalNode K_VALIDATE() { return getToken(PostgreSQLParser.K_VALIDATE, 0); }
		public TerminalNode K_VALIDATOR() { return getToken(PostgreSQLParser.K_VALIDATOR, 0); }
		public TerminalNode K_VALUE() { return getToken(PostgreSQLParser.K_VALUE, 0); }
		public TerminalNode K_VALUES() { return getToken(PostgreSQLParser.K_VALUES, 0); }
		public TerminalNode K_VALUE_OF() { return getToken(PostgreSQLParser.K_VALUE_OF, 0); }
		public TerminalNode K_VARBINARY() { return getToken(PostgreSQLParser.K_VARBINARY, 0); }
		public TerminalNode K_VARCHAR() { return getToken(PostgreSQLParser.K_VARCHAR, 0); }
		public TerminalNode K_VARIADIC() { return getToken(PostgreSQLParser.K_VARIADIC, 0); }
		public TerminalNode K_VARYING() { return getToken(PostgreSQLParser.K_VARYING, 0); }
		public TerminalNode K_VAR_POP() { return getToken(PostgreSQLParser.K_VAR_POP, 0); }
		public TerminalNode K_VAR_SAMP() { return getToken(PostgreSQLParser.K_VAR_SAMP, 0); }
		public TerminalNode K_VERBOSE() { return getToken(PostgreSQLParser.K_VERBOSE, 0); }
		public TerminalNode K_VERSION() { return getToken(PostgreSQLParser.K_VERSION, 0); }
		public TerminalNode K_VERSIONING() { return getToken(PostgreSQLParser.K_VERSIONING, 0); }
		public TerminalNode K_VIEW() { return getToken(PostgreSQLParser.K_VIEW, 0); }
		public TerminalNode K_VIEWS() { return getToken(PostgreSQLParser.K_VIEWS, 0); }
		public TerminalNode K_VOLATILE() { return getToken(PostgreSQLParser.K_VOLATILE, 0); }
		public TerminalNode K_WHEN() { return getToken(PostgreSQLParser.K_WHEN, 0); }
		public TerminalNode K_WHENEVER() { return getToken(PostgreSQLParser.K_WHENEVER, 0); }
		public TerminalNode K_WHERE() { return getToken(PostgreSQLParser.K_WHERE, 0); }
		public TerminalNode K_WHITESPACE() { return getToken(PostgreSQLParser.K_WHITESPACE, 0); }
		public TerminalNode K_WIDTH_BUCKET() { return getToken(PostgreSQLParser.K_WIDTH_BUCKET, 0); }
		public TerminalNode K_WINDOW() { return getToken(PostgreSQLParser.K_WINDOW, 0); }
		public TerminalNode K_WITH() { return getToken(PostgreSQLParser.K_WITH, 0); }
		public TerminalNode K_WITHIN() { return getToken(PostgreSQLParser.K_WITHIN, 0); }
		public TerminalNode K_WITHOUT() { return getToken(PostgreSQLParser.K_WITHOUT, 0); }
		public TerminalNode K_WORK() { return getToken(PostgreSQLParser.K_WORK, 0); }
		public TerminalNode K_WRAPPER() { return getToken(PostgreSQLParser.K_WRAPPER, 0); }
		public TerminalNode K_WRITE() { return getToken(PostgreSQLParser.K_WRITE, 0); }
		public TerminalNode K_XML() { return getToken(PostgreSQLParser.K_XML, 0); }
		public TerminalNode K_XMLAGG() { return getToken(PostgreSQLParser.K_XMLAGG, 0); }
		public TerminalNode K_XMLATTRIBUTES() { return getToken(PostgreSQLParser.K_XMLATTRIBUTES, 0); }
		public TerminalNode K_XMLBINARY() { return getToken(PostgreSQLParser.K_XMLBINARY, 0); }
		public TerminalNode K_XMLCAST() { return getToken(PostgreSQLParser.K_XMLCAST, 0); }
		public TerminalNode K_XMLCOMMENT() { return getToken(PostgreSQLParser.K_XMLCOMMENT, 0); }
		public TerminalNode K_XMLCONCAT() { return getToken(PostgreSQLParser.K_XMLCONCAT, 0); }
		public TerminalNode K_XMLDECLARATION() { return getToken(PostgreSQLParser.K_XMLDECLARATION, 0); }
		public TerminalNode K_XMLDOCUMENT() { return getToken(PostgreSQLParser.K_XMLDOCUMENT, 0); }
		public TerminalNode K_XMLELEMENT() { return getToken(PostgreSQLParser.K_XMLELEMENT, 0); }
		public TerminalNode K_XMLEXISTS() { return getToken(PostgreSQLParser.K_XMLEXISTS, 0); }
		public TerminalNode K_XMLFOREST() { return getToken(PostgreSQLParser.K_XMLFOREST, 0); }
		public TerminalNode K_XMLITERATE() { return getToken(PostgreSQLParser.K_XMLITERATE, 0); }
		public TerminalNode K_XMLNAMESPACES() { return getToken(PostgreSQLParser.K_XMLNAMESPACES, 0); }
		public TerminalNode K_XMLPARSE() { return getToken(PostgreSQLParser.K_XMLPARSE, 0); }
		public TerminalNode K_XMLPI() { return getToken(PostgreSQLParser.K_XMLPI, 0); }
		public TerminalNode K_XMLQUERY() { return getToken(PostgreSQLParser.K_XMLQUERY, 0); }
		public TerminalNode K_XMLROOT() { return getToken(PostgreSQLParser.K_XMLROOT, 0); }
		public TerminalNode K_XMLSCHEMA() { return getToken(PostgreSQLParser.K_XMLSCHEMA, 0); }
		public TerminalNode K_XMLSERIALIZE() { return getToken(PostgreSQLParser.K_XMLSERIALIZE, 0); }
		public TerminalNode K_XMLTABLE() { return getToken(PostgreSQLParser.K_XMLTABLE, 0); }
		public TerminalNode K_XMLTEXT() { return getToken(PostgreSQLParser.K_XMLTEXT, 0); }
		public TerminalNode K_XMLVALIDATE() { return getToken(PostgreSQLParser.K_XMLVALIDATE, 0); }
		public TerminalNode K_YEAR() { return getToken(PostgreSQLParser.K_YEAR, 0); }
		public TerminalNode K_YES() { return getToken(PostgreSQLParser.K_YES, 0); }
		public TerminalNode K_ZONE() { return getToken(PostgreSQLParser.K_ZONE, 0); }
		public TerminalNode K_BIGSERIAL() { return getToken(PostgreSQLParser.K_BIGSERIAL, 0); }
		public TerminalNode K_SERIAL() { return getToken(PostgreSQLParser.K_SERIAL, 0); }
		public TerminalNode K_SMALLSERIAL() { return getToken(PostgreSQLParser.K_SMALLSERIAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (K_A - 24)) | (1L << (K_ABORT - 24)) | (1L << (K_ABS - 24)) | (1L << (K_ABSENT - 24)) | (1L << (K_ABSOLUTE - 24)) | (1L << (K_ACCESS - 24)) | (1L << (K_ACCORDING - 24)) | (1L << (K_ACTION - 24)) | (1L << (K_ADA - 24)) | (1L << (K_ADD - 24)) | (1L << (K_ADMIN - 24)) | (1L << (K_AFTER - 24)) | (1L << (K_AGGREGATE - 24)) | (1L << (K_ALL - 24)) | (1L << (K_ALLOCATE - 24)) | (1L << (K_ALSO - 24)) | (1L << (K_ALTER - 24)) | (1L << (K_ALWAYS - 24)) | (1L << (K_ANALYSE - 24)) | (1L << (K_ANALYZE - 24)) | (1L << (K_AND - 24)) | (1L << (K_ANY - 24)) | (1L << (K_ARE - 24)) | (1L << (K_ARRAY - 24)) | (1L << (K_ARRAY_AGG - 24)) | (1L << (K_ARRAY_MAX_CARDINALITY - 24)) | (1L << (K_AS - 24)) | (1L << (K_ASC - 24)) | (1L << (K_ASENSITIVE - 24)) | (1L << (K_ASSERTION - 24)) | (1L << (K_ASSIGNMENT - 24)) | (1L << (K_ASYMMETRIC - 24)) | (1L << (K_AT - 24)) | (1L << (K_ATOMIC - 24)) | (1L << (K_ATTRIBUTE - 24)) | (1L << (K_ATTRIBUTES - 24)) | (1L << (K_AUTHORIZATION - 24)) | (1L << (K_AVG - 24)) | (1L << (K_BACKWARD - 24)) | (1L << (K_BASE64 - 24)) | (1L << (K_BEFORE - 24)) | (1L << (K_BEGIN - 24)) | (1L << (K_BEGIN_FRAME - 24)) | (1L << (K_BEGIN_PARTITION - 24)) | (1L << (K_BERNOULLI - 24)) | (1L << (K_BETWEEN - 24)) | (1L << (K_BIGINT - 24)) | (1L << (K_BINARY - 24)) | (1L << (K_BIT - 24)) | (1L << (K_BIT_LENGTH - 24)) | (1L << (K_BLOB - 24)) | (1L << (K_BLOCKED - 24)) | (1L << (K_BOM - 24)) | (1L << (K_BOOLEAN - 24)) | (1L << (K_BOTH - 24)) | (1L << (K_BREADTH - 24)) | (1L << (K_BY - 24)) | (1L << (K_C - 24)) | (1L << (K_CACHE - 24)) | (1L << (K_CALL - 24)) | (1L << (K_CALLED - 24)) | (1L << (K_CARDINALITY - 24)) | (1L << (K_CASCADE - 24)) | (1L << (K_CASCADED - 24)))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_CASE - 88)) | (1L << (K_CAST - 88)) | (1L << (K_CATALOG - 88)) | (1L << (K_CATALOG_NAME - 88)) | (1L << (K_CEIL - 88)) | (1L << (K_CEILING - 88)) | (1L << (K_CHAIN - 88)) | (1L << (K_CHAR - 88)) | (1L << (K_CHARACTER - 88)) | (1L << (K_CHARACTERISTICS - 88)) | (1L << (K_CHARACTERS - 88)) | (1L << (K_CHARACTER_LENGTH - 88)) | (1L << (K_CHARACTER_SET_CATALOG - 88)) | (1L << (K_CHARACTER_SET_NAME - 88)) | (1L << (K_CHARACTER_SET_SCHEMA - 88)) | (1L << (K_CHAR_LENGTH - 88)) | (1L << (K_CHECK - 88)) | (1L << (K_CHECKPOINT - 88)) | (1L << (K_CLASS - 88)) | (1L << (K_CLASS_ORIGIN - 88)) | (1L << (K_CLOB - 88)) | (1L << (K_CLOSE - 88)) | (1L << (K_CLUSTER - 88)) | (1L << (K_COALESCE - 88)) | (1L << (K_COBOL - 88)) | (1L << (K_COLLATE - 88)) | (1L << (K_COLLATION - 88)) | (1L << (K_COLLATION_CATALOG - 88)) | (1L << (K_COLLATION_NAME - 88)) | (1L << (K_COLLATION_SCHEMA - 88)) | (1L << (K_COLLECT - 88)) | (1L << (K_COLUMN - 88)) | (1L << (K_COLUMNS - 88)) | (1L << (K_COLUMN_NAME - 88)) | (1L << (K_COMMAND_FUNCTION - 88)) | (1L << (K_COMMAND_FUNCTION_CODE - 88)) | (1L << (K_COMMENT - 88)) | (1L << (K_COMMENTS - 88)) | (1L << (K_COMMIT - 88)) | (1L << (K_COMMITTED - 88)) | (1L << (K_CONCURRENTLY - 88)) | (1L << (K_CONDITION - 88)) | (1L << (K_CONDITION_NUMBER - 88)) | (1L << (K_CONFIGURATION - 88)) | (1L << (K_CONFLICT - 88)) | (1L << (K_CONNECT - 88)) | (1L << (K_CONNECTION - 88)) | (1L << (K_CONNECTION_NAME - 88)) | (1L << (K_CONSTRAINT - 88)) | (1L << (K_CONSTRAINTS - 88)) | (1L << (K_CONSTRAINT_CATALOG - 88)) | (1L << (K_CONSTRAINT_NAME - 88)) | (1L << (K_CONSTRAINT_SCHEMA - 88)) | (1L << (K_CONSTRUCTOR - 88)) | (1L << (K_CONTAINS - 88)) | (1L << (K_CONTENT - 88)) | (1L << (K_CONTINUE - 88)) | (1L << (K_CONTROL - 88)) | (1L << (K_CONVERSION - 88)) | (1L << (K_CONVERT - 88)) | (1L << (K_COPY - 88)) | (1L << (K_CORR - 88)) | (1L << (K_CORRESPONDING - 88)) | (1L << (K_COST - 88)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (K_COUNT - 152)) | (1L << (K_COVAR_POP - 152)) | (1L << (K_COVAR_SAMP - 152)) | (1L << (K_CREATE - 152)) | (1L << (K_CROSS - 152)) | (1L << (K_CSV - 152)) | (1L << (K_CUBE - 152)) | (1L << (K_CUME_DIST - 152)) | (1L << (K_CURRENT - 152)) | (1L << (K_CURRENT_CATALOG - 152)) | (1L << (K_CURRENT_DATE - 152)) | (1L << (K_CURRENT_DEFAULT_TRANSFORM_GROUP - 152)) | (1L << (K_CURRENT_PATH - 152)) | (1L << (K_CURRENT_ROLE - 152)) | (1L << (K_CURRENT_ROW - 152)) | (1L << (K_CURRENT_SCHEMA - 152)) | (1L << (K_CURRENT_TIME - 152)) | (1L << (K_CURRENT_TIMESTAMP - 152)) | (1L << (K_CURRENT_TRANSFORM_GROUP_FOR_TYPE - 152)) | (1L << (K_CURRENT_USER - 152)) | (1L << (K_CURSOR - 152)) | (1L << (K_CURSOR_NAME - 152)) | (1L << (K_CYCLE - 152)) | (1L << (K_DATA - 152)) | (1L << (K_DATABASE - 152)) | (1L << (K_DATALINK - 152)) | (1L << (K_DATE - 152)) | (1L << (K_DATETIME_INTERVAL_CODE - 152)) | (1L << (K_DATETIME_INTERVAL_PRECISION - 152)) | (1L << (K_DAY - 152)) | (1L << (K_DB - 152)) | (1L << (K_DEALLOCATE - 152)) | (1L << (K_DEC - 152)) | (1L << (K_DECIMAL - 152)) | (1L << (K_DECLARE - 152)) | (1L << (K_DEFAULT - 152)) | (1L << (K_DEFAULTS - 152)) | (1L << (K_DEFERRABLE - 152)) | (1L << (K_DEFERRED - 152)) | (1L << (K_DEFINED - 152)) | (1L << (K_DEFINER - 152)) | (1L << (K_DEGREE - 152)) | (1L << (K_DELETE - 152)) | (1L << (K_DELIMITER - 152)) | (1L << (K_DELIMITERS - 152)) | (1L << (K_DENSE_RANK - 152)) | (1L << (K_DEPENDS - 152)) | (1L << (K_DEPTH - 152)) | (1L << (K_DEREF - 152)) | (1L << (K_DERIVED - 152)) | (1L << (K_DESC - 152)) | (1L << (K_DESCRIBE - 152)) | (1L << (K_DESCRIPTOR - 152)) | (1L << (K_DETERMINISTIC - 152)) | (1L << (K_DIAGNOSTICS - 152)) | (1L << (K_DICTIONARY - 152)) | (1L << (K_DISABLE - 152)) | (1L << (K_DISCARD - 152)) | (1L << (K_DISCONNECT - 152)) | (1L << (K_DISPATCH - 152)) | (1L << (K_DISTINCT - 152)) | (1L << (K_DLNEWCOPY - 152)) | (1L << (K_DLPREVIOUSCOPY - 152)) | (1L << (K_DLURLCOMPLETE - 152)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (K_DLURLCOMPLETEONLY - 216)) | (1L << (K_DLURLCOMPLETEWRITE - 216)) | (1L << (K_DLURLPATH - 216)) | (1L << (K_DLURLPATHONLY - 216)) | (1L << (K_DLURLPATHWRITE - 216)) | (1L << (K_DLURLSCHEME - 216)) | (1L << (K_DLURLSERVER - 216)) | (1L << (K_DLVALUE - 216)) | (1L << (K_DO - 216)) | (1L << (K_DOCUMENT - 216)) | (1L << (K_DOMAIN - 216)) | (1L << (K_DOUBLE - 216)) | (1L << (K_DROP - 216)) | (1L << (K_DYNAMIC - 216)) | (1L << (K_DYNAMIC_FUNCTION - 216)) | (1L << (K_DYNAMIC_FUNCTION_CODE - 216)) | (1L << (K_EACH - 216)) | (1L << (K_ELEMENT - 216)) | (1L << (K_ELSE - 216)) | (1L << (K_EMPTY - 216)) | (1L << (K_ENABLE - 216)) | (1L << (K_ENCODING - 216)) | (1L << (K_ENCRYPTED - 216)) | (1L << (K_END - 216)) | (1L << (K_END_EXEC - 216)) | (1L << (K_END_FRAME - 216)) | (1L << (K_END_PARTITION - 216)) | (1L << (K_ENFORCED - 216)) | (1L << (K_ENUM - 216)) | (1L << (K_EQUALS - 216)) | (1L << (K_ESCAPE - 216)) | (1L << (K_EVENT - 216)) | (1L << (K_EVERY - 216)) | (1L << (K_EXCEPT - 216)) | (1L << (K_EXCEPTION - 216)) | (1L << (K_EXCLUDE - 216)) | (1L << (K_EXCLUDING - 216)) | (1L << (K_EXCLUSIVE - 216)) | (1L << (K_EXEC - 216)) | (1L << (K_EXECUTE - 216)) | (1L << (K_EXISTS - 216)) | (1L << (K_EXP - 216)) | (1L << (K_EXPLAIN - 216)) | (1L << (K_EXPRESSION - 216)) | (1L << (K_EXTENSION - 216)) | (1L << (K_EXTERNAL - 216)) | (1L << (K_EXTRACT - 216)) | (1L << (K_FALSE - 216)) | (1L << (K_FAMILY - 216)) | (1L << (K_FETCH - 216)) | (1L << (K_FILE - 216)) | (1L << (K_FILTER - 216)) | (1L << (K_FINAL - 216)) | (1L << (K_FIRST - 216)) | (1L << (K_FIRST_VALUE - 216)) | (1L << (K_FLAG - 216)) | (1L << (K_FLOAT - 216)) | (1L << (K_FLOOR - 216)) | (1L << (K_FOLLOWING - 216)) | (1L << (K_FOR - 216)) | (1L << (K_FORCE - 216)) | (1L << (K_FOREIGN - 216)) | (1L << (K_FORTRAN - 216)) | (1L << (K_FORWARD - 216)))) != 0) || ((((_la - 280)) & ~0x3f) == 0 && ((1L << (_la - 280)) & ((1L << (K_FOUND - 280)) | (1L << (K_FRAME_ROW - 280)) | (1L << (K_FREE - 280)) | (1L << (K_FREEZE - 280)) | (1L << (K_FROM - 280)) | (1L << (K_FS - 280)) | (1L << (K_FULL - 280)) | (1L << (K_FUNCTION - 280)) | (1L << (K_FUNCTIONS - 280)) | (1L << (K_FUSION - 280)) | (1L << (K_G - 280)) | (1L << (K_GENERAL - 280)) | (1L << (K_GENERATED - 280)) | (1L << (K_GET - 280)) | (1L << (K_GLOBAL - 280)) | (1L << (K_GO - 280)) | (1L << (K_GOTO - 280)) | (1L << (K_GRANT - 280)) | (1L << (K_GRANTED - 280)) | (1L << (K_GREATEST - 280)) | (1L << (K_GROUP - 280)) | (1L << (K_GROUPING - 280)) | (1L << (K_GROUPS - 280)) | (1L << (K_HANDLER - 280)) | (1L << (K_HAVING - 280)) | (1L << (K_HEADER - 280)) | (1L << (K_HEX - 280)) | (1L << (K_HIERARCHY - 280)) | (1L << (K_HOLD - 280)) | (1L << (K_HOUR - 280)) | (1L << (K_ID - 280)) | (1L << (K_IDENTITY - 280)) | (1L << (K_IF - 280)) | (1L << (K_IGNORE - 280)) | (1L << (K_ILIKE - 280)) | (1L << (K_IMMEDIATE - 280)) | (1L << (K_IMMEDIATELY - 280)) | (1L << (K_IMMUTABLE - 280)) | (1L << (K_IMPLEMENTATION - 280)) | (1L << (K_IMPLICIT - 280)) | (1L << (K_IMPORT - 280)) | (1L << (K_IN - 280)) | (1L << (K_INCLUDING - 280)) | (1L << (K_INCREMENT - 280)) | (1L << (K_INDENT - 280)) | (1L << (K_INDEX - 280)) | (1L << (K_INDEXES - 280)) | (1L << (K_INDICATOR - 280)) | (1L << (K_INHERIT - 280)) | (1L << (K_INHERITS - 280)) | (1L << (K_INITIALLY - 280)) | (1L << (K_INLINE - 280)) | (1L << (K_INNER - 280)) | (1L << (K_INOUT - 280)) | (1L << (K_INPUT - 280)) | (1L << (K_INSENSITIVE - 280)) | (1L << (K_INSERT - 280)) | (1L << (K_INSTANCE - 280)) | (1L << (K_INSTANTIABLE - 280)) | (1L << (K_INSTEAD - 280)) | (1L << (K_INT - 280)) | (1L << (K_INTEGER - 280)) | (1L << (K_INTEGRITY - 280)) | (1L << (K_INTERSECT - 280)))) != 0) || ((((_la - 344)) & ~0x3f) == 0 && ((1L << (_la - 344)) & ((1L << (K_INTERSECTION - 344)) | (1L << (K_INTERVAL - 344)) | (1L << (K_INTO - 344)) | (1L << (K_INVOKER - 344)) | (1L << (K_IS - 344)) | (1L << (K_ISNULL - 344)) | (1L << (K_ISOLATION - 344)) | (1L << (K_JOIN - 344)) | (1L << (K_K - 344)) | (1L << (K_KEY - 344)) | (1L << (K_KEY_MEMBER - 344)) | (1L << (K_KEY_TYPE - 344)) | (1L << (K_LABEL - 344)) | (1L << (K_LAG - 344)) | (1L << (K_LANGUAGE - 344)) | (1L << (K_LARGE - 344)) | (1L << (K_LAST - 344)) | (1L << (K_LAST_VALUE - 344)) | (1L << (K_LATERAL - 344)) | (1L << (K_LEAD - 344)) | (1L << (K_LEADING - 344)) | (1L << (K_LEAKPROOF - 344)) | (1L << (K_LEAST - 344)) | (1L << (K_LEFT - 344)) | (1L << (K_LENGTH - 344)) | (1L << (K_LEVEL - 344)) | (1L << (K_LIBRARY - 344)) | (1L << (K_LIKE - 344)) | (1L << (K_LIKE_REGEX - 344)) | (1L << (K_LIMIT - 344)) | (1L << (K_LINK - 344)) | (1L << (K_LISTEN - 344)) | (1L << (K_LN - 344)) | (1L << (K_LOAD - 344)) | (1L << (K_LOCAL - 344)) | (1L << (K_LOCALTIME - 344)) | (1L << (K_LOCALTIMESTAMP - 344)) | (1L << (K_LOCATION - 344)) | (1L << (K_LOCATOR - 344)) | (1L << (K_LOCK - 344)) | (1L << (K_LOCKED - 344)) | (1L << (K_LOGGED - 344)) | (1L << (K_LOWER - 344)) | (1L << (K_M - 344)) | (1L << (K_MAP - 344)) | (1L << (K_MAPPING - 344)) | (1L << (K_MATCH - 344)) | (1L << (K_MATCHED - 344)) | (1L << (K_MATERIALIZED - 344)) | (1L << (K_MAX - 344)) | (1L << (K_MAXVALUE - 344)) | (1L << (K_MAX_CARDINALITY - 344)) | (1L << (K_MEMBER - 344)) | (1L << (K_MERGE - 344)) | (1L << (K_MESSAGE_LENGTH - 344)) | (1L << (K_MESSAGE_OCTET_LENGTH - 344)) | (1L << (K_MESSAGE_TEXT - 344)) | (1L << (K_METHOD - 344)) | (1L << (K_MIN - 344)) | (1L << (K_MINUTE - 344)) | (1L << (K_MINVALUE - 344)) | (1L << (K_MOD - 344)) | (1L << (K_MODE - 344)) | (1L << (K_MODIFIES - 344)))) != 0) || ((((_la - 408)) & ~0x3f) == 0 && ((1L << (_la - 408)) & ((1L << (K_MODULE - 408)) | (1L << (K_MONTH - 408)) | (1L << (K_MORE - 408)) | (1L << (K_MOVE - 408)) | (1L << (K_MULTISET - 408)) | (1L << (K_MUMPS - 408)) | (1L << (K_NAME - 408)) | (1L << (K_NAMES - 408)) | (1L << (K_NAMESPACE - 408)) | (1L << (K_NATIONAL - 408)) | (1L << (K_NATURAL - 408)) | (1L << (K_NCHAR - 408)) | (1L << (K_NCLOB - 408)) | (1L << (K_NESTING - 408)) | (1L << (K_NEW - 408)) | (1L << (K_NEXT - 408)) | (1L << (K_NFC - 408)) | (1L << (K_NFD - 408)) | (1L << (K_NFKC - 408)) | (1L << (K_NFKD - 408)) | (1L << (K_NIL - 408)) | (1L << (K_NO - 408)) | (1L << (K_NONE - 408)) | (1L << (K_NORMALIZE - 408)) | (1L << (K_NORMALIZED - 408)) | (1L << (K_NOT - 408)) | (1L << (K_NOTHING - 408)) | (1L << (K_NOTIFY - 408)) | (1L << (K_NOTNULL - 408)) | (1L << (K_NOWAIT - 408)) | (1L << (K_NTH_VALUE - 408)) | (1L << (K_NTILE - 408)) | (1L << (K_NULL - 408)) | (1L << (K_NULLABLE - 408)) | (1L << (K_NULLIF - 408)) | (1L << (K_NULLS - 408)) | (1L << (K_NUMBER - 408)) | (1L << (K_NUMERIC - 408)) | (1L << (K_OBJECT - 408)) | (1L << (K_OCCURRENCES_REGEX - 408)) | (1L << (K_OCTETS - 408)) | (1L << (K_OCTET_LENGTH - 408)) | (1L << (K_OF - 408)) | (1L << (K_OFF - 408)) | (1L << (K_OFFSET - 408)) | (1L << (K_OIDS - 408)) | (1L << (K_OLD - 408)) | (1L << (K_ON - 408)) | (1L << (K_ONLY - 408)) | (1L << (K_OPEN - 408)) | (1L << (K_OPERATOR - 408)) | (1L << (K_OPTION - 408)) | (1L << (K_OPTIONS - 408)) | (1L << (K_OR - 408)) | (1L << (K_ORDER - 408)) | (1L << (K_ORDERING - 408)) | (1L << (K_ORDINALITY - 408)) | (1L << (K_OTHERS - 408)) | (1L << (K_OUT - 408)) | (1L << (K_OUTER - 408)) | (1L << (K_OUTPUT - 408)) | (1L << (K_OVER - 408)) | (1L << (K_OVERLAPS - 408)) | (1L << (K_OVERLAY - 408)))) != 0) || ((((_la - 472)) & ~0x3f) == 0 && ((1L << (_la - 472)) & ((1L << (K_OVERRIDING - 472)) | (1L << (K_OWNED - 472)) | (1L << (K_OWNER - 472)) | (1L << (K_P - 472)) | (1L << (K_PAD - 472)) | (1L << (K_PARALLEL - 472)) | (1L << (K_PARAMETER - 472)) | (1L << (K_PARAMETER_MODE - 472)) | (1L << (K_PARAMETER_NAME - 472)) | (1L << (K_PARAMETER_ORDINAL_POSITION - 472)) | (1L << (K_PARAMETER_SPECIFIC_CATALOG - 472)) | (1L << (K_PARAMETER_SPECIFIC_NAME - 472)) | (1L << (K_PARAMETER_SPECIFIC_SCHEMA - 472)) | (1L << (K_PARSER - 472)) | (1L << (K_PARTIAL - 472)) | (1L << (K_PARTITION - 472)) | (1L << (K_PASCAL - 472)) | (1L << (K_PASSING - 472)) | (1L << (K_PASSTHROUGH - 472)) | (1L << (K_PASSWORD - 472)) | (1L << (K_PATH - 472)) | (1L << (K_PERCENT - 472)) | (1L << (K_PERCENTILE_CONT - 472)) | (1L << (K_PERCENTILE_DISC - 472)) | (1L << (K_PERCENT_RANK - 472)) | (1L << (K_PERIOD - 472)) | (1L << (K_PERMISSION - 472)) | (1L << (K_PLACING - 472)) | (1L << (K_PLANS - 472)) | (1L << (K_PLI - 472)) | (1L << (K_POLICY - 472)) | (1L << (K_PORTION - 472)) | (1L << (K_POSITION - 472)) | (1L << (K_POSITION_REGEX - 472)) | (1L << (K_POWER - 472)) | (1L << (K_PRECEDES - 472)) | (1L << (K_PRECEDING - 472)) | (1L << (K_PRECISION - 472)) | (1L << (K_PREPARE - 472)) | (1L << (K_PREPARED - 472)) | (1L << (K_PRESERVE - 472)) | (1L << (K_PRIMARY - 472)) | (1L << (K_PRIOR - 472)) | (1L << (K_PRIVILEGES - 472)) | (1L << (K_PROCEDURAL - 472)) | (1L << (K_PROCEDURE - 472)) | (1L << (K_PROGRAM - 472)) | (1L << (K_PUBLIC - 472)) | (1L << (K_QUOTE - 472)) | (1L << (K_RANGE - 472)) | (1L << (K_RANK - 472)) | (1L << (K_READ - 472)) | (1L << (K_READS - 472)) | (1L << (K_REAL - 472)) | (1L << (K_REASSIGN - 472)) | (1L << (K_RECHECK - 472)) | (1L << (K_RECOVERY - 472)) | (1L << (K_RECURSIVE - 472)) | (1L << (K_REF - 472)) | (1L << (K_REFERENCES - 472)) | (1L << (K_REFERENCING - 472)) | (1L << (K_REFRESH - 472)) | (1L << (K_REGR_AVGX - 472)) | (1L << (K_REGR_AVGY - 472)))) != 0) || ((((_la - 536)) & ~0x3f) == 0 && ((1L << (_la - 536)) & ((1L << (K_REGR_COUNT - 536)) | (1L << (K_REGR_INTERCEPT - 536)) | (1L << (K_REGR_R2 - 536)) | (1L << (K_REGR_SLOPE - 536)) | (1L << (K_REGR_SXX - 536)) | (1L << (K_REGR_SXY - 536)) | (1L << (K_REGR_SYY - 536)) | (1L << (K_REINDEX - 536)) | (1L << (K_RELATIVE - 536)) | (1L << (K_RELEASE - 536)) | (1L << (K_RENAME - 536)) | (1L << (K_REPEATABLE - 536)) | (1L << (K_REPLACE - 536)) | (1L << (K_REPLICA - 536)) | (1L << (K_REQUIRING - 536)) | (1L << (K_RESET - 536)) | (1L << (K_RESPECT - 536)) | (1L << (K_RESTART - 536)) | (1L << (K_RESTORE - 536)) | (1L << (K_RESTRICT - 536)) | (1L << (K_RESULT - 536)) | (1L << (K_RETURN - 536)) | (1L << (K_RETURNED_CARDINALITY - 536)) | (1L << (K_RETURNED_LENGTH - 536)) | (1L << (K_RETURNED_OCTET_LENGTH - 536)) | (1L << (K_RETURNED_SQLSTATE - 536)) | (1L << (K_RETURNING - 536)) | (1L << (K_RETURNS - 536)) | (1L << (K_REVOKE - 536)) | (1L << (K_RIGHT - 536)) | (1L << (K_ROLE - 536)) | (1L << (K_ROLLBACK - 536)) | (1L << (K_ROLLUP - 536)) | (1L << (K_ROUTINE - 536)) | (1L << (K_ROUTINE_CATALOG - 536)) | (1L << (K_ROUTINE_NAME - 536)) | (1L << (K_ROUTINE_SCHEMA - 536)) | (1L << (K_ROW - 536)) | (1L << (K_ROWS - 536)) | (1L << (K_ROW_COUNT - 536)) | (1L << (K_ROW_NUMBER - 536)) | (1L << (K_RULE - 536)) | (1L << (K_SAVEPOINT - 536)) | (1L << (K_SCALE - 536)) | (1L << (K_SCHEMA - 536)) | (1L << (K_SCHEMA_NAME - 536)) | (1L << (K_SCOPE - 536)) | (1L << (K_SCOPE_CATALOG - 536)) | (1L << (K_SCOPE_NAME - 536)) | (1L << (K_SCOPE_SCHEMA - 536)) | (1L << (K_SCROLL - 536)) | (1L << (K_SEARCH - 536)) | (1L << (K_SECOND - 536)) | (1L << (K_SECTION - 536)) | (1L << (K_SECURITY - 536)) | (1L << (K_SELECT - 536)) | (1L << (K_SELECTIVE - 536)) | (1L << (K_SELF - 536)) | (1L << (K_SENSITIVE - 536)) | (1L << (K_SEQUENCE - 536)) | (1L << (K_SEQUENCES - 536)) | (1L << (K_SERIALIZABLE - 536)) | (1L << (K_SERVER - 536)) | (1L << (K_SERVER_NAME - 536)))) != 0) || ((((_la - 600)) & ~0x3f) == 0 && ((1L << (_la - 600)) & ((1L << (K_SESSION - 600)) | (1L << (K_SESSION_USER - 600)) | (1L << (K_SET - 600)) | (1L << (K_SETOF - 600)) | (1L << (K_SETS - 600)) | (1L << (K_SHARE - 600)) | (1L << (K_SHOW - 600)) | (1L << (K_SIMILAR - 600)) | (1L << (K_SIMPLE - 600)) | (1L << (K_SIZE - 600)) | (1L << (K_SKIP - 600)) | (1L << (K_SMALLINT - 600)) | (1L << (K_SNAPSHOT - 600)) | (1L << (K_SOME - 600)) | (1L << (K_SOURCE - 600)) | (1L << (K_SPACE - 600)) | (1L << (K_SPECIFIC - 600)) | (1L << (K_SPECIFICTYPE - 600)) | (1L << (K_SPECIFIC_NAME - 600)) | (1L << (K_SQL - 600)) | (1L << (K_SQLCODE - 600)) | (1L << (K_SQLERROR - 600)) | (1L << (K_SQLEXCEPTION - 600)) | (1L << (K_SQLSTATE - 600)) | (1L << (K_SQLWARNING - 600)) | (1L << (K_SQRT - 600)) | (1L << (K_STABLE - 600)) | (1L << (K_STANDALONE - 600)) | (1L << (K_START - 600)) | (1L << (K_STATE - 600)) | (1L << (K_STATEMENT - 600)) | (1L << (K_STATIC - 600)) | (1L << (K_STATISTICS - 600)) | (1L << (K_STDDEV_POP - 600)) | (1L << (K_STDDEV_SAMP - 600)) | (1L << (K_STDIN - 600)) | (1L << (K_STDOUT - 600)) | (1L << (K_STORAGE - 600)) | (1L << (K_STRICT - 600)) | (1L << (K_STRIP - 600)) | (1L << (K_STRUCTURE - 600)) | (1L << (K_STYLE - 600)) | (1L << (K_SUBCLASS_ORIGIN - 600)) | (1L << (K_SUBMULTISET - 600)) | (1L << (K_SUBSTRING - 600)) | (1L << (K_SUBSTRING_REGEX - 600)) | (1L << (K_SUCCEEDS - 600)) | (1L << (K_SUM - 600)) | (1L << (K_SYMMETRIC - 600)) | (1L << (K_SYSID - 600)) | (1L << (K_SYSTEM - 600)) | (1L << (K_SYSTEM_TIME - 600)) | (1L << (K_SYSTEM_USER - 600)) | (1L << (K_T - 600)) | (1L << (K_TABLE - 600)) | (1L << (K_TABLES - 600)) | (1L << (K_TABLESAMPLE - 600)) | (1L << (K_TABLESPACE - 600)) | (1L << (K_TABLE_NAME - 600)) | (1L << (K_TEMP - 600)) | (1L << (K_TEMPLATE - 600)) | (1L << (K_TEMPORARY - 600)) | (1L << (K_TEXT - 600)) | (1L << (K_THEN - 600)))) != 0) || ((((_la - 664)) & ~0x3f) == 0 && ((1L << (_la - 664)) & ((1L << (K_TIES - 664)) | (1L << (K_TIME - 664)) | (1L << (K_TIMESTAMP - 664)) | (1L << (K_TIMEZONE_HOUR - 664)) | (1L << (K_TIMEZONE_MINUTE - 664)) | (1L << (K_TO - 664)) | (1L << (K_TOKEN - 664)) | (1L << (K_TOP_LEVEL_COUNT - 664)) | (1L << (K_TRAILING - 664)) | (1L << (K_TRANSACTION - 664)) | (1L << (K_TRANSACTIONS_COMMITTED - 664)) | (1L << (K_TRANSACTIONS_ROLLED_BACK - 664)) | (1L << (K_TRANSACTION_ACTIVE - 664)) | (1L << (K_TRANSFORM - 664)) | (1L << (K_TRANSFORMS - 664)) | (1L << (K_TRANSLATE - 664)) | (1L << (K_TRANSLATE_REGEX - 664)) | (1L << (K_TRANSLATION - 664)) | (1L << (K_TREAT - 664)) | (1L << (K_TRIGGER - 664)) | (1L << (K_TRIGGER_CATALOG - 664)) | (1L << (K_TRIGGER_NAME - 664)) | (1L << (K_TRIGGER_SCHEMA - 664)) | (1L << (K_TRIM - 664)) | (1L << (K_TRIM_ARRAY - 664)) | (1L << (K_TRUE - 664)) | (1L << (K_TRUNCATE - 664)) | (1L << (K_TRUSTED - 664)) | (1L << (K_TYPE - 664)) | (1L << (K_TYPES - 664)) | (1L << (K_UESCAPE - 664)) | (1L << (K_UNBOUNDED - 664)) | (1L << (K_UNCOMMITTED - 664)) | (1L << (K_UNDER - 664)) | (1L << (K_UNENCRYPTED - 664)) | (1L << (K_UNION - 664)) | (1L << (K_UNIQUE - 664)) | (1L << (K_UNKNOWN - 664)) | (1L << (K_UNLINK - 664)) | (1L << (K_UNLISTEN - 664)) | (1L << (K_UNLOGGED - 664)) | (1L << (K_UNNAMED - 664)) | (1L << (K_UNNEST - 664)) | (1L << (K_UNTIL - 664)) | (1L << (K_UNTYPED - 664)) | (1L << (K_UPDATE - 664)) | (1L << (K_UPPER - 664)) | (1L << (K_URI - 664)) | (1L << (K_USAGE - 664)) | (1L << (K_USER - 664)) | (1L << (K_USER_DEFINED_TYPE_CATALOG - 664)) | (1L << (K_USER_DEFINED_TYPE_CODE - 664)) | (1L << (K_USER_DEFINED_TYPE_NAME - 664)) | (1L << (K_USER_DEFINED_TYPE_SCHEMA - 664)) | (1L << (K_USING - 664)) | (1L << (K_VACUUM - 664)) | (1L << (K_VALID - 664)) | (1L << (K_VALIDATE - 664)) | (1L << (K_VALIDATOR - 664)) | (1L << (K_VALUE - 664)) | (1L << (K_VALUES - 664)) | (1L << (K_VALUE_OF - 664)) | (1L << (K_VARBINARY - 664)) | (1L << (K_VARCHAR - 664)))) != 0) || ((((_la - 728)) & ~0x3f) == 0 && ((1L << (_la - 728)) & ((1L << (K_VARIADIC - 728)) | (1L << (K_VARYING - 728)) | (1L << (K_VAR_POP - 728)) | (1L << (K_VAR_SAMP - 728)) | (1L << (K_VERBOSE - 728)) | (1L << (K_VERSION - 728)) | (1L << (K_VERSIONING - 728)) | (1L << (K_VIEW - 728)) | (1L << (K_VIEWS - 728)) | (1L << (K_VOLATILE - 728)) | (1L << (K_WHEN - 728)) | (1L << (K_WHENEVER - 728)) | (1L << (K_WHERE - 728)) | (1L << (K_WHITESPACE - 728)) | (1L << (K_WIDTH_BUCKET - 728)) | (1L << (K_WINDOW - 728)) | (1L << (K_WITH - 728)) | (1L << (K_WITHIN - 728)) | (1L << (K_WITHOUT - 728)) | (1L << (K_WORK - 728)) | (1L << (K_WRAPPER - 728)) | (1L << (K_WRITE - 728)) | (1L << (K_XML - 728)) | (1L << (K_XMLAGG - 728)) | (1L << (K_XMLATTRIBUTES - 728)) | (1L << (K_XMLBINARY - 728)) | (1L << (K_XMLCAST - 728)) | (1L << (K_XMLCOMMENT - 728)) | (1L << (K_XMLCONCAT - 728)) | (1L << (K_XMLDECLARATION - 728)) | (1L << (K_XMLDOCUMENT - 728)) | (1L << (K_XMLELEMENT - 728)) | (1L << (K_XMLEXISTS - 728)) | (1L << (K_XMLFOREST - 728)) | (1L << (K_XMLITERATE - 728)) | (1L << (K_XMLNAMESPACES - 728)) | (1L << (K_XMLPARSE - 728)) | (1L << (K_XMLPI - 728)) | (1L << (K_XMLQUERY - 728)) | (1L << (K_XMLROOT - 728)) | (1L << (K_XMLSCHEMA - 728)) | (1L << (K_XMLSERIALIZE - 728)) | (1L << (K_XMLTABLE - 728)) | (1L << (K_XMLTEXT - 728)) | (1L << (K_XMLVALIDATE - 728)) | (1L << (K_YEAR - 728)) | (1L << (K_YES - 728)) | (1L << (K_ZONE - 728)) | (1L << (K_SERIAL - 728)) | (1L << (K_BIGSERIAL - 728)) | (1L << (K_SMALLSERIAL - 728)))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(PostgreSQLParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode UNDERLINE_STARTED_IDENTIFIER() { return getToken(PostgreSQLParser.UNDERLINE_STARTED_IDENTIFIER, 0); }
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(PostgreSQLParser.UNQUOTED_IDENTIFIER, 0); }
		public TerminalNode UNICODE_ESCAPED_IDENTIFIER() { return getToken(PostgreSQLParser.UNICODE_ESCAPED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			_la = _input.LA(1);
			if ( !(((((_la - 786)) & ~0x3f) == 0 && ((1L << (_la - 786)) & ((1L << (QUOTED_IDENTIFIER - 786)) | (1L << (UNICODE_ESCAPED_IDENTIFIER - 786)) | (1L << (UNDERLINE_STARTED_IDENTIFIER - 786)) | (1L << (UNQUOTED_IDENTIFIER - 786)))) != 0)) ) {
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
		case 47:
			return from_item_sempred((From_itemContext)_localctx, predIndex);
		case 77:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 115:
			return data_type_sempred((Data_typeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean from_item_sempred(From_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 23);
		case 13:
			return precpred(_ctx, 21);
		case 14:
			return precpred(_ctx, 14);
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean data_type_sempred(Data_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u031c\u0a24\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\3\2\3\2\7\2\u00f3\n\2\f\2\16\2\u00f6\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\7\4\u00fe\n\4\f\4\16\4\u0101\13\4\3\4\3\4\6\4\u0105\n\4\r\4\16"+
		"\4\u0106\3\4\7\4\u010a\n\4\f\4\16\4\u010d\13\4\3\4\7\4\u0110\n\4\f\4\16"+
		"\4\u0113\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u011f\n\5\3"+
		"\6\3\6\3\7\3\7\5\7\u0125\n\7\3\7\3\7\5\7\u0129\n\7\3\7\3\7\3\7\5\7\u012e"+
		"\n\7\3\7\5\7\u0131\n\7\3\7\3\7\3\7\3\7\5\7\u0137\n\7\3\7\3\7\3\7\3\7\7"+
		"\7\u013d\n\7\f\7\16\7\u0140\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0148\n\7"+
		"\f\7\16\7\u014b\13\7\3\7\3\7\5\7\u014f\n\7\3\7\3\7\5\7\u0153\n\7\3\7\3"+
		"\7\5\7\u0157\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0160\n\t\3\t\3\t\5\t"+
		"\u0164\n\t\3\t\5\t\u0167\n\t\3\t\5\t\u016a\n\t\3\t\3\t\5\t\u016e\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\5\13\u0175\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u017c\n"+
		"\r\3\r\3\r\5\r\u0180\n\r\3\r\3\r\3\r\7\r\u0185\n\r\f\r\16\r\u0188\13\r"+
		"\3\r\5\r\u018b\n\r\3\16\3\16\3\16\3\16\5\16\u0191\n\16\3\16\3\16\3\16"+
		"\7\16\u0196\n\16\f\16\16\16\u0199\13\16\3\16\5\16\u019c\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u01a2\n\17\3\17\3\17\3\17\7\17\u01a7\n\17\f\17\16\17\u01aa"+
		"\13\17\3\17\5\17\u01ad\n\17\3\20\3\20\5\20\u01b1\n\20\3\20\5\20\u01b4"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u01ba\n\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u01c1\n\20\f\20\16\20\u01c4\13\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u01cc\n\20\f\20\16\20\u01cf\13\20\3\20\3\20\5\20\u01d3\n\20\3\20\5\20"+
		"\u01d6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01df\n\20\5\20\u01e1"+
		"\n\20\3\20\3\20\5\20\u01e5\n\20\3\20\3\20\5\20\u01e9\n\20\3\20\5\20\u01ec"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u01f2\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u01fb\n\20\f\20\16\20\u01fe\13\20\3\20\3\20\5\20\u0202\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u020b\n\20\5\20\u020d\n\20\3"+
		"\20\3\20\5\20\u0211\n\20\3\20\3\20\5\20\u0215\n\20\3\20\5\20\u0218\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u021e\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u0225"+
		"\n\20\f\20\16\20\u0228\13\20\3\20\3\20\5\20\u022c\n\20\3\20\5\20\u022f"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0238\n\20\5\20\u023a\n"+
		"\20\3\20\3\20\5\20\u023e\n\20\3\20\3\20\3\20\3\20\5\20\u0244\n\20\3\20"+
		"\5\20\u0247\n\20\5\20\u0249\n\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0251"+
		"\n\22\f\22\16\22\u0254\13\22\3\22\5\22\u0257\n\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0260\n\24\f\24\16\24\u0263\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u026b\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0279\n\27\f\27\16\27\u027c\13\27\3\27\5\27"+
		"\u027f\n\27\3\30\3\30\5\30\u0283\n\30\3\30\3\30\3\30\5\30\u0288\n\30\7"+
		"\30\u028a\n\30\f\30\16\30\u028d\13\30\3\31\3\31\3\31\5\31\u0292\n\31\3"+
		"\31\5\31\u0295\n\31\3\31\5\31\u0298\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u02a0\n\31\3\31\3\31\3\31\3\31\5\31\u02a6\n\31\3\31\3\31\5\31\u02aa"+
		"\n\31\3\32\3\32\5\32\u02ae\n\32\3\32\3\32\3\32\7\32\u02b3\n\32\f\32\16"+
		"\32\u02b6\13\32\5\32\u02b8\n\32\3\32\3\32\3\32\5\32\u02bd\n\32\3\32\3"+
		"\32\5\32\u02c1\n\32\3\32\5\32\u02c4\n\32\3\32\5\32\u02c7\n\32\3\32\3\32"+
		"\5\32\u02cb\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02d3\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u02da\n\32\3\32\3\32\3\32\3\32\5\32\u02e0\n\32"+
		"\7\32\u02e2\n\32\f\32\16\32\u02e5\13\32\5\32\u02e7\n\32\5\32\u02e9\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u02f0\n\33\f\33\16\33\u02f3\13\33\3\33"+
		"\3\33\5\33\u02f7\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ff\n\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u030b\n\37\3\37"+
		"\3\37\3\37\7\37\u0310\n\37\f\37\16\37\u0313\13\37\5\37\u0315\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u031c\n\37\3\37\3\37\3\37\3\37\7\37\u0322\n"+
		"\37\f\37\16\37\u0325\13\37\3\37\3\37\5\37\u0329\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u0331\n\37\f\37\16\37\u0334\13\37\3\37\5\37\u0337\n"+
		"\37\3\37\3\37\3\37\5\37\u033c\n\37\3\37\5\37\u033f\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0346\n\37\3\37\3\37\3\37\3\37\5\37\u034c\n\37\7\37\u034e"+
		"\n\37\f\37\16\37\u0351\13\37\5\37\u0353\n\37\5\37\u0355\n\37\3 \3 \3 "+
		"\5 \u035a\n \3 \3 \3 \5 \u035f\n \7 \u0361\n \f \16 \u0364\13 \3 \3 \3"+
		"!\3!\3!\3!\7!\u036c\n!\f!\16!\u036f\13!\3!\3!\3!\3!\3!\5!\u0376\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u037f\n\"\f\"\16\"\u0382\13\"\3\"\3\"\3\""+
		"\5\"\u0387\n\"\3#\3#\3#\3#\3#\5#\u038e\n#\3#\3#\5#\u0392\n#\3#\3#\3$\3"+
		"$\3%\3%\5%\u039a\n%\3%\3%\3%\7%\u039f\n%\f%\16%\u03a2\13%\5%\u03a4\n%"+
		"\3%\3%\5%\u03a8\n%\3%\3%\5%\u03ac\n%\3%\5%\u03af\n%\3%\5%\u03b2\n%\3%"+
		"\3%\3%\3%\7%\u03b8\n%\f%\16%\u03bb\13%\3%\3%\5%\u03bf\n%\3%\3%\3%\3%\3"+
		"%\3%\5%\u03c7\n%\3%\3%\3%\3%\3%\5%\u03ce\n%\3%\3%\3%\3%\5%\u03d4\n%\7"+
		"%\u03d6\n%\f%\16%\u03d9\13%\5%\u03db\n%\5%\u03dd\n%\3&\3&\3&\3&\5&\u03e3"+
		"\n&\3&\3&\3&\3&\7&\u03e9\n&\f&\16&\u03ec\13&\3&\3&\3&\3&\3&\5&\u03f3\n"+
		"&\3&\3&\3&\5&\u03f8\n&\7&\u03fa\n&\f&\16&\u03fd\13&\3&\3&\3&\3&\3&\3&"+
		"\7&\u0405\n&\f&\16&\u0408\13&\3&\3&\3&\3&\3&\3&\5&\u0410\n&\3\'\3\'\5"+
		"\'\u0414\n\'\3\'\3\'\3\'\7\'\u0419\n\'\f\'\16\'\u041c\13\'\5\'\u041e\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0427\n\'\f\'\16\'\u042a\13\'\3\'\3"+
		"\'\5\'\u042e\n\'\5\'\u0430\n\'\3\'\3\'\3\'\3\'\7\'\u0436\n\'\f\'\16\'"+
		"\u0439\13\'\5\'\u043b\n\'\3\'\3\'\5\'\u043f\n\'\3\'\3\'\5\'\u0443\n\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u044a\n\'\f\'\16\'\u044d\13\'\5\'\u044f\n\'\3"+
		"\'\3\'\3\'\3\'\7\'\u0455\n\'\f\'\16\'\u0458\13\'\5\'\u045a\n\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0469\n\'\f\'\16\'\u046c"+
		"\13\'\5\'\u046e\n\'\3\'\3\'\5\'\u0472\n\'\3\'\5\'\u0475\n\'\3\'\5\'\u0478"+
		"\n\'\3\'\3\'\3\'\5\'\u047d\n\'\5\'\u047f\n\'\3\'\3\'\3\'\5\'\u0484\n\'"+
		"\5\'\u0486\n\'\3\'\3\'\3\'\5\'\u048b\n\'\3\'\3\'\5\'\u048f\n\'\3\'\7\'"+
		"\u0492\n\'\f\'\16\'\u0495\13\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u049f\n(\3("+
		"\3(\3(\3(\7(\u04a5\n(\f(\16(\u04a8\13(\5(\u04aa\n(\3(\3(\3(\5(\u04af\n"+
		"(\3)\3)\3)\3)\3)\5)\u04b6\n)\3*\3*\3*\3*\3*\5*\u04bd\n*\3+\3+\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\7-\u04cb\n-\f-\16-\u04ce\13-\3-\3-\3-\3-\3-\3-"+
		"\3-\7-\u04d7\n-\f-\16-\u04da\13-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u04e4\n-\f"+
		"-\16-\u04e7\13-\3-\3-\5-\u04eb\n-\3.\3.\3.\3.\3.\7.\u04f2\n.\f.\16.\u04f5"+
		"\13.\3.\3.\5.\u04f9\n.\3/\3/\3/\5/\u04fe\n/\3\60\3\60\3\60\7\60\u0503"+
		"\n\60\f\60\16\60\u0506\13\60\3\61\3\61\5\61\u050a\n\61\3\61\3\61\5\61"+
		"\u050e\n\61\3\61\5\61\u0511\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0519"+
		"\n\61\f\61\16\61\u051c\13\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0524"+
		"\n\61\5\61\u0526\n\61\3\61\5\61\u0529\n\61\3\61\3\61\3\61\3\61\5\61\u052f"+
		"\n\61\3\61\3\61\5\61\u0533\n\61\3\61\5\61\u0536\n\61\3\61\3\61\3\61\3"+
		"\61\3\61\7\61\u053d\n\61\f\61\16\61\u0540\13\61\5\61\u0542\n\61\3\61\3"+
		"\61\3\61\5\61\u0547\n\61\3\61\5\61\u054a\n\61\3\61\5\61\u054d\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u0554\n\61\f\61\16\61\u0557\13\61\5\61\u0559"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u055f\n\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u0566\n\61\f\61\16\61\u0569\13\61\5\61\u056b\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0573\n\61\f\61\16\61\u0576\13\61\3\61\3\61\3\61\5\61"+
		"\u057b\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0583\n\61\f\61\16\61\u0586"+
		"\13\61\3\61\3\61\3\61\5\61\u058b\n\61\3\61\5\61\u058e\n\61\5\61\u0590"+
		"\n\61\3\61\3\61\5\61\u0594\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\7\61\u059f\n\61\f\61\16\61\u05a2\13\61\3\61\3\61\5\61\u05a6\n\61"+
		"\7\61\u05a8\n\61\f\61\16\61\u05ab\13\61\3\62\5\62\u05ae\n\62\3\62\3\62"+
		"\3\62\5\62\u05b3\n\62\3\62\3\62\3\62\5\62\u05b8\n\62\3\62\3\62\3\62\5"+
		"\62\u05bd\n\62\3\62\3\62\3\62\5\62\u05c2\n\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u05cc\n\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u05d4"+
		"\n\64\f\64\16\64\u05d7\13\64\3\64\3\64\5\64\u05db\n\64\3\65\5\65\u05de"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u05e5\n\65\f\65\16\65\u05e8\13\65"+
		"\3\65\3\65\5\65\u05ec\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\7"+
		":\u05f9\n:\f:\16:\u05fc\13:\3;\3;\3<\3<\3<\3<\5<\u0604\n<\3<\7<\u0607"+
		"\n<\f<\16<\u060a\13<\3<\3<\3<\3<\7<\u0610\n<\f<\16<\u0613\13<\5<\u0615"+
		"\n<\3=\3=\5=\u0619\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0624\n=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0633\n=\3=\3=\5=\u0637\n=\3=\3=\3="+
		"\5=\u063c\n=\3=\3=\3=\5=\u0641\n=\5=\u0643\n=\3=\5=\u0646\n=\3=\3=\3="+
		"\3=\5=\u064c\n=\3>\3>\3>\5>\u0651\n>\3?\3?\5?\u0655\n?\3?\3?\3?\3?\3?"+
		"\3?\5?\u065d\n?\3?\3?\3?\3?\3?\7?\u0664\n?\f?\16?\u0667\13?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\7?\u0672\n?\f?\16?\u0675\13?\3?\3?\3?\3?\3?\3?\5?\u067d"+
		"\n?\3?\3?\3?\3?\7?\u0683\n?\f?\16?\u0686\13?\3?\3?\3?\3?\3?\3?\3?\5?\u068f"+
		"\n?\3?\3?\3?\3?\3?\3?\7?\u0697\n?\f?\16?\u069a\13?\3?\3?\3?\3?\3?\3?\3"+
		"?\7?\u06a3\n?\f?\16?\u06a6\13?\3?\3?\5?\u06aa\n?\3?\3?\5?\u06ae\n?\3?"+
		"\3?\3?\5?\u06b3\n?\3?\3?\3?\5?\u06b8\n?\5?\u06ba\n?\3?\5?\u06bd\n?\3?"+
		"\3?\3?\3?\5?\u06c3\n?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\5B\u06d1\nB"+
		"\3B\5B\u06d4\nB\3B\5B\u06d7\nB\3B\3B\5B\u06db\nB\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3H\3H\3H\7H\u06ec\nH\fH\16H\u06ef\13H\3H\3H\5H\u06f3\n"+
		"H\3H\3H\3H\3H\5H\u06f9\nH\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\5L\u0707"+
		"\nL\3M\3M\5M\u070b\nM\3N\3N\5N\u070f\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\5O\u0721\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\5O\u0732\nO\3O\3O\5O\u0736\nO\3O\3O\3O\3O\3O\3O\5O\u073e\nO\3O"+
		"\3O\3O\3O\5O\u0744\nO\3O\3O\3O\3O\5O\u074a\nO\3O\3O\3O\3O\3O\3O\3O\5O"+
		"\u0753\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0766"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0771\nO\3O\3O\3O\3O\5O\u0777\nO\3O"+
		"\7O\u077a\nO\fO\16O\u077d\13O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\5P\u078f\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u079b\nQ\3R\3R\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\7S\u07a9\nS\fS\16S\u07ac\13S\3S\3S\5S\u07b0"+
		"\nS\3S\3S\3T\3T\3T\3T\5T\u07b8\nT\3T\3T\3T\5T\u07bd\nT\3T\3T\3T\3T\3T"+
		"\5T\u07c4\nT\3T\3T\3T\5T\u07c9\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\5T\u07d9\nT\3T\3T\3T\3T\3T\3T\3T\5T\u07e2\nT\3T\3T\3T\3T\7T\u07e8"+
		"\nT\fT\16T\u07eb\13T\3T\3T\3T\5T\u07f0\nT\3T\3T\3T\3T\5T\u07f6\nT\3U\3"+
		"U\3U\3U\3U\6U\u07fd\nU\rU\16U\u07fe\3U\3U\3U\3U\3U\3U\3U\5U\u0808\nU\3"+
		"V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u081a\nW\fW\16W\u081d"+
		"\13W\3W\3W\3W\5W\u0822\nW\3X\3X\3X\3X\3X\3X\5X\u082a\nX\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0842\nX\3Y\3"+
		"Y\5Y\u0846\nY\3Z\3Z\3[\3[\3[\5[\u084d\n[\3[\3[\3[\5[\u0852\n[\3[\3[\3"+
		"[\7[\u0857\n[\f[\16[\u085a\13[\3[\5[\u085d\n[\3[\3[\3[\3[\3[\3[\3[\5["+
		"\u0866\n[\3[\3[\3[\5[\u086b\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0877"+
		"\n[\3[\3[\3[\5[\u087c\n[\3[\3[\3[\3[\3[\7[\u0883\n[\f[\16[\u0886\13[\5"+
		"[\u0888\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0896\n[\5[\u0898\n"+
		"[\3\\\3\\\3\\\3\\\3\\\7\\\u089f\n\\\f\\\16\\\u08a2\13\\\3]\3]\3]\3]\3"+
		"]\5]\u08a9\n]\3]\3]\5]\u08ad\n]\3^\3^\5^\u08b1\n^\3_\3_\3_\3_\3_\7_\u08b8"+
		"\n_\f_\16_\u08bb\13_\5_\u08bd\n_\3_\3_\3_\3_\3_\3_\3_\5_\u08c6\n_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u08d2\n_\f_\16_\u08d5\13_\5_\u08d7\n_\3_"+
		"\3_\3_\3_\3_\3_\3_\5_\u08e0\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\5_\u08ef\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0900\n_"+
		"\3_\3_\3_\5_\u0905\n_\3`\3`\3`\3`\3`\3`\3`\7`\u090e\n`\f`\16`\u0911\13"+
		"`\5`\u0913\n`\3`\5`\u0916\n`\3`\5`\u0919\n`\3`\3`\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\5a\u0925\na\3b\3b\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0937"+
		"\nd\3e\3e\3f\3f\3g\3g\3g\5g\u0940\ng\3g\3g\5g\u0944\ng\3h\3h\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\5i\u0950\ni\3i\3i\6i\u0954\ni\ri\16i\u0955\5i\u0958\n"+
		"i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3o\3o\3o\5o\u0969\no\3p\3p\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\5q\u0976\nq\3r\3r\3s\3s\3t\3t\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\5u\u0986\nu\3u\3u\3u\3u\3u\3u\5u\u098e\nu\3u\3u\3u\3u\3u\3u\5"+
		"u\u0996\nu\3u\3u\3u\3u\3u\5u\u099d\nu\3u\3u\3u\3u\3u\3u\5u\u09a5\nu\3"+
		"u\3u\3u\3u\3u\5u\u09ac\nu\3u\3u\3u\3u\3u\3u\3u\5u\u09b5\nu\3u\3u\3u\3"+
		"u\5u\u09bb\nu\3u\3u\3u\3u\3u\3u\3u\5u\u09c4\nu\3u\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\5u\u09d0\nu\3u\3u\3u\5u\u09d5\nu\3u\3u\3u\3u\3u\5u\u09dc\nu\3"+
		"u\3u\3u\3u\3u\3u\3u\3u\5u\u09e6\nu\3u\3u\3u\5u\u09eb\nu\3u\3u\3u\3u\3"+
		"u\5u\u09f2\nu\3u\3u\3u\3u\3u\5u\u09f9\nu\3u\3u\3u\7u\u09fe\nu\fu\16u\u0a01"+
		"\13u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\5v\u0a1e\nv\3w\3w\3x\3x\3x\2\5`\u009c\u00e8y\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\2\35"+
		"\4\2\65\65\u00cc\u00cc\4\2\u010f\u010f\u016a\u016a\4\2XX\u022d\u022d\4"+
		"\2\u0128\u0128\u017c\u017c\5\2\u0295\u0295\u0297\u0297\u02c2\u02c2\4\2"+
		"\u0295\u0295\u0297\u0297\4\2YY\u017c\u017c\4\2\'\'\u00d6\u00d6\5\2\u00fb"+
		"\u00fb\u0159\u0159\u02bd\u02bd\3\2\u023f\u0240\4\2\u010f\u010f\u01a9\u01a9"+
		"\4\2FF\u028c\u028c\5\2\u0120\u0120\u01e8\u01e8\u0262\u0262\4\2\u00fe\u00fe"+
		"\u0144\u0144\b\2\'\'\177\177\u008b\u008b\u00be\u00be\u0148\u0148\u027f"+
		"\u027f\3\2\r\16\4\2\b\b\20\21\4\2\7\7\23\27\6\2\u0109\u0109\u01ba\u01ba"+
		"\u02b3\u02b3\u02bf\u02bf\5\2\'\'//\u0267\u0267\4\2\u020b\u020b\u0240\u0240"+
		"\4\2\u0109\u0109\u02b3\u02b3\3\2\u030d\u030e\3\2\u0312\u0313\3\2\u030f"+
		"\u0311\3\2\32\u030c\3\2\u0314\u0317\u0b9d\2\u00f4\3\2\2\2\4\u00f9\3\2"+
		"\2\2\6\u00ff\3\2\2\2\b\u011e\3\2\2\2\n\u0120\3\2\2\2\f\u0122\3\2\2\2\16"+
		"\u0158\3\2\2\2\20\u015f\3\2\2\2\22\u016f\3\2\2\2\24\u0171\3\2\2\2\26\u0176"+
		"\3\2\2\2\30\u0178\3\2\2\2\32\u018c\3\2\2\2\34\u019d\3\2\2\2\36\u0248\3"+
		"\2\2\2 \u024a\3\2\2\2\"\u0256\3\2\2\2$\u0258\3\2\2\2&\u026a\3\2\2\2(\u026c"+
		"\3\2\2\2*\u026e\3\2\2\2,\u027e\3\2\2\2.\u0282\3\2\2\2\60\u028e\3\2\2\2"+
		"\62\u02b7\3\2\2\2\64\u02ea\3\2\2\2\66\u0302\3\2\2\28\u0304\3\2\2\2:\u0306"+
		"\3\2\2\2<\u0314\3\2\2\2>\u0356\3\2\2\2@\u0375\3\2\2\2B\u0386\3\2\2\2D"+
		"\u038d\3\2\2\2F\u0395\3\2\2\2H\u03a3\3\2\2\2J\u040f\3\2\2\2L\u041d\3\2"+
		"\2\2N\u0496\3\2\2\2P\u04b5\3\2\2\2R\u04bc\3\2\2\2T\u04be\3\2\2\2V\u04c0"+
		"\3\2\2\2X\u04ea\3\2\2\2Z\u04f8\3\2\2\2\\\u04fa\3\2\2\2^\u04ff\3\2\2\2"+
		"`\u058f\3\2\2\2b\u05c1\3\2\2\2d\u05c3\3\2\2\2f\u05c5\3\2\2\2h\u05dd\3"+
		"\2\2\2j\u05ed\3\2\2\2l\u05ef\3\2\2\2n\u05f1\3\2\2\2p\u05f3\3\2\2\2r\u05f5"+
		"\3\2\2\2t\u05fd\3\2\2\2v\u0614\3\2\2\2x\u0618\3\2\2\2z\u0650\3\2\2\2|"+
		"\u0654\3\2\2\2~\u06c4\3\2\2\2\u0080\u06c7\3\2\2\2\u0082\u06d0\3\2\2\2"+
		"\u0084\u06dc\3\2\2\2\u0086\u06de\3\2\2\2\u0088\u06e0\3\2\2\2\u008a\u06e2"+
		"\3\2\2\2\u008c\u06e4\3\2\2\2\u008e\u06f2\3\2\2\2\u0090\u06fa\3\2\2\2\u0092"+
		"\u06fc\3\2\2\2\u0094\u06fe\3\2\2\2\u0096\u0706\3\2\2\2\u0098\u070a\3\2"+
		"\2\2\u009a\u070e\3\2\2\2\u009c\u0720\3\2\2\2\u009e\u078e\3\2\2\2\u00a0"+
		"\u079a\3\2\2\2\u00a2\u079c\3\2\2\2\u00a4\u079e\3\2\2\2\u00a6\u07f5\3\2"+
		"\2\2\u00a8\u0807\3\2\2\2\u00aa\u0809\3\2\2\2\u00ac\u0821\3\2\2\2\u00ae"+
		"\u0841\3\2\2\2\u00b0\u0845\3\2\2\2\u00b2\u0847\3\2\2\2\u00b4\u0897\3\2"+
		"\2\2\u00b6\u0899\3\2\2\2\u00b8\u08a3\3\2\2\2\u00ba\u08b0\3\2\2\2\u00bc"+
		"\u0904\3\2\2\2\u00be\u0906\3\2\2\2\u00c0\u0924\3\2\2\2\u00c2\u0926\3\2"+
		"\2\2\u00c4\u0928\3\2\2\2\u00c6\u0936\3\2\2\2\u00c8\u0938\3\2\2\2\u00ca"+
		"\u093a\3\2\2\2\u00cc\u093f\3\2\2\2\u00ce\u0945\3\2\2\2\u00d0\u0957\3\2"+
		"\2\2\u00d2\u0959\3\2\2\2\u00d4\u095b\3\2\2\2\u00d6\u095d\3\2\2\2\u00d8"+
		"\u095f\3\2\2\2\u00da\u0961\3\2\2\2\u00dc\u0968\3\2\2\2\u00de\u096a\3\2"+
		"\2\2\u00e0\u0975\3\2\2\2\u00e2\u0977\3\2\2\2\u00e4\u0979\3\2\2\2\u00e6"+
		"\u097b\3\2\2\2\u00e8\u09f8\3\2\2\2\u00ea\u0a1d\3\2\2\2\u00ec\u0a1f\3\2"+
		"\2\2\u00ee\u0a21\3\2\2\2\u00f0\u00f3\5\6\4\2\u00f1\u00f3\5\4\3\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7\2\2\3\u00f8\3\3\2\2\2\u00f9\u00fa\7\u031b\2\2\u00fa\u00fb\b\3"+
		"\1\2\u00fb\5\3\2\2\2\u00fc\u00fe\7\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u010b\5\b\5\2\u0103\u0105\7\3\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\5\b\5\2\u0109\u0104\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\7\3\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\7\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u011f\5\f\7\2\u0115\u011f\5\36\20\2\u0116\u011f\5\60\31"+
		"\2\u0117\u011f\5\62\32\2\u0118\u011f\5\30\r\2\u0119\u011f\5\32\16\2\u011a"+
		"\u011f\5\34\17\2\u011b\u011f\5<\37\2\u011c\u011f\5L\'\2\u011d\u011f\5"+
		"H%\2\u011e\u0114\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
		"\u0117\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011a\3\2"+
		"\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\t\3\2\2\2\u0120\u0121\5\u00eex\2\u0121\13\3\2\2\2\u0122\u0124\7\u009d"+
		"\2\2\u0123\u0125\7\u02be\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\7\u0147\2\2\u0127\u0129\7\u0082\2\2\u0128\u0127"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130\3\2\2\2\u012a\u012b\7\u013a\2"+
		"\2\u012b\u012c\7\u01b3\2\2\u012c\u012e\7\u0102\2\2\u012d\u012a\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\5\u00d2j\2\u0130"+
		"\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\u01c9"+
		"\2\2\u0133\u0136\5\u00ccg\2\u0134\u0135\7\u02d0\2\2\u0135\u0137\5\16\b"+
		"\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\7\4\2\2\u0139\u013e\5\20\t\2\u013a\u013b\7\5\2\2\u013b\u013d\5\20\t\2"+
		"\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u014e\7\6\2\2\u0142"+
		"\u0143\7\u02ea\2\2\u0143\u0144\7\4\2\2\u0144\u0149\5\24\13\2\u0145\u0146"+
		"\7\5\2\2\u0146\u0148\5\24\13\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\7\6\2\2\u014d\u014f\3\2\2\2\u014e\u0142\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0151\7\u0293\2\2\u0151\u0153"+
		"\5*\26\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0155\7\u02e6\2\2\u0155\u0157\5\u009cO\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\r\3\2\2\2\u0158\u0159\5\u00eex\2\u0159\17\3\2\2\2\u015a"+
		"\u015b\7\4\2\2\u015b\u015c\5\u009cO\2\u015c\u015d\7\6\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u0160\5\u00d0i\2\u015f\u015a\3\2\2\2\u015f\u015e\3\2\2"+
		"\2\u0160\u0163\3\2\2\2\u0161\u0162\7s\2\2\u0162\u0164\5\u0098M\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5\22"+
		"\n\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u016a\t\2\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u016c\7\u01bd\2\2\u016c\u016e\t\3\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\21\3\2\2\2\u016f\u0170\5\u00eex\2\u0170\23\3\2\2"+
		"\2\u0171\u0174\5\26\f\2\u0172\u0173\7\7\2\2\u0173\u0175\5\u009cO\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\25\3\2\2\2\u0176\u0177\5\u00ee"+
		"x\2\u0177\27\3\2\2\2\u0178\u0179\7\u00e6\2\2\u0179\u017b\7\u0147\2\2\u017a"+
		"\u017c\7\u0082\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017e\7\u013a\2\2\u017e\u0180\7\u0102\2\2\u017f\u017d\3"+
		"\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0186\5\u00d2j\2"+
		"\u0182\u0183\7\5\2\2\u0183\u0185\5\u00d2j\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018b\t\4\2\2\u018a\u0189\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\31\3\2\2\2\u018c\u018d\7\u00e6\2\2\u018d\u0190\7"+
		"\u0290\2\2\u018e\u018f\7\u013a\2\2\u018f\u0191\7\u0102\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0197\5\u00ccg"+
		"\2\u0193\u0194\7\5\2\2\u0194\u0196\5\u00ccg\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019c\t\4\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\33\3\2\2\2\u019d\u019e\7\u00e6\2\2\u019e\u01a1\7"+
		"\u02e1\2\2\u019f\u01a0\7\u013a\2\2\u01a0\u01a2\7\u0102\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a8\5t;\2\u01a4"+
		"\u01a5\7\5\2\2\u01a5\u01a7\5t;\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2"+
		"\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01ad\t\4\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\35\3\2\2\2\u01ae\u01b3\7\u009d\2\2\u01af\u01b1\t\5\2\2\u01b0\u01af\3"+
		"\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\t\6\2\2\u01b3"+
		"\u01b0\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9\7\u0290"+
		"\2\2\u01b6\u01b7\7\u013a\2\2\u01b7\u01b8\7\u01b3\2\2\u01b8\u01ba\7\u0102"+
		"\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\5\u00ccg\2\u01bc\u01bd\7\4\2\2\u01bd\u01c2\5v<\2\u01be\u01bf\7"+
		"\5\2\2\u01bf\u01c1\5v<\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01d2\7\6\2\2\u01c6\u01c7\7\u014b\2\2\u01c7\u01c8\7\4\2\2\u01c8"+
		"\u01cd\5(\25\2\u01c9\u01ca\7\5\2\2\u01ca\u01cc\5(\25\2\u01cb\u01c9\3\2"+
		"\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\6\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01c6\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d6\5&\24\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01e0\3\2"+
		"\2\2\u01d7\u01d8\7\u01c9\2\2\u01d8\u01de\7\u0080\2\2\u01d9\u01da\7\u0202"+
		"\2\2\u01da\u01df\7\u0240\2\2\u01db\u01dc\7\u00c4\2\2\u01dc\u01df\7\u0240"+
		"\2\2\u01dd\u01df\7\u00e6\2\2\u01de\u01d9\3\2\2\2\u01de\u01db\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\7\u0293\2\2\u01e3\u01e5\5*\26\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u0249\3\2\2\2\u01e6\u01eb\7\u009d"+
		"\2\2\u01e7\u01e9\t\5\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\t\6\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\7\u0290\2\2\u01ee\u01ef\7\u013a\2"+
		"\2\u01ef\u01f0\7\u01b3\2\2\u01f0\u01f2\7\u0102\2\2\u01f1\u01ee\3\2\2\2"+
		"\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\5\u00ccg\2\u01f4"+
		"\u01f5\7\u01c4\2\2\u01f5\u01f6\5$\23\2\u01f6\u01f7\7\4\2\2\u01f7\u01fc"+
		"\5\"\22\2\u01f8\u01f9\7\5\2\2\u01f9\u01fb\5\"\22\2\u01fa\u01f8\3\2\2\2"+
		"\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7\6\2\2\u0200\u0202\5&\24\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020c\3\2\2\2\u0203\u0204\7\u01c9"+
		"\2\2\u0204\u020a\7\u0080\2\2\u0205\u0206\7\u0202\2\2\u0206\u020b\7\u0240"+
		"\2\2\u0207\u0208\7\u00c4\2\2\u0208\u020b\7\u0240\2\2\u0209\u020b\7\u00e6"+
		"\2\2\u020a\u0205\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u0203\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020f\7\u0293\2\2\u020f\u0211\5*\26\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0249\3\2\2\2\u0212\u0217\7\u009d\2\2\u0213\u0215"+
		"\t\5\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\t\6\2\2\u0217\u0214\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021d\7\u0290\2\2\u021a\u021b\7\u013a\2\2\u021b\u021c\7\u01b3"+
		"\2\2\u021c\u021e\7\u0102\2\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u022b\5\u00ccg\2\u0220\u0221\7\4\2\2\u0221\u0226"+
		"\5\u00d0i\2\u0222\u0223\7\5\2\2\u0223\u0225\5\u00d0i\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\6\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0220\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022f\5&\24\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0239\3\2"+
		"\2\2\u0230\u0231\7\u01c9\2\2\u0231\u0237\7\u0080\2\2\u0232\u0233\7\u0202"+
		"\2\2\u0233\u0238\7\u0240\2\2\u0234\u0235\7\u00c4\2\2\u0235\u0238\7\u0240"+
		"\2\2\u0236\u0238\7\u00e6\2\2\u0237\u0232\3\2\2\2\u0237\u0234\3\2\2\2\u0237"+
		"\u0236\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0230\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023d\3\2\2\2\u023b\u023c\7\u0293\2\2\u023c\u023e\5*\26\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\64"+
		"\2\2\u0240\u0246\5 \21\2\u0241\u0243\7\u02ea\2\2\u0242\u0244\7\u01af\2"+
		"\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247"+
		"\7\u00b1\2\2\u0246\u0241\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2"+
		"\2\u0248\u01ae\3\2\2\2\u0248\u01e6\3\2\2\2\u0248\u0212\3\2\2\2\u0249\37"+
		"\3\2\2\2\u024a\u024b\5L\'\2\u024b!\3\2\2\2\u024c\u024d\5\u00d0i\2\u024d"+
		"\u024e\7\u02ea\2\2\u024e\u0252\7\u01ce\2\2\u024f\u0251\5x=\2\u0250\u024f"+
		"\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0257\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\5|?\2\u0256\u024c\3\2\2"+
		"\2\u0256\u0255\3\2\2\2\u0257#\3\2\2\2\u0258\u0259\5\u00eex\2\u0259%\3"+
		"\2\2\2\u025a\u025b\7\u02ea\2\2\u025b\u025c\7\4\2\2\u025c\u0261\5\24\13"+
		"\2\u025d\u025e\7\5\2\2\u025e\u0260\5\24\13\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0264\u0265\7\6\2\2\u0265\u026b\3\2\2\2\u0266"+
		"\u0267\7\u02ea\2\2\u0267\u026b\7\u01c7\2\2\u0268\u0269\7\u02ec\2\2\u0269"+
		"\u026b\7\u01c7\2\2\u026a\u025a\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0268"+
		"\3\2\2\2\u026b\'\3\2\2\2\u026c\u026d\5\u00ccg\2\u026d)\3\2\2\2\u026e\u026f"+
		"\5\u00eex\2\u026f+\3\2\2\2\u0270\u0271\7\4\2\2\u0271\u0272\5.\30\2\u0272"+
		"\u027a\7\6\2\2\u0273\u0274\7\5\2\2\u0274\u0275\7\4\2\2\u0275\u0276\5."+
		"\30\2\u0276\u0277\7\6\2\2\u0277\u0279\3\2\2\2\u0278\u0273\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2"+
		"\2\2\u027c\u027a\3\2\2\2\u027d\u027f\5.\30\2\u027e\u0270\3\2\2\2\u027e"+
		"\u027d\3\2\2\2\u027f-\3\2\2\2\u0280\u0283\7\u018c\2\2\u0281\u0283\5\u00dc"+
		"o\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u028b\3\2\2\2\u0284"+
		"\u0287\7\5\2\2\u0285\u0288\7\u018c\2\2\u0286\u0288\5\u00dco\2\u0287\u0285"+
		"\3\2\2\2\u0287\u0286\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0284\3\2\2\2\u028a"+
		"\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c/\3\2\2\2"+
		"\u028d\u028b\3\2\2\2\u028e\u0291\7\u009d\2\2\u028f\u0290\7\u01cf\2\2\u0290"+
		"\u0292\7\u0226\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294"+
		"\3\2\2\2\u0293\u0295\t\7\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0298\7\u0213\2\2\u0297\u0296\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7\u02e1\2\2\u029a\u029f\5t;\2"+
		"\u029b\u029c\7\4\2\2\u029c\u029d\5r:\2\u029d\u029e\7\6\2\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029b\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\7\64\2\2\u02a2\u02a9\5L\'\2\u02a3\u02a5\7\u02ea\2\2\u02a4\u02a6"+
		"\t\b\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a8\7j\2\2\u02a8\u02aa\7\u01cd\2\2\u02a9\u02a3\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\61\3\2\2\2\u02ab\u02ad\7\u02ea\2\2\u02ac\u02ae\7\u0213"+
		"\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b4\5\64\33\2\u02b0\u02b1\7\5\2\2\u02b1\u02b3\5\64\33\2\u02b2\u02b0"+
		"\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\u00c4\2\2\u02ba\u02bc\7\u011e\2"+
		"\2\u02bb\u02bd\7\u01ca\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02c0\5\u00ccg\2\u02bf\u02c1\7\b\2\2\u02c0\u02bf"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c4\7\64\2\2"+
		"\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7"+
		"\5\u00caf\2\u02c6\u02c3\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ca\3\2\2"+
		"\2\u02c8\u02c9\7\u02d0\2\2\u02c9\u02cb\5^\60\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02d2\3\2\2\2\u02cc\u02cd\7\u02e6\2\2\u02cd\u02d3"+
		"\5\u009cO\2\u02ce\u02cf\7\u02e6\2\2\u02cf\u02d0\7\u00a2\2\2\u02d0\u02d1"+
		"\7\u01c4\2\2\u02d1\u02d3\58\35\2\u02d2\u02cc\3\2\2\2\u02d2\u02ce\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02e8\3\2\2\2\u02d4\u02e6\7\u0234\2\2\u02d5"+
		"\u02e7\7\b\2\2\u02d6\u02d9\5\u009cO\2\u02d7\u02d8\7\64\2\2\u02d8\u02da"+
		"\5:\36\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e3\3\2\2\2\u02db"+
		"\u02dc\7\5\2\2\u02dc\u02df\5\u009cO\2\u02dd\u02de\7\64\2\2\u02de\u02e0"+
		"\5:\36\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1"+
		"\u02db\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02d5\3\2\2\2\u02e6"+
		"\u02d6\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02d4\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\63\3\2\2\2\u02ea\u02f6\5\66\34\2\u02eb\u02ec\7\4\2\2\u02ec"+
		"\u02f1\5\u00d0i\2\u02ed\u02ee\7\5\2\2\u02ee\u02f0\5\u00d0i\2\u02ef\u02ed"+
		"\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7\6\2\2\u02f5\u02f7\3\2"+
		"\2\2\u02f6\u02eb\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\7\64\2\2\u02f9\u02fe\7\4\2\2\u02fa\u02ff\5L\'\2\u02fb\u02ff\5<"+
		"\37\2\u02fc\u02ff\5H%\2\u02fd\u02ff\5\62\32\2\u02fe\u02fa\3\2\2\2\u02fe"+
		"\u02fb\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0301\7\6\2\2\u0301\65\3\2\2\2\u0302\u0303\5\u00eex\2\u0303"+
		"\67\3\2\2\2\u0304\u0305\5\u00eex\2\u03059\3\2\2\2\u0306\u0307\5\u00ee"+
		"x\2\u0307;\3\2\2\2\u0308\u030a\7\u02ea\2\2\u0309\u030b\7\u0213\2\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0311\5\64"+
		"\33\2\u030d\u030e\7\5\2\2\u030e\u0310\5\64\33\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0315\3\2"+
		"\2\2\u0313\u0311\3\2\2\2\u0314\u0308\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\7\u0152\2\2\u0317\u0318\7\u015c\2\2\u0318\u031b"+
		"\5\u00ccg\2\u0319\u031a\7\64\2\2\u031a\u031c\5\u00caf\2\u031b\u0319\3"+
		"\2\2\2\u031b\u031c\3\2\2\2\u031c\u0328\3\2\2\2\u031d\u031e\7\4\2\2\u031e"+
		"\u0323\5\u00d0i\2\u031f\u0320\7\5\2\2\u0320\u0322\5\u00d0i\2\u0321\u031f"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7\6\2\2\u0327\u0329\3\2"+
		"\2\2\u0328\u031d\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0336\3\2\2\2\u032a"+
		"\u032b\7\u00bd\2\2\u032b\u0337\7\u02d6\2\2\u032c\u032d\7\u02d6\2\2\u032d"+
		"\u0332\5> \2\u032e\u032f\7\5\2\2\u032f\u0331\5> \2\u0330\u032e\3\2\2\2"+
		"\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0337"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0337\5L\'\2\u0336\u032a\3\2\2\2\u0336"+
		"\u032c\3\2\2\2\u0336\u0335\3\2\2\2\u0337\u033e\3\2\2\2\u0338\u0339\7\u01c9"+
		"\2\2\u0339\u033b\7\u0086\2\2\u033a\u033c\5@!\2\u033b\u033a\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\5B\"\2\u033e\u0338\3\2"+
		"\2\2\u033e\u033f\3\2\2\2\u033f\u0354\3\2\2\2\u0340\u0352\7\u0234\2\2\u0341"+
		"\u0353\7\b\2\2\u0342\u0345\5\u009cO\2\u0343\u0344\7\64\2\2\u0344\u0346"+
		"\5:\36\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034f\3\2\2\2\u0347"+
		"\u0348\7\5\2\2\u0348\u034b\5\u009cO\2\u0349\u034a\7\64\2\2\u034a\u034c"+
		"\5:\36\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d"+
		"\u0347\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0341\3\2\2\2\u0352"+
		"\u0342\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0340\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355=\3\2\2\2\u0356\u0359\7\4\2\2\u0357\u035a\5\u009cO\2\u0358\u035a"+
		"\7\u00bd\2\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u0362\3\2\2"+
		"\2\u035b\u035e\7\5\2\2\u035c\u035f\5\u009cO\2\u035d\u035f\7\u00bd\2\2"+
		"\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035b"+
		"\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366\7\6\2\2\u0366?\3\2\2\2"+
		"\u0367\u0368\7\4\2\2\u0368\u036d\5D#\2\u0369\u036a\7\5\2\2\u036a\u036c"+
		"\5D#\2\u036b\u0369\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0371\7\6"+
		"\2\2\u0371\u0376\3\2\2\2\u0372\u0373\7\u01c9\2\2\u0373\u0374\7\u008a\2"+
		"\2\u0374\u0376\5F$\2\u0375\u0367\3\2\2\2\u0375\u0372\3\2\2\2\u0376A\3"+
		"\2\2\2\u0377\u0378\7\u00e2\2\2\u0378\u0387\7\u01b4\2\2\u0379\u037a\7\u02c7"+
		"\2\2\u037a\u037b\7\u025c\2\2\u037b\u0380\5J&\2\u037c\u037d\7\5\2\2\u037d"+
		"\u037f\5J&\2\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2"+
		"\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0384"+
		"\7\u02e6\2\2\u0384\u0385\5\u009cO\2\u0385\u0387\3\2\2\2\u0386\u0377\3"+
		"\2\2\2\u0386\u0379\3\2\2\2\u0387C\3\2\2\2\u0388\u038e\5\u00d0i\2\u0389"+
		"\u038a\7\4\2\2\u038a\u038b\5\u009cO\2\u038b\u038c\7\6\2\2\u038c\u038e"+
		"\3\2\2\2\u038d\u0388\3\2\2\2\u038d\u0389\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u0390\7s\2\2\u0390\u0392\5\u0098M\2\u0391\u038f\3\2\2\2\u0391\u0392\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\5\22\n\2\u0394E\3\2\2\2\u0395\u0396"+
		"\5\u00eex\2\u0396G\3\2\2\2\u0397\u0399\7\u02ea\2\2\u0398\u039a\7\u0213"+
		"\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u03a0\5\64\33\2\u039c\u039d\7\5\2\2\u039d\u039f\5\64\33\2\u039e\u039c"+
		"\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u0397\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\7\u02c7\2\2\u03a6\u03a8\7\u01ca\2"+
		"\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab"+
		"\5\u00ccg\2\u03aa\u03ac\7\b\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2"+
		"\2\u03ac\u03b1\3\2\2\2\u03ad\u03af\7\64\2\2\u03ae\u03ad\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\5\u00caf\2\u03b1\u03ae"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\7\u025c\2"+
		"\2\u03b4\u03b9\5J&\2\u03b5\u03b6\7\5\2\2\u03b6\u03b8\5J&\2\u03b7\u03b5"+
		"\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03be\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\7\u011e\2\2\u03bd\u03bf"+
		"\5^\60\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c6\3\2\2\2\u03c0"+
		"\u03c1\7\u02e6\2\2\u03c1\u03c7\5\u009cO\2\u03c2\u03c3\7\u02e6\2\2\u03c3"+
		"\u03c4\7\u00a2\2\2\u03c4\u03c5\7\u01c4\2\2\u03c5\u03c7\58\35\2\u03c6\u03c0"+
		"\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03dc\3\2\2\2\u03c8"+
		"\u03da\7\u0234\2\2\u03c9\u03db\7\b\2\2\u03ca\u03cd\5\u009cO\2\u03cb\u03cc"+
		"\7\64\2\2\u03cc\u03ce\5:\36\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2"+
		"\u03ce\u03d7\3\2\2\2\u03cf\u03d0\7\5\2\2\u03d0\u03d3\5\u009cO\2\u03d1"+
		"\u03d2\7\64\2\2\u03d2\u03d4\5:\36\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3"+
		"\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03cf\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2"+
		"\2\2\u03da\u03c9\3\2\2\2\u03da\u03ca\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u03c8\3\2\2\2\u03dc\u03dd\3\2\2\2\u03ddI\3\2\2\2\u03de\u03df\5\u00d0"+
		"i\2\u03df\u03e2\7\7\2\2\u03e0\u03e3\5\u009cO\2\u03e1\u03e3\7\u00bd\2\2"+
		"\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u0410\3\2\2\2\u03e4\u03e5"+
		"\7\4\2\2\u03e5\u03ea\5\u00d0i\2\u03e6\u03e7\7\5\2\2\u03e7\u03e9\5\u00d0"+
		"i\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ee\7\6"+
		"\2\2\u03ee\u03ef\7\7\2\2\u03ef\u03f2\7\4\2\2\u03f0\u03f3\5\u009cO\2\u03f1"+
		"\u03f3\7\u00bd\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3\u03fb"+
		"\3\2\2\2\u03f4\u03f7\7\5\2\2\u03f5\u03f8\5\u009cO\2\u03f6\u03f8\7\u00bd"+
		"\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9"+
		"\u03f4\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7\6\2\2\u03ff"+
		"\u0410\3\2\2\2\u0400\u0401\7\4\2\2\u0401\u0406\5\u00d0i\2\u0402\u0403"+
		"\7\5\2\2\u0403\u0405\5\u00d0i\2\u0404\u0402\3\2\2\2\u0405\u0408\3\2\2"+
		"\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u0406"+
		"\3\2\2\2\u0409\u040a\7\6\2\2\u040a\u040b\7\7\2\2\u040b\u040c\7\4\2\2\u040c"+
		"\u040d\5L\'\2\u040d\u040e\7\6\2\2\u040e\u0410\3\2\2\2\u040f\u03de\3\2"+
		"\2\2\u040f\u03e4\3\2\2\2\u040f\u0400\3\2\2\2\u0410K\3\2\2\2\u0411\u0413"+
		"\7\u02ea\2\2\u0412\u0414\7\u0213\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u041a\5\64\33\2\u0416\u0417\7\5\2\2\u0417"+
		"\u0419\5\64\33\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3"+
		"\2\2\2\u041a\u041b\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041d"+
		"\u0411\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u042f\7\u0251"+
		"\2\2\u0420\u042d\t\t\2\2\u0421\u0422\7\u01c9\2\2\u0422\u0423\7\4\2\2\u0423"+
		"\u0428\5\u009cO\2\u0424\u0425\7\5\2\2\u0425\u0427\5\u009cO\2\u0426\u0424"+
		"\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u042b\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\7\6\2\2\u042c\u042e\3\2"+
		"\2\2\u042d\u0421\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f"+
		"\u0420\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u043a\3\2\2\2\u0431\u043b\7\b"+
		"\2\2\u0432\u0437\5\\/\2\u0433\u0434\7\5\2\2\u0434\u0436\5\\/\2\u0435\u0433"+
		"\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u0431\3\2\2\2\u043a\u0432\3\2"+
		"\2\2\u043a\u043b\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043d\7\u011e\2\2\u043d"+
		"\u043f\5^\60\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\3\2"+
		"\2\2\u0440\u0441\7\u02e6\2\2\u0441\u0443\5T+\2\u0442\u0440\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u044e\3\2\2\2\u0444\u0445\7\u012e\2\2\u0445\u0446"+
		"\7R\2\2\u0446\u044b\5X-\2\u0447\u0448\7\5\2\2\u0448\u044a\5X-\2\u0449"+
		"\u0447\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2"+
		"\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u0444\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0459\3\2\2\2\u0450\u0451\7\u0132\2\2\u0451\u0456"+
		"\5V,\2\u0452\u0453\7\5\2\2\u0453\u0455\5V,\2\u0454\u0452\3\2\2\2\u0455"+
		"\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2"+
		"\2\2\u0458\u0456\3\2\2\2\u0459\u0450\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u046d\3\2\2\2\u045b\u045c\7\u02e9\2\2\u045c\u045d\5\u00c8e\2\u045d\u045e"+
		"\7\64\2\2\u045e\u045f\7\4\2\2\u045f\u0460\5\u00be`\2\u0460\u046a\7\6\2"+
		"\2\u0461\u0462\7\5\2\2\u0462\u0463\5\u00c8e\2\u0463\u0464\7\64\2\2\u0464"+
		"\u0465\7\4\2\2\u0465\u0466\5\u00be`\2\u0466\u0467\7\6\2\2\u0467\u0469"+
		"\3\2\2\2\u0468\u0461\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u045b\3\2"+
		"\2\2\u046d\u046e\3\2\2\2\u046e\u0474\3\2\2\2\u046f\u0471\t\n\2\2\u0470"+
		"\u0472\t\t\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0475\5L\'\2\u0474\u046f\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0477\3\2\2\2\u0476\u0478\5\u00b6\\\2\u0477\u0476\3\2\2\2\u0477\u0478"+
		"\3\2\2\2\u0478\u047e\3\2\2\2\u0479\u047c\7\u0177\2\2\u047a\u047d\5R*\2"+
		"\u047b\u047d\7\'\2\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u047f"+
		"\3\2\2\2\u047e\u0479\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0485\3\2\2\2\u0480"+
		"\u0481\7\u01c6\2\2\u0481\u0483\5P)\2\u0482\u0484\t\13\2\2\u0483\u0482"+
		"\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485\u0480\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u048e\3\2\2\2\u0487\u0488\7\u010b\2\2\u0488\u048a"+
		"\t\f\2\2\u0489\u048b\5R*\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u048d\t\13\2\2\u048d\u048f\7\u01ca\2\2\u048e\u0487"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0493\3\2\2\2\u0490\u0492\5N(\2\u0491"+
		"\u0490\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494M\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u049e\7\u0115\2\2\u0497"+
		"\u049f\7\u02c7\2\2\u0498\u0499\7\u01af\2\2\u0499\u049a\7\u0163\2\2\u049a"+
		"\u049f\7\u02c7\2\2\u049b\u049f\7\u025f\2\2\u049c\u049d\7\u0163\2\2\u049d"+
		"\u049f\7\u025f\2\2\u049e\u0497\3\2\2\2\u049e\u0498\3\2\2\2\u049e\u049b"+
		"\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u04a9\3\2\2\2\u04a0\u04a1\7\u01c4\2"+
		"\2\u04a1\u04a6\5\u00ccg\2\u04a2\u04a3\7\5\2\2\u04a3\u04a5\5\u00ccg\2\u04a4"+
		"\u04a2\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2"+
		"\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04a0\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ae\3\2\2\2\u04ab\u04af\7\u01b7\2\2\u04ac\u04ad"+
		"\7\u0264\2\2\u04ad\u04af\7\u0182\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3"+
		"\2\2\2\u04ae\u04af\3\2\2\2\u04afO\3\2\2\2\u04b0\u04b6\7\u0311\2\2\u04b1"+
		"\u04b2\7\4\2\2\u04b2\u04b3\5\u009cO\2\u04b3\u04b4\7\6\2\2\u04b4\u04b6"+
		"\3\2\2\2\u04b5\u04b0\3\2\2\2\u04b5\u04b1\3\2\2\2\u04b6Q\3\2\2\2\u04b7"+
		"\u04bd\7\u0311\2\2\u04b8\u04b9\7\4\2\2\u04b9\u04ba\5\u009cO\2\u04ba\u04bb"+
		"\7\6\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04b7\3\2\2\2\u04bc\u04b8\3\2\2\2\u04bd"+
		"S\3\2\2\2\u04be\u04bf\5\u009cO\2\u04bfU\3\2\2\2\u04c0\u04c1\5\u009cO\2"+
		"\u04c1W\3\2\2\2\u04c2\u04c3\7\4\2\2\u04c3\u04eb\7\6\2\2\u04c4\u04eb\5"+
		"Z.\2\u04c5\u04c6\7\u023a\2\2\u04c6\u04c7\7\4\2\2\u04c7\u04cc\5Z.\2\u04c8"+
		"\u04c9\7\5\2\2\u04c9\u04cb\5Z.\2\u04ca\u04c8\3\2\2\2\u04cb\u04ce\3\2\2"+
		"\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04cc"+
		"\3\2\2\2\u04cf\u04d0\7\6\2\2\u04d0\u04eb\3\2\2\2\u04d1\u04d2\7\u00a0\2"+
		"\2\u04d2\u04d3\7\4\2\2\u04d3\u04d8\5Z.\2\u04d4\u04d5\7\5\2\2\u04d5\u04d7"+
		"\5Z.\2\u04d6\u04d4\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04dc\7\6"+
		"\2\2\u04dc\u04eb\3\2\2\2\u04dd\u04de\7\u012f\2\2\u04de\u04df\7\u025e\2"+
		"\2\u04df\u04e0\7\4\2\2\u04e0\u04e5\5X-\2\u04e1\u04e2\7\5\2\2\u04e2\u04e4"+
		"\5X-\2\u04e3\u04e1\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04e9\7\6"+
		"\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04c2\3\2\2\2\u04ea\u04c4\3\2\2\2\u04ea"+
		"\u04c5\3\2\2\2\u04ea\u04d1\3\2\2\2\u04ea\u04dd\3\2\2\2\u04ebY\3\2\2\2"+
		"\u04ec\u04f9\5\u009cO\2\u04ed\u04ee\7\4\2\2\u04ee\u04f3\5\u009cO\2\u04ef"+
		"\u04f0\7\5\2\2\u04f0\u04f2\5\u009cO\2\u04f1\u04ef\3\2\2\2\u04f2\u04f5"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5"+
		"\u04f3\3\2\2\2\u04f6\u04f7\7\6\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04ec\3\2"+
		"\2\2\u04f8\u04ed\3\2\2\2\u04f9[\3\2\2\2\u04fa\u04fd\5\u009cO\2\u04fb\u04fc"+
		"\7\64\2\2\u04fc\u04fe\5\u00caf\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2"+
		"\2\u04fe]\3\2\2\2\u04ff\u0504\5`\61\2\u0500\u0501\7\5\2\2\u0501\u0503"+
		"\5`\61\2\u0502\u0500\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504"+
		"\u0505\3\2\2\2\u0505_\3\2\2\2\u0506\u0504\3\2\2\2\u0507\u0509\b\61\1\2"+
		"\u0508\u050a\7\u01ca\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u050d\5\u00ccg\2\u050c\u050e\7\b\2\2\u050d\u050c"+
		"\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\5h\65\2\u0510"+
		"\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0525\3\2\2\2\u0512\u0513\7\u0292"+
		"\2\2\u0513\u0514\5l\67\2\u0514\u0515\7\4\2\2\u0515\u051a\5n8\2\u0516\u0517"+
		"\7\5\2\2\u0517\u0519\5n8\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a"+
		"\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051a\3\2"+
		"\2\2\u051d\u0523\7\6\2\2\u051e\u051f\7\u0225\2\2\u051f\u0520\7\4\2\2\u0520"+
		"\u0521\5p9\2\u0521\u0522\7\6\2\2\u0522\u0524\3\2\2\2\u0523\u051e\3\2\2"+
		"\2\u0523\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0512\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0590\3\2\2\2\u0527\u0529\7\u016c\2\2\u0528\u0527\3\2\2"+
		"\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\7\4\2\2\u052b\u052c"+
		"\5L\'\2\u052c\u052e\7\6\2\2\u052d\u052f\5h\65\2\u052e\u052d\3\2\2\2\u052e"+
		"\u052f\3\2\2\2\u052f\u0590\3\2\2\2\u0530\u0532\5\66\34\2\u0531\u0533\5"+
		"h\65\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0590\3\2\2\2\u0534"+
		"\u0536\7\u016c\2\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537"+
		"\3\2\2\2\u0537\u0538\5\u009aN\2\u0538\u0541\7\4\2\2\u0539\u053e\5\u009c"+
		"O\2\u053a\u053b\7\5\2\2\u053b\u053d\5\u009cO\2\u053c\u053a\3\2\2\2\u053d"+
		"\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0542\3\2"+
		"\2\2\u0540\u053e\3\2\2\2\u0541\u0539\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0546\7\6\2\2\u0544\u0545\7\u02ea\2\2\u0545\u0547"+
		"\7\u01d2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2"+
		"\2\u0548\u054a\5h\65\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u0590"+
		"\3\2\2\2\u054b\u054d\7\u016c\2\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054e\u054f\5\u009aN\2\u054f\u0558\7\4\2\2\u0550"+
		"\u0555\5\u009cO\2\u0551\u0552\7\5\2\2\u0552\u0554\5\u009cO\2\u0553\u0551"+
		"\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0550\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\3\2\2\2\u055a\u055b\7\6\2\2\u055b\u055c\5h\65\2\u055c"+
		"\u0590\3\2\2\2\u055d\u055f\7\u016c\2\2\u055e\u055d\3\2\2\2\u055e\u055f"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\5\u009aN\2\u0561\u056a\7\4\2"+
		"\2\u0562\u0567\5\u009cO\2\u0563\u0564\7\5\2\2\u0564\u0566\5\u009cO\2\u0565"+
		"\u0563\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2"+
		"\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u0562\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\7\6\2\2\u056d\u056e\7\64"+
		"\2\2\u056e\u056f\7\4\2\2\u056f\u0574\5\u00d0i\2\u0570\u0571\7\5\2\2\u0571"+
		"\u0573\5\u00d0i\2\u0572\u0570\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572"+
		"\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0574\3\2\2\2\u0577"+
		"\u0578\7\6\2\2\u0578\u0590\3\2\2\2\u0579\u057b\7\u016c\2\2\u057a\u0579"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7\u0240\2"+
		"\2\u057d\u057e\7\u011e\2\2\u057e\u057f\7\4\2\2\u057f\u0584\5f\64\2\u0580"+
		"\u0581\7\5\2\2\u0581\u0583\5f\64\2\u0582\u0580\3\2\2\2\u0583\u0586\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586"+
		"\u0584\3\2\2\2\u0587\u058a\7\6\2\2\u0588\u0589\7\u02ea\2\2\u0589\u058b"+
		"\7\u01d2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2"+
		"\2\u058c\u058e\5h\65\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590"+
		"\3\2\2\2\u058f\u0507\3\2\2\2\u058f\u0528\3\2\2\2\u058f\u0530\3\2\2\2\u058f"+
		"\u0535\3\2\2\2\u058f\u054c\3\2\2\2\u058f\u055e\3\2\2\2\u058f\u057a\3\2"+
		"\2\2\u0590\u05a9\3\2\2\2\u0591\u0593\f\3\2\2\u0592\u0594\7\u01a4\2\2\u0593"+
		"\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\5b"+
		"\62\2\u0596\u05a5\5`\61\2\u0597\u0598\7\u01c9\2\2\u0598\u05a6\5d\63\2"+
		"\u0599\u059a\7\u02d0\2\2\u059a\u059b\7\4\2\2\u059b\u05a0\5\u00d0i\2\u059c"+
		"\u059d\7\5\2\2\u059d\u059f\5\u00d0i\2\u059e\u059c\3\2\2\2\u059f\u05a2"+
		"\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2"+
		"\u05a0\3\2\2\2\u05a3\u05a4\7\6\2\2\u05a4\u05a6\3\2\2\2\u05a5\u0597\3\2"+
		"\2\2\u05a5\u0599\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7"+
		"\u0591\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aaa\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ae\7\u014e\2\2\u05ad"+
		"\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05c2\7\u0161"+
		"\2\2\u05b0\u05b2\7\u0171\2\2\u05b1\u05b3\7\u01d5\2\2\u05b2\u05b1\3\2\2"+
		"\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05c2\7\u0161\2\2\u05b5"+
		"\u05b7\7\u0237\2\2\u05b6\u05b8\7\u01d5\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8"+
		"\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05c2\7\u0161\2\2\u05ba\u05bc\7\u0120"+
		"\2\2\u05bb\u05bd\7\u01d5\2\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u05c2\7\u0161\2\2\u05bf\u05c0\7\u009e\2\2\u05c0\u05c2"+
		"\7\u0161\2\2\u05c1\u05ad\3\2\2\2\u05c1\u05b0\3\2\2\2\u05c1\u05b5\3\2\2"+
		"\2\u05c1\u05ba\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2c\3\2\2\2\u05c3\u05c4"+
		"\5\u009cO\2\u05c4e\3\2\2\2\u05c5\u05c6\5\u009aN\2\u05c6\u05cb\7\4\2\2"+
		"\u05c7\u05c8\5\u009cO\2\u05c8\u05c9\7\5\2\2\u05c9\u05ca\5\u009cO\2\u05ca"+
		"\u05cc\3\2\2\2\u05cb\u05c7\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2"+
		"\2\2\u05cd\u05da\7\6\2\2\u05ce\u05cf\7\64\2\2\u05cf\u05d0\7\4\2\2\u05d0"+
		"\u05d5\5\u00d0i\2\u05d1\u05d2\7\5\2\2\u05d2\u05d4\5\u00d0i\2\u05d3\u05d1"+
		"\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6"+
		"\u05d8\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u05d9\7\6\2\2\u05d9\u05db\3\2"+
		"\2\2\u05da\u05ce\3\2\2\2\u05da\u05db\3\2\2\2\u05dbg\3\2\2\2\u05dc\u05de"+
		"\7\64\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2"+
		"\u05df\u05eb\5\u00caf\2\u05e0\u05e1\7\4\2\2\u05e1\u05e6\5j\66\2\u05e2"+
		"\u05e3\7\5\2\2\u05e3\u05e5\5j\66\2\u05e4\u05e2\3\2\2\2\u05e5\u05e8\3\2"+
		"\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9\3\2\2\2\u05e8"+
		"\u05e6\3\2\2\2\u05e9\u05ea\7\6\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05e0\3\2"+
		"\2\2\u05eb\u05ec\3\2\2\2\u05eci\3\2\2\2\u05ed\u05ee\5\u00caf\2\u05eek"+
		"\3\2\2\2\u05ef\u05f0\t\r\2\2\u05f0m\3\2\2\2\u05f1\u05f2\5\u009cO\2\u05f2"+
		"o\3\2\2\2\u05f3\u05f4\5\u009cO\2\u05f4q\3\2\2\2\u05f5\u05fa\5\u00d0i\2"+
		"\u05f6\u05f7\7\5\2\2\u05f7\u05f9\5\u00d0i\2\u05f8\u05f6\3\2\2\2\u05f9"+
		"\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fbs\3\2\2\2"+
		"\u05fc\u05fa\3\2\2\2\u05fd\u05fe\5\u00eex\2\u05feu\3\2\2\2\u05ff\u0600"+
		"\5\u00d0i\2\u0600\u0603\5\u00e8u\2\u0601\u0602\7s\2\2\u0602\u0604\5\u0098"+
		"M\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0608\3\2\2\2\u0605"+
		"\u0607\5x=\2\u0606\u0605\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2"+
		"\2\u0608\u0609\3\2\2\2\u0609\u0615\3\2\2\2\u060a\u0608\3\2\2\2\u060b\u0615"+
		"\5|?\2\u060c\u060d\7\u0175\2\2\u060d\u0611\5\u0090I\2\u060e\u0610\5~@"+
		"\2\u060f\u060e\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u05ff\3\2\2\2\u0614"+
		"\u060b\3\2\2\2\u0614\u060c\3\2\2\2\u0615w\3\2\2\2\u0616\u0617\7\u008a"+
		"\2\2\u0617\u0619\5F$\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u0642"+
		"\3\2\2\2\u061a\u061b\7\u01b3\2\2\u061b\u0643\7\u01ba\2\2\u061c\u0643\7"+
		"\u01ba\2\2\u061d\u061e\7j\2\2\u061e\u061f\7\4\2\2\u061f\u0620\5\u0084"+
		"C\2\u0620\u0623\7\6\2\2\u0621\u0622\7\u01af\2\2\u0622\u0624\7\u014a\2"+
		"\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0643\3\2\2\2\u0625\u0626"+
		"\7\u00bd\2\2\u0626\u0643\5\u0086D\2\u0627\u0628\7\u02be\2\2\u0628\u0643"+
		"\5\u008eH\2\u0629\u062a\7\u0203\2\2\u062a\u062b\7\u0163\2\2\u062b\u0643"+
		"\5\u008eH\2\u062c\u062d\7\u0215\2\2\u062d\u0632\5\u008aF\2\u062e\u062f"+
		"\7\4\2\2\u062f\u0630\5\u008cG\2\u0630\u0631\7\6\2\2\u0631\u0633\3\2\2"+
		"\2\u0632\u062e\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0635"+
		"\7\u0188\2\2\u0635\u0637\t\16\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u063b\3\2\2\2\u0638\u0639\7\u01c9\2\2\u0639\u063a\7\u00c4\2"+
		"\2\u063a\u063c\5\u0092J\2\u063b\u0638\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u0640\3\2\2\2\u063d\u063e\7\u01c9\2\2\u063e\u063f\7\u02c7\2\2\u063f\u0641"+
		"\5\u0094K\2\u0640\u063d\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2"+
		"\2\u0642\u061a\3\2\2\2\u0642\u061c\3\2\2\2\u0642\u061d\3\2\2\2\u0642\u0625"+
		"\3\2\2\2\u0642\u0627\3\2\2\2\u0642\u0629\3\2\2\2\u0642\u062c\3\2\2\2\u0643"+
		"\u0645\3\2\2\2\u0644\u0646\5z>\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2"+
		"\2\u0646\u064b\3\2\2\2\u0647\u0648\7\u014c\2\2\u0648\u064c\7\u00c0\2\2"+
		"\u0649\u064a\7\u014c\2\2\u064a\u064c\7\u013d\2\2\u064b\u0647\3\2\2\2\u064b"+
		"\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064cy\3\2\2\2\u064d\u0651\7\u00bf"+
		"\2\2\u064e\u064f\7\u01b3\2\2\u064f\u0651\7\u00bf\2\2\u0650\u064d\3\2\2"+
		"\2\u0650\u064e\3\2\2\2\u0651{\3\2\2\2\u0652\u0653\7\u008a\2\2\u0653\u0655"+
		"\5F$\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u06b9\3\2\2\2\u0656"+
		"\u0657\7j\2\2\u0657\u0658\7\4\2\2\u0658\u0659\5\u0084C\2\u0659\u065c\7"+
		"\6\2\2\u065a\u065b\7\u01af\2\2\u065b\u065d\7\u014a\2\2\u065c\u065a\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u06ba\3\2\2\2\u065e\u065f\7\u02be\2\2\u065f"+
		"\u0660\7\4\2\2\u0660\u0665\5\u00d0i\2\u0661\u0662\7\5\2\2\u0662\u0664"+
		"\5\u00d0i\2\u0663\u0661\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2"+
		"\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0665\3\2\2\2\u0668\u0669"+
		"\7\6\2\2\u0669\u066a\5\u008eH\2\u066a\u06ba\3\2\2\2\u066b\u066c\7\u0203"+
		"\2\2\u066c\u066d\7\u0163\2\2\u066d\u066e\7\4\2\2\u066e\u0673\5\u00d0i"+
		"\2\u066f\u0670\7\5\2\2\u0670\u0672\5\u00d0i\2\u0671\u066f\3\2\2\2\u0672"+
		"\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2"+
		"\2\2\u0675\u0673\3\2\2\2\u0676\u0677\7\6\2\2\u0677\u0678\5\u008eH\2\u0678"+
		"\u06ba\3\2\2\2\u0679\u067c\7\u00fd\2\2\u067a\u067b\7\u02d0\2\2\u067b\u067d"+
		"\5\16\b\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2"+
		"\u067e\u067f\7\4\2\2\u067f\u0684\5\u0080A\2\u0680\u0681\7\5\2\2\u0681"+
		"\u0683\5\u0080A\2\u0682\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686\u0684\3\2\2\2\u0687"+
		"\u0688\7\6\2\2\u0688\u068e\5\u008eH\2\u0689\u068a\7\u02e6\2\2\u068a\u068b"+
		"\7\4\2\2\u068b\u068c\5\u0088E\2\u068c\u068d\7\6\2\2\u068d\u068f\3\2\2"+
		"\2\u068e\u0689\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u06ba\3\2\2\2\u0690\u0691"+
		"\7\u0117\2\2\u0691\u0692\7\u0163\2\2\u0692\u0693\7\4\2\2\u0693\u0698\5"+
		"\u00d0i\2\u0694\u0695\7\5\2\2\u0695\u0697\5\u00d0i\2\u0696\u0694\3\2\2"+
		"\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b"+
		"\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c\7\6\2\2\u069c\u069d\7\u0215\2"+
		"\2\u069d\u06a9\5\u008aF\2\u069e\u069f\7\4\2\2\u069f\u06a4\5\u008cG\2\u06a0"+
		"\u06a1\7\5\2\2\u06a1\u06a3\5\u008cG\2\u06a2\u06a0\3\2\2\2\u06a3\u06a6"+
		"\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\3\2\2\2\u06a6"+
		"\u06a4\3\2\2\2\u06a7\u06a8\7\6\2\2\u06a8\u06aa\3\2\2\2\u06a9\u069e\3\2"+
		"\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06ac\7\u0188\2\2\u06ac"+
		"\u06ae\t\16\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b2\3"+
		"\2\2\2\u06af\u06b0\7\u01c9\2\2\u06b0\u06b1\7\u00c4\2\2\u06b1\u06b3\5\u0092"+
		"J\2\u06b2\u06af\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b7\3\2\2\2\u06b4"+
		"\u06b5\7\u01c9\2\2\u06b5\u06b6\7\u02c7\2\2\u06b6\u06b8\5\u0094K\2\u06b7"+
		"\u06b4\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9\u0656\3\2"+
		"\2\2\u06b9\u065e\3\2\2\2\u06b9\u066b\3\2\2\2\u06b9\u0679\3\2\2\2\u06b9"+
		"\u0690\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06bd\5z>\2\u06bc\u06bb\3\2\2"+
		"\2\u06bc\u06bd\3\2\2\2\u06bd\u06c2\3\2\2\2\u06be\u06bf\7\u014c\2\2\u06bf"+
		"\u06c3\7\u00c0\2\2\u06c0\u06c1\7\u014c\2\2\u06c1\u06c3\7\u013d\2\2\u06c2"+
		"\u06be\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3}\3\2\2\2"+
		"\u06c4\u06c5\t\17\2\2\u06c5\u06c6\t\20\2\2\u06c6\177\3\2\2\2\u06c7\u06c8"+
		"\5\u0082B\2\u06c8\u06c9\7\u02ea\2\2\u06c9\u06ca\5\u009eP\2\u06ca\u0081"+
		"\3\2\2\2\u06cb\u06d1\5\u00d0i\2\u06cc\u06cd\7\4\2\2\u06cd\u06ce\5\u009c"+
		"O\2\u06ce\u06cf\7\6\2\2\u06cf\u06d1\3\2\2\2\u06d0\u06cb\3\2\2\2\u06d0"+
		"\u06cc\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d4\5\22\n\2\u06d3\u06d2\3"+
		"\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06d7\t\2\2\2\u06d6"+
		"\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d9\7\u01bd"+
		"\2\2\u06d9\u06db\t\3\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db"+
		"\u0083\3\2\2\2\u06dc\u06dd\5\u009cO\2\u06dd\u0085\3\2\2\2\u06de\u06df"+
		"\5\u009cO\2\u06df\u0087\3\2\2\2\u06e0\u06e1\5\u009cO\2\u06e1\u0089\3\2"+
		"\2\2\u06e2\u06e3\5\u00ccg\2\u06e3\u008b\3\2\2\2\u06e4\u06e5\5\u00d0i\2"+
		"\u06e5\u008d\3\2\2\2\u06e6\u06e7\7\u02ea\2\2\u06e7\u06e8\7\4\2\2\u06e8"+
		"\u06ed\5\24\13\2\u06e9\u06ea\7\5\2\2\u06ea\u06ec\5\24\13\2\u06eb\u06e9"+
		"\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06f0\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\7\6\2\2\u06f1\u06f3\3\2"+
		"\2\2\u06f2\u06e6\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f8\3\2\2\2\u06f4"+
		"\u06f5\7\u02d0\2\2\u06f5\u06f6\7\u0147\2\2\u06f6\u06f7\7\u0293\2\2\u06f7"+
		"\u06f9\5*\26\2\u06f8\u06f4\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u008f\3\2"+
		"\2\2\u06fa\u06fb\5\u00ccg\2\u06fb\u0091\3\2\2\2\u06fc\u06fd\5\u0096L\2"+
		"\u06fd\u0093\3\2\2\2\u06fe\u06ff\5\u0096L\2\u06ff\u0095\3\2\2\2\u0700"+
		"\u0707\7\u022d\2\2\u0701\u0707\7X\2\2\u0702\u0703\7\u025c\2\2\u0703\u0707"+
		"\7\u01ba\2\2\u0704\u0705\7\u01af\2\2\u0705\u0707\7!\2\2\u0706\u0700\3"+
		"\2\2\2\u0706\u0701\3\2\2\2\u0706\u0702\3\2\2\2\u0706\u0704\3\2\2\2\u0707"+
		"\u0097\3\2\2\2\u0708\u070b\5\u00eex\2\u0709\u070b\5\u00e4s\2\u070a\u0708"+
		"\3\2\2\2\u070a\u0709\3\2\2\2\u070b\u0099\3\2\2\2\u070c\u070f\5\u00eex"+
		"\2\u070d\u070f\5\u00ecw\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f"+
		"\u009b\3\2\2\2\u0710\u0711\bO\1\2\u0711\u0721\5\u00a8U\2\u0712\u0713\t"+
		"\21\2\2\u0713\u0721\5\u009cO\26\u0714\u0715\5\u00a0Q\2\u0715\u0716\5\u009c"+
		"O\22\u0716\u0721\3\2\2\2\u0717\u0718\7\u0102\2\2\u0718\u0719\7\4\2\2\u0719"+
		"\u071a\5L\'\2\u071a\u071b\7\6\2\2\u071b\u0721\3\2\2\2\u071c\u071d\7\u01b3"+
		"\2\2\u071d\u0721\5\u009cO\7\u071e\u0721\5\u00a4S\2\u071f\u0721\5\u00a6"+
		"T\2\u0720\u0710\3\2\2\2\u0720\u0712\3\2\2\2\u0720\u0714\3\2\2\2\u0720"+
		"\u0717\3\2\2\2\u0720\u071c\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u071f\3\2"+
		"\2\2\u0721\u077b\3\2\2\2\u0722\u0723\f\25\2\2\u0723\u0724\7\17\2\2\u0724"+
		"\u077a\5\u009cO\26\u0725\u0726\f\24\2\2\u0726\u0727\t\22\2\2\u0727\u077a"+
		"\5\u009cO\25\u0728\u0729\f\23\2\2\u0729\u072a\t\21\2\2\u072a\u077a\5\u009c"+
		"O\24\u072b\u072c\f\21\2\2\u072c\u072d\5\u00a0Q\2\u072d\u072e\5\u009cO"+
		"\22\u072e\u077a\3\2\2\2\u072f\u0731\f\r\2\2\u0730\u0732\7\u01b3\2\2\u0731"+
		"\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\7G"+
		"\2\2\u0734\u0736\7\u028a\2\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u0738\5\u009cO\2\u0738\u0739\7.\2\2\u0739\u073a\5"+
		"\u009cO\16\u073a\u077a\3\2\2\2\u073b\u073d\f\f\2\2\u073c\u073e\7\u01b3"+
		"\2\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u073f\3\2\2\2\u073f"+
		"\u0740\7\u0143\2\2\u0740\u077a\5\u009cO\r\u0741\u0743\f\13\2\2\u0742\u0744"+
		"\7\u01b3\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0749\3\2\2"+
		"\2\u0745\u074a\7\u0175\2\2\u0746\u074a\7\u013c\2\2\u0747\u0748\7\u0261"+
		"\2\2\u0748\u074a\7\u029f\2\2\u0749\u0745\3\2\2\2\u0749\u0746\3\2\2\2\u0749"+
		"\u0747\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u077a\5\u009cO\f\u074c\u074d"+
		"\f\n\2\2\u074d\u074e\t\23\2\2\u074e\u077a\5\u009cO\13\u074f\u0750\f\t"+
		"\2\2\u0750\u0752\7\u015e\2\2\u0751\u0753\7\u01b3\2\2\u0752\u0751\3\2\2"+
		"\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\7\u00d6\2\2\u0755"+
		"\u0756\7\u011e\2\2\u0756\u077a\5\u009cO\n\u0757\u0758\f\6\2\2\u0758\u0759"+
		"\7.\2\2\u0759\u077a\5\u009cO\7\u075a\u075b\f\5\2\2\u075b\u075c\7\u01cf"+
		"\2\2\u075c\u077a\5\u009cO\6\u075d\u075e\f\31\2\2\u075e\u075f\7\t\2\2\u075f"+
		"\u077a\5\u00e8u\2\u0760\u0761\f\27\2\2\u0761\u0762\7\n\2\2\u0762\u0765"+
		"\5\u009cO\2\u0763\u0764\7\13\2\2\u0764\u0766\5\u009cO\2\u0765\u0763\3"+
		"\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\7\f\2\2\u0768"+
		"\u077a\3\2\2\2\u0769\u076a\f\20\2\2\u076a\u077a\5\u00a0Q\2\u076b\u076c"+
		"\f\16\2\2\u076c\u0770\7s\2\2\u076d\u076e\5\u00ceh\2\u076e\u076f\7\22\2"+
		"\2\u076f\u0771\3\2\2\2\u0770\u076d\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772"+
		"\3\2\2\2\u0772\u077a\5\u0098M\2\u0773\u0774\f\b\2\2\u0774\u0776\7\u015e"+
		"\2\2\u0775\u0777\7\u01b3\2\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u077a\t\24\2\2\u0779\u0722\3\2\2\2\u0779\u0725\3"+
		"\2\2\2\u0779\u0728\3\2\2\2\u0779\u072b\3\2\2\2\u0779\u072f\3\2\2\2\u0779"+
		"\u073b\3\2\2\2\u0779\u0741\3\2\2\2\u0779\u074c\3\2\2\2\u0779\u074f\3\2"+
		"\2\2\u0779\u0757\3\2\2\2\u0779\u075a\3\2\2\2\u0779\u075d\3\2\2\2\u0779"+
		"\u0760\3\2\2\2\u0779\u0769\3\2\2\2\u0779\u076b\3\2\2\2\u0779\u0773\3\2"+
		"\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c"+
		"\u009d\3\2\2\2\u077d\u077b\3\2\2\2\u077e\u078f\5\u00a0Q\2\u077f\u078f"+
		"\7\r\2\2\u0780\u078f\7\16\2\2\u0781\u078f\7\17\2\2\u0782\u078f\7\b\2\2"+
		"\u0783\u078f\7\20\2\2\u0784\u078f\7\21\2\2\u0785\u078f\7\23\2\2\u0786"+
		"\u078f\7\24\2\2\u0787\u078f\7\7\2\2\u0788\u078f\7\25\2\2\u0789\u078f\7"+
		"\26\2\2\u078a\u078f\7\27\2\2\u078b\u078f\7.\2\2\u078c\u078f\7\u01cf\2"+
		"\2\u078d\u078f\7\u01b3\2\2\u078e\u077e\3\2\2\2\u078e\u077f\3\2\2\2\u078e"+
		"\u0780\3\2\2\2\u078e\u0781\3\2\2\2\u078e\u0782\3\2\2\2\u078e\u0783\3\2"+
		"\2\2\u078e\u0784\3\2\2\2\u078e\u0785\3\2\2\2\u078e\u0786\3\2\2\2\u078e"+
		"\u0787\3\2\2\2\u078e\u0788\3\2\2\2\u078e\u0789\3\2\2\2\u078e\u078a\3\2"+
		"\2\2\u078e\u078b\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078d\3\2\2\2\u078f"+
		"\u009f\3\2\2\2\u0790\u079b\7\u031c\2\2\u0791\u079b\7\30\2\2\u0792\u079b"+
		"\7\31\2\2\u0793\u0794\7\u01cc\2\2\u0794\u0795\7\4\2\2\u0795\u0796\5\u00ce"+
		"h\2\u0796\u0797\7\22\2\2\u0797\u0798\5\u00a2R\2\u0798\u0799\7\6\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u0790\3\2\2\2\u079a\u0791\3\2\2\2\u079a\u0792\3\2"+
		"\2\2\u079a\u0793\3\2\2\2\u079b\u00a1\3\2\2\2\u079c\u079d\5\u00eex\2\u079d"+
		"\u00a3\3\2\2\2\u079e\u079f\7Z\2\2\u079f\u07a0\7\u02e4\2\2\u07a0\u07a1"+
		"\5\u009cO\2\u07a1\u07a2\7\u0299\2\2\u07a2\u07aa\5\u009cO\2\u07a3\u07a4"+
		"\7\u02e4\2\2\u07a4\u07a5\5\u009cO\2\u07a5\u07a6\7\u0299\2\2\u07a6\u07a7"+
		"\5\u009cO\2\u07a7\u07a9\3\2\2\2\u07a8\u07a3\3\2\2\2\u07a9\u07ac\3\2\2"+
		"\2\u07aa\u07a8\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07af\3\2\2\2\u07ac\u07aa"+
		"\3\2\2\2\u07ad\u07ae\7\u00ec\2\2\u07ae\u07b0\5\u009cO\2\u07af\u07ad\3"+
		"\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\7\u00f1\2\2"+
		"\u07b2\u00a5\3\2\2\2\u07b3\u07f6\5\u00dco\2\u07b4\u07b5\5\u00ceh\2\u07b5"+
		"\u07b6\7\22\2\2\u07b6\u07b8\3\2\2\2\u07b7\u07b4\3\2\2\2\u07b7\u07b8\3"+
		"\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\5\u00ccg\2\u07ba\u07bb\7\22\2\2"+
		"\u07bb\u07bd\3\2\2\2\u07bc\u07b7\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be"+
		"\3\2\2\2\u07be\u07f6\5\u00d0i\2\u07bf\u07c8\7\4\2\2\u07c0\u07c1\5\u00ce"+
		"h\2\u07c1\u07c2\7\22\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c0\3\2\2\2\u07c3"+
		"\u07c4\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\5\u00ccg\2\u07c6\u07c7"+
		"\7\22\2\2\u07c7\u07c9\3\2\2\2\u07c8\u07c3\3\2\2\2\u07c8\u07c9\3\2\2\2"+
		"\u07c9\u07ca\3\2\2\2\u07ca\u07cb\5\u00d0i\2\u07cb\u07cc\7\6\2\2\u07cc"+
		"\u07cd\7\22\2\2\u07cd\u07ce\5\u00d0i\2\u07ce\u07f6\3\2\2\2\u07cf\u07f6"+
		"\5\u00acW\2\u07d0\u07f6\5\u00b4[\2\u07d1\u07f6\5\u00bc_\2\u07d2\u07f6"+
		"\5\u00aaV\2\u07d3\u07f6\5\n\6\2\u07d4\u07d8\7\u029c\2\2\u07d5\u07d6\7"+
		"\u02ea\2\2\u07d6\u07d7\7\u029b\2\2\u07d7\u07d9\7\u0309\2\2\u07d8\u07d5"+
		"\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\5\u009cO"+
		"\2\u07db\u07dc\7:\2\2\u07dc\u07dd\7\u029b\2\2\u07dd\u07de\7\u0309\2\2"+
		"\u07de\u07df\5\u009cO\2\u07df\u07f6\3\2\2\2\u07e0\u07e2\t\25\2\2\u07e1"+
		"\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\7\4"+
		"\2\2\u07e4\u07e9\5\u009cO\2\u07e5\u07e6\7\5\2\2\u07e6\u07e8\5\u009cO\2"+
		"\u07e7\u07e5\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea"+
		"\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u07ed\7\6\2\2\u07ed"+
		"\u07f6\3\2\2\2\u07ee\u07f0\t\25\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3"+
		"\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\7\4\2\2\u07f2\u07f3\5L\'\2\u07f3"+
		"\u07f4\7\6\2\2\u07f4\u07f6\3\2\2\2\u07f5\u07b3\3\2\2\2\u07f5\u07bc\3\2"+
		"\2\2\u07f5\u07bf\3\2\2\2\u07f5\u07cf\3\2\2\2\u07f5\u07d0\3\2\2\2\u07f5"+
		"\u07d1\3\2\2\2\u07f5\u07d2\3\2\2\2\u07f5\u07d3\3\2\2\2\u07f5\u07d4\3\2"+
		"\2\2\u07f5\u07e1\3\2\2\2\u07f5\u07ef\3\2\2\2\u07f6\u00a7\3\2\2\2\u07f7"+
		"\u07f8\7\61\2\2\u07f8\u07f9\7\n\2\2\u07f9\u07fc\5\u009cO\2\u07fa\u07fb"+
		"\7\5\2\2\u07fb\u07fd\5\u009cO\2\u07fc\u07fa\3\2\2\2\u07fd\u07fe\3\2\2"+
		"\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801"+
		"\7\f\2\2\u0801\u0808\3\2\2\2\u0802\u0803\7\61\2\2\u0803\u0804\7\4\2\2"+
		"\u0804\u0805\5L\'\2\u0805\u0806\7\6\2\2\u0806\u0808\3\2\2\2\u0807\u07f7"+
		"\3\2\2\2\u0807\u0802\3\2\2\2\u0808\u00a9\3\2\2\2\u0809\u080a\7[\2\2\u080a"+
		"\u080b\7\4\2\2\u080b\u080c\5\u009cO\2\u080c\u080d\7\64\2\2\u080d\u080e"+
		"\5\u00e8u\2\u080e\u080f\7\6\2\2\u080f\u00ab\3\2\2\2\u0810\u0811\5\u009a"+
		"N\2\u0811\u0812\7\4\2\2\u0812\u0813\7\6\2\2\u0813\u0822\3\2\2\2\u0814"+
		"\u0815\5\u009aN\2\u0815\u0816\7\4\2\2\u0816\u081b\5\u009cO\2\u0817\u0818"+
		"\7\5\2\2\u0818\u081a\5\u009cO\2\u0819\u0817\3\2\2\2\u081a\u081d\3\2\2"+
		"\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081e\3\2\2\2\u081d\u081b"+
		"\3\2\2\2\u081e\u081f\7\6\2\2\u081f\u0822\3\2\2\2\u0820\u0822\5\u00aeX"+
		"\2\u0821\u0810\3\2\2\2\u0821\u0814\3\2\2\2\u0821\u0820\3\2\2\2\u0822\u00ad"+
		"\3\2\2\2\u0823\u0842\7\u00a4\2\2\u0824\u0829\7\u00aa\2\2\u0825\u0826\7"+
		"\4\2\2\u0826\u0827\5\u00b2Z\2\u0827\u0828\7\6\2\2\u0828\u082a\3\2\2\2"+
		"\u0829\u0825\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0842\3\2\2\2\u082b\u082c"+
		"\7\u00ab\2\2\u082c\u082d\7\4\2\2\u082d\u082e\5\u00b2Z\2\u082e\u082f\7"+
		"\6\2\2\u082f\u0842\3\2\2\2\u0830\u0831\7\u017d\2\2\u0831\u0832\7\4\2\2"+
		"\u0832\u0833\5\u00b2Z\2\u0833\u0834\7\6\2\2\u0834\u0842\3\2\2\2\u0835"+
		"\u0836\7\u017e\2\2\u0836\u0837\7\4\2\2\u0837\u0838\5\u00b2Z\2\u0838\u0839"+
		"\7\6\2\2\u0839\u0842\3\2\2\2\u083a\u083b\7\u0108\2\2\u083b\u083c\7\4\2"+
		"\2\u083c\u083d\5\u00b0Y\2\u083d\u083e\7\u011e\2\2\u083e\u083f\5\u009c"+
		"O\2\u083f\u0840\7\6\2\2\u0840\u0842\3\2\2\2\u0841\u0823\3\2\2\2\u0841"+
		"\u0824\3\2\2\2\u0841\u082b\3\2\2\2\u0841\u0830\3\2\2\2\u0841\u0835\3\2"+
		"\2\2\u0841\u083a\3\2\2\2\u0842\u00af\3\2\2\2\u0843\u0846\5\u00eex\2\u0844"+
		"\u0846\5\u00ecw\2\u0845\u0843\3\2\2\2\u0845\u0844\3\2\2\2\u0846\u00b1"+
		"\3\2\2\2\u0847\u0848\7\u0311\2\2\u0848\u00b3\3\2\2\2\u0849\u084a\5\u00ce"+
		"h\2\u084a\u084b\7\22\2\2\u084b\u084d\3\2\2\2\u084c\u0849\3\2\2\2\u084c"+
		"\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\5\u00ba^\2\u084f\u0851"+
		"\7\4\2\2\u0850\u0852\t\t\2\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852"+
		"\u0853\3\2\2\2\u0853\u0858\5\u009cO\2\u0854\u0855\7\5\2\2\u0855\u0857"+
		"\5\u009cO\2\u0856\u0854\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2"+
		"\2\u0858\u0859\3\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085d"+
		"\5\u00b6\\\2\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2"+
		"\2\u085e\u0865\7\6\2\2\u085f\u0860\7\u010d\2\2\u0860\u0861\7\4\2\2\u0861"+
		"\u0862\7\u02e6\2\2\u0862\u0863\5\u009cO\2\u0863\u0864\7\6\2\2\u0864\u0866"+
		"\3\2\2\2\u0865\u085f\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0898\3\2\2\2\u0867"+
		"\u0868\5\u00ceh\2\u0868\u0869\7\22\2\2\u0869\u086b\3\2\2\2\u086a\u0867"+
		"\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086d\5\u00ba^"+
		"\2\u086d\u086e\7\4\2\2\u086e\u086f\7\b\2\2\u086f\u0876\7\6\2\2\u0870\u0871"+
		"\7\u010d\2\2\u0871\u0872\7\4\2\2\u0872\u0873\7\u02e6\2\2\u0873\u0874\5"+
		"\u009cO\2\u0874\u0875\7\6\2\2\u0875\u0877\3\2\2\2\u0876\u0870\3\2\2\2"+
		"\u0876\u0877\3\2\2\2\u0877\u0898\3\2\2\2\u0878\u0879\5\u00ceh\2\u0879"+
		"\u087a\7\22\2\2\u087a\u087c\3\2\2\2\u087b\u0878\3\2\2\2\u087b\u087c\3"+
		"\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\5\u00ba^\2\u087e\u0887\7\4\2\2"+
		"\u087f\u0884\5\u009cO\2\u0880\u0881\7\5\2\2\u0881\u0883\5\u009cO\2\u0882"+
		"\u0880\3\2\2\2\u0883\u0886\3\2\2\2\u0884\u0882\3\2\2\2\u0884\u0885\3\2"+
		"\2\2\u0885\u0888\3\2\2\2\u0886\u0884\3\2\2\2\u0887\u087f\3\2\2\2\u0887"+
		"\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\7\6\2\2\u088a\u088b\7\u02eb"+
		"\2\2\u088b\u088c\7\u012e\2\2\u088c\u088d\7\4\2\2\u088d\u088e\5\u00b6\\"+
		"\2\u088e\u0895\7\6\2\2\u088f\u0890\7\u010d\2\2\u0890\u0891\7\4\2\2\u0891"+
		"\u0892\7\u02e6\2\2\u0892\u0893\5\u009cO\2\u0893\u0894\7\6\2\2\u0894\u0896"+
		"\3\2\2\2\u0895\u088f\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0898\3\2\2\2\u0897"+
		"\u084c\3\2\2\2\u0897\u086a\3\2\2\2\u0897\u087b\3\2\2\2\u0898\u00b5\3\2"+
		"\2\2\u0899\u089a\7\u01d0\2\2\u089a\u089b\7R\2\2\u089b\u08a0\5\u00b8]\2"+
		"\u089c\u089d\7\5\2\2\u089d\u089f\5\u00b8]\2\u089e\u089c\3\2\2\2\u089f"+
		"\u08a2\3\2\2\2\u08a0\u089e\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u00b7\3\2"+
		"\2\2\u08a2\u08a0\3\2\2\2\u08a3\u08a8\5\u009cO\2\u08a4\u08a9\7\65\2\2\u08a5"+
		"\u08a9\7\u00cc\2\2\u08a6\u08a7\7\u02d0\2\2\u08a7\u08a9\5\u009eP\2\u08a8"+
		"\u08a4\3\2\2\2\u08a8\u08a5\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2"+
		"\2\2\u08a9\u08ac\3\2\2\2\u08aa\u08ab\7\u01bd\2\2\u08ab\u08ad\t\3\2\2\u08ac"+
		"\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u00b9\3\2\2\2\u08ae\u08b1\5\u00ee"+
		"x\2\u08af\u08b1\5\u00ecw\2\u08b0\u08ae\3\2\2\2\u08b0\u08af\3\2\2\2\u08b1"+
		"\u00bb\3\2\2\2\u08b2\u08b3\5\u009aN\2\u08b3\u08bc\7\4\2\2\u08b4\u08b9"+
		"\5\u009cO\2\u08b5\u08b6\7\5\2\2\u08b6\u08b8\5\u009cO\2\u08b7\u08b5\3\2"+
		"\2\2\u08b8\u08bb\3\2\2\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba"+
		"\u08bd\3\2\2\2\u08bb\u08b9\3\2\2\2\u08bc\u08b4\3\2\2\2\u08bc\u08bd\3\2"+
		"\2\2\u08bd\u08be\3\2\2\2\u08be\u08c5\7\6\2\2\u08bf\u08c0\7\u010d\2\2\u08c0"+
		"\u08c1\7\4\2\2\u08c1\u08c2\7\u02e6\2\2\u08c2\u08c3\5\u009cO\2\u08c3\u08c4"+
		"\7\6\2\2\u08c4\u08c6\3\2\2\2\u08c5\u08bf\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6"+
		"\u08c7\3\2\2\2\u08c7\u08c8\7\u01d7\2\2\u08c8\u08c9\7\4\2\2\u08c9\u08ca"+
		"\5\u00be`\2\u08ca\u08cb\7\6\2\2\u08cb\u0905\3\2\2\2\u08cc\u08cd\5\u009a"+
		"N\2\u08cd\u08d6\7\4\2\2\u08ce\u08d3\5\u009cO\2\u08cf\u08d0\7\5\2\2\u08d0"+
		"\u08d2\5\u009cO\2\u08d1\u08cf\3\2\2\2\u08d2\u08d5\3\2\2\2\u08d3\u08d1"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6"+
		"\u08ce\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08df\7\6"+
		"\2\2\u08d9\u08da\7\u010d\2\2\u08da\u08db\7\4\2\2\u08db\u08dc\7\u02e6\2"+
		"\2\u08dc\u08dd\5\u009cO\2\u08dd\u08de\7\6\2\2\u08de\u08e0\3\2\2\2\u08df"+
		"\u08d9\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\7\u01d7"+
		"\2\2\u08e2\u08e3\5\u00c8e\2\u08e3\u0905\3\2\2\2\u08e4\u08e5\5\u009aN\2"+
		"\u08e5\u08e6\7\4\2\2\u08e6\u08e7\7\b\2\2\u08e7\u08ee\7\6\2\2\u08e8\u08e9"+
		"\7\u010d\2\2\u08e9\u08ea\7\4\2\2\u08ea\u08eb\7\u02e6\2\2\u08eb\u08ec\5"+
		"\u009cO\2\u08ec\u08ed\7\6\2\2\u08ed\u08ef\3\2\2\2\u08ee\u08e8\3\2\2\2"+
		"\u08ee\u08ef\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\7\u01d7\2\2\u08f1"+
		"\u08f2\7\4\2\2\u08f2\u08f3\5\u00be`\2\u08f3\u08f4\7\6\2\2\u08f4\u0905"+
		"\3\2\2\2\u08f5\u08f6\5\u009aN\2\u08f6\u08f7\7\4\2\2\u08f7\u08f8\7\b\2"+
		"\2\u08f8\u08ff\7\6\2\2\u08f9\u08fa\7\u010d\2\2\u08fa\u08fb\7\4\2\2\u08fb"+
		"\u08fc\7\u02e6\2\2\u08fc\u08fd\5\u009cO\2\u08fd\u08fe\7\6\2\2\u08fe\u0900"+
		"\3\2\2\2\u08ff\u08f9\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901"+
		"\u0902\7\u01d7\2\2\u0902\u0903\5\u00c8e\2\u0903\u0905\3\2\2\2\u0904\u08b2"+
		"\3\2\2\2\u0904\u08cc\3\2\2\2\u0904\u08e4\3\2\2\2\u0904\u08f5\3\2\2\2\u0905"+
		"\u00bd\3\2\2\2\u0906\u0907\7\4\2\2\u0907\u0912\5\u00c8e\2\u0908\u0909"+
		"\7\u01e9\2\2\u0909\u090a\7R\2\2\u090a\u090f\5\u009cO\2\u090b\u090c\7\5"+
		"\2\2\u090c\u090e\5\u009cO\2\u090d\u090b\3\2\2\2\u090e\u0911\3\2\2\2\u090f"+
		"\u090d\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0913\3\2\2\2\u0911\u090f\3\2"+
		"\2\2\u0912\u0908\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0915\3\2\2\2\u0914"+
		"\u0916\5\u00b6\\\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918"+
		"\3\2\2\2\u0917\u0919\5\u00c0a\2\u0918\u0917\3\2\2\2\u0918\u0919\3\2\2"+
		"\2\u0919\u091a\3\2\2\2\u091a\u091b\7\6\2\2\u091b\u00bf\3\2\2\2\u091c\u091d"+
		"\t\26\2\2\u091d\u0925\5\u00c2b\2\u091e\u091f\t\26\2\2\u091f\u0920\7G\2"+
		"\2\u0920\u0921\5\u00c2b\2\u0921\u0922\7.\2\2\u0922\u0923\5\u00c4c\2\u0923"+
		"\u0925\3\2\2\2\u0924\u091c\3\2\2\2\u0924\u091e\3\2\2\2\u0925\u00c1\3\2"+
		"\2\2\u0926\u0927\5\u00c6d\2\u0927\u00c3\3\2\2\2\u0928\u0929\5\u00c6d\2"+
		"\u0929\u00c5\3\2\2\2\u092a\u092b\7";
	private static final String _serializedATNSegment1 =
		"\u02b9\2\2\u092b\u0937\7\u01fe\2\2\u092c\u092d\5\u009cO\2\u092d\u092e"+
		"\7\u01fe\2\2\u092e\u0937\3\2\2\2\u092f\u0930\7\u00a2\2\2\u0930\u0937\7"+
		"\u023f\2\2\u0931\u0932\5\u009cO\2\u0932\u0933\7\u0114\2\2\u0933\u0937"+
		"\3\2\2\2\u0934\u0935\7\u02b9\2\2\u0935\u0937\7\u0114\2\2\u0936\u092a\3"+
		"\2\2\2\u0936\u092c\3\2\2\2\u0936\u092f\3\2\2\2\u0936\u0931\3\2\2\2\u0936"+
		"\u0934\3\2\2\2\u0937\u00c7\3\2\2\2\u0938\u0939\5\u00eex\2\u0939\u00c9"+
		"\3\2\2\2\u093a\u093b\5\u00eex\2\u093b\u00cb\3\2\2\2\u093c\u093d\5\u00ce"+
		"h\2\u093d\u093e\7\22\2\2\u093e\u0940\3\2\2\2\u093f\u093c\3\2\2\2\u093f"+
		"\u0940\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u0944\5\u00eex\2\u0942\u0944"+
		"\5\u00ecw\2\u0943\u0941\3\2\2\2\u0943\u0942\3\2\2\2\u0944\u00cd\3\2\2"+
		"\2\u0945\u0946\5\u00eex\2\u0946\u00cf\3\2\2\2\u0947\u0958\5\u00eex\2\u0948"+
		"\u0958\5\u00ecw\2\u0949\u0958\7\b\2\2\u094a\u0953\5\u00eex\2\u094b\u094c"+
		"\7\n\2\2\u094c\u094f\5\u009cO\2\u094d\u094e\7\13\2\2\u094e\u0950\5\u009c"+
		"O\2\u094f\u094d\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951"+
		"\u0952\7\f\2\2\u0952\u0954\3\2\2\2\u0953\u094b\3\2\2\2\u0954\u0955\3\2"+
		"\2\2\u0955\u0953\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957"+
		"\u0947\3\2\2\2\u0957\u0948\3\2\2\2\u0957\u0949\3\2\2\2\u0957\u094a\3\2"+
		"\2\2\u0958\u00d1\3\2\2\2\u0959\u095a\5\u00eex\2\u095a\u00d3\3\2\2\2\u095b"+
		"\u095c\5\u00eex\2\u095c\u00d5\3\2\2\2\u095d\u095e\7\u0311\2\2\u095e\u00d7"+
		"\3\2\2\2\u095f\u0960\7\u0311\2\2\u0960\u00d9\3\2\2\2\u0961\u0962\7\u0311"+
		"\2\2\u0962\u00db\3\2\2\2\u0963\u0969\5\u00e4s\2\u0964\u0969\5\u00e2r\2"+
		"\u0965\u0969\5\u00e6t\2\u0966\u0969\5\u00dep\2\u0967\u0969\5\u00e0q\2"+
		"\u0968\u0963\3\2\2\2\u0968\u0964\3\2\2\2\u0968\u0965\3\2\2\2\u0968\u0966"+
		"\3\2\2\2\u0968\u0967\3\2\2\2\u0969\u00dd\3\2\2\2\u096a\u096b\t\27\2\2"+
		"\u096b\u00df\3\2\2\2\u096c\u096d\5\u00e8u\2\u096d\u096e\7\u0312\2\2\u096e"+
		"\u0976\3\2\2\2\u096f\u0970\5\u00e8u\2\u0970\u0971\7\4\2\2\u0971\u0972"+
		"\7\u0311\2\2\u0972\u0973\7\6\2\2\u0973\u0974\7\u0312\2\2\u0974\u0976\3"+
		"\2\2\2\u0975\u096c\3\2\2\2\u0975\u096f\3\2\2\2\u0976\u00e1\3\2\2\2\u0977"+
		"\u0978\t\30\2\2\u0978\u00e3\3\2\2\2\u0979\u097a\t\31\2\2\u097a\u00e5\3"+
		"\2\2\2\u097b\u097c\t\32\2\2\u097c\u00e7\3\2\2\2\u097d\u097e\bu\1\2\u097e"+
		"\u09f9\7H\2\2\u097f\u09f9\7\u030b\2\2\u0980\u0985\7J\2\2\u0981\u0982\7"+
		"\4\2\2\u0982\u0983\5\u00d6l\2\u0983\u0984\7\6\2\2\u0984\u0986\3\2\2\2"+
		"\u0985\u0981\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u09f9\3\2\2\2\u0987\u0988"+
		"\7J\2\2\u0988\u098d\7\u02db\2\2\u0989\u098a\7\4\2\2\u098a\u098b\5\u00d6"+
		"l\2\u098b\u098c\7\6\2\2\u098c\u098e\3\2\2\2\u098d\u0989\3\2\2\2\u098d"+
		"\u098e\3\2\2\2\u098e\u09f9\3\2\2\2\u098f\u09f9\7O\2\2\u0990\u0995\7b\2"+
		"\2\u0991\u0992\7\4\2\2\u0992\u0993\5\u00d6l\2\u0993\u0994\7\6\2\2\u0994"+
		"\u0996\3\2\2\2\u0995\u0991\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u09f9\3\2"+
		"\2\2\u0997\u099c\7a\2\2\u0998\u0999\7\4\2\2\u0999\u099a\5\u00d6l\2\u099a"+
		"\u099b\7\6\2\2\u099b\u099d\3\2\2\2\u099c\u0998\3\2\2\2\u099c\u099d\3\2"+
		"\2\2\u099d\u09f9\3\2\2\2\u099e\u099f\7b\2\2\u099f\u09a4\7\u02db\2\2\u09a0"+
		"\u09a1\7\4\2\2\u09a1\u09a2\5\u00d6l\2\u09a2\u09a3\7\6\2\2\u09a3\u09a5"+
		"\3\2\2\2\u09a4\u09a0\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09f9\3\2\2\2\u09a6"+
		"\u09ab\7\u02d9\2\2\u09a7\u09a8\7\4\2\2\u09a8\u09a9\5\u00d6l\2\u09a9\u09aa"+
		"\7\6\2\2\u09aa\u09ac\3\2\2\2\u09ab\u09a7\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac"+
		"\u09f9\3\2\2\2\u09ad\u09f9\7\u00b4\2\2\u09ae\u09af\7\u00e5\2\2\u09af\u09f9"+
		"\7\u01ff\2\2\u09b0\u09f9\7\u0157\2\2\u09b1\u09f9\7\u0156\2\2\u09b2\u09b4"+
		"\7\u015b\2\2\u09b3\u09b5\5\u00eav\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3"+
		"\2\2\2\u09b5\u09ba\3\2\2\2\u09b6\u09b7\7\4\2\2\u09b7\u09b8\5\u00d6l\2"+
		"\u09b8\u09b9\7\6\2\2\u09b9\u09bb\3\2\2\2\u09ba\u09b6\3\2\2\2\u09ba\u09bb"+
		"\3\2\2\2\u09bb\u09f9\3\2\2\2\u09bc\u09c3\7\u01bf\2\2\u09bd\u09be\7\4\2"+
		"\2\u09be\u09bf\5\u00d6l\2\u09bf\u09c0\7\5\2\2\u09c0\u09c1\5\u00d8m\2\u09c1"+
		"\u09c2\7\6\2\2\u09c2\u09c4\3\2\2\2\u09c3\u09bd\3\2\2\2\u09c3\u09c4\3\2"+
		"\2\2\u09c4\u09f9\3\2\2\2\u09c5\u09f9\7\u020f\2\2\u09c6\u09f9\7\u0265\2"+
		"\2\u09c7\u09f9\7\u030c\2\2\u09c8\u09f9\7\u030a\2\2\u09c9\u09f9\7\u0298"+
		"\2\2\u09ca\u09cf\7\u029b\2\2\u09cb\u09cc\7\4\2\2\u09cc\u09cd\5\u00d6l"+
		"\2\u09cd\u09ce\7\6\2\2\u09ce\u09d0\3\2\2\2\u09cf\u09cb\3\2\2\2\u09cf\u09d0"+
		"\3\2\2\2\u09d0\u09d4\3\2\2\2\u09d1\u09d2\7\u02ec\2\2\u09d2\u09d3\7\u029b"+
		"\2\2\u09d3\u09d5\7\u0309\2\2\u09d4\u09d1\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5"+
		"\u09f9\3\2\2\2\u09d6\u09db\7\u029b\2\2\u09d7\u09d8\7\4\2\2\u09d8\u09d9"+
		"\5\u00d6l\2\u09d9\u09da\7\6\2\2\u09da\u09dc\3\2\2\2\u09db\u09d7\3\2\2"+
		"\2\u09db\u09dc\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\7\u02ea\2\2\u09de"+
		"\u09df\7\u029b\2\2\u09df\u09f9\7\u0309\2\2\u09e0\u09e5\7\u029c\2\2\u09e1"+
		"\u09e2\7\4\2\2\u09e2\u09e3\5\u00d6l\2\u09e3\u09e4\7\6\2\2\u09e4\u09e6"+
		"\3\2\2\2\u09e5\u09e1\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09ea\3\2\2\2\u09e7"+
		"\u09e8\7\u02ec\2\2\u09e8\u09e9\7\u029b\2\2\u09e9\u09eb\7\u0309\2\2\u09ea"+
		"\u09e7\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09f9\3\2\2\2\u09ec\u09f1\7\u029c"+
		"\2\2\u09ed\u09ee\7\4\2\2\u09ee\u09ef\5\u00d6l\2\u09ef\u09f0\7\6\2\2\u09f0"+
		"\u09f2\3\2\2\2\u09f1\u09ed\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\3\2"+
		"\2\2\u09f3\u09f4\7\u02ea\2\2\u09f4\u09f5\7\u029b\2\2\u09f5\u09f9\7\u0309"+
		"\2\2\u09f6\u09f9\7\u02f0\2\2\u09f7\u09f9\7\u0317\2\2\u09f8\u097d\3\2\2"+
		"\2\u09f8\u097f\3\2\2\2\u09f8\u0980\3\2\2\2\u09f8\u0987\3\2\2\2\u09f8\u098f"+
		"\3\2\2\2\u09f8\u0990\3\2\2\2\u09f8\u0997\3\2\2\2\u09f8\u099e\3\2\2\2\u09f8"+
		"\u09a6\3\2\2\2\u09f8\u09ad\3\2\2\2\u09f8\u09ae\3\2\2\2\u09f8\u09b0\3\2"+
		"\2\2\u09f8\u09b1\3\2\2\2\u09f8\u09b2\3\2\2\2\u09f8\u09bc\3\2\2\2\u09f8"+
		"\u09c5\3\2\2\2\u09f8\u09c6\3\2\2\2\u09f8\u09c7\3\2\2\2\u09f8\u09c8\3\2"+
		"\2\2\u09f8\u09c9\3\2\2\2\u09f8\u09ca\3\2\2\2\u09f8\u09d6\3\2\2\2\u09f8"+
		"\u09e0\3\2\2\2\u09f8\u09ec\3\2\2\2\u09f8\u09f6\3\2\2\2\u09f8\u09f7\3\2"+
		"\2\2\u09f9\u09ff\3\2\2\2\u09fa\u09fb\f\3\2\2\u09fb\u09fc\7\n\2\2\u09fc"+
		"\u09fe\7\f\2\2\u09fd\u09fa\3\2\2\2\u09fe\u0a01\3\2\2\2\u09ff\u09fd\3\2"+
		"\2\2\u09ff\u0a00\3\2\2\2\u0a00\u00e9\3\2\2\2\u0a01\u09ff\3\2\2\2\u0a02"+
		"\u0a1e\7\u0307\2\2\u0a03\u0a1e\7\u019b\2\2\u0a04\u0a1e\7\u00b7\2\2\u0a05"+
		"\u0a1e\7\u0137\2\2\u0a06\u0a1e\7\u0195\2\2\u0a07\u0a1e\7\u024e\2\2\u0a08"+
		"\u0a09\7\u0307\2\2\u0a09\u0a0a\7\u029f\2\2\u0a0a\u0a1e\7\u019b\2\2\u0a0b"+
		"\u0a0c\7\u00b7\2\2\u0a0c\u0a0d\7\u029f\2\2\u0a0d\u0a1e\7\u0137\2\2\u0a0e"+
		"\u0a0f\7\u00b7\2\2\u0a0f\u0a10\7\u029f\2\2\u0a10\u0a1e\7\u0195\2\2\u0a11"+
		"\u0a12\7\u00b7\2\2\u0a12\u0a13\7\u029f\2\2\u0a13\u0a1e\7\u024e\2\2\u0a14"+
		"\u0a15\7\u0137\2\2\u0a15\u0a16\7\u029f\2\2\u0a16\u0a1e\7\u0195\2\2\u0a17"+
		"\u0a18\7\u0137\2\2\u0a18\u0a19\7\u029f\2\2\u0a19\u0a1e\7\u024e\2\2\u0a1a"+
		"\u0a1b\7\u0195\2\2\u0a1b\u0a1c\7\u029f\2\2\u0a1c\u0a1e\7\u024e\2\2\u0a1d"+
		"\u0a02\3\2\2\2\u0a1d\u0a03\3\2\2\2\u0a1d\u0a04\3\2\2\2\u0a1d\u0a05\3\2"+
		"\2\2\u0a1d\u0a06\3\2\2\2\u0a1d\u0a07\3\2\2\2\u0a1d\u0a08\3\2\2\2\u0a1d"+
		"\u0a0b\3\2\2\2\u0a1d\u0a0e\3\2\2\2\u0a1d\u0a11\3\2\2\2\u0a1d\u0a14\3\2"+
		"\2\2\u0a1d\u0a17\3\2\2\2\u0a1d\u0a1a\3\2\2\2\u0a1e\u00eb\3\2\2\2\u0a1f"+
		"\u0a20\t\33\2\2\u0a20\u00ed\3\2\2\2\u0a21\u0a22\t\34\2\2\u0a22\u00ef\3"+
		"\2\2\2\u0161\u00f2\u00f4\u00ff\u0106\u010b\u0111\u011e\u0124\u0128\u012d"+
		"\u0130\u0136\u013e\u0149\u014e\u0152\u0156\u015f\u0163\u0166\u0169\u016d"+
		"\u0174\u017b\u017f\u0186\u018a\u0190\u0197\u019b\u01a1\u01a8\u01ac\u01b0"+
		"\u01b3\u01b9\u01c2\u01cd\u01d2\u01d5\u01de\u01e0\u01e4\u01e8\u01eb\u01f1"+
		"\u01fc\u0201\u020a\u020c\u0210\u0214\u0217\u021d\u0226\u022b\u022e\u0237"+
		"\u0239\u023d\u0243\u0246\u0248\u0252\u0256\u0261\u026a\u027a\u027e\u0282"+
		"\u0287\u028b\u0291\u0294\u0297\u029f\u02a5\u02a9\u02ad\u02b4\u02b7\u02bc"+
		"\u02c0\u02c3\u02c6\u02ca\u02d2\u02d9\u02df\u02e3\u02e6\u02e8\u02f1\u02f6"+
		"\u02fe\u030a\u0311\u0314\u031b\u0323\u0328\u0332\u0336\u033b\u033e\u0345"+
		"\u034b\u034f\u0352\u0354\u0359\u035e\u0362\u036d\u0375\u0380\u0386\u038d"+
		"\u0391\u0399\u03a0\u03a3\u03a7\u03ab\u03ae\u03b1\u03b9\u03be\u03c6\u03cd"+
		"\u03d3\u03d7\u03da\u03dc\u03e2\u03ea\u03f2\u03f7\u03fb\u0406\u040f\u0413"+
		"\u041a\u041d\u0428\u042d\u042f\u0437\u043a\u043e\u0442\u044b\u044e\u0456"+
		"\u0459\u046a\u046d\u0471\u0474\u0477\u047c\u047e\u0483\u0485\u048a\u048e"+
		"\u0493\u049e\u04a6\u04a9\u04ae\u04b5\u04bc\u04cc\u04d8\u04e5\u04ea\u04f3"+
		"\u04f8\u04fd\u0504\u0509\u050d\u0510\u051a\u0523\u0525\u0528\u052e\u0532"+
		"\u0535\u053e\u0541\u0546\u0549\u054c\u0555\u0558\u055e\u0567\u056a\u0574"+
		"\u057a\u0584\u058a\u058d\u058f\u0593\u05a0\u05a5\u05a9\u05ad\u05b2\u05b7"+
		"\u05bc\u05c1\u05cb\u05d5\u05da\u05dd\u05e6\u05eb\u05fa\u0603\u0608\u0611"+
		"\u0614\u0618\u0623\u0632\u0636\u063b\u0640\u0642\u0645\u064b\u0650\u0654"+
		"\u065c\u0665\u0673\u067c\u0684\u068e\u0698\u06a4\u06a9\u06ad\u06b2\u06b7"+
		"\u06b9\u06bc\u06c2\u06d0\u06d3\u06d6\u06da\u06ed\u06f2\u06f8\u0706\u070a"+
		"\u070e\u0720\u0731\u0735\u073d\u0743\u0749\u0752\u0765\u0770\u0776\u0779"+
		"\u077b\u078e\u079a\u07aa\u07af\u07b7\u07bc\u07c3\u07c8\u07d8\u07e1\u07e9"+
		"\u07ef\u07f5\u07fe\u0807\u081b\u0821\u0829\u0841\u0845\u084c\u0851\u0858"+
		"\u085c\u0865\u086a\u0876\u087b\u0884\u0887\u0895\u0897\u08a0\u08a8\u08ac"+
		"\u08b0\u08b9\u08bc\u08c5\u08d3\u08d6\u08df\u08ee\u08ff\u0904\u090f\u0912"+
		"\u0915\u0918\u0924\u0936\u093f\u0943\u094f\u0955\u0957\u0968\u0975\u0985"+
		"\u098d\u0995\u099c\u09a4\u09ab\u09b4\u09ba\u09c3\u09cf\u09d4\u09db\u09e5"+
		"\u09ea\u09f1\u09f8\u09ff\u0a1d";
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