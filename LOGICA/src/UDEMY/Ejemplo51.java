/*
 * Dado un array de numeros, devolver un array de numeros pares e impares serparados.
 * 
 */

package UDEMY;

public class Ejemplo51{
	
	public static void main (String[] args) {
		
		int[] numeros = {2,1,6,34,54,22,22,12,21,34,35};
		
		int[][] parimpar = separador(numeros);
		
		for (int i = 0; i < parimpar.length; i++) {
			
			if(i==0) {
				System.out.print("Pares: ");
			}else {
				System.out.print("Impares: ");
			}
		
			for (int j = 0; j < parimpar[i].length; j++) {
				System.out.print(parimpar[i][j]+", ");
			}
			
			System.out.println();
		}
		
	}
	
	public static int[][] separador(int[] numeros){
		
		int[][] matriz = new int[2][]; // Crear un array de 2 subarrays
		int par=0, impar=0;
		
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		 // Inicializar cada subarray por separado
        matriz[0] = new int[par];
        matriz[1] = new int[impar];
        
        impar=-1;
        par=-1;
        
        for(int i=0; i<numeros.length;i++) {
        	
			if(numeros[i]%2==0) {
				par++;
				matriz[0][par]=numeros[i];
			}else {
				impar++;
				matriz[1][impar]=numeros[i];
			}
		}
        
        return matriz;
	
	}
	
}