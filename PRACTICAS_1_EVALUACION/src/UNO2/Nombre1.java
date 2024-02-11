package UNO2;

/**
 * Escribe un programa simple Java, basado en Saludos.java, que pida y visualice el nombre y la edad de dos personas en dos líneas diferentes.
 * Autor: Adrian Penalver Fernandez
 * 22/09/23
 */

import java.util.Scanner;

public class Nombre1{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el nombre de la persona nº 1: ");
        String nombre1 = teclado.nextLine();
        System.out.print("Edad la persona nº 1: ");
        int a = teclado.nextInt();

        teclado.nextLine(); // vaciar el buffer tras la lectura de un numero

        System.out.print("Escriba el nombre de la persona nº 2: ");
        String nombre2 = teclado.nextLine();
        System.out.print("Edad la persona nº 2: ");
        int b = teclado.nextInt();

 /**
  * También se puede hacer de la siguiente forma:
  *
  * System.out.print("Escriba el nombre de la persona nº 2: ");
  * String nombre2 = teclado.nextLine();
  * System.out.print("Edad la persona nº 2: ");
  * String b = teclado.nextLine();
  * 
  * int numero = Integer.parseInt(b);
  */
    

        System.out.println("El nombre de la persona nº1 es: " + nombre1 + " Y su edad es: " + a + " años.");
       
        System.out.println("El nombre de la persona nº2 es: " + nombre2 + " Y su edad es: " + b + " años.");

    }
}
