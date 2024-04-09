package ejercicio_1;

import java.util.Scanner;

public class Ejercicio1{
	
	/*
	 * Ejercicio 1
	 * 
	 * Crea un programa siguiendo el patrón de diseño DAO el cual inserte en una base de datos nuevos usuarios pedidos por teclado.
	 * 
	 * El programa deberá pedir, al menos, nombre de usuario, contraseña e email. La contraseña deberá codificarse en MD5, ya sea desde 
	 * Java o desde la función MD5() en SQL.
	 * 
	 * Deberán crearse las clases necesarias para que el programa funcione siguiendo el principio de programación orientada a objetos.
	 * 
	 */
	public static Scanner teclado = new Scanner(System.in);
	public static DAO db = new DAO();
	
	public static void main(String[] args) {
		
		System.out.print("Inserte su nombre: ");
		String nombre = teclado.nextLine().trim();
		
		System.out.print("Inserte su email: ");
		String email = teclado.nextLine().trim();
		
		System.out.print("Inserte su contraseña: ");
		String password = teclado.nextLine().trim();
		password = db.encryptMd5(password);
		
		Usuario user = new Usuario(nombre, password, email);
		
		db.insertar(user);
		
	}
	
}
