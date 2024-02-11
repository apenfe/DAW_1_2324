package EJEMPLOS2;

import java.util.Scanner;

// muestre el numero de vuelta que esta dando y que pregunte al usuario si quiere seguir pulsando la s
// cuando salga del bucle debe mostarr la cntidad de vueltas que ha dado

public class EjemploWhile03{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("\nInicio del programa");
        System.out.println("");

        int contador =0;
        String texto="s";

        while(texto.equalsIgnoreCase("s")){
            
            contador ++;
            System.out.println("Total de vueltas: "+contador);

            System.out.println("Desea seguir viendo las vueltas? ");

            texto= teclado.nextLine();

        }
         
       System.out.println("\nTotal de vueltas dadas: "+ contador);
        System.out.println("\nFinal del programa");
        System.out.println(""); 
    }
}
