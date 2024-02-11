package TRES1;


/* 
 * Ejercicio06.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que utilice un array (vector) de 20 elementos de números enteros e inicialice cada elemento con
 * un valor igual al índice correspondiente del elemento, multiplicado por 5 y que devuelva el array al final.
 * Se debe crear otro método que reciba el array y los muestre por pantalla utilizando un bucle for.
 * Se recomienda utilizar todos los modos de inicialización conocidos para un vector int[].
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

public class Ejercicio06{
    public static void main(String argumentos[]) {

        System.out.println();
        System.out.print("\n1º Usando: (int array[]= new int[20];) ---> ");
        imprimirArray(arrayGen());

        System.out.println();

        System.out.print("2º Usando: (int array[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};) ---> ");
        imprimirArray(arrayGen1());
        System.out.println();

	}

    public static int[] arrayGen() {

        int array[]= new int[20];

        for(int i=0; i<20; i++){
            array[i]=(i*5);
        }
           
        return array;
	}

    public static int[] arrayGen1() {

        int array[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for(int i=0; i<20; i++){
            array[i]=(i*5);
        }
           
        return array;
	}

    public static void imprimirArray(int array[]) {

        for(int i=0; i<20; i++){
            System.out.print(array[i]+" ");
        }
        
        System.out.println();

	}
}
