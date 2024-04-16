package ejercicio_5y6;

public class Producto{
	
	private double precio;
	private int codBarras;
	
	public Producto() {
		
	}
	
	public Producto(double precio, int codBarras) {
		
		this.precio = precio;
		this.codBarras = codBarras;
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	@Override
	public String toString() {
		
		String salida = "ID "+codBarras+" - Precio unitario: "+precio+" - ";
		return salida;
		
	}
	
}