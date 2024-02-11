package EJEMPLOS1;

import java.util.Scanner;

public class Ejemplo05{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el primer número: ");
        int a = teclado.nextInt();
        System.out.print("Escriba el segundo número: ");
        int b = teclado.nextInt();

        System.out.println("La multiplicación es: " + a*b);

        teclado.close(); //cerrar teclado

    }
}
