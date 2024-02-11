package DOS3;

/* Ejercicio04.java
 *
 * Escribe un programa simple que genere un número aleatorio entre 1 y 100, pero que no se muestre al usuario. 
 * El programa irá preguntando al usuario que intente adivinarlo introduciendo números hasta que acierte dicho 
 * número y muestre cual era el número oculto y la cantidad de intentos que ha realizado el usuario.
 * Cada vez que el usuario introduce un número, el programa deberá contemplar las siguientes situaciones:
 * Deberá indicar que "el número oculto es mayor que el número introducido" en caso de que lo sea.
 * Deberá indicar que "el número oculto es menor que el número introducido" en caso de que lo sea.
 * Deberá indicar que se ha "acertado el número" en caso de que el número coincida con el número oculto.
 * Se deberá contar cada uno de los intentos para mostrar al final cuántos intentos ha realizado el usuario.
 * En caso de que alguno de los números introducidos no esté en el rango válido, se avisará al usuario que el "número no es válido" y no se tendrá en cuenta como uno de los intentos.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 17/10/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio04 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=0, count=0;
        int random=(int)Math.floor(Math.random()*100+1);
        boolean booleano = true;

        while(booleano){

            System.out.print("\nIntroduzca el número entero entre 1 y 100: ");
            num1 = teclado.nextInt();
    
            if(num1==random){
                count++;
                System.out.println("\n¡Enhorabuena! El número correcto es el: "+num1);
                System.out.println("\tHa realizado "+count+" intentos para adivinarlo.");
                booleano=false;
            }else if(num1<random && num1>=0){
                System.out.println("\tEl número es mayor que "+num1);
                count++;
            }else if(num1>random && num1<=100){
                System.out.println("\tEl número es menor que "+num1);
                count++;
            }else{
                System.out.println("\tEl número no es válido, debe ser entre 0 y 100");
            }
        }



    }
}
