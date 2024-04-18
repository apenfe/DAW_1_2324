package ejercicio_11;

public class Gatito extends Animal{
	
	public Gatito(int edad, String sexo, String nombre) {
		
		super.setEdad(edad);
		super.setSexo(sexo);
		super.setNombre(nombre);
		
	}

	@Override
	public String sonidoCaracteristico() {
		
		return "miauu";
		
	}

	@Override
	public String toString() {
		
		return "Gatito: "+super.toString()+" sonido: "+sonidoCaracteristico();
		
	}
	
}