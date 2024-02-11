package EJEMPLOS1;

import java.util.Scanner;

/*
2.9.1. Enunciado
• Crea un programa que calcule el Índice de Masa Corporal (IMC) de una persona a partir de su
peso (en kilogramos) y altura (en metros).
• El programa debe indicar si la persona tiene bajo peso, peso normal, sobrepeso u obesidad
según el IMC calcula


Composición corporal	Índice de masa corporal (IMC)
Peso inferior al normal	Menos de 18.5
Normal	18.5 – 24.9
Peso superior al normal	25.0 – 29.9
Obesidad	Más de 30.0

*/

public class Ejemplo15{
    public static void main(String[] args){

        // Objeto de tipo scanner para leer por la consola.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su altura en m: ");
        double a = teclado.nextDouble();
        System.out.print("Introduzca su peso en kg: ");
        double b = teclado.nextDouble();
       
        double imc = b/(a*a);
        System.out.println("IMC: "+imc);
        
        if( imc < 18.5){ // y && , o ||
            System.out.println("peso inferior al normal");
        }else if(imc>=18.5&&imc<=24.9){
            System.out.println("normal");
        }else if(imc>=25.0&&imc<=29.9){
            System.out.println("peso superior al normal");
        }else if(imc>=30.0){
            System.out.println("obesidad");
        }
    }
}
