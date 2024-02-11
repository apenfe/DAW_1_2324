package EJEMPLOS3;

import java.util.Scanner;
import java.lang.Math;

public class Ejemplo07{

    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
      
        System.out.println("Introduce 2 numeros para mostar la multiplicacion de sus valores absolutos: ");

        System.out.print("\tPrimer múmero: ");
        int num1 = teclado.nextInt();

        System.out.print("\tSegundo múmero: ");
        int num2 = teclado.nextInt();

        System.out.println();

        System.out.println("El producto es: "+producto(num1,num2));

    }

    public static int producto(int num1, int num2){

        int resultado = (int)(Math.abs(num1) * Math.abs(num2));

        return resultado;
        
    }
}


