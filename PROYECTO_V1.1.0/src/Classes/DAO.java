package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO{

	private final String SERVER = "127.0.0.1";
	private final String PORT = "3306";
	private final String DATABASE = "maze";
	private final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private final String USER = "root";
	private final String PASS = "1234";
	
	/*
	 * Se debe crear una clase llamada "DAO" la cual contendrá una serie de métodos los cuales provean 
	 * a la clase Session los servicios de login, registro y comprobar usuario.
	 * 
	 * Los métodos básicos que deberá contener son:
	 * 
	 * login: Método público el cual recibirá un usuario y contraseña para lanzar la consulta contra la 
	 * base de datos. Devolverá un objeto de tipo User si se ha encontrado el usuario, y un valor null 
	 * si no se ha encontrado.
	 * 
	 * checkUser: Método público el cual recibirá un usuario para lanzar la consulta contra la base de datos. 
	 * Devolverá valor true si se ha encontrado el usuario, y un valor false si no se ha encontrado.
	 * 
	 * signup: Método público el cual recibirá los datos del nuevo usuario para realizar una inserción en la 
	 * base de datos. Devolverá un valor true si se ha realizado la inserción correctamente y un valor false 
	 * si no se puede insertar.
	 * 
	 */
	
	public User login(String username, String password) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(this.URL, this.USER, this.PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT * FROM user WHERE username="+username+"AND password="+pass+";";
			
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
		
		return null;
		
	}
	
	public boolean checkUser(User user) {

		
		
	}
	
	public boolean signup(String username, String name, String nif, String email, String addres, String birthdate) {

		
		
	}
	
	public boolean signup(String username, String name, String nif, String email, String addres, String birthdate, String role) {

		
		
	}
	
}