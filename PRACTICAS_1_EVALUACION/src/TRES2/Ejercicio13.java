package TRES2;

/* 
 * Ejercicio13.java
 * 	
 * Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros. Devuelve el valor del elemento
 * más frecuente, si hay coincidencia devolvería el primero de ellos.
 * Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} devolvería 4
 * Prueba el método pedido desde main().
 * Una forma sería recorrer el vector anidar un bucle que averigüe la frecuencia del valor de cada elemento,
 * utilizando un par de variables auxiliares para retener la frecuencia máxima y el valor asociado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio13{

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
        
        System.out.println("\nEl número más frecuente es el: "+masFrecuenteInt(array));
    }

    public static int masFrecuenteInt(int[] enteros){ 

        int frecuencia=0;
        int moda=0;
        int cont=0;
                                             
        for(int i=0 ; i<enteros.length; i++){
            for(int j=0;j<enteros.length; j++){

                if(enteros[i]==enteros[j]){
                    cont++;
                }
            }

            if(cont>frecuencia){

                moda=enteros[i];
                frecuencia=cont;
               
            }
            cont=0;
        }
        
        return moda;
    }
        
  }

