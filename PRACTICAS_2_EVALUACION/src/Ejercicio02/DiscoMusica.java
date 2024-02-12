package Ejercicio02;

/* 
 * DiscoMusica.java
 * APF - 10-01-2024
 * 
 */

public class DiscoMusica{
	
	private String nombre;
	private String autor;
	private String marca;
	private int year;
	private int canciones;
	private int stock;
	
	public DiscoMusica() {
		
	}
	
	public DiscoMusica(String nombre, String autor, String marca, int year, int canciones, int stock) {
		this.nombre=nombre;
		this.autor=autor;
		this.marca=marca;
		this.year=year;
		this.canciones=canciones;
		this.stock=stock;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCanciones() {
		return canciones;
	}

	public void setCanciones(int canciones) {
		this.canciones = canciones;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
}