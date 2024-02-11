package Simulacro01repaso;

public class Alumno{
	
	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;
	
	public Alumno() {
		
		setNombre("null");
		setApellidos("null");
		setNre("null");
		setEmail("null");
		setDireccion("null");
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion) {
		
		setNombre(nombre);
		setApellidos(apellidos);
		setNre(nre);
		setEmail(email);
		setDireccion(direccion);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getApellidos() {
		
		return this.apellidos;
		
	}
	
	public void setNre(String nre) {
		this.nre = nre;
	}
	
	public String getNre() {
		
		return this.nre;
		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		
		return this.email;
		
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getDireccion() {
		
		return this.direccion;
		
	}
	
	public String info() {
		
		String cadena ="";
		cadena+="Nombre: "+getNombre()+"\n";
		cadena+="Apellidos: "+getApellidos()+"\n";
		cadena+="NRE: "+getNre()+"\n";
		cadena+="Email: "+getEmail()+"\n";
		cadena+="Direccion: "+getDireccion()+"\n";
		
		return cadena;
		
	}
	
	
}