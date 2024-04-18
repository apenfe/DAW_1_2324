package ejercicio_11;

public class Prueba{
	
	public static void main(String[] args) {
		
		Gatito gatito = new Gatito(1, "macho", "coco");
		Gato gato = new Gato(3, "macho", "pichu");
		Perro perro = new Perro(5, "macho", "pitu");
		Rana rana = new Rana(1, "hembra", "ranita");
		Tigre tigre = new Tigre(3, "macho", "sherkam");
		
		System.out.println(gatito.toString());
		System.out.println(gato.toString());
		System.out.println(perro.toString());
		System.out.println(rana.toString());
		System.out.println(tigre.toString());
		
	}
	
}