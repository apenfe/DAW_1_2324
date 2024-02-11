package EJEMPLOS1;

import java.util.Scanner;

/*
2.7.1. Enunciado
• Crea un programa que solicite al usuario una calificación numérica (de 0 a 100) y luego muestre
su calificación en letras según la siguiente escala:
A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59

*/

public class Ejemplo13{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su nota (de 0 a 100): ");
        int a = teclado.nextInt();
       
        
        if( a>=90&&a<=100){ // y && , o ||
            System.out.println("Su nota es: A");
        }else if(a>=80&&a<=89){
            System.out.println("Su nota es: B");
        }else if(a>=70&&a<=79){
            System.out.println("Su nota es: C");
        }else if(a>=60&&a<=69){
            System.out.println("Su nota es: D");
        }else if(a>=0&&a<=59){
            System.out.println("Su nota es: F");
        }else{
          System.out.println("Nota no valida.");
        }
    }
}
