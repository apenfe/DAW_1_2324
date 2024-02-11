package EJEMPLOS1;

import java.util.Scanner;

/*
2.10.1. Enunciado
• Crea un programa que calcule el precio final de un producto después de aplicar un descuento.
• El usuario debe ingresar el precio original y el porcentaje de descuento.

*/

public class Ejemplo16{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double a = teclado.nextDouble();
        System.out.print("Descuento en %: ");
        double b = teclado.nextDouble();
       
        double descuento = a -((b/100)*a);
        System.out.println("Precio con descuento: "+descuento);
        
    }
}
