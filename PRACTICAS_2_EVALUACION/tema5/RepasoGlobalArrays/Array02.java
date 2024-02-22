package RepasoGlobalArrays;

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
		String texto1 = ")(a + b))";
		
		parentesisCorrectos(texto);
		parentesisCorrectos(texto1);
		
	}
	
	public static void parentesisCorrectos(String texto) {
		
		int cont =0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			if(texto.charAt(i)=='(') {
				
				cont++;
				
			}else if(texto.charAt(i)==')') {
				
				cont--;
				
			}
			
		}
		
		if(cont==0) {
			System.out.println("Bien");
		}else {
			System.out.println("Mal");

		}
		
	}
	
}