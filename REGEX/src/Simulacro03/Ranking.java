package Simulacro03;

public class Ranking{
	
	private String nombre;
	private String palabra;
	private int dificultad;
	private int intentosFallidos;
	private long fecha;
	
	public Ranking(String[] datos) {
		
		this.nombre = datos[0];
		this.palabra = datos[1];
		
		if(datos[2].equals("facil")) {
			this.dificultad = 1;
		}else if(datos[2].equals("normal")) {
			this.dificultad = 2;
		}if(datos[2].equals("dificil")) {
			this.dificultad = 3;
		}
		
		this.intentosFallidos = Integer.parseInt(datos[3]);
		this.fecha = Long.parseLong(datos[4]);
		
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

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ranking [nombre=" + nombre + ", palabra=" + palabra + ", dificultad=" + dificultad
				+ ", intentosFallidos=" + intentosFallidos + ", fecha=" + fecha + "]";
	}
	
	
		
}