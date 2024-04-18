package ejercicio_11;

public class Gato extends Animal{
	
	public Gato(int edad, String sexo, String nombre) {
		
		super.setEdad(edad);
		super.setSexo(sexo);
		super.setNombre(nombre);
		
	}

	@Override
	public String sonidoCaracteristico() {
		
		return "Maauuu";
		
	}

	@Override
	public String toString() {
		
		return "Gato: "+super.toString()+" sonido: "+sonidoCaracteristico();
		
	}
	
}