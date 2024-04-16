package ejercicio_5y6;

public class Monedas extends Coleccionable{
	
	public String year;
	public String pais;
	
	public Monedas(String year, String pais) {
		
		this.year=year;
		this.pais=pais;
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

	@Override
	public String toString() {
		return super.toString()+"\nMonedas [year=" + year + ", pais=" + pais + "]";
	}
	
	
	
}