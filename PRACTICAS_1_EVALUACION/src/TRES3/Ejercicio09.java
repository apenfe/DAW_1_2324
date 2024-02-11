package TRES3;

/* OK
 * 
 * Ejercicio09.java
 *
 * Escribe un método que se llame ordenarMergeSort() que recibe un vector de enteros para ordenarlos por el
 * algoritmo MergeSort . Devuelve 1 si ha ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha
 * podido ordenar.
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 *
 * Adrián Peñalver Fernández
 *
 * 19/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio09{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int[] numeros={5,2,3,7,8,3,2,2};
        //int[] numeros={2,3,4,8,14,16};
        
         System.out.print("\nEl array inicialmente es: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");

        }

        int resultado=ordenarMergeSort(numeros, 0, numeros.length-1);

        if(resultado==0){

            System.out.print("\nEl array ya estaba ordenado.");
            System.out.println("\n");

        }else if(resultado==1){

            System.out.print("\nEl array no estaba ordenado, finalmente es:   ");
            for(int i=0; i<numeros.length; i++){
                System.out.print(numeros[i]+" ");
            }
            System.out.println("\n");

        }else{

            System.out.print("\nEl array no se ha podido ordenar.");
            System.out.println("\n");

        }

    }

    public static int ordenarMergeSort(int[] numeros, int inicio, int fin){

        int sol;

            if(inicio<fin){

                int centro = (inicio+fin)/2;

                ordenarMergeSort(numeros, inicio, centro);
                ordenarMergeSort(numeros, centro+1, fin);

                sol=merge(numeros, inicio, centro, fin);

            }else{
                sol=-1;
            }

        return sol;

    }

    public static int merge(int[] numeros, int inicio, int centro, int fin){

        int i, j, k, resul=0;
        int[] auxArray=new int[numeros.length];

        for(i=0; i<auxArray.length; i++){

            auxArray[i]= numeros[i];
        }

        i=inicio;
        j=centro+1;
        k=inicio;

        while(i<=centro && j<= fin){

            if(auxArray[i]<=auxArray[j]){
                numeros[k++]=auxArray[i++];
                
            }else{
                numeros[k++]=auxArray[j++];
                resul=1;
            }
        }

        while(i<=centro){

            numeros[k++]=auxArray[i++];
        }

        return resul;

    } 

}
