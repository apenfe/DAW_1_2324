package chatgpt_2;

public abstract class Mascota{
	
	private String id;
	private String nombre;
	private int edad;
	
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
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract String calcularCostoMensaul();
	
	public abstract String mostrarDetalles();
	
}