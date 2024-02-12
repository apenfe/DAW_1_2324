package Ejercicio02;

/* 
 * Poligono.java
 * APF - 10-01-2024
 * 
 */

public class Poligono{
	
	private String tipo;
	private int cantVertices;
	private Punto[] vertices;
	private double area;
	
	public Poligono() {
		
	}
	
	public Poligono(String tipo, int cantVertices, Punto[] vertices, double area) {
		this.tipo=tipo;
		this.cantVertices=cantVertices;
		this.vertices=new Punto[cantVertices];
		this.area=area;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantVertices() {
		return cantVertices;
	}

	public void setCantVertices(int cantVertices) {
		this.cantVertices = cantVertices;
	}

	public Punto[] getVertices() {
		return vertices;
	}

	public void setVertices(Punto[] vertices) {
		this.vertices = vertices;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	
	
}