package Classes;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Session{
	
	/* ATRIBUTOS PRIVADOS DE LA CLASE */
	
	private User user;
	private boolean logged;
	private final String FILE = ".\\assets\\files\\users.txt";
	
	/* LISTADO DE MÉTODOS DE LA CLASE */
	
	/* CONSTRUCTOR DE LA CLASE */
	
	public Session() {
		
		this.logged=false;
		this.user=new User();

	}
	
	/* METODO LOGIN PARA EL ACCESO DE USUARIOS */
	
	public void login() {
		
		String nombre = Input.getString("Inserte su nombre de usuario: ");
		String password = Input.getString("Inserte su contraseña: ");
		
		try {
			
			File archivo = new File(FILE);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				
				if(linea[0].equals(nombre)&&linea[1].equals(password)) {
					
					System.out.println("BIENVENIDO.");
					this.logged=true;
					user = new User(linea[0],linea[2],linea[3],linea[4],linea[5],linea[6],linea[7]);
					lector.close();
					return;
					
				}
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO");
			e.printStackTrace();
			
		}
		
		System.out.println("NO SE HA PODIDO INICIAR SESION.");

		
	}
	
	/* METODO SIGNUP PARA REGISTRAR NUEVOS USUARIOS */
	
	public void signup() {
		
		String nombre = Input.getString("Inserte un nombre de usuario: ");
		
		try {
			
			File archivo = new File(FILE);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				
				if(linea[0].equals(nombre)) {
					
					System.out.println("Nombre de usuario en uso.");
					lector.close();
					return;
					
				}
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO");
			e.printStackTrace();
			
		}
		
		System.out.println("NOMBRE DE USUARIO UNICO, A CONTINUACION INGRESE...");
		String password = Input.getString("Inserte contraseña: ");
		String name = Input.getString("Inserte nombre: ");
		String nif = Input.getString("Inserte DNI: ");
		String email = Input.getString("Inserte email: ");
		String direccion = Input.getString("Inserte direccion: ");
		String year = Input.getString("Inserte fecha nacimiento: ");
		
		String linea = nombre+"#"+password+"#"+name+"#"+nif+"#"+email+"#"+direccion+"#"+year+"#user";
		
		try {
			
			FileWriter escritor = new FileWriter(FILE,true);
			
			escritor.write("\n"+linea);
			
			escritor.close();
			System.out.println("USUARIO REGISTRADO");

			return;
			
		}catch(Exception e) {
			
			System.out.println("ERROR AL LEER ARCHIVO");
			e.printStackTrace();
			
		}
		
		System.out.println("NO SE HA PODIDO REGISTRAR EL USUARIO.");
		
				
	}
	
	/* METODO PARA VER LA INFORMACÓN COMPLETA DEL USUARIO */
	
	public void showUser() {
		
		System.out.println(user.toString());
		
	}
	
	/* METODO PARA CERRAR LA SESION DEL USUARIO */
	
	public void logOut() {
		
		System.out.println("SESION CERRADA.");
		logged=false;
		user= new User();
		
	}
	
	/* METODO PARA COMPROBAR SI EL USUARIO HA INICIADO O NO LA SESIÓN */
	
	public boolean isLogged() {
		
		return this.logged;
		
	}

	
}