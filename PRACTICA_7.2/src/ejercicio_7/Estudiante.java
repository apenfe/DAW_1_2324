package ejercicio_7;

public class Estudiante extends Humano{
	
	public Double[] listaNotas;
	
	public Estudiante(Double[] listaNotas, String nombre, String apellidos) {
		
		super.setApellidos(apellidos);
		super.setNombre(nombre);
		this.listaNotas=listaNotas;
		
	}
	
}