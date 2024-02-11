package DOS2;

/* Ejercicio02.java
 *
 * Escribe un programa simple que calcule el interés producido y el capital total acumulado de un capital 
 * inicial invertido a un tipo de interés anual.
 * Debe pedir el capital principal inicial,  el tipo de interés anual y el número de años.
 * Muestra el valor de los intereses y el capital final acumulado.
 * Se puede utilizar la fórmula: Cf = Ci * (1 + r)n
 *
 *   Cf es el capital final.
 *   Ci es el capital inicial.
 *   r es el interés anual en tanto por uno.
 *   n es el número de años.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio02{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double ci = 0, r = -1, n = 0;

        while(ci<=0){
            System.out.print("A continuación deberá introducir el capital inicial: ");
            ci = teclado.nextDouble();

            if(ci<=0){
                System.out.println("\n\tEl capital inicial debe ser superior a 0 €.\n");
            }
        }

        while(r<0){
            System.out.print("\nIntroduzca el interés anual en tanto por ciento: ");
            r = (teclado.nextDouble()/100);

            if(r<0){
                System.out.println("\n\tEl interés debe ser entre 0 y 100 %.");
            }
        }

        while(n<=0){
            System.out.print("\nIntroduzca el número de años: ");
            n = teclado.nextDouble();

            if(n<=0){
                System.out.println("\n\tLos años deben ser superiores a 0.");
            }
        }

        System.out.print("\nEl capital final acumulado será de: ");
        double cf = ci * Math.pow(1+r,n);
        System.out.print(cf + " €.\n");
        System.out.println("El valor de los intereses asciende a " + (double)(cf-ci));

    }
}
