package Biblioteca;

public class Autor{
	
	private String id;
	private String nombre;
	private String paisOrigen;
	
	public Autor() {
		
	}
	
	public Autor(String id, String nombre, String paisOrigen) {
		
		this.id=id;
		this.nombre=nombre;
		this.paisOrigen=paisOrigen;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", paisOrigen=" + paisOrigen + "]";
	}
	
}