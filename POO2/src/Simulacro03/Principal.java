package Simulacro03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	
	public static final String RUTA = ".\\src\\Simulacro03\\";
	public static final String ALUMNOS = "alumnos.txt";
	public static final String MODULOS = "modulos.txt";
	public static final String RELACIONES = "modulo_alumno.txt";
	
	public static Modulo[] modulos;
	public static Alumno[] alumnos;
	
	/*  
	 *   
	 *   El fichero modulo_alumno.txt tiene en cada línea la pareja de identificador de módulo y alumno, separado por una coma ",".
	 *   
	 *   
	 *   PARTE A
	 *   Se debe definir la clase "Alumno" y la clase "Moludo" con los atributos necesarios para guardar la información de los ficheros.
	 *    Además, la clase "Modulo" debe tener un array de tipo "Alumno", para almacenar en él los alumnos que pertenezca a un módulo.
	 *    
	 *    El programa debe abrir ambos ficheros e ir cruzando los datos buscando los alumnos que pertenecen a cada módulo de forma individual
	 *     (módulo a módulo).
	 *     
	 *     Después se mostrará la información de cada módulo y, debajo, de cada módulo, todos los alumnos que tiene asociados.
	 *     
	 *     
	 *     PARTE B
	 *     
	 *     Es similar a la Parte A, pero con diferencias. Se definen las clase "Alumno" y "Moludo" con los atributos necesarios para guardar 
	 *     la información de los ficheros, similar al apartado anterior, pero ahora, clase "Alumno" debe tener un array de tipo "Modulo", para 
	 *     almacenar en él los módulos que estén asociado a cada alumno.
	 *     
	 *     El programa debe abrir ambos ficheros e ir cruzando los datos buscando los módulos que pertenecen a cada alumno de forma individual 
	 *     (alumno a alumno).
	 *     
	 *     Después se mostrará la información de cada alumno y, debajo, de cada alumno, todos los módulos que tiene asociados.
	 */
	
	
	public static void main(String[] args) {
		
		modulos=leerModulos();
		alumnos=leerAlumnos();
		
		for(int i=0; i<modulos.length;i++) {
			System.out.println();
			
			System.out.println("MODULO: "+modulos[i].getNombre());
			modulos[i].createAlums();
			
			for(int j=0; j<modulos[i].getAlumnos().length;j++) {
				
				System.out.println("\tAlumno "+(j+1)+": "+modulos[i].getAlumnos()[j].getNombre());
				
			}
			
		}
		
		System.out.println();
		
		for(int i=0; i<alumnos.length;i++) {
			System.out.println();
			
			System.out.println("ALUMNO: "+alumnos[i].getNombre());
			alumnos[i].createModuls();
			
			for(int j=0; j<alumnos[i].getModulos().length;j++) {
				
				System.out.println("\tModulo "+(j+1)+": "+alumnos[i].getModulos()[j].getNombre());
				
			}
			
		}
		
		
		
		
	}
	
	public static Alumno[] leerAlumnos() {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			
			File archivo = new File(RUTA+ALUMNOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				alumnos.add(new Alumno(Integer.parseInt(linea[0]),linea[1],linea[2],linea[3],linea[4],linea[5],linea[6]));
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
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
			
			File archivo = new File(RUTA+MODULOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				modulos.add(new Modulo(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),Integer.parseInt(linea[3]),linea[4]));
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		Modulo[] salida = new Modulo[modulos.size()];
		
		for (int i = 0; i < modulos.size(); i++) {
			salida[i]=modulos.get(i);
		}
		
		return salida;
		
	}

	
	
}