public class Comida{
	
	private String nombre;
	private double precio;
	private String tamano;
	private String local;
	
	public Comida(String nombre, double precio, String tamano, String local) {
		
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tamano = tamano;
		this.local = local;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}