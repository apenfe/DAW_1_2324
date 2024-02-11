/*
 * Dado un texto o array, devolver el valor o elemento que mas veces se repite
 */

package UDEMY;

public class Ejemplo37{
	public static void main (String[] args) {
		
		String texto = "victor robles victor es victor";
		int[] enteros = {2,5,1,2,2};
		
		System.out.println("La palabra mas comun es: "+palabra(texto));
		System.out.println("El número más común es: "+entero(enteros));		
	}
	
	public static int entero(int[] enteros){
		
		int suma=0, maximo=0, moda=0;
		
		for (int i = 0; i < enteros.length; i++) {
			for(int j=0; j<enteros.length;j++) {
				
				if(enteros[i]==enteros[j]) {
					suma++;
				}
			}
			
			if(suma>maximo) {
				maximo=suma;
				moda=enteros[i];
			}
			
			suma=0;
		}
		
		
		return moda;
	}
	
	public static String palabra(String texto){
		
		String[] palabras=new String[0];
		
		palabras=texto.trim().toLowerCase().split(" ");
		
		String moda="";
		
		int suma=0, maximo=0;
		
		for (int i = 0; i < palabras.length; i++) {
			for(int j=0; j<palabras.length;j++) {
				if(palabras[i]==palabras[j]) {
					suma++;
				}
			}
			
			if(suma>maximo) {
				maximo=suma;
				moda=palabras[i];
			}
			
			suma=0;
		}
		
		return moda;
	}
	
}