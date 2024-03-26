package Ejemplo5;

public class Ejemplo5{
	
	public static void main(String[] args) {
		
		Contacto c = new Contacto("David Munuera","453636","a@a.a","calle desengaño");
		
		boolean resultado = insertarContacto(c);
		
		if(resultado) {
			System.out.println("OK");
		}else {
			System.out.println("error");
		}
		
	}
	
	public static boolean insertarContacto(Contacto c) {
		
		Daw db = new Daw();
		return db.insertarContacto(c);
		
	}
	
}