package ejercicio_5y6;

public class Coleccionable{
	
	private String tipo;

	public Coleccionable() {
		
	}
	
	public Coleccionable(String tipo) {
		
		this.tipo = tipo;
	
	}
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		
		String salida = "TIPO "+tipo;
		return salida;
		
	}
	
}