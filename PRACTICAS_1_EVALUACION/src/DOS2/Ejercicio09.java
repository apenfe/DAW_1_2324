package DOS2;

/* Ejercicio09.java
 *
 * Escribe un programa simple que pida un número entero positivo por teclado.
 * Calcule el factorial del número y muestre el resultado.
 * El programa sólo debe admitir números positivos y el cero. El factorial de 0 es 1 por convenio.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 10/10/23
 */

import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        int num, resultado=1;

        do{
        
            System.out.print("Inserte un número entero para calcula su factorial (n!): ");
            num = teclado.nextInt();

            if(num<0){

                System.out.println("Debe insertar un número mayor o igual a 0\n");
            }

        }while(num<0);


        if(num==0){

            resultado=1;

        }else{

            for(int i=1; i<=num; i++){

                resultado *= i;
            }

        }

        System.out.println("\nEl resultado de " + num + "! es: " + resultado);
    }
}    
