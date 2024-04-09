package ejercicio_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ejercicio1{
	
	/*
	 * Ejercicio 1
	 * 
	 * Crea un programa siguiendo el patrón de diseño DAO el cual recupere de base de datos el 
	 * listado de nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD). 
	 * Utiliza los siguientes alias para las columnas: nombre, euros, dolares.
	 * 
	 * Los datos se deben recoger en un listado de objetos creado de acuerdo a lo que se va a obtener de base 
	 * de datos para devolver dicho listado. El programa deberá mostrar el listado obtenido.
	 * 
	 * Nota: Actualmente, 1 euro equivale a 1,08 dólares.
	 * 
	 */
	/*
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "r2d2.iescierva.net";
	private static final String PORT = "6033";
	private static final String DATABASE = "tienda";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "tienda";
	private static final String PASS = "tienda";
	*/
	//
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String DATABASE = "tienda";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	public static void main(String[] args) {
		
		ArrayList<Producto> productos = leerProductos();
		
		for (int i = 0; i < productos.size(); i++) {
			
			System.out.println("Producto ---> "+(i+1)+"\n");
			System.out.println("nombre ---> "+productos.get(i).nombre+"\n");
			System.out.println("euros ---> "+productos.get(i).euros+"\n");
			System.out.println("dolares ---> "+productos.get(i).dolares+"\n");
			System.out.println();
			
		}
		
	}
	
	public static ArrayList<Producto> leerProductos() {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();

		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT nombre, precio as euros, precio*1.08 as dolares FROM producto;";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				productos.add(new Producto(rs.getString("nombre"),rs.getString("euros"),rs.getString("dolares")));
				
			}

			rs.close();
			stmt.close();
			conn.close();
			
			return productos;

		} catch (Exception e) {

			return null;
			
		}
		
	}
	
}

class Producto{
	
	public String euros;
	public String dolares;
	public String nombre;
	
	public Producto(String nombre, String euros, String dolares) {
		
		this.euros=euros;
		this.dolares=dolares;
		this.nombre=nombre;
		
	}

	public String getEuros() {
		return euros;
	}

	public void setEuros(String euros) {
		this.euros = euros;
	}

	public String getDolares() {
		return dolares;
	}

	public void setDolares(String dolares) {
		this.dolares = dolares;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
