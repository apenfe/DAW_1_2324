package segundo_repaso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO{
	
	public final String PASS = "1234";
	public final String USER = "root";
	public final String SERVER = "127.0.0.1";
	public final String DB = "restaurante";
	public final String PORT = "3306";
	public final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DB;
	public String plantilla = "INSERT INTO comida (nombre, precio, tamano, local) values ('#nombre#','#precio#','#tamano#','#local#');";
	
	public void insertarListaComida(Comida[] a) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement st = conn.createStatement();
			
			for (int i = 0; i < a.length; i++) {
				
				String query = plantilla.replaceAll("#nombre#",a[i].getNombre())
						.replaceAll("#precio#",""+a[i].getPrecio())
						.replaceAll("#tamano#",a[i].getTamano())
						.replaceAll("#local#",a[i].getLocal());
				
				System.out.println(query);
				st.executeUpdate(query);
			}
			
			st.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.err.println(e);		
			
		}
		
	}
	
	public void consultar() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT * FROM comida;";
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.println("NOMBRE: "+rs.getString("nombre")+". Precio: "+rs.getString("precio")+". Tamaño: "+rs.getString("tamano")+". pais: "+rs.getString("local"));
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.err.println(e);		
			
		}
		
	}
	
}