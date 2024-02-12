package laberintoMio;

public class Casilla{
	
	private int fila;
	private int columna;
	private boolean check;
	
	public Casilla(int fila, int columna) {
		
		this.fila=fila;
		this.columna=columna;
		
	}
	
	public boolean iguales(Casilla a) {
		
		if(fila==a.getFila()&&columna==a.getColumna()) {
			return true;
		}else {
			return false;
		}
		
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public boolean getCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "[fila=" + fila + ", columna=" + columna + "]";
	}
	
}