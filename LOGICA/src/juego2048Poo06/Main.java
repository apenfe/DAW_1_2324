package juego2048Poo06;

import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args){
		
		Tablero actual = new Tablero();
		
		do {
			
			System.out.println("--- MENU ---");
			System.out.println("1 - INICIAR PARTIDA");
			System.out.println("2 - CONTINUAR PARTIDA");
			System.out.println("3 - SALIR");
			int opcion = pedirInt("Seleccione una opcion: ");
			
			if(opcion==3) {
				
				System.out.println("Fin del programa.");
				break;
				
			}else if(opcion==2) {
				
				if(!actual.isInit()) {
					
					System.out.println("Primero debe de iniciar una partida.");
					
				}else {
					
					do {
						
						actual.mostrar();
						
						System.out.print("Intriduce un movimiento (a,d,w,s) (m - menu): ");
						String movimiento = teclado.nextLine().trim().toLowerCase();
						
						if(movimiento.equals("m")) {
							
							System.out.println("Volviendo al menu principal.");
							break;
							
						}else if(movimiento.equals("a")||movimiento.equals("d")||movimiento.equals("w")||movimiento.equals("s")) {
							
						}else {
							
							System.out.println("Inserte un movimeinto valido.");
							
						}
						
					}while(true);
					
				}
				
			}else if(opcion==1) {
				
				actual = new Tablero(true);
				
				do {
					
					actual.mostrar();
					
					System.out.print("Intriduce un movimiento (a,d,w,s) (m - menu): ");
					String movimiento = teclado.nextLine().trim().toLowerCase();
					
					if(movimiento.equals("m")) {
						
						System.out.println("Volviendo al menu principal.");
						break;
						
					}else if(movimiento.equals("a")||movimiento.equals("d")||movimiento.equals("w")||movimiento.equals("s")) {
						
					}else {
						
						System.out.println("Inserte un movimeinto valido.");
						
					}
					
				}while(true);
				
			}else {
				
				System.out.println("Seleccione una opcion valida entre 1 y 3.");
				
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