package EJEMPLOS1;

import java.util.Scanner;
import java.lang.Math;

public class Ejemplo06{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba el número con decimales: ");
        double a = teclado.nextDouble();
    

        System.out.println("Ceil es: " + Math.ceil(a)); //entero por encima
        System.out.println("Floor es: " + Math.floor(a)); //entero por debajo
        System.out.println("Potencia es: " +(int)Math.pow(a,3)); //potencia con un cast a entero
        System.out.println("Raiz es: " + Math.sqrt(a)); //raiz

        teclado.close(); //cerrar teclado

    }
}
