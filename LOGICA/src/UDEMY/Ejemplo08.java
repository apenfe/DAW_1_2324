/* 
 * Ejercicio08.java
 *
 * Dado un numero, cogelo y ponlo al reves.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo08{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println();       
              
        System.out.println(invertirNumero(num1)); 

    }

    public static int invertirNumero(int num1){

        int num;

        String numero = Integer.toString(num1);
        String numero2 = "";

        for(int i= numero.length()-1; i>=0; i--){

            numero2 += numero.charAt(i);

        }

        num= Integer.parseInt(numero2);

        return num;
         
    }

}
