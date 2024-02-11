/* 
 * Ejemplo09.java
 *
 * Dados 2 arrays, devuelve uno con solo lo elementos comunes entre ambos.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo10{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){
        
        System.out.print("\nInserte un número: "); 
        int num = Integer.parseInt(teclado.nextLine().trim());

            escalera(num);
        
    }

    public static void escalera(int num){

         System.out.println();


        for(int i=1;i<=num;i++){

            for(int j=1;j<=i;j++){

                System.out.print("[-]");

            }

            System.out.println();

        }
 System.out.println();

        
    }

}
