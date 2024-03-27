import Classes.Config;
import Classes.Input;
import Classes.Maze;
import Classes.Session;
import Classes.Utils;

/*
 * Main.java
 * 
 * 1. Introducción
 * 
 * En la primera entrega, se implementó toda la funcionalidad referente a la sesión de usuario en la aplicación (login, registro, 
 * mostrar usuario, cerrar sesión).
 * 
 * En la segunda entrega, se implementó la funcionalidad para cargar un laberinto desde un fichero de texto con extensión .txt, 
 * mostrar en pantalla un laberinto que previamente se haya cargado y establecer las casillas en inicio y fin del laberinto.
 * 
 * Para esta tercera entrega, se debe implementar el algoritmo o algoritmos que resuelvan el laberinto para llegar desde la casilla 
 * de inicio hasta la casilla de fin.
 * 
 * Dado que una vez se complete esta entrega el programa tendrá la funcionalidad mínima para considerarlo un programa completo, la 
 * versión de esta entrega será la versión v1.0.0
 * 
 * 2. Menús
 * 
 * En esta entrega hay que implementar la funcionalidad para la opción 4 del menú "Buscar caminos".
 * 
 * Una vez se seleccione la opción de "Buscar caminos", se debe mostrar por pantalla el siguiente menú:
 * 
 * Selecciona un camino
 * ------------------------
 * 1 - El primer camino posible
 * 2 - El camino mas corto
 * 0 - Cancelar
 * 
 * La opción 0 deberá volver atrás, no cerrar el programa.
 * 
 * 3. Clase Coordinate
 * Dado que para obtener el camino entre el inicio y el final se compone de una colección de pares de coordenadas "i" y "j", se debe 
 * crear una clase en la que almacenar los pares de coordenadas y, adicionalmente, la "dirección" hacia el siguiente movimiento 
 * (izquierda, derecha, arriba o abajo).
 * 
 * Se deben crear los atributos necesarios para que se puedan crear objetos de este tipo de clase.
 * 
 * 4. Modificaciones de la clase Maze
 * Se debe crear un atributo privado el cual será una lista dinámica que contendrá objetos Coordinate (la clase creada para guardar 
 * las coordenadas y dirección), donde se guardará la colección de objetos con las coordenadas de cada casilla por la que pasar para 
 * completar el camino que se está buscando. Se recomienda que sea un Stack (pila) o un ArrayList ya que el camino a buscar cambiará 
 * de tamaño en función de las dimensiones del laberinto, su distribución y las posiciones de inicio y fin. Si se quiere utilizar otro 
 * tipo de array o lista, se permite siempre que cumpla con la funcionalidad.
 * 
 * path: Stack, ArrayList o array de tipo "Coordinate" que utilizará el algoritmo para guardar las coordenadas y dirección del camino 
 * a buscar para luego mostrarlo.
 * 
 * 5. El primer camino posible
 * 
 * Se debe implementar un algoritmo que compruebe a través de la matriz las casillas por las que se puede pasar, para llegar desde la 
 * casilla establecida como la Inicio, hasta la casilla establecida como Fin.
 * 
 * Se debe actualizar la lista dinámica con las coordenadas según se va avanzando y, al final, terminará cuando se compruebe una casilla 
 * que coincida con las coordenadas de fin, lo que significa que se ha llegado al final.
 * 
 * Cuando se encuentre el camino, mostrará por pantalla el laberinto, marcando el camino con caracteres a modo de flechas (<, >, v, ^).
 * 
 * El camino más corto
 * 
 * El algoritmo funciona de forma similar al algoritmo anterior, con la diferencia que se debe quedar con el camino más corto, es decir, 
 * el camino con el menor número de pasos.
 * 
 * Para obtener el camino más corto, es necesario obtener todos los caminos posibles desde la inicio hasta la fin, de forma que, cada vez 
 * que se encuentra un camino válido, se comprueba si la cantidad de pasos es menor que el del último camino encontrado, en caso afirmativo, 
 * se guarda como el camino más corto.
 * 
 * Cuando ya no hayan más caminos posibles, el algoritmo terminará.
 * 
 * Como en el caso anterior, se debe mostrar por pantalla el camino sobre el mapa y las coordenadas de los pasos de forma secuencial:
 * 
 * 7. Otras consideraciones
 * 
 * El programa debe ser capaz tolerar los siguientes cambios:
 * 
 * Cambiar de laberinto sin tener que reiniciar el programa
 * Cambiar casillas de inicio y fin de un laberinto después de haberlo resuelto
 * Poder resolver el laberinto de con ambas opciones sin que de errores
 * 
 * IMPORTANTE: A la hora de comprobar casillas durante el camino, dibujar el laberinto con el camino, etc; la matriz con el laberinto no 
 * debería modificarse, ya que sustituir los espacios en blanco por los caracteres de las fechas, supondría complicaciones a la hora de hacer 
 * modificaciones al establecer nuevas coordenadas, buscar otro camino, etc, por lo que se recomienda usar solamente la lista de objetos de 
 * coordenadas que se han almacenado.
 * 
 * APF - 19.02.2024
 * version 1.0.0
 * 
 */

/**
 * 
 * Clase principal del proyecto Maze.
 * 
 * Compuesto por varios métodos estáticos que facilitan la navegación del usuario entre las diferentes opciones.
 * 
 * @author Adrián Peñalver Fernández
 * @version 1.0.0
 * 
 */

public class Main {
	
	/**
	 * Esta es una variable pública y estática que representa si el usuario ha iniciado o no la sesión.
	 */
	
	public static Session currentSession = new Session();
	
	/**
	 * Esta es una variable pública y estática que representa el laberinto cargado, con el se puede decidir
	 * si estan disponibles todas las opciones o no.
	 */
	
	public static Maze currentMaze = new Maze();
	
	/**
	 * Este método principal, da la bienvenida al usuario y le presenta un menu inicial
	 * con opciones de no loggeado.
	 * 
	 * Tras el loggin este método muestra el menu con las opciones correspondientes al inicio de sesión.
	 */
	
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
	
	/**
	 * Este método se encarga de mostrar al usuario las opciones disponibles una vez iniciada la sesión.
	 * @param option Entrada seleccionada por el usuario.
	 */
	
	public static void loggedOptions(int option) {
		
		if(option==0) { // METODO EXIT
			
			System.out.println(Config.EXIT);
			
			if(!Utils.confirmExit()) {
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
				
				System.out.println("\n\tDebe de cargar un laberinto para poder visualizarlo.");
				
			}
			
			Input.toContinue();
			
		}else if(option==3) { // METODO ESTABLECER ENTRADA Y SALIDA
			
			if(currentMaze.isLoaded()) {
				
				System.out.println("\t"+Config.SET_IN_OUT);
				currentMaze.setStartEnd();
				
			}else {
				
				System.out.println("\n\tDebe de cargar un laberinto para poder establecer entrada y salida.");

			}
			
			Input.toContinue();
			
		}else if(option==4) { // BUSCAR CAMINOS
			
			if(currentMaze.isLoaded() && currentMaze.inOutNotZero()) {
				
				System.out.println("\t"+Config.SOLVE_MAZE);
				solveMazeOptions();
				
			}else {
				
				System.out.println("\n\tDebe de cargar un laberinto para poder calcular una solución y establecer entrada y salida.");
				
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
	
	/**
	 * Este método se encarga de mostrar al usuario las opciones disponibles antes del inicio de sesión.
	 * 
	 * @param option Entrada seleccionada por el usuario.
	 */
	
	public static void unloggedOptions(int option) {
		
		if(option==0) { // METODO SALIR
			
			System.out.println(Config.EXIT);
			
			if(!Utils.confirmExit()) {
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
	
	/**
	 * Este método se encarga de complementar el menu de opciones de usuario logueados.
	 * 
	 * Permite al usuario seleccionar las diferentes formas de resolver el laberinto.
	 */
	
	public static void solveMazeOptions() {
		
		int option = -1;
		
		do {
			
			option = Input.getInt(Config.SOLVE_MAZE_MENU, false);
			
			if(option == 0) {
				
				if(Utils.confirmExit()) {
					break;
				}else {
					option = -1;
				}
				
			}else if(option == 1) {
				
				currentMaze.firstWay();
				
			}else if(option == 2) {
				
				currentMaze.shorterWay();
					
			}else {
				
				System.out.println("\n\tSeleccione una opción válida entre [0-2]");
				Input.toContinue();
				
			}
			
		}while(true);
		
	}
}