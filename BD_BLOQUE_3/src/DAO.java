import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO{
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "r2d2.iescierva.net";
	private static final String PORT = "6033";
	private static final String DATABASE = "jardineria";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "jardineria";
	private static final String PASS = "jardineria";
	
	public String consulta_1() {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT nombre, precio as euros, precio*1.08 as dolares FROM producto;";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += rs.getString("nombre")+rs.getString("euros")+rs.getString("dolares");
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
}