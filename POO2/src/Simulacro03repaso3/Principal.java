package Simulacro03repaso3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	
	public static final String RUTA_ALUMNO = ".\\src\\Simulacro03repaso2\\alumnos.txt";
	public static final String RUTA_MODULO = ".\\src\\Simulacro03repaso2\\modulos.txt";
	public static final String RUTA_LLAVES = ".\\src\\Simulacro03repaso2\\modulo_alumno.txt";

	public static void main(String[] args) {
		
		Alumno[] alumnos = leerAlumnos();
		Modulo[] modulos = leerModulos();
		String[] llaves = leerLlaves();
		
		for (int i = 0; i < modulos.length; i++) {
			modulos[i].asignarAlumnos(llaves, alumnos);
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i].asignarModulos(llaves, modulos);
		}
		
		System.out.println();
		
		for (int i = 0; i < modulos.length; i++) {
			modulos[i].listar();
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i].listar();
		}

	}
	
	public static Alumno[] leerAlumnos() {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			
			File file = new File(RUTA_ALUMNO);
			Scanner lector = new Scanner(file);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				alumnos.add(new Alumno(linea));
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER.");
			e.printStackTrace();
		}
		
		Alumno[] salida = new Alumno[alumnos.size()];
		
		for (int i = 0; i < alumnos.size(); i++) {
			
			salida[i]=alumnos.get(i);			
		}
		
		return salida;
		
	}
	
	public static Modulo[] leerModulos() {
		
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		
		try {
			
			File file = new File(RUTA_MODULO);
			Scanner lector = new Scanner(file);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				modulos.add(new Modulo(linea));
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER.");
			e.printStackTrace();
		}
		
		Modulo[] salida = new Modulo[modulos.size()];
		
		for (int i = 0; i < modulos.size(); i++) {
			
			salida[i]=modulos.get(i);			
		}
		
		return salida;
		
	
		
	}
	
	public static String[] leerLlaves() {
		
		ArrayList<String> llaves = new ArrayList<String>();
		
		try {
			
			File file = new File(RUTA_LLAVES);
			Scanner lector = new Scanner(file);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				llaves.add(linea);
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER.");
			e.printStackTrace();
		}
		
		String[] salida = new String[llaves.size()];
		
		for (int i = 0; i < llaves.size(); i++) {
			
			salida[i]=llaves.get(i);			
		}
		
		return salida;
		
		
		
	}
	
}