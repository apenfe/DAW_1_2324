package SupermercadoPoo03;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
	
	private String marca;
	private double precio;
	private String tipo;
	private LocalDate caducidad;
	
	public Cereales(String marca, double precio, String tipo) {
		
		this.marca=marca;
		this.precio=precio;
		this.tipo=tipo;
		
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		
		this.caducidad=fc;
		
	}

	@Override
	public LocalDate getCaducidad() {
	
		return caducidad;
	}

	@Override
	public int getCalorias() {
		
		if(tipo.equalsIgnoreCase("espelta")) {
			return 5;
		}else if(tipo.equalsIgnoreCase("maiz")) {
			return 8;
		}else if(tipo.equalsIgnoreCase("trigo")) {
			return 12;
		}else {
			return 15;
		}
		
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", caducidad=" + caducidad + "]";
	}
	
}