/*
 * Dados dos numeros, sacar un numero aleatorio entre ellos
 */

package UDEMY;

public class Ejemplo42{
	
	public static void main (String[] args) {
		
		int num1 = 1;
		int num2 = 4;
		
		System.out.println(aleatorio(num1,num2));
		
	}
	
	public static int aleatorio(int num1, int num2){
		
		int randomseed=0;
		
		int rango = num2-num1+1;
		
		randomseed = (int)(Math.random()*rango)+1;
		
		return randomseed;
	}
	
}