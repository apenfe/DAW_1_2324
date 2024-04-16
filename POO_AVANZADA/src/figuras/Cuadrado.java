package figuras;

public class Cuadrado extends Figura{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	public int largo;
	
	public Cuadrado(int lados, int largo) {
		
		super(lados);
		this.largo=largo;
		
	}
	
	public void area() {
		
		System.out.println(largo*largo);
		
	}
	
	public void perimetro() {
		
		System.out.println(largo*4);
		
	}
	
}