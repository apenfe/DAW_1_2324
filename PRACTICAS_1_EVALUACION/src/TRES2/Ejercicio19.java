package TRES2;

/* 
 * Ejercicio19.java
 * 	
 * Escribe un método que se llame ordenarBurbuja() que recibe un vector de enteros para ordenarlos por el método
 * de la burbuja . Devuelve 1 si ha ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido
 * ordenar.
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio19{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int[] enteros = {0,-5,89,34,23,56,2,1,45,47,43,43,22};
        int[] enteros1 = {0,3,7,23,56,75,83,93,122};
        int[] enteros2 = {3,3,3,3,3,3,3,3,3,3,3,3};

        System.out.print("\nEl vector es: {");

        for(int i=0; i<enteros.length; i++){

            if(i==enteros.length-1){
                System.out.print(" "+enteros[i]);
            }else{
                System.out.print(" "+enteros[i]+",");
            }
        }

        System.out.print(" }");

        System.out.println();

        if(ordenarBurbuja(enteros)==1){

            System.out.println("\n\tEl vector estaba desordenado y se ha ordenado.\n");

        }else if(ordenarBurbuja(enteros)==0){

            System.out.println("\n\tEl vector estaba ordenado\n");

        }else{

            System.out.println("\n\tEl vector no se ha podido ordenar porque todos los numeros son iguales\n");

        }
     
    }

    public static int ordenarBurbuja(int[] enteros){ 

        int aux=0, cont=1;
        boolean check=false;

        for(int i=1; i<enteros.length; i++){
            if(enteros[i]==enteros[i-1]){
                cont++;
            }
        }

        if(cont==enteros.length){
            return -1;
        }

        for(int i=1; i<enteros.length; i++){
            for(int j=0; i<enteros.length-i; i++){

                if(enteros[j]>enteros[j+1]){
                    
                    aux=enteros[j];
                    enteros[j]=enteros[j+1];
                    enteros[j+1]=aux;

                    check=true;

                }
            }
        }

        if(check){
            return 1;
        }else{
            return 0;
        }

    }      
  }
