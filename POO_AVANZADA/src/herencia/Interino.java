package herencia;

public class Interino extends Profesor{
	
	private String sustituye;

	public Interino(String nombre, String apellidos, String email, String direccion, String nrp, String sustituye) {
		
		super(nombre, apellidos, email, direccion, nrp);
		this.sustituye = sustituye;
		
	}

	public String getSustituye() {
		return sustituye;
	}

	public void setSustituye(String sustituye) {
		this.sustituye = sustituye;
	}

	@Override
	public String toString() {
		
		return super.toString()+" "+this.sustituye;
		
	}
	
}