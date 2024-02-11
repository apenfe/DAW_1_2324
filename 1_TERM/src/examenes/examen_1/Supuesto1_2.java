/**
 * Supuesto1_2.java
 * Se pide una cantidad de productos y el precio unitario, se mostrará por pantalla el precio
 * unitario, cantidad, precio total, total sin iva e iva total.
 * Adrián Peñalver Fernández 06/10/2023
 */
package examenes.examen_1;
import java.util.Scanner;

public class Supuesto1_2 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca los siguientes datos que se solicitan: ");
        System.out.println("");
        System.out.print("\tPrecio unitario del producto: ");
        double precioUnitario = teclado.nextDouble();

        System.out.print("\tCantidad de dicho producto: ");
        int cantidad = teclado.nextInt();

        if(precioUnitario <=0 || cantidad <=0){

            System.out.println("");
            System.out.println("\tEl precio unitario o la cantidad son invalidas. ");
            System.out.println("\tDeben ser de un valor superior a 0.");

        }else{

        System.out.println("");
        System.out.println("\tEl precio unitario es: " + precioUnitario + " €.");
        System.out.println("\tLa cantidad es: " + cantidad + " unidades.");
        System.out.println("\tEl precio total será de: " + (precioUnitario*cantidad) + " €.");
        System.out.println("\tEl total sin IVA es: " + ((precioUnitario*cantidad)-((precioUnitario*cantidad)*0.21)) + " €.");
        System.out.println("\tEl IVA total es: " + ((precioUnitario*cantidad)*0.21) + " €.");

        }
        
        teclado.close();
        
    }
}


