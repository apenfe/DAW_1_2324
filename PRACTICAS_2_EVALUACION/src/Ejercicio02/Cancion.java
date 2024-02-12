package Ejercicio02;

/* 
 * Cancion.java
 * APF - 10-01-2024
 * 
 */

public class Cancion{
	
	private String nombre;
	private String autor;
	private String disco;
	private double minutos;
	
	public Cancion() {
		
	}
	
	public Cancion(String nombre, String autor, String disco, double minutos) {
		this.nombre=nombre;
		this.autor=autor;
		this.disco=disco;
		this.minutos=minutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public double getMinutos() {
		return minutos;
	}

	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}
	
}