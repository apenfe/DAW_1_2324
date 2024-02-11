package Ejercicios_extra;

/*
 * Fecha dd/mm/yyyy
 */

public class Fecha{
	
	public static void main(String[] args) {
		
		int x = 3;
		
		String[] validar = {"32/2/1994","0/05/1995","2/13/1994"};
		
		String regex = "^(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|1[012])/(19|20)\\d{2}$";
		
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