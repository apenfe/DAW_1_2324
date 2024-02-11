package EJEMPLOS2.refuerzo;

/* Refuerzo04.java
 *
 * • Solicitar al usuario que ingrese un número entero.
 * • Utilizar un bucle para imprimir la tabla de multiplicar de ese número desde 1 hasta 10.
 * • El programa debe verificar que el número entero sea positivo mayor que 0
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo04 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero=0;

        while(numero<=0){

            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextInt();
    
            if(numero<=0){
                System.out.println("Introduce un número mayor que 0. \n");
            }

        }

        for(int i=1; i<=10; i++){
            
            System.out.println(i + " x " + numero + " = " + (numero*i));     

        }

    }
}
