package Simulacro04;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static ArrayList<String> palabras = new ArrayList<String>();
	
	// Después mandamos el texto a un metodo que lo inserte en un fichero que se genere con unn nombre compuesto
	// por la fecha y hora actual o los milisegundos de la fecha
	
	public static void main(String[] args) {
		
		String texto = leer();
		
		do {
			
			System.out.println("\nIngrese una palabra a censurar: (escribe terminar para finalizar) ");
			String actual = teclado.nextLine();
			
			if(actual.equals("terminar")) {
				System.out.println("Fin\n");
				break;
			}else {
				palabras.add(actual);
			}
			
		}while(true);
		
		censurar(texto);
		
		
	}
	
	public static String leer() {
		
		String salida="";
		
		try {
			
			File archivo = new File(".\\files\\texto.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				salida+=lector.nextLine()+"\n";
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return salida;
	}
	
	public static String censur(String texto) {
		
		for (int i = 0; i < palabras.size(); i++) {
			
			texto=texto.replaceAll(palabras.get(i), "****");
			
		}
		
		return texto;
	}
	
	public static void censurar(String texto) {
		
	        String fecha = "" ;
	        long milisegundosActuales = System.currentTimeMillis();
	        fecha+=milisegundosActuales;

		
		String salida = censur(texto);
		
		
		try {
			
			System.out.println(".\\files\\"+fecha+".txt");
			
			FileWriter escritor = new FileWriter(".\\files\\"+fecha+".txt",true);
				
			escritor.write(salida);
			
			escritor.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}