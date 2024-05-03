package repaso_general_3;

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
			
			String tabla = "CREATE TABLE IF NOT EXISTS tercera(id INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(50) NOT NULL);";
			
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al crear la tabla");
			return false;
			
		}
		
	}

	@Override
	public boolean borrarTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "DROP TABLE IF EXISTS tercera;";
			
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al borrar la tabla");
			return false;
			
		}
		
		
	}

	@Override
	public boolean insertarDato(String[] nombres) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			for (int i = 0; i < nombres.length; i++) {
				
				String tabla = "INSERT INTO tercera (nombre) VALUES ('"+nombres[i]+"');";
				
				stmt.executeUpdate(tabla);
				
			}
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al insertar datos a la tabla");
			return false;
			
		}
		
	}

	@Override
	public void hacerConsulta() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "select * from tercera;";
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while (rs.next()) {
				
				System.out.println("ID: "+rs.getString("id")+". Nombre: "+rs.getString("nombre"));
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {

			System.out.println("error al realizar consulta");

		}
		
	}
	
}