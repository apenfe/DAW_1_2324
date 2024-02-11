package SupermercadoPoo03;

public class Detergente implements ConDescuento, EsLiquido{
	
	private String marca;
	private double precio;
	private double descuento;
	private double volumen;
	private String tipoEnvase;
	
	public Detergente(String marca, double precio) {
		
		this.marca=marca;
		this.precio=precio;
		
	}
	
	

	@Override
	public void setVolumen(double v) {
		volumen=v;
		
	}



	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return volumen;
	}



	@Override
	public void setTipoEnvase(String env) {
		tipoEnvase=env;
		
	}



	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return tipoEnvase;
	}



	@Override
	public void setDescuento(double des) {
		
		this.descuento=des;
		
	}

	@Override
	public double getDescuento() {
		
		return descuento;
	}

	@Override
	public double getPrecioDescuento() {
		
		return precio-descuento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", descuento=" + descuento + ", volumen=" + volumen
				+ ", tipoEnvase=" + tipoEnvase + "]";
	}

	
}