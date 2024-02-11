package Biblioteca;

public class Libro{
	
	private String isbn;
	private String titulo;
	private String idautor;
	private String cantidad;
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String titulo, String idautor, String cantidad) {
		
		this.isbn=isbn;
		this.titulo=titulo;
		this.idautor=idautor;
		this.cantidad=cantidad;
		
	}
	

	public String getIdautor() {
		return idautor;
	}

	public void setIdautor(String idautor) {
		this.idautor = idautor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return idautor;
	}

	public void setAutor(String autor) {
		this.idautor = autor;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + idautor + ", cantidad=" + cantidad + "]";
	}
	
	
}