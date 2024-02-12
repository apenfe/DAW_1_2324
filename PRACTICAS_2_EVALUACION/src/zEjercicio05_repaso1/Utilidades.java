package zEjercicio05_repaso1;

/* 
 * 
 * Utilidades.java
 * APF - 10-01-2024
 * 
 */

public class Utilidades{
	
	public static final int ROTACION = 3;
	
	public static String encripta(String texto) {
		
		String encriptado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			
			int codigo = (int) texto.charAt(i);
			
			codigo+=ROTACION;
			
			if(codigo>127) {
				
				codigo=32+(codigo-127);

			}
			
			encriptado+=(char) codigo;
			
		}
		
		return encriptado;
		
	}
	
	public static String desencripta(String texto) {
		
		String desencriptado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			
			int codigo = (int) texto.charAt(i);
			
			codigo-=ROTACION;
			
			if(codigo<32) {
				
				codigo=127+(codigo-32);

			}
			
			desencriptado+=(char) codigo;
			
		}
		
		return desencriptado;
		
	}
	
	
}