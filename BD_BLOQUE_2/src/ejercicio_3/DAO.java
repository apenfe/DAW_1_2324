package ejercicio_3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
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
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String DATABASE = "usuario";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	public boolean insertarAlumno(Alumno a) {
			
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO usuarioplus (nombre, apellidos, dni, email, direccion, telefono) values ('"+a.nombre+"','"+a.apellidos+"','"+a.dni+"','"+a.email+"','"+a.direccion+"','"+a.telefono+"');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
	public boolean insertarModulo(Modulo m) {
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO usuarioplus (id, nombre, curso, horas, profesor) values ('"+m.id+"','"+m.nombre+"','"+m.curso+"','"+m.horas+"','"+m.profesor+"');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
	public boolean insertarRelacion(String s) {
		
		String[] claves = s.split(",");
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO usuarioplus (nombre, apellidos, dni, email, direccion, telefono) values ('"+u.nombre+"','"+u.apellidos+"','"+u.dni+"','"+u.email+"','"+u.direccion+"','"+u.telefono+"');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
}