import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejemplo1{
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://r2d2.iescierva.net:3306/instituto","instituto","instituto");
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT * FROM alumno;";
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.print(rs.getString(4)+" "+rs.getString(5)+", "+rs.getString(3)+" ("+rs.getString(1)+")");
				System.out.println();

			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}