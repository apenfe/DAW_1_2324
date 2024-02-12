package Ejercicio02;

/* 
 * Libro.java
 * APF - 10-01-2024
 * 
 */

public class Libro{
	
	private String nombre;
	private String autor;
	private String isbn;
	private int stock;
	private String edicion;
	private int year;
	
	
	public Libro() {
		
	}
	
	public Libro(String nombre, String autor, String isbn, int stock, String edicion, int year ) {
		this.nombre=nombre;
		this.autor=autor;
		this.isbn=isbn;
		this.stock=stock;
		this.edicion=edicion;
		this.year=year;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
}