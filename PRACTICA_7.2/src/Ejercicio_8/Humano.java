package Ejercicio_8;

public class Humano{
	
	private String nombre;
	private String apellidos;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		
		return nombre + " " + apellidos;
		
	}
	
}