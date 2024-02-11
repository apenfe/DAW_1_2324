package EJEMPLOS3.recursividad;

import java.util.Scanner;

public class recursividad01{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        System.out.print("Introduce un numero: ");

        int numero= Integer.parseInt(teclado.nextLine().trim());

        System.out.println("Normal: "+factorial(numero));
        System.out.println("Recursividad: "+factorialR(numero));

    }

     public static int factorial(int numero){

        int factorial=1;

        if(numero==0){
            return 1;
        }else{

            for(int i=1; i<=numero; i++){

               factorial*=i;

            }
            return factorial;
        }

    }

    public static int factorialR(int numero){

        int factorial=1;

        if(numero==0){
            return 1;
        }else{

           
            return numero*factorialR(numero-1);
        }

    }
}
