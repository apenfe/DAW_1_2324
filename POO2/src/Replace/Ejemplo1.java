package Replace;

public class Ejemplo1{
	
	public static void main(String[] args) {
		
		String texto = "Hola este es un texto de ejemplo para este ejercicio";
		String texto2 = "Cuidado con el PSOE y la AMNISTIA";
		
		String resultado = reemplazarTexto(texto);
		System.out.println("El texto procesado es: "+resultado);
		
		String resultado2 = reemplazarTexto2(texto2);
		System.out.println("El texto procesado es: "+resultado2);
		
	}
	
	public static String reemplazarTexto(String texto) {
		String buscar = "Hola";
		String reemplazar = "Adios";
		texto=texto.replaceAll(buscar,reemplazar);
		
		return texto;
		
	}
	
	public static String reemplazarTexto2(String texto) {
		
		String buscar = "PSOE#AMNISTIA";
		String[] terminos = buscar.split("#");
		String reemplazar = "***";
		
		for (int i = 0; i < terminos.length; i++) {
			texto=texto.replaceAll(terminos[i],reemplazar);
		}
		
		return texto;
		
	}
	
}