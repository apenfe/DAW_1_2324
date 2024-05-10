package ejemplo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO{
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/agenda";
	private final String USER = "root";
	private final String PASS = "1234";
	private final String INSERT = "INSERT INTO contacto (nombre,email,telefono) VALUES ('#nombre#','#email#','#telefono#');";
	private String GET = "SELECT * FROM contacto";
	private String PLUS = ";";
	
	public boolean insertar(Contacto c) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String query = INSERT.replace("#nombre#", c.nombre).replaceAll("#email#", c.email).replaceAll("#telefono#", c.telefono);
			
			stmt.executeUpdate(query);
			
			conn.close();
			stmt.close();
			
			return true;
			
		} catch (Exception e) {
			
			return false;
		
		}
		
	}
	
	public ArrayList<Contacto> buscar(String busqueda){
		
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta="";
			
			if(busqueda.length()>1) {
				consulta += GET +" WHERE nombre like '%"+busqueda+"%'"+PLUS;
			}
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				Contacto actual = new Contacto(rs.getString("nombre"),rs.getString("email"),rs.getString("telefono"));
				contactos.add(actual);
				
			}
			
		} catch (Exception e) {
			
			System.err.println(e);	
			
		}
		
		return contactos;
		
	}
	
}