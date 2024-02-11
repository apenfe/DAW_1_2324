package EJEMPLOS1;

import java.util.Scanner;

/*
2.11.1. Enunciado
• Escribe un programa que permita al usuario convertir unidades de medida, como de grados
Celsius a grados Fahrenheit o de kilómetros a millas.
• El programa debe preguntar al usuario qué tipo de conversión desea realizar.

*/

public class Ejemplo17{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Que tipo de calculo desea realizar?: ");
        System.out.println("1 - km a millas");
        System.out.println("2 - Celsius a Fahrenheit");

        int a = teclado.nextInt();

        if(a==1){
            System.out.print("Introduzca los km: ");
            double km = teclado.nextDouble();
            System.out.println("En millas son: "+(km/2));
        }else if(a==2){
            System.out.print("Introduzca los celsius: ");
            double c = teclado.nextDouble();
            System.out.println("En fahrenheit son: "+(((c*9)/5)+32));
        }else{
            System.out.println("Elija otra opcion");
        }
    }
}
