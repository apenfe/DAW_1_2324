package zoologicoPoo08;

/*
 * 
 * • El zoológico tiene por supuesto ANIMALES. De cada animal interesa guardar su nombre, su
 * especie y año de nacimiento. Cada animal tendrá un código identificativo único
 * alfanumérico.
 * 
 * Hay que decir que cada animal está en solo una instalación (evidentemente),
 * y por supuesto puede haber varios animales dentro de una instalación.
 * Por ejemplo, “Simba” es un león nacido en 2015 (código identificativo “SI-01”) y vive en la
 * instalación n.º 143 junto con “Nala”, una leona nacida en 2016 (código identificativo “NA12”)
 * 
 */

public class Animales{
	
	// identificar animal con la instalacion, en la misma instalacion pueden haber varios animales
	
	private String nombre;
	private String especie;
	private int anioNacimiento;
	private String IdAnimal; // debed de ser unico
	
	private Instalaciones instalacion;
	
	public Animales() {
		
	}
	
	public Animales(String nombre, String especie, int anioNacimiento, String IdAnimal, Instalaciones instalacion) {
		
		this.nombre = nombre;
		this.especie = especie;
		this.anioNacimiento = anioNacimiento;
		this.IdAnimal = IdAnimal;
		this.instalacion = instalacion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public String getIdAnimal() {
		return IdAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		IdAnimal = idAnimal;
	}

	public Instalaciones getInstalacion() {
		return instalacion;
	}

	public void setInstalacion(Instalaciones instalacion) {
		this.instalacion = instalacion;
	}
	
	
	
}