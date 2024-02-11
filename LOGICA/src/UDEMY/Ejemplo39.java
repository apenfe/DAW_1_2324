/*
 * Dado un texto, comprobar que sea un email valido
 */

package UDEMY;

public class Ejemplo39{
	
	public static void main (String[] args) {
		
		String email = "adrian1414@hotmail.es";
		
		if(email(email)) {
			System.out.println("Email valido.");
		}else {
			System.out.println("Email no valido.");
		}
	}
	
	public static boolean email(String email){
			
			String[] emailcut = email.split("@");
				
			if(emailcut.length==2) {
				
				String[] emailcut2 = emailcut[1].split("\\.");
	
				if(emailcut2.length==2) {
							
					return true;
					
				}		
			}
		
		return false;
		
	}
	
}