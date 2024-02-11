package Tarea3_3;

import java.io.File;
import java.util.Scanner;

public class Sesion{
	
	private String ruta;
	
	/* CREO UN CONSTRUCTOR PARA FORZAR ERROR AL LEER EL ARCHIVO */
	
	public Sesion(boolean archivo) {
		
		if(archivo) {
			this.ruta=".\\assests\\usuarios.txt";
		}else {
			this.ruta=".\\assests\\error.txt";
		}
		
	}
	
	public boolean login(String nombre, String password) {
		
		try {
			
			/* SE CREA UN OBJETO FILE Y UN ESCANER PARA LLERLO */
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			/* MIENTRAS EL ARCHIVO TENGA LINEAS, SE SIGUE HACIENDO LO DE DENTRO */
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#"); /* SE LEE LA LINEA Y SE SEPARA USUARIO Y CONTRASEÑA */
				
				if(linea[0].equals(nombre)==true&&linea[1].equals(password)==true) { /* SI COINCIDEN AMBOS, DEVOLVER TRUE */
					lector.close();
					return true;
				}
			}
			
			lector.close();
			
		}catch(Exception e) { /* EN CASO DE ERROR SE AVISA Y DEVUELVE FALSE */
			
			System.out.println("Error al leer el archivo.");
			e.printStackTrace();
			return false;
		}
		
		return false; /* SI NO SE HA ENCONTRADO NADA, DEVUELVE FALSE */
		
	}
	
}