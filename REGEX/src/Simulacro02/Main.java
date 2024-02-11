package Simulacro02;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * La práctica consiste en un programa que pida al usuario que introduzca un dominio de dirección de 
 * correo (gmail, hotmail, outlook, etc.) para extraer de un archivo "usuarios.txt" aquellos usuarios 
 * cuyo email pertenezca a ese dominio.
 * 
 * Una vez se haya obtenido los usuarios, el programa debe "enviar" un email personalizado a cada 
 * usuario usando una plantilla. Dado que no vamos a conectar con un servidor de correo saliente 
 * para enviar emails, generaremos en una carpeta local del proyecto (output) un documento HTML por 
 * cada uno de los usuarios. El nombre de cada html debe estar formado por la parte del nombre del 
 * email (nombre@dominio.com), junto con la fecha actual en formato milisegundos, con extensión .html
 * 
 */

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un nombre de dominio: ");
		String dominio = teclado.nextLine().trim();
		
		Usuario[] usuarios = leerUsuarios(dominio);
		String plantilla = leerPlantilla();
		
		genSpam(plantilla,usuarios);
		
		
		
	}
	
	public static String leerPlantilla() {
		
		String plantilla = "";
		
		try {
			
			File archivo = new File(".\\archivos\\plantilla.html");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				plantilla+=lector.nextLine();
			}
			
			lector.close();
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		return plantilla;
		
	}
	
	public static Usuario[] leerUsuarios(String dominio) {
		
		ArrayList<Usuario> salida = new ArrayList<Usuario>();
		
		try {
			
			File archivo = new File(".\\archivos\\usuarios.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				
				if(linea[4].matches(".+@"+dominio+"\\..+")) {
					
					salida.add(new Usuario(linea[0],linea[1],linea[2],linea[3],linea[4],linea[5],linea[6]));
					
				}
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			System.out.println("ERROR");

		}
		
		Usuario[] exit = new Usuario[salida.size()];
		
		for (int i = 0; i < exit.length; i++) {
			
			exit[i]=salida.get(i);
			
		}
		
		return exit;
		
	}
	
	public static void genSpam(String plantilla, Usuario[] usuarios) {
		
		for (int i = 0; i < usuarios.length; i++) {
			
			String nombre = usuarios[i].getEmail().split("@")[0];
			nombre+= System.currentTimeMillis();
			String nuevaPlantilla=plantilla;
			
			nuevaPlantilla=nuevaPlantilla.replaceAll("=nombre=", usuarios[i].getNombre());
			nuevaPlantilla=nuevaPlantilla.replaceAll("=apellidos=", usuarios[i].getApellidos());
			nuevaPlantilla=nuevaPlantilla.replaceAll("=dni=", usuarios[i].getDni());
			nuevaPlantilla=nuevaPlantilla.replaceAll("=direccion=", usuarios[i].getDireccion());
			nuevaPlantilla=nuevaPlantilla.replaceAll("=telefono=", usuarios[i].getTelefono());
			nuevaPlantilla=nuevaPlantilla.replaceAll("=email=", usuarios[i].getEmail());

			System.out.println(nuevaPlantilla);
			try {
				
				FileWriter archivo = new FileWriter(".\\output\\"+nombre+".html",true);
				archivo.write(nuevaPlantilla);
				archivo.close();
				
			} catch (Exception e) {
				System.out.println("ERROR");

			}
			
		}
		
	}
	
}