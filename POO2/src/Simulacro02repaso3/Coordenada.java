package Simulacro02repaso3;

public class Coordenada{
	
	private double x;
	private double y;
	
	public Coordenada(double x, double y) {
		
		setX(x);
		setY(y);	
		
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distancia(Coordenada a) {
		
		double dis = Math.sqrt((Math.pow((y-a.getY()), 2))+(Math.pow((x-a.getX()), 2)));
		return dis;
		
	}

	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
}