package Simulacro03;

public class Ranking{
	
	private String nombre;
	private String palabra;
	private String dificultad;
	private String intentosFallidos;
	private String fecha;
	
	public Ranking(String[] datos) {
		
		this.nombre = datos[0];
		this.palabra = datos[1];
		this.dificultad = datos[2];
		this.intentosFallidos = datos[3];
		this.fecha = datos[4];
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(String intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		
}