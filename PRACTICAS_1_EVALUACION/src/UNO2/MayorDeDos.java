package UNO2;

/**
 * Escribe un programa simple Java, que lea dos números y que escriba el mayor de los dos.
 * Autor: Adrian Penalver Fernandez
 * 23/09/23
 */

import java.util.Scanner;

public class MayorDeDos{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el primer número: ");
        String num1 = teclado.nextLine();
        System.out.print("Escriba el segundo número: ");
        String num2 = teclado.nextLine();

        int numero1 = Integer.parseInt(num1); // convertimos los string en numeros enteros.
        int numero2 = Integer.parseInt(num2);

            if (numero1 < numero2){
                System.out.println("El segundo número es mayor: " + numero2);
            }
            else if (numero2 < numero1){
                System.out.println("El primer número es mayor: " + numero1);
            }
            else{
                System.out.println("Los números son iguales.");
            }

    }
}
