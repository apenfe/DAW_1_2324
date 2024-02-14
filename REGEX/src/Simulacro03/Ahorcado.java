package Simulacro03;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado{
	
	private Scanner teclado = new Scanner(System.in);
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
	
	public void play() {
		
		System.out.println("\nLa palabra a adivinar es: ");
		int intentos = 5;
		
		do {
			
			boolean error=true;
	
			mostrarHuecos(intentos);
			
			System.out.println();
			System.out.println("\nIntentos: "+intentos);
			System.out.print("\nInserte una letra: ");
			String letra = teclado.nextLine().trim().toLowerCase();
			
			for (int i = 0; i < palabra.getWord().length(); i++) {
				
				if((""+palabra.getWord().charAt(i)).equals(letra) && palabra.getLetras()[i]=='_') {
					palabra.setLetra(i);
					error=false;
					System.out.println("\nMuy bien, letra correcta.");
					mostrarHuecos(intentos);
					break;
				}
				
			}
			
			if(error) {
				System.out.println("\nMal, letra incorrecta.");
				intentos--;
				error=false;
			}else {
				
				System.out.print("\n\n¿Desea acertar la palabra entera? (s - si)");
				String respuesta = teclado.nextLine().trim().toLowerCase();
				
				if(respuesta.equalsIgnoreCase("s")) {
					
					System.out.print("\nIntroduzca la palabra entera: ");
					String palabraEntera = teclado.nextLine().trim().toLowerCase();
					
					if(palabraEntera.equals(palabra.getWord())) {
						System.out.println("\n¡Ha ganado el juego!");
						break;
					}else {
						intentos--;
						error=false;
					}
					
				}	
				
			}
			
			if(intentos==0) {
				
				System.out.println("\nFin del juego, se han acabdo los intento");
				break;
				
			}else if(intentos>0 && win()) {
				
				System.out.println("\n¡Ha ganado el juego!");
				break;
				
			}
			
		}while(true);
		
		System.err.println("\nLa palabra era: "+palabra.getWord().toLowerCase());
		
		save(5-intentos);
		
	}
	
	private boolean win() {
		
		for (int i = 0; i < palabra.getWord().length(); i++) {
			
			if(palabra.getWord().charAt(i)!=palabra.getLetras()[i]) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	private void mostrarHuecos(int intentos) {
		
		dibujo(intentos);
		
		for (int i = 0; i < palabra.getWord().length(); i++) {
			
			System.out.print(palabra.getLetras()[i]+" ");
			
		}
		
	}
	
	private Palabra palabraRandom() {

		long tiempoActual = System.currentTimeMillis();
		int indice = (int) (tiempoActual % palabras.length);
		return palabras[indice];

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
	
	public void ranking() {
		
		ArrayList<Ranking> jugadas = new ArrayList<Ranking>();
		
		try {
			
			File archivo = new File(".\\src\\Simulacro03\\ranking.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				jugadas.add(new Ranking(linea));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("Error al leer fichero.");
			
		}
		
		Ranking[] ranking = new Ranking[jugadas.size()];
		
		for (int i = 0; i < ranking.length; i++) {

			ranking[i] = jugadas.get(i);

		}

		ranking=ordenar(ranking,"intentos");
		ranking=ordenar(ranking,"dificultad");
		ranking=ordenar(ranking,"fecha");
		mostrarRanking(ranking);
				
	}
	
	private Ranking[] ordenar(Ranking[] lectura, String modo) {
		
		for (int i = 1; i < lectura.length; i++) {
			
			for (int j = 0; j < lectura.length-i; j++) {
				
				if((lectura[j].getDificultad()<=lectura[j+1].getDificultad())&&modo.equals("dificultad")||
						(lectura[j].getIntentosFallidos()<=lectura[j+1].getIntentosFallidos())&&modo.equals("intentos")||
						(lectura[j].getFecha()>lectura[j+1].getFecha())&&modo.equals("fecha")&&
						(lectura[j].getIntentosFallidos()==lectura[j+1].getIntentosFallidos())&&(lectura[j].getDificultad()==lectura[j+1].getDificultad())) {
					
					Ranking aux = lectura[j];
					lectura[j]=lectura[j+1];
					lectura[j+1]=aux;
					
				}
				
			}
			
		}
		
		return lectura;
		
	}
	
	private void mostrarRanking(Ranking[] lectura) {
		
		System.out.println("\nRanking --->");
		System.out.println();
		
		for (int i = 0; i < lectura.length; i++) {
			
			System.out.println(lectura[i].toString());
			
		}
		
	}
	
	private void save(int intentos) {
		
		long milis = System.currentTimeMillis();
		
		try {
			
			FileWriter escritor = new FileWriter(".\\src\\Simulacro03\\ranking.txt",true);
			
			escritor.write("\n"+usuario+"#"+palabra.getWord()+"#"+dificultad+"#"+intentos+"#"+milis);
			escritor.close();
			System.out.println("\nPartida guardada.");
			
		} catch (Exception e) {
			
			System.err.println("\nERROR AL GUARDAR PARTIDA");
			
		}
		
	}
	
	private void dibujo(int intentos) {
		
		if(intentos==5) {
			
			System.out.println("\n _________");
			System.out.println(" |        ");
			System.out.println(" |        ");
			System.out.println(" |       ");
			System.out.println(" |       ");
			System.out.println("_|_");
			
		}else if(intentos==4) {
			
			System.out.println("\n _________");
			System.out.println(" |        |");
			System.out.println(" |        ");
			System.out.println(" |       ");
			System.out.println(" |       ");
			System.out.println("_|_");
			
		}else if(intentos==3) {
			
			System.out.println("\n _________");
			System.out.println(" |        |");
			System.out.println(" |        O");
			System.out.println(" |    ");
			System.out.println(" |      ");
			System.out.println("_|_");
			
		}else if(intentos==2) {
			
			System.out.println("\n _________");
			System.out.println(" |        |");
			System.out.println(" |        O");
			System.out.println(" |       / \\");
			System.out.println(" |      ");
			System.out.println("_|_");
			
		}else if(intentos==1) {
			
			System.out.println("\n _________");
			System.out.println(" |        |");
			System.out.println(" |        O");
			System.out.println(" |       /|\\");
			System.out.println(" |        ");
			System.out.println("_|_");
			
		}else if(intentos==0) {
			
			System.out.println("\n _________");
			System.out.println(" |        |");
			System.out.println(" |        O");
			System.out.println(" |       /|\\");
			System.out.println(" |       / \\");
			System.out.println("_|_");

		}
		
		System.out.println();
		
	}
	
	
		
}