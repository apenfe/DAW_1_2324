package ejemplo12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO{
	
	private final String URL = "jdbc:mysql://r2d2.iescierva.net:3306/champions";
	private final String USER = "champions";
	private final String PASS = "champions";
	private String GET = "SELECT j.*, p.gentilicio, e.nombre as nombreEquipo"
			+ " FROM jugador j INNER JOIN pais p ON j.pais = p.codPais"
			+ " INNER JOIN equipo e ON j.equipo = e.codEquipo";
	
	public ArrayList<Jugador> buscarJugadores(String busqueda){
		
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String con =GET ;
			
			if(busqueda.length()>0) {
				
				con +=" WHERE j.nombre LIKE '%"+busqueda+"%';";
			}
			
			ResultSet rs = stmt.executeQuery(con);
			
			while(rs.next()) {
				
				Jugador actual = new Jugador(rs.getString("nombre"),rs.getString("dorsal"),rs.getString("posicion"),rs.getString("fechaNac"),rs.getString("gentilicio"),rs.getString("nombreEquipo"));
				lista.add(actual);
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.err.println("Error: "+e);
			
		}
		
		return lista;
		
	}
	
	
}