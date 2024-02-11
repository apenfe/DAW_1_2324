package Ejercicios_extra;

/*
 * IP
 */

public class IP{
	
	public static void main(String[] args) {
		
		String[] validar = {"10.255.255.255","127.0.0.1","0.0.0.0","255.155.255.255","4865484PT5","234","-4.4444","48654484P",};
		
		String regex = "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es IP");
				
			}else {
				
				System.out.println("NO es IP");				
			}
			
		}
		
	}
		
}