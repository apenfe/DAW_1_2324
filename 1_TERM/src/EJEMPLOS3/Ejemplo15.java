package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo15{

    public static int numero;  //variable global - argumento del metodo

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        numero= teclado.nextInt();
        mostrarNumero();
      

    }

    public static void mostrarNumero(){

        System.out.print(numero);
        System.out.println();

    }
}
