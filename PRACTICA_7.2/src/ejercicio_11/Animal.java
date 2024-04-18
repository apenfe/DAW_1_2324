package ejercicio_11;

public abstract class Animal{
	
	private int edad;
	private String nombre;
	private String sexo;
	
	public abstract String sonidoCaracteristico();
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nombre = " + nombre + ", edad = " + edad;
	}
	
}