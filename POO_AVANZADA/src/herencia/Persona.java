package herencia;

public abstract class Persona{
	
	protected String nombre;
	protected String apellidos;
	protected String email;
	protected String direccion;

	public Persona(String nombre, String apellidos, String email, String direccion) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.direccion=direccion;
		
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		
		return this.getNombre()+" "+this.getApellidos()+" ---> ";
		
	}
	
}