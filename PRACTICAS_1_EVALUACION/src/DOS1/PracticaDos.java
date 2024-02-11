package DOS1;

/* Practica Dos.
 * Escribe un programa simple que muestre tus iniciales en la pantalla de 
 * manera más o menos centrada. Compón cada inicial sobre una celda en 
 * pantalla de 7x7, como en el siguiente ejemplo:
 *
 *                             H     H   TTTTTTT     AAA
 *                             H     H      T       A   A
 *                             H     H      T      A     A
 *                             HHHHHHH      T      A     A
 *                             H     H      T      AAAAAAA     
 *                             H     H      T      A     A
 *                             H     H      T      A     A
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

public class PracticaDos{

    public static void main(String [] args){

        String fila1="   AAA   PPPPP   FFFFFFF ";
        String fila2="  A   A  P    P  F       ";
        String fila3=" A     A P     P F       ";
        String fila4=" A     A P    P  FFFFF   ";
        String fila5=" AAAAAAA PPPPP   F       ";
        String fila6=" A     A P       F       ";
        String fila7=" A     A P       F       ";

        String dibujo[][]={{" "," ","A","A","A"," "," "," ","P","P","P","P","P"," "," "," ","F","F","F","F","F","F","F"," "},
                            {" ","A"," "," "," ","A"," "," ","P"," "," "," "," ","P"," "," ","F"," "," "," "," "," "," "," "},
                            {"A"," "," "," "," "," ","A"," ","P"," "," "," "," "," ","P"," ","F"," "," "," "," "," "," "," "},
                            {"A"," "," "," "," "," ","A"," ","P"," "," "," "," ","P"," "," ","F","F","F","F","F"," "," "," "},
                            {"A","A","A","A","A","A","A"," ","P","P","P","P","P"," "," "," ","F"," "," "," "," "," "," "," "},
                            {"A"," "," "," "," "," ","A"," ","P"," "," "," "," "," "," "," ","F"," "," "," "," "," "," "," "},
                            {"A"," "," "," "," "," ","A"," ","P"," "," "," "," "," "," "," ","F"," "," "," "," "," "," "," "}};

    System.out.println("Siglas usando matriz: \n");

    for(int i=0; i<7; i++){
        for(int j=0; j<24; j++){

            System.out.print(dibujo[i][j]);
    
        }
        System.out.println("");
    }

    System.out.println("");
    System.out.println("Siglas usando Strings: \n");
    System.out.println(fila1);
    System.out.println(fila2);
    System.out.println(fila3);
    System.out.println(fila4);
    System.out.println(fila5);
    System.out.println(fila6);
    System.out.println(fila7);

    }
}
