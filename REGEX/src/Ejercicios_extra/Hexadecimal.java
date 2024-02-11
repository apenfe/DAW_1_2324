package Ejercicios_extra;

/*
 * Binario
 */

public class Hexadecimal{
	
	public static void main(String[] args) {
		
		String[] validar = {"00F02371","002A0811100","1234567B00F0700",};
		
		String regex = "^[0-9A-F]+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es Hexadecimal");
				
			}else {
				
				System.out.println("NO es Hexadecimal");				
			}
			
		}
		
	}
		
}