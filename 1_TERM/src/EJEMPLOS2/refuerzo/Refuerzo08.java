package EJEMPLOS2.refuerzo;

/* Refuerzo08.java
 *
 * • Crear un programa que solicite al usuario que introduzca una serie de números enteros positivos
 * • El usuario introducirá cada número separandolos con la tecla intro
 * • La introducción de los números se terminará cuando el usuario introduzca el número 0
 * • El programa mostrar por pantalla la cantidad de números pares que se han introducido y la cantidad de números impares que se han introducido
 * • Ampliación: El programa verificará (a lo largo de la introducción de los números) que cada número introducido es un número entero positivo y sino lo es mostrará un mensaje que ese
 * número no se va a tener en cuenta para el cálculo de las cantidades de números pares y de números impares
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo08 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=1, par=0, impar=0;

        while(num1>0){

            System.out.print("Introduzca el número entero positivo: ");
            num1 = teclado.nextInt();
    
            if(num1<=0){
                System.out.println("Introduce números mayores que 0. \n");
                break;
            } else if(num1%2 == 0){
                par=par+1;
            }else{
                impar=impar+1;
            }

        }

        System.out.println("Número de pares: "+par);
        System.out.println("Número de impares: "+impar);

    }
}
