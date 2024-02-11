package EJEMPLOS2.refuerzo;

/* Refuerzo03.java
 *
 * • Realizar un programa que un número entero positivo.
 * • Utilizar un bucle para sumar todos los números pares desde 1 hasta ese número
 * • Utilizar otro bucle para sumar todos los números impares hasta ese número
 * • Muestra los dos resultados obtenidos al final
 * • El programa debe verificar que el número entero sea positivo mayor que 0
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo03 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero=0;
        int sumaImpar=0;
        int sumaPar=0;

        while(numero<=0){

            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextInt();
    
            if(numero<=0){
                System.out.println("Introduce un número mayor que 0. \n");
            }

        }

        for(int i=1; i<=numero; i++){
            
            if(i%2==0){
                sumaPar+=i;
            }else{
                sumaImpar+=i;
            }

        }
        
        System.out.println("Suma de Pares: " + sumaPar);
        System.out.println("Suma de Impares: " + sumaImpar);
    }
}
