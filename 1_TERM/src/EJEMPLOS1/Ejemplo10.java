package EJEMPLOS1;

import java.util.Scanner;

public class Ejemplo10{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número nº1: ");
        int a = teclado.nextInt();
        System.out.print("Número nº2: ");
        int b = teclado.nextInt();
        
        if ( a<b){ // y && , o ||
            System.out.println("El número 2, es mayor que el numero 1");
        }else if(a>b){
            System.out.println("El número 1, es mayor que el numero 2");
        }else{
            System.out.println("Son iguales");
        }

    }
}
