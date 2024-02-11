package Ejercicios_extra;

/*
 * email
 * 
 */

public class Email{
	
	public static void main(String[] args) {
		
		String[] validar = {"adrian1414@hotmail.es","adian.penalver@searide.shipyard.es"};
		
		String regex = "^(\\w+\\.)*(\\w+){1}@(\\w+\\.)*(\\w+\\.[a-z]{2,3}){1}$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es email");
				
			}else {
				
				System.out.println("NO es email");				
			}
			
		}
		
	}
		
}