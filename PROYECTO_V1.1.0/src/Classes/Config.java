package Classes;

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
    public static final String BLACK = "\033[0;30m";   // Negro
    /**
	 * Color rojo de texto en consola.
	 */
    public static final String RED = "\033[0;31m";     // Rojo
    /**
	 * Color verde de texto en consola.
	 */
    public static final String GREEN = "\033[0;32m";   // Verde
    /**
	 * Color amarillo de texto en consola.
	 */
    public static final String YELLOW = "\033[0;33m";// Amarillo
    /**
	 * Color azul de texto en consola.
	 */
    public static final String BLUE = "\033[0;34m";    // Azul
    /**
	 * Color purpura de texto en consola.
	 */
    public static final String PURPLE = "\033[0;35m"; // Púrpura
    /**
	 * Color cian de texto en consola.
	 */
    public static final String CIAN = "\033[0;36m";     // Cian
    /**
	 * Color blanco de texto en consola.
	 */
    public static final String WHITE = "\033[0;37m";   // Blanco
    
    /**
	 * Campo estático que permite conocer la versión actual del software.
	 */
	
	public static final String VERSION = BLUE+"✅ -- Version Estable: 1.1.0 --"+RESET;
	
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
	public static final String LOGIN = YELLOW+"  __        ______     _______  __  .__   __.\n"
									 + " |  |      /  __  \\   /  _____||  | |  \\ |  |\n"
			                         + " |  |     |  |  |  | |  |  __  |  | |   \\|  |\n" 
			                         + " |  |     |  |  |  | |  | |_ | |  | |  . `  |\n" 
			                         + " |  `----.|  `--'  | |  |__| | |  | |  |\\   |\n" 
			                         + " |_______| \\______/   \\______| |__| |__| \\__|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método signup.
	 */
	public static final String SIGNUP = YELLOW+"      _______. __    _______ .__   __.  __    __  .______ \n"
									  + "     /       ||  |  /  _____||  \\ |  | |  |  |  | |   _  \\ \n"
						              + "    |   (----`|  | |  |  __  |   \\|  | |  |  |  | |  |_)  | \n" 
						              + "     \\   \\    |  | |  | |_ | |  . `  | |  |  |  | |   ___/ \n" 
						              + " .----)   |   |  | |  |__| | |  |\\   | |  `--'  | |  |  \n" 
						              + " |_______/    |__|  \\______| |__| \\__|  \\______/  | _|  "+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método user.
	 */
	public static final String USER = YELLOW+"  __    __       _______. _______ .______  \n"
			                        + " |  |  |  |     /       ||   ____||   _  \\\n"
						            + " |  |  |  |    |   (----`|  |__   |  |_)  |\n" 
						            + " |  |  |  |     \\   \\    |   __|  |      / \n" 
						            + " |  `--'  | .----)   |   |  |____ |  |\\  \\----.\n" 
						            + "  \\______/  |_______/    |_______|| _| `._____|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método logout.
	 */
	public static final String LOGOUT = YELLOW+"  __        ______     _______   ______    __    __  .___________.\n"
							          + " |  |      /  __  \\   /  _____| /  __  \\  |  |  |  | |           |\n"
							          + " |  |     |  |  |  | |  |  __  |  |  |  | |  |  |  | `---|  |----`\n" 
							          + " |  |     |  |  |  | |  | |_ | |  |  |  | |  |  |  |     |  |\n" 
							          + " |  `----.|  `--'  | |  |__| | |  `--'  | |  `--'  |     |  |\n" 
							          + " |_______| \\______/   \\______|  \\______/   \\______/      |__|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método exit.
	 */
	public static final String EXIT = YELLOW+"  _______ ___   ___  __  .___________.\n"
						            + " |   ____|\\  \\ /  / |  | |           |\n"
						            + " |  |__    \\  V  /  |  | `---|  |----`\n" 
						            + " |   __|    >   <   |  |     |  | \n" 
						            + " |  |____  /  .  \\  |  |     |  |\n" 
						            + " |_______|/__/ \\__\\ |__|     |__| "+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera proximamente para secciones del programa en desarrollo.
	 */
	public static final String SOON = YELLOW+" .______   .______        ______   ___   ___  __  .___  ___.      ___      .___  ___.  _______ .__   __. .___________. _______ \n"
								            + " |   _  \\  |   _  \\      /  __  \\  \\  \\ /  / |  | |   \\/   |     /   \\     |   \\/   | |   ____||  \\ |  | |           ||   ____|\n"
								            + " |  |_)  | |  |_)  |    |  |  |  |  \\  V  /  |  | |  \\  /  |    /  ^  \\    |  \\  /  | |  |__   |   \\|  | `---|  |----`|  |__   \n" 
								            + " |   ___/  |      /     |  |  |  |   >   <   |  | |  |\\/|  |   /  /_\\  \\   |  |\\/|  | |   __|  |  . `  |     |  |     |   __| \n" 
								            + " |  |      |  |\\  \\----.|  `--'  |  /  .  \\  |  | |  |  |  |  /  _____  \\  |  |  |  | |  |____ |  |\\   |     |  |     |  |____ \n" 
								            + " | _|      | _| `._____| \\______/  /__/ \\__\\ |__| |__|  |__| /__/     \\__\\ |__|  |__| |_______||__| \\__|     |__|     |_______|"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método cargar laberinto.
	 */
	public static final String LOAD_MAZE = YELLOW+"\n  __        ______        ___       _______     .___  ___.      ___       ________   _______ \n"
			+ " |  |      /  __  \\      /   \\     |       \\    |   \\/   |     /   \\     |       /  |   ____|\n"
			+ " |  |     |  |  |  |    /  ^  \\    |  .--.  |   |  \\  /  |    /  ^  \\    `---/  /   |  |__   \n"
			+ " |  |     |  |  |  |   /  /_\\  \\   |  |  |  |   |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \n"
			+ " |  `----.|  `--'  |  /  _____  \\  |  '--'  |   |  |  |  |  /  _____  \\    /  /----.|  |____ \n"
			+ " |_______| \\______/  /__/     \\__\\ |_______/    |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método showmaze.
	 */
	public static final String MAZE = YELLOW+"\n .___  ___.      ___       ________   _______ \r\n"
			+ " |   \\/   |     /   \\     |       /  |   ____|\r\n"
			+ " |  \\  /  |    /  ^  \\    `---/  /   |  |__   \r\n"
			+ " |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \r\n"
			+ " |  |  |  |  /  _____  \\    /  /----.|  |____ \r\n"
			+ " |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método establecer casillas de entrada y salida.
	 */
	public static final String SET_IN_OUT = YELLOW+"\n      _______. _______ .___________.    __  .__   __.      ______    __    __  .___________.\r\n"
			+ "     /       ||   ____||           |   |  | |  \\ |  |     /  __  \\  |  |  |  | |           |\r\n"
			+ "    |   (----`|  |__   `---|  |----`   |  | |   \\|  |    |  |  |  | |  |  |  | `---|  |----`\r\n"
			+ "     \\   \\    |   __|      |  |        |  | |  . `  |    |  |  |  | |  |  |  |     |  |     \r\n"
			+ " .----)   |   |  |____     |  |        |  | |  |\\   |    |  `--'  | |  `--'  |     |  |     \r\n"
			+ " |_______/    |_______|    |__|        |__| |__| \\__|     \\______/   \\______/      |__|    \n"+RESET;
	
	/**
	 * Campo estático que permite mostrar la cabecera del método resolver laberinto.
	 */
	public static final String SOLVE_MAZE = YELLOW+"\n      _______.  ______    __      ____    ____  _______    .___  ___.      ___       ________   _______ \r\n"
			+ "     /       | /  __  \\  |  |     \\   \\  /   / |   ____|   |   \\/   |     /   \\     |       /  |   ____|\r\n"
			+ "    |   (----`|  |  |  | |  |      \\   \\/   /  |  |__      |  \\  /  |    /  ^  \\    `---/  /   |  |__   \r\n"
			+ "     \\   \\    |  |  |  | |  |       \\      /   |   __|     |  |\\/|  |   /  /_\\  \\      /  /    |   __|  \r\n"
			+ " .----)   |   |  `--'  | |  `----.   \\    /    |  |____    |  |  |  |  /  _____  \\    /  /----.|  |____ \r\n"
			+ " |_______/     \\______/  |_______|    \\__/     |_______|   |__|  |__| /__/     \\__\\  /________||_______|\n"+RESET;

}