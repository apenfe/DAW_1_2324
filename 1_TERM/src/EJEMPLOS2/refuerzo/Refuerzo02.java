package EJEMPLOS2.refuerzo;

/* Refuerzo02.java
 *
 * Realizar un programa que solicite un número entero positivo por teclado y muestre por un lado
 * todos los números impares desde el 1 hasta dicho número y por otro lado muestre todos los
 * números pares desde el 1 hasta dicho número
 * • Utilizar las variables que se consideren oportunas
 * • El programa debe verificar que el número entero sea positivo mayor que 0
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo02 {
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

        for(int i=1; i<=numero; i++){
            
            if(i%2==0){
                System.out.println(i + " - Par. ");
            }else{
                System.out.println(i + " - Impar. ");
            }

        }
        
        System.out.println();
    }
}
