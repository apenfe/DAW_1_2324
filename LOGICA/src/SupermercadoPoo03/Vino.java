package SupermercadoPoo03;

import java.time.LocalDate;

public class Vino implements EsAlimento, EsLiquido, ConDescuento{
	
	private String marca;
	private double precio;
	private double grados;
	private String tipo;
	private LocalDate caducidad;
	private double descuento;
	private double volumen;
	private String tipoEnvase;
	
	public Vino(String marca, double precio, double grados, String tipo) {
		
		this.marca=marca;
		this.precio=precio;
		this.tipo=tipo;
		this.grados=grados;
		
	}

	@Override
	public void setDescuento(double des) {
		descuento=des;
	}

	@Override
	public double getDescuento() {
		return descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return precio-descuento;
	}

	@Override
	public void setVolumen(double v) {
		volumen=v;
	}

	@Override
	public double getVolumen() {
		return volumen;
	}

	@Override
	public void setTipoEnvase(String env) {
		tipoEnvase=env;
	}

	@Override
	public String getTipoEnvase() {
		return tipoEnvase;
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
		return (int)grados*10;
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

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	@Override
	public String toString() {
		return "Vino [marca=" + marca + ", precio=" + precio + ", grados=" + grados + ", tipo=" + tipo + ", caducidad="
				+ caducidad + ", descuento=" + descuento + ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + "]";
	}
	
}