package Ejercicio02;

/* 
 * Manzana.java
 * APF - 10-01-2024
 * 
 */

public class Manzana{
	
	private String tipo;
	private String color;
	private String pais;
	private double peso;
	
	public Manzana() {
		
	}
	
	public Manzana(String tipo, String color, String pais, double peso) {
		this.tipo=tipo;
		this.color=color;
		this.pais=pais;
		this.peso=peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}