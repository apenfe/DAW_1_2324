import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejemplo3{
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://r2d2.iescierva.net:3306/instituto","instituto","instituto");
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.dni, p.nombre, p.apellido1, p.apellido2, d.nombre FROM profesor p INNER JOIN departamento d ON p.cod_departamento=d.cod_departamento;";
			ResultSet rs = stmt.executeQuery(consulta);
			
			int i = 1;
			
			while(rs.next()) {
				
				System.out.println(i +"º profesor\n----------");
				System.out.println("Nombre: "+rs.getString("nombre"));
				System.out.println("Apellidos: "+rs.getString("apellido1")+" "+rs.getString("apellido2"));
				System.out.println("DNI: "+rs.getString("dni"));
				System.out.println("Departamento: "+rs.getString("d.nombre"));
				System.out.println();

				i ++;
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
	}
	
}