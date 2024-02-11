package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor07{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");
         System.out.println("");

        int numeros[][]={{2,2,1},
                         {5,4,7,2,1},
                         {2,4,5,2,1},
                         {2,4,7,3,1},
                         {2,4,7,2}};

            for(int i=0; i<numeros.length; i++){

                for(int j=0; j<numeros[i].length; j++){

                    System.out.print(numeros[i][j]+" ");

                }
                System.out.println("");
            }
              
        System.out.println("\nFin del programa\n");
    }
}
