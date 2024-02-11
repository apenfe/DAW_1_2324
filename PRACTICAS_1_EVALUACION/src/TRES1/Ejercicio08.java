package TRES1;

/* 
 * Ejercicio08.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Escribe un método que se llame vectoresIntIguales() que recibe dos vectores de enteros. Devuelve true si son
 * iguales.
 * Dos vectores son iguales si tienen la misma longitud y los valores, elemento a elemento, son iguales. La segunda
 * condición se puede comprobar con un bucle.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio08{
    public static void main(String argumentos[]) {

        Scanner teclado= new Scanner(System.in);
        int tamano1=-1, tamano2=-1;

        while(tamano1<=0||tamano2<=0){

            System.out.print("Introduce el número de elementos del vector 1: ");
            tamano1= teclado.nextInt();

            if(tamano1<=0){
                System.out.println("El número debe ser mayor que 0 en el vector 1.\n");
                continue;
            }

            System.out.print("Introduce el número de elementos del vector 2: ");
            tamano2= teclado.nextInt();

            if(tamano2<=0){
                System.out.println("El número debe ser mayor que 0 en el vector 1.\n");
                continue;
            }

        }

        int array1[] = new int[tamano1];
        int array2[] = new int[tamano2];
      
        System.out.println();
        for(int i=0; i<tamano1; i++){
           System.out.print("Introduce el término "+i+" del vector 1: "); 
           array1[i]=teclado.nextInt();
        }

        System.out.println();
        for(int i=0; i<tamano2; i++){
           System.out.print("Introduce el término "+i+" del vector 2: "); 
           array2[i]=teclado.nextInt();
        }

        if(vectoresIntIguales(array1,array2)){
            System.out.println("\nLos vectores son iguales.");
        }else{
            System.out.println("\nLos vectores son diferentes.");
        }

	}

    public static boolean vectoresIntIguales(int[]vector1 ,int[]vector2) {

        boolean resultado=true;

        if(vector1.length!=vector2.length){

            resultado= false;

        }else{
            
            for(int i=0; i<vector1.length; i++){
                if(vector1[i]!=vector2[i]){
                    resultado= false;
                }
            }
            
        }
           
        return resultado;
	}

}
