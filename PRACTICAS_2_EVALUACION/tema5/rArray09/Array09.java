package rArray09;

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
		
		
		
		String texto = "enunciado con algunos carcateres raros son los siguientes: 4·$%&//()='¿ó";
		String clave = "4 r%_34P";
		
		String salida = encriptarV2(texto,clave);
		
		System.out.println("El texto sin encriptar es: "+texto);
		System.out.println("El texto encriptado es: "+salida);
		
	}
	
	public static String encriptar(String texto, String clave) {
		
	    String binarioTexto = "", binarioClave = "", salida = "";
	    
	    for(int i = 0;i < texto.length();i++){
	    	
	    	int longitud = Integer.toBinaryString((int)texto.charAt(i)).length();
	    	
	    	if(longitud<7) {
	    		
	    		String binario = "0";
	    		binario += Integer.toBinaryString((int)texto.charAt(i));	
		        binarioTexto+= binario;
	    		
	    	}else {
	    		
	    		String binario = Integer.toBinaryString((int)texto.charAt(i));	
		        binarioTexto+= binario;
	    		
	    	}
	        
	    }
	    
	    for(int i = 0;i < clave.length();i++){
	    	
	    	int longitud = Integer.toBinaryString((int)clave.charAt(i)).length();
	    	
	    	if(longitud<7) {
	    		
	    		String binario = "0";
	    		binario += Integer.toBinaryString((int)clave.charAt(i));	
		        binarioClave+= binario;
	    		
	    	}else {
	    		
	    		String binario = Integer.toBinaryString((int)clave.charAt(i));	
		        binarioClave+= binario;
		        
	    	}
	        
	    }
	    	    
	    int repeticiones = binarioTexto.length()/ binarioClave.length();
	    String key = binarioClave;
	    
	    for (int i = 0; i < repeticiones; i++) {
	    	
	    	binarioClave+=key;
			
		}

		for (int i = 0; i < binarioTexto.length(); i++) {

			boolean keys = false, text =false, sol=false;
			
			if(binarioTexto.charAt(i)=='1') {
				text=true;
			}
			
			if(binarioClave.charAt(i)=='1') {
				keys=true;
			}
			
			sol=keys^text;
			
			if(sol) {
				salida+="1";
			}else {
				salida+="0";
			}
			
		}

		return salida;

	}
	
	public static String encriptarV2(String texto, String clave) {
		
		String encriptado = "";
		
		int longitud = clave.length();
		int j=0;
		
		for (int i = 0; i < texto.length(); i++) {
			encriptado += texto.charAt(i)^clave.charAt(j);
			j++;
			
			if(j>=longitud) {
				j=0;
			}
			
		}

		return encriptado;

	}

}