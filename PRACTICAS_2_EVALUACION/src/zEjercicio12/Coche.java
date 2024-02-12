package zEjercicio12;

/* 
 * Coche.java
 * 
 * Partiendo de la clase Archivo de ejercicio anterior hacer un método estático y público
 * que reciba por parámetro un objeto de la clase Coche y la añada en una nueva línea en 
 * el mismo archivo de texto plano con extensión .txt del ejercicio anterior, con la información
 * del nuevo coche
 * 
 * En el programa principal se debe pedir los datos del nuevo coche y enviarlos al método de la
 * clase Archivo para obtener un valor devuelto por el método que sirva para indicar si se ha 
 * insertado correctamente o no se ha podido.
 * 
 * APF - 10-01-2024
 * 
 */

public class Coche{
	
	private String marca;
	private String modelo;
	private String color;
	private String combustible;
	private String kilometros;

	public Coche() {
		
	}
	
	public Coche(String[] coche) {
		
		this.marca=coche[0];
		this.modelo=coche[1];
		this.color=coche[2];
		this.combustible=coche[3];
		this.kilometros=coche[4];
		
	}
	
	public Coche(String marca,String modelo,String color,String combustible,String kilometros) {
		
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.combustible=combustible;
		this.kilometros=kilometros;
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
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

	public String getKilometros() {
		return kilometros;
	}

	public void setKilometros(String kilometros) {
		this.kilometros = kilometros;
	}
	
	public String info() {
		String salida="";
		
		salida+="\nMarca: "+marca;
		salida+="\nModelo: "+modelo;
		salida+="\nColor: "+color;
		salida+="\nCombustible: "+combustible;
		salida+="\nKilometros: "+kilometros;
		
		return salida;
	}
	
	public String infoTxt() {
		
		return marca+",,"+modelo+",,"+color+",,"+combustible+",,"+kilometros;
	}

	
}