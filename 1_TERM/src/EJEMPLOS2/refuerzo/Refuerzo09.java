package EJEMPLOS2.refuerzo;

/* Refuerzo09.java
 *
 * • Crea un programa que genere un número aleatorio entre 1 y 100
 * • Solicitar al usuario que adivine el número con estructuras condicionales de tal forma que muestre si el número ingresado por el usuario es mayor o menor que el número generado.
 * • Continuar solicitando al usuario que siga proponiendo números hasta que lo adivine correctamente
 * • El programa parará cuando el usuario introduzca correctamente el número generado y se le mostrará un mensaje indicando que efectivamente se ha acertado el número generado.
 * • Ayuda: en pseint para generar un número aleatorio se puede utilizar la función Aleatorio(n,m) que genera un número aleatorio entre n y m
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 12/10/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Refuerzo09 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=0;
        int random=(int)Math.floor(Math.random()*100+1);
        boolean booleano = true;

        while(booleano){

            System.out.print("Introduzca el número entero entre 1 y 100: ");
            num1 = teclado.nextInt();
    
            if(num1==random){
                System.out.println("Número correcto\n");
                booleano=false;
            }else if(num1<random){
                System.out.println("El número es mayor que "+num1);
            }else{
                System.out.println("El número es menor que "+num1);
            }

        }



    }
}
