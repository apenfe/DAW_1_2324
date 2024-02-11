package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor01{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        System.out.print("Inserte un número de vueltas: ");
        int a= teclado.nextInt();
        
        // bucle for
        
        for(int i=1; i<=a; i++){
            System.out.println("Vuelta: "+i);
        }
System.out.println("\nFin de programa");
    }
}
