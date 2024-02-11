package DOS2;

/* Ejercicio08.java
 *
 * Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
 * Los asteriscos sólo se verán en el borde del cuadrado.
 * Un ejemplo para 5 sería:
 *
 *    *   *   *   *   *
 *
 *    *               *
 *
 *    *               *
 *
 *    *               *
 *
 *    *   *   *   *   *
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 10/10/23
 */

import java.lang.Math;
import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        int lado=0;

        while(lado<=0){
            System.out.print("Inserte un número entero para el tamaño del lado: ");
            lado = teclado.nextInt();
            
            if(lado<=0){
                System.out.println("Inserte un número entero positivo. \n");
            }
        }
        
        System.out.println();

        for(int i=1; i<=lado; i++){

            for(int j=1; j<=lado; j++){

                if(i==1 || i==lado){

                    System.out.print("* ");

                }else{

                    if(j==1 || j==lado){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();            
        }

    }
}    
