grammar compiladores;

@header {
package compiladores;
}

// fragment LETRA : [A-Za-z] ;
// fragment DIGITO : [0-9] ;

// NUMERO : DIGITO+ ;
// OTRO : . ;

// ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;


// PA : '(' ;
// PB : ')' ;
// CA : '[' ;
// CB : ']' ;
// LA : '{' ;
// LB : '}' ;

// si : s EOF;

// s : CA s CB s
//   | LA s LB s
//   | PA s PB s
//   |
//   ;


// fragment DIGITO : [0-9] ;
// fragment DIGITOPAR : [02468] ;

// NUMERO : DIGITO+ ;

// MES_PAR: NUMERO '/' DIGITO DIGITOPAR '/' NUMERO;

// HORA_MANIANA: '0' [89]':' NUMERO  
//             | '1' [012] ':' NUMERO  
//             ;

// HORA_TARDE: '18' ':' [3-5]DIGITO
//           | '19' ':' NUMERO 
//           | '20' ':' NUMERO 
//           | '21' ':' [012]DIGITO
//           | '21:30'        
//           ;

// OTRO : (NUMERO '/' NUMERO '/' NUMERO)|(NUMERO ':' NUMERO);

// WS: [ \t\r\n]+ -> skip;

// si : s;
// s:      MES_PAR {System.out.println("Linea " + $MES_PAR.getLine() + ": MES_PAR -> " + $MES_PAR.getText());} s
//     |   HORA_MANIANA {System.out.println("Linea " + $HORA_MANIANA.getLine() + ": HORA_MANIANA -> " + $HORA_MANIANA.getText());}s
//     |   HORA_TARDE {System.out.println("Linea " + $HORA_TARDE.getLine() + ": HORA_TARDE -> " + $HORA_TARDE.getText());}s
//     |   OTRO   { }s
//     |   EOF
//   ;

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;

INT : 'int';
DOUBLE : 'double';
PYC : ';' ;
IGUAL : '=';
COMA : ',';
PA : '(' ;
PB : ')' ;
LA : '{' ;
LB : '}' ;
WHILE : 'while';

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS: [ \t\r\n]+ -> skip;

// declaracion -> int x;
//                double y;
//                int z = 0;
//                double w, q, t;
//                int a = 5, b, c = 10;
programa : instrucciones EOF;

instrucciones : declaraciones instrucciones
              | asignacion instrucciones
              | while instrucciones
              | 
              ;

declaraciones : INT declaracion 
              | DOUBLE declaracion 
              ;

declaracion : ID PYC
            | asignacion
            | ID COMA declaracion
            ;

// asignacion -> x = 1;
//               z = y;

asignacion  : ID IGUAL oal COMA declaracion
            | ID IGUAL oal PYC
            ;

//puto el que lee

COMP : IGUAL|'!='|'>'|'<';

//while -> while (x comp y) { instrucciones }

while : WHILE PA ID COMP oal PB LA instrucciones LB;

oal : NUMERO
    | ID
    ;


















