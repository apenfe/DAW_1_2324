package Simulacro03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado{
	
	private String usuario;
	private String dificultad;
	private Palabra[] palabras = new Palabra[0];
	private Palabra palabra;
	
	public Ahorcado() {
		
	}
	
	public Ahorcado(String usuario, String dificultad) {
		
		this.usuario=usuario;
		this.dificultad=dificultad;
		
		leerPalabras(dificultad);
		
		this.palabra= palabraRandom();
		
	}
	
	private Palabra palabraRandom() {
		
		do {
			
			String milis = ""+System.currentTimeMillis();
			int ultimo = milis.charAt(milis.length()-1);
			
			for (int i = 0; i < palabras.length; i++) {
				
				if(i==ultimo) {
					
					return palabras[i];
					
				}
				
			}
			
		}while(true);
		
	}
	
	private void leerPalabras(String dificultad) {
		
		ArrayList<Palabra> entradas = new ArrayList<Palabra>();
		
		try {
			
			File archivo = new File(".\\src\\Simulacro03\\palabras.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				
				if(linea[1].equalsIgnoreCase(dificultad)) {
					
					entradas.add(new Palabra(linea[0],linea[1]));
					
				}
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.err.println("ERROR AL LEER ARCHIVO.");
			
		}
		
		palabras = new Palabra[entradas.size()];
		
		for (int i = 0; i < palabras.length; i++) {
			palabras[i]=entradas.get(i);
		}
		
	}
		
}