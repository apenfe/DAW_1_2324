import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO{
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "r2d2.iescierva.net";
	private static final String PORT = "6033";
	private static final String DATABASE = "tienda";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "tienda";
	private static final String PASS = "tienda";
	
	/*
	 * 1- Listar todos los productos de un fabricante indicado por teclado (Sin utilizar la intersección de tablas INNER JOIN)
	 * 2- Listar todos los datos, incluido el nombre del fabricante, de los productos que tienen el mismo precio que el producto más caro de un fabricante indicado por teclado.
	 * 3- Lista el nombre del producto más caro de un fabricante indicado por teclado.
	 * 4- Lista el nombre del producto más barato de un fabricante indicado por teclado.
	 * 5- Devuelve todos los productos de la base de datos que tienen un precio mayor o igual al producto más caro de un fabricante indicado por teclado.
	 * 6- Lista todos los productos de un fabricante indicado por teclado que tienen un precio superior al precio medio de todos sus productos de ese mismo fabricante.
	 * 7- Muestra el producto más caro que existe en la tabla producto sin hacer uso de MAX, ORDER BY ni LIMIT.
	 * 8- Muestra el producto más barato que existe en la tabla producto sin hacer uso de MIN, ORDER BY ni LIMIT.
	 * 9- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando ALL o ANY).
	 * 10- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando ALL o ANY).
	 * 11- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
	 * 12- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
	 * 
	 */
	
	public String consulta_1(String nombre) {
		
		String salida = "";
		
		try {
			
			// 1- Listar todos los productos de un fabricante indicado por teclado (Sin utilizar la intersección de tablas INNER JOIN)

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT p.nombre, p.precio FROM producto p WHERE p.id_fabricante = (SELECT id FROM fabricante WHERE nombre = '"+nombre+"');";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += "producto: "+rs.getString("p.nombre")+"y precio: "+rs.getString("p.precio")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_2(String nombre) {
		
		String salida = "";
		
		try {
			
			// 2- Listar todos los datos, incluido el nombre del fabricante, de los productos que tienen el mismo precio o superior que el producto más caro de un fabricante indicado por teclado.
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String subconsulta = "(SELECT MAX(p2.precio) "
					+ "FROM producto p2 INNER JOIN fabricante f2 ON p2.id_fabricante = f2.id"
					+ " WHERE f2.nombre = '"+nombre+"')";
			
			String consulta = "SELECT p.nombre, p.precio, f.nombre as fab FROM producto p INNER JOIN fabricante f ON p.id_fabricante = f.id WHERE p.precio >= "+subconsulta+";";
			
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += "producto: "+rs.getString("p.nombre")+"y precio: "+rs.getString("p.precio")+". Fabricante: "+rs.getString("fab")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_3(String nombre) {
		
		String salida = "";
		
		try {
			
			// 3- Lista el nombre del producto más caro de un fabricante indicado por teclado.
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String subconsulta = "(SELECT MAX(p2.precio) "
					+ "FROM producto p2 INNER JOIN fabricante f2 ON p2.id_fabricante = f2.id"
					+ " WHERE f2.nombre = '"+nombre+"')";
			
			String consulta = "SELECT p.nombre "
					+ "FROM producto p INNER JOIN fabricante f ON p.id_fabricante = f.id"
					+ " WHERE f.nombre = '"+nombre+"'"
					+ " AND p.precio = "+subconsulta+";";
			
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="El producto mas caro de "+nombre+" es: "+ rs.getString("p.nombre");
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_4(String nombre) {
		
		String salida = "";
		
		try {
			
			// 4- Lista el nombre del producto más barato de un fabricante indicado por teclado.
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String subconsulta = "(SELECT MIN(p2.precio) "
					+ "FROM producto p2 INNER JOIN fabricante f2 ON p2.id_fabricante = f2.id"
					+ " WHERE f2.nombre = '"+nombre+"')";
			
			String consulta = "SELECT p.nombre "
					+ "FROM producto p INNER JOIN fabricante f ON p.id_fabricante = f.id"
					+ " WHERE f.nombre = '"+nombre+"'"
					+ " AND p.precio = "+subconsulta+";";
			
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += rs.getString("total");
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_5(String nombre) {
		
		// 5- Devuelve todos los productos de la base de datos que tienen un precio mayor o igual al producto más caro de un fabricante indicado por teclado.
		
		String salida = "";
		
		try {
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String subconsulta = "(SELECT MAX(p2.precio) "
					+ "FROM producto p2 INNER JOIN fabricante f2 ON p2.id_fabricante = f2.id"
					+ " WHERE f2.nombre = '"+nombre+"')";
			
			String consulta = "SELECT p.nombre "
					+ "FROM producto"
					+ " WHERE p.precio >= "+subconsulta+";";
			
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += rs.getString("total");
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_6() {
		
		// 6- Lista todos los productos de un fabricante indicado por teclado que tienen un precio superior al precio medio de todos sus productos de ese mismo fabricante.
		
		String salida = "";
		
		try {

			

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_7(String ciudad) {
		
		//7- Muestra el producto más caro que existe en la tabla producto sin hacer uso de MAX, ORDER BY ni LIMIT.
		
		String salida = "";
		
		try {
			
			String consulta = "SELECT p.nombre, p.precio FROM producto p WHERE p.precio >= ALL(SELECT p2.precio FROM producto p2);";

			

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_8() {
		
		// 8- Muestra el producto más barato que existe en la tabla producto sin hacer uso de MIN, ORDER BY ni LIMIT.
		
		String salida = "";
		
		try {

			String consulta = "SELECT p.nombre, p.precio FROM producto p WHERE p.precio <= ALL(SELECT p2.precio FROM producto p2);";

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_9() {
		
		// 9- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando ALL o ANY).
		
		String salida = "";
		
		try {

			String consulta = "select nombre from fabricante where id = ANY(select distinct(p.id_fabricante) from producto p)";

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_10() {
		
		// 10- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando ALL o ANY).
		
		String salida = "";
		
		try {

			String consulta = "select nombre from fabricante where id != ALL(select distinct(p.id_fabricante) from producto p)";
			
		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_11() {
		
		// 11- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
		
		String salida = "";
		
		try {

			String consulta = "select nombre from fabricante where id IN(select distinct(p.id_fabricante) from producto p)";

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_12() {
		
		// 12- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
		
		String salida = "";
		
		try {

			String consulta = "select nombre from fabricante where id NOT IN(select distinct(p.id_fabricante) from producto p)";

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
}