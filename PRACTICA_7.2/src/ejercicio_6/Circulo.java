package ejercicio_6;

public class Circulo extends FiguraGeometrica{
	
	public Circulo(double radio) {
		
		super.alto=radio;
		super.ancho=radio;
		
	}

	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(ancho, 2);
		
	}
	
}