package Relacion_1_n;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Curso curso = new Curso("1","DAW");
	
	public static void main(String[] args) {
		
		Estudiante[] estudiantes = leerEstudiante(curso);
		
		curso.setEstudiantes(estudiantes);
		curso.listar();
		
	}
	
	public static Estudiante[] leerEstudiante(Curso curso) {
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		try {
			
			File archivo = new File(".\\src\\Relacion_1_n\\alumnos.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				String[] linea = lector.nextLine().split(",");
				
				if(linea[0].equals(curso.getCodigo())) {
					estudiantes.add(new Estudiante(linea[0],linea[1],linea[2]));
				}
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
		}
		
		Estudiante[] salida = new Estudiante[estudiantes.size()];
		
		for (int i = 0; i < salida.length; i++) {
			
			salida[i]=estudiantes.get(i);
			
		}
		
		return salida;
		
	}
	
}