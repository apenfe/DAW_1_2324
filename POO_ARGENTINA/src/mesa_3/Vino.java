package mesa_3;

import java.time.LocalDate;

public class Vino extends Producto implements EsAlimento, EsLiquido, ConDescuento{

	public String tipo;
	public double grados;
	
	public Vino(String marca, String tipo, double grados, double precio) {
		
		super.marca=marca;
		super.precio=precio;
		this.tipo=tipo;
		this.grados=grados;
		
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
	public void setDescuento(double des) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
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
		return "Vino [tipo=" + tipo + ", grados=" + grados + "]";
	}
	
}