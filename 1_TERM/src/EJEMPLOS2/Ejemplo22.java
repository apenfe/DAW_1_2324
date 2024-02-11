package EJEMPLOS2;

import java.util.Scanner;

public class Ejemplo22{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");

        
        int vector[]=new int[10];

            for(int i=0; i<10; i++){
System.out.print("Inserte el numero: "+i+"...");
vector[i]= teclado.nextInt();
            
            }

  for(int i=0; i<10; i++){
System.out.println("el numero: "+i+ "es: "+vector[i]);
            
            }

   

        System.out.println("\nFin del programa");
    }
}
