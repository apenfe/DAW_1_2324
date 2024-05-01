package repaso_general_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB implements DAO{

	@Override
	public boolean crearTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "CREATE TABLE IF NOT EXISTS repaso(id VARCHAR(20) PRIMARY KEY, nombre VARCHAR(50));";
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			return false;
			
		}
		
	}

	@Override
	public boolean borrarTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "DROP TABLE IF EXISTS repaso;";
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			return false;
			
		}
		
	}

	@Override
	public boolean insertarDato(String nombre) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "INSERT INTO repaso (id,nombre) VALUES ('"+1+"','"+nombre+"');";
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			return false;
			
		}
		
	}

	@Override
	public void hacerConsulta() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT * FROM repaso;";
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.println("nombre: "+rs.getString("nombre"));
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
	}
	
}