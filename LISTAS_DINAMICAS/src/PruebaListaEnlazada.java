import java.io.File;
import java.util.Scanner;

import listasEnlazadas.*;

public class PruebaListaEnlazada {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ListaEnlazada listaCompra = new ListaEnlazada();
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		listaCompra.add("Cerveza");
		listaCompra.add("Café");
		System.out.println("Lista de la compra:");
		
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println(listaCompra.get(i));
		}
		
		System.out.println("elementos en la lista: " + listaCompra.size());
		System.out.println("elementos 3 en la lista: " + listaCompra.get(3));
		System.out.println("posición del elemento Miel: " + listaCompra.indexOf("Miel"));
		System.out.println("eliminado: " + listaCompra.remove("Miel"));
	}
	
	public static ListaEnlazada leer(String ruta) {
		
		ListaEnlazada lista = new ListaEnlazada();
		
		try {
			
			int num = Integer.parseInt(teclado.nextLine().trim());
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				lista.add(new Object());
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return lista;
		
	}
	
	public static int pedirInt(String texto) {
		
		System.out.print(texto);
		
		do {
			
			try {
				
				int num = Integer.parseInt(teclado.nextLine().trim());
				return num;

			} catch (Exception e) {
				System.out.println("error, inserte un entero: ");
			}
			
		} while (true);
		
	}
}
