package UNO2;

/**
 * Escribe un programa simple en Java, que lea un número correspondiente a una edad e indique lo siguiente:
 * Menor, edad de trabajar, jubilado o numero no valido.
 * Autor: Adrian Penalver Fernandez
 * 22/09/23
 */

import java.util.Scanner;

public class ComprobarEdad{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba su edad: ");
        String num1 = teclado.nextLine();

        int numero1 = Integer.parseInt(num1);

            if (numero1 < 18 && numero1 > 0){ // comprobamos si es menor de 18 y mayor que 0
                System.out.println("Menor de edad.");
            }
            else if (numero1>=18 && numero1 < 65){ // comprobamos si es mayor o igual a 18 y menor de 65
                System.out.println("Adulto en edad de trabajar.");
            }
            else if (numero1>=65){ // comprobamos si es mayor o igual de 65
                System.out.println("Jubilado.");
            }
            else{
                System.out.println("Número incorrecto");
            }

    }
}
