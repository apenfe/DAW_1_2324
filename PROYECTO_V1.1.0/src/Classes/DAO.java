package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO{

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String DATABASE = "maze";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "root";
	private static final String PASS = "1234";
	
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

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "';";
			ResultSet rs = stmt.executeQuery(consulta);
			
			User user = new User();

			while (rs.next()) {
				
				if(rs.getString("id")!=null) {
					
					user = new User(rs.getString("id"),rs.getString("username"),rs.getString("name"),rs.getString("nif"),rs.getString("email"),rs.getString("address"),rs.getString("birthdate"),rs.getString("role"));
					return user;
					
				}
				
			}

			rs.close();
			stmt.close();
			conn.close();
			
			return null;

		} catch (Exception e) {

			return null;
			
		}
		
	}
	
	public boolean checkUser(User user) {
		
		boolean check = false;
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT * FROM user WHERE username = " + user.username + " OR nif = '" + user.nif + "' OR email = '"+user.email+"';";
			ResultSet rs = stmt.executeQuery(consulta);

			int i = 0;
			
			while (rs.next()) {

				i++;

			}
			
			if(i>0) {
				check = true;
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			check = false;

		}
		
		return check;
		
	}
	
	public boolean signup(User u, String password) {
			
		String pass = Utils.encryptMd5(password);
			
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO user (username, password, name, nif, email, address, birthdate, role) values ('"+u.username+"','"+pass+"','"+u.name+"','"+u.nif+"','"+u.email+"','"+u.addres+"','"+u.birthdate+"','user');";
				
			stmt.executeUpdate(query);
				
			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			
			return false;
				
		}
		
	}
	
}