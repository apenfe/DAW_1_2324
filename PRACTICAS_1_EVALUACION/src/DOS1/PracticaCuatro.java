package DOS1;

/* Practica Cuatro.
 * Escribe un programa simple que muestre en tres líneas separadas tu nombre completo, calle, ciudad, país y código postal.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

public class PracticaCuatro{

    public static void main(String [] args){

       String nombre = "Adrián Peñalver Fernández";
       String direccion = "C/ Rosario, nº4, Murcia.";
       int c = 30160;

       System.out.println("\tSu nombre es: " + nombre);
       System.out.println("\tLa dirección es: " + direccion);
       System.out.println("\tCP: " + c);
    }
}
