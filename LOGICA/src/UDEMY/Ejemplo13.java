/*
 * 
Dado un array, dividirlo en tantos sub-arrays como sea necesario
basandonos en un numero que indique su tamaño

dividirlo en arrays de x elementos

Ejemplo:

dividirArray([7,8,9,10], 2)

//devuelve: [[7,8],[9,10]]
 * 
 */

package UDEMY;

public class Ejemplo13{
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7,8,9,10};
		int num= 3;
		
		for(int i=0; i<dividirArray(array,num).length;i++) {
			for(int j=0; j<dividirArray(array,num)[0].length;j++) {
				System.out.print(dividirArray(array,num)[i][j]);
			}
			System.out.println();

		}
		
	}
	
	public static int[][] dividirArray(int[] array, int num){
		
		int filas = array.length/num;
		int cont=0;
		
		int[][] subarray=new int[filas][num];
		
		for(int i=0; i<filas;i++) {
			
			for(int j=0; j<num; j++) {
				
				subarray[i][j]=array[j+cont];
			}
			cont+=num;
		}
		
		return subarray;
	}
}