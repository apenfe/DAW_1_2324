package ejercicio_5y6;

public class CdSoftware extends CD{
	
	private String version;
	private String empresa;
	private String nombre;
	
	public CdSoftware(String year, String album, String cantante, double memoria, boolean rom, boolean dobleCara, String fabricante) {
		
		super(memoria,rom,dobleCara,fabricante);
		this.version = year;
		this.empresa = album;
		this.nombre = cantante;
		
	}
	
	

	public String getVersion() {
		return version;
	}



	public void setVersion(String version) {
		this.version = version;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		
		String salida = super.toString();
		
		salida += "Version: "+version+".\n";
		salida += "Empresa: "+empresa+".\n";
		salida += "Juego: "+nombre+".\n";
		return salida;
		
	}
	
}