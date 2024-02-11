package EJEMPLOS3.recursividad;

import java.util.Scanner;

public class recursividad02{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        System.out.print("Introduce un numero para poner todos los numeros anteriores: ");

        int numero= Integer.parseInt(teclado.nextLine().trim());

        factorialR(numero);
        System.out.println();
        factorialRin(numero);

    }

    public static void factorialR(int numero){

            if(numero>=1){

                System.out.print(numero+" ");
                factorialR(numero-1);

            }

    }

    public static void factorialRin(int numero){

            if(numero>=1){

                factorialRin(numero-1);
                System.out.print(numero+" ");
           
            }
       
    }
}
