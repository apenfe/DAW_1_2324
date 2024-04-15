package polimorfismo;

public class Perro{
	
	public String nombre;
	public int edad;
	public String genero;
	
	public Perro(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public void mear() {
		
		System.out.println("pssss");
	}
	
	public void dormir() {
		System.out.println("zzzz");
	}
	
	public void ladrar() {
		System.out.println("guau");
	}
}