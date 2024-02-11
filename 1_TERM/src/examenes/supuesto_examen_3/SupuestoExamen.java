/*
Un programa que pida las dimensiones de una matriz de enteros, para mandar dichas dimensiones
 a un método que genere una matriz de esas dimensiones recibidas por parámetros y la rellene
  con números aleatorios entre 0 y 9, para después devolver dicha matriz.

El flujo de funcionamiento del programa debe ser el siguiente:

Llamar al método que recibe la matriz original, y genera y devuelve la matriz transpuesta al programa principal.
Mostrar los datos de la matriz transpuesta.
*/
package examenes.supuesto_examen_3;
import java.util.Scanner;
import java.lang.Math;

public class SupuestoExamen{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int filas=0, columnas=0;

        do{

             filas = pedirNumero();

            if(filas<=1){
                System.out.println("El número debe ser positivo o mayor que 1.");
            }

        }while(filas<=1);

        do{

             columnas = pedirNumero();

            if(columnas<=1){
                System.out.println("El número debe ser positivo o mayor que 0.");
            }

        }while(columnas<=1);

        int[][]matriz = new int[filas][columnas];
        int[][] transpuesta = new int[columnas][filas];

        matriz = genMatriz(filas,columnas);
        mostrarMatriz(matriz);
        transpuesta= transponerMatriz(matriz);
        mostrarMatriz(transpuesta);

    }

    public static void mostrarMatriz(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                System.out.print(matrix[i][j]+" ");

            }

            System.out.println();
        }
        System.out.println();
    }

    public static int[][] transponerMatriz(int[][] matriz){

        int[][] transpuesta = new int[matriz[0].length][matriz.length];

        for(int j=0; j<matriz.length; j++){
            for(int i=0; i<matriz[0].length; i++){

                transpuesta[i][j]=matriz[j][i];

            }

        }

        return transpuesta;
    }

    public static int[][] genMatriz(int filas, int columnas){

        int[][] matriz = new int[filas][columnas];

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                matriz[i][j]=(int)(Math.random()*9+1);

            }
        }

        return matriz;
    }

    public static int pedirNumero(){

        int numero=0;
        boolean check=true;

        System.out.print("Inserte un número entero mayor que 1: ");
           

        do{

            try{
            
                numero= Integer.parseInt(teclado.nextLine().trim());
                check = false;

            }catch(Exception e){
                        System.out.print("ERROR -- INSERTE ENTERO ");
            }
            

        }while(check);
        
        System.out.println();
        return numero;
    }


}
