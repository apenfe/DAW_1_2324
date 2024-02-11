package Simulacro04repaso1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String texto= leer();
		ArrayList<String> palabras = new ArrayList<String>();
		
		do {
			
			System.out.print("INGRESE PALABRA A CENSURAR (TERMINAR): ");
			String check = teclado.nextLine();
			
			if(check.equals("terminar")) {
				System.out.println("FIN");
				break;
			}else {
				palabras.add(check);
			}
			
		}while(true);
		
		censurar(texto,palabras);
		
		
	}
	
	public static String leer() {
		
		String salida="";
		
		try {
			
			File archivo = new File(".\\files\\texto.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				salida+= lector.nextLine()+"\n";				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
		}
		
		return salida;
		
	}
	
	public static void censurar(String texto, ArrayList<String> palabras) {
		
		for (int i = 0; i < palabras.size(); i++) {
			texto=texto.replaceAll(palabras.get(i), "[CENSURA]");
		}
		
		long nombre = System.currentTimeMillis();
		
		try {
			
			FileWriter archivo = new FileWriter(".\\files\\"+nombre+".txt",true);
			
			archivo.write(texto);
			
			archivo.close();
			
		} catch (Exception e) {
			
		}
		
	}
	
}