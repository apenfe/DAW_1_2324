package ejercicio_10;

public class Triangulo extends FiguraGeometrica{
	
	public Triangulo(double base, double altura) {
		
		super.alto=base;
		super.ancho=altura;
		
	}
	
	@Override
	public double calcularArea() {
		
		return (alto*ancho)/2;
		
	}
	
}