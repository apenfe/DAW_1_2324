package Simulacro01repaso3;

import java.util.ArrayList;

import Static.Entrada;

public class Principal{
	
	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		int num=0;
		
		do {
			
			num= Entrada.pedirEntero("Cuantos alumnos desea crear: ", true);
			
			if(num<=0) {
				System.out.println("El numero debe ser mayor que 0.");
			}
			
		}while(num<=0);
		
		for(int i=1; i<=num; i++) {
			
			String nombre = Entrada.pedirTexto("Ingrese el nombre: ");
			String apellidos = Entrada.pedirTexto("Ingrese el apellido: ");
			String nre = Entrada.pedirTexto("Ingrese el nre: ");
			String email = Entrada.pedirTexto("Ingrese el email: ");
			String direccion = Entrada.pedirTexto("Ingrese la direccion: ");
			
			alumnos.add(new Alumno(nombre,apellidos,nre,email,direccion));

		}
		
		for(int i=1; i<=num; i++) {
			
			System.out.println(alumnos.get(i-1).toString());

		}
		
		while(true) {
			
			System.out.println("---MENU---");
			for(int i=0; i<num; i++) {
				System.out.println(i+1+" ---> "+alumnos.get(i).getNombre());
			}
			System.out.println("Seleccione una opcion: ");
			System.out.println();
			
			int opcion= Entrada.pedirEntero("Seleccione una opcion: ", true);

			
			if(opcion>=1&&opcion<=num+1) {
				System.out.println(alumnos.get(opcion-1).toString());

			}else {
				if(opcion==0) {
					return;
				}else {
					System.out.println("Seleccione una opcion valida. ");

				}
			}
			
			
		}
		
	}
	
}