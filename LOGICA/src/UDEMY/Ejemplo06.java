/* 
 * Ejercicio06.java
 *
 * Crear un cuadrado o rectangulo hueco.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo06{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca el alto: ");
        int alto = teclado.nextInt();
        System.out.println();  

        System.out.print("Introduzca el ancho: ");
        int ancho = teclado.nextInt();
        System.out.println();        
              
        rectangulo(alto,ancho); 

    }

    public static void rectangulo(int alto, int ancho){

        for(int i=1; i<=alto; i++){

            for(int j=1; j<=ancho; j++){

                if(i==1||i==alto|j==ancho|j==1){

                    System.out.print("*");       

                }else{

                    System.out.print(" ");
                
                }

            }

            System.out.println();

        }
         
    }

}
