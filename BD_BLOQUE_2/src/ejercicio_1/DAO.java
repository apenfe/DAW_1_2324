package ejercicio_1;

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
	
	public boolean insertar(Usuario u) {
			
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO usuario (nombre, email, password) values ('"+u.nombre+"','"+u.email+"','"+u.password+"');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
	public String encryptMd5(String password) {
		
		try {
			
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : digest) {
                hexString.append(String.format("%02x", b & 0xff));
            }
            
            return hexString.toString();
            
        } catch (NoSuchAlgorithmException e) {
        	
            System.err.println("Error al encriptar la contraseña.");
            e.printStackTrace();
            
        }
		
		return password;
		
	}
	
}