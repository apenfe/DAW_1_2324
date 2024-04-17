package ejercicio_6;

public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(double alto, double ancho) {
		
		super.alto=alto;
		super.ancho=ancho;
		
	}

	@Override
	public double calcularArea() {
		
		return alto*ancho;
		
	}
	
}