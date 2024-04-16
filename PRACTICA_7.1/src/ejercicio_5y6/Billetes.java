package ejercicio_5y6;

public class Billetes extends Coleccionable{
	
	public String year;
	public String pais;
	public String papel;
	
	public Billetes(String year, String pais, String papel) {
		
		this.year=year;
		this.pais=pais;
		this.papel=papel;
		super.setTipo("dinero");
		
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nBilletes [year=" + year + ", pais=" + pais + ", papel=" + papel + "]";
	}
	
}