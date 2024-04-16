package figuras;

public abstract class Figura{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	// se pueden hacer metodos abstractos y no abstractos dentro de una clase abstracta
	// una interfaz solo tiene metods abstractos
	
	public int lados;
	
	public Figura() {
		
	}
	
	public Figura(int lados) {
		
		this.lados=lados;
		
	}
	
	public abstract void area();
	
	public abstract void perimetro();
	
}