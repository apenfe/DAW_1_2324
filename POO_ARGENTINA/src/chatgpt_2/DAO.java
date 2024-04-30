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
			
			String insertar = "INSERT INTO animales (id,nombre,edad,otro) values ('"+g.getId()+"','"+g.getNombre()+"','"+g.getEdad()+"','"+g.getSexo()+"');";
			
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
			
			String insertar = "INSERT INTO animales (id,nombre,edad,otro) values ('"+p.getId()+"','"+p.getNombre()+"','"+p.getEdad()+"','"+p.getTipo()+"');";			
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
			
			String insertar = "INSERT INTO animales (id,nombre,edad,otro) values ('"+p.getId()+"','"+p.getNombre()+"','"+p.getEdad()+"','"+p.getTamano()+"');";			
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
	public void leerAlgo() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM animales;");
			
			while(rs.next()) {
				
				System.out.println("ID: "+rs.getString("id")+". NOMBRE: "+rs.getString("nombre")+". EDAD: "+rs.getString("edad")+". OTRO: "+rs.getString(""));
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.err.println("error");
			
		}
		
	}

	@Override
	public void crearTablaAnimales() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "CREATE TABLE IF NOT EXISTS animales (id VARCHAR(50) PRIMARY KEY, nombre varchar(50), edad varchar(10), otro varchar(50));";
			
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			
			System.err.println("error al crear tabla");
			
		}
		
	}

	@Override
	public void borrarTablaAnimales() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String tabla = "DROP TABLE IF EXISTS animales;";
			
			stmt.executeUpdate(tabla);
			
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			
			System.err.println("error al BORRAR tabla");
			
		}
		
		
	}

	@Override
	public boolean cargarAnimal(Mascota m) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insertar = "INSERT INTO animales (id,nombre,edad,otro) values ('"+m.getId()+"','"+m.getNombre()+"','"+m.getEdad()+"');";			
			stmt.executeUpdate(insertar);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			System.err.println("error");
			return false;
			
		}
	}
	
}