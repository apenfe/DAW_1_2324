package Ejercicios_extra;

/*
 * numero entero positivo o negativo
 */

public class EnteroPositivo{
	
	public static void main(String[] args) {
		
		String[] validar = {"3","-2","234","-2345","as-3","4,5","-4.4444"};
		String regex = "^\\d+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("Es un numero entero positivo");
				
			}else {
				
				System.out.println("NO Es un numero entero positivo");	
				
			}
			
		}
		
	}
		
}