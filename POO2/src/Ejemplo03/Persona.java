package Ejemplo03;

public class Persona{	
	
	public String nombre;
	public String apellido;
	
	// Esto son atributos de la clase que representan el estado del objeto
	// que se cree a partir de la clase
	
	// Constructor
	public Persona() {
		
		System.out.println("Persona creada");
		nombre = "Sin nombre";
		apellido = "Sin apellido";
	}
	
	public Persona(String name, String surname) {
		
		nombre = name;
		apellido = surname;
	}
	
	public String nombreCompleto() {
		
		return nombre + " "+apellido;

	}
	
	public String apellidosNombre() {
		
		return apellido + ", "+nombre;
		
	}
				
}