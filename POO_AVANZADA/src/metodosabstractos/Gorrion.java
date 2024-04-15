package metodosabstractos;

public class Gorrion extends Animal{ // las clases abstractas no permiten crear instancias de ellas, solo existen para que otras clases hereden de ellas
	
	public String color;
	
	public void dormir() {
		
		System.out.println("ZZZZ");
		
	}
	
	// metodo abstracto
	
	public void sonido() {
		
		System.out.println("Pio Pio");
		
	}
	

}