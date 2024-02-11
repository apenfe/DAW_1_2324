package Ejercicios_extra;

/*
 * Binario
 */

public class Binario{
	
	public static void main(String[] args) {
		
		String[] validar = {"0010111001","00200011100","00000000",};
		
		String regex = "^[0-1]+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es BINARIO");
				
			}else {
				
				System.out.println("NO es BINARIO");				
			}
			
		}
		
	}
		
}