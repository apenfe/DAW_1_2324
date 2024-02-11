package TRES2;

/* 
 * Ejercicio02.java
 *
 * Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado
 * calcularMostrarTabla().
 * El método calcularMostrarTabla() recibe el número del que calculará la tabla y la visualiza por pantalla con el
 * formato adecuado.
 * La tabla mostrará productos hasta el 15. 
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio02{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero=0;

        while(numero<=0){

            System.out.print("¿De qué número desea saber su tabla de multiplicar? ");
            numero = teclado.nextInt();

            if(numero<=0){
                System.out.println("\nEl número debe ser mayor que 0. Introduce un número válido.\n");
            }

        }

        calculoMostrarTabla(numero);

    }

    public static void calculoMostrarTabla(int numero){

        System.out.println("\n\tTabla del número "+numero+".\n");
           
        for(int i=0; i<=15; i++){
            System.out.println("\t"+i+" x "+numero+" = "+(numero*i));
        }

        System.out.println();

    }
}
