package Ejercicios_extra;

/*
 * Numero real
 */

public class Real{
	
	public static void main(String[] args) {
		
		String[] validar = {"4,555","-4,5811100","6"};
		
		String regex = "^-?[0-9]+([\\.,][0-9]+)?$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es Real");
				
			}else {
				
				System.out.println("NO es Real");				
			}
			
		}
		
	}
		
}