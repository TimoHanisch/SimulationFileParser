grammar SimulationFile;

parse
    : simulation_stmt EOF
    ;

simulation_stmt
    :   SIMULATION IDENTIFIER
        LBRACE
        body_content
        RBRACE
    ;

body_content
    :   (config_stmt | partial_task | taskScope | meta_assign | constructor_stmt | tasks_stmt)*
    ;

config_stmt
    :   START string_assign
    |   GOAL string_assign
    |   LOOP integer_assign
    |   AUTOCOMPLETE boolean_assign
    ;

string_assign
    :   ASSIGN STRING_LITERAL SEMICOLON
    ;

integer_assign
    :   ASSIGN INTEGER SEMICOLON
    ;

boolean_assign
    :   ASSIGN BOOLEAN SEMICOLON
    ;

partial_task
    :   PARTIALTASK IDENTIFIER
        LBRACE
        (task_config_stmt | meta_assign)*
        RBRACE
    ;

task_config_stmt
    :   SEQUENTIAL boolean_assign
    ;

meta_assign
    :   META IDENTIFIER (string_assign | identifier_assign | meta_link)
    ;

meta_link
    :   ASSIGN META IDENTIFIER
    ;

identifier_assign
    :   ASSIGN IDENTIFIER SEMICOLON
    ;

taskScope
    :   TASK IDENTIFIER? (EXTENDS IDENTIFIER)?
        LBRACE
        (task_config_stmt | meta_assign)*
        knowledge
        RBRACE
    ;

knowledge
    :   KNOWLEDGE ASSIGN LBRACK STRING_LITERAL (COMMA STRING_LITERAL)* RBRACK SEMICOLON
    ;

create_stmt
    :   CREATE (meta_creation | partial_task_creation | task_creation)
    ;

partial_task_creation
    :
    PARTIALTASK
    LPAREN
    atomic_expr
    RPAREN
    LBRACE
    (task_config_stmt SEMICOLON| meta_assign SEMICOLON)*
    RBRACE
    ;

task_creation
    :   TASK
    LPAREN
    atomic_expr
    RPAREN
    (EXTENDING atomic_expr)?
    SEMICOLON
    ;

meta_creation
    :   META_TEXT
     LPAREN
     atomic_expr COMMA
     atomic_expr
     RPAREN
     SEMICOLON
    ;

string_concat
    :   (STRING_LITERAL | INTEGER | IDENTIFIER | constructor_scope_var) (PLUS (STRING_LITERAL | INTEGER | IDENTIFIER | constructor_scope_var))*
    ;

array_expr
    :   (IDENTIFIER | constructor_scope_var) LBRACK array_index RBRACK
    ;

array_index
    :   INTEGER
    | to_array_index
    | from_array_index
    | INTEGER COLON INTEGER
    ;

to_array_index
    : COLON INTEGER
    ;

from_array_index
    : INTEGER COLON
    ;

constructor_scope_var
    :   CREATION_VAR IDENTIFIER
    ;

constructor_scope_var_assign
    :   constructor_scope_var ASSIGN STRING_LITERAL
    ;

constructor_stmt
    : CONSTRUCTOR IDENTIFIER
    LBRACE
    pre_block?
    do_block
    RBRACE
    ;

pre_block
    :
    PRE
    block
    ;

do_block
    :
    DO
    block
    ;

block
    :
    LBRACE
    statement*
    RBRACE
    ;

statement
    : if_stmt
    | var_stmt
    | create_stmt
    | inc_stmt
    | dec_stmt
    ;

if_stmt
    :
    IF LPAREN if_expr RPAREN block
    else_block?
    ;

else_block
    :   ELSE block
    ;

if_expr
    :   BOOLEAN
    |   atomic_expr (EQUAL | UNEQUAL) atomic_expr
    ;

atomic_expr
    : IDENTIFIER
    | string_concat
    | array_expr
    | constructor_scope_var
    ;

var_stmt
    :   VAR IDENTIFIER ASSIGN string_concat SEMICOLON
    ;

inc_stmt
    :   INC (IDENTIFIER | constructor_scope_var) SEMICOLON
    ;

dec_stmt
    :   DEC (IDENTIFIER | constructor_scope_var) SEMICOLON
    ;

tasks_stmt
    :   CALL IDENTIFIER tasks_arguments SEMICOLON
    ;

tasks_arguments
    :
    LPAREN
    STRING_LITERAL
    (COMMA constructor_scope_var_assign)*
    RPAREN
    ;

INC : 'inc';
DEC : 'dec';
VAR : 'var';
IF : 'if';
ELSE : 'else';
PRE : 'pre';
DO : 'do';
CALL : 'call';
CONSTRUCTOR : 'constructor';
CREATE : 'create';
SIMULATION : 'simulation';
EXTENDS : 'extends';
EXTENDING : 'extending';
META_TEXT : 'meta';
TASKS : 'tasks';
CONST : 'const';
FOR : 'for';
TASK : 'task';
PARTIALTASK : 'partialtask';
START : 'start';
GOAL : 'goal';
AUTOCOMPLETE : 'autocomplete';
LOOP : 'loop';
SEQUENTIAL : 'sequential';
KNOWLEDGE : 'knowledge';
BOOLEAN
    : TRUE | FALSE
    ;
fragment TRUE : 'true';
fragment FALSE : 'false';

EQUAL : '==';
UNEQUAL : '!=';
PLUS : '+';
SEMICOLON : ';';
COLON : ':';
COMMA : ',';
ASSIGN : ':=';
META : '@';
CREATION_VAR : '$';
POINTER : '*';

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';


IDENTIFIER
    :   LETTER (LETTER|[0-9])*
    ;

fragment
LETTER
    :   [a-zA-Z]
    ;


STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

INTEGER
    : DIGIT+
    ;

fragment
DIGIT : [0-9];

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

SKIP
    : (WS | LINE_COMMENT) -> skip
    ;

fragment WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')
    ;

fragment LINE_COMMENT
    : '#' ~('\n'|'\r')* '\r'? '\n'
    ;