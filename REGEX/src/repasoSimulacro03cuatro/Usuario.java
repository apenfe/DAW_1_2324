package repasoSimulacro03cuatro;

public class Usuario{
	
	private String id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private String direccion;
	private String telefono;
	
	public Usuario(String[] datos) {
		
		this.id=datos[0];
		this.nombre=datos[1];
		this.apellidos=datos[2];
		this.dni=datos[3];
		this.email=datos[4];
		this.direccion=datos[5];
		this.telefono=datos[6];
		
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}