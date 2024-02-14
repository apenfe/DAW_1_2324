package repasoSimulacro03cuatro;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static String dominio;
	public static String plantilla = "";
	public static Usuario[] usuarios = new Usuario[0];

	
	public static void main(String[] args) {
		
		System.out.println("Inserte un nombre de dominio: ");
		dominio = teclado.nextLine().trim();
		
		plantilla();
		usuarios();
		spam();
		
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
	
	public static void usuarios() {

		ArrayList<Usuario> usuario = new ArrayList<Usuario>();

		try {

			File archivo = new File(".\\archivos\\usuarios.txt");
			Scanner lector = new Scanner(archivo);

			while (lector.hasNextLine()) {
				
				if(lector.nextLine().split("&")[4].matches(".+@"+dominio+"\\..+")) {
					
					usuario.add(new Usuario(lector.nextLine().split("&")));
				
				}
				
			}

			lector.close();

		} catch (Exception e) {

			System.err.println("ERROR");

		}
		
		usuarios=usuario.toArray(new Usuario[0]);

	}

	public static void spam() {
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = ""+dominio+System.currentTimeMillis();
			String plantillaNueva=plantilla;
			plantillaNueva=plantillaNueva.replaceAll("=nombre=", usuarios[i].getNombre());
			plantillaNueva=plantillaNueva.replaceAll("=apellidos=", usuarios[i].getApellidos());
			plantillaNueva=plantillaNueva.replaceAll("=dni=", usuarios[i].getDni());
			plantillaNueva=plantillaNueva.replaceAll("=direccion=", usuarios[i].getDireccion());
			plantillaNueva=plantillaNueva.replaceAll("=telefono=", usuarios[i].getTelefono());
			plantillaNueva=plantillaNueva.replaceAll("=email=", usuarios[i].getEmail());
			
			try {
				
				FileWriter escritor = new FileWriter(".\\output\\"+nombre+".html");
				
				escritor.write(plantillaNueva);
				escritor.close();
				
			} catch (Exception e) {
				
				System.err.println("ERROR");
				
			}
			
			System.out.println((i+1)+"º Plantilla generada.");
			
		}
		
	}
	
}