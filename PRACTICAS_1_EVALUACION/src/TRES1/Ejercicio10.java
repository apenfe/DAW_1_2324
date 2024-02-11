package TRES1;

/* 
 * Ejercicio10.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que se llame buscarInt() que recibe un vector de enteros y un valor a buscar dentro del vector.
 * Devuelve el índice de la primera ocurrencia dentro del vector proporcionado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} si se busca 4 devolvería 3.
 * Prueba el método pedido desde main().
 * Hay que recorrer el vector secuencialmente y si se encuentra hay que terminar sin llegar al final del recorrido.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String argumentos[]) {

        Scanner teclado= new Scanner(System.in);
        int tamano=-1;

        while(tamano<=0){
            
            System.out.print("Introduce el número de elementos del vector: ");
            tamano= teclado.nextInt();

            if(tamano<=0){
                System.out.println("El número debe ser mayor que 0.\n");
            }

        }

        int array[] = new int[tamano];
     
        System.out.println();
        for(int i=0; i<tamano; i++){
           System.out.print("Introduce el número "+i+" del vector: "); 
           array[i]=teclado.nextInt();
        }

        System.out.println();
        System.out.print("Introduce el número a buscar: ");
        int num= teclado.nextInt();

        if(buscarInt(array,num)<0){
            System.out.println("\nEl número no se encuentra en el array.");
        }else{
            System.out.println("\nEl número se encuentra en la posición: "+buscarInt(array,num));
        }

	}

    public static int buscarInt(int[]vector ,int numero) {

            int resultado=-1;
            for(int i=0; i<vector.length;i++){
                if(vector[i]==numero){
                    resultado=i;
                    break;
                }
            }
 
        return resultado;
	}

}
