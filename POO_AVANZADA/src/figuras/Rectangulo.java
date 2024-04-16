package figuras;

public class Rectangulo extends Figura{ // en diagrama de clases, estos metodos y clases aparecen en cursiva
	
	public int largoLado1;
	public int largoLado2;
	
	public Rectangulo(int lados, int largoLado1, int largoLado2) {
		
		super(lados);
		this.largoLado1=largoLado1;
		this.largoLado2=largoLado2;
		super.lados=4;
		
	}
	
	public void area() {
		
		System.out.println(largoLado1*largoLado2);
		
	}
	
	public void perimetro() {
		
		System.out.println((largoLado1*2)+(largoLado2*2));
		
	}
	
}