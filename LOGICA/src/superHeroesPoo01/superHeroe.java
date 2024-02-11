package superHeroesPoo01;

public class superHeroe{
	
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	public superHeroe(String nombre) {
		
		this.nombre=nombre;
		this.descripcion="";
		this.capa=false;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
	}
	
	public void setCapa(boolean capa) {
		
		this.capa=capa;
	}
	
	public boolean getCapa() {
		
		return this.capa;
	}
	
	public String toString() {
		
		String cadena="";
		cadena+="El nombre es: "+getNombre()+".\n";
		cadena+="Su descripcion es: "+getDescripcion()+".\n";
		
		if(getCapa()) {
			cadena+="El superheroe tiene capa.\n";
		}else {
			cadena+="El superheroe NO tiene capa.\n";
		}
		
		return cadena;

	}

}