package EJEMPLOS2;

import java.util.Scanner;

public class Ejemplo21{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");

        System.out.print("Inserte un texto: ");
        int vector[]={8,5,3,4,5,12,7,8,9,10};

        for(int i=0; i< (vector.length); i++){
            System.out.println("Número "+(i+1)+" es: "+ vector[i]); //se puede ver el tamaño de un array? // si, mira for
        }

        System.out.println("\nFin del programa");
    }
}
