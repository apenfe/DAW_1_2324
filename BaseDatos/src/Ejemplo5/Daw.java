package Ejemplo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Daw {
	
	private final String URL = "jdbc:mysql://r2d2.iescierva.net:3306/instituto";
	private final String SERVER = "172.16.16.100";
	private final String PORT = "3306";
	private final String DATABASE = "agenda";
	private final String USER = "instituto";
	private final String PASS = "instituto";

	
	public boolean insertarContacto(Contacto c) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(this.URL, this.USER, this.PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO contacto (nombre, telefono, email, direccion) values ('"+c.nombre+"','"+c.telefono+"','"+c.email+"','"+c.direccion+"');";
			System.out.println(query);
			
			stmt.executeUpdate(query);
			
			stmt.close();
			conn.close();

		} catch (Exception e) {

			System.out.println(e);
			return false;
		}
		
		return true;

	}

}