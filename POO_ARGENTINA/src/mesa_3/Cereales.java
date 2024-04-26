package mesa_3;

import java.time.LocalDate;

public class Cereales extends Producto implements EsAlimento{
	
	public String tipo;
	
	public Cereales(String marca, double precio, String tipo) {
		
		super.marca = marca;
		super.precio = precio;
		this.tipo = tipo;
		
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
	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
}