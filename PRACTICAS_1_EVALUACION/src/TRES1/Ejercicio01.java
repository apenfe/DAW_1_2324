package TRES1;

/* Ejercicio01.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * Descarga el archivo Java llamado Multiplo1.java que debe ser compilado y ejecutado. Estudia su estructura y su comportamiento.
 * Renombra la clase como Ejercicio01
 * Crea un método dentro de la clase principal que se llame mostrarMultiplos1() que se encargue de hacer todo lo hace hace el programa.
 * Consiste en poner todas las instrucciones, anterirmente en main(), dentro del método pedido.
 * Llama al método creado desde main() para que el programa siga haciendo lo mismo.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio01{
    public static void main(String argumentos[]) {

		Scanner teclado = new Scanner(System.in);
		
        mostrarMultiplos1();

		teclado.close();
	}

    public static void mostrarMultiplos1() {

		final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

}
