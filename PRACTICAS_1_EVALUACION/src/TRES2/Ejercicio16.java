package TRES2;

/* 
 * Ejercicio16.java
 * 	
 * Escribe un método que se llame maxima3() que recibe una matriz rectangular de tamaño (n,m) con datos. 
 * Devuelve una una submatriz de tamaño (3,3), cuyos valores sumen el valor máximo dentro de la matriz recibida.
 * Modifica el ejemplo de submatriz máxima del capitulo 7. Arrays de los apuntes.
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio16{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int[][] matriz = {
                  { 0, 2, 4, 0, 9, 5 },
                  { 7, 1, 3, 3, 2, 1 },
                  { 1, 3, 9, 8, 5, 6 },
                  { 4, 6, 7, 9, 1, 0 }};

        int[][] submatriz = maxima3(matriz);

        System.out.println("La submatriz maxima es: \n");

        for(int i=0; i<3;i++){
            System.out.print("\t");
            for(int j=0; j<3;j++){
            
                System.out.print(submatriz[i][j]+"  ");

            }
                System.out.println("\n");            
        }

        System.out.println();  

    }

    public static int[][] maxima3(int[][] matriz){ 

        int cont=0, max = Integer.MIN_VALUE, max_fila=0, max_columna=0;
        int[][] maxima = new int[3][3]; 
                        
        for(int fila = 1 ; fila < matriz.length-1; fila++){

            for(int columna = 1 ; columna < matriz[0].length-1 ; columna++){

                for(int subfila = fila-1; subfila<=fila+1 ; subfila++){

                    for(int subcolumna = columna-1; subcolumna<=columna+1 ; subcolumna++){
                        
                        cont+=matriz[subfila][subcolumna];
                
                    }

                }
                
                if(cont>max){

                    max = cont;
                    max_fila = fila;
                    max_columna = columna;
                }

                cont=0;

            }

        }

        for(int i = -1; i<=1 ; i++){
            for(int j =-1; j<=1 ; j++){
                        
                maxima[i+1][j+1] = matriz[max_fila+i][max_columna+j];
                
            }
        }

        return maxima;
        
    }
        
  }
