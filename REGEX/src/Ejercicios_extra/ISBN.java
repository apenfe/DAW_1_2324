package Ejercicios_extra;

/*
 * email
 * 
 */

public class ISBN{
	
	public static void main(String[] args) {
		
		String[] validar = {"979-84-08-06960-7","978-84-08-16769-9"};
		
		String regex = "^(979|978)-\\d{2}-\\d{2}-\\d{5}-\\d{1}$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es ISBN");
				
			}else {
				
				System.out.println("NO es ISBN");				
			}
			
		}
		
	}
		
}