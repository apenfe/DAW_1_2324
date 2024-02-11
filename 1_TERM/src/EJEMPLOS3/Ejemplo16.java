package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo16{

    public static   Scanner teclado = new Scanner(System.in);

//si hay mas de un metodo se recomienda llevar el scanner a una variable global

    public static void main(String[] args){
        
        System.out.print("Introduce un número: ");
        int numero= teclado.nextInt();

        int numero2 = pedirNumero();
        
   System.out.println("El número es: "+numero);
   System.out.println("El número es: "+numero2);
      

    }

    public static int pedirNumero(){
           
         System.out.print("Introduce un número: ");
       int numero= teclado.nextInt();

        return numero;

    }
}
