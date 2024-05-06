package ejemplo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/agenda";
	private final String USER = "root";
	private final String PASS = "1234";
	private final String INSERT = "INSERT INTO contacto (nombre,email,telefono) VALUES ('#nombre#','#email#','#telefono#');";
	
	public boolean insertar(Contacto c) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String query = INSERT.replace("#nombre#", c.nombre).replaceAll("#email#", c.email).replaceAll("#telefono#", c.telefono);
			
			stmt.executeUpdate(query);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
		return false;
		
		}
		
	}
	
}