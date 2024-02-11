package TRES2;

/* 
 * Ejercicio14.java
 * 	
 * Escribe un método que se llame buscarSecuenciaInt() que recibe dos vectores de enteros, el segundo es una
 * secuencia de valores a buscar en el primer vector. Devuelve el índice donde empieza la primera ocurrencia 
 * de la secuencia buscada.
 * Por ejemplo: {4, 3, 1, 4, 2, 5, 8} y {4, 2, 5} devolvería 3.
 * Prueba el método pedido desde main().
 * Hay que recorrer el vector secuencialmente comprobando coincidencia con el primer elemento de la secuencia
 * buscada. Después hay que comprobarla completamente con otro bucle. Si hay coincidencia completa termina sin
 * llegar al final del recorrido.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio14{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int tamano=0;

        while(tamano<=0){

            System.out.print("¿De que tamaño desea el array base? ");
            tamano = teclado.nextInt();

            if(tamano<=0){
                
                System.out.println("\n\tEl número insertado debe ser mayor que 0. Inserte otro número.\n");

            }

        }

        int[] array1=new int[tamano];

        System.out.println();

        for(int i=0; i<array1.length; i++){
            System.out.print("Introduzaca el término "+(i+1)+": ");
            array1[i] = teclado.nextInt();
        }

        tamano=0;

        while(tamano<=0){

            System.out.print("\n¿De que tamaño es la coincidencia a buscar? ");
            tamano = teclado.nextInt();

            if(tamano<=0){
                
                System.out.println("\n\tEl número insertado debe ser mayor que 0. Inserte otro número.\n");

            }

        }

        int[] array2=new int[tamano];

        System.out.println();

        for(int i=0; i<array2.length; i++){
            System.out.print("Introduzaca el término "+(i+1)+": ");
            array2[i] = teclado.nextInt();
        }
        
        System.out.println("\nLa coincidencia empieza en: "+ buscarSecuenciaInt(array1,array2));
    }

    public static int buscarSecuenciaInt(int[] enteros1, int[] enteros2){ 
  
        int cont=0;
                        
        for(int i=0 ; i<enteros1.length; i++){

            segundo: for(int j=0;j<enteros2.length; j++){

                if(enteros1[i+j]==enteros2[j]){
                    cont++;
                }
            }
            
            if(cont==enteros2.length){
                return i;
            }else{
                cont=0;
            }

        }

        return -1;
        
    }
        
  }
