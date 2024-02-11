package DOS2;

/* Ejercicio01.java
 *
 * Escribe un programa simple que pida tres datos de tipo entero por teclado, los guarde y los muestre ordenados por pantalla.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int numeros[]={0,0,0};
        int aux;

        System.out.println("A continuación deberá introducir tres números enteros: ");

        for(int i=1; i<=3; i++){
            System.out.print("\tIntroduzca el número "+i+": ");
            numeros[i-1] = teclado.nextInt();
        }
        
        for(int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                if(numeros[j]<numeros[j+1]){
                    aux = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = aux;

                }
            }
        }
        
        System.out.println("\nLa ordenación de mayor a menor es: \n");
        for(int i=0; i<=2; i++){
            System.out.print(" " + numeros[i]);
        }

        System.out.println();
        
        System.out.println("\nLa ordenación de menor a mayor es: \n");

        for(int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                if(numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;

                }
            }
        }

        for(int i=0; i<=2; i++){
            System.out.print(" " + numeros[i]);
        }
        System.out.println();

    }
}
