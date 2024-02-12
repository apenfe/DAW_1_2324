import Classes.Config;
import Classes.Input;
import Classes.Maze;
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

/*
 * Main.java
 * 
 * A partir de lo realizado en la primera entrega del proyecto, en esta segunda entrega del proyecto de resolución
 * de laberintos, se debe implementar la funcionalidad de las opciones 1, 2 y 3 del menú para usuarios identificados
 * que se realizó en la entrega anterior:
 * 
 * 1 - Cargar laberinto
 * 2 - Ver laberinto actual
 * 3 - Establecer casillas de inicio y fin
 * 4 - Buscar caminos
 * 5 - Ver usuario actual
 * 6 - Cerrar sesión
 * 0 - Salir
 * 
 * Para ello se deberá crear una nueva clase llamada "Maze" de la cual se creará un objeto de este tipo de clase en el
 * programa principal, con el que se llamará a cada uno de los métodos que realicen las funciones del menú que se han indicado.
 * 
 * APF - 31.01.2024
 * version 0.2.0
 * 
 */

public class Main {
	
	public static Session currentSession = new Session();
	public static Maze currentMaze = new Maze();
	
	public static void main(String[] args) {
		
		System.out.println(Config.WELCOME + " " + Config.VERSION);
		Input.toContinue();
		
		int option = -1;
		
		do { /* SE REPITE CONTINUAMENTE MIENTRAS NO SE PULSE 0 */
			
			
			if(currentSession.isLogged()) { /* SI EL USUARIO SE HA LOGGEADO */
				
				option = Input.getInt(Config.LOGGED_MENU, false);
				loggedOptions(option);

			}else { /* SI EL USUARIO NO SE HA LOGGEADO */
				
				option = Input.getInt(Config.UNLOGGED_MENU, false); 
				unloggedOptions(option);
			}
			
		} while (option!=0);
		
		System.out.println(Config.GOODBYE);
		
	}
	
	/* METODOS USADOS EN LA CLASE MAIN */
	
	/* OPCIONES PARA USUARIOS REGISTRADOS */
	
	public static void loggedOptions(int option) {
		
		if(option==0) { // METODO EXIT
			
			System.out.println(Config.EXIT);
			
			if(!Config.confirmExit()) {
				option=-1;
			}
			
		}else if(option==1) { // CARGAR LABERINTO
			
			System.out.println("\t"+Config.LOAD_MAZE);
			currentMaze.loadMaze();
			Input.toContinue();
			
		}else if(option==2) { // METODO VER LABERINTO ACTUAL
			
			if(currentMaze.isLoaded()) {
				System.out.println("\t"+Config.MAZE);
				currentMaze.showMaze();
				
			}else {
				
				System.out.println("Debe de cargar un laberinto para poder visualizarlo.");
				
			}
			
			Input.toContinue();
			
		}else if(option==3) { // METODO ESTABLECER ENTRADA Y SALIDA
			
			if(currentMaze.isLoaded()) {
				
				System.out.println("\t"+Config.SET_IN_OUT);
				currentMaze.setStartEnd();
				
			}else {
				
				System.out.println("Debe de cargar un laberinto para poder establecer entrada y salida.");

			}
			
			Input.toContinue();
			
		}else if(option==4) { // BUSCAR CAMINOS
			
			if(currentMaze.isLoaded()) {
				
				System.out.println("\t"+Config.SOLVE_MAZE);
				calculateMazeOptions(option);
				
			}else {
				
				System.out.println("Debe de cargar un laberinto para poder calcular una solución.");

			}
			
			Input.toContinue();
			
		}else if(option==5) { // METODO INFO
			
			currentSession.showUser();
			Input.toContinue();
			
		}else if(option==6) { // METODO LOGOUT
			
			currentSession.logOut();
			
			if(currentMaze.isLoaded()&& !currentSession.isLogged()) { // SI LA SESION SE CIERRA Y EL LABERINTO ESTA CARGADO, LO PONGO A NULL
				currentMaze = new Maze();
			}
			
			Input.toContinue();
			
		}
		
	}
	
	/* OPCIONES PARA USUARIOS NO REGISTRADOS */
	
	public static void unloggedOptions(int option) {
		
		if(option==0) { // METODO SALIR
			
			System.out.println(Config.EXIT);
			
			if(!Config.confirmExit()) {
				option=-1;
			}
			
		}else if(option==1) { // METODO LOGIN
		
			currentSession.login();
			
		}else if(option==2) { // METODO SIGNUP
			
			currentSession.signup();
			Input.toContinue();
			
		}
		
	}
	
	/* OPCIONES PARA LA RESOLUCION DE LABERINTOS */
	
	public static void calculateMazeOptions(int option) {
		
		// PROXIMAMENTE
		
	}
}