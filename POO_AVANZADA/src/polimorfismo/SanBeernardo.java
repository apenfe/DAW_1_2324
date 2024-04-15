package polimorfismo;

public class SanBeernardo extends Perro{
	
	public String pelaje;

	public SanBeernardo(String nombre, int edad, String genero, String pelaje) {
		super(nombre, edad, genero);
		this.pelaje = pelaje;
	}
	
	public void ladrar() {
		
		System.out.println("WOOOOFFF");
		
	}

}