package EJEMPLOS1;

import java.util.Scanner;

/*
2.7.1. Enunciado
• Crea un programa que solicite al usuario una calificación numérica (de 0 a 100) y luego muestre
su calificación en letras según la siguiente escala:
A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59

*/

public class Ejemplo13b{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su nota (de 0 a 10): ");
        double a = teclado.nextDouble();
       
        
        if( a>=9&&a<=10){ // y && , o ||
            System.out.println("Su nota es sobresaliente");
        }else if(a>=7&&a<9){
            System.out.println("Su nota es notable");
        }else if(a>=6&&a<7){
            System.out.println("Su nota es: bien");
        }else if(a>=5&&a<6){
            System.out.println("Su nota es: suficiente");
        }else if(a>=0&&a<5){
            System.out.println("Su nota es: insuficiente");
        }else{
          System.out.println("Nota no valida.");
        }
    }
}
