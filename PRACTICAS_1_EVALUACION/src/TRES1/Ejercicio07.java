package TRES1;

/* 
 * Ejercicio07.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que se llame frecuenciaNumero() que recibe un vector de enteros y un número. Devuelve la
 * frecuencia entre los elementos del vector del número recibido.
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio07{
    public static void main(String argumentos[]) {

        Scanner teclado= new Scanner(System.in);
        int tamano = -1;
        
        System.out.print("Introduce el número del que desea saber la frecuencia: ");
        int numero= teclado.nextInt();

        while(tamano<=0){

            System.out.print("Introduce el número de elementos del vector: ");
            tamano= teclado.nextInt();

            if(tamano<=0){
                System.out.println("El número debe ser mayor que 0.\n");
            }
        }
        
        int array[] = new int[tamano];

        for(int i=0; i<tamano; i++){
           System.out.print("Introduce el término "+i+" del vector: "); 
           array[i]=teclado.nextInt();
        }

        System.out.println("\nLa frecuencia del número "+numero+" en el vector, es de: "+frecuenciaNumero(array,numero)+" veces.");

	}

    public static int frecuenciaNumero(int[]vector,int numero) {

        int cont=0;

        for(int i=0; i<vector.length; i++){
            if(vector[i]==numero){
                cont++;
            }
        }
           
        return cont;
	}

}
