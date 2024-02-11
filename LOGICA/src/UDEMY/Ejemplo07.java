/* 
 * Ejercicio07.java
 *
 * Dados dos numeros, determinar cuantos impares hay entre ellos.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo07{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println();  

        System.out.print("Introduzca el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println();        
              
        System.out.println(impares(num1,num2)); 

    }

    public static int impares(int num1, int num2){

        int num=0;

        for(int i=num1; i<=num2; i++){

                if(i%2==0){

                    continue;     

                }else{

                    num++;
                   
                }
        }

        return num;
         
    }

}
