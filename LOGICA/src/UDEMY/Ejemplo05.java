/* 
 * Ejercicio05.java
 *
 * Dado un numero y un porcentaje calcula este en una función.
 *
 * No utilizar funciones del lenguaje.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo05{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca una cantidad: ");
        double cantidad = teclado.nextDouble();
        System.out.println();  

        System.out.print("Introduzca un porcentaje a descontar: ");
        double porcentaje = teclado.nextDouble();
        System.out.println();        
              
        System.out.println(calculaPorcentaje(cantidad,porcentaje)+" %"); 

    }

    public static double calculaPorcentaje(double cantidad, double porcentaje){

       double salida = cantidad - (cantidad*(porcentaje/100));
        
       return salida;
         
    }

}
