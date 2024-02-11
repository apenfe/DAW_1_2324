package zoologicoPoo08;

/*
 * 
 * • El zoológico tendrá INSTALACIONES (jaulas) donde vivirá cada animal.
 * 
 *  Cada instalación está situada en una zona exclusivamente (y una zona tendrá varias instalaciones)
 *  Además de la zona a la que pertenece, interesa guardar de cada instalación una pequeña descripción y el
 * año en que se instaló.
 * 
 * Cada instalación se identificará con un código numérico entero (por
 * supuesto dos instalaciones distintas no pueden tener el mismo número)
 * Por ejemplo, la instalación n.º 143 se encuentra en la zona de los “Felinos” y se instaló en el
 * año 2012. Es una “jaula amplia con dos árboles en el centro”
 * 
 */

//como relacion cogigo de istalacion con codigo de zona?

public class Instalaciones{
	
	private int numInstalacion; // Unico para cada una
	private String descripcion; // debed de ser unico
	private int anioInstalacion;
	
	private Zonas zona;
	
	public Instalaciones() {
		
	}
	
	public Instalaciones(int numInstalacion, String descripcion, int anioInstalacion, Zonas zona) {
		
		this.numInstalacion=numInstalacion;
		this.descripcion=descripcion;
		this.anioInstalacion=anioInstalacion;
		this.zona=zona;
		
	}

	public int getNumInstalacion() {
		return numInstalacion;
	}

	public void setNumInstalacion(int numInstalacion) {
		this.numInstalacion = numInstalacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAnioInstalacion() {
		return anioInstalacion;
	}

	public void setAnioInstalacion(int anioInstalacion) {
		this.anioInstalacion = anioInstalacion;
	}
	
	public Zonas getZona() {
		return zona;
	}

	public void setZona(Zonas zona) {
		this.zona = zona;
	}

}