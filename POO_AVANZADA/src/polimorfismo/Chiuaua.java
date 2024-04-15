package polimorfismo;

public class Chiuaua extends Perro{
	
	public double ratio;

	public Chiuaua(String nombre, int edad, String genero, double ratio) {
		
		super(nombre, edad, genero);
		this.ratio = ratio;
		
	}
	
	public void ladrar() {
		
		System.out.println("WAAAAA!!");
		
	}

}