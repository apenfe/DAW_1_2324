package figuras;

public class Circulo extends Figura{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	// 
	public int radio;
	
	public Circulo(int radio) {
		
		super.lados=0;
		this.radio=radio;
		
	}
	
	public void area() {
		
		System.out.println(Math.PI * (Math.pow(radio, 2)));
		
	}
	
	public void perimetro() {
		
		System.out.println(2 * Math.PI * radio);
		
	}
	
}