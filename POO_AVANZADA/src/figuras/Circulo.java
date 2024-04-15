package figuras;

public class Circulo{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	public int radio;
	
	public void area() {
		
		System.out.println(Math.PI * (Math.pow(radio, 2)));
		
	}
	
	public void perimetro() {
		
		System.out.println(2 * Math.PI * radio);
		
	}
	
}