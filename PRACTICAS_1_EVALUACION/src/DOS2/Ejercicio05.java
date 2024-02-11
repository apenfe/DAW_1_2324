package DOS2;

/* Ejercicio05.java
 *
 * Escribe un programa simple que lea tantos números enteros positivos como se quiera mientras no sea un cero, que terminaría. 
 * Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
 * No hay que guardar los valores individualmente introducidos.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int num=1;
        int suma=0;
        int count=0;

        while(num>0){
           
            System.out.print("Introduzca un número entero positivo y mayor que 0: ");
            num = teclado.nextInt();
            
            if(num>0){
                suma+=num;
                count++;
            }

            if(num<0 && count==0 || (num==0 && count==0)){
                System.out.println("Debe de introducir un número mayor que 0.");
                return;
            }
      
        }
 
            System.out.println("\nLa suma de todos los números es: " + suma + ". ");
            System.out.println("La media aritmetica es: " + (double)suma/count + ". ");

    }
}
