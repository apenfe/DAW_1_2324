package TRES2;

/* 
 * Ejercicio12.java
 * 	
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. Devuelve true si está ordenado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} devolvería false.
 * Prueba el método pedido desde main().
 * Hay que recorrer el vector secuencialmente comprobando por parejas y si se encuentra un par de elementos
 * desordenados hay que terminar sin llegar al final del recorrido.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio12{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int tamano=0;

        while(tamano<=0){

            System.out.print("¿De que tamaño desea el array? ");
            tamano = teclado.nextInt();

            if(tamano<=0){
                
                System.out.println("\n\tEl número insertado debe ser mayor que 0. Inserte otro número.\n");

            }

        }

        int[] array=new int[tamano];

        System.out.println();        

        for(int i=0; i<array.length; i++){
            System.out.print("Introduzaca el término "+(i+1)+": ");
            array[i] = teclado.nextInt();
        }
        
        if(yaOrdenadoInt(array)){

            System.out.println("\nEl array está ordenado.");

        }else{

            System.out.println("\nEl array no está ordenado.");

        }
    }

    public static boolean yaOrdenadoInt(int[] enteros){ 
                                             
        for(int i=1 ; i<enteros.length; i++){
            
            if(enteros[i]<enteros[i-1]){
               return false;
            }
        }
        
        return true;
    }
        
  }

