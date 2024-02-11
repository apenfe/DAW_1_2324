package TRES2;

/* 
 * Ejercicio05.java
 *
 * Escribe un método que se llame triangulo() que reciba un número entero como parámetro y muestre por pantalla
 * una pirámide de asteriscos.
 * Por ejemplo, si se proporciona el valor 6, el resultado sería:
 *                     *
 * 
 *                    ***
 *
 *                   *****
 *
 *                  *******
 *
 *                 *********
 *
 *                ***********
 *
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio05{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que tamaño desea su piramide? ");
        int numero = teclado.nextInt();
        
        while(numero<=0){
            System.out.println("\nEl número debe ser mayor o igual a 1.");
            System.out.print("\tIngrese otro número: ");
            numero=teclado.nextInt();
        }

        triangulo(numero);
    }

    public static void triangulo(int numero){   

        int max = numero+(numero-1);

        System.out.println();
    
        for(int i=1; i<=numero; i++){

            System.out.print("\t");

            for(int j=1;j<=max;j++){
                    
                    if(j<(((max-1)/2)+1)-i+1 || j>(((max-1)/2)+1)+i-1){

                        System.out.print(" ");

                    }else{

                        System.out.print("*");

                    }                      
            }

        System.out.println("\n");

        }

    }
        
}
