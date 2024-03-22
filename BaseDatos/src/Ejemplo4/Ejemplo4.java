package Ejemplo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo4{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Busqueda por nombre: ");
		String busqueda = teclado.nextLine();
		
		ArrayList<Profesor> profesores = getProfesores(busqueda);
		
		System.out.println("Listado de profesores:");
		for (int i = 0; i < profesores.size(); i++) {
			
			System.out.println((i+1)+"º profesor ");
			System.out.println("Apellidos: "+profesores.get(i).nombre);
			System.out.println("Nombre: "+profesores.get(i).apellidos);
			System.out.println("NRP: "+profesores.get(i).nrp);
			System.out.println("DNI: "+profesores.get(i).dni);
			System.out.println("Departamento: "+profesores.get(i).departamento);
			System.out.println();
			
		}
		
	}
	
	public static ArrayList<Profesor> getProfesores(String busqueda){
		
		Daw db = new Daw();
		return db.obtenerProfesores(busqueda);
		
	}
	
}