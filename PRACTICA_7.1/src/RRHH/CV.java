package RRHH;

import ejercicio_7.*;

public class CV extends Documento{
	
	public String nombre;
	public String experiencia;

	public CV(String nombre, String experiencia, String paginas) {
		
		super(paginas);
		this.nombre = nombre;
		this.experiencia = experiencia;
		
	}

	@Override
	public String toString() {
		return "CV [nombre=" + nombre + ", experiencia=" + experiencia + ", paginas=" + super.getPaginas() + "]";
	}
	
}