package Simulacro02;

public class Coordenada{
	
	private double x;
	private double y;
	
	public Coordenada(double x, double y) {
		
		this.x=x;
		this.y=y;
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static double getDistancia(Coordenada uno, Coordenada dos) {
		
		double distancia=Math.sqrt((Math.pow(dos.getX()-uno.getX(), 2))+(Math.pow(dos.getY()-uno.getY(), 2)));
		
		return distancia;
		
	}
	
	
	
}