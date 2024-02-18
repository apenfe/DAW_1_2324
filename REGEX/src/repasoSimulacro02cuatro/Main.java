package repasoSimulacro02cuatro;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static String plantilla;
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un dominio de correo: ");
		String dominio = teclado.nextLine().trim();
		
		plantilla();
		Usuario[] usuarios =usuarios(dominio);
		spam(usuarios,dominio);
		
	}
	
	public static void plantilla() {
		
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
			System.err.println("ERROR");
		}
		
		return usuarios.toArray(new Usuario[0]);
		
	}
	
	public static void spam(Usuario[] usuarios, String dominio) {
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = ""+usuarios[i].getNombre()+System.currentTimeMillis();
			String plantillaN = plantilla;
			plantillaN=plantillaN.replaceAll("=nombre=", usuarios[i].getNombre());
			plantillaN=plantillaN.replaceAll("=apellidos=", usuarios[i].getApellidos());
			plantillaN=plantillaN.replaceAll("=dni=", usuarios[i].getDni());
			plantillaN=plantillaN.replaceAll("=direccion=", usuarios[i].getDireccion());
			plantillaN=plantillaN.replaceAll("=telefono=", usuarios[i].getTelefono());
			plantillaN=plantillaN.replaceAll("=email=", usuarios[i].getEmail());
			
			System.err.println(plantillaN+"\n");
			
			try {
				
				FileWriter escritor = new FileWriter(".\\output\\"+nombre+".html",true);
				escritor.write(plantillaN);
				escritor.close();
				
			} catch (Exception e) {
				System.err.println("ERROR");
			}
			
		}
		
	}
	
}