package EJEMPLOS1;

import java.util.Scanner;

public class Ejemplo09{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número: ");
        int a = teclado.nextInt();
        
        if ( a >= 0 && a <= 10){ // y && , o ||
            System.out.println("El número es mayor o igual que 0 y menor o igual que 10");
        }else{
            System.out.println("El número no es valido.");
        }

    }
}
