package ejercicio_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2{
	
	/*
	 * Ejercicio 2
	 * 
	 * Crea un programa siguiente el patrón de diseño DAO que procese un fichero llamado usuarios.txt 
	 * (descarga al final del enunciado), y los guarde en una lista de objetos, para después mandarlos 
	 * a un método del DAO que realice las inserciones en base de datos. Es necesario crear una base de 
	 * datos con una tabla de acuerdo a los datos que se van a insertar.
	 * 
	 * Deberán crearse las clases necesarias para que el programa funcione siguiendo el principio de 
	 * programación orientada a objetos.
	 * 
	 */
	
	public static Scanner teclado = new Scanner(System.in);
	public static DAO db = new DAO();
	
	public static void main(String[] args) {
		
		System.out.println("Leyendo usuarios...");
		
		Usuario[] usuarios = leerFichero();
		
		for (int i = 0; i < usuarios.length; i++) {
			
			db.insertar(usuarios[i]);
			
		}
		
	}
	
	public static Usuario[] leerFichero() {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			File archivo = new File("ficheros\\usuarios.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				String[] datos = linea.split("&");
				
				usuarios.add(new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return usuarios.toArray(new Usuario[0]);
		
	}
	
}
