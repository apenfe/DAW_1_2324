package TRES2;

/* 
 * Ejercicio04.java
 *
 * Escribe un método llamado fibonacci() que reciba un entero, compruebe que es válido y devuelva el valor que 
 * le corresponde en la sucesión de Fibonacci.
 * El método fibonacci() calcula su valor de la siguiente manera:
 * Sólo debe admitir números positivos
 * Si el número recibido es un 0, el termino de la sucesión vale 0; si es un 1, la sucesión vale 1;  si es un 2, 
 * la sucesión vale 1, si es un 3, la sucesión vale 2...
 * 0, 1, 1, 2, 3, 5...
 * 
 * Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
 * Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio04{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que número desea conocer el valor correspondiente en la serie de Fibonacci? ");
        int numero = teclado.nextInt();

        System.out.println("\nEl término del número en Fibonacci es igual a: "+fibonacci(numero));

    }

    public static int fibonacci(int numero){

        int num1=-1, n1=1, n2=1, sum=0;

        while(numero<0){

            System.out.print("\nIntroduce un número mayor o igual que 0: ");
            numero = teclado.nextInt();
        }

        if(numero==0){
            return 0;

        }else if(numero==1){
            return 1;

        }else if(numero==2){
            return 1;

        }else{

            for(int i=3; i<=numero; i++){
                sum=n1+n2;
                if(i==numero){
                    break;
                }
                n2=n1;
                n1=sum;
             }
             
             return sum;

        }
    }
}
