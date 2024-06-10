grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;
COMILLA : '\'';
INT : 'int';
DOUBLE : 'double';
VOID : 'void';
CHAR : 'char';
PYC : ';' ;
IGUAL : '=';
COMA : ',';
PA : '(' ;
PB : ')' ;
LA : '{' ;
LB : '}' ;
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
RETURN : 'return';
PUNTO : '.';
FLOTANTE: NUMERO PUNTO NUMERO;
CARACTER: COMILLA LETRA+ COMILLA;

ADD_OP : '+' ;
SUB_OP : '-' ;
MUL_OP : '*' ;
DIV_OP : '/' ;
MOD_OP : '%' ;
AND_OP : '&&' ;
OR_OP : '||' ;
NOT_OP : '!' ;
EQ_OP : '==' ;
NEQ_OP : '!=' ;
LT_OP : '<' ;
GT_OP : '>' ;
LTE_OP : '<=' ;
GTE_OP : '>=' ;
INC_OP : '++' ;
DEC_OP : '--' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS: [ \t\r\n]+ -> skip;

programa : instrucciones EOF;

instrucciones : instruccion instrucciones
              | 
              ;

instruccion : declaracion
            | asignacion
            | expresion PYC
            | while
            | if
            | for
            | llamada_funcion PYC
            | bloque
            | retorno
            ;

parametros : parametro mas_parametros
           | 
           ;

parametro : tipo ID ;

mas_parametros : COMA parametro mas_parametros
               | 
               ;

declaracion : parametros declaracion_continua ;

declaracion_continua : PYC
                     | asignacion_continua 
                     | PA parametros PB bloque
                     | PA parametros PB PYC
                     | COMA ID declaracion
                     ;

tipo : INT | DOUBLE | VOID | CHAR ;

asignacion: ID asignacion_continua;

<<<<<<< HEAD
asignacion_continua : IGUAL expresion mas_asignaciones
                    | (ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP) IGUAL expresion mas_asignaciones
                    | INC_OP mas_asignaciones
                    | DEC_OP mas_asignaciones
                    ;


=======
asignacion_continua : IGUAL expresion mas_asignaciones;
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2

mas_asignaciones: PYC
                | COMA asignacion_continua
                | asignacion_continua
<<<<<<< HEAD
                | PB
                ;

expresion : oal op_expresion
          ;

op_expresion : (ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP | AND_OP | OR_OP | EQ_OP | NEQ_OP | LT_OP | GT_OP | LTE_OP | GTE_OP) oal op_expresion 
=======
                ;

expresion : oal op_expresion
          | ID (ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP) IGUAL oal op_expresion ;

op_expresion : (ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP | AND_OP | OR_OP | EQ_OP | NEQ_OP | LT_OP | GT_OP | LTE_OP | GTE_OP) oal op_expresion 
             | INC_OP
             | DEC_OP
             | COMA expresion
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
             | 
             ;

oal : NUMERO
    | FLOTANTE
    | ID
    | CARACTER
    | llamada_funcion
    ;

llamada_funcion : ID PA argumentos PB ;

argumentos : expresion mas_argumentos
<<<<<<< HEAD
           |
=======
           | 
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
           ;

mas_argumentos : COMA argumentos
               | 
               ;

bloque : LA instrucciones LB ;

if : IF PA expresion PB bloque else_bloque ;

else_bloque : ELSE bloque
            | 
            ;

while : WHILE PA expresion PB bloque ;

<<<<<<< HEAD
for : FOR PA for_continua for_continua for_continua bloque ;

for_continua : declaracion for_continua
             | asignacion for_continua
             | expresion for_continua
             | COMA for_continua
             | PB
             | PYC
=======
for : FOR PA for_continua for_continua for_continua PB bloque ;

for_continua : declaracion for_continua
             | expresion for_continua
             | COMA for_continua
             | PYC
             | PB
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
             | 
             ;

retorno : RETURN expresion PYC 
        | RETURN PYC
        ;
