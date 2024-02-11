package EJEMPLOS3.excepciones;

import java.util.Scanner;

public class Excepcion04{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero= pedirInt("Introduce un número: ");

        System.out.println("el numero introducido es: "+numero);

    }

    public static int pedirInt(String enunciado){

        int numero = 0;
        boolean check = false;

        System.out.print(enunciado);

        while(!check){
        
            try{

                numero = Integer.parseInt(teclado.nextLine().trim());
                // numero = Double.parseDouble(teclado.nextLine().trim());
                check=true;

            }catch(Exception e){

                System.out.println("Introduzca un valor válido. ");

            }
        }

        return numero;

    }

}


