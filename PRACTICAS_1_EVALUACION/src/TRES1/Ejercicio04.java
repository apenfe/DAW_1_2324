package TRES1;

/* 
 * Ejercicio04.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * A partir de los archivo de Multiplo2.java y Multiplo3.java de los ejercicios anteriores:
 * Crea una sola clase llamada Ejercicio04.
 * En main(), escribe la llamada:
 * mostrarMultiplos2(pedirTope());
 * Hay que hacer que todo funcione correctamente.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio04{
    public static void main(String argumentos[]) {

	    mostrarMultiplos2(pedirTope());

	}

    public static int pedirTope() {

	    Scanner teclado = new Scanner(System.in);
        int tope=-1;
       
          while(tope<0){
            
            System.out.print("Ingrese el tope para el calculo de los multiplos de 2: ");
            tope = teclado.nextInt();
            
            if(tope<0){
                System.out.println("El número debe ser mayor o igual que 0.\n");
            }
        }
		
		teclado.close();

        return tope;
	}

    public static void mostrarMultiplos2(int tope) {

		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}
}
