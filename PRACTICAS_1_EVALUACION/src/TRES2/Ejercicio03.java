package TRES2;

/* 
 * Ejercicio03.java
 *
 * Escribe un programa que muestre el factorial de un número leído por teclado.
 * Para el cálculo del factorial utiliza un método llamado factorial() que recibe el número para el cálculo 
 * y devuelve el resultado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio03{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que número desea conocer su factorial? ");
        int numero = teclado.nextInt();
        
        while(numero<0){

            System.out.println("\nEl número debe ser mayor o igual a 0.");
            System.out.print("\tIngrese otro número: ");
            numero=teclado.nextInt();
        }

        System.out.println("\nEl factorial del número " + numero + " es igual a: " + factorial(numero));

    }

    public static int factorial(int numero){

        int factorial;

        if(numero==0){
            factorial=1;
        }else{
            factorial=1;
            for(int i=1; i<=numero; i++){
            factorial*=i;
            }

        }
        
        return factorial;
    }
}
