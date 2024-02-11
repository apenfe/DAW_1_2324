package EJEMPLOS1;

import java.util.Scanner;

/*
CASE

*/

public class Ejemplo18{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Que tipo de calculo desea realizar?: ");
        System.out.println("1 - km a millas");
        System.out.println("2 - Celsius a Fahrenheit");
        System.out.println("3 - millas a km");
        System.out.println("4 - Fahrenheit a celsius");

        int a = teclado.nextInt();

        switch(a){
            case 1:
                System.out.println("1 -");
                break;
            
            case 2:
                System.out.println("2 -");
                break;

            case 3:
                System.out.println("3 -");
                break;

            case 4:
                System.out.println("4 -");
                break;

            default:
                System.out.println("seleccione otro numero");
     
            }

        
    }
}
