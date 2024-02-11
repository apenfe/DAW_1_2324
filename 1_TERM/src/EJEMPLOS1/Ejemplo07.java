package EJEMPLOS1;


import java.util.Scanner;

public class Ejemplo07{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número: ");
        int a = teclado.nextInt();
        
        if ( a > 5 ){
            System.out.println("El número es mayor que 5");
        }

    }
}
