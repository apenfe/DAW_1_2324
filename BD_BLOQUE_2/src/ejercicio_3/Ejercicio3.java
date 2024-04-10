package ejercicio_3;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3{
	
	/*
	 * Ejercicio 3
	 * 
	 * Crea un programa siguiente el patrón de diseño DAO que procese los ficheros alumnos.txt, 
	 * modulos.txt y modulo_alumno.txt (descarga la final del enunciado), y los guarde en una lista 
	 * de objetos para después mandarlos a cada método correspondiente del DAO y que inserte en base 
	 * de datos. Es necesario crear una base de datos con las tablas necesarias de acuerdo a los datos 
	 * que se van a insertar.
	 * 
	 * Dado que la relación entre "alumno" y "módulo" es una relación N:M, primero deben insertarse los 
	 * alumnos y módulos (sin importar el orden) y, por último, insertar los IDs de las relaciones entre 
	 * alumnos y módulos.
	 * 
	 */
	
	public static Scanner teclado = new Scanner(System.in);
	public static DAO db = new DAO();
	
	public static void main(String[] args) {
		
		System.out.println("Leyendo alumnos...");
		Alumno[] alumnos = leerAlumnos();
		
		for (int i = 0; i < alumnos.length; i++) {
			
			db.insertarAlumno(alumnos[i]);
			
		}
		
		System.out.println("Alumnos cargados.");
		
		System.out.println("Leyendo alumnos...");
		Modulo[] modulos = leerModulos();
		
		for (int i = 0; i < modulos.length; i++) {
			
			db.insertarModulo(modulos[i]);
			
		}
		
		System.out.println("Modulos cargados.");
		
		System.out.println("Leyendo relaciones...");
		String[] relaciones = leerRelaciones();
		
		for (int i = 0; i < relaciones.length; i++) {
			
			db.insertarRelacion(relaciones[i]);
			
		}
		
		System.out.println("Relaciones cargadas.");
		
	}
	
	public static Alumno[] leerAlumnos() {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			
			File archivo = new File("ficheros\\alumnos.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				String[] datos = linea.split("&");
				
				alumnos.add(new Alumno(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return alumnos.toArray(new Alumno[0]);
		
	}
	
	public static Modulo[] leerModulos() {
		
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		
		try {
			
			File archivo = new File("ficheros\\modulos.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				String[] datos = linea.split("&");
				
				modulos.add(new Modulo(datos[0],datos[1],datos[2],datos[3],datos[4]));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return modulos.toArray(new Modulo[0]);
		
	}
	
	public static String[] leerRelaciones() {
		
		ArrayList<String> relaciones = new ArrayList<String>();
		
		try {
			
			File archivo = new File("ficheros\\modulo_alumno.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				relaciones.add(linea);
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return relaciones.toArray(new String[0]);
		
	}
	
}
