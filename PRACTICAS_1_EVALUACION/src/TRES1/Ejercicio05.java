package TRES1;

/* 
 * Ejercicio05.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que utilice un array (vector) de 10 elementos de números enteros e inicialice cada elemento
 * con el valor 7 en cada elemento y que devuelva el array al final.
 * Se debe crear otro método que reciba el array y los muestre por pantalla utilizando un bucle for.
 * Se recomienda utilizar todos los modos de inicialización conocidos para un vector int[]. 
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio05{
    public static void main(String argumentos[]) {

        System.out.print("\n1º Usando: (int array[]= new int[10];) ---> ");
        imprimirArray(array7());

        System.out.println();

        System.out.print("2º Usando: (int array[]= {7,7,7,7,7,7,7,7,7,7};) ---> ");
        imprimirArray(array71());

        System.out.println();

	}

    public static int[] array7() {

        int array[]= new int[10];

        for(int i=0; i<10; i++){
            array[i]=7;
        }
           
        return array;
	}

    public static int[] array71() {

        int array[]= {7,7,7,7,7,7,7,7,7,7};
           
        return array;
	}

    public static void imprimirArray(int array[]) {

        for(int i=0; i<10; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
	}
}
