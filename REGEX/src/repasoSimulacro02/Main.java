package repasoSimulacro02;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un texto: ");
		String dominio = teclado.nextLine();
		
		String plantilla = plantilla();
		Usuario[] usuarios = usuarios(dominio);
		
		spam(plantilla, usuarios);
		
	}
	
	public static String plantilla() {
		
		String salida = "";
		
		try {
			
			File archivo = new File(".\\archivos\\plantilla.html");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				salida+=lector.nextLine();
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		return salida;
		
	}
	
	public static Usuario[] usuarios(String dominio) {
		
		ArrayList<Usuario> actuales = new ArrayList<Usuario>();
		
		try {
			
			File archivo = new File(".\\archivos\\usuarios.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				if(lector.nextLine().split("&")[4].matches(".+@"+dominio+"\\..+")) {
					
					String[] datos = lector.nextLine().split("&");
					actuales.add(new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]));
				}
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		Usuario[] salida = new Usuario[actuales.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=actuales.get(i);
		}
		
		return salida;
		
	}
	
	public static void spam(String plantilla, Usuario[] usuarios) {
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = usuarios[i].getCorreo().split("@")[0];
			nombre+=System.currentTimeMillis();
			
			String nPlantilla = plantilla;
			nPlantilla=nPlantilla.replaceAll("=nombre=", usuarios[i].getNombre());
			nPlantilla=nPlantilla.replaceAll("=apellidos=", usuarios[i].getApellidos());
			nPlantilla=nPlantilla.replaceAll("=dni=", usuarios[i].getDni());
			nPlantilla=nPlantilla.replaceAll("=email=", usuarios[i].getCorreo());
			nPlantilla=nPlantilla.replaceAll("=direccion=", usuarios[i].getDireccion());
			nPlantilla=nPlantilla.replaceAll("=telefono=", usuarios[i].getTelefono());
			
			try {
				
				FileWriter archivo = new FileWriter(".\\output\\"+nombre+".html");
				
				archivo.write(nPlantilla);
				
				archivo.close();
				
			} catch (Exception e) {
				
				System.out.println("ERROR");
				
			}
			
		}
		
	}
	
}