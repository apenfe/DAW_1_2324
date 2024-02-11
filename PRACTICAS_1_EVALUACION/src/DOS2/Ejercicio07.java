package DOS2;

/* Ejercicio07.java
 *
 * Escribe un programa simple que, en un bucle continuo, pida un número con varios decimales, los que quiera el usuario.
 * Después pregunta a cuantos decimales se quiere redondear.
 * Seguidamente muestra el resultado redondeado, teniendo en cuenta que no hay que cortar, hay que redondear.
 * Debe haber algún medio de terminar el bucle continuo de entrada de datos.
 * Puede resolverse utilizando el método Math.rint(…) que redondea al entero mayor o igual que corresponde al número double recibido como argumento.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 10/10/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio07{
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        String respuesta = "S";

        while(respuesta.equalsIgnoreCase("s")){

            System.out.print("Inserte un número real con varios decimales: ");
            double real = teclado.nextDouble();
            System.out.print("A continuación indique a cuantos decimales desea redondear: ");
            int decimales = teclado.nextInt();
        
            double resultado = Math.rint(real*Math.pow(10,decimales))/Math.pow(10,decimales);
            System.out.println("El número redondeado sería: " + resultado);

            teclado.nextLine();
            System.out.print("\n¿Desea redondear otro número? S/N: ");
            respuesta = teclado.nextLine();
            System.out.println();

        } 

    }
}    
