package electrodomesticosPoo02;

public class Electrodomestico{
	
	protected String tipo;
	protected String marca;
	protected double potencia;
	
	public Electrodomestico(String tipo, String marca, double potencia) {
		
		this.tipo=tipo;
		this.marca=marca;
		this.potencia=potencia;

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
		
		String salida = "";
		salida+="\n\tTipo de electrodomestico: "+tipo+".";
		salida+="\n\tMarca del aparato: "+marca+".";
		salida+="\n\tPotencia del electrodomestico: "+potencia+" (Kw).";
		
		return salida;
	}
	
	public double getConsumo(int horas) {
		
		return (double)horas * potencia;
				
	}
	
	public double getCosteConsumo(int horas, double costeHora) {
		
		return (double)horas * potencia * costeHora;

	}
	
}