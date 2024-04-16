package ejercicio_5y6;

public class Coleccionable{
	
	private String precio;
	private int codBarras;
	
	public Coleccionable() {
		
	}
	
	public Coleccionable(double precio, int codBarras) {
		
		this.precio = precio;
		this.codBarras = codBarras;
		
	}

	@Override
	public String toString() {
		
		String salida = "ID "+codBarras+" - Precio unitario: "+precio+" - ";
		return salida;
		
	}
	
}