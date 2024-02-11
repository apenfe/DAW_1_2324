package Ejercicios_extra;

/*
 * Binario
 */

public class Octal{
	
	public static void main(String[] args) {
		
		String[] validar = {"00102371","00200811100","123456700060700",};
		
		String regex = "^[0-7]+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es OCTAL");
				
			}else {
				
				System.out.println("NO es OCTAL");				
			}
			
		}
		
	}
		
}