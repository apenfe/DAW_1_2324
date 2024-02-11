package TRES2;

/* 
 * Ejercicio18.java
 * 	
 * Escribe un método que se llame buscarNumero() que recibe un vector ordenado de enteros y un valor. Devuelve el
 * índice de la posición de ese valor dentro del array recibido utilizando una búsqueda binaria.
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio18{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int[] enteros = {-10,-6,0,6,8,10,23,24,25,34,36,56,100,123,124,125,200,234,235};

        System.out.print("\n¿Que término desea buscar? ");
        int valor = teclado.nextInt();

        if(buscarNumero(enteros,valor)>=0){

            System.out.println("\n\tEl termino "+ valor+" se encuentra en la posición: "+buscarNumero(enteros,valor));

        }else{

            System.out.println("\n\tEl termino "+ valor+" no se encuentra en el array.");

        }

    }

    public static int buscarNumero(int[] enteros, int valor){ 

        int inf = 1, sup=enteros.length, med=(sup+1)/2;

        while((enteros[med]<valor||enteros[med]>valor) && inf <= sup){
            
            if(enteros[med]>valor){
                sup=med-1;
            }else{
                inf=med+1;
            }
            
            med=(inf+sup)/2;
        }

        if(enteros[med]==valor){
            return med;
        }else{
            return -1;
        }

    }
        
  }
