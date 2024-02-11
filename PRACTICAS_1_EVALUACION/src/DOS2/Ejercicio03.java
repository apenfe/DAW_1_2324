package DOS2;

/* Ejercicio03.java
 *
 * Escribe un programa simple que lea exactamente ocho números enteros y luego escriba la suma de todos ellos.
 * No hay que guardar los valores individualmente; sólo su suma acumulada.
 * Debe realizarse utilizando un bucle.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int suma=0;

        for(int i=1; i<=8; i++){
            System.out.print("Introduzca el entero nº "+i+": ");
            suma += teclado.nextInt();
        }

        System.out.println("\nLa suma acumulada de los 8 enteros es: " + suma);

    }
}
