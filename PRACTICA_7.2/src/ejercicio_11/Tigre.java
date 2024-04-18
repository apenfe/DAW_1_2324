package ejercicio_11;

public class Tigre extends Animal{
	
	public Tigre(int edad, String sexo, String nombre) {
		
		super.setEdad(edad);
		super.setSexo(sexo);
		super.setNombre(nombre);
		
	}

	@Override
	public String sonidoCaracteristico() {
		
		return "Grrrrr";
		
	}

	@Override
	public String toString() {
		
		return "Tigre: "+super.toString()+" sonido: "+sonidoCaracteristico();
		
	}
	
}