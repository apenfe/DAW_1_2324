package EJEMPLOS3.excepciones;

import java.util.Scanner;

public class Excepcion03{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero= pedirInt("Introduce un número: ");

        System.out.println("el numero introducido es: "+numero);


    }

    public static int pedirInt(String enunciado){

        int numero;

        System.out.print(enunciado);
        
        try{

            numero= teclado.nextInt();

        }catch(Exception e){

            System.out.println("error: "+e);

            numero= -1;

        }

        return numero;

    }

}


