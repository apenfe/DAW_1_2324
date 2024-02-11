package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor05{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         System.out.println("\nInicio del programa");

        System.out.print("Inserte un texto: ");
        String texto= teclado.nextLine();

        System.out.println("caracteres del texto: "+ texto.length());
        System.out.println("Primera letra: "+ texto.charAt(0));

        for(int i=0; i<texto.length(); i++){
            System.out.println("La letra nº "+i+" es: "+ texto.charAt(i));
        }

        System.out.println("\nFin del programa");
    }
}
