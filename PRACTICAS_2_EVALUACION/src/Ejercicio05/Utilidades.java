package Ejercicio05;

/* 
 * 
 * Utilidades.java
 * APF - 10-01-2024
 * 
 */

public class Utilidades{
	
	public static final int ROTACION = 2;
	
	public static String encripta(String texto) {
		
		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};		
		String cesar ="";
		texto=texto.toLowerCase();
		texto=texto.replaceAll("[^a-z\\s]","");
		
		for(int i=0; i<texto.length();i++) {
			
			int indiceNuevo = ((texto.charAt(i)-alfabeto[0]))+ROTACION;
			
			if(indiceNuevo>alfabeto.length-1) {
				
				int diferencia = indiceNuevo-alfabeto.length;
				indiceNuevo=diferencia;
			}
			
			cesar+= alfabeto[indiceNuevo];
	
		}
		
		return cesar;
	}
	
	
}