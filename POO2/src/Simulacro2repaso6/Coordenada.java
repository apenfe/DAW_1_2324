package Simulacro2repaso6;

public class Coordenada{
	
	private double x;
	private double y;
	
	public Coordenada(double x, double y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public String toString() {
		
		return "[ "+x+", "+y+" ]";
		
	}
	
	public double distancia(Coordenada a) {
		
		return Math.sqrt(Math.pow(x-a.getX(),2)+Math.pow(y-a.getY(), 2));
		
	}
	
	
}