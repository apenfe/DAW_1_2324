package repaso_chatgpt_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestorBaseDatos implements BaseDatos{

	@Override
	public void insertarGerente(Gerente g) {

		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insercion = "INSERT INTO gerente(id,nombre,salario,bono) values ('"+g.id+"','"+g.nombre+"','"+g.salario+"','"+g.bono+"');";
			
			stmt.executeUpdate(insercion);
			
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR AL INSERTAR");
			
		}
		
	}

	@Override
	public void leerGerentes() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String insercion = "SELECT * FROM gerente;";
			
			ResultSet rs = stmt.executeQuery(insercion);
			
			while (rs.next()) {
				
				System.out.println("ID: "+rs.getString("id")+", nombre: "+rs.getString("nombre")+", salrio: "+rs.getString("salario")+", bono: "+rs.getString("bono"));
				
			}
			
			conn.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR AL CONSULTAR");
			
		}
		
	}
	
	
}