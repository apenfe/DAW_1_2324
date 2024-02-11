package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo08{

    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);

        System.out.print("\t¿Cual es tu nombre? ");
        String name = teclado.nextLine();

        System.out.print("\t¿Cual es su edad? ");
        int age = teclado.nextInt();

        System.out.println();

        System.out.println(frase(age,name));

    }

    public static String frase(int edad, String nombre){

        String cadena = "Su nombre es "+nombre+" y su edad es "+edad+" años";

        return cadena;
        
    }
}

