package EJEMPLOS1;

import java.util.Scanner;

/*
2.5.1. Enunciado
Crea un programa que realice operaciones matemáticas básicas (suma, resta, multiplicación y
división) en dos números ingresados por el usuario.
El usuario debe seleccionar la operación que desea realizar.
Ayuda: se puede utilizar la estructura de control condicionl segun switch

*/

public class Ejemplo19{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Simbolo de la operacion a realizar (1 +,2 -,3 *, 4 /): ");
        char operacion = teclado.next().charAt(0);
        System.out.print("Numero 1: ");
        int a = teclado.nextInt();
        System.out.print("Numero 2: ");
        int b = teclado.nextInt();

        int resultado=0;

            switch(operacion){

                case '+':
                            resultado=a+b;
                            System.out.println("La suma es: " + a + "+" + b + "=" + resultado);
                break;

                case '-':
                            resultado=a-b;
                            System.out.println("La resta es: "+ resultado);
                break;
                case '*':
                            resultado=a*b;
                            System.out.println("La multiplicacion es: "+ resultado);
                break;
                case '/':
                            resultado=a/b;
                            System.out.println("La division es: "+ resultado);
                break;
               
                default:
                            System.out.println("Ingrese un operador valido.");
            }
        
      
    }
}
