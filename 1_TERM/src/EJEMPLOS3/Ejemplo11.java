package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo11{

    public static void main(String[] args){

        int a= entrada();
        System.out.println("El número es: "+a);

    }

    public static int entrada(){

        Scanner teclado= new Scanner(System.in);

        System.out.print("\tLado triangulo: ");
        int numero = teclado.nextInt();

        return numero;
        
      
    }
}
