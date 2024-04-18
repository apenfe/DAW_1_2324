package ejercicio_11;

public class Perro extends Animal{
	
	public Perro(int edad, String sexo, String nombre) {
		
		super.setEdad(edad);
		super.setSexo(sexo);
		super.setNombre(nombre);
		
	}

	@Override
	public String sonidoCaracteristico() {
		
		return "guau guau";
		
	}

	@Override
	public String toString() {
		
		return "Perro: "+super.toString()+" sonido: "+sonidoCaracteristico();
		
	}
	
}