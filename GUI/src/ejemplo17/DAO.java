package ejemplo17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
	private final String URL = "jdbc:mysql://172.16.16.100:3306/sistema";
	private final String USER = "root";
	private final String PASS = "david";
	private final String INSERT = "INSERT INTO usuario (username,password,nombre) VALUES ('#username#','MD5(#password#)','#nombre#');";
	
	public boolean insertar(Usuario c) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String query = "INSERT INTO usuario (username,password,nombre) VALUES ('"+c.username+"',MD5("+c.password+"),'"+c.nombre+"');";
			
			stmt.executeUpdate(query);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
		return false;
		
		}
		
	}
	
}