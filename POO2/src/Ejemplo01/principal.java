package Ejemplo01;

public class principal{	
	public static void main(String[] args) {
	
		Persona p1 = new Persona();
		
		p1.nombre="David";
		p1.apellido="Munuera";
		
		Persona p2 = new Persona();
		
		p2.nombre="Jesus";
		p2.apellido="Gil";
		
		System.out.println(p1.nombre+" "+p1.apellido);
		System.out.println(p2.nombre+" "+p2.apellido);
	}
}