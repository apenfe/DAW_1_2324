package figuras;

public class Prueba{
	
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(3);
		Cuadrado cuadrado = new Cuadrado(4,3);
		Rectangulo rectangulo = new Rectangulo(4,3,4);
		
		System.out.println("Circulo: ");
		circulo.area();
		circulo.perimetro();
		
		System.out.println("Cuadrado: ");
		cuadrado.area();
		cuadrado.perimetro();
		
		System.out.println("Rectangulo: ");
		rectangulo.area();
		rectangulo.perimetro();
		
	}
	
}