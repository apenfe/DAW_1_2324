package EJEMPLOS2;

import java.util.Scanner;

public class EjemploFor03{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        System.out.print("Inserte un número de inicio: ");
        int a= teclado.nextInt();
System.out.print("Inserte un número de final: ");
        int b= teclado.nextInt();
        
        // bucle for
        
        for(int i=a; a<=b; a++){

                if(a%2==0){
                    System.out.println("Vuelta: "+a);
                }else{

                continue;
                }
        
                
                if(a >= 21){
                    break;
                }
        }

System.out.println("\nFin de programa");
    }
}
