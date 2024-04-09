package ejercicio_5y6;

public class CdDatos extends CD{
	
	private int carpetas;
	private int archivos;
	
	public CdDatos(int carpetas, int archivos, double memoria, boolean rom, boolean dobleCara, String fabricante) {
		
		super(memoria,rom,dobleCara,fabricante);
		this.carpetas = carpetas;
		this.archivos = archivos;
		
	}

	public int getCarpetas() {
		return carpetas;
	}

	public void setCarpetas(int carpetas) {
		this.carpetas = carpetas;
	}

	public int getArchivos() {
		return archivos;
	}

	public void setArchivos(int archivos) {
		this.archivos = archivos;
	}

	@Override
	public String toString() {
		
		String salida = super.toString();
		
		salida += "Carpetas: "+carpetas+".\n";
		salida += "Archivos: "+archivos+".\n";
		return salida;
		
	}
	
}