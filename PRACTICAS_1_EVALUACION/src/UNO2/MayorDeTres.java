package UNO2;

/**
 * Escribe un programa simple Java, basado en Saludos.java, que pida y visualice el nombre y la edad de dos personas en dos líneas diferentes.
 * Autor: Adrian Penalver Fernandez
 * 22/09/23
 */

import java.util.Scanner;

public class MayorDeTres{
    public static void main(String[] args){

          // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el número 1: ");
        String num1 = teclado.nextLine();
        System.out.print("Escriba el número 2: ");
        String num2 = teclado.nextLine();
        System.out.print("Escriba el número 3: ");
        String num3 = teclado.nextLine();
        System.out.print("");

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int numero3 = Integer.parseInt(num3);

            if (numero1 > numero2 && numero1 > numero3){
                System.out.println("El numero 1 es el mayor: " + numero1);
            }
            else if (numero2 > numero3){
                System.out.println("El numero 2 es el mayor: " + numero2);
            }
            else{
                System.out.println("El numero 3 es el mayor: " + numero3);
            }
    }
}
