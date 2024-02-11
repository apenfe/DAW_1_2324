package Simulacro02repaso;

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
	
	public static double distancia(Coordenada a, Coordenada b) {
		
		double distancia = Math.sqrt(Math.pow(b.getX()-a.getX(), 2)+Math.pow(b.getY()-a.getY(), 2));
		
		return distancia;
		
	}
	
	public String toString() {
		return " ("+getX()+", "+getY()+") ";
	}
	
	
	
}