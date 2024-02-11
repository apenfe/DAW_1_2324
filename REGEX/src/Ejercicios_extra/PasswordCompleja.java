package Ejercicios_extra;

/*
 * contraseña sencilla
 */

public class PasswordCompleja{
	
	public static void main(String[] args) {
		
		String[] validar = {"3Aa-22e22","-2","234","-2345","as-3","4,5","-4.4444"};
		String regex = "[[A-Z]+[a-z]+[0-9]+[\\$\\*\\-\\+\\!\\?]+]{8,}";
		String regex1 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*\\-+!?]).{8,}$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex1)) {
				
				System.out.println("OK");
				
			}else {
				
				System.out.println("FAIL");	
				
			}
			
		}
		
	}
		
}