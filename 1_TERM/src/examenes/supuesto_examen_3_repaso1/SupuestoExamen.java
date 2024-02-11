/*
Un programa que pida las dimensiones de una matriz de enteros, para mandar dichas dimensiones
 a un método que genere una matriz de esas dimensiones recibidas por parámetros y la rellene
  con números aleatorios entre 0 y 9, para después devolver dicha matriz.

El flujo de funcionamiento del programa debe ser el siguiente:

Llamar al método que recibe la matriz original, y genera y devuelve la matriz transpuesta al programa principal.
Mostrar los datos de la matriz transpuesta.
*/

package examenes.supuesto_examen_3_repaso1;
import java.util.Scanner;
import java.lang.Math;

public class SupuestoExamen{
	
	public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
    	
    	int i=0, j=0;

    	do {
    		
    		i=pedirInt("Inserte numero de filas: ");
    		j=pedirInt("Inserte numero de columnas: ");
    		
    		if(i<=0||j<=0) {
    			System.out.println("Ambos numeros deben ser mayor que 0.");
    		}
    		
    	}while(i<=0||j<=0);
    	
    	int[][] matriz = generarMatriz(i,j);
    	mostrarMatriz(matriz);
    	matriz = trasponerMatriz(matriz);
    	mostrarMatriz(matriz);
       

    }

   public static int pedirInt(String enunciado) {
	   
	   System.out.print(enunciado);
	   
	   do {
		   
		   try {
			   
			   int num = Integer.parseInt(teclado.nextLine().trim());
			   return num;
			   
		   }catch(Exception e) {
			   
			   System.out.print("Error - inserte numero entero: ");
			   
		   }
		   
	   }while(true);
	   
   }
   
   public static int[][] generarMatriz(int filas, int columnas) {
	   
	   int[][] matriz = new int[filas][columnas];
	   
	   for (int i = 0; i < matriz.length; i++) {
		   
		   for (int j = 0; j < matriz[0].length; j++) {
			   
			   matriz[i][j]=(int)(Math.random()*9+1);
				
		   }
		
	   }
	   
	   return matriz;
	   
   }
   
   public static void mostrarMatriz(int[][] matriz) {
	   
	   System.out.println();
	   
	   for (int i = 0; i < matriz.length; i++) {
		   
		   for (int j = 0; j < matriz[0].length; j++) {
			   
			   System.out.print(matriz[i][j]+" ");
				
		   }
		   
		   System.out.println();
		
	   }
	   
   }
   
   
   public static int[][] trasponerMatriz(int[][] matriz) {
	   
	   int[][] matriz1 = new int[matriz[0].length][matriz.length];
	   
	   for (int j = 0; j < matriz.length; j++) {
		   
		   for (int i = 0; i < matriz[0].length; i++) {
			   
			   matriz1[i][j]=matriz[j][i];
				
		   }
		
	   }
	   
	   return matriz1;
	   
   }

}
