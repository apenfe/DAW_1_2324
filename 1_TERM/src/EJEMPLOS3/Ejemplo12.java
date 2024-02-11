package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo12{

    public static void main(String[] args){

        int a= entrada("Intruduce el primer número: ");
        int b= entrada("Intruduce el segundo número: ");
        int c= entrada("Intruduce el último número: ");

    }

    public static int entrada(String enunciado){

        Scanner teclado= new Scanner(System.in);

        System.out.print(enunciado);
        int numero = teclado.nextInt();
        System.out.println("El numero es: "+numero);

        return numero;
        
      
    }
}
