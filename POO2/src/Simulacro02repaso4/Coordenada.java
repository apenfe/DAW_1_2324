package Simulacro02repaso4;

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

	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
	public double distancia(Coordenada a) {
		
		return Math.sqrt(Math.pow(y-a.getY(), 2)+Math.pow(x-a.getX(), 2));
		
	}
	
}