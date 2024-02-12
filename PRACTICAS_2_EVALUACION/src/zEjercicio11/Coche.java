package zEjercicio11;

/* 
 * Coche.java
 * 
 * Define una clase llamada Archivo con un método estático y público
 * que devuelva una lista con objetos de un tipo de clase llamada Coche.
 * 
 * El método de la clase Archivo debe acceder a un archivo .txt dónde cada
 * línea representa la información de un coche distinto.
 * 
 * Los datos de cada línea son la "marca", el "modelo", el "color", el "combustible"
 * y el "kilometraje". Cada uno de estos valores estarán separados por una doble coma
 * ",,". Se debe crear un fichero con datos de prueba para poder probar el programa.
 * 
 * La lista de coches debe recogerse en el programa Principal y mostrarse en el orden
 * en que se han obtenido, numerando cada línea desde 1 hasta N, indicando todos los 
 * campos de cada coche.
 * 
 * APF - 10-01-2024
 * 
 */

public class Coche{
	
	private String marca;
	private String modelo;
	private String color;
	private String combustible;
	private String kilometraje;
	
	public Coche() {
		
	}
	
	public Coche(String marca, String modelo, String color, String combustible, String kilometraje) {
		
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.combustible=combustible;
		this.kilometraje=kilometraje;
	}
	
	public Coche(String[] coche) {
		
		this.marca=coche[0];
		this.modelo=coche[1];
		this.color=coche[2];
		this.combustible=coche[3];
		this.kilometraje=coche[4];
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public String info() {
		
		String salida="";
		salida+="\tMarca: "+marca+".";
		salida+="\n\tModelo: "+modelo+".";
		salida+="\n\tColor: "+color+".";
		salida+="\n\tCombustible: "+combustible+".";
		salida+="\n\tKilometraje: "+kilometraje+".";
		
		return salida;
	}
	
}