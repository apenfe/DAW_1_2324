package DOS1;

/* Practica Cinco.
 * Escribe un programa simple que muestre por pantalla un menú de 4 o más opciones y pida al usuario elegir una opción.
 * El programa debe indicar por consola qué opción ha seleccionado el usuario.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

import java.util.Scanner;

public class PracticaCinco{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1 - PIZZA");
        System.out.println("2 - GNOCHI");
        System.out.println("3 - PASTA");
        System.out.println("4 - GELATO");

        int opcion = teclado.nextInt();

        switch(opcion){
        
            case 1:
                System.out.println("El usuario elige 1 - PIZZA");
            break;

            case 2:
                System.out.println("El usuario elige 2 - GNOCHI");
            break;

            case 3:
                System.out.println("El usuario elige 3 - PASTA");
            break;

            case 4:
                System.out.println("El usuario elige 4 - GELATO");
            break;

            default:
                System.out.println("Elije otro número válido.");
        }


    }
}
