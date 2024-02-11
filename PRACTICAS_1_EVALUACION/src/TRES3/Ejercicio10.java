package TRES3;

/* OK
 * 
 * Ejercicio10.java
 *
 * Escribe un método que se llame ordenarQuickSort() que recibe un vector de enteros para ordenarlos por el método
 * QuickSort . Devuelve 1 si ha ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido ordenar.
 *
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 * Deben seguirse los principios y estilo del código limpio.
 *
 * Adrián Peñalver Fernández
 *
 * 19/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio10{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

       //int[] numeros={5,2,3,7,8,3,1,4,6};
       int[] numeros={2,3,4,8,14,16};

         System.out.print("\nEl array inicialmente es: ");
         for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");

        }
        System.out.println();

        int resultado=ordenarQuickSort(numeros, 0, numeros.length-1);

        if(resultado==0){

            System.out.print("El array ya estaba ordenado.");
            System.out.println("\n");

        }else if(resultado==1){

            System.out.print("El array no estaba ordenado, finalmente es:   ");
            for(int i=0; i<numeros.length; i++){
                System.out.print(numeros[i]+" ");
            }
            System.out.println("\n");

        }else{

            System.out.print("El array no se ha podido ordenar.");
            System.out.println("\n");

        }
        
    }

    public static int ordenarQuickSort(int[] numeros, int izquierda, int derecha){

        int pivote = (izquierda + derecha)/2;
        int i=izquierda;
        int j=derecha;
        int aux, salida=0;

        try{ // HE DECIDIDO HACER ESTO PARA PODER CAPTAR CUALQUIER HIPOTETICO ERROR EN LA FUNCION Y ARROJAR UN -1

            do{
        
                while (numeros[i] < numeros[pivote]) {
                    i++;
                }

                while (numeros[j] > numeros[pivote]) {
                    j--;
                }

                if (i <= j) {
              
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                    i++;
                    j--;
                    
                }else{
                    salida=1;
                }
                
            }while(i<=j);

            if(izquierda<j){
                 ordenarQuickSort(numeros,izquierda,j);
                
            }
            if(i<derecha){
                ordenarQuickSort(numeros,i,derecha);
            	
        }

        }catch(Exception e){
            salida=-1;
        }

        return salida;

    }
   
}
