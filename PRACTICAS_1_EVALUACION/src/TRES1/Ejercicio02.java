package TRES1;

/* 
 * Ejercicio02.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * A partir del mismo archivo Multiplo1.java:
 * Renombra la clase como Ejercicio02.
 * Crea un método dentro de la clase que se llame mostrarMultiplos2() especializado en mostrar los múltiplos de 2 hasta el TOPE. Recibe un valor tope como parámetro de entrada.
 * Llama al método creado desde main().
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio02{
	public static void main(String argumentos[]) {

		Scanner teclado = new Scanner(System.in);
        int tope = -1;

        while(tope<0){
            
            System.out.print("Ingrese el tope para el calculo de los multiplos de 2: ");
            tope = teclado.nextInt();
            
            if(tope<0){
                System.out.println("El número debe ser mayor o igual que 0.\n");
            }
        }

        mostrarMultiplos2(tope);	
		
		teclado.close();
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
