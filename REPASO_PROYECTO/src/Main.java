import Classes.Config;
import Classes.Input;
import Classes.Session;

public class Main {
	
	public static Session currentSession = new Session();
	
	public static void main(String[] args) {
		
		System.out.println(Config.VERSION);
		System.out.println(Config.WELCOME);
		
		int opcion = -1;
		
		do {
			
			if(currentSession.isLogged()) {
				
				System.out.println(Config.LOGGED_MENU);
				opcion = Input.getInt("Selecciona una opcion entre 0 y 6: ", true);
				
				if(opcion==0) {
					break;
					
				}else if(opcion ==1) {
					
					System.out.println(Config.SOON);
					
				}else if(opcion ==2) {
					
					System.out.println(Config.SOON);
					
				}else if(opcion ==3) {
					
					System.out.println(Config.SOON);
					
				}else if(opcion ==4) {
					
					System.out.println(Config.SOON);
					
				}else if(opcion ==5) {
					
					currentSession.showUser();
					
				}else if(opcion ==6) {
					
					currentSession.logOut();
					
				}else {
					
					System.out.println("Debe ingresar una opcion entre 0 y 6.");
					
				}
				
			}else {
				
				System.out.println(Config.UNLOGGED_MENU);
				opcion = Input.getInt("Selecciona una opcion entre 0 y 2: ", true);
				
				if(opcion==0) {
					break;
					
				}else if(opcion ==1) {
					
					currentSession.login();
					
				}else if(opcion ==2) {
					
					currentSession.signup();
					
				}else {
					
					System.out.println("Debe ingresar una opcion entre 0 y 2.");
					
				}
				
			}
			
		}while(true);
		
		System.out.println(Config.GOODBYE);
		
	}
}