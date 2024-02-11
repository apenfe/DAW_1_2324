package Ejercicios_extra;

/*
 * email
 * 
 */

public class Instagram{
	
	public static void main(String[] args) {
		
		String[] validar = {"@potus","@apenfe_01"};
		
		String regex = "^@[\\w-]+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es instagram");
				
			}else {
				
				System.out.println("NO es instagram");				
			}
			
		}
		
	}
		
}