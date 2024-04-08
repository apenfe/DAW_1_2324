package ejercicio_5y6;

public class CD{
	
	private double memoria;
	private boolean rom;
	private boolean dobleCara;
	private String fabricante;
	
	public CD(double memoria, boolean rom, boolean dobleCara, String fabricante) {
		
		this.memoria = memoria;
		this.rom = rom;
		this.dobleCara = dobleCara;
		this.fabricante = fabricante;
		
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public boolean isRom() {
		return rom;
	}

	public void setRom(boolean rom) {
		this.rom = rom;
	}

	public boolean isDobleCara() {
		return dobleCara;
	}

	public void setDobleCara(boolean dobleCara) {
		this.dobleCara = dobleCara;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		
		String salida = "--- CD ---\n";
		salida += "Memoria total: "+memoria+" Mb.\n";
		salida += "Memoria ROM: "+rom+".\n";
		salida += "Doble cara: "+dobleCara+".\n";
		salida += "Fabricante: "+fabricante+".\n";
		return salida;
	}
	
}