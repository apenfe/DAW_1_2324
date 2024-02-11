package EJEMPLOS2;

import java.util.Scanner;


public class EjemploWhile01{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("\nInicio del programa");
        System.out.println("");

        int numero =0;

        while(numero==0){

            System.out.print("\n introduce un numero distinto de 0: ");
            numero= teclado.nextInt();
        }
            System.out.println("\nEl numero es: "+ numero);
       
        System.out.println("\nFinal del programa");
        System.out.println(""); 
    }
}
