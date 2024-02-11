package EJEMPLOS1;

import java.util.Scanner;

/*
2.8.1. Enunciado
• Escribe un programa que solicite al usuario un número de mes (1-12) y muestre el número de
días en ese mes. No es necesario considerar años bisiestos en este ejercicio.

*/

public class Ejemplo14{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un mes (de 1 a 12): ");
        int a = teclado.nextInt();
       
        
        if( a==1||a==3||a==5||a==7||a==8||a==10||a==12){ // y && , o ||
            System.out.println("31 dias");
        }else if(a==4||a==6||a==9||a==11){
            System.out.println("30 dias");
        }else if(a==2){
            System.out.println("28 dias");
        }else{
          System.out.println("Mes no valido");
        }
    }
}
