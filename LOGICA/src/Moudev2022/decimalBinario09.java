package Moudev2022;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class decimalBinario09{
	
	public static void main(String[] args) {
				
		System.out.println(decimalBinario(20));
		
	}
	
	public static String decimalBinario(int decimal) {
		
		String binario="";
		String binario2="";
		
		do {
			
			if(decimal%2==0) {
				binario+=""+0;
				decimal=decimal/2;
				
			}else {
				binario+=""+1;
				decimal=(decimal/2);

			}
			
		}while(decimal>0);
		
		for(int i=binario.length()-1;i>=0;i--) {
			binario2+=binario.charAt(i);
		}
		
		return binario2;
	}

}