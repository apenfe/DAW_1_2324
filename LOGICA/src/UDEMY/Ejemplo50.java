/*
 * Dado un numero, devolver cuantos bucles tiene.
 * 
 * ejemplo bucles(28861) devuelve 5
 */

package UDEMY;

public class Ejemplo50{
	
	public static void main (String[] args) {
		
		int numero = 28861;
		
		System.out.println(bucles(numero));
		
	}
	
	public static int bucles(int numero){
		
		String num = ""+numero;
		int cont=0;
		
		for(int i=0; i<num.length();i++) {
			char digito = num.charAt(i);
			
			if(digito -'0'==0) {
				cont++;
			}else if(digito -'0'==4) {
				cont++;
			}else if(digito -'0'==6) {
				cont++;
			}else if(digito -'0'==8) {
				cont+=2;
			}else if(digito -'0'==9) {
				cont++;
			}
		}
		
		return cont;
	}
	
}