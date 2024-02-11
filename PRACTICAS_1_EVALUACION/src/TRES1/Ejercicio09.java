package TRES1;

/* 
 * Ejercicio09.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que se llame compararVectoresChar() que recibe dos vectores de caracteres. Devuelve 0 si son
 * iguales, 1 si el primero es mayor y -1 si el primero es menos.
 * Prueba el método pedido desde main().
 * El orden alfabético de vectores de caracteres requiere la comparación uno a uno de sus caracteres, comenzando
 * desde  el extremo izquierdo. El orden alfabético corresponde al orden numérico creciente del código del carácter.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio09{
    public static void main(String argumentos[]) {

        Scanner teclado= new Scanner(System.in);
        int tamano=-1;
        int comparacion;

        while(tamano<=0){
        
            System.out.print("Introduce el número de elementos de los vectores: ");
            tamano= teclado.nextInt();

            if(tamano<=0){
                System.out.println("Debe ser un número mayor que 0.\n");
            }

        }

        char array1[] = new char[tamano];
        char array2[] = new char[tamano];
        
        System.out.println(); 

        for(int i=0; i<tamano; i++){
           System.out.print("Introduce el caracter "+i+" del vector 1: "); 
           array1[i]=teclado.next().charAt(0);
        }

        System.out.println(); 

        for(int i=0; i<tamano; i++){
           System.out.print("Introduce el caracter "+i+" del vector 2: "); 
           array2[i]=teclado.next().charAt(0);
        }

        comparacion = compararVectoresChar(array1,array2);

        if(comparacion==0){
            System.out.println("\nLos vectores son iguales.");
        }else if(comparacion==1){
            System.out.println("\nEl vector 1 es mayor que el 2.");
        }else{
            System.out.println("\nEl vector 2 es mayor que el 1.");
        }

	}

    public static int compararVectoresChar(char[]vector1 ,char[]vector2) {

        int resultado=0;

            for(int i=0; i<vector1.length;i++){
                if(vector1[i]<vector2[i]){
                    resultado=-1; //primero menor
                    break;
                }else if(vector1[i]>vector2[i]){
                    resultado=1; //primero mayor
                    break;
                }
            }
 
        return resultado;
	}

}
