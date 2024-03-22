package Ejemplo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Daw {
	
	private final String URL = "jdbc:mysql://r2d2.iescierva.net:3306/instituto";
	private final String SERVER = "r2d2.iescierva.net";
	private final String PORT = "3306";
	private final String DATABASE = "instituto";
	private final String USER = "instituto";
	private final String PASS = "instituto";

	
	public ArrayList<Profesor> obtenerProfesores(String nombre) {
		
		ArrayList<Profesor> lista = new ArrayList<Profesor>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(this.URL, this.USER, this.PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT p.dni, p.nombre,p.nrp, p.apellido1, p.apellido2, d.nombre FROM profesor p INNER JOIN departamento d ON p.cod_departamento=d.cod_departamento";
			
			if(nombre.length()>0) {
				consulta+= " WHERE p.nombre LIKE \"%"+nombre+"%\"";
			}
			
			consulta+=";";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {

				Profesor prof = new Profesor(rs.getString("p.nrp"),rs.getString("p.dni"),rs.getString("p.apellido1")+" "+rs.getString("p.apellido2"),rs.getString("p.nombre"),rs.getString("d.nombre"));

				lista.add(prof);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			System.out.println(e);

		}
		
		return lista;

	}

}