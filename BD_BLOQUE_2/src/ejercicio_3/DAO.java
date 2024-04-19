package ejercicio_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
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

			String query = "INSERT INTO alumno (id_alumno, nombre, apellidos, dni, email, direccion, telefono) values ('"+a.id_alumno+"','"+a.nombre+"','"+a.apellidos+"','"+a.dni+"','"+a.email+"','"+a.direccion+"','"+a.telefono+"');";
				
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

			String query = "INSERT INTO modulo (id_modulo, nombre, curso, horas, profesor) values ('"+m.id_modulo+"','"+m.nombre+"','"+m.curso+"','"+m.horas+"','"+m.profesor+"');";
				
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

			String query = "INSERT INTO modulo_alumno (id_alumno, id_modulo) values ('"+claves[1]+"','"+claves[0]+"');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
}