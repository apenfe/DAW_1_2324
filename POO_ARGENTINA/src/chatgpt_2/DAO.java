package chatgpt_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO implements RegistroMascotas{

	@Override
	public boolean cargarAnimal(Gato g) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insertar = "";
			
			stmt.executeUpdate(insertar);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.err.println("error");
			return false;
			
		}
		
	}

	@Override
	public boolean cargarAnimal(Pajaro p) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insertar = "";
			
			stmt.executeUpdate(insertar);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.err.println("error");
			return false;
			
		}
		
	}

	@Override
	public boolean cargarAnimal(Perro p) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insertar = "";
			
			stmt.executeUpdate(insertar);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.err.println("error");
			return false;
			
		}
		
	}

	@Override
	public boolean cargarAnimal(Mascota m) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insertar = "";
			
			stmt.executeUpdate(insertar);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.err.println("error");
			return false;
			
		}
		
	}

	@Override
	public void leerAlgo(String consulta) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.println();
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.err.println("error");
			
		}
		
	}
	
}