package Ejemplo19;

public class peliculas{
	
	private String titulo;
	private String director;
	private int visto;
	
	public peliculas() {
		
		setTitulo("");
		setDirector("");
		setVisto(-1);
	}
	
	public peliculas(String titulo, String director, int visto) {
		
		setTitulo(titulo);
		setDirector(director);
		setVisto(visto);
	}
	
	public void info() {
		
		if(getVisto()==0) {
			System.out.println("Te falta por ver: "+getTitulo()+" del director "+getDirector());
		}else {
			System.out.println("Ya has visto: "+getTitulo()+" del director "+getDirector());
		}
	
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		
		this.titulo=titulo;
	}
	
	public String getDirector() {
		
		return this.director;
	}

	public void setDirector(String director) {
		
		this.director=director;
	}
	
	public int getVisto() {
		
		return this.visto;
	}

	public void setVisto(int visto) {
		
		this.visto=visto;
	}
	
	
}