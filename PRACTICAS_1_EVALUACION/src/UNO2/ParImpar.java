package UNO2;

/**
 * Escribe un programa simple Java, basado en Saludos.java, que lea un número e indique si es par o impar.
 * Autor: Adrian Penalver Fernandez
 * 22/09/23
 */

import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el número: ");
        String numero1 = teclado.nextLine();
        int num1 = Integer.parseInt(numero1);

        if (num1 % 2 == 0){ // esta funcion modulo devuelve el resto, por lo que si es 0, se trata de un numero par
            System.out.println("El numero es par.");
        }
        else{
            System.out.println("El numero es impar.");
        }

    }
}
