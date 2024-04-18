package ejercicio_11;

public class Rana extends Animal{
	
	public Rana(int edad, String sexo, String nombre) {
		
		super.setEdad(edad);
		super.setSexo(sexo);
		super.setNombre(nombre);
		
	}

	@Override
	public String sonidoCaracteristico() {
		
		return "frog frog";
		
	}

	@Override
	public String toString() {
		
		return "Rana: "+super.toString()+" sonido: "+sonidoCaracteristico();
		
	}
	
}