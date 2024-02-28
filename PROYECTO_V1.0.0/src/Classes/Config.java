package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

/* 
 * Config.java
 * 
 * Se añade:
 * 
 * LOAD MAZE: "Cadena de texto que se usa como rotulo al cragar laberinto"
 * MAZE: "Cadena de texto que se usa como rotulo al mostrar laberinto actual"
 * SET IN OUT: "Cadena de texto que se usa como rotulo al establecer entrada y salida"
 * SOLVE MAZE: "Cadena de texto que se usa como rotulo al abrir el menu de resolucion de laberintos"
 * 
 * Además se mejora el metodo de compribar nombre, para aceptar ñ y Ñ, así como tildes y otros caracteres.
 * Se ha mejorado el metodo de comprobacion de fecha, para que coincida en formato y en una fecha real.
 * Se ha mejorado el metodo de comprobacion de DNI con expresion regular y tomando como buena la letra final
 * tanto en mayuscula como en minuscula.
 * Mejora del metodo email, para poder obtener mejores resultados.
 * 
 * APF - 31-01-2024
 * VERSION: 0.2.0
 * 
 */

/* 
 * Config.java
 * 
 * APF - 31-01-2024
 * VERSION: 1.0.0
 * 
 */

/**
 * Clase que contiene métodos y campos estáticos para usar en varias partes del programa.
 * 
 * Incluye comprobación de expresiones regulares, menus, formatos de letras, cabeceras de menu, etc...
 * 
 * @author Adrián Peñalver Fernández
 * @version 1.0.0
 * 
 */

public class Config{
	
	/* LISTADO DE ATRIBUTOS ESTATICOS */
	
	/**
	 * Campos estáticos que permiten cambiar el color del texto en la consola.
	 * 
	 * @see RESET Permite resetear el color establecido previamente.
	 * 
	 */
    public static final String RESET = "\033[0m";  // Restablecer el color
    
    /**
	 * Color negro de texto en consola.
	 */
    public static final String NEGRO = "\033[0;30m";   // Negro
    /**
	 * Color rojo de texto en consola.
	 */
    public static final String ROJO = "\033[0;31m";     // Rojo
    /**
	 * Color verde de texto en consola.
	 */
    public static final String VERDE = "\033[0;32m";   // Verde
    /**
	 * Color amarillo de texto en consola.
	 */
    public static final String AMARILLO = "\033[0;33m";// Amarillo
    /**
	 * Color azul de texto en consola.
	 */
    public static final String AZUL = "\033[0;34m";    // Azul
    /**
	 * Color purpura de texto en consola.
	 */
    public static final String PURPURA = "\033[0;35m"; // Púrpura
    /**
	 * Color cian de texto en consola.
	 */
    public static final String CIAN = "\033[0;36m";     // Cian
    /**
	 * Color blanco de texto en consola.
	 */
    public static final String BLANCO = "\033[0;37m";   // Blanco
    
    /**
	 * Campo estático que permite conocer la versión actual del software.
	 */
	
	public static final String VERSION = AZUL+"✅ -- Version Estable: 1.0.0 --"+RESET;
	
	/**
	 * Campo estático que permite acceder al directorio donde se almacenan los laberintos.
	 */
	public static final String PATH = ".\\assets\\mazes\\";
	
	/**
	 * Campo estático que permite dar la bienvenida al usuario.
	 */
	public static final String WELCOME =CIAN+"\n          \\r                                        BIENVENIDO A ARIADNE-SOFT.\n"
			+ "      %@@,...#@@.\n   (@            #@\n  &*     @.        @.\n ,&     *@. &,     ,@\n  @      @  &,     /&                                       .#&@@@%*\n  *@              /&                                     &@          #@.\n    %@.         #@  %@(       *@@&&&@@&.               /&     @@@&     /@\n        (&@@&#.         #@((@           ,@.           .@      @@@*      (%\n                          @.      /@/     (&          ,@         (*     *&           &@@@@@@@#\n                         @/      @ #/      %@#/.       @*               @@@.      @*           @@\n                         &/     ...#/      %*           /@            %@     ,@@@%     #,@       @.\n                          @,              #%               #@&(,,*&@&.          @        @       .@\n                           *@.          /@.                       @             @        @       ,@\n                              .%@@@@@@#                           #@            /@               @\n                                    ,@                             @,             @%          .@(\n                                     @/                            .@           @#   *@@@@@@%.\n                                      @                          /@&/. .*&@( /@.\n                                      /%                       @.            @,\n                                   /@&      ,@@              /@        *#     #%\n                                 @(             @,           @        .@       @\n                                @         #*     @/  ./%@@@@@@.     &/         @\n                               ,@         &*     .@           @.              @\n                                @     *%#%@      #%            ,@(         *@*\n                                 @.             &%                 ,#@@@#*\n                                   @&.       *@(\n                                        ,*.\n "+RESET;                                                                                                                                                                                
	
	/**
	 * Campo estático que permite despedir al usuario al final del programa.
	 */
	public static final String GOODBYE = " _   ___   ___   ___   ___   ___   ___   ___   ___   ___   ___\n _| |_  |_|  _| |_  |_|  _| |_  |_|  _| |_  |_|  _| |_  |_|  _|\n|  _  |  _  |_   _|  _  |  _  |  _  |_   _|  _  |  _  |  _  |_\n|_| |_| | |___| |___| | |_| |_| | |___| |___| | |_| |_| | |___|\n _   _  |  ___   ___  |  _   _  |_   _____   _|  _   _  |  ___\n| |_| | |_|  _| |_  |_| | |_| |  _| |_   _| |_  | |_| | |_|  _|\n|_   _|  _  |_   _|  _  |_   _| |  _  | |  _  | |_   _|  _  |_\n _| |___| |___| |___| |___| |_  |_| |_| |_| |_|  _| |___| |___|\n|  ___   ___   _   ___   ___  |  _   _   _   _  |_   ___   ___\n|_|  _| |_  |_| |_|  _| |_  |_| | |_| | | |_| |  _| |_  |_|  _|\n _  |_   _|   GOOD  |_   _|  _  |_   _| |_   _| |  _  |  _  |_\n| |___| |___| | | |___| |___| |  _| |__BYE| |_  |_| |_| | |___|\n|_   _____   _| |_   _____   _| |  ___   ___  |  _   _  |  ___\n _| |_   _| |_   _| |_   _| |_  |_|  _| |_  |_| | |_| | |_|  _|\n|  _  | |  _  | |  _  | |  _  |  _  |_   _|  _  |_   _|  _  |_\n|_| |_| |_| |_| |_| |_| |_| |_| | |___| |___| |___| |___| |___|\n _   _   _   _   _   _   _   _  |  ___ * *_* * *_* * *_* * *_*\n| |_| | | |_| | | |_| | | |_| | |_|  _|*|_  |_|  _| |_  |_|  _|\n|_   _| |_   _| |_   _| |_   _|  _  |_ * _|  _  |  _  |  _  |_\n _| |_____| |_   _| |_____| |_  | |___|*|___| | |_| |_| | |___|\n|  ___   ___  | |  ___ * *_* * * * *_* * _|  _   _  |  ___    \n |_|  _| |_  |_| |_|  _|*|_  |_|  _| |_   _| |_  | |_| | |_|  _|\n _  |_   _|  _   _  |_ * _|  _  |  _  | |  _  | |_   _|  _  |_\n| |___| |___| |_| |___|*|___| | |_| |_| |_| |_|  _| |___| |___|\n|_   ___   ___ * *_* * *__   _|  _   _   _   _  |_   ___   ___\n _| |_  |_|  _|*|_  |_|  _| |_  | |_| | | |_| |  _| |_  |_|  _|\n|  _  |  _  |_ * _|  _  |  _  | |_   _| |_   _| |  _  |  _  |_\n|_| |_| | |___|*|___| | |_| |_|  _| |_____| |_  |_| |_| | |___|\n _   _  |  ___ * ___  |  _   _  |  ___   ___  |  _   _  |  ___\n| |_| | |_|  _|*|_  |_| | |_| | |_|  _| |_  |_| | |_| | |_|  _|\n|_   _|  _  |_ * _|  _  |_   _|  _  |_   _|  _  |_   _|  _  |_\n _| |___| |___|*|___| |___| |___| |___| |___| |___| |___| |___\n    ";
	
	/**
	 * Campo estático que permite mostrar el menu de opciones de usuarios no logueados.
	 */
	public static final String UNLOGGED_MENU = "\n------- MUENU -------\n"
											  +"[1] - INICIAR SESIÓN\n"
											  +"[2] - REGISTRO\n"
											  +"[0] - SALIR\n\n"
											  +"Seleccione una opcion [0-2]: ";
	
	/**
	 * Campo estático que permite mostrar el menu de opciones de usuarios logueados.
	 */
	public static final String LOGGED_MENU = "\n------------------- MUENU -------------------\n"
											+"[1] - CARGAR LABERINTO\n"
											+"[2] - VER LABERINTO ACTUAL\n"
											+"[3] - ESTABLECER CASILLAS DE ENTRADA Y SALIDA\n"
											+"[4] - BUSCAR CAMINOS\n"
											+"[5] - VER USUARIO ACTUAL\n"
											+"[6] - CERRAR SESION\n"
											+"[0] - SALIR\n\n"
											+"Seleccione una opcion [0-6]: ";
	
	/**
	 * Campo estático que permite mostrar el menu de opciones de resolución de laberintos.
	 */
	public static final String SOLVE_MAZE_MENU = "\n\t------------------- MUENU -------------------\n"
			+"\t[1] - BUSCAR UN CAMINO\n"
			+"\t[2] - BUSCAR LA RUTA MAS CORTA\n"
			+"\t[0] - SALIR\n"
			+"\tSeleccione una opcion [0-2]: ";
	
	/**
	 * Campo estático que permite mostrar la cabecera del método login.
	 */
	public static final String LOGIN = AMARILLO+"  __        ______     _______  __  .__   __.\n"
									 + " |  |      /  __  \\   /  _____||  | |  \\ |  |\n"
			                         + " |  |     |  |  |  | |  |  __  |  | |   \\|  |\n" 
			                         + " |  |     |  |  |  | |  | |_ | |  | |  . `  |\n" 
			                         + " |  `----.|  `--'  | |  |__| | |  | |  |\\   |\n" 
			                         + " |_______| \\______/   \\______| |__| |__| \\__|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método signup.
	 */
	public static final String SIGNUP = AMARILLO+"      _______. __    _______ .__   __.  __    __  .______ \n"
									  + "     /       ||  |  /  _____||  \\ |  | |  |  |  | |   _  \\ \n"
						              + "    |   (----`|  | |  |  __  |   \\|  | |  |  |  | |  |_)  | \n" 
						              + "     \\   \\    |  | |  | |_ | |  . `  | |  |  |  | |   ___/ \n" 
						              + " .----)   |   |  | |  |__| | |  |\\   | |  `--'  | |  |  \n" 
						              + " |_______/    |__|  \\______| |__| \\__|  \\______/  | _|  "+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método user.
	 */
	public static final String USER = AMARILLO+"  __    __       _______. _______ .______  \n"
			                        + " |  |  |  |     /       ||   ____||   _  \\\n"
						            + " |  |  |  |    |   (----`|  |__   |  |_)  |\n" 
						            + " |  |  |  |     \\   \\    |   __|  |      / \n" 
						            + " |  `--'  | .----)   |   |  |____ |  |\\  \\----.\n" 
						            + "  \\______/  |_______/    |_______|| _| `._____|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método logout.
	 */
	public static final String LOGOUT = AMARILLO+"  __        ______     _______   ______    __    __  .___________.\n"
							          + " |  |      /  __  \\   /  _____| /  __  \\  |  |  |  | |           |\n"
							          + " |  |     |  |  |  | |  |  __  |  |  |  | |  |  |  | `---|  |----`\n" 
							          + " |  |     |  |  |  | |  | |_ | |  |  |  | |  |  |  |     |  |\n" 
							          + " |  `----.|  `--'  | |  |__| | |  `--'  | |  `--'  |     |  |\n" 
							          + " |_______| \\______/   \\______|  \\______/   \\______/      |__|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método exit.
	 */
	public static final String EXIT = AMARILLO+"  _______ ___   ___  __  .___________.\n"
						            + " |   ____|\\  \\ /  / |  | |           |\n"
						            + " |  |__    \\  V  /  |  | `---|  |----`\n" 
						            + " |   __|    >   <   |  |     |  | \n" 
						            + " |  |____  /  .  \\  |  |     |  |\n" 
						            + " |_______|/__/ \\__\\ |__|     |__| "+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera proximamente para secciones del programa en desarrollo.
	 */
	public static final String SOON = AMARILLO+" .______   .______        ______   ___   ___  __  .___  ___.      ___      .___  ___.  _______ .__   __. .___________. _______ \n"
								            + " |   _  \\  |   _  \\      /  __  \\  \\  \\ /  / |  | |   \\/   |     /   \\     |   \\/   | |   ____||  \\ |  | |           ||   ____|\n"
								            + " |  |_)  | |  |_)  |    |  |  |  |  \\  V  /  |  | |  \\  /  |    /  ^  \\    |  \\  /  | |  |__   |   \\|  | `---|  |----`|  |__   \n" 
								            + " |   ___/  |      /     |  |  |  |   >   <   |  | |  |\\/|  |   /  /_\\  \\   |  |\\/|  | |   __|  |  . `  |     |  |     |   __| \n" 
								            + " |  |      |  |\\  \\----.|  `--'  |  /  .  \\  |  | |  |  |  |  /  _____  \\  |  |  |  | |  |____ |  |\\   |     |  |     |  |____ \n" 
								            + " | _|      | _| `._____| \\______/  /__/ \\__\\ |__| |__|  |__| /__/     \\__\\ |__|  |__| |_______||__| \\__|     |__|     |_______|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método cargar laberinto.
	 */
	public static final String LOAD_MAZE = AMARILLO+"\n  __        ______        ___       _______     .___  ___.      ___       ________   _______ \n"
			+ " |  |      /  __  \\      /   \\     |       \\    |   \\/   |     /   \\     |       /  |   ____|\n"
			+ " |  |     |  |  |  |    /  ^  \\    |  .--.  |   |  \\  /  |    /  ^  \\    `---/  /   |  |__   \n"
			+ " |  |     |  |  |  |   /  /_\\  \\   |  |  |  |   |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \n"
			+ " |  `----.|  `--'  |  /  _____  \\  |  '--'  |   |  |  |  |  /  _____  \\    /  /----.|  |____ \n"
			+ " |_______| \\______/  /__/     \\__\\ |_______/    |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método showmaze.
	 */
	public static final String MAZE = AMARILLO+"\n .___  ___.      ___       ________   _______ \r\n"
			+ " |   \\/   |     /   \\     |       /  |   ____|\r\n"
			+ " |  \\  /  |    /  ^  \\    `---/  /   |  |__   \r\n"
			+ " |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \r\n"
			+ " |  |  |  |  /  _____  \\    /  /----.|  |____ \r\n"
			+ " |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método establecer casillas de entrada y salida.
	 */
	public static final String SET_IN_OUT = AMARILLO+"\n      _______. _______ .___________.    __  .__   __.      ______    __    __  .___________.\r\n"
			+ "     /       ||   ____||           |   |  | |  \\ |  |     /  __  \\  |  |  |  | |           |\r\n"
			+ "    |   (----`|  |__   `---|  |----`   |  | |   \\|  |    |  |  |  | |  |  |  | `---|  |----`\r\n"
			+ "     \\   \\    |   __|      |  |        |  | |  . `  |    |  |  |  | |  |  |  |     |  |     \r\n"
			+ " .----)   |   |  |____     |  |        |  | |  |\\   |    |  `--'  | |  `--'  |     |  |     \r\n"
			+ " |_______/    |_______|    |__|        |__| |__| \\__|     \\______/   \\______/      |__|    \n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método resolver laberinto.
	 */
	public static final String SOLVE_MAZE = AMARILLO+"\n      _______.  ______    __      ____    ____  _______    .___  ___.      ___       ________   _______ \r\n"
			+ "     /       | /  __  \\  |  |     \\   \\  /   / |   ____|   |   \\/   |     /   \\     |       /  |   ____|\r\n"
			+ "    |   (----`|  |  |  | |  |      \\   \\/   /  |  |__      |  \\  /  |    /  ^  \\    `---/  /   |  |__   \r\n"
			+ "     \\   \\    |  |  |  | |  |       \\      /   |   __|     |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \r\n"
			+ " .----)   |   |  `--'  | |  `----.   \\    /    |  |____    |  |  |  |  /  _____  \\    /  /----.|  |____ \r\n"
			+ " |_______/     \\______/  |_______|    \\__/     |_______|   |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;
	
	/* LISTADO DE MÉTODOS ESTATICOS */
	
	/* METODO PARA CONFIRMAR LA SALIDA CON UNA S u s */
	
	/**
	 * Método estático que permite mostar un mensaje para pedir al usuario si quiere salir del programa.
	 * 
	 * @return Boolean confirmación de salida.
	 */
	
	public static boolean confirmExit() {
		
		if(Input.getString("\n\t¿Está seguro que desea salir? SI -> s ").equalsIgnoreCase("S")) {
			return true;
		}else {
			return false;
		}
	}
	
	/* METODO PARA CONFIRMAR UN MENSAJE CON UNA LETRA A ELEGIR */
	
	/**
	 * Método estático que sobrecargado, permite mostar un mensaje y también recibe un mensaje de aceptación.
	 * 
	 *  @param enunciado Enunciado que se desea introducir.
	 *  @param respuesta Respuesta deseada para ser afirmativa.
	 *  @return boolean Confirmación de ununciado.
	 */
	
	public static boolean confirmExit(String enunciado, String respuesta) { 
		
		if(Input.getString(enunciado).equalsIgnoreCase(respuesta)) {
			return true;
		}else {
			return false;
		}
	}
	
	/* METODO PARA COMPROBAR FORMATO DE EMAIL */
	
	/**
	 * Método estático que comprueba si un email tiene formato correcto.
	 * 
	 *  @param email Email a comprobar.
	 *  @return boolean Check del email.
	 */
	
	public static boolean checkEmail(String email) {
		
		if(checkMaxLong(email,100)) {
			
			Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]{2,}$");
	        Matcher matcher = pattern.matcher(email);
	        
	        if(!matcher.matches()) {
	        	
	        	return false;
	        	
	        }else {
	        	
	        	return true;
	        	
	        }
			
		}
		return false;
	}
	
	/* METODO PARA COMPROBAR FORMATO DE NIF */
	
	/**
	 * Método estático que compruba si un DNI tiene formato correcto.
	 * 
	 *  @param nif DNI a comprobar.
	 *  @return boolean Check del nif.
	 */
	
	public static boolean checkNif(String nif) {
		
		Pattern pattern = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Matcher matcher = pattern.matcher(nif);
        
        if(!matcher.matches()) {
        	
        	return false;
        	
        }else {
        	
        	return true;
        	
        }
		
	}
	
	/* METODO PARA COMPROBAR FORMATO DE FECHA */
	
	/**
	 * Método estático que compruba si una fecha tiene formato correcto y es válida.
	 * Además comprueba si la fecha no va más allá del año actual.
	 * 
	 *  @param birthdate Fecha a comprobar.
	 *  @param currentYear Año actual.
	 *  @return boolean Check de la fecha de nacimiento.
	 */
	
	public static boolean checkBirthdate(String birthdate, int currentyear) {
		
		Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher = pattern.matcher(birthdate);
        
        if(!matcher.matches()) {
        	
        	return false;
        	
        }
        
        String[] data = birthdate.split("/");
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        
        if(year>=currentyear) {
        	return false;
        }
        
        boolean bisiesto = false;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			bisiesto = true;
		}

		if (month >= 1 && month <= 12) {

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

				if (day <= 31) {
					return true;
				} else {
					return false;
				}

			} else if (month == 4 || month == 6 || month == 9 || month == 11) {

				if (day <= 30) {
					return true;
				} else {
					return false;
				}

			} else {

				if (day <= 29 && bisiesto) {
					return true;
				} else if(day<=28 && !bisiesto){
					return true;
				}else {
					return false;
				}

			}

		} else {
			return false;
		}
	}
	
	/* METODO PARA COMPROBAR LA LONGITUD DE UN STRING DADO UN ENTERO */
	
	/**
	 * Método estático que compruba si un String tiene una longitud indicada.
	 * 
	 *  @param text Texto a comprobar.
	 *  @param lenght Longitud a determinar.
	 *  @return boolean Check de la comprobación de la longitud.
	 */
	
	public static boolean checkLong(String text, int length) {
		
		if(text.length()==length) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI ES UN NOMBRE VÁLIDO */
	
	/**
	 * Método estático que compruba si un nombre tienen un formato válido.
	 * 
	 *  @param text Texto a comprobar.
	 *  @return boolean Check de la comprobación del nombre.
	 */
	
	public static boolean checkName(String text) {
		
		if(text.equals("")) {
			return false;
		}
		
		int length1 = text.replaceAll(" ", "").length();
		int length2 = text.replaceAll("[^A-Za-zÁÉÍÓÚáéíóúÑñª]", "").length();
		
		if(length1==length2) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR UNA CADENA SUPERA UNA LONGITUD DETERMINADA */
	
	/**
	 * Método estático que comprubar si un texto supera una longitud determinada.
	 * 
	 *  @param text Texto a comprobar.
	 *  @param max Longitud máxima establecida.
	 *  @return boolean Check de la longitud.
	 */
	
	public static boolean checkMaxLong(String text, int max) {
		
		if(text.length()<=max) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI HAY SIMBOLOS QUE NO SEAN ALFANUMERICOS */
	
	/**
	 * Método estático que compruba si un texto tiene símbolos.
	 * 
	 *  @param text Texto a comprobar.
	 *  @return boolean Check de la existencia de símbolos.
	 */
	
	public static boolean checkSymbols(String text) {
		
		int initial = text.length();
		int finish = text.replaceAll("[^a-zA-Z0-9]", "").length();
		
		if(initial==finish) {
			return true;
		}
		
		return false;
	}

}