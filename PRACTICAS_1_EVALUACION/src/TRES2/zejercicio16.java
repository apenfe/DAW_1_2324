package TRES2;

import java.util.Scanner;

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
 * 07/01/2024
 *
 */

public class zejercicio16{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][] matriz = {
                { 0, 2, 4, 0, 9, 5 },
                { 7, 1, 3, 3, 2, 1 },
                { 1, 3, 9, 8, 5, 6 },
                { 4, 6, 7, 9, 1, 0 }};

      int[][] submatriz = maxima3(matriz);

      System.out.println("La submatriz maxima es: \n");

      for(int i=0; i<submatriz.length;i++){
          System.out.print("\t");
          for(int j=0; j<submatriz.length;j++){
          
              System.out.print(submatriz[i][j]+"  ");

          }
              System.out.println("\n");            
      }

      System.out.println();  
		
	}
	
	public static int[][] maxima3(int[][] matriz) {
		
		int[][] submatriz = new int[3][3];
		int cont =0, max=0, maxfila=0, maxcolumna=0;
		
		for(int i = 1; i<matriz.length-1; i++) {
			for(int j = 1; j<matriz.length-1; j++) {
				
				cont=0;
				
				for(int k = i-1; k<i+2; k++) {
					for(int l = j-1; l<j+2; l++) {
						
						cont+=matriz[k][l];
						
						
					}
				}
				
				if(cont>=max) {
					max=cont;
					maxfila=i-1;
					maxcolumna=j-1;
				}
					
			}
		}
		
		int conti=0, contj=0;
		
		for(int i = maxfila; i<maxfila+3; i++) {
			
			for(int j = maxcolumna; j<maxcolumna+3; j++) {
				submatriz[conti][contj]=matriz[i][j];
				contj++;
			}
			contj=0;
			conti++;
		}
		
		
		return submatriz;
	}
	
}