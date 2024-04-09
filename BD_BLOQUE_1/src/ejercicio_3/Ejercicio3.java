package ejercicio_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3{
	
	/*
	 * Ejercicio 3
	 * 
	 * Crea un programa siguiente el patrón de diseño DAO el cual pida al usuario un texto al usuario para obtener 
	 * de base de datos el nombre, el precio y el fabricante de aquellos productos que contengan el texto pasado 
	 * por parámetro en el nombre del producto.
	 * 
	 * Los datos se deben recoger en un listado de objetos creado de acuerdo a lo que se va a obtener de base de 
	 * datos para devolver dicho listado. El programa deberá mostrar el listado obtenido.
	 * 
	 */
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String DATABASE = "tienda";
	private static final String URL = "jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE;
	private static final String USER = "root";
	private static final String PASS = "1234";
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte el nombre del producto: ");
		String nombre = teclado.nextLine().trim();
		
		ArrayList<Producto> productos = leerProductos(nombre);
		
		for (int i = 0; i < productos.size(); i++) {
			
			System.out.println("Producto ---> "+(i+1)+"\n");
			System.out.println("\tnombre ---> "+productos.get(i).nombre);
			System.out.println("\tprecio ---> "+productos.get(i).precio);
			System.out.println("\tfabricante ---> "+productos.get(i).fabricante);
			System.out.println();
			
		}
		
	}
	
	public static ArrayList<Producto> leerProductos(String nombre) {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();

		try {

			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String consulta = "SELECT p.nombre, precio, f.nombre as fabricante FROM producto p INNER JOIN fabricante f ON p.id_fabricante=f.id WHERE p.nombre like '%"+nombre+"%';";
			ResultSet rs = stmt.executeQuery(consulta);

			while (rs.next()) {
				
				productos.add(new Producto(rs.getString("nombre"),rs.getString("precio"),rs.getString("fabricante")));
				
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
	
	public String nombre;
	public String precio;
	public String fabricante;
	
	public Producto(String nombre, String precio, String fabricante) {
		
		this.nombre=nombre;
		this.precio=precio;
		this.fabricante=fabricante;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}