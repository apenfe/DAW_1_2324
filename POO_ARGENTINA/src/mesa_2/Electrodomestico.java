package mesa_2;

public class Electrodomestico{
	
	private String tipo;
	private String marca;
	private double potencia;

	public Electrodomestico(String tipo, String marca, double potencia) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
	
	public String getConsumo(int horas) {
		
		return "Consumo: "+ (horas*potencia);
		
	}
	
	public String getCosteConsumo(int horas, double costeHora) {
		
		return "Coste del Consumo: "+ (horas*potencia*costeHora);
		
	}
	
}