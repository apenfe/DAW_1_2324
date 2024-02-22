package RepasosFinales;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Simulacro2Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un dominio: ");
		String dominio = teclado.nextLine().trim();
		
		String plantilla = plantilla();
		Simulacro2Usuario[] usuarios = usuarios(dominio);
	
		spam(plantilla,usuarios);
		
	}
	
	public static String plantilla() {
		
		String plantilla = "";
		
		try {
			
			File archivo = new File(".\\archivos\\plantilla.html");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				plantilla+=lector.nextLine();
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.err.println("ERROR");
			
		}
		
		return plantilla;
	
	}
	
	public static Simulacro2Usuario[] usuarios(String dominio) {
		
		ArrayList<Simulacro2Usuario> nuevos = new ArrayList<>();
		
		try {
			
			File archivo = new File(".\\archivos\\usuarios.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				
				if(linea[4].matches(".+@"+dominio+"\\..+")) {
					
					nuevos.add(new Simulacro2Usuario(linea));
					
				}	
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.err.println("ERROR");
			
		}
		
		return nuevos.toArray(new Simulacro2Usuario[0]);
			
	}
	
	public static void spam(String plantilla, Simulacro2Usuario[] usuarios) {
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = ""+usuarios[i].getDni();
			String newPlantilla = plantilla;
			newPlantilla = newPlantilla.replaceAll("=nombre=", usuarios[i].getNombre());
			newPlantilla = newPlantilla.replaceAll("=apellidos=", usuarios[i].getApellidos());
			newPlantilla = newPlantilla.replaceAll("=direccion=", usuarios[i].getDireccion());
			newPlantilla = newPlantilla.replaceAll("=dni=", usuarios[i].getDni());
			newPlantilla = newPlantilla.replaceAll("=telefono=", usuarios[i].getTelefono());
			newPlantilla = newPlantilla.replaceAll("=email=", usuarios[i].getCorreo());
			
			try {
				
				FileWriter escritor = new FileWriter(".\\output\\"+nombre+".html",true);
				escritor.write(newPlantilla);
				escritor.close();
				
			} catch (Exception e) {
				
				System.err.println("ERROR");
				
			}
			
		}
		
	}
	
}