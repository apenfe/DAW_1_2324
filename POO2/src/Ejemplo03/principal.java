package Ejemplo03;
import Static.Entrada;

public class principal{	
	public static void main(String[] args) {
		
		String nombre = Entrada.pedirTexto("Introduce tu nombre: ");
	
		Persona p1 = new Persona(nombre,"Munuera");
		
		Persona p2 = new Persona();
		
		System.out.println(p1.nombreCompleto());
		System.out.println(p2.apellidosNombre());
		
	}
}