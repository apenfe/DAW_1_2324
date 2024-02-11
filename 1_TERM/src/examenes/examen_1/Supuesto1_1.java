/**
 * Supuesto1_1.java
 * Se piden unos datos al usuario y posteriormente se muestran por pantalla.
 * Adrián Peñalver Fernández 06/10/2023
 */
package examenes.examen_1;
import java.util.Scanner;

public class Supuesto1_1 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca los siguientes datos que se solicitan: ");
        System.out.print("\tNombre completo: ");
        String nombre = teclado.nextLine();

        System.out.print("\tDNI, NIF o NIE: ");
        String dni = teclado.nextLine();

        System.out.print("\tEmail: ");
        String email = teclado.nextLine();

        System.out.print("\tDireccion: ");
        String direccion = teclado.nextLine();

        System.out.print("\tCódigo Postal: ");
        String codigo = teclado.nextLine();

        System.out.print("\tProvincia: ");
        String provincia = teclado.nextLine();
        
        System.out.println("");
        System.out.println("La persona es " + nombre + " (" + dni + ")");
        System.out.println("Email de contacto: " + email);
        System.out.println("Dirección: " + direccion + ". " + codigo + ", " + provincia);
        
    }
}

