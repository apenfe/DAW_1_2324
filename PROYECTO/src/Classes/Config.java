package Classes;

/* 
 * Config.java
 * 
 * Se trata de una clase que contiene atributos estáticos que corresponden
 * a la configuración del programa, los cuales son:
 * 
 * VERSION: "Número de versión del programa"
 * WELCOME "Mensaje de bienvenida al programa, con un título y descripción
 * GOODBYE: "Mensaje de finalización del programa"
 * UNLOGGED_MENU: "Cadena de texto que contiene todo el menú de opciones para cuando no se ha iniciado sesión"
 * LOGGED_MENU: "Cadena de texto que contiene todo el menú de opciones para cuando se ha iniciado sesión"
 * LOGIN: "Cadena de texto que se usa como rotulo al iniciar sesión"
 * SIGNUP: "Cadena de texto que se usa como rotulo al registrarse"
 * USER: "Cadena de texto que se usa como rotulo al mostrar usuario"
 * LOGOUT: "Cadena de texto que se usa como rotulo al cerrar sesión"
 * EXIT: "Cadena de texto que se usa como rotulo al salir del programa"
 * SOON: "Cadena de texto que se usa como rotulo en las secciones incompletas"
 * 
 * Además también incluye varios metodos estáticos para poder hacer comprobaciones de tipos de datos.
 * 
 * APF - 21-12-2023
 * VERSION: 0.1.0
 * 
 */

public class Config{
	
	/* LISTADO DE ATRIBUTOS ESTATICOS */
	
	public static final String VERSION = "✅ -- Version: 0.1.0 --";
	public static final String WELCOME ="\n          \\r                                        BIENVENIDO A ARIADNE-SOFT.\n"
			+ "      %@@,...#@@.\n   (@            #@\n  &*     @.        @.\n ,&     *@. &,     ,@\n  @      @  &,     /&                                       .#&@@@%*\n  *@              /&                                     &@          #@.\n    %@.         #@  %@(       *@@&&&@@&.               /&     @@@&     /@\n        (&@@&#.         #@((@           ,@.           .@      @@@*      (%\n                          @.      /@/     (&          ,@         (*     *&           &@@@@@@@#\n                         @/      @ #/      %@#/.       @*               @@@.      @*           @@\n                         &/     ...#/      %*           /@            %@     ,@@@%     #,@       @.\n                          @,              #%               #@&(,,*&@&.          @        @       .@\n                           *@.          /@.                       @             @        @       ,@\n                              .%@@@@@@#                           #@            /@               @\n                                    ,@                             @,             @%          .@(\n                                     @/                            .@           @#   *@@@@@@%.\n                                      @                          /@&/. .*&@( /@.\n                                      /%                       @.            @,\n                                   /@&      ,@@              /@        *#     #%\n                                 @(             @,           @        .@       @\n                                @         #*     @/  ./%@@@@@@.     &/         @\n                               ,@         &*     .@           @.              @\n                                @     *%#%@      #%            ,@(         *@*\n                                 @.             &%                 ,#@@@#*\n                                   @&.       *@(\n                                        ,*.\n ";                                                                                                                                                                                
	
	public static final String GOODBYE = " _   ___   ___   ___   ___   ___   ___   ___   ___   ___   ___\n _| |_  |_|  _| |_  |_|  _| |_  |_|  _| |_  |_|  _| |_  |_|  _|\n|  _  |  _  |_   _|  _  |  _  |  _  |_   _|  _  |  _  |  _  |_\n|_| |_| | |___| |___| | |_| |_| | |___| |___| | |_| |_| | |___|\n _   _  |  ___   ___  |  _   _  |_   _____   _|  _   _  |  ___\n| |_| | |_|  _| |_  |_| | |_| |  _| |_   _| |_  | |_| | |_|  _|\n|_   _|  _  |_   _|  _  |_   _| |  _  | |  _  | |_   _|  _  |_\n _| |___| |___| |___| |___| |_  |_| |_| |_| |_|  _| |___| |___|\n|  ___   ___   _   ___   ___  |  _   _   _   _  |_   ___   ___\n|_|  _| |_  |_| |_|  _| |_  |_| | |_| | | |_| |  _| |_  |_|  _|\n _  |_   _|   GOOD  |_   _|  _  |_   _| |_   _| |  _  |  _  |_\n| |___| |___| | | |___| |___| |  _| |__BYE| |_  |_| |_| | |___|\n|_   _____   _| |_   _____   _| |  ___   ___  |  _   _  |  ___\n _| |_   _| |_   _| |_   _| |_  |_|  _| |_  |_| | |_| | |_|  _|\n|  _  | |  _  | |  _  | |  _  |  _  |_   _|  _  |_   _|  _  |_\n|_| |_| |_| |_| |_| |_| |_| |_| | |___| |___| |___| |___| |___|\n _   _   _   _   _   _   _   _  |  ___ * *_* * *_* * *_* * *_*\n| |_| | | |_| | | |_| | | |_| | |_|  _|*|_  |_|  _| |_  |_|  _|\n|_   _| |_   _| |_   _| |_   _|  _  |_ * _|  _  |  _  |  _  |_\n _| |_____| |_   _| |_____| |_  | |___|*|___| | |_| |_| | |___|\n|  ___   ___  | |  ___ * *_* * * * *_* * _|  _   _  |  ___    \n |_|  _| |_  |_| |_|  _|*|_  |_|  _| |_   _| |_  | |_| | |_|  _|\n _  |_   _|  _   _  |_ * _|  _  |  _  | |  _  | |_   _|  _  |_\n| |___| |___| |_| |___|*|___| | |_| |_| |_| |_|  _| |___| |___|\n|_   ___   ___ * *_* * *__   _|  _   _   _   _  |_   ___   ___\n _| |_  |_|  _|*|_  |_|  _| |_  | |_| | | |_| |  _| |_  |_|  _|\n|  _  |  _  |_ * _|  _  |  _  | |_   _| |_   _| |  _  |  _  |_\n|_| |_| | |___|*|___| | |_| |_|  _| |_____| |_  |_| |_| | |___|\n _   _  |  ___ * ___  |  _   _  |  ___   ___  |  _   _  |  ___\n| |_| | |_|  _|*|_  |_| | |_| | |_|  _| |_  |_| | |_| | |_|  _|\n|_   _|  _  |_ * _|  _  |_   _|  _  |_   _|  _  |_   _|  _  |_\n _| |___| |___|*|___| |___| |___| |___| |___| |___| |___| |___\n    ";
	public static final String UNLOGGED_MENU = "\n------- MUENU -------\n"
											  +"[1] - INICIAR SESIÓN\n"
											  +"[2] - REGISTRO\n"
											  +"[0] - SALIR\n\n"
											  +"Seleccione una opcion [0-2]: ";
	
	public static final String LOGGED_MENU = "\n------------------- MUENU -------------------\n"
											+"[1] - CARGAR LABERINTO\n"
											+"[2] - VER LABERINTO ACTUAL\n"
											+"[3] - ESTABLECER CASILLAS DE ENTRADA Y SALIDA\n"
											+"[4] - BUSCAR CAMINOS\n"
											+"[5] - VER USUARIO ACTUAL\n"
											+"[6] - CERRAR SESION\n"
											+"[0] - SALIR\n\n"
											+"Seleccione una opcion [0-6]: ";
	
	public static final String LOGIN = "  __        ______     _______  __  .__   __.\n"
									 + " |  |      /  __  \\   /  _____||  | |  \\ |  |\n"
			                         + " |  |     |  |  |  | |  |  __  |  | |   \\|  |\n" 
			                         + " |  |     |  |  |  | |  | |_ | |  | |  . `  |\n" 
			                         + " |  `----.|  `--'  | |  |__| | |  | |  |\\   |\n" 
			                         + " |_______| \\______/   \\______| |__| |__| \\__|";
	
	public static final String SIGNUP = "      _______. __    _______ .__   __.  __    __  .______ \n"
									  + "     /       ||  |  /  _____||  \\ |  | |  |  |  | |   _  \\ \n"
						              + "    |   (----`|  | |  |  __  |   \\|  | |  |  |  | |  |_)  | \n" 
						              + "     \\   \\    |  | |  | |_ | |  . `  | |  |  |  | |   ___/ \n" 
						              + " .----)   |   |  | |  |__| | |  |\\   | |  `--'  | |  |  \n" 
						              + " |_______/    |__|  \\______| |__| \\__|  \\______/  | _|  ";
	
	public static final String USER = "  __    __       _______. _______ .______  \n"
			                        + " |  |  |  |     /       ||   ____||   _  \\\n"
						            + " |  |  |  |    |   (----`|  |__   |  |_)  |\n" 
						            + " |  |  |  |     \\   \\    |   __|  |      / \n" 
						            + " |  `--'  | .----)   |   |  |____ |  |\\  \\----.\n" 
						            + "  \\______/  |_______/    |_______|| _| `._____|";
	
	public static final String LOGOUT = "  __        ______     _______   ______    __    __  .___________.\n"
							          + " |  |      /  __  \\   /  _____| /  __  \\  |  |  |  | |           |\n"
							          + " |  |     |  |  |  | |  |  __  |  |  |  | |  |  |  | `---|  |----`\n" 
							          + " |  |     |  |  |  | |  | |_ | |  |  |  | |  |  |  |     |  |\n" 
							          + " |  `----.|  `--'  | |  |__| | |  `--'  | |  `--'  |     |  |\n" 
							          + " |_______| \\______/   \\______|  \\______/   \\______/      |__|";
	
	public static final String EXIT = "  _______ ___   ___  __  .___________.\n"
						            + " |   ____|\\  \\ /  / |  | |           |\n"
						            + " |  |__    \\  V  /  |  | `---|  |----`\n" 
						            + " |   __|    >   <   |  |     |  | \n" 
						            + " |  |____  /  .  \\  |  |     |  |\n" 
						            + " |_______|/__/ \\__\\ |__|     |__| ";
	
	public static final String SOON = " .______   .______        ______   ___   ___  __  .___  ___.      ___      .___  ___.  _______ .__   __. .___________. _______ \n"
								            + " |   _  \\  |   _  \\      /  __  \\  \\  \\ /  / |  | |   \\/   |     /   \\     |   \\/   | |   ____||  \\ |  | |           ||   ____|\n"
								            + " |  |_)  | |  |_)  |    |  |  |  |  \\  V  /  |  | |  \\  /  |    /  ^  \\    |  \\  /  | |  |__   |   \\|  | `---|  |----`|  |__   \n" 
								            + " |   ___/  |      /     |  |  |  |   >   <   |  | |  |\\/|  |   /  /_\\  \\   |  |\\/|  | |   __|  |  . `  |     |  |     |   __| \n" 
								            + " |  |      |  |\\  \\----.|  `--'  |  /  .  \\  |  | |  |  |  |  /  _____  \\  |  |  |  | |  |____ |  |\\   |     |  |     |  |____ \n" 
								            + " | _|      | _| `._____| \\______/  /__/ \\__\\ |__| |__|  |__| /__/     \\__\\ |__|  |__| |_______||__| \\__|     |__|     |_______|";
	   
	/* LISTADO DE MÉTODOS ESTATICOS */
	
	/* METODO PARA CONFIRMAR LA SALIDA CON UNA S u s */
	
	public static boolean confirmExit() {
		
		if(Input.getString("\n\t¿Está seguro que desea salir? SI -> s ").equalsIgnoreCase("S")) {
			return true;
		}else {
			return false;
		}
	}
	
	/* METODO PARA CONFIRMAR UN MENSAJE CON UNA LETRA A ELEGIR */
	
	public static boolean confirmExit(String enunciado, String respuesta) { 
		
		if(Input.getString(enunciado).equalsIgnoreCase(respuesta)) {
			return true;
		}else {
			return false;
		}
	}
	
	/* METODO PARA COMPROBAR FORMATO DE EMAIL */
	
	public static boolean checkEmail(String email) {
		
		if(checkMaxLong(email,100)) {
				
			String[] emailcut = email.split("@");
				
			if(emailcut.length==2) {
				
				String[] emailcut2 = emailcut[1].split("\\.");
	
				if(emailcut2.length==2) {
							
					return true;
					
				}		
			}
		}
		return false;
	}
	
	/* METODO PARA COMPROBAR FORMATO DE NIF */
	
	public static boolean checkNif(String nif) {
		
		if(checkLong(nif,9)) {
			
			if(nif.replaceAll("[^0-9]", "").length()==8) {
				
				if(nif.replaceAll("[^A-Z]", "").length()==1) {
					
					if(nif.charAt(nif.length()-1)=='1'||nif.charAt(nif.length()-1)=='2'||nif.charAt(nif.length()-1)=='3'||nif.charAt(nif.length()-1)=='4'||nif.charAt(nif.length()-1)=='5'||nif.charAt(nif.length()-1)=='6'||nif.charAt(nif.length()-1)=='7'||nif.charAt(nif.length()-1)=='8'||nif.charAt(nif.length()-1)=='9'||nif.charAt(nif.length()-1)=='0') {
						return false;
					}else {
						return true;
					}
				}
			}
			
		}
		
		return false;
		
	}
	
	/* METODO PARA COMPROBAR FORMATO DE FECHA */
	
	public static boolean checkBirthdate(String birthdate, int currentyear) {
		
		if(checkMaxLong(birthdate,10)) {
			
			String[] date = birthdate.split("/");
				
			if(date.length==3) {
			
				if(Integer.parseInt(date[0])>0&&Integer.parseInt(date[0])<=31) {
					if(Integer.parseInt(date[1])>0&&Integer.parseInt(date[1])<=12) {
						if(Integer.parseInt(date[2])>currentyear-100&&Integer.parseInt(date[2])<=currentyear) {
							return true;
						}
					}
				}		
			}
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR LA LONGITUD DE UN STRING DADO UN ENTERO */
	
	public static boolean checkLong(String text, int length) {
		
		if(text.length()==length) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI ES UN NOMBRE VÁLIDO */
	
	public static boolean checkName(String text) {
		
		if(text.equals("")) {
			return false;
		}
		
		int length1 = text.replaceAll(" ", "").length();
		int length2 = text.replaceAll("[^A-Za-zÁÉÍÓÚáéíóú]", "").length();
		
		if(length1==length2) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR UNA CADENA SUPERA UNA LONGITUD DETERMINADA */
	
	public static boolean checkMaxLong(String text, int max) {
		
		if(text.length()<=max) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI HAY SIMBOLOS QUE NO SEAN ALFANUMERICOS */
	
	public static boolean checkSymbols(String text) {
		
		int initial = text.length();
		int finish = text.replaceAll("[^a-zA-Z0-9]", "").length();
		
		if(initial==finish) {
			return true;
		}
		
		return false;
	}

}