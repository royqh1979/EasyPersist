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
grammar MySQL;

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
   | set_stmt
   | use_stmt
)
 ;

set_stmt:
 K_SET variable_assignment (',' variable_assignment)*
 | K_SET K_ONE_SHOT system_var_name = expr
 ;

 variable_assignment:
       user_var_name '=' expr
    /* | param_name '=' expr */
     | var_name '=' expr
     | (K_GLOBAL | K_SESSION)
         var_name '=' expr
     | ('@@global.' | '@@session.' | '@@')
         var_name '=' expr
         ;

user_var_name:
  '@' var_name
  ;

var_name:
    UNQUOTED_IDENTIFIER
  ;

use_stmt :
 K_USE database_name;

create_index_stmt
  : K_CREATE (K_ONLINE|K_OFFLINE)? (K_UNIQUE|K_FULLTEXT|K_SPATIAL)? K_INDEX index_name
       (index_type)?
       K_ON table_name '('index_col_name (',' index_col_name)* ')'
       (index_option)?
       (algorithm_option | lock_option)*
   ;

algorithm_option:
    K_ALGORITHM '=' (K_DEFAULT|K_INPLACE|K_COPY)
    ;

K_INPLACE: I N P L A C E ;
K_COPY : C O P Y ;
lock_option:
    K_LOCK '=' (K_DEFAULT|K_NONE|K_SHARED|K_EXCLUSIVE)
  ;

K_SHARED : S H A R E D ;
K_EXCLUSIVE : E X C L U S I V E ;

drop_index_stmt:
    K_DROP K_INDEX (K_ONLINE|K_OFFLINE)? index_name K_ON table_name
    (algorithm_option | lock_option)?
    ;

drop_table_stmt:
    K_DROP (K_TEMPORARY)? K_TABLE ( K_IF K_EXISTS )?
    table_name (',' table_name)*
    (K_RESTRICT | K_CASCADE)?
    ;

drop_view_stmt:
    K_DROP K_VIEW ( K_IF K_EXISTS )?
    view_name (',' view_name)*
    (K_RESTRICT | K_CASCADE)?
    ;


create_table_stmt
 : K_CREATE ( K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
   table_name
    '(' create_definition (',' create_definition)* ')'
    (table_options)? (partition_options)?                                # CreateTableStmt
   | K_CREATE ( K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
        table_name
         '(' create_definition (',' create_definition)* ')'
         (table_options)? (partition_options)?
          ( K_IGNORE | K_REPLACE)? (K_AS)?
         select_stmt                              # CreateTableSelectStmt
   | K_CREATE ( K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
        table_name
       ( (K_LIKE table_name) | ('('K_LIKE table_name ')') )              # CreateTableLikeStmt
 ;

 partition_options:
     K_PARTITION K_BY partition_type
     (K_PARTITIONS value)?
     (
        K_SUBPARTITION K_BY  sub_partition_type (K_PARTITIONS value)?
     )?
     ( '(' partition_definition (',' partition_definition)* ')') ?
     ;
partition_type:
      (K_LINEAR)? K_HASH '('expr')'
      |  (K_LINEAR)? K_KEY (K_ALGORITHM '=' value)? '('column_list')'
      |  K_RANGE ('('expr')' | K_COLUMNS '('column_list')')
      |  K_LIST( '('expr')' | K_COLUMNS'('column_list')' )
        ;

sub_partition_type:
      (K_LINEAR)? K_HASH '('expr')'
    |  (K_LINEAR)? K_KEY (K_ALGORITHM '=' value)? '('column_list')'
    ;

 partition_definition:
     K_PARTITION partition_name
         ( K_VALUES
             ( K_LESS K_THAN ( '(' (expr | value_list) ')' | K_MAXVALUE)
              | K_IN '(' value_list ')' )
         )?
         partition_option*
         ( '(' subpartition_definition (',' subpartition_definition)* ')')?
     ;
partition_option:
     K_STORAGE? K_ENGINE '='? engine_name
     | K_COMMENT '='? string_literal
     | K_DATA K_DIRECTORY '='? string_literal
     | K_INDEX K_DIRECTORY '='? string_literal
     | K_MAX_ROWS '='? value
     | K_MIN_ROWS '='? value
     | K_TABLESPACE '='? tablespace_name
     | K_NODEGROUP '='? identifier
     ;


 subpartition_definition:
     K_SUBPARTITION partition_name
         partition_option*
      ;

partition_name:
      identifier;
tablespace_name: identifier;

value_list:
    '(' literal_value_list ')' (',' '(' literal_value_list ')')*
    | literal_value_list
    ;
literal_value_list:
    (K_MAXVALUE | literal_value  ) (',' ( K_MAXVALUE | literal_value ))*
    ;

create_view_stmt
 : K_CREATE (K_OR K_REPLACE)?
     (K_ALGORITHM '=' (K_UNDEFINED | K_MERGE | K_TEMPTABLE))?
     (K_DEFINER '=' ( user | K_CURRENT_USER ))?
     (K_SQL K_SECURITY ( K_DEFINER | K_INVOKER ))?
     K_VIEW view_name ('(' column_list ')')?
     K_AS select_stmt
     ( K_WITH (K_CASCADED | K_LOCAL)? K_CHECK K_OPTION)?
     ;

delete_stmt:
    K_DELETE (K_LOW_PRIORITY)?  (K_QUICK)? (K_IGNORE)? K_FROM table_name
    (K_WHERE expr)?
    order_by_clause
    ;

insert_stmt:
     insert_first_part
        ( K_VALUES | K_VALUE)? insert_value_list (',' insert_value_list)*
        insert_dup_key_update_part?
    | insert_first_part
        select_stmt
        insert_dup_key_update_part?
    | insert_first_part
        K_SET column_name '=' (expr | K_DEFAULT) (',' column_name '=' (expr | K_DEFAULT) )*
      insert_dup_key_update_part?
      ;

insert_first_part:
      K_INSERT
          (K_LOW_PRIORITY | K_LOW_PRIORITY | K_DELAYED )?  (K_IGNORE)?
         (K_INTO)? table_name ( '('column_list')')?
          (K_PARTITION '(' partition_names')')?
    ;

insert_dup_key_update_part:
    K_ON K_DUPLICATE K_KEY K_UPDATE
          column_name '=' expr (',' column_name '=' expr)*
    ;

insert_value_list:
     '(' (expr | K_DEFAULT) ( ',' (expr | K_DEFAULT))* ')'
      ;

update_stmt:
      K_UPDATE (K_LOW_PRIORITY)?  (K_IGNORE)? table_reference
          K_SET column_name '=' (expr | K_DEFAULT) (',' column_name '=' (expr | K_DEFAULT))*
          (K_WHERE expr)?
          order_by_clause
  ;

select_stmt:
      select_stmt ( K_UNION ( K_ALL | K_DISTINCT)? select_stmt)+      #SelectUnion
    | '(' select_stmt ')' ( K_UNION ( K_ALL | K_DISTINCT)? '(' select_stmt ')' )+
             order_by_clause? #EnclosedSelect
    |  K_SELECT (select_option)*
          select_expr (',' select_expr )*
          (
             (select_into_clause  select_from_clause?)
             | (select_from_clause select_into_clause?)
          )?
          ( K_PROCEDURE procedure_name'(' procedure_list ')')?
          ( (K_FOR K_UPDATE) | (K_LOCK K_IN K_SHARE K_MODE))?              #Select
    ;

order_by_clause:
    K_ORDER K_BY ((column_name | expr | position) (K_ASC | K_DESC)?)
                                      ( ',' (column_name | expr | position) (K_ASC | K_DESC)?)*
                 ( K_LIMIT  ((  (offset ',')? row_count )| (row_count K_OFFSET offset) ) )? ;

procedure_name:
    keyword | identifier
    ;

procedure_list:
    expr (',' expr)*
;

select_option:
       (K_ALL | K_DISTINCT | K_DISTINCTROW)
     | K_HIGH_PRIORITY
     | K_STRAIGHT_JOIN
     | (K_SQL_SMALL_RESULT | K_SQL_BIG_RESULT | K_SQL_BUFFER_RESULT )
     | (K_SQL_CACHE | K_SQL_NO_CACHE)
     | (K_SQL_CALC_FOUND_ROWS)
    ;

select_from_clause:
     K_FROM table_references
      /*( K_PARTITION partition_list )? */
      (K_WHERE expr)?
      (K_GROUP K_BY ((column_name | expr | position) (K_ASC | K_DESC)?)
        (',' (column_name | expr | position) (K_ASC | K_DESC)?)* (K_WITH K_ROLLUP)? )?
      ( K_HAVING expr )?
      order_by_clause?
    ;

select_into_clause:
      K_INTO variable_list
    | K_INTO K_OUTFILE string_literal
    | K_INTO K_DUMPFILE string_literal  ;

variable_list:
    user_var_name (',' user_var_name)*
    ;

position: INTEGER_VALUE;
offset: INTEGER_VALUE;
row_count: INTEGER_VALUE;

select_expr
   : (expr | '*') ( K_AS alias_name )?
    ;

table_references:
    escaped_table_reference (',' escaped_table_reference )*
    ;

escaped_table_reference:
    table_reference
  | '{' K_OJ table_reference '}'
  ;

table_reference:
    table_factor
  | join_table
  |  table_reference (K_LEFT|K_RIGHT)? (K_OUTER)? K_JOIN table_reference join_condition
  ;

table_factor:
    table_name  (K_PARTITION '('partition_names')' )?
        (K_AS? alias_name)? (index_hint_list)?
  | select_stmt K_AS? alias_name
  | '(' select_stmt ')' K_AS? alias_name
  | '(' table_references ')'
  ;

partition_names:
  partition_name ( ',' partition_name)*
  ;

join_table:
    table_factor (join_right_part)*
    ;

join_right_part:
    ( K_INNER | K_CROSS)? K_JOIN table_factor (join_condition)?
  | K_STRAIGHT_JOIN table_factor
  | K_STRAIGHT_JOIN table_factor K_ON expr
  | K_NATURAL ((K_LEFT|K_RIGHT) K_OUTER?)? K_JOIN table_factor
  ;

join_condition:
    K_ON expr
  | K_USING '('column_list')'
  ;

index_hint_list:
    index_hint (',' index_hint)*
    ;

index_hint:
    K_USE (K_INDEX|K_KEY)
      (K_FOR (K_JOIN|K_ORDER K_BY|K_GROUP K_BY))? '('index_list?')'
  | K_IGNORE (K_INDEX|K_KEY)
      (K_FOR (K_JOIN|K_ORDER K_BY|K_GROUP K_BY))? '('index_list?')'
  | K_FORCE (K_INDEX|K_KEY)
      (K_FOR (K_JOIN|K_ORDER K_BY|K_GROUP K_BY))? '('index_list?')'
  ;

index_list:
    index_name (',' index_name)*
    ;

user: string_literal;

column_list:
     column_name (',' column_name) *
     ;

view_name: identifier;

create_definition
 : column_name column_definition                                      # ColumnDef
   | ((K_CONSTRAINT)? symbol)? K_PRIMARY K_KEY (index_type)?
     '(' index_col_name (',' index_col_name)* ')' (index_option)*    # PrimaryKeyDef
   | ( K_INDEX | K_KEY) (index_name)? (index_type)?
      '(' index_col_name (',' index_col_name)* ')' (index_option)*   # IndexDef
   | ((K_CONSTRAINT)? symbol)? K_UNIQUE (K_INDEX|K_KEY)? (index_name)?  (index_type)?
          '(' index_col_name (',' index_col_name)* ')' (index_option)*     #UniqueDef
   | K_FULLTEXT ( K_INDEX | K_KEY)? (index_name)?
           '(' index_col_name (',' index_col_name)* ')' (index_option)*   # FullTextIndexDef
   | K_SPATIAL  ( K_INDEX | K_KEY)? (index_name)?
           '(' index_col_name (',' index_col_name)* ')' (index_option)*   # SpacialIndexDef
   | ((K_CONSTRAINT)? symbol)? K_FOREIGN K_KEY (index_name)?
               '(' index_col_name (',' index_col_name)* ')' reference_definition   # ForeignKeyDef
   | K_CHECK '(' expr ')'  # CheckDef
  ;

column_definition
 : data_type column_attribute* column_reference_definition?
 ;

column_reference_definition:
   K_REFERENCES table_name '(' index_col_name ')'
     reference_option*
   ;

column_attribute:
     K_NOT? K_NULL
   | K_AUTO_INCREMENT
   | K_UNIQUE K_KEY?
   | K_PRIMARY? K_KEY
   | K_DEFAULT literal_value
   | K_COMMENT string_literal
   | K_COLUMN K_FORMAT (K_FIXED | K_DYNAMIC | K_DEFAULT)
   | K_STORAGE (K_DISK | K_MEMORY | K_DEFAULT)
   | K_COLLATE collation_name
   | K_ON K_UPDATE date_literal
  ;


data_type:
    K_BIT ('(' length ')')?                                                 #BitType
  | K_BOOL                                                                  #BoolType
  | K_BOOLEAN                                                               #BooleanType
  | K_TINYINT ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?               #TinyIntType
  | K_SMALLINT ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?              #SmallIntType
  | K_MEDIUMINT ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?             #MediumIntType
  | K_INT ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?                   #IntType
  | K_INTEGER ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?               #IntegerType
  | K_BIGINT ('(' length ')')?  (K_UNSIGNED)? (K_ZEROFILL)?                #BigIntType
  | K_REAL ('(' length ',' decimals ')')?  (K_UNSIGNED)? (K_ZEROFILL)?     #RealType
  | K_DOUBLE ('(' length ',' decimals ')')?  (K_UNSIGNED)? (K_ZEROFILL)?   #DoubleType
  | K_FLOAT ('(' length ',' decimals ')')?  (K_UNSIGNED)? (K_ZEROFILL)?    #FloatType
  | K_DECIMAL ('(' length ',' decimals ')')?  (K_UNSIGNED)? (K_ZEROFILL)?  #DecimalType
  | K_NUMERIC ('(' length ',' decimals ')')?  (K_UNSIGNED)? (K_ZEROFILL)?  #NumericType
  | K_DATE                                                                  #DateType
  | K_TIME                                                                  #TimeType
  | K_TIMESTAMP                                                             #TimeStampType
  | K_DATETIME                                                              #DateTimeType
  | K_YEAR                                                                  #YearType
  | K_CHAR ('(' length ')')? ( K_BINARY )?
      (K_CHARACTER K_SET charset_name)?                                     #CharType
  | K_VARCHAR ('(' length ')')? ( K_BINARY )?
                   (K_CHARACTER K_SET charset_name)?                        #VarcharType
  | K_BINARY ('(' length ')')?                                                      #BinaryType
  | K_VARBINARY ('(' length ')')?                                                   #VarBinaryType
  | K_TINYBLOB                                                                       #TinyBlobType
  | K_BLOB                                                                           #BlobType
  | K_MEDIUMBLOB                                                                     #MediumBlobType
  | K_LONGBLOB                                                                       #LongBlobType
  | K_TINYTEXT ( K_BINARY )?
    (K_CHARACTER K_SET charset_name)?                                                  #TinyTextType
  | K_TEXT  ( K_BINARY )?
    (K_CHARACTER K_SET charset_name)?                                                 #TextType
  | K_MEDIUMTEXT ( K_BINARY )?
    (K_CHARACTER K_SET charset_name)?                                                  #MediumTextType
  | K_LONGTEXT ( K_BINARY )?
    (K_CHARACTER K_SET charset_name)?                                                  #LongTextType
  | K_ENUM '(' string_literal (',' string_literal )? ')'
    (K_CHARACTER K_SET charset_name)?                                              #EnumType
  | K_SET '(' string_literal (',' string_literal )? ')'
    (K_CHARACTER K_SET charset_name)?                                                  #SetType
    /*  | spatial_type */
  ;

index_col_name:
  column_name ('(' length ')')? ( K_ASC | K_DESC )?
  ;
index_type:
  K_USING ( K_BTREE | K_HASH )
  ;

index_option:
  K_KEY_BLOCK_SIZE ('=')? value
  | index_type
  | K_WITH K_PARSER parser_name
  | K_COMMENT string_literal
  ;

reference_definition:
  K_REFERENCES table_name '(' index_col_name (',' index_col_name)* ')'
    reference_option*;

reference_option:
     K_MATCH (K_FULL | K_PARTIAL | K_SIMPLE )
    | K_ON K_DELETE on_delete_action
    | K_ON K_UPDATE on_update_action
    ;

on_delete_action: action;

on_update_action: action;

action:
  K_RESTRICT
  | K_CASCADE
  | K_SET K_NULL
  | K_NO K_ACTION
  ;

table_options:
  table_option ( (',')? table_option )*
  ;

table_option:
    K_ENGINE '='? engine_name
  | K_AUTO_INCREMENT '='? value
  | K_AVG_ROW_LENGTH '='? value
  | (K_DEFAULT)? ( K_CHARACTER K_SET | K_CHARSET ) '='? charset_name
  | K_CHECKSUM '=' ( value )
  | (K_DEFAULT)? K_COLLATE '='? collation_name
  | K_COMMENT '='? string_literal
  | K_CONNECTION '='? string_literal
  | K_DATA K_DIRECTORY '='? string_literal
  | K_DELAY_KEY_WRITE '='? ( value )
  | K_INDEX K_DIRECTORY '='? string_literal
  | K_INSERT_METHOD '='? ( K_NO | K_FIRST | K_LAST )
  | K_KEY_BLOCK_SIZE '='? value
  | K_MAX_ROWS '='? value
  | K_MIN_ROWS '='? value
  | K_PACK_KEYS '='? (value | K_DEFAULT)
  | K_PASSWORD '='? string_literal
  | K_ROW_FORMAT '='? ( K_DEFAULT | K_DYNAMIC | K_FIXED | K_COMPRESSED | K_REDUNDANT | K_COMPACT)
  | K_STATS_AUTO_RECALC '='? (value | K_DEFAULT)
  | K_STATS_PERSISTENT '='? (value | K_DEFAULT)
  | K_STATS_SAMPLE_PAGES '='? value
  | K_TABLESPACE tablespace_name (K_STORAGE (K_DISK | K_MEMORY | K_DEFAULT) )?
  | K_UNION '='? '(' table_name (',' table_name)* ')'
   ;
charset_name: identifier | string_literal;
collation_name : identifier | string_literal;
engine_name :     identifier | string_literal | keyword;
parser_name : identifier | string_literal;
function_name : identifier | keyword ;
database_name :  identifier;



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
expr
  :
   (comparison_expr | is_expr |  like_expr | regexp_expr | in_expr) # Compare
  | ( case_expr | between_expr ) # CaseBetween
  | cast_expr # Cast
  | ( K_NOT | '!' )  expr       # Not
  | expr (K_AND | '&&' ) expr   # And
  | expr K_XOR expr              # Xor
  |  expr ( K_OR | '||') expr    # Or
  | bit_expr # BitExpr
  ;

cast_expr:
  K_CAST '(' expr K_AS data_type ')'
  ;

between_expr:
  bit_expr (K_NOT)? K_BETWEEN bit_expr K_AND bit_expr
  ;

comparison_expr:
   bit_expr comparison_operator bit_expr
   | bit_expr comparison_operator (K_ALL | K_ANY) '('select_stmt')' ;

in_expr:
    bit_expr (K_NOT)? K_IN '('select_stmt')'
  | bit_expr (K_NOT)? K_IN '('expr (',' expr)? ')'
     ;

regexp_expr:
  bit_expr (K_NOT)? K_REGEXP bit_expr
     ;

comparison_operator
  : '=' | '>=' | '>' | '<=' | '<' | '<>' | '!=' | '<=>'
  ;

is_expr:
  simple_expr K_IS (K_NOT)? (K_TRUE | K_FALSE | K_UNKNOWN | K_NULL)
  ;

like_expr:
   bit_expr K_SOUNDS K_LIKE bit_expr
  | bit_expr (K_NOT)? K_LIKE simple_expr ( K_ESCAPE simple_expr)?
  ;



bit_expr:
      bit_expr '^' bit_expr
     | bit_expr ('*' | '/' | 'DIV' | 'MOD' | '%' ) bit_expr
     | bit_expr ( '+' | '-' ) bit_expr
     | bit_expr ( '<<' | '>>' ) bit_expr
     | bit_expr '&' bit_expr
     | bit_expr '|' bit_expr
     | simple_expr
     ;

simple_expr:
    literal_value
  | function_call
  | var_name
  | user_var_name
  | (table_name '.')? column_name
  | '?'
  | '(' expr (',' expr)? ')'
  | '(' select_stmt ')'
  | interval_expr
  | (K_BINARY simple_expr)
  | simple_expr K_COLLATE collation_name
  | '!' simple_expr
  | ( '~'| '-' | '+') simple_expr
  | K_ROW '(' expr (',' expr)? ')'
  | K_EXISTS '('select_stmt')'
  | '{' identifier expr '}'
  ;
  /*| match_expr */

case_expr
  : K_CASE expr K_WHEN literal_value K_THEN expr
    (K_WHEN literal_value K_THEN expr)*
    (K_ELSE expr)?
    K_END
  | K_CASE K_WHEN expr K_THEN expr
    ( K_WHEN expr K_THEN expr)*
    (K_ELSE expr)?
    K_END
  ;

function_call:
   function_name '(' ')'
   | function_name '(' expr (',' expr)* ')'
  ;

interval_expr:
  K_INTERVAL expr time_unit;

time_unit:
    K_MICROSECOND
    | K_SECOND
    | K_MINUTE
    | K_HOUR
    | K_DAY
    | K_WEEK
    | K_MONTH
    | K_QUARTER
    | K_YEAR
    | K_SECOND_MICROSECOND
    | K_MINUTE_MICROSECOND
    | K_MINUTE_SECOND
    | K_HOUR_MICROSECOND
    | K_HOUR_MINUTE
    | K_HOUR_SECOND
    | K_DAY_MICROSECOND
    | K_DAY_SECOND
    | K_DAY_MINUTE
    | K_DAY_HOUR
    | K_YEAR_MONTH
    ;


literal_value
 :
 numeric_literal   # Number
 | string_literal  # String
 | date_literal # Date
 | K_NULL # Null
 | ( K_TRUE | K_FALSE ) # Boolean
 | hex_literal # Hex
 | bit_literal # Bit
 ;

numeric_literal:
 INTEGER_VALUE
 | FLOAT_VALUE
 | SCIENTIFIC_VALUE
 ;

string_literal:
 DOUBLE_QUOTED_STRING
 | (underlinestarted_charset_name)? SINGLE_QUOTED_STRING ( K_COLLATE collation_name)?
 | 'N' SINGLE_QUOTED_STRING
 ;

bit_literal:
 (underlinestarted_charset_name)? BIT_VALUE (K_COLLATE collation_name)
 ;
hex_literal:
 (underlinestarted_charset_name) HEX_VALUE (K_COLLATE collation_name)
 ;

underlinestarted_charset_name:
    UNDERLINE_STARTED_IDENTIFIER;

date_literal:
  (K_DATE | K_TIME | K_TIMESTAMP ) string_literal
   | '{' ( identifier ) string_literal '}'
   | K_CURRENT_DATE
   | K_CURRENT_TIME
   | K_CURRENT_TIMESTAMP
   ;



alias_name
 : identifier | keyword
 ;

keyword
 : K_ACCESSIBLE
| K_ACTION
| K_ADD
| K_AFTER
| K_AGAINST
| K_AGGREGATE
| K_ALGORITHM
| K_ALL
| K_ALTER
| K_ANALYZE
| K_AND
| K_ANY
| K_AS
| K_ASC
| K_ASCII
| K_ASENSITIVE
| K_AT
| K_AUTHORS
| K_AUTOEXTEND_SIZE
| K_AUTO_INCREMENT
| K_AVG
| K_AVG_ROW_LENGTH
| K_BACKUP
| K_BEFORE
| K_BEGIN
| K_BETWEEN
| K_BIGINT
| K_BINARY
| K_BINLOG
| K_BIT
| K_BLOB
| K_BLOCK
| K_BOOL
| K_BOOLEAN
| K_BOTH
| K_BTREE
| K_BY
| K_BYTE
| K_CACHE
| K_CALL
| K_CASCADE
| K_CASCADED
| K_CASE
| K_CATALOG_NAME
| K_CHAIN
| K_CHANGE
| K_CHANGED
| K_CHAR
| K_CHARACTER
| K_CHARSET
| K_CHECK
| K_CHECKSUM
| K_CIPHER
| K_CLASS_ORIGIN
| K_CLIENT
| K_CLOSE
| K_COALESCE
| K_CODE
| K_COLLATE
| K_COLLATION
| K_COLUMN
| K_COLUMNS
| K_COLUMN_NAME
| K_COMMENT
| K_COMMIT
| K_COMMITTED
| K_COMPACT
| K_COMPLETION
| K_COMPRESSED
| K_CONCURRENT
| K_CONDITION
| K_CONNECTION
| K_CONSISTENT
| K_CONSTRAINT
| K_CONSTRAINT_CATALOG
| K_CONSTRAINT_NAME
| K_CONSTRAINT_SCHEMA
| K_CONTAINS
| K_CONTEXT
| K_CONTINUE
| K_CONTRIBUTORS
| K_CONVERT
| K_CPU
| K_CREATE
| K_CROSS
| K_CUBE
| K_CURRENT_DATE
| K_CURRENT_TIME
| K_CURRENT_TIMESTAMP
| K_CURRENT_USER
| K_CURSOR
| K_CURSOR_NAME
| K_DATA
| K_DATABASE
| K_DATABASES
| K_DATAFILE
| K_DATE
| K_DATETIME
| K_DAY
| K_DAY_HOUR
| K_DAY_MICROSECOND
| K_DAY_MINUTE
| K_DAY_SECOND
| K_DEALLOCATE
| K_DEC
| K_DECIMAL
| K_DECLARE
| K_DEFAULT
| K_DEFINER
| K_DELAYED
| K_DELAY_KEY_WRITE
| K_DELETE
| K_DESC
| K_DESCRIBE
| K_DES_KEY_FILE
| K_DETERMINISTIC
| K_DIRECTORY
| K_DISABLE
| K_DISCARD
| K_DISK
| K_DISTINCT
| K_DISTINCTROW
| K_DIV
| K_DO
| K_DOUBLE
| K_DROP
| K_DUAL
| K_DUMPFILE
| K_DUPLICATE
| K_DYNAMIC
| K_EACH
| K_ELSE
| K_ELSEIF
| K_ENABLE
| K_ENCLOSED
| K_END
| K_ENDS
| K_ENGINE
| K_ENGINES
| K_ENUM
| K_ERROR
| K_ERRORS
| K_ESCAPE
| K_ESCAPED
| K_EVENT
| K_EVENTS
| K_EVERY
| K_EXECUTE
| K_EXISTS
| K_EXIT
| K_EXPANSION
| K_EXPLAIN
| K_EXTENDED
| K_EXTENT_SIZE
| K_FALSE
| K_FAST
| K_FAULTS
| K_FETCH
| K_FIELDS
| K_FILE
| K_FIRST
| K_FIXED
| K_FLOAT
| K_FLOAT
| K_FLOAT
| K_FLUSH
| K_FOR
| K_FORCE
| K_FOREIGN
| K_FOUND
| K_FRAC_SECOND
| K_FROM
| K_FULL
| K_FULLTEXT
| K_FUNCTION
| K_GENERAL
| K_GEOMETRY
| K_GEOMETRYCOLLECTION
| K_GET_FORMAT
| K_GLOBAL
| K_GRANT
| K_GRANTS
| K_GROUP
| K_HANDLER
| K_HASH
| K_HAVING
| K_HELP
| K_HIGH_PRIORITY
| K_HOST
| K_HOSTS
| K_HOUR
| K_HOUR_MICROSECOND
| K_HOUR_MINUTE
| K_HOUR_SECOND
| K_IDENTIFIED
| K_IF
| K_IGNORE
| K_IGNORE_SERVER_IDS
| K_IMPORT
| K_IN
| K_INDEX
| K_INDEXES
| K_INFILE
| K_INITIAL_SIZE
| K_INNER
| K_INNOBASE
| K_INNODB
| K_INOUT
| K_INSENSITIVE
| K_INSERT
| K_INSERT_METHOD
| K_INSTALL
| K_INT
| K_INT
| K_INT
| K_INT
| K_INT
| K_INT
| K_INTEGER
| K_INTERVAL
| K_INTO
| K_INVOKER
| K_IO
| K_IO_THREAD
| K_IPC
| K_IS
| K_ISOLATION
| K_ISSUER
| K_ITERATE
| K_JOIN
| K_KEY
| K_KEYS
| K_KEY_BLOCK_SIZE
| K_KILL
| K_LANGUAGE
| K_LAST
| K_LEADING
| K_LEAVE
| K_LEAVES
| K_LEFT
| K_LESS
| K_LEVEL
| K_LIKE
| K_LIMIT
| K_LINEAR
| K_LINES
| K_LINESTRING
| K_LIST
| K_LOAD
| K_LOCAL
| K_LOCALTIME
| K_LOCALTIMESTAMP
| K_LOCK
| K_LOCKS
| K_LOGFILE
| K_LOGS
| K_LONG
| K_LONGBLOB
| K_LONGTEXT
| K_LOOP
| K_LOW_PRIORITY
| K_MASTER
| K_MASTER_CONNECT_RETRY
| K_MASTER_HEARTBEAT_PERIOD
| K_MASTER_HOST
| K_MASTER_LOG_FILE
| K_MASTER_LOG_POS
| K_MASTER_PASSWORD
| K_MASTER_PORT
| K_MASTER_SERVER_ID
| K_MASTER_SSL
| K_MASTER_SSL_CA
| K_MASTER_SSL_CAPATH
| K_MASTER_SSL_CERT
| K_MASTER_SSL_CIPHER
| K_MASTER_SSL_KEY
| K_MASTER_SSL_VERIFY_SERVER_CERT
| K_MASTER_USER
| K_MATCH
| K_MAXVALUE
| K_MAX_CONNECTIONS_PER_HOUR
| K_MAX_QUERIES_PER_HOUR
| K_MAX_ROWS
| K_MAX_SIZE
| K_MAX_UPDATES_PER_HOUR
| K_MAX_USER_CONNECTIONS
| K_MEDIUM
| K_MEDIUMBLOB
| K_MEDIUMINT
| K_MEDIUMTEXT
| K_MEMORY
| K_MERGE
| K_MESSAGE_TEXT
| K_MICROSECOND
| K_MIDDLEINT
| K_MIGRATE
| K_MINUTE
| K_MINUTE_MICROSECOND
| K_MINUTE_SECOND
| K_MIN_ROWS
| K_MOD
| K_MODE
| K_MODIFIES
| K_MODIFY
| K_MONTH
| K_MULTILINESTRING
| K_MULTIPOINT
| K_MULTIPOLYGON
| K_MUTEX
| K_MYSQL_ERRNO
| K_NAME
| K_NAMES
| K_NATIONAL
| K_NATURAL
| K_NCHAR
| K_NDB
| K_NDBCLUSTER
| K_NEW
| K_NEXT
| K_NO
| K_NODEGROUP
| K_NONE
| K_NOT
| K_NO_WAIT
| K_NO_WRITE_TO_BINLOG
| K_NULL
| K_NUMERIC
| K_NVARCHAR
| K_OFFSET
| K_OLD_PASSWORD
| K_ON
| K_ONE
| K_ONE_SHOT
| K_OPEN
| K_OPTIMIZE
| K_OPTION
| K_OPTIONALLY
| K_OPTIONS
| K_OR
| K_ORDER
| K_OUT
| K_OUTER
| K_OUTFILE
| K_OWNER
| K_PACK_KEYS
| K_PAGE
| K_PARSER
| K_PARTIAL
| K_PARTITION
| K_PARTITIONING
| K_PARTITIONS
| K_PASSWORD
| K_PHASE
| K_PLUGIN
| K_PLUGINS
| K_POINT
| K_POLYGON
| K_PORT
| K_PRECISION
| K_PREPARE
| K_PRESERVE
| K_PREV
| K_PRIMARY
| K_PRIVILEGES
| K_PROCEDURE
| K_PROCESSLIST
| K_PROFILE
| K_PROFILES
| K_PROXY
| K_PURGE
| K_QUARTER
| K_QUERY
| K_QUICK
| K_RANGE
| K_READ
| K_READS
| K_READ_ONLY
| K_READ_WRITE
| K_REAL
| K_REBUILD
| K_RECOVER
| K_REDOFILE
| K_REDO_BUFFER_SIZE
| K_REDUNDANT
| K_REFERENCES
| K_REGEXP
| K_RELAY
| K_RELAYLOG
| K_RELAY_LOG_FILE
| K_RELAY_LOG_POS
| K_RELAY_THREAD
| K_RELEASE
| K_RELOAD
| K_REMOVE
| K_RENAME
| K_REORGANIZE
| K_REPAIR
| K_REPEAT
| K_REPEATABLE
| K_REPLACE
| K_REPLICATION
| K_REQUIRE
| K_RESET
| K_RESIGNAL
| K_RESTORE
| K_RESTRICT
| K_RESUME
| K_RETURN
| K_RETURNS
| K_REVOKE
| K_RIGHT
| K_RLIKE
| K_ROLLBACK
| K_ROLLUP
| K_ROUTINE
| K_ROW
| K_ROWS
| K_ROW_FORMAT
| K_RTREE
| K_SAVEPOINT
| K_SCHEDULE
| K_SCHEMA
| K_SCHEMAS
| K_SCHEMA_NAME
| K_SECOND
| K_SECOND_MICROSECOND
| K_SECURITY
| K_SELECT
| K_SENSITIVE
| K_SEPARATOR
| K_SERIAL
| K_SERIALIZABLE
| K_SERVER
| K_SESSION
| K_SET
| K_SHARE
| K_SHOW
| K_SHUTDOWN
| K_SIGNAL
| K_SIGNED
| K_SIMPLE
| K_SLAVE
| K_SLOW
| K_SMALLINT
| K_SNAPSHOT
| K_SOCKET
| K_SOME
| K_SONAME
| K_SOUNDS
| K_SOURCE
| K_SPATIAL
| K_SPECIFIC
| K_SQL
| K_SQLEXCEPTION
| K_SQLSTATE
| K_SQLWARNING
| K_SQL_BIG_RESULT
| K_SQL_BUFFER_RESULT
| K_SQL_CACHE
| K_SQL_CALC_FOUND_ROWS
| K_SQL_NO_CACHE
| K_SQL_SMALL_RESULT
| K_SQL_THREAD
| K_SQL_TSI_DAY
| K_SQL_TSI_FRAC_SECOND
| K_SQL_TSI_HOUR
| K_SQL_TSI_MINUTE
| K_SQL_TSI_MONTH
| K_SQL_TSI_QUARTER
| K_SQL_TSI_SECOND
| K_SQL_TSI_WEEK
| K_SQL_TSI_YEAR
| K_SSL
| K_START
| K_STARTING
| K_STARTS
| K_STATUS
| K_STOP
| K_STORAGE
| K_STRAIGHT_JOIN
| K_STRING
| K_SUBCLASS_ORIGIN
| K_SUBJECT
| K_SUBPARTITION
| K_SUBPARTITIONS
| K_SUPER
| K_SUSPEND
| K_SWAPS
| K_SWITCHES
| K_TABLE
| K_TABLES
| K_TABLESPACE
| K_TABLE_CHECKSUM
| K_TABLE_NAME
| K_TEMPORARY
| K_TEMPTABLE
| K_TERMINATED
| K_TEXT
| K_THAN
| K_THEN
| K_TIME
| K_TIMESTAMP
| K_TIMESTAMPADD
| K_TIMESTAMPDIFF
| K_TINYBLOB
| K_TINYINT
| K_TINYTEXT
| K_TO
| K_TRAILING
| K_TRANSACTION
| K_TRIGGER
| K_TRIGGERS
| K_TRUE
| K_TRUNCATE
| K_TYPE
| K_TYPES
| K_UNCOMMITTED
| K_UNDEFINED
| K_UNDO
| K_UNDOFILE
| K_UNDO_BUFFER_SIZE
| K_UNICODE
| K_UNINSTALL
| K_UNION
| K_UNIQUE
| K_UNKNOWN
| K_UNLOCK
| K_UNSIGNED
| K_UNTIL
| K_UPDATE
| K_UPGRADE
| K_USAGE
| K_USE
| K_USER
| K_USER_RESOURCES
| K_USE_FRM
| K_USING
| K_UTC_DATE
| K_UTC_TIME
| K_UTC_TIMESTAMP
| K_VALUE
| K_VALUES
| K_VARBINARY
| K_VARCHAR
| K_VARCHARACTER
| K_VARIABLES
| K_VARYING
| K_VIEW
| K_WAIT
| K_WARNINGS
| K_WEEK
| K_WHEN
| K_WHERE
| K_WHILE
| K_WITH
| K_WORK
| K_WRAPPER
| K_WRITE
| K_X509
| K_XA
| K_XML
| K_XOR
| K_YEAR
| K_YEAR_MONTH
| K_ZEROFILL
/* self defined "keywords" */
| K_OFFLINE
| K_ONLINE
| K_CAST
| K_STATS_AUTO_RECALC
| K_STATS_PERSISTENT
| K_STATS_SAMPLE_PAGES
| K_OJ
| K_FORMAT
 ;

table_name
 :
 (schema_name '.')?  (identifier | keyword)
 ;

schema_name:
  identifier;

column_name
 :  identifier  | keyword | '*'
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

identifier:
  QUOTED_IDENTIFIER
  | UNQUOTED_IDENTIFIER
  | UNDERLINE_STARTED_IDENTIFIER
  | DOUBLE_QUOTED_STRING
  ;

//http://dev.mysql.com/doc/refman/5.5/en/keywords.html
K_ACCESSIBLE : A C C E S S I B L E ;
K_ACTION: A C T I O N ;
K_ADD : A D D;
K_AFTER : A F T E R ;
K_AGAINST : A G A I N S T ;
K_AGGREGATE : A G G R E G A T E;
K_ALGORITHM : A L G O R I T H M ;
K_ALL: A L L ;
K_ALTER : A L T E R ;
K_ANALYZE : A N A L Y Z E ;
K_AND : A N D ;
K_ANY : A N Y ;
K_AS : A S ;
K_ASC : A S C ;
K_ASCII : A S C I I ;
K_ASENSITIVE : A S E N S I T I V E ;
K_AT : A T ;
K_AUTHORS : A U T H O R S ;
K_AUTOEXTEND_SIZE : A U T O E X T E N D '_' S I Z E ;
K_AUTO_INCREMENT : 	A U T O '_' I N C R E M E N T ;
K_AVG : A V G ;
K_AVG_ROW_LENGTH : A V G '_' R O W '_' L E N G T H ;
K_BACKUP : B A C K U P ;
K_BEFORE : B E F O R E ;
K_BEGIN : B E G I N ;
K_BETWEEN: 	B E T W E E N ;
K_BIGINT: B I G I N T ;
K_BINARY : B I N A R Y ;
K_BINLOG : B I N L O G ;
K_BIT : B I T ;
K_BLOB : B L O B ;
K_BLOCK : B L O C K ;
K_BOOL : B O O L ;
K_BOOLEAN : B O O L E A N ;
K_BOTH : B O T H ;
K_BTREE : B T R E E ;
K_BY  : B Y  ;
K_BYTE : B Y T E ;
K_CACHE : C A C H E ;
K_CALL  : C A L L  ;
K_CASCADE  : C A S C A D E  ;
K_CASCADED : C A S C A D E D ;
K_CASE  : C A S E  ;
K_CATALOG_NAME : C A T A L O G '_' N A M E ;
K_CHAIN : C H A I N ;
K_CHANGE  : C H A N G E  ;
K_CHANGED : C H A N G E D ;
K_CHAR  : C H A R  ;
K_CHARACTER  : C H A R A C T E R  ;
K_CHARSET : C H A R S E T ;
K_CHECK  : C H E C K  ;
K_CHECKSUM : C H E C K S U M ;
K_CIPHER : C I P H E R ;
K_CLASS_ORIGIN : C L A S S '_' O R I G I N ;
K_CLIENT : C L I E N T ;
K_CLOSE : C L O S E ;
K_COALESCE : C O A L E S C E ;
K_CODE : C O D E ;
K_COLLATE  : C O L L A T E  ;
K_COLLATION : C O L L A T I O N ;
K_COLUMN  : C O L U M N  ;
K_COLUMNS : C O L U M N S ;
K_COLUMN_NAME : C O L U M N '_' N A M E ;
K_COMMENT : C O M M E N T ;
K_COMMIT : C O M M I T ;
K_COMMITTED : C O M M I T T E D ;
K_COMPACT : C O M P A C T ;
K_COMPLETION : C O M P L E T I O N ;
K_COMPRESSED : C O M P R E S S E D ;
K_CONCURRENT : C O N C U R R E N T ;
K_CONDITION  : C O N D I T I O N  ;
K_CONNECTION : C O N N E C T I O N ;
K_CONSISTENT : C O N S I S T E N T ;
K_CONSTRAINT  : C O N S T R A I N T  ;
K_CONSTRAINT_CATALOG : C O N S T R A I N T '_' C A T A L O G ;
K_CONSTRAINT_NAME : C O N S T R A I N T '_' N A M E ;
K_CONSTRAINT_SCHEMA : C O N S T R A I N T '_' S C H E M A ;
K_CONTAINS : C O N T A I N S ;
K_CONTEXT : C O N T E X T ;
K_CONTINUE  : C O N T I N U E  ;
K_CONTRIBUTORS : C O N T R I B U T O R S ;
K_CONVERT  : C O N V E R T  ;
K_CPU : C P U ;
K_CREATE  : C R E A T E  ;
K_CROSS  : C R O S S  ;
K_CUBE : C U B E ;
K_CURRENT_DATE  : C U R R E N T '_' D A T E  ;
K_CURRENT_TIME  : C U R R E N T '_' T I M E  ;
K_CURRENT_TIMESTAMP  : C U R R E N T '_' T I M E S T A M P  ;
K_CURRENT_USER  : C U R R E N T '_' U S E R  ;
K_CURSOR  : C U R S O R  ;
K_CURSOR_NAME : C U R S O R '_' N A M E ;
K_DATA : D A T A ;
K_DATABASE  : D A T A B A S E  ;
K_DATABASES  : D A T A B A S E S  ;
K_DATAFILE : D A T A F I L E ;
K_DATE : D A T E ;
K_DATETIME : D A T E T I M E ;
K_DAY : D A Y ;
K_DAY_HOUR  : D A Y '_' H O U R  ;
K_DAY_MICROSECOND  : D A Y '_' M I C R O S E C O N D  ;
K_DAY_MINUTE  : D A Y '_' M I N U T E  ;
K_DAY_SECOND  : D A Y '_' S E C O N D  ;
K_DEALLOCATE : D E A L L O C A T E ;
K_DEC  : D E C  ;
K_DECIMAL  : D E C I M A L  ;
K_DECLARE  : D E C L A R E  ;
K_DEFAULT  : D E F A U L T  ;
K_DEFINER : D E F I N E R ;
K_DELAYED  : D E L A Y E D  ;
K_DELAY_KEY_WRITE : D E L A Y '_' K E Y '_' W R I T E ;
K_DELETE  : D E L E T E  ;
K_DESC  : D E S C  ;
K_DESCRIBE  : D E S C R I B E  ;
K_DES_KEY_FILE : D E S '_' K E Y '_' F I L E ;
K_DETERMINISTIC  : D E T E R M I N I S T I C  ;
K_DIRECTORY : D I R E C T O R Y ;
K_DISABLE : D I S A B L E ;
K_DISCARD : D I S C A R D ;
K_DISK : D I S K ;
K_DISTINCT  : D I S T I N C T  ;
K_DISTINCTROW  : D I S T I N C T R O W  ;
K_DIV  : D I V  ;
K_DO : D O ;
K_DOUBLE  : D O U B L E  ;
K_DROP  : D R O P  ;
K_DUAL  : D U A L  ;
K_DUMPFILE : D U M P F I L E ;
K_DUPLICATE : D U P L I C A T E ;
K_DYNAMIC : D Y N A M I C ;
K_EACH  : E A C H  ;
K_ELSE  : E L S E  ;
K_ELSEIF  : E L S E I F  ;
K_ENABLE : E N A B L E ;
K_ENCLOSED  : E N C L O S E D  ;
K_END : E N D ;
K_ENDS : E N D S ;
K_ENGINE : E N G I N E ;
K_ENGINES : E N G I N E S ;
K_ENUM : E N U M ;
K_ERROR : E R R O R ;
K_ERRORS : E R R O R S ;
K_ESCAPE : E S C A P E ;
K_ESCAPED  : E S C A P E D  ;
K_EVENT : E V E N T ;
K_EVENTS : E V E N T S ;
K_EVERY : E V E R Y ;
K_EXECUTE : E X E C U T E ;
K_EXISTS  : E X I S T S  ;
K_EXIT  : E X I T  ;
K_EXPANSION : E X P A N S I O N ;
K_EXPLAIN  : E X P L A I N  ;
K_EXTENDED : E X T E N D E D ;
K_EXTENT_SIZE : E X T E N T '_' S I Z E ;
K_FALSE  : F A L S E  ;
K_FAST : F A S T ;
K_FAULTS : F A U L T S ;
K_FETCH  : F E T C H  ;
K_FIELDS : F I E L D S ;
K_FILE : F I L E ;
K_FIRST : F I R S T ;
K_FIXED : F I X E D ;
K_FLOAT  : F L O A T  ;
K_FLOAT4  : F L O A T '4' ;
K_FLOAT8  : F L O A T '8' ;
K_FLUSH : F L U S H ;
K_FOR  : F O R  ;
K_FORCE  : F O R C E  ;
K_FOREIGN  : F O R E I G N  ;
K_FOUND : F O U N D ;
K_FRAC_SECOND : F R A C '_' S E C O N D ;
K_FROM  : F R O M  ;
K_FULL : F U L L ;
K_FULLTEXT  : F U L L T E X T  ;
K_FUNCTION : F U N C T I O N ;
K_GENERAL : G E N E R A L ;
K_GEOMETRY : G E O M E T R Y ;
K_GEOMETRYCOLLECTION : G E O M E T R Y C O L L E C T I O N ;
K_GET_FORMAT : G E T '_' F O R M A T ;
K_GLOBAL : G L O B A L ;
K_GRANT  : G R A N T  ;
K_GRANTS : G R A N T S ;
K_GROUP  : G R O U P  ;
K_HANDLER : H A N D L E R ;
K_HASH : H A S H ;
K_HAVING  : H A V I N G  ;
K_HELP : H E L P ;
K_HIGH_PRIORITY  : H I G H '_' P R I O R I T Y  ;
K_HOST : H O S T ;
K_HOSTS : H O S T S ;
K_HOUR : H O U R ;
K_HOUR_MICROSECOND  : H O U R '_' M I C R O S E C O N D  ;
K_HOUR_MINUTE  : H O U R '_' M I N U T E  ;
K_HOUR_SECOND  : H O U R '_' S E C O N D  ;
K_IDENTIFIED : I D E N T I F I E D ;
K_IF  : I F  ;
K_IGNORE  : I G N O R E  ;
K_IGNORE_SERVER_IDS : I G N O R E '_' S E R V E R '_' I D S ;
K_IMPORT : I M P O R T ;
K_IN  : I N  ;
K_INDEX  : I N D E X  ;
K_INDEXES : I N D E X E S ;
K_INFILE  : I N F I L E  ;
K_INITIAL_SIZE : I N I T I A L '_' S I Z E ;
K_INNER  : I N N E R  ;
K_INNOBASE : I N N O B A S E ;
K_INNODB : I N N O D B ;
K_INOUT  : I N O U T  ;
K_INSENSITIVE  : I N S E N S I T I V E  ;
K_INSERT  : I N S E R T  ;
K_INSERT_METHOD : I N S E R T '_' M E T H O D ;
K_INSTALL : I N S T A L L ;
K_INT  : I N T  ;
K_INT1  : I N T '1' ;
K_INT2  : I N T '2' ;
K_INT3  : I N T '3' ;
K_INT4  : I N T '4' ;
K_INT8  : I N T '8' ;
K_INTEGER  : I N T E G E R  ;
K_INTERVAL  : I N T E R V A L  ;
K_INTO  : I N T O  ;
K_INVOKER : I N V O K E R ;
K_IO : I O ;
K_IO_THREAD : I O '_' T H R E A D ;
K_IPC : I P C ;
K_IS  : I S  ;
K_ISOLATION : I S O L A T I O N ;
K_ISSUER : I S S U E R ;
K_ITERATE  : I T E R A T E  ;
K_JOIN  : J O I N  ;
K_KEY  : K E Y  ;
K_KEYS  : K E Y S  ;
K_KEY_BLOCK_SIZE : K E Y '_' B L O C K '_' S I Z E ;
K_KILL  : K I L L  ;
K_LANGUAGE : L A N G U A G E ;
K_LAST : L A S T ;
K_LEADING  : L E A D I N G  ;
K_LEAVE  : L E A V E  ;
K_LEAVES : L E A V E S ;
K_LEFT  : L E F T  ;
K_LESS : L E S S ;
K_LEVEL : L E V E L ;
K_LIKE  : L I K E  ;
K_LIMIT  : L I M I T  ;
K_LINEAR  : L I N E A R  ;
K_LINES  : L I N E S  ;
K_LINESTRING : L I N E S T R I N G ;
K_LIST : L I S T ;
K_LOAD  : L O A D  ;
K_LOCAL : L O C A L ;
K_LOCALTIME  : L O C A L T I M E  ;
K_LOCALTIMESTAMP  : L O C A L T I M E S T A M P  ;
K_LOCK  : L O C K  ;
K_LOCKS : L O C K S ;
K_LOGFILE : L O G F I L E ;
K_LOGS : L O G S ;
K_LONG  : L O N G  ;
K_LONGBLOB  : L O N G B L O B  ;
K_LONGTEXT  : L O N G T E X T  ;
K_LOOP  : L O O P  ;
K_LOW_PRIORITY  : L O W '_' P R I O R I T Y  ;
K_MASTER : M A S T E R ;
K_MASTER_CONNECT_RETRY : M A S T E R '_' C O N N E C T '_' R E T R Y ;
K_MASTER_HEARTBEAT_PERIOD : M A S T E R '_' H E A R T B E A T '_' P E R I O D ;
K_MASTER_HOST : M A S T E R '_' H O S T ;
K_MASTER_LOG_FILE : M A S T E R '_' L O G '_' F I L E ;
K_MASTER_LOG_POS : M A S T E R '_' L O G '_' P O S ;
K_MASTER_PASSWORD : M A S T E R '_' P A S S W O R D ;
K_MASTER_PORT : M A S T E R '_' P O R T ;
K_MASTER_SERVER_ID : M A S T E R '_' S E R V E R '_' I D ;
K_MASTER_SSL : M A S T E R '_' S S L ;
K_MASTER_SSL_CA : M A S T E R '_' S S L '_' C A ;
K_MASTER_SSL_CAPATH : M A S T E R '_' S S L '_' C A P A T H ;
K_MASTER_SSL_CERT : M A S T E R '_' S S L '_' C E R T ;
K_MASTER_SSL_CIPHER : M A S T E R '_' S S L '_' C I P H E R ;
K_MASTER_SSL_KEY : M A S T E R '_' S S L '_' K E Y ;
K_MASTER_SSL_VERIFY_SERVER_CERT  : M A S T E R '_' S S L '_' V E R I F Y '_' S E R V E R '_' C E R T  ;
K_MASTER_USER : M A S T E R '_' U S E R ;
K_MATCH  : M A T C H  ;
K_MAXVALUE  : M A X V A L U E  ;
K_MAX_CONNECTIONS_PER_HOUR : M A X '_' C O N N E C T I O N S '_' P E R '_' H O U R ;
K_MAX_QUERIES_PER_HOUR : M A X '_' Q U E R I E S '_' P E R '_' H O U R ;
K_MAX_ROWS : M A X '_' R O W S ;
K_MAX_SIZE : M A X '_' S I Z E ;
K_MAX_UPDATES_PER_HOUR : M A X '_' U P D A T E S '_' P E R '_' H O U R ;
K_MAX_USER_CONNECTIONS : M A X '_' U S E R '_' C O N N E C T I O N S ;
K_MEDIUM : M E D I U M ;
K_MEDIUMBLOB  : M E D I U M B L O B  ;
K_MEDIUMINT  : M E D I U M I N T  ;
K_MEDIUMTEXT  : M E D I U M T E X T  ;
K_MEMORY : M E M O R Y ;
K_MERGE : M E R G E ;
K_MESSAGE_TEXT : M E S S A G E '_' T E X T ;
K_MICROSECOND : M I C R O S E C O N D ;
K_MIDDLEINT  : M I D D L E I N T  ;
K_MIGRATE : M I G R A T E ;
K_MINUTE : M I N U T E ;
K_MINUTE_MICROSECOND  : M I N U T E '_' M I C R O S E C O N D  ;
K_MINUTE_SECOND  : M I N U T E '_' S E C O N D  ;
K_MIN_ROWS : M I N '_' R O W S ;
K_MOD  : M O D  ;
K_MODE : M O D E ;
K_MODIFIES  : M O D I F I E S  ;
K_MODIFY : M O D I F Y ;
K_MONTH : M O N T H ;
K_MULTILINESTRING : M U L T I L I N E S T R I N G ;
K_MULTIPOINT : M U L T I P O I N T ;
K_MULTIPOLYGON : M U L T I P O L Y G O N ;
K_MUTEX : M U T E X ;
K_MYSQL_ERRNO : M Y S Q L '_' E R R N O ;
K_NAME : N A M E ;
K_NAMES : N A M E S ;
K_NATIONAL : N A T I O N A L ;
K_NATURAL  : N A T U R A L  ;
K_NCHAR : N C H A R ;
K_NDB : N D B ;
K_NDBCLUSTER : N D B C L U S T E R ;
K_NEW : N E W ;
K_NEXT : N E X T ;
K_NO : N O ;
K_NODEGROUP : N O D E G R O U P ;
K_NONE : N O N E ;
K_NOT  : N O T  ;
K_NO_WAIT : N O '_' W A I T ;
K_NO_WRITE_TO_BINLOG  : N O '_' W R I T E '_' T O '_' B I N L O G  ;
K_NULL  : N U L L  ;
K_NUMERIC  : N U M E R I C  ;
K_NVARCHAR : N V A R C H A R ;
K_OFFSET : O F F S E T ;
K_OLD_PASSWORD : O L D '_' P A S S W O R D ;
K_ON  : O N  ;
K_ONE : O N E ;
K_ONE_SHOT : O N E '_' S H O T ;
K_OPEN : O P E N ;
K_OPTIMIZE  : O P T I M I Z E  ;
K_OPTION  : O P T I O N  ;
K_OPTIONALLY  : O P T I O N A L L Y  ;
K_OPTIONS : O P T I O N S ;
K_OR  : O R  ;
K_ORDER  : O R D E R  ;
K_OUT  : O U T  ;
K_OUTER  : O U T E R  ;
K_OUTFILE  : O U T F I L E  ;
K_OWNER : O W N E R ;
K_PACK_KEYS : P A C K '_' K E Y S ;
K_PAGE : P A G E ;
K_PARSER : P A R S E R ;
K_PARTIAL : P A R T I A L ;
K_PARTITION : P A R T I T I O N ;
K_PARTITIONING : P A R T I T I O N I N G ;
K_PARTITIONS : P A R T I T I O N S ;
K_PASSWORD : P A S S W O R D ;
K_PHASE : P H A S E ;
K_PLUGIN : P L U G I N ;
K_PLUGINS : P L U G I N S ;
K_POINT : P O I N T ;
K_POLYGON : P O L Y G O N ;
K_PORT : P O R T ;
K_PRECISION  : P R E C I S I O N  ;
K_PREPARE : P R E P A R E ;
K_PRESERVE : P R E S E R V E ;
K_PREV : P R E V ;
K_PRIMARY  : P R I M A R Y  ;
K_PRIVILEGES : P R I V I L E G E S ;
K_PROCEDURE  : P R O C E D U R E  ;
K_PROCESSLIST : P R O C E S S L I S T ;
K_PROFILE : P R O F I L E ;
K_PROFILES : P R O F I L E S ;
K_PROXY : P R O X Y ;
K_PURGE  : P U R G E  ;
K_QUARTER : Q U A R T E R ;
K_QUERY : Q U E R Y ;
K_QUICK : Q U I C K ;
K_RANGE  : R A N G E  ;
K_READ  : R E A D  ;
K_READS  : R E A D S  ;
K_READ_ONLY : R E A D '_' O N L Y ;
K_READ_WRITE  : R E A D '_' W R I T E  ;
K_REAL  : R E A L  ;
K_REBUILD : R E B U I L D ;
K_RECOVER : R E C O V E R ;
K_REDOFILE : R E D O F I L E ;
K_REDO_BUFFER_SIZE : R E D O '_' B U F F E R '_' S I Z E ;
K_REDUNDANT : R E D U N D A N T ;
K_REFERENCES  : R E F E R E N C E S  ;
K_REGEXP  : R E G E X P  ;
K_RELAY : R E L A Y ;
K_RELAYLOG : R E L A Y L O G ;
K_RELAY_LOG_FILE : R E L A Y '_' L O G '_' F I L E ;
K_RELAY_LOG_POS : R E L A Y '_' L O G '_' P O S ;
K_RELAY_THREAD : R E L A Y '_' T H R E A D ;
K_RELEASE  : R E L E A S E  ;
K_RELOAD : R E L O A D ;
K_REMOVE : R E M O V E ;
K_RENAME  : R E N A M E  ;
K_REORGANIZE : R E O R G A N I Z E ;
K_REPAIR : R E P A I R ;
K_REPEAT  : R E P E A T  ;
K_REPEATABLE : R E P E A T A B L E ;
K_REPLACE  : R E P L A C E  ;
K_REPLICATION : R E P L I C A T I O N ;
K_REQUIRE  : R E Q U I R E  ;
K_RESET : R E S E T ;
K_RESIGNAL  : R E S I G N A L  ;
K_RESTORE : R E S T O R E ;
K_RESTRICT  : R E S T R I C T  ;
K_RESUME : R E S U M E ;
K_RETURN  : R E T U R N  ;
K_RETURNS : R E T U R N S ;
K_REVOKE  : R E V O K E  ;
K_RIGHT  : R I G H T  ;
K_RLIKE  : R L I K E  ;
K_ROLLBACK : R O L L B A C K ;
K_ROLLUP : R O L L U P ;
K_ROUTINE : R O U T I N E ;
K_ROW : R O W ;
K_ROWS : R O W S ;
K_ROW_FORMAT : R O W '_' F O R M A T ;
K_RTREE : R T R E E ;
K_SAVEPOINT : S A V E P O I N T ;
K_SCHEDULE : S C H E D U L E ;
K_SCHEMA  : S C H E M A  ;
K_SCHEMAS  : S C H E M A S  ;
K_SCHEMA_NAME : S C H E M A '_' N A M E ;
K_SECOND : S E C O N D ;
K_SECOND_MICROSECOND  : S E C O N D '_' M I C R O S E C O N D  ;
K_SECURITY : S E C U R I T Y ;
K_SELECT  : S E L E C T  ;
K_SENSITIVE  : S E N S I T I V E  ;
K_SEPARATOR  : S E P A R A T O R  ;
K_SERIAL : S E R I A L ;
K_SERIALIZABLE : S E R I A L I Z A B L E ;
K_SERVER : S E R V E R ;
K_SESSION : S E S S I O N ;
K_SET  : S E T  ;
K_SHARE : S H A R E ;
K_SHOW  : S H O W  ;
K_SHUTDOWN : S H U T D O W N ;
K_SIGNAL  : S I G N A L  ;
K_SIGNED : S I G N E D ;
K_SIMPLE : S I M P L E ;
K_SLAVE : S L A V E ;
K_SLOW : S L O W ;
K_SMALLINT  : S M A L L I N T  ;
K_SNAPSHOT : S N A P S H O T ;
K_SOCKET : S O C K E T ;
K_SOME : S O M E ;
K_SONAME : S O N A M E ;
K_SOUNDS : S O U N D S ;
K_SOURCE : S O U R C E ;
K_SPATIAL  : S P A T I A L  ;
K_SPECIFIC  : S P E C I F I C  ;
K_SQL  : S Q L  ;
K_SQLEXCEPTION  : S Q L E X C E P T I O N  ;
K_SQLSTATE  : S Q L S T A T E  ;
K_SQLWARNING  : S Q L W A R N I N G  ;
K_SQL_BIG_RESULT  : S Q L '_' B I G '_' R E S U L T  ;
K_SQL_BUFFER_RESULT : S Q L '_' B U F F E R '_' R E S U L T ;
K_SQL_CACHE : S Q L '_' C A C H E ;
K_SQL_CALC_FOUND_ROWS  : S Q L '_' C A L C '_' F O U N D '_' R O W S  ;
K_SQL_NO_CACHE : S Q L '_' N O '_' C A C H E ;
K_SQL_SMALL_RESULT  : S Q L '_' S M A L L '_' R E S U L T  ;
K_SQL_THREAD : S Q L '_' T H R E A D ;
K_SQL_TSI_DAY : S Q L '_' T S I '_' D A Y ;
K_SQL_TSI_FRAC_SECOND : S Q L '_' T S I '_' F R A C '_' S E C O N D ;
K_SQL_TSI_HOUR : S Q L '_' T S I '_' H O U R ;
K_SQL_TSI_MINUTE : S Q L '_' T S I '_' M I N U T E ;
K_SQL_TSI_MONTH : S Q L '_' T S I '_' M O N T H ;
K_SQL_TSI_QUARTER : S Q L '_' T S I '_' Q U A R T E R ;
K_SQL_TSI_SECOND : S Q L '_' T S I '_' S E C O N D ;
K_SQL_TSI_WEEK : S Q L '_' T S I '_' W E E K ;
K_SQL_TSI_YEAR : S Q L '_' T S I '_' Y E A R ;
K_SSL  : S S L  ;
K_START : S T A R T ;
K_STARTING  : S T A R T I N G  ;
K_STARTS : S T A R T S ;
K_STATUS : S T A T U S ;
K_STOP : S T O P ;
K_STORAGE : S T O R A G E ;
K_STRAIGHT_JOIN  : S T R A I G H T '_' J O I N  ;
K_STRING : S T R I N G ;
K_SUBCLASS_ORIGIN : S U B C L A S S '_' O R I G I N ;
K_SUBJECT : S U B J E C T ;
K_SUBPARTITION : S U B P A R T I T I O N ;
K_SUBPARTITIONS : S U B P A R T I T I O N S ;
K_SUPER : S U P E R ;
K_SUSPEND : S U S P E N D ;
K_SWAPS : S W A P S ;
K_SWITCHES : S W I T C H E S ;
K_TABLE  : T A B L E  ;
K_TABLES : T A B L E S ;
K_TABLESPACE : T A B L E S P A C E ;
K_TABLE_CHECKSUM : T A B L E '_' C H E C K S U M ;
K_TABLE_NAME : T A B L E '_' N A M E ;
K_TEMPORARY : T E M P O R A R Y ;
K_TEMPTABLE : T E M P T A B L E ;
K_TERMINATED  : T E R M I N A T E D  ;
K_TEXT : T E X T ;
K_THAN : T H A N ;
K_THEN  : T H E N  ;
K_TIME : T I M E ;
K_TIMESTAMP : T I M E S T A M P ;
K_TIMESTAMPADD : T I M E S T A M P A D D ;
K_TIMESTAMPDIFF : T I M E S T A M P D I F F ;
K_TINYBLOB  : T I N Y B L O B  ;
K_TINYINT  : T I N Y I N T  ;
K_TINYTEXT  : T I N Y T E X T  ;
K_TO  : T O  ;
K_TRAILING  : T R A I L I N G  ;
K_TRANSACTION : T R A N S A C T I O N ;
K_TRIGGER  : T R I G G E R  ;
K_TRIGGERS : T R I G G E R S ;
K_TRUE  : T R U E  ;
K_TRUNCATE : T R U N C A T E ;
K_TYPE : T Y P E ;
K_TYPES : T Y P E S ;
K_UNCOMMITTED : U N C O M M I T T E D ;
K_UNDEFINED : U N D E F I N E D ;
K_UNDO  : U N D O  ;
K_UNDOFILE : U N D O F I L E ;
K_UNDO_BUFFER_SIZE : U N D O '_' B U F F E R '_' S I Z E ;
K_UNICODE : U N I C O D E ;
K_UNINSTALL : U N I N S T A L L ;
K_UNION  : U N I O N  ;
K_UNIQUE  : U N I Q U E  ;
K_UNKNOWN : U N K N O W N ;
K_UNLOCK  : U N L O C K  ;
K_UNSIGNED  : U N S I G N E D  ;
K_UNTIL : U N T I L ;
K_UPDATE  : U P D A T E  ;
K_UPGRADE : U P G R A D E ;
K_USAGE  : U S A G E  ;
K_USE  : U S E  ;
K_USER : U S E R ;
K_USER_RESOURCES : U S E R '_' R E S O U R C E S ;
K_USE_FRM : U S E '_' F R M ;
K_USING  : U S I N G  ;
K_UTC_DATE  : U T C '_' D A T E  ;
K_UTC_TIME  : U T C '_' T I M E  ;
K_UTC_TIMESTAMP  : U T C '_' T I M E S T A M P  ;
K_VALUE : V A L U E ;
K_VALUES  : V A L U E S  ;
K_VARBINARY  : V A R B I N A R Y  ;
K_VARCHAR  : V A R C H A R  ;
K_VARCHARACTER  : V A R C H A R A C T E R  ;
K_VARIABLES : V A R I A B L E S ;
K_VARYING  : V A R Y I N G  ;
K_VIEW : V I E W ;
K_WAIT : W A I T ;
K_WARNINGS : W A R N I N G S ;
K_WEEK : W E E K ;
K_WHEN  : W H E N  ;
K_WHERE  : W H E R E  ;
K_WHILE  : W H I L E  ;
K_WITH  : W I T H  ;
K_WORK : W O R K ;
K_WRAPPER : W R A P P E R ;
K_WRITE  : W R I T E  ;
K_X509 : X '5' '0' '9';
K_XA : X A ;
K_XML : X M L ;
K_XOR  : X O R  ;
K_YEAR : Y E A R ;
K_YEAR_MONTH  : Y E A R '_' M O N T H  ;
K_ZEROFILL  : Z E R O F I L L  ;

/* useful non-keywords */
K_ONLINE: O N L I N E ;
K_OFFLINE : O F F L I N E ;
K_FORMAT: F O R M A T ;
K_CAST: C A S T;
K_STATS_AUTO_RECALC : S T A T S '_' A U T O '_' R E C A L C ;
K_STATS_PERSISTENT : S T A T S '_' P E R S I S T E N T ;
K_STATS_SAMPLE_PAGES : S T A T S '_' S A M P L E '_' P A G E S ;
K_OJ : O J ;

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

DOUBLE_QUOTED_STRING:
   '"' (~'"' | '""' | '\\\"')* '"' ;

SINGLE_QUOTED_STRING:
  '\'' ( ~'\'' | '\'\'' | '\\\'' )* '\''
 ;

QUOTED_IDENTIFIER:
  '`' (~'`' | '``')* '`'
  ;

UNDERLINE_STARTED_IDENTIFIER:
  '_' [a-zA-Z$_0-9]*
  ;

UNQUOTED_IDENTIFIER:
 [a-zA-Z][a-zA-Z$_0-9]*
 ;

SINGLE_LINE_COMMENT
 : ('--' | '#') ~[\r\n]* -> channel(HIDDEN)
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
