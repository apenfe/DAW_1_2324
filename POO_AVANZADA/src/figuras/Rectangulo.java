package figuras;

public class Rectangulo{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	public int largoLado1;
	public int largoLado2;
	
	public void area() {
		
		System.out.println(largoLado1*largoLado2);
		
	}
	
	public void perimetro() {
		
		System.out.println((largoLado1*2)+(largoLado2*2));
		
	}
	
}