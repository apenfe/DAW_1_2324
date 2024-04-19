import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion{
	
	public static void main(String[] args) {
		
		Comida[] lista = importarComida();
		
		insertarComida(lista);
		
	}
	
	public static Comida[] importarComida() {
		
		ArrayList<Comida> lista = new ArrayList<>();
		
		try {
			
			File archivo = new File("assests\\comida.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] datos = lector.nextLine().split(",");
				double dato = Double.parseDouble(datos[1]);
				
				lista.add(new Comida(datos[0],dato,datos[2],datos[3]));
				
			}
			
			
		} catch (Exception e) {
			
			System.err.println(e);
			
		}
		
		return lista.toArray(new Comida[0]);
		
	}
	
	public static void insertarComida(Comida[] lista) {
		
		DAO db = new DAO();
		db.insertarListaComida(lista);
		
	}
	
}