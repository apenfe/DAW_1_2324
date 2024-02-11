package TRES2;

/* 
 * Ejercicio06.java
 *
 * Escribe un método que se llame rombo() que reciba un número entero como parámetro y muestre por pantalla  
 * un rombo de asteriscos.
 * Por ejemplo, si como argumento se le proporciona el valor 5, el resultado sería:
 *                     *
 *
 *                    ***
 *
 *                   *****
 *
 *                    ***
 *
 *                     *
 *
 * Hay que tener en cuenta que el número de filas -para un rombo- debe ser impar por cuestiones de simetría.
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio06{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que tamaño desea su rombo? ");
        int numero = teclado.nextInt();
        
        while(numero<=0||numero%2==0){

            if(numero<=0){
            
                System.out.println("\nEl número debe ser mayor o igual a 1.");
                System.out.print("\tIngrese otro número: ");
                numero=teclado.nextInt();

            }else{
            
                System.out.println("\nEl número debe ser impar.");
                System.out.print("\tIngrese otro número: ");
                numero=teclado.nextInt();

            }
            
        }

        rombo(numero);
    }

    public static void rombo(int numero){   

        System.out.println();
    
        for(int i=1; i<=numero; i++){

             System.out.print("\t");

             for(int j=1;j<=numero;j++){

                if(i<=((numero-1)/2)){
                    
                    if(j<(((numero-1)/2)+1)-i+1 || j>(((numero-1)/2)+1)+i-1){

                        System.out.print(" ");

                    }else{

                        System.out.print("*");

                    }
                    
                }else if(i>=((numero-1)/2)+2){

                    if(j<(((numero-1)/2)+1)-(numero-i) || j>(((numero-1)/2)+1)+(numero-i)){

                        System.out.print(" ");

                    }else{

                        System.out.print("*");

                    }

                }else{

                   System.out.print("*");

                }            
        }

        System.out.println("\n");

        }

    }
        
    
}
