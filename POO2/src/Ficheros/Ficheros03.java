package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 


public class Ficheros03{
	
	public static final String PATH= ".\\files\\";
	public static final String FILE= "articulos.txt";
	
	public static void main(String[] args) {
		
		ArrayList<articulo> lista = obtenerArticulos();
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.print("nombre: ");
			System.out.println(lista.get(i).getNombre());
			System.out.print("precio: ");
			System.out.println(lista.get(i).getPrecio());
			System.out.print("comentario: ");
			System.out.println(lista.get(i).getComentario());
			System.out.println();
			
		}
	}
	
	public static ArrayList<articulo> obtenerArticulos() {

		ArrayList<articulo> list = new ArrayList<articulo>();
		
		try {

			File myObj = new File(PATH + FILE);
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] campos = data.split("@");
				
				articulo actual = new articulo();
				actual.setNombre(campos[0]);
				actual.setPrecio(campos[1]);
				actual.setComentario(campos[2]);
				
				list.add(actual);
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return list;
	}
}

class articulo{
	
	private String nombre;
	private String precio;
	private String comentario;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getPrecio() {
		return this.precio;
	}
	
	public String getComentario() {
		return this.comentario;
	}
	
	public void setComentario(String text) {
		 this.comentario = text;
	}
	
	public void setPrecio(String text) {
		 this.precio = text;
	}
	
	public void setNombre(String text) {
		 this.nombre = text;
	}
}