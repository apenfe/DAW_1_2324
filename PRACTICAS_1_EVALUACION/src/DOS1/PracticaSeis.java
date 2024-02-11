package DOS1;

/* Practica Seis.
 * Escribe un programa simple que pida al usuario un texto y compruebe si se trata de la palabra "Java" exactamente.
 * Buscar información sobre como comparar cadenas de caracteres en Java.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

import java.util.Scanner;

public class PracticaSeis{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");

        String opcion = teclado.nextLine();

        if(opcion.equals("Java")){
            System.out.println("La palabra es exactamente \"Java\".");
        }else{
            System.out.println("La palabra es diferente de\"Java\".");
        }

    }
}
