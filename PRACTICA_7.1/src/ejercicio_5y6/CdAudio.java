package ejercicio_5y6;

public class CdAudio extends CD{
	
	private String year;
	private String album;
	private String cantante;
	
	public CdAudio(String year, String album, String cantante, double memoria, boolean rom, boolean dobleCara, String fabricante) {
		
		super(memoria,rom,dobleCara,fabricante);
		this.year = year;
		this.album = album;
		this.cantante = cantante;
		
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		
		String salida = super.toString();
		
		salida += "Cantante: "+cantante+".\n";
		salida += "Album: "+album+".\n";
		salida += "Año: "+year+".\n";
		return salida;
		
	}
	
}