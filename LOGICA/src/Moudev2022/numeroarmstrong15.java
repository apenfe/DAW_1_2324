package Moudev2022;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

public class numeroarmstrong15{
	
	public static void main(String[] args) {
		
		int num = 8208;
		
		if(numeroArmstrong(num)) {
			System.out.println("Es un numero de armstrong.");
		}else {
			System.out.println("NO es un numero de armstrong.");
		}
		
	}
	
	public static boolean numeroArmstrong(int num) {
		
		String numero=""+num;
		int suma=0;
		
		for(int i=0; i<numero.length();i++) {
			suma+=(int)Math.pow(numero.charAt(i)-'0', numero.length());
		}
		
		if(suma==num) {
			return true;
		}else {
			return false;
		}
		
	}

}