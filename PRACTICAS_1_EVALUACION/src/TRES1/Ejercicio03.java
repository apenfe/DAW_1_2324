package TRES1;

/* 
 * Ejercicio03.java
 * Fecha: 23/10/2023
 * Autor: Adrián Peñalver Fernández
 *
 * A partir del mismo archivo Multiplo1.java:
 * Renombra la clase como Ejercicio03.
 * Crea un método dentro de la clase que se llame pedirTope(). Este método está especializado en pedir un valor por teclado y devolverlo para ser usado en main().
 * Como el tope es ahora variable; habría que modificar la declaración correspondiente para que no sea final.
 * Deben seguirse los principios y estilo del código limpio.
 *
 */

import java.util.Scanner;

public class Ejercicio03{
    public static void main(String argumentos[]) {

        int mult  ;							// Almacena el múltiplo calculado
		int cont  ;	
        int tope;						// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;
        tope = pedirTope();

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
    	}

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

}
