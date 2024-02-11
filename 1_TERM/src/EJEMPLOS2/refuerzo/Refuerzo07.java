package EJEMPLOS2.refuerzo;

/* Refuerzo07.java
 *
 * • Crear un programa que pida al usuario que ingrese la cantidad de términos de la secuencia Fibonacci que desea generar.
 * • Utiliza un bucle para generar y mostrar la secuencia de Fibonacci correspondiente.
 * • Ayuda: La secuencia de Fibonacci
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;

public class Refuerzo07 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=0, n1=2, n2=1,sum;

        while(num1<=0){

            System.out.print("Introduzca el número de terminos de la serie Fibonacci que desea calcular: ");
            num1 = teclado.nextInt();
    
            if(num1<=0){
                System.out.println("Introduce números mayores que 0. \n");
            }

        }

        System.out.print(1+ " "+1+" "+2+" ");
        for(int i=2; i<=num1-2; i++){

                System.out.print((n1)+(n2)+" "); 
            sum=n1+n2;
           n2=n1;
         n1=sum;
          
           
        
        }

    }
}
