package repasoSimulacro02tres;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un dominio de correo: ");
		String dominio = teclado.nextLine().trim();
		
		String plantilla = plantilla();
		
		spam(plantilla,dominio);
		
	}
	
	public static String plantilla() {
		
		String plantilla="";
		
		try {
			
			File archivo = new File(".\\archivos\\plantilla.html");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				plantilla += lector.nextLine();
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		return plantilla;
		
	}
	
	public static Usuario[] usuarios(String dominio) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			File archivo = new File(".\\archivos\\usuarios.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				
				if(linea.split("&")[4].matches(".+@"+dominio+"\\..+")) {
					
					usuarios.add(new Usuario(linea.split("&")));
					
				}
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		Usuario[] salida = new Usuario[usuarios.size()];
		
		for (int i = 0; i < salida.length; i++) {
			
			salida[i]=usuarios.get(i);
			
		}	
		
		return salida;
		
	}
	
	public static void spam(String plantilla, String dominio) {
		
		Usuario[] usuarios = usuarios(dominio);
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = usuarios[i].getDni()+System.currentTimeMillis();
			String newPlantilla = plantilla;
			newPlantilla=newPlantilla.replaceAll("=nombre=", usuarios[i].getNombre());
			newPlantilla=newPlantilla.replaceAll("=apellidos=", usuarios[i].getApellidos());
			newPlantilla=newPlantilla.replaceAll("=dni=", usuarios[i].getDni());
			newPlantilla=newPlantilla.replaceAll("=direccion=", usuarios[i].getDireccion());
			newPlantilla=newPlantilla.replaceAll("=telefono=", usuarios[i].getTelefono());
			newPlantilla=newPlantilla.replaceAll("=email=", usuarios[i].getEmail());
			
			try {
				
				FileWriter escritor = new FileWriter(".\\output\\"+nombre+".html",true);
				
				escritor.write(newPlantilla);
				escritor.close();
				
			} catch (Exception e) {
				
				System.out.println("ERROR");
				
			}
			
		}
		
	}
	
}