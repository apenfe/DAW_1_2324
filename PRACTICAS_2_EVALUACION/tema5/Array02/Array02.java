package Array02;

/* Array02.java
 * 
 * Escribe un método que se llame parentesisCorrectos() que recibe una cadenas de texto que contiene
 * una expresión aritmética en la que hay que comprobar que los paréntesis están bien emparejados.
 * Devuelve verdadero o falso.
 * 
 * Ejemplo:
 * 
 * Expresión: ((a + b) / 5-d)
 * Daría: true
 * 
 * Expresión: )(a + b))
 * Daría: false
 * 
 * Prueba el método pedido desde main().
 * 
 * Utiliza un contador para los paréntesis: Cuando se abre un paréntesis incrementa un contador, cuando
 * se cierra se decrementa. Al final el contador debe valer 0; en cualquier otro caso la expresión es incorrecta.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array02{
	
	public static void main(String[] args) {
		
		String texto = "((a + b) / 5-d)";
		String texto2 = ")(a + b))";
		
		if(parentesisCorrectos(texto)) {
			
			System.out.println("La expresion: "+texto+" es CORRECTA.");
			
		}else {
			
			System.out.println("La expresion: "+texto+" es INCORRECTA.");
			
		}
		
		if(parentesisCorrectos(texto2)) {
			
			System.out.println("La expresion: "+texto2+" es CORRECTA.");
			
		}else {
			
			System.out.println("La expresion: "+texto2+" es INCORRECTA.");
			
		}
		
	}
	
	public static boolean parentesisCorrectos(String texto) {
		
		int contabrir=0, contcerrar=0;
		
		texto=texto.replaceAll("[^()]","");
		
		for(int i=0; i<texto.length();i++) {
			
			if(texto.charAt(i)=='(') {
				contabrir++;
			}else {
				contcerrar++;
			}
		}
		
		if(contabrir-contcerrar==0) {
			return true;
		}else if(contabrir-contcerrar>0) {
			System.out.print("Hay mas parentesis abriendose que cerrandose. ");
		}else {
			System.out.print("Hay mas parentesis cerrandose que abriendose. ");
		}
		
		return false;
	}
	
}