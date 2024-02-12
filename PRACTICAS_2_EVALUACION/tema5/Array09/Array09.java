package Array09;

/* Array09.java
 * 
 * Escribe un método que se llame encriptar() que reciba un texto y una clave. Devuelve
 * el texto encriptado en otra cadena. El cifrado debe hacerse aplicando XOR entre cada
 * letra del texto y una letra de la clave, cuando se terminan las letras de la clave
 * vuelve a la primera.
 * 
 * Prueba el método pedido desde main().
 * 
 * Utiliza la longitud de la clave, clave.length(). Para mapear cada carácter del texto a
 * encriptar con un carácter de la clave, calcula el módulo indice % clave.length(). Se puede
 * realizar la operación XOR binaria entre caracteres convirtiéndolos en números de tipo short.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array09{
	
	public static void main(String[] args) {
		
		String texto = "enunciados";
		String clave = "no";
		
		String salida = encriptar(texto,clave);
		
		System.out.println("El texto sin encriptar es: "+texto);
		System.out.println("El texto encriptado es: "+salida);
		
	}
	
	public static String encriptar(String texto, String clave) {
		
		char[] chars = texto.toCharArray();
	    String binarioTexto = "";
	    
	    for(int i = 0;i < chars.length;i++){
	    	
	        int codigo = chars[i];
	        String binario = Integer.toBinaryString(codigo);
	        	
	        binarioTexto+= binario;
	        
	    }
	    
	    chars = clave.toCharArray();
	    String binarioClave = "";
	    
	    for(int i = 0;i < chars.length;i++){
	    	
	        int codigo = chars[i];
	        String binario = Integer.toBinaryString(codigo);
	        	
	        binarioClave+= binario;
	        
	    }
	    
	    String salida = "";
	    
	    int repeticiones = binarioTexto.length()/ binarioClave.length();
	    String key = binarioClave;
	    
	    for (int i = 1; i < repeticiones; i++) {
	    	
	    	binarioClave+=key;
			
		}

		for (int i = 0; i < binarioTexto.length(); i++) {

			if (binarioTexto.charAt(i) == '0' && binarioClave.charAt(i) == '0') {
				salida += "0";
			} else if (binarioTexto.charAt(i) == '0' && binarioClave.charAt(i) == '1') {
				salida += "1";

			} else if (binarioTexto.charAt(i) == '1' && binarioClave.charAt(i) == '0') {
				salida += "1";

			} else if (binarioTexto.charAt(i) == '1' && binarioClave.charAt(i) == '1') {
				salida += "0";

			}

		}

		return salida;

	}

}