package DOS1;

/* Practica Siete.
 * Escribe un programa simple que pida al usuario un texto y compruebe si se trata de la palabra "Java", independientemente
 * de ser mayúsculas, minúsculas e ignorando espacios en blanco tanto por la izquierda por la derecha.
 * Buscar información sobre como comparar cadenas de caracteres en Java.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

import java.util.Scanner;

public class PracticaSiete{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");

        String opcion = teclado.nextLine();

        opcion=opcion.trim();

        if(opcion.equalsIgnoreCase("Java")){
             System.out.println("La palabra es \"Java\".");
           
        }else{
            System.out.println("La palabra es diferente de \"Java\".");
        }

    }
}
