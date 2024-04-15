package metodosabstractos;

public abstract class Animal{ // las clases abstractas no permiten crear instancias de ellas, solo existen para que otras clases hereden de ellas
	
	public double peso;
	public String nombre;
	
	public void dormir() {
		
		System.out.println("ZZZZ");
		
	}
	
	// metodo abstracto
	public abstract void sonido();

}