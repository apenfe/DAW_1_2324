package ejercicio_7;

public abstract class Documento{
	
	private String paginas;
	
	public Documento() {
		
	}
	
	public Documento(String paginas) {
		
		this.paginas=paginas;
		
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	
}