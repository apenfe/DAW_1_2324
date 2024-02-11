package Examen1_2EVALUACION;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Acceso{
	
	public static Scanner teclado = new Scanner(System.in);
	public static final String RUTA = ".\\src\\Examen1_2EVALUACION\\texto.txt";
	
	/*
	 
	 *  Para la opción 2, se deberá solicitar al usuario un texto con un mínimo de 5 caracteres, de lo 
	 *  contrario devolverá al menú. Cuando introduzca el texto, lo escribirá en el archivo textos.txt 
	 *  en una nueva línea, sin reemplazar lo que haya escrito previamente.
	 *  
	 */
	
	
	public static boolean insertar() {
		
		String texto = teclado.nextLine().trim();
		
		if(texto.length()<5) {
			return false;
		}
		
		try {
			
			FileWriter escritor = new FileWriter(RUTA,true);
			
			escritor.write("\n"+texto);
			
			escritor.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		return false;
		
	}
	
	public static void leer() {
		
		ArrayList<String> lineas = new ArrayList<String>();
		
		try {
			
			File archivo = new File(RUTA);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				lineas.add(lector.nextLine());
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			System.out.println("ERROR AL LEER");
		}
		
		String[] salida = new String[lineas.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=lineas.get(i);
		}
		
		salida = ordenar(salida);
		
		for (int i = 0; i < salida.length; i++) {
			
			System.out.println((i+1)+" --> "+salida[i]);
			
		}
		
	}
	
	public static String[] ordenar(String[] salida) {
		
		for (int i = 1; i < salida.length; i++) {
			
			for (int j = 0; j < salida.length-i; j++) {
				
				if(salida[j].compareToIgnoreCase(salida[j+1])>1) {
					
					String aux = salida[j];
					salida[j]=salida[j+1];
					salida[j+1]=aux;
					
				}	
				
			}
			
		}
		
		return salida;
		
		
	}
	
	
	

	
}