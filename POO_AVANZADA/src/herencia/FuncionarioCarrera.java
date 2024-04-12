package herencia;

public class FuncionarioCarrera extends Profesor{
	
	private String yearPlaza;
	private String instituto;
	
	public FuncionarioCarrera(String nombre, String apellidos, String email, String direccion, String nrp, String yearPlaza, String instituto) {
		
		super(nombre, apellidos, email, direccion, nrp);
		this.yearPlaza = yearPlaza;
		this.instituto = instituto;
		
	}

	public String getYearPlaza() {
		return yearPlaza;
	}

	public void setYearPlaza(String yearPlaza) {
		this.yearPlaza = yearPlaza;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

	@Override
	public String toString() {
		
		return super.toString()+" "+this.yearPlaza+" "+this.instituto;
		
	}
	
}