package Ejercicios_extra;

/*
 * DNI
 */

public class DNI{
	
	public static void main(String[] args) {
		
		String[] validar = {"3","48654484p","4865484P","486545484P","4865484P5","234","-4.4444","48654484P",};
		String regex = "^\\d{8}[A-Za-z]{1}$";
		String regex1 = "^\\d{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$";

		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es DNI");
				
			}else {
				
				System.out.println("NO es DNI");				
			}
			
		}
		
	}
		
}