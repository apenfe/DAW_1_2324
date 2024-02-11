package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 


public class Ficheros04{
	
	public static final String PATH= ".\\files\\";
	public static final String FILE= "juegos.txt";
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Juego game = new Juego();
		
		System.out.println("nombre del juego");
		game.nombre=teclado.nextLine();
		
		System.out.println("precio juego");
		game.precio=teclado.nextLine();
		
		System.out.println("comentario juego");
		game.comentario=teclado.nextLine();
		
		String nuevalinea =""+game.nombre+"$"+game.precio+"$"+game.comentario;
		boolean resultado = insertar(nuevalinea);
		
		if(resultado) {
			System.out.println("Nueva linea.");
		}else {
			System.out.println("An error occurred.");
		}
		
		teclado.close();
	}
	
	public static boolean insertar(String juego) {
		
		try {
		      FileWriter myWriter = new FileWriter(PATH+FILE,true);
		      
		      myWriter.write("\n"+juego);
		      myWriter.close();
		      
		    } catch (IOException e) {
		      
		      e.printStackTrace();
		      return false;
		    }
		
		return true;
	}
	

}

class Juego{
	
	public String nombre;
	public String precio;
	public String comentario;
	
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