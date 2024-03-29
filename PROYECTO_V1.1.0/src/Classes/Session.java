package Classes;

/* 
 * Session.java
 * 
 * Esta clase contendrá cuatro atributos básicos:
 * 
 * user: "Será de tipo User y se usará para establecer en él la información del usuario que inicia sesión."
 * logged: "Propiedad de tipo booleana que contendrá el valor true si se ha iniciado sesión y false si no ha
 * iniciado sesión o se ha cerrado sesión. Cuando se cree un objeto de este tipo en el programa principal, se
 * inicializará con el valor false."
 * FILE_PATH: "Atributo constante que contiene la ruta dónde se encontrará el fichero con los usuarios para el login y registro"
 * USERS_FILE: "Atributo contante que contiene el nombre del fichero .txt que contendrá el listado de usuarios y su información"
 * 
 * Esta clase también contendrá una serie de métodos básicos:
 * 
 * (CONSTRUCTOR DE LA CLASE): "Simplemente inicializa la propiedad logged con el valor false. No recibe ningún parámetro".
 * Además de crear un nuevo ubjetos de la clase User.
 * 
 * login: "Se encargará de solicitar usuario y contraseña para iniciar sesión y controlar si se ha iniciado sesión correctamente o no".
 * 
 * signup: "Se encarga de solicitar los datos de registro para escribir en el fichero de usuarios el nuevo usuario. Deberá 
 * comprobar si el nombre de usuario ya existe o no, ya que no pueden repetirse".
 * 
 * isLogged: "Solamente devuelve el valor del atributo logged. Se utilizará en el programa principal para saber si hay o no
 * una sesión iniciada, para mostrar un menú u otro".
 *  
 * showUser: "Este método únicamente mostrará por pantalla la información del usuario con sesión iniciada".
 * 
 * logout: "Este método es el encargado de cerrar sesión, estableciendo la propiedad logged a false y limpiando cualquier
 * información almacenada en la propiedad user".
 *  
 * Todos los métodos indicados deben ser públicos; el resto de métodos adicionales que se irán creando según necesidad,
 * serán privados y serviran para hacer el programa más limpio y modular.
 * 
 * El resto de metodos (private) utilizados son:
 * 
 * primaryKey
 * secondaryKey
 * createUser
 * trowQuery
 * 
 * APF - 21-12-2023
 * VERSION: 0.1.0
 * 
 */

/* 
 * Session.java
 * 
 * Se añaden mejoras:
 * 
 * En login, solo se permite un intento.
 * 
 * En signup, se comprueba primeramente que el nombre de usuario sea unico.
 * 
 * APF - 31-01-2024
 * VERSION: 0.2.0
 * 
 */



/**
 * Clase Session utilizada para realizar todas las acciones del usuario durante una sesión,
 * asi como permitir que el usuario pueda registrarse o autenticarse.
 * 
 * @author Adrián Peñalver Fernández
 * @version 1.0.0
 * 
 */

public class Session{
	
	/* ATRIBUTOS PRIVADOS DE LA CLASE */
	
	/**
	 * Usuario asignado a la sesión actual.
	 */
	private User currentUser;
	private DAO db;
	
	/**
	 * boolean que nos permite conocer si el usuario se ha podido autenticar o no.
	 */
	private boolean logged;
	
	/* LISTADO DE MÉTODOS DE LA CLASE */
	
	/* CONSTRUCTOR DE LA CLASE */
	
	/**
	 * Constructor de la clase, el cual inicia la sesión con una autenticación en false
	 * y crea un usuario vacio.
	 */
	
	public Session() {
		
		this.logged=false; // INICIA COMO NO LOGGED
		this.currentUser= new User(); // CREA UN OBJETO USER
		this.db= new DAO(); // CREA UN OBJETO BASE DE DATOS
		
	}
	
	/* METODO LOGIN PARA EL ACCESO DE USUARIOS */
	
	/**
	 * Este método pregunata al ususuario su contraseña y nombre de usuario.
	 * En caso de encontrar coincidencia en el archivo, se establece el usuario
	 * y se especifica la autenticación a true.
	 */
	
	public void login() {

		System.out.println(Config.LOGIN);

		String[] userdata = new String[2]; // LEE USUARIO Y CONTRASEÑA
		userdata[0] = Input.getString("\n\tIntroduzca su nombre de usuario: ");
		userdata[1] = Input.getString("\tIntroduzca su contraseña: ");
		System.out.println();
		
		this.currentUser = db.login(userdata[0], userdata[1]);

		if (currentUser!=null) { // BUSCA UNA COOINCIDENCIA EN LA BASE DE DATOS
			
			System.out.println(Config.VERDE+"\tLogin Correcto: Bienvenido "+userdata[0]+"."+Config.RESET);
			this.logged=true;

		} else {
			System.out.println(Config.ROJO+"\t\tNombre de usuario y/o contraseña incorrectos."+Config.RESET);
		}

	}
	
	/* METODO SIGNUP PARA REGISTRAR NUEVOS USUARIOS */
	
	/**
	 * Este método permite crear un nuevo usuario.
	 * Primero se pregunta por un nombre de usuario único y en caso afirmativo,
	 * se preguntan el resto de datos.
	 * 
	 * Si todos los datos son correctos, el usuario se guarda en el fichero y ya podrá
	 * utilizar el método login().
	 */
	
	public void signup() {
		
		System.out.println(Config.SIGNUP);
		
		String[] userdata = new String[7]; 
			
		if(checkData(userdata)) { // COMPRUEBA QUE SEAN VALORES VALIDOS
				
			/* EN CASO AFIRMATIVO */
			System.out.println(Config.VERDE+"\tTodos los datos son correctos en la base de datos."+Config.RESET);
			
				
			if(db.checkUser(currentUser)) { // COMPRUEBA QUE SEAN UNICAS LAS PK
					
			
					
			}else {
					
				/* EN CASO NEGATIVO SE DA UN AVISO Y SE TERMINA */
					
				System.out.println(Config.VERDE+"\tTodos los datos son correctos y únicos en la base de datos."+Config.RESET);
			
			}
				
		}
				
	}
	
	/* METODO PARA VER LA INFORMACÓN COMPLETA DEL USUARIO */
	
	/**
	 * Este método se utiliza para mostrar toda la información referente al usuario logueado.
	 */
	
	public void showUser() {
		
		System.out.println(Config.USER);
		currentUser.info();
	}
	
	/* METODO PARA CERRAR LA SESION DEL USUARIO */
	
	/**
	 * Este método permite cerrar la sesión del actual usuario.
	 * Cambia la autenticación a false y pone el usuario a null.
	 */
	
	public void logOut() {
		
		System.out.println(Config.LOGOUT);
		
		if(Utils.confirmExit("\n\t¿Seguro que desea cerrar la sesión? SI - s ","S")) { // PIDE CONFIRMACION ANTES DE CERRAR SESION
			System.out.println("\n\tHasta la proxima " + currentUser.username + ".");
			System.out.println("\tSESION CERRADA");
			logged=false; // SE PONE A FALSE PARA VOLVER A MENU INICIAL
			this.currentUser= new User(); // EL USUARIO SE PONE A NULL
		}
		
	}
	
	/* METODO PARA COMPROBAR SI EL USUARIO HA INICIADO O NO LA SESIÓN */
	
	/**
	 * Este método permite conocer el estado de autenticación del usuario de la sesión.
	 * 
	 * @return boolean True si está autenticado y false en caso de no estarlo.
	 */
	
	public boolean isLogged() {
		
		return this.logged;
	}
	
	/* COMPRUEBA QUE LOS DATOS INTRODUCIDOS SIGAN PAUTAS CORRECTAS PARA LAS PK */
	/* SE UTILIZA EN EL METODO signUp() */
	
	private boolean checkData(String[] userdata) {
				
		String username = Input.getString("\n\n\tIntroduzca un nombre de usuario: ");
				
		if(!Utils.validateName(username)) {
					
			System.out.println(Config.ROJO+"\t\tFormato de Nickname incorrecto."+Config.RESET);
			System.out.println(Config.ROJO+"\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;
			
		}
		
		String nif = Input.getString("\n\n\tIntroduzca un NIF: ");
		
		if(!Utils.validateNif(nif)) {
					
			System.out.println(Config.ROJO+"\t\tFormato de Nickname incorrecto."+Config.RESET);
			System.out.println(Config.ROJO+"\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;

		}
		
		String email = Input.getString("\n\n\tIntroduzca un email: ");
		
		if(!Utils.validateEmail(email)) {
					
			System.out.println(Config.ROJO+"\t\tFormato de Nickname incorrecto."+Config.RESET);
			System.out.println(Config.ROJO+"\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;

		}
		
		userdata[1] = Input.getString("\tIntroduzca una contraseña: ");
		if(!Utils.validatePassword(userdata[1])) {
	
			System.out.println(Config.ROJO+"\t\tContraseña demasiado larga. (MAX 25)"+Config.RESET);
			System.out.println(Config.ROJO+"\n\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;
				
		}
			
		userdata[2] = Input.getString("\tIntroduzca su nombre completo: ");
		if(!Utils.validateName(userdata[2])) {
				
			System.out.println(Config.ROJO+"\t\tFormato de nombre no valido."+Config.RESET);
			System.out.println(Config.ROJO+"\n\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;
				
		}
			
		userdata[5] = Input.getString("\tIntroduzca una dirección postal: ");
			
		userdata[6] = Input.getString("\tIntroduzca su fecha de nacimiento (DD/MM/AA): "); 
		if(!Utils.validateDate(userdata[6])) {
				
			System.out.println(Config.ROJO+"\t\tFormato de fecha no valido."+Config.RESET);
			System.out.println(Config.ROJO+"\n\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
			return false;
				
		}
				
		System.out.println("\n\tCreando usuario, por favor espere...");
		return true;
		
	}
	
}