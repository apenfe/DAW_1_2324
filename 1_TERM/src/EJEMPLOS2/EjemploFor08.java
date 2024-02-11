package EJEMPLOS2;

import java.util.Scanner;

// indica cantidad de lineas: 

public class EjemploFor08{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");
         System.out.println("");

         System.out.print("Indica cantidad de lineas: ");
        int a = teclado.nextInt();
       System.out.println();

            for(int i=1; i<= a; i++){

                for(int j=1; j<= i; j++){

                    System.out.print("* ");

                }
                System.out.println("");
            }
              System.out.println("");

  for(int i=1; i<= a; i++){

                for(int j=1; j<= a+1 -i; j++){

                    System.out.print("* ");

                }
                System.out.println("");
            }
        System.out.println("\nFin del programa\n");
    }
}
