package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor06{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");
         System.out.println("");

        for(int i=1; i<= 10; i++){
                System.out.println("Vuelta: " + i+ "\n");
            for(int j=1; j<=10; j++){

                System.out.println("Sub Vuelta: " + j);
            }
              System.out.println("");
        }


        for(int i=1; i<= 10; i++){
                //System.out.println("Vuelta: " + i+ "\n");
            for(int j=1; j<=10; j++){

                System.out.println("Vuelta: " + i+"-"+j);
            }
              System.out.println("");
        }







        for(int i=1; i<= 10; i++){
                System.out.println("Tabla del " + i+ "\n");
            for(int j=1; j<=10; j++){

                System.out.println( i + " x " + j + " = " + (i*j));
            }
              System.out.println("");
        }


        System.out.println("\nFin del programa");
    }
}
