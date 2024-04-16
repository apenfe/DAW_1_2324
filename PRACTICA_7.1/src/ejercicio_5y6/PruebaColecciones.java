package ejercicio_5y6;

import java.util.ArrayList;

public class PruebaColecciones{
	
	public static void main(String[] args) {
		
		ArrayList<Coleccionable> coleccion = new ArrayList<Coleccionable>();
		
		Monedas euro = new Monedas("2003","Grecia");
		Monedas euro1 = new Monedas("2000","España");
		Billetes dolar = new Billetes("2001","EEUU","papiro");
		Billetes yen = new Billetes("2010","Japon","bambu");
		
		coleccion.add(yen);
		coleccion.add(dolar);
		coleccion.add(euro);
		coleccion.add(euro1);
		
		listar("esta es mi coleccion de dinero: ",coleccion);
		
	}
	
	public static void listar(String texto, ArrayList<Coleccionable> lista) {
		
		System.out.println(texto);
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i).toString());
			
		}
		
	}
	
}