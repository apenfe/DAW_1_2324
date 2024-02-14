package juego2048Poo06;

import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static Tablero actual = new Tablero();
	
	public static void main(String[] args){
		
		do {
			
			System.out.println("\n--- MENU ---");
			System.out.println("1 - INICIAR PARTIDA");
			System.out.println("2 - CONTINUAR PARTIDA");
			System.out.println("3 - SALIR");
			int opcion = pedirInt("Seleccione una opcion: ");
			
			if(opcion==3) {
				
				System.err.println("\nFin del programa.");
				break;
				
			}else if(opcion==2) {
				
				if(!actual.isInit()) {
					
					System.err.println("\nPrimero debe de iniciar una partida.");
					
				}else {
					
					actual.jugar();
					
				}
				
			}else if(opcion==1) {
				
				actual = new Tablero(true);
				
				actual.jugar();
				
			}else {
				
				System.err.println("\nSeleccione una opcion valida entre 1 y 3.");
				
			}
			
		}while(true);
		
	}
	
	public static int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		
		int salida = 0;
		
		do {
			
			try {
				
				salida = Integer.parseInt(teclado.nextLine().trim());
				return salida;
				
			} catch (Exception e) {
				
				System.err.print("ERROR - Inserte un numero entero: ");
				
			}
			
		} while (true);
		
	}
	
	
}