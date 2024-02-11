/*
 * Dado un numero, mostrar todos sun numeros divisores
 */

package UDEMY;

public class Ejemplo18{
	public static void main(String[] args) {
		int num=20;
		
		System.out.println("Los numeros divisibles de "+num+" son: "+divisores(num));
	}
	
	public static String divisores(int num) {
		
		String divisores="";
		
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				divisores+=i+", ";
			}
		}
		
		return divisores;
	}
}
