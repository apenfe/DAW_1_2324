package TRES3;

/* OK
 * 
 * Ejercicio06.java
 *
 * Escribe un método que se llame bannerLetra() que recibe un carácter como parámetro y devuelve una cadena de
 * caracteres con el texto, formateado sobre una matriz de 7x7, de la letra correspondiente al carácter recibido.
 * Por ejemplo si se introduce la H, la cadena devuelta, al imprimirla, daría:
 *
 *      H     H
 *      H     H
 *      H     H
 *      HHHHHHH
 *      H     H     
 *      H     H
 *      H     H
 *
 * Opcionalmente se pueden utilizar métodos adicionales especializados en generar cada letra. Estos métodos
 * devuelven un texto formateado adecuadamente según el diseño elegido.
 * A fin de hacer menos extenso el ejercicio, no es necesario hacer todas las letras del abecedario; con cuatro 
 * o cinco letras es suficiente. 
 * En el caso de mostrar varias letras, se presentarán en vertical; a fin de hacer más sencillo el ejercicio.
 * Sólo se admiten letras en mayúsculas.
 * Prueba exhaustivamente el métodos pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 19/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio06{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("\nA continuación inserte una palabra (Solo letras de la A a la Z sin Ñ ni acentos): ");
        String palabra = teclado.nextLine().trim().toUpperCase();

        for(int i = 0; i<palabra.length(); i++){

            char letra=palabra.charAt(i);
            System.out.print(bannerLetra(letra));
        
        }

    }

    public static String bannerLetra(char letra){

        letra = Character.toUpperCase(letra);
        String salida="";

        System.out.println();


            if(letra=='A'){

                String fila1="  AAA  ";
                String fila2=" A   A ";
                String fila3="A     A";
                String fila4="A     A";
                String fila5="AAAAAAA";
                String fila6="A     A";
                String fila7="A     A";

                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";
                
            }else if(letra=='B'){
                
                String fila1="BBBBBB ";
                String fila2="B     B";
                String fila3="B     B";
                String fila4="BBBBBB ";
                String fila5="B     B";
                String fila6="B     B";
                String fila7="BBBBBB ";
                
               
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='C'){

                String fila1=" cccccc";
                String fila2="c      ";
                String fila3="c      ";
                String fila4="c      ";
                String fila5="c      ";
                String fila6="c      ";
                String fila7=" cccccc";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='D'){

                String fila1="DDDDD  ";
                String fila2="D    D ";
                String fila3="D     D";
                String fila4="D     D";
                String fila5="D     D";
                String fila6="D    D ";
                String fila7="DDDDD  ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='E'){

                String fila1="EEEEEEE";
                String fila2="E      ";
                String fila3="E      ";
                String fila4="EEEEEEE";
                String fila5="E      ";
                String fila6="E      ";
                String fila7="EEEEEEE";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='F'){

                String fila1="FFFFFFF";
                String fila2="F      ";
                String fila3="F      ";
                String fila4="FFFFF  ";
                String fila5="F      ";
                String fila6="F      ";
                String fila7="F      ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='G'){

                String fila1=" GGGGG ";
                String fila2="G     G";
                String fila3="G      ";
                String fila4="G      ";
                String fila5="G   GGG";
                String fila6="G     G";
                String fila7=" GGGGG ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='H'){

                String fila1="H     H";
                String fila2="H     H";
                String fila3="H     H";
                String fila4="HHHHHHH";
                String fila5="H     H";
                String fila6="H     H";
                String fila7="H     H";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='I'){

                String fila1="IIIIIII";
                String fila2="   I   ";
                String fila3="   I   ";
                String fila4="   I   ";
                String fila5="   I   ";
                String fila6="   I   ";
                String fila7="IIIIIII";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='J'){

                String fila1="JJJJJJJ";
                String fila2="      J";
                String fila3="      J";
                String fila4="      J";
                String fila5="JJ    J";
                String fila6="J    J ";
                String fila7=" JJJJ  ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='K'){

                String fila1="K     K";
                String fila2="K    K ";
                String fila3="K   K  ";
                String fila4="KKKK   ";
                String fila5="K   K  ";
                String fila6="K    K ";
                String fila7="K     K";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='L'){

                String fila1="L      ";
                String fila2="L      ";
                String fila3="L      ";
                String fila4="L      ";
                String fila5="L      ";
                String fila6="L      ";
                String fila7="LLLLLLL";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='M'){

                String fila1="M      M";
                String fila2="MM    MM";
                String fila3="M M  M M";
                String fila4="M  MM  M";
                String fila5="M      M";
                String fila6="M      M";
                String fila7="M      M";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='N'){

                String fila1="N     N";
                String fila2="NN    N";
                String fila3="N N   N";
                String fila4="N  N  N";
                String fila5="N   N N";
                String fila6="N    NN";
                String fila7="N     N";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='O'){

                String fila1=" OOOOO ";
                String fila2="O     O";
                String fila3="O     O";
                String fila4="O     O";
                String fila5="O     O";
                String fila6="O     O";
                String fila7=" OOOOO ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='P'){

                String fila1="PPPPP  ";
                String fila2="P    P ";
                String fila3="P     P";
                String fila4="P    P ";
                String fila5="PPPPP  ";
                String fila6="P      ";
                String fila7="P      ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='Q'){

                String fila1=" QQQQQ ";
                String fila2="Q     Q";
                String fila3="Q     Q";
                String fila4="Q     Q";
                String fila5="Q   Q Q";
                String fila6="Q    QQ";
                String fila7=" QQQQQ ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='R'){

                String fila1=" RRRRR ";
                String fila2="R     R";
                String fila3="R     R";
                String fila4="RRRRRR ";
                String fila5="R   R  ";
                String fila6="R    R ";
                String fila7="R     R";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='S'){

                String fila1=" SSSSS ";
                String fila2="S     S";
                String fila3="S      ";
                String fila4="  SS   ";
                String fila5="    SS ";
                String fila6="S     S";
                String fila7=" SSSSS ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='T'){

                String fila1="TTTTTTT";
                String fila2="   T   ";
                String fila3="   T   ";
                String fila4="   T   ";
                String fila5="   T   ";
                String fila6="   T   ";
                String fila7="   T   ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='U'){

                String fila1="U     U";
                String fila2="U     U";
                String fila3="U     U";
                String fila4="U     U";
                String fila5="U     U";
                String fila6=" U   U ";
                String fila7="  UUU  ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='V'){

                String fila1="V     V";
                String fila2="V     V";
                String fila3="V     V";
                String fila4="V     V";
                String fila5=" V   V ";
                String fila6="  V V  ";
                String fila7="   V   ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='W'){

                String fila1="W     W";
                String fila2="W     W";
                String fila3="W  W  W";
                String fila4="W  W  W";
                String fila5="  W W ";
                String fila6=" W   W ";
                String fila7="W     W";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='X'){
        
                String fila1="X     X";
                String fila2=" X   X ";
                String fila3="  X X  ";
                String fila4="   X   ";
                String fila5="  X X  ";
                String fila6=" X   X ";
                String fila7="X     X";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='Y'){

                String fila1="Y     Y";
                String fila2=" Y   Y ";
                String fila3="  Y Y  ";
                String fila4="   Y   ";
                String fila5="   Y   ";
                String fila6="   Y   ";
                String fila7="   Y   ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else if(letra=='Z'){

                String fila1="ZZZZZZZ";
                String fila2="     Z ";
                String fila3="    Z  ";
                String fila4="   Z   ";
                String fila5="  Z    ";
                String fila6=" Z     ";
                String fila7="ZZZZZZZ";
                
                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

            }else{
                
                return"Error ---> Solo son validas letras de la A a la Z sin acentos ni la Ñ.\n";

            }
        
    }  
}
