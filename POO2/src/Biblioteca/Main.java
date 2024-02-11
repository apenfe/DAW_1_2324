package Biblioteca;

import java.io.File;
import java.util.Scanner;

public class Main{
	
	public static Biblioteca biblioteca = new Biblioteca();
	
	public static void main(String[] args) {
		
		leerLibros();
		
		biblioteca.addAutor(new Autor("12345678A","adrian","España"));
		biblioteca.addAutor(new Autor("34567337A","Mateo","Brasil"));
		biblioteca.addAutor(new Autor("48654484P","Lucia","Colombia"));
		
		
		biblioteca.addUsuario(new Usuario("12345478A","Wolframio"));
		biblioteca.addUsuario(new Usuario("34567437A","Laurencio"));
		biblioteca.addUsuario(new Usuario("48654384P","Lucas"));
		
		biblioteca.buscarLibroTitulo("habitos atomicos");
		biblioteca.autorLibro("habitos atomicos");
		
		
		// Añadir libros a usuario
		
		Libro actual = biblioteca.getLibros()[1];
		biblioteca.getUsuarios()[0].addLibro(actual);
		

		biblioteca.librosPrestadosUsuario(biblioteca.getUsuarios()[0]);
		
		
		
		
		
	}
	
	public static void leerLibros() {
		
		try {
			
			File archivo = new File(".\\src\\Biblioteca\\libros.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				Libro actual = new Libro(linea[0],linea[1],linea[2],linea[3]);
				biblioteca.addLibro(actual);
			}
			
			lector.close();
			
		} catch (Exception e) {
			
		}
		
		System.out.println("Libros añadidos");
		
	}
	
}