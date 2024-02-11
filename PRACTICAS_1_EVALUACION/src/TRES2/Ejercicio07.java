package TRES2;

/* 
 * Ejercicio07.java
 *
 * Escribe un método que se llame banner() que muestra tus iniciales en la pantalla.
 * Cada inicial se compone sobre una celda en pantalla de 7x7, como en el siguiente ejemplo:
 *
 *      H     H   TTTTTTT     AAA
 *
 *      H     H      T       A   A
 *
 *      H     H      T      A     A
 *
 *      HHHHHHH      T      A     A
 *
 *      H     H      T      AAAAAAA     
 *
 *      H     H      T      A     A
 *
 *      H     H      T      A     A
 *
 * Opcionalmente se pueden utilizar métodos adicionales especializados en generar cada letra. Estos métodos 
 * devuelven un texto formateado adecuadamente según el diseño elegido. En ese caso las iniciales se mostrarán en
 * vertical.
 * Prueba los posibles métodos pedidos desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio07{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("\nLas iniciales de mi nombre son: \n");

        banner();

        System.out.print("A continuación inserte una palabra: ");
        String palabra = teclado.nextLine();

        System.out.println(letras(palabra));

    }

    public static void banner(){   

        String fila1="   AAA   PPPPP   FFFFFFF ";
        String fila2="  A   A  P    P  F       ";
        String fila3=" A     A P     P F       ";
        String fila4=" A     A P    P  FFFFF   ";
        String fila5=" AAAAAAA PPPPP   F       ";
        String fila6=" A     A P       F       ";
        String fila7=" A     A P       F       ";
        
        System.out.println("\t"+fila1);
        System.out.println("\t"+fila2);
        System.out.println("\t"+fila3);
        System.out.println("\t"+fila4);
        System.out.println("\t"+fila5);
        System.out.println("\t"+fila6);
        System.out.println("\t"+fila7);
        System.out.println();

    }

     public static String letras(String letra){

        letra = letra.trim().toLowerCase();
        String palabra="";

        System.out.println();

        for(int i=0; i<letra.length();i++){


            if(letra.charAt(i)=='a'){

                String fila1="  AAA  ";
                String fila2=" A   A ";
                String fila3="A     A";
                String fila4="A     A";
                String fila5="AAAAAAA";
                String fila6="A     A";
                String fila7="A     A";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='b'){
                
                String fila1="BBBBBB ";
                String fila2="B     B";
                String fila3="B     B";
                String fila4="BBBBBB ";
                String fila5="B     B";
                String fila6="B     B";
                String fila7="BBBBBB ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='c'){

                String fila1=" cccccc";
                String fila2="c      ";
                String fila3="c      ";
                String fila4="c      ";
                String fila5="c      ";
                String fila6="c      ";
                String fila7=" cccccc";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='d'){

                String fila1="DDDDD  ";
                String fila2="D    D ";
                String fila3="D     D";
                String fila4="D     D";
                String fila5="D     D";
                String fila6="D    D ";
                String fila7="DDDDD  ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='e'){

                String fila1="EEEEEEE";
                String fila2="E      ";
                String fila3="E      ";
                String fila4="EEEEEEE";
                String fila5="E      ";
                String fila6="E      ";
                String fila7="EEEEEEE";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='f'){

                String fila1="FFFFFFF";
                String fila2="F      ";
                String fila3="F      ";
                String fila4="FFFFF  ";
                String fila5="F      ";
                String fila6="F      ";
                String fila7="F      ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='g'){

                String fila1=" GGGGG ";
                String fila2="G     G";
                String fila3="G      ";
                String fila4="G      ";
                String fila5="G   GGG";
                String fila6="G     G";
                String fila7=" GGGGG ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='h'){

                String fila1="H     H";
                String fila2="H     H";
                String fila3="H     H";
                String fila4="HHHHHHH";
                String fila5="H     H";
                String fila6="H     H";
                String fila7="H     H";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='i'){

                String fila1="IIIIIII";
                String fila2="   I   ";
                String fila3="   I   ";
                String fila4="   I   ";
                String fila5="   I   ";
                String fila6="   I   ";
                String fila7="IIIIIII";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='j'){

                String fila1="JJJJJJJ";
                String fila2="      J";
                String fila3="      J";
                String fila4="      J";
                String fila5="JJ    J";
                String fila6="J    J ";
                String fila7=" JJJJ  ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='k'){

                String fila1="K     K";
                String fila2="K    K ";
                String fila3="K   K  ";
                String fila4="KKKK   ";
                String fila5="K   K  ";
                String fila6="K    K ";
                String fila7="K     K";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='l'){

                String fila1="L      ";
                String fila2="L      ";
                String fila3="L      ";
                String fila4="L      ";
                String fila5="L      ";
                String fila6="L      ";
                String fila7="LLLLLLL";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='m'){

                String fila1="M      M";
                String fila2="MM    MM";
                String fila3="M M  M M";
                String fila4="M  MM  M";
                String fila5="M      M";
                String fila6="M      M";
                String fila7="M      M";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='n'){

                String fila1="N     N";
                String fila2="NN    N";
                String fila3="N N   N";
                String fila4="N  N  N";
                String fila5="N   N N";
                String fila6="N    NN";
                String fila7="N     N";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='o'){

                String fila1=" OOOOO ";
                String fila2="O     O";
                String fila3="O     O";
                String fila4="O     O";
                String fila5="O     O";
                String fila6="O     O";
                String fila7=" OOOOO ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='p'){

                String fila1="PPPPP  ";
                String fila2="P    P ";
                String fila3="P     P";
                String fila4="P    P ";
                String fila5="PPPPP  ";
                String fila6="P      ";
                String fila7="P      ";
                
               palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='q'){

                String fila1=" QQQQQ ";
                String fila2="Q     Q";
                String fila3="Q     Q";
                String fila4="Q     Q";
                String fila5="Q   Q Q";
                String fila6="Q    QQ";
                String fila7=" QQQQQ ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='r'){

                String fila1=" RRRRR ";
                String fila2="R     R";
                String fila3="R     R";
                String fila4="RRRRRR ";
                String fila5="R   R  ";
                String fila6="R    R ";
                String fila7="R     R";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='s'){

                String fila1=" SSSSS ";
                String fila2="S     S";
                String fila3="S      ";
                String fila4="  SS   ";
                String fila5="    SS ";
                String fila6="S     S";
                String fila7=" SSSSS ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='t'){

                String fila1="TTTTTTT";
                String fila2="   T   ";
                String fila3="   T   ";
                String fila4="   T   ";
                String fila5="   T   ";
                String fila6="   T   ";
                String fila7="   T   ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='u'){

                String fila1="U     U";
                String fila2="U     U";
                String fila3="U     U";
                String fila4="U     U";
                String fila5="U     U";
                String fila6=" U   U ";
                String fila7="  UUU  ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='v'){

                String fila1="V     V";
                String fila2="V     V";
                String fila3="V     V";
                String fila4="V     V";
                String fila5=" V   V ";
                String fila6="  V V  ";
                String fila7="   V   ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='w'){

                String fila1="W     W";
                String fila2="W     W";
                String fila3="W  W  W";
                String fila4="W  W  W";
                String fila5="  W W ";
                String fila6=" W   W ";
                String fila7="W     W";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='x'){
        
                String fila1="X     X";
                String fila2=" X   X ";
                String fila3="  X X  ";
                String fila4="   X   ";
                String fila5="  X X  ";
                String fila6=" X   X ";
                String fila7="X     X";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='y'){

                String fila1="Y     Y";
                String fila2=" Y   Y ";
                String fila3="  Y Y  ";
                String fila4="   Y   ";
                String fila5="   Y   ";
                String fila6="   Y   ";
                String fila7="   Y   ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            }else if(letra.charAt(i)=='z'){

                String fila1="ZZZZZZZ";
                String fila2="     Z ";
                String fila3="    Z  ";
                String fila4="   Z   ";
                String fila5="  Z    ";
                String fila6=" Z     ";
                String fila7="ZZZZZZZ";
                
                palabra += "\t" + fila1 + "\n";
                palabra += "\t" + fila2 + "\n";
                palabra += "\t" + fila3 + "\n";
                palabra += "\t" + fila4 + "\n";
                palabra += "\t" + fila5 + "\n";
                palabra += "\t" + fila6 + "\n";
                palabra += "\t" + fila7 + "\n";
                palabra += "\n";

            } 
        }
        
        return palabra;
    }  
}
