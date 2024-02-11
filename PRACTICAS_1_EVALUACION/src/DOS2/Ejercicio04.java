package DOS2;

/* Ejercicio04.java
 *
 * Escribe un programa simple que lea una serie de números enteros por teclado e indique cuál es el mayor de todos ellos.
 * No se deben guardar los datos introducidos; sólo debe ir guardándose el que vaya siendo mayor.
 * Cada vez que se lee un dato el programa pregunta si se quiere seguir. Se debe pulsar la tecla S para seguir.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        int max=0, cont=0;
        String letra = "s";

        do{
            
            System.out.print("Introduzca un número entero: ");
            int num = teclado.nextInt();
            
            if(num>max || cont==0){
                max=num;
            }

            teclado.nextLine();
            System.out.print("\n¿Desea seguir introduciendo números? S/N ");
            letra = teclado.nextLine();
            System.out.println();

            cont++;

        }while(letra.equalsIgnoreCase("s"));
        
            System.out.println("\nEl número más grande es " + max + ". ");

    }
}
