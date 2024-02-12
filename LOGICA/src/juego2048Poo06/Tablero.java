package juego2048Poo06;

public class Tablero{
	
	private final int FIL = 4;
	private final int COL = 4;
	private int[][] tablero = new int[FIL][COL];
	private boolean init;
	
	public Tablero() {
		
	}
	
	public Tablero(boolean check) {
		
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				tablero[i][j]=0;
			}
		}
		
		int i1, j1, i2, j2;
		
		do {
			
			i1=(int)(Math.random()*FIL);
			j1=(int)(Math.random()*COL);
			i2=(int)(Math.random()*FIL);
			j2=(int)(Math.random()*COL);	
			
		}while(i1==i2 && j1==j2);
		
		tablero[i1][j1]=2;
		tablero[i2][j2]=2;
		
		this.init=true;
		
	}
	
	public void mostrar() {
		
		System.out.println();
		
		for (int i = 0; i < FIL; i++) {
			
			for (int j = 0; j < COL; j++) {
				
				System.out.print(tablero[i][j]+" ");
				
			}
			
			System.out.println();

		}
		
		System.out.println();
		
	}
	
	public void mover(String direccion) {
		
		for (int i = 0; i < FIL; i++) {
			
			for (int j = 0; j < COL; j++) {
				
				System.out.print(tablero[i][j]+" ");
				
			}
			
			System.out.println();

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
		
		return false;
		
	}

	public boolean isInit() {
		return init;
	}

	public void setInit(boolean init) {
		this.init = init;
	}
	
	
	
}