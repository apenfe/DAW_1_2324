package zEjercicio12_reapso1;

import java.util.ArrayList;

/* 
 * Archivo.java
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

public class Principal{
	
	public static final String RUTA=".\\src\\zEjercicio12\\coches.txt";

	public static void main(String[] args) {
		
		String marca = Entrada.pedirTexto("MARCA: ");
		String modelo = Entrada.pedirTexto("MODELO: ");
		String color = Entrada.pedirTexto("COLOR: ");
		String combustible = Entrada.pedirTexto("COMBUSTIBLE: ");
		String kilometros = Entrada.pedirTexto("KILOMETROS: ");
		
		Coche actual = new Coche(marca,modelo,color,combustible,kilometros);
		
		if(Archivo.escribir(RUTA,actual.infoTxt())) {
			System.out.println("ESCRITO CORRECTAMENTE");
		}else {
			System.out.println("ERROR AL ESCRIBIR");
		}
		
		ArrayList<Coche> coches = Archivo.leer(RUTA);
		
		for (Coche coche : coches) {
			System.out.println(coche.info());
		}
		
	}

}