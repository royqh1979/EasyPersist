/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Developed by : Roy Qu (royqh1979@gmail.com)
 */
grammar PostgreSQL;

prog
 : ( sql_stmt_list | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;
sql_stmt
 : ( create_index_stmt
   | create_table_stmt
   | create_view_stmt
   | delete_stmt
   | drop_index_stmt
   | drop_table_stmt
   | drop_view_stmt
   | insert_stmt
   | select_stmt
   | update_stmt
)
 ;

var_name:
    identifier
  ;


create_index_stmt
  : K_CREATE (K_UNIQUE)? K_INDEX (K_CONCURRENTLY)?
      ( ( K_IF K_NOT K_EXISTS )? index_name)?
       K_ON table_name (K_USING index_method)?
        '('index_item (',' index_item)* ')'
        ( K_WITH '(' storage_param (','storage_param )* ')')?
        ( K_TABLESPACE tablespace_name )?
        ( K_WHERE expr )?
   ;

index_method: identifier;

index_item:
    (  ('(' expr ')')  | column_name)
        (K_COLLATE collation_name)?
        opClass_name?
        ( K_ASC | K_DESC )?
        ( K_NULLS ( K_FIRST | K_LAST ) )?
    ;

opClass_name:
    identifier;

storage_param:
    param_name  ('=' expr)?;

param_name:identifier;


drop_index_stmt:
    K_DROP K_INDEX (K_CONCURRENTLY)? (K_IF K_EXISTS)?
    index_name (',' index_name)* (K_CASCADE | K_RESTRICT)?
    ;

drop_table_stmt:
    K_DROP  K_TABLE ( K_IF K_EXISTS )?
    table_name (',' table_name)*
    (K_RESTRICT | K_CASCADE)?
    ;

drop_view_stmt:
    K_DROP K_VIEW ( K_IF K_EXISTS )?
    view_name (',' view_name)*
    (K_RESTRICT | K_CASCADE)?
    ;


create_table_stmt
 : K_CREATE (  (K_GLOBAL | K_LOCAL)? ( K_TEMPORARY | K_TEMP | K_UNLOGGED ) )? K_TABLE
    ( K_IF K_NOT K_EXISTS )? table_name
    '(' create_definition (',' create_definition)* ')'
    ( K_INHERITS '(' parent_table (',' parent_table )* ')' )?
    create_with_clause?
    ( K_ON K_COMMIT ( K_PRESERVE K_ROWS | K_DELETE K_ROWS | K_DROP ))?
    ( K_TABLESPACE tablespace_name )?                                               #CreateTableStatement
  |  K_CREATE (  (K_GLOBAL | K_LOCAL)? ( K_TEMPORARY | K_TEMP | K_UNLOGGED ) )? K_TABLE
         ( K_IF K_NOT K_EXISTS )? table_name K_OF type_name
         '(' create_of_definition (',' create_of_definition)* ')'
         create_with_clause?
         ( K_ON K_COMMIT ( K_PRESERVE K_ROWS | K_DELETE K_ROWS | K_DROP ))?
         ( K_TABLESPACE tablespace_name )?                                               #CreateTableOfTypeStatement
  | K_CREATE (  (K_GLOBAL | K_LOCAL)? ( K_TEMPORARY | K_TEMP | K_UNLOGGED ) )? K_TABLE
        ( K_IF K_NOT K_EXISTS )? table_name
              ('(' column_name (',' column_name)* ')')?
         create_with_clause?
         ( K_ON K_COMMIT ( K_PRESERVE K_ROWS | K_DELETE K_ROWS | K_DROP ))?
         ( K_TABLESPACE tablespace_name )?
         K_AS query
         ( K_WITH (K_NO)? K_DATA )?             #CreateTableAsStatement
 ;

query: select_stmt;  

create_of_definition
 : column_name K_WITH K_OPTIONS column_constraint*   # CreateOfColumnDef
   | table_contraint                                 # CreateOfTableConstraintDef
   ;

type_name: identifier;

create_with_clause:
    K_WITH '(' storage_param (',' storage_param)* ')'
    | K_WITH K_OIDS
    | K_WITHOUT K_OIDS
    ;

parent_table: table_name;

tablespace_name: identifier;

value_list:
    '(' literal_value_list ')' (',' '(' literal_value_list ')')*
    | literal_value_list
    ;
literal_value_list:
    (K_MAXVALUE | constants  ) (',' ( K_MAXVALUE | constants ))*
    ;

create_view_stmt
 : K_CREATE (K_OR K_REPLACE)? (K_TEMP | K_TEMPORARY)?
     K_RECURSIVE? K_VIEW view_name ('(' column_list ')')?
     K_AS select_stmt
     ( K_WITH (K_CASCADED | K_LOCAL)? K_CHECK K_OPTION)?
     ;

delete_stmt:
    ( K_WITH (K_RECURSIVE)? with_query (',' with_query)* )?
    K_DELETE K_FROM (K_ONLY)? table_name ('*')? ((K_AS)? alias_name)?
    ( K_USING from_item_list)?
    ( (K_WHERE expr) | (K_WHERE K_CURRENT K_OF cursor_name) )?
    ( K_RETURNING ( '*' | (expr (K_AS  output_name)? (',' expr (K_AS  output_name)? )* )) )?
    ;

with_query:
    with_query_name ('(' column_name (',' column_name)* ')')?
        K_AS '(' (select_stmt | insert_stmt | update_stmt | delete_stmt) ')'
    ;

with_query_name: identifier;

cursor_name: identifier;

output_name: identifier;

insert_stmt:
    ( K_WITH (K_RECURSIVE)? with_query (',' with_query)* )?
        K_INSERT K_INTO table_name ( K_AS alias_name)?  ( '(' column_name (',' column_name)*  ')' )?
          ( ( K_DEFAULT K_VALUES)
            | ( K_VALUES insert_value_list (',' insert_value_list)* )
            | select_stmt )
          ( K_ON K_CONFLICT ( conflict_target )? conflict_action )?
        ( K_RETURNING ( '*' | (expr (K_AS  output_name)? (',' expr (K_AS  output_name)? )* )) )?
    ;

insert_value_list:
     '(' (expr | K_DEFAULT) ( ',' (expr | K_DEFAULT))* ')'
      ;

conflict_target:
      '(' conflict_def_item (',' conflict_def_item )*')'
      | K_ON K_CONSTRAINT constraint_name
      ;

conflict_action:
      K_DO K_NOTHING
   |  K_UPDATE K_SET   column_update_expr (',' column_update_expr)* K_WHERE expr
         ;

conflict_def_item:
      ( column_name | ( '(' expr ')' )) ( K_COLLATE collation_name)? opClass_name
      ;


constraint_name: identifier;

update_stmt:
     ( K_WITH (K_RECURSIVE)? with_query (',' with_query)* )?
      K_UPDATE (K_ONLY)?  table_name ('*')?  ( (K_AS)? alias_name)?
          K_SET column_update_expr (',' column_update_expr)*
      ( K_FROM from_item_list)?
          ( (K_WHERE expr) | (K_WHERE K_CURRENT K_OF cursor_name) )?
          ( K_RETURNING ( '*' | (expr (K_AS  output_name)? (',' expr (K_AS  output_name)? )* )) )?
  ;

column_update_expr:
   column_name '=' (expr | K_DEFAULT)
   | '(' column_name ( ',' column_name)* ')' '=' '(' (expr | K_DEFAULT) (',' (expr | K_DEFAULT) )* ')'
   | '(' column_name ( ',' column_name)* ')' '=' '(' select_stmt ')'
   ;

select_stmt:
    ( K_WITH (K_RECURSIVE)? with_query (',' with_query)* )?
    K_SELECT ( (K_ALL | K_DISTINCT) ( K_ON '(' expr (',' expr )* ')' )? )?
        ( '*' | (select_expr (',' select_expr )* ) )?
        ( K_FROM from_item_list)?
        ( K_WHERE where_condition )?
        ( K_GROUP K_BY grouping_element (',' grouping_element)* )?
        ( K_HAVING having_condition (',' having_condition)* )?
        ( K_WINDOW window_name K_AS '(' window_definition ')' (',' window_name K_AS '(' window_definition ')')* )?
        ( ( K_UNION | K_INTERSECT | K_EXCEPT ) ( K_ALL | K_DISTINCT)? select_stmt )?
         order_by_clause?
         ( K_LIMIT ( count | K_ALL) )?
         ( K_OFFSET start ( K_ROW | K_ROWS)? )?
         ( K_FETCH (K_FIRST | K_NEXT) (count)? ( K_ROW | K_ROWS) K_ONLY )?
         locking_clause*
    ;

locking_clause:
   K_FOR ( K_UPDATE | K_NO K_KEY K_UPDATE | K_SHARE | K_KEY K_SHARE )
                ( K_OF table_name (',' table_name)* )? ( K_NOWAIT | K_SKIP K_LOCKED )?
   ;

start: INTEGER_VALUE;
count: INTEGER_VALUE;

where_condition: expr ;

having_condition: expr ;

grouping_element:
    '(' ')'
    | grouping_base_element
    | K_ROLLUP '(' grouping_base_element (',' grouping_base_element)* ')'
    | K_CUBE '(' grouping_base_element (',' grouping_base_element)* ')'
    | K_GROUPING K_SETS '(' grouping_element (',' grouping_element)* ')'
    ;

grouping_base_element:
  expr
  | '(' expr (',' expr)* ')'
  ;

select_expr
   : expr  ( K_AS alias_name )?
    ;

from_item_list:
    from_item (',' from_item )*
    ;

from_item:
  ( K_ONLY )? table_name ( '*' )?  alias_clause?
         ( K_TABLESAMPLE sampling_method_name '(' sampling_method_argument (',' sampling_method_argument )* ')'
               ( K_REPEATABLE '(' seed ')' )? )?
  | ( K_LATERAL )? '(' select_stmt ')' alias_clause?
  | with_query_name alias_clause?
  |  ( K_LATERAL )? function_name '(' ( expr (',' expr )* )? ')'
                     ( K_WITH K_ORDINALITY )? alias_clause?
  | ( K_LATERAL )? function_name '(' ( expr (',' expr )* )? ')' alias_clause
  | ( K_LATERAL )? function_name '(' ( expr (',' expr )* )? ')' K_AS   '(' column_name (',' column_name)* ')'
  |  ( K_LATERAL )? K_ROWS K_FROM '(' function_element (',' function_element)* ')'
                    ( K_WITH K_ORDINALITY )? alias_clause?
  |  from_item ( K_NATURAL )? join_type from_item ( ( K_ON join_condition)
                | ( K_USING '(' column_name (',' column_name)* ')') )?
  ;

join_type:
  (K_INNER)? K_JOIN
  | K_LEFT ( K_OUTER )? K_JOIN
  | K_RIGHT ( K_OUTER )? K_JOIN
  | K_FULL ( K_OUTER )? K_JOIN
  | K_CROSS K_JOIN
  ;

join_condition: expr;

function_element:
   function_name '(' ( expr (',' expr) )? ')' ( K_AS '(' column_name (',' column_name)* ')' )?
   ;


alias_clause:
  ( K_AS )? alias_name ( '(' column_alias_name (',' column_alias_name)* ')' )?
  ;

column_alias_name: alias_name;

sampling_method_name: K_BERNOULLI  | K_SYSTEM;

sampling_method_argument : expr;

seed: expr;

column_list:
     column_name (',' column_name) *
     ;

view_name: identifier;

create_definition
 : column_name data_type ( K_COLLATE collation_name )? column_constraint*   # ColumnDef
   | table_contraint                                                       # TableConstraintDef
   | K_LIKE source_table like_option*                                      # LikeDef
   ;

column_constraint:
    (K_CONSTRAINT constraint_name)?
    (
        K_NOT K_NULL
        | K_NULL
        | K_CHECK '(' check_expr ')' (K_NO K_INHERIT)?
        | K_DEFAULT default_expr
        | K_UNIQUE index_parameters
        | K_PRIMARY K_KEY index_parameters
        | K_REFERENCES reftable ( '(' refColumn ')' )? (K_MATCH ( K_FULL | K_PARTIAL | K_SIMPLE))?
            (K_ON K_DELETE on_delete_action)? (K_ON K_UPDATE on_update_action)?
    )
     deferrable_option?
     ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE)?
   ;

deferrable_option:
        K_DEFERRABLE
   | K_NOT K_DEFERRABLE
    ;

table_contraint:
    (K_CONSTRAINT constraint_name)?
    (
         K_CHECK '(' check_expr ')' (K_NO K_INHERIT)?
        | K_UNIQUE '(' column_name (',' column_name)* ')' index_parameters
        | K_PRIMARY K_KEY '(' column_name (',' column_name)* ')' index_parameters
        | K_EXCLUDE ( K_USING index_method )? '(' exclude_expr (',' exclude_expr)* ')' index_parameters ( K_WHERE '(' predict ')')?
        | K_FOREIGN K_KEY '(' column_name (',' column_name)* ')' K_REFERENCES reftable ( '(' refColumn (',' refColumn)* ')' )?
            (K_MATCH ( K_FULL | K_PARTIAL | K_SIMPLE))?
            (K_ON K_DELETE on_delete_action)? (K_ON K_UPDATE on_update_action)?
    )
     deferrable_option?
     ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE)?
  ;

like_option:
    ( K_INCLUDING | K_EXCLUDING ) ( K_DEFAULTS | K_CONSTRAINTS | K_INDEXES | K_STORAGE | K_COMMENTS | K_ALL )
   ;

exclude_expr:
    exclude_item K_WITH operator
    ;
    
exclude_item:
 ( column_name | '(' expr ')' ) ( opClass_name )? ( K_ASC | K_DESC )? ( K_NULLS ( K_FIRST | K_LAST ) )?
   ;
check_expr :expr;

default_expr :expr;

predict: expr;

reftable: table_name;

refColumn: column_name;

index_parameters:
   ( K_WITH '(' storage_param (',' storage_param)* ')' )?
   ( K_USING K_INDEX K_TABLESPACE tablespace_name )?
   ;

source_table: table_name;

on_delete_action: action;

on_update_action: action;

action:
  K_RESTRICT
  | K_CASCADE
  | K_SET K_NULL
  | K_NO K_ACTION
  ;


collation_name : identifier | string_constant;
function_name : identifier | keyword ;



/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
*/

expr:
    expr '::' data_type
  | array_constructor
  | expr '[' expr (':' expr)? ']'
  | ('+' | '-') expr
  |  expr '^' expr
  | expr ( '*' | '/' | '%') expr
  | expr ('+' | '-') expr
  /* custom op */
  |  custom_op expr
  | expr custom_op expr
  | expr custom_op
  | (K_EXISTS) '(' select_stmt ')'
  | expr K_COLLATE (schema_name '.')? collation_name
  | expr K_NOT? K_BETWEEN (K_SYMMETRIC)? expr  K_AND expr
  | expr K_NOT? K_IN expr
  | expr K_NOT? ( K_LIKE | K_ILIKE | (K_SIMILAR K_TO) ) expr
  | expr ('<'| '>' | '=' | '>=' | '<=' | '<>' ) expr
  | expr K_IS (K_NOT)? K_DISTINCT K_FROM expr
  | expr K_IS (K_NOT)? (K_TRUE | K_FALSE | K_NULL | K_UNKNOWN)
  | K_NOT expr
  | expr K_AND expr
  | expr K_OR expr
  | condition_expr
  | value_expr
  ;


operator:
  custom_op
  | '+' | '-' | '^' |  '*' | '/' | '%' | '<'| '>' | '=' | '>=' | '<=' | '<>' | K_AND
  | K_OR | K_NOT
  ;
custom_op:
  OPERATOR
  | '!'
  | '~'
  | K_OPERATOR '(' schema_name '.' operator_name ')'
  ;

operator_name: identifier;

condition_expr:
    K_CASE K_WHEN expr K_THEN expr
        (K_WHEN expr K_THEN expr)*
        (K_ELSE expr)?
    K_END
    ;

value_expr:
      constants
    | ((schema_name '.' )? table_name '.')? column_name
    | '(' ((schema_name '.' )? table_name '.')? column_name ')' '.' column_name
    | function_call
    | aggregate_expr
    | window_func_call
    | cast_expr
    | var_name
    | K_TIMESTAMP (K_WITH K_TIME K_ZONE)? expr K_AT K_TIME K_ZONE expr
    | (K_ANY | K_ALL | K_SOME )? '(' expr (',' expr)* ')'
    | (K_ANY | K_ALL | K_SOME )? '(' select_stmt ')'
  ;

array_constructor:
  K_ARRAY '[' expr (',' expr)+ ']'
  | K_ARRAY '(' select_stmt ')'
  ;
cast_expr:
  K_CAST '(' expr K_AS data_type ')'
  ;

function_call:
   function_name '(' ')'
   | function_name '(' expr (',' expr)* ')'
   | time_function_call
  ;

time_function_call:
  K_CURRENT_DATE
  | K_CURRENT_TIME ( '(' precision ')' )?
  | K_CURRENT_TIMESTAMP ( '(' precision ')' )
  | K_LOCALTIME ( '(' precision ')' )
  | K_LOCALTIMESTAMP  ( '(' precision ')' )
  | K_EXTRACT '(' extract_field K_FROM expr ')'
  ;

extract_field : identifier | keyword;

precision:
  INTEGER_VALUE;

aggregate_expr:
   (schema_name '.')? aggregate_name '(' ( K_ALL | K_DISTINCT)? expr (',' expr)* order_by_clause? ')'
     ( K_FILTER '(' K_WHERE expr ')')?
   | (schema_name '.')? aggregate_name '(' '*' ')'  ( K_FILTER '(' K_WHERE expr ')')?
   | (schema_name '.')? aggregate_name '(' ( expr (',' expr)*)? ')' K_WITHIN K_GROUP '(' order_by_clause ')'
       ( K_FILTER '(' K_WHERE expr ')')?
  ;
  

order_by_clause:
     K_ORDER K_BY order_expr (',' order_expr)*
     ;

order_expr:
     expr (K_ASC | K_DESC | K_USING operator )? ( K_NULLS ( K_FIRST | K_LAST ))?
     ;

aggregate_name:  identifier | keyword;

window_func_call:
    function_name '(' ( expr ( ',' expr)*)? ')' ( K_FILTER '(' K_WHERE expr ')')? K_OVER '(' window_definition ')'
  |  function_name '(' ( expr ( ',' expr)*)? ')' ( K_FILTER '(' K_WHERE expr ')')? K_OVER window_name
  | function_name '(' '*' ')' ( K_FILTER '(' K_WHERE expr ')')? K_OVER '(' window_definition ')'
  | function_name '(' '*' ')' ( K_FILTER '(' K_WHERE expr ')')? K_OVER window_name
;

window_definition:
   '(' window_name (K_PARTITION K_BY expr (',' expr)*)?
      order_by_clause?
      ( frame_clause)?
        ')'
   ;

frame_clause:
    (K_RANGE | K_ROWS ) frame_start
    |  (K_RANGE | K_ROWS ) K_BETWEEN frame_start K_AND frame_end
    ;

frame_start:
    frame_value;
frame_end:
    frame_value;

frame_value:
    K_UNBOUNDED K_PRECEDING
    | expr K_PRECEDING
    | K_CURRENT K_ROW
    | expr K_FOLLOWING
    | K_UNBOUNDED K_FOLLOWING
    ;

window_name: identifier;

alias_name: identifier  ;

table_name
   :
   (schema_name '.')?  (identifier | keyword)
   ;

  schema_name:
    identifier;

  column_name
   :  identifier  | keyword |  '*'  | identifier ('[' expr (':' expr )? ']')+
   ;

index_name
    : identifier
;

symbol
    : identifier
;

length: INTEGER_VALUE;

decimals: INTEGER_VALUE ;

value: INTEGER_VALUE;

constants:
        string_constant
    | bit_string_constant
    | numeric_constant
    | boolean_constant
    | typed_constant
    ;

boolean_constant:
    K_TRUE | K_FALSE
    ;

typed_constant:
    data_type QUOTED_STRING
    | data_type '(' INTEGER_VALUE ')' QUOTED_STRING
    ;

bit_string_constant:
    BIT_VALUE
    | HEX_VALUE
    ;

string_constant:
    QUOTED_STRING
    | UNICODE_ESCAPED_STRING
    ;

numeric_constant:
 INTEGER_VALUE
 | FLOAT_VALUE
 | SCIENTIFIC_VALUE
 ;

data_type:
    K_BIGINT
    | K_BIGSERIAL
    | K_BIT ( '(' length ')' )?
    | K_BIT K_VARYING ( '(' length ')' )?
    | K_BOOLEAN
    | K_CHARACTER ( '(' length ')' )?
    | K_CHAR ( '(' length ')' )?
    | K_CHARACTER K_VARYING ( '(' length ')' )?
    | K_VARCHAR ( '(' length ')' )?
    | K_DATE
    | K_DOUBLE K_PRECISION
    | K_INTEGER
    | K_INT
    | K_INTERVAL (interval_field)? ( '(' length ')' )?
    | K_NUMERIC ( '(' length ',' decimals ')' )?
    | K_REAL
    | K_SMALLINT
    | K_SMALLSERIAL
    | K_SERIAL
    | K_TEXT
    | K_TIME ( '(' length ')' )? ( K_WITHOUT K_TIME K_ZONE)?
    | K_TIME ( '(' length ')' )? K_WITH K_TIME K_ZONE
    | K_TIMESTAMP ( '(' length ')' )? ( K_WITHOUT K_TIME K_ZONE)?
    | K_TIMESTAMP ( '(' length ')' )? K_WITH K_TIME K_ZONE
    | K_XML
    | UNQUOTED_IDENTIFIER
    | data_type'['']'
    /*  | spatial_type */
  ;

interval_field:
  K_YEAR
  | K_MONTH
  | K_DAY
  | K_HOUR
  | K_MINUTE
  | K_SECOND
  | K_YEAR K_TO K_MONTH
  | K_DAY K_TO K_HOUR
  | K_DAY K_TO K_MINUTE
  | K_DAY K_TO K_SECOND
  | K_HOUR K_TO K_MINUTE
  | K_HOUR K_TO K_SECOND
  | K_MINUTE K_TO K_SECOND
  ;

keyword
 :K_A
 | K_ABORT
 | K_ABS
 | K_ABSENT
 | K_ABSOLUTE
 | K_ACCESS
 | K_ACCORDING
 | K_ACTION
 | K_ADA
 | K_ADD
 | K_ADMIN
 | K_AFTER
 | K_AGGREGATE
 | K_ALL
 | K_ALLOCATE
 | K_ALSO
 | K_ALTER
 | K_ALWAYS
 | K_ANALYSE
 | K_ANALYZE
 | K_AND
 | K_ANY
 | K_ARE
 | K_ARRAY
 | K_ARRAY_AGG
 | K_ARRAY_MAX_CARDINALITY
 | K_AS
 | K_ASC
 | K_ASENSITIVE
 | K_ASSERTION
 | K_ASSIGNMENT
 | K_ASYMMETRIC
 | K_AT
 | K_ATOMIC
 | K_ATTRIBUTE
 | K_ATTRIBUTES
 | K_AUTHORIZATION
 | K_AVG
 | K_BACKWARD
 | K_BASE64
 | K_BEFORE
 | K_BEGIN
 | K_BEGIN_FRAME
 | K_BEGIN_PARTITION
 | K_BERNOULLI
 | K_BETWEEN
 | K_BIGINT
 | K_BINARY
 | K_BIT
 | K_BIT_LENGTH
 | K_BLOB
 | K_BLOCKED
 | K_BOM
 | K_BOOLEAN
 | K_BOTH
 | K_BREADTH
 | K_BY
 | K_C
 | K_CACHE
 | K_CALL
 | K_CALLED
 | K_CARDINALITY
 | K_CASCADE
 | K_CASCADED
 | K_CASE
 | K_CAST
 | K_CATALOG
 | K_CATALOG_NAME
 | K_CEIL
 | K_CEILING
 | K_CHAIN
 | K_CHAR
 | K_CHARACTER
 | K_CHARACTERISTICS
 | K_CHARACTERS
 | K_CHARACTER_LENGTH
 | K_CHARACTER_SET_CATALOG
 | K_CHARACTER_SET_NAME
 | K_CHARACTER_SET_SCHEMA
 | K_CHAR_LENGTH
 | K_CHECK
 | K_CHECKPOINT
 | K_CLASS
 | K_CLASS_ORIGIN
 | K_CLOB
 | K_CLOSE
 | K_CLUSTER
 | K_COALESCE
 | K_COBOL
 | K_COLLATE
 | K_COLLATION
 | K_COLLATION_CATALOG
 | K_COLLATION_NAME
 | K_COLLATION_SCHEMA
 | K_COLLECT
 | K_COLUMN
 | K_COLUMNS
 | K_COLUMN_NAME
 | K_COMMAND_FUNCTION
 | K_COMMAND_FUNCTION_CODE
 | K_COMMENT
 | K_COMMENTS
 | K_COMMIT
 | K_COMMITTED
 | K_CONCURRENTLY
 | K_CONDITION
 | K_CONDITION_NUMBER
 | K_CONFIGURATION
 | K_CONFLICT
 | K_CONNECT
 | K_CONNECTION
 | K_CONNECTION_NAME
 | K_CONSTRAINT
 | K_CONSTRAINTS
 | K_CONSTRAINT_CATALOG
 | K_CONSTRAINT_NAME
 | K_CONSTRAINT_SCHEMA
 | K_CONSTRUCTOR
 | K_CONTAINS
 | K_CONTENT
 | K_CONTINUE
 | K_CONTROL
 | K_CONVERSION
 | K_CONVERT
 | K_COPY
 | K_CORR
 | K_CORRESPONDING
 | K_COST
 | K_COUNT
 | K_COVAR_POP
 | K_COVAR_SAMP
 | K_CREATE
 | K_CROSS
 | K_CSV
 | K_CUBE
 | K_CUME_DIST
 | K_CURRENT
 | K_CURRENT_CATALOG
 | K_CURRENT_DATE
 | K_CURRENT_DEFAULT_TRANSFORM_GROUP
 | K_CURRENT_PATH
 | K_CURRENT_ROLE
 | K_CURRENT_ROW
 | K_CURRENT_SCHEMA
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_CURRENT_TRANSFORM_GROUP_FOR_TYPE
 | K_CURRENT_USER
 | K_CURSOR
 | K_CURSOR_NAME
 | K_CYCLE
 | K_DATA
 | K_DATABASE
 | K_DATALINK
 | K_DATE
 | K_DATETIME_INTERVAL_CODE
 | K_DATETIME_INTERVAL_PRECISION
 | K_DAY
 | K_DB
 | K_DEALLOCATE
 | K_DEC
 | K_DECIMAL
 | K_DECLARE
 | K_DEFAULT
 | K_DEFAULTS
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DEFINED
 | K_DEFINER
 | K_DEGREE
 | K_DELETE
 | K_DELIMITER
 | K_DELIMITERS
 | K_DENSE_RANK
 | K_DEPENDS
 | K_DEPTH
 | K_DEREF
 | K_DERIVED
 | K_DESC
 | K_DESCRIBE
 | K_DESCRIPTOR
 | K_DETERMINISTIC
 | K_DIAGNOSTICS
 | K_DICTIONARY
 | K_DISABLE
 | K_DISCARD
 | K_DISCONNECT
 | K_DISPATCH
 | K_DISTINCT
 | K_DLNEWCOPY
 | K_DLPREVIOUSCOPY
 | K_DLURLCOMPLETE
 | K_DLURLCOMPLETEONLY
 | K_DLURLCOMPLETEWRITE
 | K_DLURLPATH
 | K_DLURLPATHONLY
 | K_DLURLPATHWRITE
 | K_DLURLSCHEME
 | K_DLURLSERVER
 | K_DLVALUE
 | K_DO
 | K_DOCUMENT
 | K_DOMAIN
 | K_DOUBLE
 | K_DROP
 | K_DYNAMIC
 | K_DYNAMIC_FUNCTION
 | K_DYNAMIC_FUNCTION_CODE
 | K_EACH
 | K_ELEMENT
 | K_ELSE
 | K_EMPTY
 | K_ENABLE
 | K_ENCODING
 | K_ENCRYPTED
 | K_END
 | K_END_EXEC
 | K_END_FRAME
 | K_END_PARTITION
 | K_ENFORCED
 | K_ENUM
 | K_EQUALS
 | K_ESCAPE
 | K_EVENT
 | K_EVERY
 | K_EXCEPT
 | K_EXCEPTION
 | K_EXCLUDE
 | K_EXCLUDING
 | K_EXCLUSIVE
 | K_EXEC
 | K_EXECUTE
 | K_EXISTS
 | K_EXP
 | K_EXPLAIN
 | K_EXPRESSION
 | K_EXTENSION
 | K_EXTERNAL
 | K_EXTRACT
 | K_FALSE
 | K_FAMILY
 | K_FETCH
 | K_FILE
 | K_FILTER
 | K_FINAL
 | K_FIRST
 | K_FIRST_VALUE
 | K_FLAG
 | K_FLOAT
 | K_FLOOR
 | K_FOLLOWING
 | K_FOR
 | K_FORCE
 | K_FOREIGN
 | K_FORTRAN
 | K_FORWARD
 | K_FOUND
 | K_FRAME_ROW
 | K_FREE
 | K_FREEZE
 | K_FROM
 | K_FS
 | K_FULL
 | K_FUNCTION
 | K_FUNCTIONS
 | K_FUSION
 | K_G
 | K_GENERAL
 | K_GENERATED
 | K_GET
 | K_GLOBAL
 | K_GO
 | K_GOTO
 | K_GRANT
 | K_GRANTED
 | K_GREATEST
 | K_GROUP
 | K_GROUPING
 | K_GROUPS
 | K_HANDLER
 | K_HAVING
 | K_HEADER
 | K_HEX
 | K_HIERARCHY
 | K_HOLD
 | K_HOUR
 | K_ID
 | K_IDENTITY
 | K_IF
 | K_IGNORE
 | K_ILIKE
 | K_IMMEDIATE
 | K_IMMEDIATELY
 | K_IMMUTABLE
 | K_IMPLEMENTATION
 | K_IMPLICIT
 | K_IMPORT
 | K_IN
 | K_INCLUDING
 | K_INCREMENT
 | K_INDENT
 | K_INDEX
 | K_INDEXES
 | K_INDICATOR
 | K_INHERIT
 | K_INHERITS
 | K_INITIALLY
 | K_INLINE
 | K_INNER
 | K_INOUT
 | K_INPUT
 | K_INSENSITIVE
 | K_INSERT
 | K_INSTANCE
 | K_INSTANTIABLE
 | K_INSTEAD
 | K_INT
 | K_INTEGER
 | K_INTEGRITY
 | K_INTERSECT
 | K_INTERSECTION
 | K_INTERVAL
 | K_INTO
 | K_INVOKER
 | K_IS
 | K_ISNULL
 | K_ISOLATION
 | K_JOIN
 | K_K
 | K_KEY
 | K_KEY_MEMBER
 | K_KEY_TYPE
 | K_LABEL
 | K_LAG
 | K_LANGUAGE
 | K_LARGE
 | K_LAST
 | K_LAST_VALUE
 | K_LATERAL
 | K_LEAD
 | K_LEADING
 | K_LEAKPROOF
 | K_LEAST
 | K_LEFT
 | K_LENGTH
 | K_LEVEL
 | K_LIBRARY
 | K_LIKE
 | K_LIKE_REGEX
 | K_LIMIT
 | K_LINK
 | K_LISTEN
 | K_LN
 | K_LOAD
 | K_LOCAL
 | K_LOCALTIME
 | K_LOCALTIMESTAMP
 | K_LOCATION
 | K_LOCATOR
 | K_LOCK
 | K_LOCKED
 | K_LOGGED
 | K_LOWER
 | K_M
 | K_MAP
 | K_MAPPING
 | K_MATCH
 | K_MATCHED
 | K_MATERIALIZED
 | K_MAX
 | K_MAXVALUE
 | K_MAX_CARDINALITY
 | K_MEMBER
 | K_MERGE
 | K_MESSAGE_LENGTH
 | K_MESSAGE_OCTET_LENGTH
 | K_MESSAGE_TEXT
 | K_METHOD
 | K_MIN
 | K_MINUTE
 | K_MINVALUE
 | K_MOD
 | K_MODE
 | K_MODIFIES
 | K_MODULE
 | K_MONTH
 | K_MORE
 | K_MOVE
 | K_MULTISET
 | K_MUMPS
 | K_NAME
 | K_NAMES
 | K_NAMESPACE
 | K_NATIONAL
 | K_NATURAL
 | K_NCHAR
 | K_NCLOB
 | K_NESTING
 | K_NEW
 | K_NEXT
 | K_NFC
 | K_NFD
 | K_NFKC
 | K_NFKD
 | K_NIL
 | K_NO
 | K_NONE
 | K_NORMALIZE
 | K_NORMALIZED
 | K_NOT
 | K_NOTHING
 | K_NOTIFY
 | K_NOTNULL
 | K_NOWAIT
 | K_NTH_VALUE
 | K_NTILE
 | K_NULL
 | K_NULLABLE
 | K_NULLIF
 | K_NULLS
 | K_NUMBER
 | K_NUMERIC
 | K_OBJECT
 | K_OCCURRENCES_REGEX
 | K_OCTETS
 | K_OCTET_LENGTH
 | K_OF
 | K_OFF
 | K_OFFSET
 | K_OIDS
 | K_OLD
 | K_ON
 | K_ONLY
 | K_OPEN
 | K_OPERATOR
 | K_OPTION
 | K_OPTIONS
 | K_OR
 | K_ORDER
 | K_ORDERING
 | K_ORDINALITY
 | K_OTHERS
 | K_OUT
 | K_OUTER
 | K_OUTPUT
 | K_OVER
 | K_OVERLAPS
 | K_OVERLAY
 | K_OVERRIDING
 | K_OWNED
 | K_OWNER
 | K_P
 | K_PAD
 | K_PARALLEL
 | K_PARAMETER
 | K_PARAMETER_MODE
 | K_PARAMETER_NAME
 | K_PARAMETER_ORDINAL_POSITION
 | K_PARAMETER_SPECIFIC_CATALOG
 | K_PARAMETER_SPECIFIC_NAME
 | K_PARAMETER_SPECIFIC_SCHEMA
 | K_PARSER
 | K_PARTIAL
 | K_PARTITION
 | K_PASCAL
 | K_PASSING
 | K_PASSTHROUGH
 | K_PASSWORD
 | K_PATH
 | K_PERCENT
 | K_PERCENTILE_CONT
 | K_PERCENTILE_DISC
 | K_PERCENT_RANK
 | K_PERIOD
 | K_PERMISSION
 | K_PLACING
 | K_PLANS
 | K_PLI
 | K_POLICY
 | K_PORTION
 | K_POSITION
 | K_POSITION_REGEX
 | K_POWER
 | K_PRECEDES
 | K_PRECEDING
 | K_PRECISION
 | K_PREPARE
 | K_PREPARED
 | K_PRESERVE
 | K_PRIMARY
 | K_PRIOR
 | K_PRIVILEGES
 | K_PROCEDURAL
 | K_PROCEDURE
 | K_PROGRAM
 | K_PUBLIC
 | K_QUOTE
 | K_RANGE
 | K_RANK
 | K_READ
 | K_READS
 | K_REAL
 | K_REASSIGN
 | K_RECHECK
 | K_RECOVERY
 | K_RECURSIVE
 | K_REF
 | K_REFERENCES
 | K_REFERENCING
 | K_REFRESH
 | K_REGR_AVGX
 | K_REGR_AVGY
 | K_REGR_COUNT
 | K_REGR_INTERCEPT
 | K_REGR_R2
 | K_REGR_SLOPE
 | K_REGR_SXX
 | K_REGR_SXY
 | K_REGR_SYY
 | K_REINDEX
 | K_RELATIVE
 | K_RELEASE
 | K_RENAME
 | K_REPEATABLE
 | K_REPLACE
 | K_REPLICA
 | K_REQUIRING
 | K_RESET
 | K_RESPECT
 | K_RESTART
 | K_RESTORE
 | K_RESTRICT
 | K_RESULT
 | K_RETURN
 | K_RETURNED_CARDINALITY
 | K_RETURNED_LENGTH
 | K_RETURNED_OCTET_LENGTH
 | K_RETURNED_SQLSTATE
 | K_RETURNING
 | K_RETURNS
 | K_REVOKE
 | K_RIGHT
 | K_ROLE
 | K_ROLLBACK
 | K_ROLLUP
 | K_ROUTINE
 | K_ROUTINE_CATALOG
 | K_ROUTINE_NAME
 | K_ROUTINE_SCHEMA
 | K_ROW
 | K_ROWS
 | K_ROW_COUNT
 | K_ROW_NUMBER
 | K_RULE
 | K_SAVEPOINT
 | K_SCALE
 | K_SCHEMA
 | K_SCHEMA_NAME
 | K_SCOPE
 | K_SCOPE_CATALOG
 | K_SCOPE_NAME
 | K_SCOPE_SCHEMA
 | K_SCROLL
 | K_SEARCH
 | K_SECOND
 | K_SECTION
 | K_SECURITY
 | K_SELECT
 | K_SELECTIVE
 | K_SELF
 | K_SENSITIVE
 | K_SEQUENCE
 | K_SEQUENCES
 | K_SERIALIZABLE
 | K_SERVER
 | K_SERVER_NAME
 | K_SESSION
 | K_SESSION_USER
 | K_SET
 | K_SETOF
 | K_SETS
 | K_SHARE
 | K_SHOW
 | K_SIMILAR
 | K_SIMPLE
 | K_SIZE
 | K_SKIP
 | K_SMALLINT
 | K_SNAPSHOT
 | K_SOME
 | K_SOURCE
 | K_SPACE
 | K_SPECIFIC
 | K_SPECIFICTYPE
 | K_SPECIFIC_NAME
 | K_SQL
 | K_SQLCODE
 | K_SQLERROR
 | K_SQLEXCEPTION
 | K_SQLSTATE
 | K_SQLWARNING
 | K_SQRT
 | K_STABLE
 | K_STANDALONE
 | K_START
 | K_STATE
 | K_STATEMENT
 | K_STATIC
 | K_STATISTICS
 | K_STDDEV_POP
 | K_STDDEV_SAMP
 | K_STDIN
 | K_STDOUT
 | K_STORAGE
 | K_STRICT
 | K_STRIP
 | K_STRUCTURE
 | K_STYLE
 | K_SUBCLASS_ORIGIN
 | K_SUBMULTISET
 | K_SUBSTRING
 | K_SUBSTRING_REGEX
 | K_SUCCEEDS
 | K_SUM
 | K_SYMMETRIC
 | K_SYSID
 | K_SYSTEM
 | K_SYSTEM_TIME
 | K_SYSTEM_USER
 | K_T
 | K_TABLE
 | K_TABLES
 | K_TABLESAMPLE
 | K_TABLESPACE
 | K_TABLE_NAME
 | K_TEMP
 | K_TEMPLATE
 | K_TEMPORARY
 | K_TEXT
 | K_THEN
 | K_TIES
 | K_TIME
 | K_TIMESTAMP
 | K_TIMEZONE_HOUR
 | K_TIMEZONE_MINUTE
 | K_TO
 | K_TOKEN
 | K_TOP_LEVEL_COUNT
 | K_TRAILING
 | K_TRANSACTION
 | K_TRANSACTIONS_COMMITTED
 | K_TRANSACTIONS_ROLLED_BACK
 | K_TRANSACTION_ACTIVE
 | K_TRANSFORM
 | K_TRANSFORMS
 | K_TRANSLATE
 | K_TRANSLATE_REGEX
 | K_TRANSLATION
 | K_TREAT
 | K_TRIGGER
 | K_TRIGGER_CATALOG
 | K_TRIGGER_NAME
 | K_TRIGGER_SCHEMA
 | K_TRIM
 | K_TRIM_ARRAY
 | K_TRUE
 | K_TRUNCATE
 | K_TRUSTED
 | K_TYPE
 | K_TYPES
 | K_UESCAPE
 | K_UNBOUNDED
 | K_UNCOMMITTED
 | K_UNDER
 | K_UNENCRYPTED
 | K_UNION
 | K_UNIQUE
 | K_UNKNOWN
 | K_UNLINK
 | K_UNLISTEN
 | K_UNLOGGED
 | K_UNNAMED
 | K_UNNEST
 | K_UNTIL
 | K_UNTYPED
 | K_UPDATE
 | K_UPPER
 | K_URI
 | K_USAGE
 | K_USER
 | K_USER_DEFINED_TYPE_CATALOG
 | K_USER_DEFINED_TYPE_CODE
 | K_USER_DEFINED_TYPE_NAME
 | K_USER_DEFINED_TYPE_SCHEMA
 | K_USING
 | K_VACUUM
 | K_VALID
 | K_VALIDATE
 | K_VALIDATOR
 | K_VALUE
 | K_VALUES
 | K_VALUE_OF
 | K_VARBINARY
 | K_VARCHAR
 | K_VARIADIC
 | K_VARYING
 | K_VAR_POP
 | K_VAR_SAMP
 | K_VERBOSE
 | K_VERSION
 | K_VERSIONING
 | K_VIEW
 | K_VIEWS
 | K_VOLATILE
 | K_WHEN
 | K_WHENEVER
 | K_WHERE
 | K_WHITESPACE
 | K_WIDTH_BUCKET
 | K_WINDOW
 | K_WITH
 | K_WITHIN
 | K_WITHOUT
 | K_WORK
 | K_WRAPPER
 | K_WRITE
 | K_XML
 | K_XMLAGG
 | K_XMLATTRIBUTES
 | K_XMLBINARY
 | K_XMLCAST
 | K_XMLCOMMENT
 | K_XMLCONCAT
 | K_XMLDECLARATION
 | K_XMLDOCUMENT
 | K_XMLELEMENT
 | K_XMLEXISTS
 | K_XMLFOREST
 | K_XMLITERATE
 | K_XMLNAMESPACES
 | K_XMLPARSE
 | K_XMLPI
 | K_XMLQUERY
 | K_XMLROOT
 | K_XMLSCHEMA
 | K_XMLSERIALIZE
 | K_XMLTABLE
 | K_XMLTEXT
 | K_XMLVALIDATE
 | K_YEAR
 | K_YES
 | K_ZONE
 /* custom keywords */
 | K_BIGSERIAL
 | K_SERIAL
 | K_SMALLSERIAL
 ;

identifier:
  QUOTED_IDENTIFIER
  | UNDERLINE_STARTED_IDENTIFIER
  | UNQUOTED_IDENTIFIER
  | UNICODE_ESCAPED_IDENTIFIER
  ;

K_A : A ;
K_ABORT : A B O R T ;
K_ABS : A B S ;
K_ABSENT : A B S E N T ;
K_ABSOLUTE : A B S O L U T E ;
K_ACCESS : A C C E S S ;
K_ACCORDING : A C C O R D I N G ;
K_ACTION : A C T I O N ;
K_ADA : A D A ;
K_ADD : A D D ;
K_ADMIN : A D M I N ;
K_AFTER : A F T E R ;
K_AGGREGATE : A G G R E G A T E ;
K_ALL : A L L ;
K_ALLOCATE : A L L O C A T E ;
K_ALSO : A L S O ;
K_ALTER : A L T E R ;
K_ALWAYS : A L W A Y S ;
K_ANALYSE : A N A L Y S E ;
K_ANALYZE : A N A L Y Z E ;
K_AND : A N D ;
K_ANY : A N Y ;
K_ARE : A R E ;
K_ARRAY : A R R A Y ;
K_ARRAY_AGG : A R R A Y '_' A G G ;
K_ARRAY_MAX_CARDINALITY : A R R A Y '_' M A X '_' C A R D I N A L I T Y ;
K_AS : A S ;
K_ASC : A S C ;
K_ASENSITIVE : A S E N S I T I V E ;
K_ASSERTION : A S S E R T I O N ;
K_ASSIGNMENT : A S S I G N M E N T ;
K_ASYMMETRIC : A S Y M M E T R I C ;
K_AT : A T ;
K_ATOMIC : A T O M I C ;
K_ATTRIBUTE : A T T R I B U T E ;
K_ATTRIBUTES : A T T R I B U T E S ;
K_AUTHORIZATION : A U T H O R I Z A T I O N ;
K_AVG : A V G ;
K_BACKWARD : B A C K W A R D ;
K_BASE64 : B A S E '6' '4' ;
K_BEFORE : B E F O R E ;
K_BEGIN : B E G I N ;
K_BEGIN_FRAME : B E G I N '_' F R A M E ;
K_BEGIN_PARTITION : B E G I N '_' P A R T I T I O N ;
K_BERNOULLI : B E R N O U L L I ;
K_BETWEEN : B E T W E E N ;
K_BIGINT : B I G I N T ;
K_BINARY : B I N A R Y ;
K_BIT : B I T ;
K_BIT_LENGTH : B I T '_' L E N G T H ;
K_BLOB : B L O B ;
K_BLOCKED : B L O C K E D ;
K_BOM : B O M ;
K_BOOLEAN : B O O L E A N ;
K_BOTH : B O T H ;
K_BREADTH : B R E A D T H ;
K_BY : B Y ;
K_C : C ;
K_CACHE : C A C H E ;
K_CALL : C A L L ;
K_CALLED : C A L L E D ;
K_CARDINALITY : C A R D I N A L I T Y ;
K_CASCADE : C A S C A D E ;
K_CASCADED : C A S C A D E D ;
K_CASE : C A S E ;
K_CAST : C A S T ;
K_CATALOG : C A T A L O G ;
K_CATALOG_NAME : C A T A L O G '_' N A M E ;
K_CEIL : C E I L ;
K_CEILING : C E I L I N G ;
K_CHAIN : C H A I N ;
K_CHAR : C H A R ;
K_CHARACTER : C H A R A C T E R ;
K_CHARACTERISTICS : C H A R A C T E R I S T I C S ;
K_CHARACTERS : C H A R A C T E R S ;
K_CHARACTER_LENGTH : C H A R A C T E R '_' L E N G T H ;
K_CHARACTER_SET_CATALOG : C H A R A C T E R '_' S E T '_' C A T A L O G ;
K_CHARACTER_SET_NAME : C H A R A C T E R '_' S E T '_' N A M E ;
K_CHARACTER_SET_SCHEMA : C H A R A C T E R '_' S E T '_' S C H E M A ;
K_CHAR_LENGTH : C H A R '_' L E N G T H ;
K_CHECK : C H E C K ;
K_CHECKPOINT : C H E C K P O I N T ;
K_CLASS : C L A S S ;
K_CLASS_ORIGIN : C L A S S '_' O R I G I N ;
K_CLOB : C L O B ;
K_CLOSE : C L O S E ;
K_CLUSTER : C L U S T E R ;
K_COALESCE : C O A L E S C E ;
K_COBOL : C O B O L ;
K_COLLATE : C O L L A T E ;
K_COLLATION : C O L L A T I O N ;
K_COLLATION_CATALOG : C O L L A T I O N '_' C A T A L O G ;
K_COLLATION_NAME : C O L L A T I O N '_' N A M E ;
K_COLLATION_SCHEMA : C O L L A T I O N '_' S C H E M A ;
K_COLLECT : C O L L E C T ;
K_COLUMN : C O L U M N ;
K_COLUMNS : C O L U M N S ;
K_COLUMN_NAME : C O L U M N '_' N A M E ;
K_COMMAND_FUNCTION : C O M M A N D '_' F U N C T I O N ;
K_COMMAND_FUNCTION_CODE : C O M M A N D '_' F U N C T I O N '_' C O D E ;
K_COMMENT : C O M M E N T ;
K_COMMENTS : C O M M E N T S ;
K_COMMIT : C O M M I T ;
K_COMMITTED : C O M M I T T E D ;
K_CONCURRENTLY : C O N C U R R E N T L Y ;
K_CONDITION : C O N D I T I O N ;
K_CONDITION_NUMBER : C O N D I T I O N '_' N U M B E R ;
K_CONFIGURATION : C O N F I G U R A T I O N ;
K_CONFLICT : C O N F L I C T ;
K_CONNECT : C O N N E C T ;
K_CONNECTION : C O N N E C T I O N ;
K_CONNECTION_NAME : C O N N E C T I O N '_' N A M E ;
K_CONSTRAINT : C O N S T R A I N T ;
K_CONSTRAINTS : C O N S T R A I N T S ;
K_CONSTRAINT_CATALOG : C O N S T R A I N T '_' C A T A L O G ;
K_CONSTRAINT_NAME : C O N S T R A I N T '_' N A M E ;
K_CONSTRAINT_SCHEMA : C O N S T R A I N T '_' S C H E M A ;
K_CONSTRUCTOR : C O N S T R U C T O R ;
K_CONTAINS : C O N T A I N S ;
K_CONTENT : C O N T E N T ;
K_CONTINUE : C O N T I N U E ;
K_CONTROL : C O N T R O L ;
K_CONVERSION : C O N V E R S I O N ;
K_CONVERT : C O N V E R T ;
K_COPY : C O P Y ;
K_CORR : C O R R ;
K_CORRESPONDING : C O R R E S P O N D I N G ;
K_COST : C O S T ;
K_COUNT : C O U N T ;
K_COVAR_POP : C O V A R '_' P O P ;
K_COVAR_SAMP : C O V A R '_' S A M P ;
K_CREATE : C R E A T E ;
K_CROSS : C R O S S ;
K_CSV : C S V ;
K_CUBE : C U B E ;
K_CUME_DIST : C U M E '_' D I S T ;
K_CURRENT : C U R R E N T ;
K_CURRENT_CATALOG : C U R R E N T '_' C A T A L O G ;
K_CURRENT_DATE : C U R R E N T '_' D A T E ;
K_CURRENT_DEFAULT_TRANSFORM_GROUP : C U R R E N T '_' D E F A U L T '_' T R A N S F O R M '_' G R O U P ;
K_CURRENT_PATH : C U R R E N T '_' P A T H ;
K_CURRENT_ROLE : C U R R E N T '_' R O L E ;
K_CURRENT_ROW : C U R R E N T '_' R O W ;
K_CURRENT_SCHEMA : C U R R E N T '_' S C H E M A ;
K_CURRENT_TIME : C U R R E N T '_' T I M E ;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P ;
K_CURRENT_TRANSFORM_GROUP_FOR_TYPE : C U R R E N T '_' T R A N S F O R M '_' G R O U P '_' F O R '_' T Y P E ;
K_CURRENT_USER : C U R R E N T '_' U S E R ;
K_CURSOR : C U R S O R ;
K_CURSOR_NAME : C U R S O R '_' N A M E ;
K_CYCLE : C Y C L E ;
K_DATA : D A T A ;
K_DATABASE : D A T A B A S E ;
K_DATALINK : D A T A L I N K ;
K_DATE : D A T E ;
K_DATETIME_INTERVAL_CODE : D A T E T I M E '_' I N T E R V A L '_' C O D E ;
K_DATETIME_INTERVAL_PRECISION : D A T E T I M E '_' I N T E R V A L '_' P R E C I S I O N ;
K_DAY : D A Y ;
K_DB : D B ;
K_DEALLOCATE : D E A L L O C A T E ;
K_DEC : D E C ;
K_DECIMAL : D E C I M A L ;
K_DECLARE : D E C L A R E ;
K_DEFAULT : D E F A U L T ;
K_DEFAULTS : D E F A U L T S ;
K_DEFERRABLE : D E F E R R A B L E ;
K_DEFERRED : D E F E R R E D ;
K_DEFINED : D E F I N E D ;
K_DEFINER : D E F I N E R ;
K_DEGREE : D E G R E E ;
K_DELETE : D E L E T E ;
K_DELIMITER : D E L I M I T E R ;
K_DELIMITERS : D E L I M I T E R S ;
K_DENSE_RANK : D E N S E '_' R A N K ;
K_DEPENDS : D E P E N D S ;
K_DEPTH : D E P T H ;
K_DEREF : D E R E F ;
K_DERIVED : D E R I V E D ;
K_DESC : D E S C ;
K_DESCRIBE : D E S C R I B E ;
K_DESCRIPTOR : D E S C R I P T O R ;
K_DETERMINISTIC : D E T E R M I N I S T I C ;
K_DIAGNOSTICS : D I A G N O S T I C S ;
K_DICTIONARY : D I C T I O N A R Y ;
K_DISABLE : D I S A B L E ;
K_DISCARD : D I S C A R D ;
K_DISCONNECT : D I S C O N N E C T ;
K_DISPATCH : D I S P A T C H ;
K_DISTINCT : D I S T I N C T ;
K_DLNEWCOPY : D L N E W C O P Y ;
K_DLPREVIOUSCOPY : D L P R E V I O U S C O P Y ;
K_DLURLCOMPLETE : D L U R L C O M P L E T E ;
K_DLURLCOMPLETEONLY : D L U R L C O M P L E T E O N L Y ;
K_DLURLCOMPLETEWRITE : D L U R L C O M P L E T E W R I T E ;
K_DLURLPATH : D L U R L P A T H ;
K_DLURLPATHONLY : D L U R L P A T H O N L Y ;
K_DLURLPATHWRITE : D L U R L P A T H W R I T E ;
K_DLURLSCHEME : D L U R L S C H E M E ;
K_DLURLSERVER : D L U R L S E R V E R ;
K_DLVALUE : D L V A L U E ;
K_DO : D O ;
K_DOCUMENT : D O C U M E N T ;
K_DOMAIN : D O M A I N ;
K_DOUBLE : D O U B L E ;
K_DROP : D R O P ;
K_DYNAMIC : D Y N A M I C ;
K_DYNAMIC_FUNCTION : D Y N A M I C '_' F U N C T I O N ;
K_DYNAMIC_FUNCTION_CODE : D Y N A M I C '_' F U N C T I O N '_' C O D E ;
K_EACH : E A C H ;
K_ELEMENT : E L E M E N T ;
K_ELSE : E L S E ;
K_EMPTY : E M P T Y ;
K_ENABLE : E N A B L E ;
K_ENCODING : E N C O D I N G ;
K_ENCRYPTED : E N C R Y P T E D ;
K_END : E N D ;
K_END_EXEC : E N D '-' E X E C ;
K_END_FRAME : E N D '_' F R A M E ;
K_END_PARTITION : E N D '_' P A R T I T I O N ;
K_ENFORCED : E N F O R C E D ;
K_ENUM : E N U M ;
K_EQUALS : E Q U A L S ;
K_ESCAPE : E S C A P E ;
K_EVENT : E V E N T ;
K_EVERY : E V E R Y ;
K_EXCEPT : E X C E P T ;
K_EXCEPTION : E X C E P T I O N ;
K_EXCLUDE : E X C L U D E ;
K_EXCLUDING : E X C L U D I N G ;
K_EXCLUSIVE : E X C L U S I V E ;
K_EXEC : E X E C ;
K_EXECUTE : E X E C U T E ;
K_EXISTS : E X I S T S ;
K_EXP : E X P ;
K_EXPLAIN : E X P L A I N ;
K_EXPRESSION : E X P R E S S I O N ;
K_EXTENSION : E X T E N S I O N ;
K_EXTERNAL : E X T E R N A L ;
K_EXTRACT : E X T R A C T ;
K_FALSE : F A L S E ;
K_FAMILY : F A M I L Y ;
K_FETCH : F E T C H ;
K_FILE : F I L E ;
K_FILTER : F I L T E R ;
K_FINAL : F I N A L ;
K_FIRST : F I R S T ;
K_FIRST_VALUE : F I R S T '_' V A L U E ;
K_FLAG : F L A G ;
K_FLOAT : F L O A T ;
K_FLOOR : F L O O R ;
K_FOLLOWING : F O L L O W I N G ;
K_FOR : F O R ;
K_FORCE : F O R C E ;
K_FOREIGN : F O R E I G N ;
K_FORTRAN : F O R T R A N ;
K_FORWARD : F O R W A R D ;
K_FOUND : F O U N D ;
K_FRAME_ROW : F R A M E '_' R O W ;
K_FREE : F R E E ;
K_FREEZE : F R E E Z E ;
K_FROM : F R O M ;
K_FS : F S ;
K_FULL : F U L L ;
K_FUNCTION : F U N C T I O N ;
K_FUNCTIONS : F U N C T I O N S ;
K_FUSION : F U S I O N ;
K_G : G ;
K_GENERAL : G E N E R A L ;
K_GENERATED : G E N E R A T E D ;
K_GET : G E T ;
K_GLOBAL : G L O B A L ;
K_GO : G O ;
K_GOTO : G O T O ;
K_GRANT : G R A N T ;
K_GRANTED : G R A N T E D ;
K_GREATEST : G R E A T E S T ;
K_GROUP : G R O U P ;
K_GROUPING : G R O U P I N G ;
K_GROUPS : G R O U P S ;
K_HANDLER : H A N D L E R ;
K_HAVING : H A V I N G ;
K_HEADER : H E A D E R ;
K_HEX : H E X ;
K_HIERARCHY : H I E R A R C H Y ;
K_HOLD : H O L D ;
K_HOUR : H O U R ;
K_ID : I D ;
K_IDENTITY : I D E N T I T Y ;
K_IF : I F ;
K_IGNORE : I G N O R E ;
K_ILIKE : I L I K E ;
K_IMMEDIATE : I M M E D I A T E ;
K_IMMEDIATELY : I M M E D I A T E L Y ;
K_IMMUTABLE : I M M U T A B L E ;
K_IMPLEMENTATION : I M P L E M E N T A T I O N ;
K_IMPLICIT : I M P L I C I T ;
K_IMPORT : I M P O R T ;
K_IN : I N ;
K_INCLUDING : I N C L U D I N G ;
K_INCREMENT : I N C R E M E N T ;
K_INDENT : I N D E N T ;
K_INDEX : I N D E X ;
K_INDEXES : I N D E X E S ;
K_INDICATOR : I N D I C A T O R ;
K_INHERIT : I N H E R I T ;
K_INHERITS : I N H E R I T S ;
K_INITIALLY : I N I T I A L L Y ;
K_INLINE : I N L I N E ;
K_INNER : I N N E R ;
K_INOUT : I N O U T ;
K_INPUT : I N P U T ;
K_INSENSITIVE : I N S E N S I T I V E ;
K_INSERT : I N S E R T ;
K_INSTANCE : I N S T A N C E ;
K_INSTANTIABLE : I N S T A N T I A B L E ;
K_INSTEAD : I N S T E A D ;
K_INT : I N T ;
K_INTEGER : I N T E G E R ;
K_INTEGRITY : I N T E G R I T Y ;
K_INTERSECT : I N T E R S E C T ;
K_INTERSECTION : I N T E R S E C T I O N ;
K_INTERVAL : I N T E R V A L ;
K_INTO : I N T O ;
K_INVOKER : I N V O K E R ;
K_IS : I S ;
K_ISNULL : I S N U L L ;
K_ISOLATION : I S O L A T I O N ;
K_JOIN : J O I N ;
K_K : K ;
K_KEY : K E Y ;
K_KEY_MEMBER : K E Y '_' M E M B E R ;
K_KEY_TYPE : K E Y '_' T Y P E ;
K_LABEL : L A B E L ;
K_LAG : L A G ;
K_LANGUAGE : L A N G U A G E ;
K_LARGE : L A R G E ;
K_LAST : L A S T ;
K_LAST_VALUE : L A S T '_' V A L U E ;
K_LATERAL : L A T E R A L ;
K_LEAD : L E A D ;
K_LEADING : L E A D I N G ;
K_LEAKPROOF : L E A K P R O O F ;
K_LEAST : L E A S T ;
K_LEFT : L E F T ;
K_LENGTH : L E N G T H ;
K_LEVEL : L E V E L ;
K_LIBRARY : L I B R A R Y ;
K_LIKE : L I K E ;
K_LIKE_REGEX : L I K E '_' R E G E X ;
K_LIMIT : L I M I T ;
K_LINK : L I N K ;
K_LISTEN : L I S T E N ;
K_LN : L N ;
K_LOAD : L O A D ;
K_LOCAL : L O C A L ;
K_LOCALTIME : L O C A L T I M E ;
K_LOCALTIMESTAMP : L O C A L T I M E S T A M P ;
K_LOCATION : L O C A T I O N ;
K_LOCATOR : L O C A T O R ;
K_LOCK : L O C K ;
K_LOCKED : L O C K E D ;
K_LOGGED : L O G G E D ;
K_LOWER : L O W E R ;
K_M : M ;
K_MAP : M A P ;
K_MAPPING : M A P P I N G ;
K_MATCH : M A T C H ;
K_MATCHED : M A T C H E D ;
K_MATERIALIZED : M A T E R I A L I Z E D ;
K_MAX : M A X ;
K_MAXVALUE : M A X V A L U E ;
K_MAX_CARDINALITY : M A X '_' C A R D I N A L I T Y ;
K_MEMBER : M E M B E R ;
K_MERGE : M E R G E ;
K_MESSAGE_LENGTH : M E S S A G E '_' L E N G T H ;
K_MESSAGE_OCTET_LENGTH : M E S S A G E '_' O C T E T '_' L E N G T H ;
K_MESSAGE_TEXT : M E S S A G E '_' T E X T ;
K_METHOD : M E T H O D ;
K_MIN : M I N ;
K_MINUTE : M I N U T E ;
K_MINVALUE : M I N V A L U E ;
K_MOD : M O D ;
K_MODE : M O D E ;
K_MODIFIES : M O D I F I E S ;
K_MODULE : M O D U L E ;
K_MONTH : M O N T H ;
K_MORE : M O R E ;
K_MOVE : M O V E ;
K_MULTISET : M U L T I S E T ;
K_MUMPS : M U M P S ;
K_NAME : N A M E ;
K_NAMES : N A M E S ;
K_NAMESPACE : N A M E S P A C E ;
K_NATIONAL : N A T I O N A L ;
K_NATURAL : N A T U R A L ;
K_NCHAR : N C H A R ;
K_NCLOB : N C L O B ;
K_NESTING : N E S T I N G ;
K_NEW : N E W ;
K_NEXT : N E X T ;
K_NFC : N F C ;
K_NFD : N F D ;
K_NFKC : N F K C ;
K_NFKD : N F K D ;
K_NIL : N I L ;
K_NO : N O ;
K_NONE : N O N E ;
K_NORMALIZE : N O R M A L I Z E ;
K_NORMALIZED : N O R M A L I Z E D ;
K_NOT : N O T ;
K_NOTHING : N O T H I N G ;
K_NOTIFY : N O T I F Y ;
K_NOTNULL : N O T N U L L ;
K_NOWAIT : N O W A I T ;
K_NTH_VALUE : N T H '_' V A L U E ;
K_NTILE : N T I L E ;
K_NULL : N U L L ;
K_NULLABLE : N U L L A B L E ;
K_NULLIF : N U L L I F ;
K_NULLS : N U L L S ;
K_NUMBER : N U M B E R ;
K_NUMERIC : N U M E R I C ;
K_OBJECT : O B J E C T ;
K_OCCURRENCES_REGEX : O C C U R R E N C E S '_' R E G E X ;
K_OCTETS : O C T E T S ;
K_OCTET_LENGTH : O C T E T '_' L E N G T H ;
K_OF : O F ;
K_OFF : O F F ;
K_OFFSET : O F F S E T ;
K_OIDS : O I D S ;
K_OLD : O L D ;
K_ON : O N ;
K_ONLY : O N L Y ;
K_OPEN : O P E N ;
K_OPERATOR : O P E R A T O R ;
K_OPTION : O P T I O N ;
K_OPTIONS : O P T I O N S ;
K_OR : O R ;
K_ORDER : O R D E R ;
K_ORDERING : O R D E R I N G ;
K_ORDINALITY : O R D I N A L I T Y ;
K_OTHERS : O T H E R S ;
K_OUT : O U T ;
K_OUTER : O U T E R ;
K_OUTPUT : O U T P U T ;
K_OVER : O V E R ;
K_OVERLAPS : O V E R L A P S ;
K_OVERLAY : O V E R L A Y ;
K_OVERRIDING : O V E R R I D I N G ;
K_OWNED : O W N E D ;
K_OWNER : O W N E R ;
K_P : P ;
K_PAD : P A D ;
K_PARALLEL : P A R A L L E L ;
K_PARAMETER : P A R A M E T E R ;
K_PARAMETER_MODE : P A R A M E T E R '_' M O D E ;
K_PARAMETER_NAME : P A R A M E T E R '_' N A M E ;
K_PARAMETER_ORDINAL_POSITION : P A R A M E T E R '_' O R D I N A L '_' P O S I T I O N ;
K_PARAMETER_SPECIFIC_CATALOG : P A R A M E T E R '_' S P E C I F I C '_' C A T A L O G ;
K_PARAMETER_SPECIFIC_NAME : P A R A M E T E R '_' S P E C I F I C '_' N A M E ;
K_PARAMETER_SPECIFIC_SCHEMA : P A R A M E T E R '_' S P E C I F I C '_' S C H E M A ;
K_PARSER : P A R S E R ;
K_PARTIAL : P A R T I A L ;
K_PARTITION : P A R T I T I O N ;
K_PASCAL : P A S C A L ;
K_PASSING : P A S S I N G ;
K_PASSTHROUGH : P A S S T H R O U G H ;
K_PASSWORD : P A S S W O R D ;
K_PATH : P A T H ;
K_PERCENT : P E R C E N T ;
K_PERCENTILE_CONT : P E R C E N T I L E '_' C O N T ;
K_PERCENTILE_DISC : P E R C E N T I L E '_' D I S C ;
K_PERCENT_RANK : P E R C E N T '_' R A N K ;
K_PERIOD : P E R I O D ;
K_PERMISSION : P E R M I S S I O N ;
K_PLACING : P L A C I N G ;
K_PLANS : P L A N S ;
K_PLI : P L I ;
K_POLICY : P O L I C Y ;
K_PORTION : P O R T I O N ;
K_POSITION : P O S I T I O N ;
K_POSITION_REGEX : P O S I T I O N '_' R E G E X ;
K_POWER : P O W E R ;
K_PRECEDES : P R E C E D E S ;
K_PRECEDING : P R E C E D I N G ;
K_PRECISION : P R E C I S I O N ;
K_PREPARE : P R E P A R E ;
K_PREPARED : P R E P A R E D ;
K_PRESERVE : P R E S E R V E ;
K_PRIMARY : P R I M A R Y ;
K_PRIOR : P R I O R ;
K_PRIVILEGES : P R I V I L E G E S ;
K_PROCEDURAL : P R O C E D U R A L ;
K_PROCEDURE : P R O C E D U R E ;
K_PROGRAM : P R O G R A M ;
K_PUBLIC : P U B L I C ;
K_QUOTE : Q U O T E ;
K_RANGE : R A N G E ;
K_RANK : R A N K ;
K_READ : R E A D ;
K_READS : R E A D S ;
K_REAL : R E A L ;
K_REASSIGN : R E A S S I G N ;
K_RECHECK : R E C H E C K ;
K_RECOVERY : R E C O V E R Y ;
K_RECURSIVE : R E C U R S I V E ;
K_REF : R E F ;
K_REFERENCES : R E F E R E N C E S ;
K_REFERENCING : R E F E R E N C I N G ;
K_REFRESH : R E F R E S H ;
K_REGR_AVGX : R E G R '_' A V G X ;
K_REGR_AVGY : R E G R '_' A V G Y ;
K_REGR_COUNT : R E G R '_' C O U N T ;
K_REGR_INTERCEPT : R E G R '_' I N T E R C E P T ;
K_REGR_R2 : R E G R '_' R '2' ;
K_REGR_SLOPE : R E G R '_' S L O P E ;
K_REGR_SXX : R E G R '_' S X X ;
K_REGR_SXY : R E G R '_' S X Y ;
K_REGR_SYY : R E G R '_' S Y Y ;
K_REINDEX : R E I N D E X ;
K_RELATIVE : R E L A T I V E ;
K_RELEASE : R E L E A S E ;
K_RENAME : R E N A M E ;
K_REPEATABLE : R E P E A T A B L E ;
K_REPLACE : R E P L A C E ;
K_REPLICA : R E P L I C A ;
K_REQUIRING : R E Q U I R I N G ;
K_RESET : R E S E T ;
K_RESPECT : R E S P E C T ;
K_RESTART : R E S T A R T ;
K_RESTORE : R E S T O R E ;
K_RESTRICT : R E S T R I C T ;
K_RESULT : R E S U L T ;
K_RETURN : R E T U R N ;
K_RETURNED_CARDINALITY : R E T U R N E D '_' C A R D I N A L I T Y ;
K_RETURNED_LENGTH : R E T U R N E D '_' L E N G T H ;
K_RETURNED_OCTET_LENGTH : R E T U R N E D '_' O C T E T '_' L E N G T H ;
K_RETURNED_SQLSTATE : R E T U R N E D '_' S Q L S T A T E ;
K_RETURNING : R E T U R N I N G ;
K_RETURNS : R E T U R N S ;
K_REVOKE : R E V O K E ;
K_RIGHT : R I G H T ;
K_ROLE : R O L E ;
K_ROLLBACK : R O L L B A C K ;
K_ROLLUP : R O L L U P ;
K_ROUTINE : R O U T I N E ;
K_ROUTINE_CATALOG : R O U T I N E '_' C A T A L O G ;
K_ROUTINE_NAME : R O U T I N E '_' N A M E ;
K_ROUTINE_SCHEMA : R O U T I N E '_' S C H E M A ;
K_ROW : R O W ;
K_ROWS : R O W S ;
K_ROW_COUNT : R O W '_' C O U N T ;
K_ROW_NUMBER : R O W '_' N U M B E R ;
K_RULE : R U L E ;
K_SAVEPOINT : S A V E P O I N T ;
K_SCALE : S C A L E ;
K_SCHEMA : S C H E M A ;
K_SCHEMA_NAME : S C H E M A '_' N A M E ;
K_SCOPE : S C O P E ;
K_SCOPE_CATALOG : S C O P E '_' C A T A L O G ;
K_SCOPE_NAME : S C O P E '_' N A M E ;
K_SCOPE_SCHEMA : S C O P E '_' S C H E M A ;
K_SCROLL : S C R O L L ;
K_SEARCH : S E A R C H ;
K_SECOND : S E C O N D ;
K_SECTION : S E C T I O N ;
K_SECURITY : S E C U R I T Y ;
K_SELECT : S E L E C T ;
K_SELECTIVE : S E L E C T I V E ;
K_SELF : S E L F ;
K_SENSITIVE : S E N S I T I V E ;
K_SEQUENCE : S E Q U E N C E ;
K_SEQUENCES : S E Q U E N C E S ;
K_SERIALIZABLE : S E R I A L I Z A B L E ;
K_SERVER : S E R V E R ;
K_SERVER_NAME : S E R V E R '_' N A M E ;
K_SESSION : S E S S I O N ;
K_SESSION_USER : S E S S I O N '_' U S E R ;
K_SET : S E T ;
K_SETOF : S E T O F ;
K_SETS : S E T S ;
K_SHARE : S H A R E ;
K_SHOW : S H O W ;
K_SIMILAR : S I M I L A R ;
K_SIMPLE : S I M P L E ;
K_SIZE : S I Z E ;
K_SKIP : S K I P ;
K_SMALLINT : S M A L L I N T ;
K_SNAPSHOT : S N A P S H O T ;
K_SOME : S O M E ;
K_SOURCE : S O U R C E ;
K_SPACE : S P A C E ;
K_SPECIFIC : S P E C I F I C ;
K_SPECIFICTYPE : S P E C I F I C T Y P E ;
K_SPECIFIC_NAME : S P E C I F I C '_' N A M E ;
K_SQL : S Q L ;
K_SQLCODE : S Q L C O D E ;
K_SQLERROR : S Q L E R R O R ;
K_SQLEXCEPTION : S Q L E X C E P T I O N ;
K_SQLSTATE : S Q L S T A T E ;
K_SQLWARNING : S Q L W A R N I N G ;
K_SQRT : S Q R T ;
K_STABLE : S T A B L E ;
K_STANDALONE : S T A N D A L O N E ;
K_START : S T A R T ;
K_STATE : S T A T E ;
K_STATEMENT : S T A T E M E N T ;
K_STATIC : S T A T I C ;
K_STATISTICS : S T A T I S T I C S ;
K_STDDEV_POP : S T D D E V '_' P O P ;
K_STDDEV_SAMP : S T D D E V '_' S A M P ;
K_STDIN : S T D I N ;
K_STDOUT : S T D O U T ;
K_STORAGE : S T O R A G E ;
K_STRICT : S T R I C T ;
K_STRIP : S T R I P ;
K_STRUCTURE : S T R U C T U R E ;
K_STYLE : S T Y L E ;
K_SUBCLASS_ORIGIN : S U B C L A S S '_' O R I G I N ;
K_SUBMULTISET : S U B M U L T I S E T ;
K_SUBSTRING : S U B S T R I N G ;
K_SUBSTRING_REGEX : S U B S T R I N G '_' R E G E X ;
K_SUCCEEDS : S U C C E E D S ;
K_SUM : S U M ;
K_SYMMETRIC : S Y M M E T R I C ;
K_SYSID : S Y S I D ;
K_SYSTEM : S Y S T E M ;
K_SYSTEM_TIME : S Y S T E M '_' T I M E ;
K_SYSTEM_USER : S Y S T E M '_' U S E R ;
K_T : T ;
K_TABLE : T A B L E ;
K_TABLES : T A B L E S ;
K_TABLESAMPLE : T A B L E S A M P L E ;
K_TABLESPACE : T A B L E S P A C E ;
K_TABLE_NAME : T A B L E '_' N A M E ;
K_TEMP : T E M P ;
K_TEMPLATE : T E M P L A T E ;
K_TEMPORARY : T E M P O R A R Y ;
K_TEXT : T E X T ;
K_THEN : T H E N ;
K_TIES : T I E S ;
K_TIME : T I M E ;
K_TIMESTAMP : T I M E S T A M P ;
K_TIMEZONE_HOUR : T I M E Z O N E '_' H O U R ;
K_TIMEZONE_MINUTE : T I M E Z O N E '_' M I N U T E ;
K_TO : T O ;
K_TOKEN : T O K E N ;
K_TOP_LEVEL_COUNT : T O P '_' L E V E L '_' C O U N T ;
K_TRAILING : T R A I L I N G ;
K_TRANSACTION : T R A N S A C T I O N ;
K_TRANSACTIONS_COMMITTED : T R A N S A C T I O N S '_' C O M M I T T E D ;
K_TRANSACTIONS_ROLLED_BACK : T R A N S A C T I O N S '_' R O L L E D '_' B A C K ;
K_TRANSACTION_ACTIVE : T R A N S A C T I O N '_' A C T I V E ;
K_TRANSFORM : T R A N S F O R M ;
K_TRANSFORMS : T R A N S F O R M S ;
K_TRANSLATE : T R A N S L A T E ;
K_TRANSLATE_REGEX : T R A N S L A T E '_' R E G E X ;
K_TRANSLATION : T R A N S L A T I O N ;
K_TREAT : T R E A T ;
K_TRIGGER : T R I G G E R ;
K_TRIGGER_CATALOG : T R I G G E R '_' C A T A L O G ;
K_TRIGGER_NAME : T R I G G E R '_' N A M E ;
K_TRIGGER_SCHEMA : T R I G G E R '_' S C H E M A ;
K_TRIM : T R I M ;
K_TRIM_ARRAY : T R I M '_' A R R A Y ;
K_TRUE : T R U E ;
K_TRUNCATE : T R U N C A T E ;
K_TRUSTED : T R U S T E D ;
K_TYPE : T Y P E ;
K_TYPES : T Y P E S ;
K_UESCAPE : U E S C A P E ;
K_UNBOUNDED : U N B O U N D E D ;
K_UNCOMMITTED : U N C O M M I T T E D ;
K_UNDER : U N D E R ;
K_UNENCRYPTED : U N E N C R Y P T E D ;
K_UNION : U N I O N ;
K_UNIQUE : U N I Q U E ;
K_UNKNOWN : U N K N O W N ;
K_UNLINK : U N L I N K ;
K_UNLISTEN : U N L I S T E N ;
K_UNLOGGED : U N L O G G E D ;
K_UNNAMED : U N N A M E D ;
K_UNNEST : U N N E S T ;
K_UNTIL : U N T I L ;
K_UNTYPED : U N T Y P E D ;
K_UPDATE : U P D A T E ;
K_UPPER : U P P E R ;
K_URI : U R I ;
K_USAGE : U S A G E ;
K_USER : U S E R ;
K_USER_DEFINED_TYPE_CATALOG : U S E R '_' D E F I N E D '_' T Y P E '_' C A T A L O G ;
K_USER_DEFINED_TYPE_CODE : U S E R '_' D E F I N E D '_' T Y P E '_' C O D E ;
K_USER_DEFINED_TYPE_NAME : U S E R '_' D E F I N E D '_' T Y P E '_' N A M E ;
K_USER_DEFINED_TYPE_SCHEMA : U S E R '_' D E F I N E D '_' T Y P E '_' S C H E M A ;
K_USING : U S I N G ;
K_VACUUM : V A C U U M ;
K_VALID : V A L I D ;
K_VALIDATE : V A L I D A T E ;
K_VALIDATOR : V A L I D A T O R ;
K_VALUE : V A L U E ;
K_VALUES : V A L U E S ;
K_VALUE_OF : V A L U E '_' O F ;
K_VARBINARY : V A R B I N A R Y ;
K_VARCHAR : V A R C H A R ;
K_VARIADIC : V A R I A D I C ;
K_VARYING : V A R Y I N G ;
K_VAR_POP : V A R '_' P O P ;
K_VAR_SAMP : V A R '_' S A M P ;
K_VERBOSE : V E R B O S E ;
K_VERSION : V E R S I O N ;
K_VERSIONING : V E R S I O N I N G ;
K_VIEW : V I E W ;
K_VIEWS : V I E W S ;
K_VOLATILE : V O L A T I L E ;
K_WHEN : W H E N ;
K_WHENEVER : W H E N E V E R ;
K_WHERE : W H E R E ;
K_WHITESPACE : W H I T E S P A C E ;
K_WIDTH_BUCKET : W I D T H '_' B U C K E T ;
K_WINDOW : W I N D O W ;
K_WITH : W I T H ;
K_WITHIN : W I T H I N ;
K_WITHOUT : W I T H O U T ;
K_WORK : W O R K ;
K_WRAPPER : W R A P P E R ;
K_WRITE : W R I T E ;
K_XML : X M L ;
K_XMLAGG : X M L A G G ;
K_XMLATTRIBUTES : X M L A T T R I B U T E S ;
K_XMLBINARY : X M L B I N A R Y ;
K_XMLCAST : X M L C A S T ;
K_XMLCOMMENT : X M L C O M M E N T ;
K_XMLCONCAT : X M L C O N C A T ;
K_XMLDECLARATION : X M L D E C L A R A T I O N ;
K_XMLDOCUMENT : X M L D O C U M E N T ;
K_XMLELEMENT : X M L E L E M E N T ;
K_XMLEXISTS : X M L E X I S T S ;
K_XMLFOREST : X M L F O R E S T ;
K_XMLITERATE : X M L I T E R A T E ;
K_XMLNAMESPACES : X M L N A M E S P A C E S ;
K_XMLPARSE : X M L P A R S E ;
K_XMLPI : X M L P I ;
K_XMLQUERY : X M L Q U E R Y ;
K_XMLROOT : X M L R O O T ;
K_XMLSCHEMA : X M L S C H E M A ;
K_XMLSERIALIZE : X M L S E R I A L I Z E ;
K_XMLTABLE : X M L T A B L E ;
K_XMLTEXT : X M L T E X T ;
K_XMLVALIDATE : X M L V A L I D A T E ;
K_YEAR : Y E A R ;
K_YES : Y E S ;
K_ZONE : Z O N E ;

/* custom keyword */
K_SERIAL : S E R I A L ;
K_BIGSERIAL : B I G S E R I A L ;
K_SMALLSERIAL : S M A L L S E R I A L ;


HEX_VALUE:
  X '\'' [0-9A-Fa-f]*   '\''
  | '0x' [0-9A-Fa-f]+
  ;

BIT_VALUE:
  B '\'' [01]* '\''
  | '0b' [01]+
;

SCIENTIFIC_VALUE:
  '.' DIGIT+   E [-+]? DIGIT+
  | DIGIT+  ('.' DIGIT*)?   E [-+]? DIGIT+
  ;

FLOAT_VALUE:
  DIGIT+  '.' DIGIT*
   | '.' DIGIT+
  ;

INTEGER_VALUE :
   DIGIT+
   ;


QUOTED_STRING:
  '\'' ( ~'\'' | '\'\'' | '\\\'' )* '\''
 ;

UNICODE_ESCAPED_STRING:
  U '&' '\'' ( ~'\'' | '\'\'' | '\\\'' )* '\''
  ;

QUOTED_IDENTIFIER:
  '"' (~'"' | '""' | '\\\"')* '"' ;

UNICODE_ESCAPED_IDENTIFIER:
  U '&' '"' (~'"' | '""' | '\\\"')* '"' ;
  

UNDERLINE_STARTED_IDENTIFIER:
  '_' [a-zA-Z$_0-9]*
  ;

UNQUOTED_IDENTIFIER:
 [a-zA-Z][a-zA-Z$_0-9]*
 ;

SINGLE_LINE_COMMENT
 : '--'  ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

OPERATOR:
 ('+'|'-'|'*'|'/'|'<'|'>'|'='|'~'|'!'|'@'|'#'|'%'|'^'|'&'|'`'|'?')+
 ;


fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
