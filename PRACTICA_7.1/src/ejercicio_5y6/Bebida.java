package ejercicio_5y6;

public class Bebida extends Producto{
	
	public String nombre;
	public int litros;
	
	public Bebida(String nombre, int litros) {
		
		this.nombre=nombre;
		this.litros=litros;
		super.setCodBarras(1234);
		super.setPrecio(20);
		
	}
	
	public Bebida(String nombre, int litros, int codigoBarras, double precio) {
		
		super(precio,codigoBarras);
		this.nombre=nombre;
		this.litros=litros;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLitros() {
		return litros;
	}
	
	public double getPrecio() {
		return super.getPrecio();
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		
		String salida = super.toString();
		return salida+= "\nBebida [nombre=" + nombre + ", litros=" + litros + "]";
	}
	
}