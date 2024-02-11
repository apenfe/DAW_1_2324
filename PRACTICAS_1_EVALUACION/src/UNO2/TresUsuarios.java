package UNO2;

/**
 * Escribe un programa simple Java que incorpore las sentencias necesarias para leer los datos de tres personas
 * (nombre, apellidos, nif y dirección postal) desde el teclado, los guarde y los muestre, en pantalla; se deben
 * mostrar en orden inverso, primero los datos de la última persona.
 *
 * Autor: Adrian Penalver Fernandez
 * 22/09/23
 */

import java.util.Scanner;

public class TresUsuarios{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el nombre de la persona nº 1: ");
        String nombre1 = teclado.nextLine();
        System.out.print("Escriba los apellidos de la persona nº 1: ");
        String apellido1 = teclado.nextLine();
        System.out.print("NIF de la persona nº 1: ");
        String nif1 = teclado.nextLine();
        System.out.print("Dirección postal de la persona nº 1: ");
        String direccion1 = teclado.nextLine();
        System.out.println("");

        System.out.print("Escriba el nombre de la persona nº 2: ");
        String nombre2 = teclado.nextLine();
        System.out.print("Escriba los apellidos de la persona nº 2: ");
        String apellido2 = teclado.nextLine();
        System.out.print("NIF de la persona nº 2: ");
        String nif2 = teclado.nextLine();
        System.out.print("Dirección postal de la persona nº 2: ");
        String direccion2 = teclado.nextLine();
        System.out.println("");

        System.out.print("Escriba el nombre de la persona nº 3: ");
        String nombre3 = teclado.nextLine();
        System.out.print("Escriba los apellidos de la persona nº 3: ");
        String apellido3 = teclado.nextLine();
        System.out.print("NIF de la persona nº 3: ");
        String nif3 = teclado.nextLine();
        System.out.print("Dirección postal de la persona nº 3: ");
        String direccion3 = teclado.nextLine();
        System.out.println("");
      
        System.out.println("El nombre de la persona nº3 es: " + nombre3 +" "+ apellido3 + " ,NIF: " + nif3 + " ,Dirección: " + direccion3); //entero por encima

        System.out.println("El nombre de la persona nº2 es: " + nombre2 +" "+ apellido2 + " ,NIF: " + nif2 + " ,Dirección: " + direccion2); //entero por encima

        System.out.println("El nombre de la persona nº1 es: " + nombre1 +" "+ apellido1 + " ,NIF: " + nif1 + " ,Dirección: " + direccion1); //entero por encima
       
      

    }
}
