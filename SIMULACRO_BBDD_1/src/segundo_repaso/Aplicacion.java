package segundo_repaso;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion{
	
	public static void main(String[] args) {
		
		Comida[] lista = importarComida();
		
		insertarComida(lista);
		
	}
	
	public static Comida[] importarComida() {
		
		ArrayList<Comida> lista = new ArrayList<Comida>();
		
		try {
			
			File archivo = new File("assests\\comida.txt");
			Scanner lector = new Scanner(archivo);
			
			while (lector.hasNextLine()) {
				
				String[] datos = lector.nextLine().split(",");
				
				lista.add(new Comida(datos[0],Double.parseDouble(datos[1]),datos[2],datos[3]));
				
			}
			
		} catch (Exception e) {
			
			System.err.println(e);
			
		}
		
		return lista.toArray(new Comida[0]);
		
	}
	
	public static void insertarComida(Comida[] lista) {
		
		DAO db = new DAO();
		
		db.insertarListaComida(lista);
		db.consultar();
		
	}
	
}