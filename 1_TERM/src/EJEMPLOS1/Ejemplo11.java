package EJEMPLOS1;

import java.util.Scanner;

/*
Escribe un programa que determine si un año ingresado por el usuario es bisiesto o no. Un año
es bisiesto si es divisible por 4, pero no es divisible por 100, a menos que también sea divisible
por 400.

*/

public class Ejemplo11{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Año: ");
        int ano = teclado.nextInt();
      
        
        if ( (ano%4==0) && (ano%100!=0 || ano%400==0)){ // y && , o ||
          
            System.out.println("Es bisiesto");
        
        }else{
            System.out.println("No es bisiesto");
        }

    }
}
