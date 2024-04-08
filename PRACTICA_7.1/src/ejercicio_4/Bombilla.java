package ejercicio_4;

public class Bombilla{
	
	private boolean estado;
	
	public Bombilla() {
		
		this.estado = false;
		
	}
	
	public void activar(){
		
		this.estado = true;
		
	}
	
	public void desactivar() {
		
		this.estado = false;
		
	}
}