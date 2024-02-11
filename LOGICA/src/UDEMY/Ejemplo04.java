/* 
 * Ejercicio04.java
 *
 * Dada una palabra, darle la vuelta a esta e imprimirla.
 *
 * No utilizar funciones del lenguaje.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo04{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca una palabra: ");
        String palabra = teclado.nextLine().trim();
        System.out.println();        
              
        truncar(palabra); 

    }

    public static void truncar(String palabra){

        for(int i= palabra.length()-1; i>=0; i--){

            System.out.print(palabra.charAt(i));

        }

        System.out.println();
         
    }

}
