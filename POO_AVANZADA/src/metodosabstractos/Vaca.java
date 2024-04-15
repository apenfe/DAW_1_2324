package metodosabstractos;

public class Vaca extends Animal{ // las clases abstractas no permiten crear instancias de ellas, solo existen para que otras clases hereden de ellas
	
	public String raza;
	
	public void dormir() {
		
		System.out.println("ZZZZ");
		
	}
	
	// metodo abstracto
	
	public void sonido() {
		
		System.out.println("Muuuuu");
		
	}
	

}