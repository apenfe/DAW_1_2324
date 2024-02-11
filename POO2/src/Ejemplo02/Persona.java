package Ejemplo02;

public class Persona{	
	
	public String nombre;
	public String apellido;
	
	// Esto son atributos de la clase que representan el estado del objeto
	// que se cree a partir de la clase
	
	public String nombreCompleto() {
		
		return nombre + " "+apellido;

	}
	
	public String apellidosNombre() {
		
		return apellido + ", "+nombre;
		
	}
				
}