package ejercicio_10;

public class Cuadrado extends FiguraGeometrica{
	
	public Cuadrado(double lado) {
		
		super.alto=lado;
		super.ancho=lado;
		
	}

	@Override
	public double calcularArea() {
		
		return alto*alto;
		
	}
	
}