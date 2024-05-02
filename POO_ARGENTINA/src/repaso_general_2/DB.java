package repaso_general_2;

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
			
			String tabla = "CREATE TABLE IF NOT EXISTS prueba (id INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(50) NOT NULL);";
			
			stmt.executeUpdate(tabla);
			
			stmt.close();
			conn.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al crear tabla");
			return false;
			
		}
		
	}

	@Override
	public boolean borrarTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "DROP TABLE IF EXISTS prueba;";
			
			stmt.executeUpdate(tabla);
			
			stmt.close();
			conn.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al borrar tabla");
			return false;
			
		}
		
	}

	@Override
	public boolean insertarDato(String[] nombres) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			for (int i = 0; i < nombres.length; i++) {
				
				String insert = "INSERT INTO prueba(nombre) VALUES('"+nombres[i]+"');";
				stmt.executeUpdate(insert);
				
			}
			
			stmt.close();
			conn.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("error al insertar datos en tabla");
			return false;
			
		}
		
	}

	@Override
	public void hacerConsulta() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "select * from prueba;";
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.println("ID: "+rs.getString("id")+". Nombre: "+rs.getString("nombre"));
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.out.println("error al realizar consulta");
			
		}
		
	}
	
}