package EJEMPLOS2;

import java.util.Scanner;

public class Ejemplo23{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");

System.out.print("Inserte el tamaño del array: ");
int tamano= teclado.nextInt();
        int vector[]=new int[tamano];

            for(int i=0; i<tamano; i++){
System.out.print("Inserte el numero: "+i+"...");
vector[i]= teclado.nextInt();
            
            }

  for(int i=0; i<tamano; i++){
System.out.println("el numero: "+i+ "es: "+vector[i]);
            
            }

   

        System.out.println("\nFin del programa");
    }
}
