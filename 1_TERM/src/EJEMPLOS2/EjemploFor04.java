package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor04{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        System.out.print("Inserte un número de inicio: 0");
        int a= teclado.nextInt();
System.out.print("Inserte un número de final: ");
        int b= teclado.nextInt();
        
        // bucle for para sol9 mostrar pares si a es 0
        
        for(int i=a; a<=b; a+=2){
                
                    System.out.println(a);
                

        }

System.out.println("\nFin de programa");
    }
}
