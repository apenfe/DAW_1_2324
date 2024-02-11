package EJEMPLOS1;

import java.util.Scanner;

/*
2.5.1. Enunciado
Crea un programa que realice operaciones matemáticas básicas (suma, resta, multiplicación y
división) en dos números ingresados por el usuario.
El usuario debe seleccionar la operación que desea realizar.
Ayuda: se puede utilizar la estructura de control condicionl segun

*/

public class Ejemplo12b{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Simbolo de la operacion a realizar (1 +,2 -,3 *, 4 /): ");
        char operacion = (char)teclado.next().charAt(0);
        System.out.print("Numero 1: ");
        int a = teclado.nextInt();
        System.out.print("Numero 2: ");
        int b = teclado.nextInt();

        int resultado=0;
        
        if ( operacion=='+'){ // y && , o ||
            resultado=a+b;
            System.out.println("La suma es: " + a + "+" + b + "=" + resultado);
        
        }else if (operacion=='-'){
            resultado=a-b;
            System.out.println("La resta es: "+ resultado);
        }else if (operacion=='*'){
            resultado=a*b;
            System.out.println("La multiplicacion es: "+ resultado);
        }else if (operacion=='/'){
            resultado=a/b;
            System.out.println("La division es: "+ resultado);
        }else{
            System.out.println("Ingrese un operador valido.");
        }
    }
}
