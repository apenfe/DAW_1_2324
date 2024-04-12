import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO{
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "r2d2.iescierva.net";
	private static final String PORT = "6033";
	private static final String DATABASE = "jardineria";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "jardineria";
	private static final String PASS = "jardineria";
	
	public String consulta_1() {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT codigo_empleado FROM empleado ORDER BY codigo_empleado DESC LIMIT 1;";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida += rs.getString("codigo_empleado");
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_2() {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT pais, COUNT(*) AS total_clientes FROM cliente GROUP BY pais;";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Pais: "+ rs.getString("pais")+", nº clientes: "+rs.getString("total_clientes")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_3(int year) {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT AVG(total) AS media FROM pago WHERE YEAR(fecha_pago)= "+year+";";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Media del "+year+": "+ rs.getString("media")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_4() {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT estado, COUNT(*) AS total FROM pedido GROUP BY estado;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Estado del pedido: "+ rs.getString("estado")+", cantidad: "+rs.getString("total")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_5() {
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT MAX(precio_venta) as maximo, MIN(precio_venta) AS minimo FROM producto;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="El producto mas caro cuesta: "+ rs.getString("maximo")+" euros. El mas barato: "+rs.getString("minimo")+" euros.\n";
				
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
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT COUNT(*) as cuenta FROM cliente;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="El total de clientes es: "+ rs.getString("cuenta")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_7(String ciudad) {
		
		// 7- Cantidad total de clientes de una determinada ciudad (pedir ciudad por teclado)
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT COUNT(*) as cuenta FROM cliente WHERE ciudad = '"+ciudad+"';";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="El total de clientes en la ciudad de "+ciudad+" es: "+ rs.getString("cuenta")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_8() {
		
		// 8- Mostrar todos los representantes con su cantidad de clientes
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT COUNT(*) as cuenta FROM cliente WHERE ciudad = '"+ciudad+"';";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="El total de clientes en la ciudad de "+ciudad+" es: "+ rs.getString("cuenta")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_10() {
		
		// 10- Mostrar  nombre completo de clientes y las fechas de su primer y último pago realizado
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT nombre_contacto, MAX(fecha_pago) as ultima, MIN(fecha_pago) as primera FROM pago p INNER JOIN cliente c ON p.codigo_cliente = c.codigo_cliente GROUP BY p.codigo_cliente;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Cliente: "+ rs.getString("nombre_contacto")+". Primer pago en: "+rs.getString("primera")+" y ultimo pago en: "+rs.getString("ultima")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
}