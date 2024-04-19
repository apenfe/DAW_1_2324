import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO{
	
	private final String SERVER = "127.0.0.1";
	private final String PORT = "3306";
	private final String DB = "restaurante";
	private final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DB;
	private final String USER = "root";
	private final String PASS = "1234";
	private String plantilla = "INSERT INTO comida (nombre, precio, tamano, local) values ('#nombre#','#precio#','#tamano#','#local#');";
	
	public void insertarListaComida(Comida[] a) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			for (int i = 0; i < a.length; i++) {
				
				String query = plantilla.replaceAll("#nombre#",a[i].getNombre())
						.replaceAll("#precio#",""+a[i].getPrecio())
						.replaceAll("#tamano#",a[i].getTamano())
						.replaceAll("#local#",a[i].getLocal());
				
				System.out.println(query);
				stmt.executeUpdate(query);
			}
				
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.err.println(e);		
			
		}
		
	}
	
}