package EJEMPLOS3.excepciones;

import java.util.Scanner;

public class Excepcion05{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero1= pedirInt("Introduce un primer número: ");
        int numero2= pedirInt("Introduce un segundo número: ");

        mostrarDivision(numero1,numero2);

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

     public static void mostrarDivision(int numero1, int numero2){

        try{
             System.out.println("La división es: "+ ((double)numero1/(double)numero2));

        }catch(Exception e){
            System.out.println("\nLa división entre 0 no es correcta.");

        }finally{ // siempre se ejecuta al finalizar el try o el catch
            System.out.println("\nFinal de la operacion.");
        }

    }

}

