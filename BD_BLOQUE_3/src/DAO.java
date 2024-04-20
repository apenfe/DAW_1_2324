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

			String consulta = "SELECT count(*) as total FROM empleado;";
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
			
			String consulta = "SELECT CONCAT(nombre,\" \",apellido1,\" \",apellido2) AS nombreCompleto, COUNT(cliente.codigo_cliente) AS cantidad"
					+ " FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas"
					+ " WHERE empleado.puesto = 'representante ventas' GROUP BY empleado.codigo_empleado;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="REPRESENTANTE: "+rs.getString("nombreCompleto")+". TOTAL CLIENTES: "+ rs.getString("cantidad")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_9() {
		
		// 9- Mostrar cantidad de clientes sin representante de ventas
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT COUNT(cliente.codigo_cliente) AS cantidad "
					+ "FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas"
					+ " WHERE empleado.puesto != 'representante ventas';";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="TOTAL CLIENTES SIN REPRESENTANTES: "+ rs.getString("cantidad")+".\n";
				
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
	
	public String consulta_11() {
		
		// 11- Cantidad de productos diferentes en cada uno de los pedidos (mostrar también la información del pedido)
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.fecha_pedido, p.estado, COUNT(dp.codigo_producto) AS productos "
					+ "FROM pedido p INNER JOIN detalle_pedido dp ON dp.codigo_pedido = p.codigo_pedido "
					+ "GROUP BY p.codigo_pedido;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Fecha pedido: "+ rs.getString("p.fecha_pedido")+". Detalle: "+rs.getString("p.estado")+". Cantidad de productos diferentes: "+rs.getString("productos")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_12() {
		
		// 12 ---> Mostrar información de cada pedido junto con el importe total (sumar importes de cada uno de los productos del pedido)
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.codigo_pedido, p.fecha_pedido, p.estado, SUM(dp.cantidad*dp.precio_unidad) AS total"
					+ " FROM pedido p INNER JOIN detalle_pedido dp ON dp.codigo_pedido = p.codigo_pedido"
					+ " GROUP BY p.codigo_pedido;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Pedido: "+ rs.getString("p.codigo_pedido")+". Fecha: "+rs.getString("p.fecha_pedido")+". Estado ---> "+rs.getString("p.estado")+". Importe = "+rs.getString("total")+"\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_13() {
		
		// 13 ---> Los 20 productos más vendidos (mostrar el total de unidades vendidas y los resultados ordenados de mayor a menor unidades vendidas)
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.codigo_producto, p.nombre, SUM(dp.cantidad) AS cantidadVentas "
					+ "FROM producto p INNER JOIN detalle_pedido dp ON dp.codigo_producto = p.codigo_producto "
					+ "GROUP BY dp.codigo_producto ORDER BY cantidadVentas DESC LIMIT 20;";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Producto codigo: "+ rs.getString("p.codigo_producto")+". Nombre: "+rs.getString("p.nombre")+" Cantidad de ventas ---> "+rs.getString("cantidadVentas")+".\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta";
			
		}
		
		return salida;
		
	}
	
	public String consulta_14() { ///////////////////
		
		// 14- Facturación total de la empresa (mostrar la base imponible, el IVA y el total facturado. La base imponible se calcula sumando 
		// el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el 
		// total la suma de los dos campos anteriores)
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.codigo, p.nombre, SUM(dp.cantidad) AS cantidadVentas "
					+ "FROM producto p INNER JOIN detalle_pedido dp ON dp.codigo_producto = p.codigo_producto "
					+ "GROUP BY dp.codigo_producto ORDER BY cantidadVentas DESC LIMIT 20;";

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
	
	public String consulta_15(double cantidad) {
		
		// 15- Ventas totales de los productos que facturen más de cierta cantidad (pedir cantidad por teclado. 
		// Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA))
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT p.nombre, COUNT(dp.cantidad) AS total, SUM(dp.cantidad*dp.precio_unidad) AS facturado, SUM(dp.cantidad*dp.precio_unidad)*1.21 AS facturado_impuestos "
				    + "FROM producto p INNER JOIN detalle_pedido dp ON dp.codigo_producto = p.codigo_producto "
				    + "GROUP BY dp.codigo_producto "
				    + "HAVING SUM(dp.cantidad*dp.precio_unidad)*1.21 >= " + cantidad + ";";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Producto: "+ rs.getString("p.nombre")+". Unidades vendidas: "+rs.getString("total")+". Facturado: "+rs.getString("facturado")+"€, con impuestos: "+rs.getString("facturado_impuestos")+"€.\n";
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {

			salida += "error en consulta: "+e;
			
		}
		
		return salida;
		
	}
	
	public String consulta_16() {
		
		// 16- Suma total de todos los pagos realizados agrupados por año.
		
		String salida = "";
		
		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			String consulta = "SELECT YEAR(fecha_pago) as year, SUM(total) AS total_pagos FROM pago GROUP BY YEAR(fecha_pago);";

			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				salida +="Año: "+ rs.getString("year")+". total pagos ese año: "+rs.getString("total_pagos")+".\n";
				
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