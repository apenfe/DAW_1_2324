package Ejercicio02;

/* 
 * TelefonoMovil.java
 * APF - 10-01-2024
 * 
 */

public class TelefonoMovil{
	
	private String marca;
	private String fabricante;
	private String modelo;
	private int year;
	private int memoria;
	private int stock;
	
	
	public TelefonoMovil() {
		
	}
	
	public TelefonoMovil(String marca, String fabricante, String modelo, int year, int memoria, int stock) {
		this.marca=marca;
		this.fabricante=fabricante;
		this.modelo=modelo;
		this.year=year;
		this.memoria=memoria;
		this.stock=stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}