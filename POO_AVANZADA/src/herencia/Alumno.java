package herencia;

public class Alumno extends Persona{
	
	private String nre;

	public Alumno(String nombre, String apellidos, String email, String direccion,String nre) {
		
		super(nombre,apellidos,email,direccion);
		this.nre=nre;
		
	}

	public String getNre() {
		return nre;
	}

	public void setNre(String nre) {
		this.nre = nre;
	}
	
	
	public String toString() {
		
		return super.toString()+" "+this.nre;
		
	}
	
	
	
}