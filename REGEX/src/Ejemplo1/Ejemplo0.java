package Ejemplo1;

public class Ejemplo0 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		System.out.println("\nEjemplo 1:");
		
		char caracteres[] = {'M','u','n','d','o'};
		System.out.println("Array de char");
		
		for(int i = 0; i<caracteres.length;i++) {
			System.out.print(caracteres[i]);
		}
		
		
		
		System.out.println("\n\nCadena de caracteres");
		String cadena = new String (caracteres);
		
		for(int i = 0; i<cadena.length();i++) {
			System.out.print(cadena.charAt(i));
		}
		
		System.out.println("\n\nEjemplo 2:");
		
		System.out.println("Cadena de caracteres 2");
		String cadena2 = new String (caracteres, 2,3);
		
		for(int i = 0; i<cadena2.length();i++) {
			System.out.print(cadena2.charAt(i));
		}
		
		
		
		System.out.println("\n\nEjemplo 3:");
		
		int inicio = 1;
		int cantidad = caracteres.length - inicio;
		System.out.println("Cadena de caracteres 3");
		String cadena3 = new String (caracteres, inicio,cantidad);
		
		for(int i = 0; i<cadena3.length();i++) {
			System.out.print(cadena3.charAt(i));
		}
		
		System.out.println("\n\nFin del programa");
	}
}
