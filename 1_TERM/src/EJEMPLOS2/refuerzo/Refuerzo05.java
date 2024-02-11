package EJEMPLOS2.refuerzo;

/* Refuerzo05.java
 *
 * • Solicitar al usuario que ingrese un primer número entero (num1).
 * • Solicitar al usuario que ingrese un segundo número entero (num2).
 * • Utilizar un bucle para imprimir la tablas de multiplicar del 1 al 10 de num1 hasta num2
 * • Ejemplo: si num1 es 5 y num2 es 10 se tienen que imprimir las tablas de multiplicar del 5, del 6, del 7 del 8,del 9 y del 10 (del 1 al 10)
 * • El programa debe verificar que los dos números enteros introducidos sean positivos mayores que 0
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo05 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=0, num2=0;

        while(num1<=0 || num2<=0){

            System.out.print("Introduzca el número entero nº 1: ");
            num1 = teclado.nextInt();
            System.out.print("Introduzca el número entero nº2: ");
            num2 = teclado.nextInt();
    
            if(num1<=0 || num2<=0){
                System.out.println("Introduce números mayores que 0. \n");
            }

        }

        for(int i=num1; i<=num2; i++){
            for(int j=1; j<=10; j++){

                System.out.println(j + " x " + i + " = " + (j*i));

            }  
             System.out.println();
        }

    }
}
