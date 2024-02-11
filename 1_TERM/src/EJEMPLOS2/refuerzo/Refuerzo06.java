package EJEMPLOS2.refuerzo;

/* Refuerzo06.java
 *
 * • Crear un programa que solicite al usuario un número entero positivo
 * • Utilizar una estructura iterativa para detectar el número de dígitos que tiene el número
 * • Mostrar el número de dígitos que tiene el número introducido
 * • Ayuda: puedes utilizar operacion/es aritméticas para realizarlo
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo06 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=0, count=0;

        while(num1<=0){

            System.out.print("Introduzca el número entero nº 1: ");
            num1 = teclado.nextInt();
    
            if(num1<=0){
                System.out.println("Introduce números mayores que 0. \n");
            }

        }

        while(num1>0){

        count++;

        num1/=10;

        }


        System.out.println("El número tiene " + count + " dígitos.");

    }
}
