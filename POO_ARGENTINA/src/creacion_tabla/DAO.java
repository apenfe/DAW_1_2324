package creacion_tabla;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
	private static final String SERVER = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String DATABASE = "segunda";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	public boolean crearTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "CREATE TABLE IF NOT EXISTS adrian ("
					+ "id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "nombre varchar(500) NOT NULL, "
					+ "apellidos varchar(500));";
			
			stmt.executeUpdate(consulta);

			stmt.close();
			conn.close();

			return true;
			
		} catch (Exception e) {

			System.out.println("error al crear tabla");
			return false;
			
		}
		
	}
	
	public boolean borrarTabla() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "DROP TABLE IF EXISTS adrian;";
			
			stmt.executeUpdate(consulta);

			stmt.close();
			conn.close();

			return true;
			
		} catch (Exception e) {

			System.out.println("error al BORRAR tabla");
			return false;
			
		}
		
	}
	
}