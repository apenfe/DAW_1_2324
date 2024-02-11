/*
 * Dado un número indicar que tipo de angulo es.
 */

package UDEMY;
import java.util.Scanner;

public class Ejemplo31{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un número: ");
		int num = Integer.parseInt(teclado.nextLine().trim());
		
		System.out.println("Se trata de un ángulo: "+angulo(num));
	}
	
	public static String angulo(int num) {
		
		if(num<=0) {
			
			return "No válido";
			
		}else {
			
			if(num>360) {
				
				while(num>360) {
					num-=360;
				}
				
				if(num==90) {
					return "Recto";
				}else if(num==180) {
					return "Llano";
				}else if(num==360) {
					return "Completo";
				}else if(num<90) {
					return "Agudo";
				}else if(num>90&&num<180) {
					return "Obtuso";
				}else if(num>180&&num<360) {
					return "Concavo";
				}
				
			}else {
				
				if(num==90) {
					return "Recto";
				}else if(num==180) {
					return "Llano";
				}else if(num==360) {
					return "Completo";
				}else if(num<90) {
					return "Agudo";
				}else if(num>90&&num<180) {
					return "Obtuso";
				}else if(num>180&&num<360) {
					return "Concavo";
				}
				
			}
		}
		
		return "";
				
	}
	
}
