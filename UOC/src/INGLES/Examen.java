package INGLES;

import java.util.Scanner;

public class Examen{
	
	private String nombre;
	private int puntos;
	private final int APROBADO = 160;
	private int[] porcentajes = new int[5];
	private Scanner teclado = new Scanner(System.in);
	
	public Examen(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public void calculoSpeaking(int puntos) {
		
		this.puntos+=puntos;
		
		this.porcentajes[0]=(puntos/60)*100;
		
		if(puntos>=36) {
			
			System.out.println("Speaking aprobado");
			
		}else {
			
			System.err.println("Speaking suspendido");
			
		}
		
	}
	
	public void calculoWriting() {
		
		int puntos = pedirWriting();
		
		this.porcentajes[1]=(puntos/40)*100;
		
		if(puntos>=24) {
			
			System.out.println("Writing aprobado");
			
		}else {
			
			System.err.println("Writing suspendido");
			
		}
		
	}
	
	public int pedirWriting() {
		
		int puntos=0;
		
		puntos+=pedirInt("Puntos de 1º PARTE: ");
		puntos+=pedirInt("Puntos de 2º PARTE: ");
		
		return puntos;
		
	}
	
	public void calculoListening() {
		
		int puntos = pedirListening();
		
		this.puntos+=puntos;
		
		this.porcentajes[2]=(puntos/30)*100;
		
		if(puntos>=18) {
			
			System.out.println("Listening aprobado");
			
		}else {
			
			System.err.println("Listening suspendido");
			
		}
		
	}
	
	public int pedirListening() {
		
		int puntos=0;
		
		puntos+=pedirInt("Aciertos de la PARTE 1: ");
		puntos+=pedirInt("Aciertos de la PARTE 2: ");
		puntos+=pedirInt("Aciertos de la PARTE 3: ");
		puntos+=pedirInt("Aciertos de la PARTE 4: ");
		
		return puntos;
		
	}
	
	public void calculoReading(int puntos) {
		
		this.puntos+=puntos;
		
		this.porcentajes[3]=(puntos/42)*100;
		
		if(puntos>=24) {
			
			System.out.println("Reading aprobado");
			
		}else {
			
			System.err.println("Reading suspendido");
			
		}
		
	}
	
	public void calculoUseOfEnglish(int puntos) {
		
		this.puntos+=puntos;
		
		this.porcentajes[4]=(puntos/28)*100;
		
		if(puntos>=18) {
			
			System.out.println("Use of english aprobado");
			
		}else {
			
			System.err.println("Use of english suspendido");
			
		}
		
	}
	
	public void calculoGeneral() {
		
		double total = 0;
		
		for (int i = 0; i < porcentajes.length; i++) {
			
			total+=porcentajes[i];
			
		}
		
		total=total/5;
		
		if(total>=60 && puntos>=APROBADO) {
			
			System.out.println("Examen: "+nombre+" APROBADO con un "+total+" % de aciertos");
			System.out.println("Un total de "+puntos+" puntos.");

		}else {
			
			System.err.println("Examen: "+nombre+" SUSPENDIDO con un "+total+" % de aciertos");
			System.err.println("Un total de "+puntos+" puntos.");
			
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