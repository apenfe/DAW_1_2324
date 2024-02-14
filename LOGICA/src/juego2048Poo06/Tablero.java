package juego2048Poo06;

import java.util.Scanner;

public class Tablero{
	
	private final int FIL = 4;
	private final int COL = 4;
	private int[][] tablero = new int[FIL][COL];
	private boolean init;
	private static Scanner teclado = new Scanner(System.in);

	
	public Tablero() {
		
	}
	
	public Tablero(boolean check) {
		
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				tablero[i][j]=0;
			}
		}
		
		fichaAleatoria(2);
		
		this.init=true;
		
	}
	
	private void fichaAleatoria(int veces) {
		
		for (int k = 0; k < veces; k++) {
			
			int i, j;
			
			do {
				
				i=(int)(Math.random()*FIL);
				j=(int)(Math.random()*COL);	
				
			}while(tablero[i][j]!=0);
			
			tablero[i][j]=2;
			
		}
		
	}
	
	public void mostrar() {
		
		System.out.println();
		
		for (int i = 0; i < FIL; i++) {
			
			System.out.print("\t");
			
			for (int j = 0; j < COL; j++) {
				
				System.out.print(tablero[i][j]+" ");
				
			}
			
			System.out.println();

		}
		
		System.out.println();
		
	}
	
	public void mover(String direccion) {

		if (direccion.equals("d")) {

			for (int i = 0; i < FIL; i++) {
				
				for (int j = COL - 2; j >= 0; j--) {
					
					for (int k = j; k < FIL - 1 && tablero[i][k] != 0; k++) {
						
						if (tablero[i][k + 1] == 0) {
							tablero[i][k + 1] = tablero[i][k];
							tablero[i][k] = 0;
							
						} else if (tablero[i][k + 1] == tablero[i][k]) {
							tablero[i][k + 1] *= 2;
							tablero[i][k] = 0;

						}
						
					}
					
				}
				
			}

		} else if (direccion.equals("a")) {
			
			for (int i = 0; i < FIL; i++) {

				for (int j = COL - 2; j >= 0; j--) { // VER

					for (int k = j; k < FIL - 1 && tablero[i][k] != 0; k++) {

						if (tablero[i][k + 1] == 0) {
							tablero[i][k + 1] = tablero[i][k];
							tablero[i][k] = 0;

						} else if (tablero[i][k + 1] == tablero[i][k]) {
							tablero[i][k + 1] *= 2;
							tablero[i][k] = 0;

						}

					}

				}

			}

		} else if (direccion.equals("w")) {
			
			for (int i = 0; i < FIL; i++) {

				for (int j = COL - 2; j >= 0; j--) { // VER

					for (int k = j; k < FIL - 1 && tablero[i][k] != 0; k++) {

						if (tablero[i][k + 1] == 0) {
							tablero[i][k + 1] = tablero[i][k];
							tablero[i][k] = 0;

						} else if (tablero[i][k + 1] == tablero[i][k]) {
							tablero[i][k + 1] *= 2;
							tablero[i][k] = 0;

						}

					}

				}

			}	

		} else if (direccion.equals("s")) {
			
			for (int i = 0; i < FIL; i++) {

				for (int j = COL - 2; j >= 0; j--) { // VER

					for (int k = j; k < FIL - 1 && tablero[i][k] != 0; k++) {

						if (tablero[i][k + 1] == 0) {
							tablero[i][k + 1] = tablero[i][k];
							tablero[i][k] = 0;

						} else if (tablero[i][k + 1] == tablero[i][k]) {
							tablero[i][k + 1] *= 2;
							tablero[i][k] = 0;

						}

					}

				}

			}

		}

	}
	
	private boolean ganador() {
		
		for (int i = 0; i < FIL; i++) {
			
			for (int j = 0; j < COL; j++) {
				
				if(tablero[i][j]==2048) {
					return true;
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public boolean finPartida() {
		
		if(ganador()) {
			
			System.out.println("HAS GANADO.");
			return true;
			
		}else {
			
			for (int i = 0; i < FIL; i++) {
				
				for (int j = 0; j < COL; j++) {
					
					if(tablero[i][j]==0) {
						return false;
					}
					
				}
				
			}
			
		}
		
		System.out.println("JUEGO TERMINADO.");
		return true;
		
	}

	public boolean isInit() {
		return init;
	}

	public void setInit(boolean init) {
		this.init = init;
	}
	
	public void jugar() {
		
		do {
			
			mostrar();
			
			System.out.print("Introduce un movimiento (a,d,w,s) (m - menu): ");
			String movimiento = teclado.nextLine().trim().toLowerCase();
			
			if(movimiento.equals("m")) {
				
				System.err.println("\nVolviendo al menu principal.");
				return;
				
			}else if(movimiento.equals("a")||movimiento.equals("d")||movimiento.equals("w")||movimiento.equals("s")) {
				
				mover(movimiento);
				
			}else {
				
				System.err.println("\nInserte un movimeinto valido.");
				
			}
			
			if(finPartida()) {
				break;
			}else {
				fichaAleatoria(1);
			}
			
		}while(true);
		
	}
	
}