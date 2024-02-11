package electrodomesticosPoo02;

public class Lavadora extends Electrodomestico{
	
	private double precio;
	private boolean aguaCaliente;
	
	public Lavadora(String marca, double potencia) {
		
		super("Lavadora",marca,potencia);
		this.aguaCaliente=false;
		this.precio=0;

	}
	
	public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
		
		super("Lavadora",marca,potencia);
		this.aguaCaliente=aguaCaliente;
		this.precio=precio;

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}
	
	@Override
	public String toString() {
		
		String salida = "";
		
		salida+=super.toString();
		
		if(aguaCaliente) {
			salida+="\n\tModo lavado (Agua caliente): SI.";
		}else {
			salida+="\n\tModo lavado (Agua caliente): NO.";
		}
		
		salida+="\n\tPrecio del electrodomestico: "+precio+" (€).";
		
		return salida;
	}
	
	@Override
	public double getConsumo(int horas) {
		
		if(aguaCaliente) {
			return (double)horas * (potencia+potencia*0.2);
		}else {
			return (double)horas * (potencia);
		}
		
	}

	
	
}