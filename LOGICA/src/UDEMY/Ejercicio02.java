/* 
 * Ejercicio02.java
 *
 * Dada una cadena de texto, comprobar si es palindromo o no.
 * Los palíndromos son palabras que se leen igual aunque estén invertidas.
 * Como: ana, bob, otto, allivesevilla
 * No tener en cuenta espacios ni simbolos raros
 *
 * Funcion palindromo acepta palabra y devuelve true o false
 *
 * Adrián Peñalver Fernández
 *
 */

package UDEMY;

import java.util.Scanner;

public class Ejercicio02{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca una palabra para saber si es un Palíndromo: ");
        String palabra = teclado.nextLine().trim().toLowerCase();

        System.out.println();        
        
        if(palindromo(palabra)){
            System.out.print(palabra + " es un palíndromo.\n");
        }else{
            System.out.print(palabra + " NO es un palíndromo.\n");
        }

    }

    public static boolean palindromo(String palabra){

        for(int i=0 ; i<palabra.length(); i++){

            if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){
                return false;
            }
    
        }

        return true;

    }

}