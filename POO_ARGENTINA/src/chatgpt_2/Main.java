package chatgpt_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static DAO db = new DAO();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("menu");
			System.out.println("1 - agregar mascota");
			System.out.println("2 - mostrar todas las mascotas");
			System.out.println("3 - crear la tabla");
			System.out.println("4 - borrar la tabla");
			System.out.println("5 - salir");
			int opcion = pedirInt("Selecciona una opción: ");
			
			if(opcion == 1) {
				
				Gato g = new Gato("1","silvestre",8,"macho");
				Perro p = new Perro("2","zaira",10,"pequeno");
				Pajaro pa = new Pajaro("3","piolin",20,"pequeno");
				
				db.cargarAnimal(g);
				db.cargarAnimal(p);
				db.cargarAnimal(pa);
				
				Perro[] perros = leerMascotas();
				
				for (int i = 0; i < perros.length; i++) {
					
					db.cargarAnimal(perros[i]);
					
				}
				
			}else if(opcion==2) {
				
				db.leerAlgo();
				
			}else if(opcion==3) {
				
				db.crearTablaAnimales();
				
			}else if(opcion==4) {
				
				db.borrarTablaAnimales();
				
			}else if(opcion==5) {
				
				break;
				
			}else {
				
				System.out.println("selecciona una opcion valida");
				
			}
			
		} while (true);
		
	}
	
	public static int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		
		do {
			
			try {
				
				int num = Integer.parseInt(teclado.nextLine().trim());
				return num;
				
			} catch (Exception e) {
				
				System.err.print("Inserte un numero entero --> ");
			}
			
		}while(true);
		
	}
	
	public static Perro[] leerMascotas() {
		
		ArrayList<Perro> mascotas = new ArrayList<Perro>();
		
		try {
			
			File archivo = new File("enunciados\\animales.txt");
			Scanner lector = new Scanner(archivo);
			
			while (lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
					
				mascotas.add(new Perro(linea[0],linea[1],Integer.parseInt(linea[2]),linea[3]));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.err.println("error al leer archivo");
			
		}
		
		return mascotas.toArray(new Perro[0]);
		
	}
	
}