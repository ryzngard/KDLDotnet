grammar KDL;

node_list: (WS | node)* EOF;

node 
    : (line_escape WS*)? identifier (node_space node_props_and_values)* (node_space* node_children WS*)? node_terminator
    ;

node_props_and_values
    : (line_escape WS*)? (prop | value)
    ;

node_children
    : (line_escape WS*)? CHILDRENSTART node* CHILDRENEND
    ;

node_terminator
    : SingleLineComment 
    | line_end 
    | ';'
    | EOF
    ;

identifier
    : raw_string 
    | escaped_string
    ;

prop
    : identifier '=' value
    ;

value
    : CHARACTER+
    | NUMBER 
    | BOOLEAN 
    | 'null'
    ;

node_space
    : WS* ESCLINE WS*
    | WS+
    ;

line_escape: '/-';

raw_string
    : 'r' raw_string_hash
    ;

raw_string_hash
    : '#' raw_string_hash '#' 
    | '"' (.)*? '"'
    ;

escaped_string: '"' CHARACTER+ '"';

line_end
    : '\n'
    | '\r\n'
    | '\r'
    ;

WS
    : BOM
    | UNICODESPACE
    | MultiLineComment
    ;

MultiLineComment
    : '/*' (COMMENTBLOCK | MultiLineComment) '*/'
    ;

SingleLineComment
    : '//' .*? LINEEND
    ;

fragment ESCLINE
    : '\\' WS* (SingleLineComment | LINEEND)
    ;

fragment BOM: '\uFFEF';
fragment UNICODESPACE
    : [\u0009]
    | [\u0020]
    | [\u00A0]
    | [\u1680]
    ;

fragment COMMENTBLOCK
    : ('*' .*?)*
    ;

fragment CHARACTER 
    : [a-zA-Z]+
    ;

NUMBER
    : DECIMAL
    | HEX
    | OCTAL
    | BINARY
    ;

DECIMAL: INTEGER ('.' [0-9]+)? EXPONENT?;
INTEGER: SIGN? [0-9] [0-9_]*;
fragment EXPONENT: ('e' | 'E') INTEGER;
fragment SIGN: '+' | '-';

HEX: '0x' HEXDIGIT (HEXDIGIT | '_')*;
fragment HEXDIGIT: [0-9a-fA-F];

OCTAL: '0o' [0-7] [0-7_]*;
BINARY: '0b' [0-1] [0-1_]*;

BOOLEAN: 'true' | 'false';

CHILDRENSTART: '{';
CHILDRENEND: '}';

fragment LINEEND
    : '\n'
    | '\r\n'
    | '\r'
    ;