package mesa_3;

public class Detergente extends Producto implements ConDescuento, EsLiquido{

	public double descuento;
	
	public Detergente(String marca, double precio) {
		
		super.marca=marca;
		super.precio=precio;
		
	}
	
	public String getMarca() {
		return super.marca;
	}

	public void setMarca(String marca) {
		super.marca = marca;
	}

	public double getPrecio() {
		return super.precio;
	}

	public void setPrecio(double precio) {
		super.precio = precio;
	}

	@Override
	public void setDescuento(double des) {
		
		this.descuento=des;
		
	}

	@Override
	public double getDescuento() {
		
		return this.descuento;
		
	}

	@Override
	public double getPrecioDescuento() {
		
		return super.precio-descuento;
		
	}

	@Override
	public String toString() {
		return "Detergente [marca=" + super.marca + ", precio=" + super.precio + "]";
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
	
}