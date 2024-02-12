import Classes.Config;
import Classes.Input;
import Classes.Session;

/*
 * Main.java
 * 
 * Es la clase que contiene el programa principal y se encarga de mostrar los menús
 * y solicitar la selección de opciones de dichos menús para, después, realizar las
 * acciones correspondientes.
 * 
 * Inicialmnete se crea un menu para usuarios no registrados.
 * Una vez registrado el usuario se abre el menú secundario.
 * 
 * El programa, en su primera iteración, es decir, para esta primera entrega, deberá
 * cumplir un funcionamiento que permita al usuario iniciar sesión de usuario y registrar
 * un nuevo usuario para poder iniciar sesión, mediante un menú para usuarios no identificados
 * que muestre las siguientes opciones:
 * 
 * 1 Iniciar sesión
 * 2 Registro
 * 0 Salir
 * 
 * Si se pulsa la opción 1, el programa solicitará un nombre de usuario y una contraseña para,
 * a continuación, leer desde un fichero los usuarios existentes y comprobar si coinciden usuario
 * y contraseña con alguno de los registros. Si coinciden, indicará que se ha iniciado sesión
 * correctamente, si no coincide, indicará que usuario y/o contraseña no son válidos.
 * 
 * Para la opción 2, el programa pedirá introducir los siguientes campos:
 * 
 * - Nombre de usuario
 * - Contraseña
 * - Nombre completo
 * - NIF
 * - Email
 * - Dirección
 * - Fecha de nacimiento
 * 
 * Una vez que el usuario inicia sesión, mostrará un menú de opciones solo disponible para 
 * cuando se ha iniciado sesión, el cual muestra las siguientes opciones:
 * 
 * 1 Cargar laberinto
 * 2 Ver laberinto actual
 * 3 Establecer casillas de entrada y salida
 * 4 Buscar caminos
 * 5 Ver usuario actual
 * 6 Cerrar sesión
 * 0 Salir
 * 
 * Para las opciones 1, 2, 3 y 4, ÚNICAMENTE mostrará el texto "Próximamente". 
 * 
 * Para la opción 5, deberá mostrar toda la información del usuario que tiene iniciada sesión actualmente.
 * 
 * Para la opción 6, deberá mostrar un mensaje indicando que se está cerrando sesión, quitar toda la
 * información del usuario guardada en la sesión y devolver al usuario al menú inicial para usuarios
 * sin sesión iniciada.
 * 
 * Para ambos menús, si se pulsa la opción 0, el programa deberá terminar. El programa solo puede
 * detenerse si en alguno de los menús se pulsa el 0. El programa nunca debe terminar en cualquier
 * otro caso, por lo que se considerará un fallo de programación si ocurre.
 * 
 * APF - 21.12.2023
 * version 0.1.0
 */

public class Main {
	
	public static Session currentSession = new Session();
	
	public static void main(String[] args) {
		
		System.out.println(Config.WELCOME + " " + Config.VERSION);
		Input.toContinue();
		
		int option = -1;
		
		do { /* SE REPITE CONTINUAMENTE MIENTRAS NO SE PULSE 0 */
			
			if(currentSession.isLogged()) { /* SI EL USUARIO SE HA LOGGEADO */
				
				option = Input.getInt(Config.LOGGED_MENU, false);
				
				if(option==0) {
					
					System.out.println(Config.EXIT);
					
					if(!Config.confirmExit()) {
						option=-1;
					}
					
				}else if(option==1) {
					System.out.println(Config.SOON);
					Input.toContinue();
				}else if(option==2) {
					System.out.println(Config.SOON);
					Input.toContinue();
				}else if(option==3) {
					System.out.println(Config.SOON);
					Input.toContinue();
				}else if(option==4) {
					System.out.println(Config.SOON);
					Input.toContinue();
				}else if(option==5) { // METODO INFO()
					
					currentSession.showUser();
					Input.toContinue();
					
				}else if(option==6) { // METODO LOGOUT()
					
					currentSession.logOut();
					Input.toContinue();
					
				}

			}else { /* SI EL USUARIO NO SE HA LOGGEADO */
				
				option = Input.getInt(Config.UNLOGGED_MENU, false); 
				
				if(option==0) {
					
					System.out.println(Config.EXIT);
					
					if(!Config.confirmExit()) {
						option=-1;
					}
					
				}else if(option==1) { // METODO LOGIN()
				
					currentSession.login();
					
				}else if(option==2) { // METODO SIGNUP()
					
					currentSession.signup();
					Input.toContinue();
					
				}
			}
			
		} while (option!=0);
		
		System.out.println(Config.GOODBYE);
		
	}
}