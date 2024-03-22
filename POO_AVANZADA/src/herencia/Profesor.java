package herencia;

public class Profesor extends Persona{
	
	private String nrp;

	public Profesor(String nombre, String apellidos, String email, String direccion,String nrp) {
		
		super(nombre,apellidos,email,direccion);
		
		this.nrp=nrp;
		
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	
	public String toString() {
		
		return super.toString()+" "+this.nrp;
		
	}
	
}
	
