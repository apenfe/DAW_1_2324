package TRES3;

/* OK
 * 
 * Ejercicio08.java
 *
 * Escribe un método que se llame buscarBinariaRec() que recibe un vector ordenado de enteros y un valor.
 * Devuelve el índice de la posición de ese valor dentro del array recibido utilizando una búsqueda binaria
 * recursiva.
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 * Deben seguirse los principios y estilo del código limpio.
 *
 * Adrián Peñalver Fernández
 *
 * 20/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio08{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int[] array={2,3,4,8,9,12,15};
        int valor=0;
        boolean check=true;

        System.out.print("\nA continuación inserte un valor a buscar en el array: ");

         do{
                try{
                    valor = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (Entero): ");
                }

            }while(check);

        if(buscarBinariaRec(array,0,array.length,valor)>=0){

            System.out.println("\n\tEl valor "+valor+" se encuentra en la posición "+ buscarBinariaRec(array,0,array.length,valor)+" del array.\n");

        }else{
            System.out.println("\n\tEl valor no está en el array.\n");
        }

    }

    public static int buscarBinariaRec(int[] array, int inferior, int superior, int valor){

        int medio=(inferior+superior)/2;

            if(inferior>superior){
                return -1;
            }else{

                if(valor==array[medio]){
                    return medio;
                }else{

                    if(valor<array[medio]){

                        return buscarBinariaRec(array, inferior, medio-1, valor);

                    }else{

                        return buscarBinariaRec(array, medio+1, superior, valor);

                    }
                }
            }

    }  

}
