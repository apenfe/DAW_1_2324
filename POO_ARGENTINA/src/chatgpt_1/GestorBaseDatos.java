package chatgpt_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestorBaseDatos implements BaseDatos{

	@Override
	public void leerEmpleados() {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT * FROM empleado;";
			
			ResultSet rs = stmt.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.println("empleado: "+rs.getString("nombre")+" ID: "+rs.getString("id")+" salario: "+rs.getString("salario")+" bono: "+rs.getString("bono")+"\n");
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.err.println("error al leer base de datos");
			
		}
		
	}

	@Override
	public void insertarEmpleado(Empleado a, int b) {
		
		try {
			
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "INSERT INTO empleado (nombre, id, salario, bono) values ('"+a.getNombre()+"','"+a.getId()+"','"+a.getSalario()+"','"+b+"');";

			stmt.executeUpdate(consulta);
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			
			System.err.println("error al cargar en base de datos");
			
		}

	}
	
}