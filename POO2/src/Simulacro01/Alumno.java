package Simulacro01;

public class Alumno{	
	
	private String nombre;
	private String apellido;
	private String nre;
	private String email;
	private String direccion;
	
	// Esto son atributos de la clase que representan el estado del objeto
	// que se cree a partir de la clase
	
	// Constructor
	public Alumno() {
		
		setNombre("NO NAME");
		setApellido("NO SURNAME");
		setNre("NO NRE");
		setEmail("NO EMAIL");
		setDireccion("NO DIRECCION");
	}
	
	public Alumno(String name, String surname, String id, String mail, String direcc) {
		
		setNombre(name);
		setApellido(surname);
		setNre(id);
		setEmail(mail);
		setDireccion(direcc);
	}
	
	
	public String getNombre() {
		
		return nombre;

	}
	
	public String getApellido() {
		
		return apellido;

	}
	
	public String getNre() {
		
		return nre;

	}
	
	public String getEmail() {
		
		return email;

	}
	
	public String getDireccion() {
		
		return direccion;

	}
	
	public void setNombre(String name) {
		
		name= name.trim();
		name= name.replaceAll("[^A-Za-zÁÉÍÓÚáéíóú\\s]", "");
		
		nombre = name;

	}
	
	public void setApellido(String surname) {
		
		surname = surname.trim();
		surname = surname.replaceAll("[^A-Za-zÁÉÍÓÚáéíóú\\s]", "");
		
		apellido = surname;

	}
	
	public void setNre(String id) {
		
		id = id.trim();
		id = id.replaceAll("[^0-9]", "");
		
		nre= id;

	}
	
	public void setEmail(String mail) {
		
		email=mail;

	}
	
	public void setDireccion(String direcc) {
		
		direccion= direcc;

	}
	
	public String info() {
		
		String informacion = "";
		
		informacion += "Nombre: " + getNombre()+"\n";
		informacion += "Apellidos: " + getApellido()+"\n";
		informacion += "NRE: " + getNre()+"\n";
		informacion += "Email: " + getEmail()+"\n";
		informacion += "Dirección: " + getDireccion()+"\n";
		
		return informacion;
		
	}
	
				
}