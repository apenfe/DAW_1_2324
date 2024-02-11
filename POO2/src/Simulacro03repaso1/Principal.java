package Simulacro03repaso1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	
	public static final String ALUMNOS = ".\\src\\Simulacro03repaso1\\alumnos.txt";
	public static final String MODULOS = ".\\src\\Simulacro03repaso1\\modulos.txt";
	public static final String KEYS = ".\\src\\Simulacro03repaso1\\modulo_alumno.txt";

	public static void main(String[] args) {
		
		Alumno[] alumnos = leerAlumnos();
		Modulo[] modulos = leerModulos();
		String[] keys = leerLlaves();
		
		for (int i = 0; i < modulos.length; i++) {
			modulos[i].asignarAlumnos(keys,alumnos);
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i].asignarModulos(keys,modulos);
		}
		
		
		for (int i = 0; i < modulos.length; i++) {
			modulos[i].listar();
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i].listar();
		}

	}
	
	public static Alumno[] leerAlumnos() {
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		try {
			
			File archivo = new File(ALUMNOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				alumnos.add(new Alumno(linea));
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO.");
			
		}
		
		Alumno[] salida = new Alumno[alumnos.size()];
		
		for (int i = 0; i < alumnos.size(); i++) {
			salida[i]=alumnos.get(i);
		}
		
		return salida;
		
	}
	
	public static Modulo[] leerModulos() {
		
		ArrayList<Modulo> modulos = new ArrayList<>();
		
		try {
			
			File archivo = new File(MODULOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				modulos.add(new Modulo(linea));
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO.");
			
		}
		
		Modulo[] salida = new Modulo[modulos.size()];
		
		for (int i = 0; i < modulos.size(); i++) {
			salida[i]=modulos.get(i);
		}
		
		return salida;
		
	}
	
	public static String[] leerLlaves() {
		
		ArrayList<String> llaves = new ArrayList<>();
		
		try {
			
			File archivo = new File(KEYS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				llaves.add(linea);
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO.");
			
		}
		
		String[] salida = new String[llaves.size()];
		
		for (int i = 0; i < llaves.size(); i++) {
			salida[i]=llaves.get(i);
		}
		
		return salida;
		
	}
	
}