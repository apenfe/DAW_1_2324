package DOS1;

/* Practica Ocho.
 * Escribe un programa simple que pida un número entero por consola y muestre por pantalla la tabla de multiplicar de dicho número.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

import java.util.Scanner;

public class PracticaOcho{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int opcion = teclado.nextInt();

        for(int i= 0; i<11; i++){
            System.out.println(i + " x " + opcion + " = " + (i*opcion));
        }
    }
}
