package Simulacro01;

import java.util.Scanner;

public class principal{	
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int cantidad=0;
		boolean check= true;
		
		while(cantidad<=0) {
			
			System.out.print("Introduzca la cantidad de alumnos que desea añadir: ");
			
			while(check) {
				
				try {
					cantidad = Integer.parseInt(teclado.nextLine());
					check = false;
				}catch(Exception e){
					System.out.print("ERROR --> INSERTE UN NUEMRO ENTERO: ");
				}
				
			}
			
			check = true;
			
			if(cantidad<=0) {
				System.out.println("\nEl número debe ser superior a 0.\n");
			}
			
		}
		
		Alumno[] alumnos = new Alumno[cantidad]; 
		
		for(int i=0; i<alumnos.length; i++) {
			
			System.out.println();
			System.out.print("Introduzca el nombre: ");
			String nombre = teclado.nextLine();
			System.out.print("Introduzca el apellido: ");
			String apellido = teclado.nextLine();
			System.out.print("Introduzca el NRE: ");
			String nre = teclado.nextLine();
			System.out.print("Introduzca el Email: ");
			String email = teclado.nextLine();
			System.out.print("Introduzca la dirección: ");
			String direccion = teclado.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellido, nre, email, direccion);
			System.out.println();
			
		}
		
		for(int i=0; i<alumnos.length; i++) {
			
			System.out.println();
			alumnos[i].info();
			System.out.println();
			
		}
		
		while(true) {
			System.out.println();
			System.out.println("--- MENU ---");
			
			for(int i=0; i<alumnos.length; i++) {
				
				System.out.println(alumnos[i].getNombre()+" ---> " + (i+1));
				
			}
			System.out.println("EXIT ---> " + (alumnos.length+1));
			System.out.print("Selecciona una opción: ");
			
			while(check) {
				
				try {
					cantidad = Integer.parseInt(teclado.nextLine());
					check = false;
				}catch(Exception e){
					System.out.print("ERROR --> INSERTE UN NUEMRO ENTERO: ");
				}
				
			}
			
			check = true;
			
			if(cantidad>=1 && cantidad<=alumnos.length) {
				
				System.out.println(alumnos[cantidad-1].info());
				
			}else if(cantidad==alumnos.length+1){
				System.out.print("fin del programa.");
				return;

			}else {
				System.out.print("SELECCIONE UNA OPCION VALIDA.");

			}		
		}
	}
}