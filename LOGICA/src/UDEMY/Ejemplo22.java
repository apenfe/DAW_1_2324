/*
 * Dados dos numeros, decir cual es el mayor y cual es el menor
 */

package UDEMY;

public class Ejemplo22{
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 7;
		
		System.out.println(compara(num1,num2));
	}
	
	public static String compara(int num1, int num2) {
		
		String text="";
		
		if(num1<num2) {
			text+="el número "+num1+" es menor que "+num2;
		}else if(num1>num2){
			text+="el número "+num2+" es menor que "+num1;
		}else {
			text+="el número "+num1+" es igual que "+num2;
		}

		return text;
	}
}