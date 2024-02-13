package INGLES;

import java.util.Scanner;

public class Examen{
	
	private String nombre;
	private double[] porcentajes = new double[5];
	private Scanner teclado = new Scanner(System.in);
	
	public Examen() {
		
		System.out.print("Nombre del examen: ");
		this.nombre=teclado.nextLine();
		
	}
	
	public void calculoSpeaking() {
		
		System.out.println();
		int puntos = pedirInt("Nota del Speaking: ");
		this.porcentajes[0]=((double)puntos/60)*100;
		System.out.println("Porcentaje: "+porcentajes[0]);
		if(puntos>=36) {
			
			System.out.println("Speaking aprobado");
			
		}else {
			
			System.err.println("Speaking suspendido");
			
		}
		
	}
	
	public void calculoWriting() {
		
		int puntos = pedirWriting();
		this.porcentajes[1]=((double)puntos/40)*100;
		System.out.println("Porcentaje: "+porcentajes[1]);
		if(puntos>=24) {
			
			System.out.println("Writing aprobado");
			
		}else {
			
			System.err.println("Writing suspendido");
			
		}
		
	}
	
	private int pedirWriting() {
		
		System.out.println();
		System.out.println("WRITING:");
		
		int puntos=0;
		
		puntos+=pedirInt("Puntos de 1º PARTE: ");
		puntos+=pedirInt("Puntos de 2º PARTE: ");
		
		return puntos;
		
	}
	
	public void calculoListening() {
		
		int puntos = pedirListening();
		
		this.porcentajes[2]=((double)puntos/30)*100;
		System.out.println("Porcentaje: "+porcentajes[2]);
		if(puntos>=18) {
			
			System.out.println("Listening aprobado");
			
		}else {
			
			System.err.println("Listening suspendido");
			
		}
		
	}
	
	private int pedirListening() {
		
		System.out.println();
		System.out.println("LISTENING:");
		int puntos=0;
		
		puntos+=pedirInt("Aciertos de la PARTE 1: ");
		puntos+=pedirInt("Aciertos de la PARTE 2: ");
		puntos+=pedirInt("Aciertos de la PARTE 3: ");
		puntos+=pedirInt("Aciertos de la PARTE 4: ");
		
		return puntos;
		
	}
	
	public void calculoReading() {
		
		int puntos = pedirReading();

		this.porcentajes[3]=((double)puntos/42)*100;
		System.out.println("Porcentaje: "+porcentajes[3]);
		if(puntos>=24) {
			
			System.out.println("Reading aprobado");
			
		}else {
			
			System.err.println("Reading suspendido");
			
		}
		
	}
	
	private int pedirReading() {
		
		System.out.println();
		System.out.println("READING:");
		
		int[] puntos= new int[4];
		int salida = 0;
		
		puntos[0] = pedirInt("Aciertos de Parte 1: ");
		puntos[1] = pedirInt("Aciertos de la PARTE 5: ");
		puntos[1] *= 2;
		puntos[2] = pedirInt("Aciertos de la PARTE 6: ");
		puntos[2] *= 2;
		puntos[3] = pedirInt("Aciertos de la PARTE 7: ");
		
		for (int i = 0; i < puntos.length; i++) {
			salida+=puntos[i];
		}
		
		return salida;
		
	}
	
	public void calculoUseOfEnglish() {
		
		int puntos = pedirUseOfEnglish();
	
		this.porcentajes[4]=((double)puntos/28)*100;
		System.out.println("Porcentaje: "+porcentajes[4]);
		if(puntos>=18) {
			
			System.out.println("Use of english aprobado");
			
		}else {
			
			System.err.println("Use of english suspendido");
			
		}
		
	}
	
	private int pedirUseOfEnglish() {
		
		System.out.println();
		System.out.println("USE OF ENGLISH:");

		
		int[] puntos= new int[3];
		int salida = 0;
		
		puntos[0] = pedirInt("Aciertos de PARTE 2: ");
		puntos[1] = pedirInt("Aciertos de la PARTE 3: ");
		puntos[2] = pedirInt("Aciertos de la PARTE 4: ");
		puntos[2] *= 2;
		
		for (int i = 0; i < puntos.length; i++) {
			salida+=puntos[i];
		}
		
		return salida;
		
	}
	
	public void calculoGeneral() {
		
		double total = 0;
		
		for (int i = 0; i < porcentajes.length; i++) {
			
			total+=porcentajes[i];
			
		}
		
		total=total/5;
		
		if(total>=60 && total<=74) {
			
			System.out.println("Examen: "+nombre+" APROBADO con un "+total+" % de aciertos");
			System.err.println("Un total de entre 160 y 172 puntos.");
			System.err.println("B2 grado C");

		}else if(total>=75 && total<=79) {
			
			System.out.println("Examen: "+nombre+" SUSPENDIDO con un "+total+" % de aciertos");
			System.err.println("Un total de entre 173 y 179 puntos.");
			System.err.println("B2 grado B");
			
		}else if(total>=80 && total<=100) {
			
			System.out.println("Examen: "+nombre+" SUSPENDIDO con un "+total+" % de aciertos");
			System.err.println("Un total de entre 180 y 190 puntos.");
			System.err.println("B2 grado A ---> C1");
			
		}else {
			
			System.err.println("Examen: "+nombre+" SUSPENDIDO con un "+total+" % de aciertos");
			System.err.println("Un total de entre 140 y 159 puntos.");
			System.err.println("B1");
			
		}
		
	}
	
	private int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		
		do {
			
			try {
				
				int num = Integer.parseInt(teclado.nextLine().trim());
				return num;
				
			} catch (Exception e) {
				System.err.print("ERROR INSERTE UN ENTERO: ");
			}
			
		}while(true);
		
	}
	
}