package EJEMPLOS1;

import java.util.Scanner;

public class Ejemplo04{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba su nombre a continuación y pulse enter: ");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: " + nombre);

    }
}
