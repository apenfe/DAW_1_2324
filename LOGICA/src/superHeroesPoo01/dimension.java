package superHeroesPoo01;

public class dimension{
	
	private double alto;
	private double ancho;
	private double profundidad;
	
	public dimension() {
		
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
		
	}
	
	public dimension(double alto, double ancho, double profundidad) {
		
		this.alto=alto;
		this.ancho=ancho;
		this.profundidad=profundidad;
		
	}
	
	public void setAlto(double alto) {
		
		this.alto=alto;
	}
	
	public double getAlto() {
		
		return this.alto;
	}
	
	public void setAncho(double ancho) {
		
		this.ancho=ancho;
	}
	
	public double getAncho() {
		
		return this.ancho;
	}
	
	public void setProfundidad(double profundidad) {
		
		this.profundidad=profundidad;
	}
	
	public double getProfundidad() {
		
		return this.profundidad;
	}
	
	public double getVolumen() {
		
		double volumen=this.ancho*this.alto*this.profundidad;
		
		return volumen;

	}
	
	public String toString() {
		
		String cadena="";
		cadena+="Alto: "+getAlto()+".\n";
		cadena+="Ancho: "+getAncho()+".\n";
		cadena+="Profundidad: "+getProfundidad()+".\n";
		cadena+="Volumnen maximo: "+getVolumen()+".\n";
		
		return cadena;

	}

}