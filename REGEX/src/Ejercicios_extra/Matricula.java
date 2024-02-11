package Ejercicios_extra;

/*
 * Matricula
 */

public class Matricula{
	
	public static void main(String[] args) {
		
		String[] validar = {"2323XXX","2446LZR","9398GYW",};
		
		String regex = "^[0-9]{4}[A-Z]{3}$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es MATRICULA");
				
			}else {
				
				System.out.println("NO es MATRICULA");				
			}
			
		}
		
	}
		
}