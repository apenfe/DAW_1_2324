package mesa_2;

public class Lavadora extends Electrodomestico{
	
	private double precio;
	private boolean aguaCaliente;
	
	public Lavadora(String marca, double potencia) {
		
		super("lavadora",marca,potencia);
		this.aguaCaliente=false;
		
	}
	
	public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
		
		super("lavadora",marca,potencia);
		this.precio=precio;
		this.aguaCaliente=aguaCaliente;
		
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
		
		return super.toString()+"Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + "]";
		
	}
	
	@Override
	public String getConsumo(int horas) {
		
		if(this.aguaCaliente) {
			
			return "Consumo: "+(horas*(super.getPotencia()+super.getPotencia()*0.2));
		}
		
		return "Consumo: "+(horas*super.getPotencia());
		
	}
	
}