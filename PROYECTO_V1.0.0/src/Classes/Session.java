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

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;
import java.io.BufferedWriter;

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
	
	/**
	 * boolean que nos permite conocer si el usuario se ha podido autenticar o no.
	 */
	private boolean logged;
	private final String FILE_PATH = ".\\assets\\files\\"; // EN WINDOWS SE DEBE DE PONER .\ AL INICIO Y EN EL RESTO DE LA RUTA \
	private final String USER_FILE = "users.txt"; // NOMBRE DEL ARCHIVO
	
	/* LISTADO DE MÉTODOS DE LA CLASE */
	
	/* CONSTRUCTOR DE LA CLASE */
	
	/**
	 * Constructor de la clase, el cual inicia la sesión con una autenticación en false
	 * y crea un usuario vacio.
	 */
	
	public Session() {
		
		this.logged=false; // INICIA COMO NO LOGGED
		this.currentUser= new User(); // CREA UN OBJETO USER
		
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

		if (trowQuery(userdata, FILE_PATH + USER_FILE, "#", "login")) { // BUSCA UNA COOINCIDENCIA EN EL FICHERO

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
		boolean follow=true;
		
		do { /* PEDIRÁ DATOS PK HASTA QUE SEAN UNICOS Y CORRECTOS */
			
			if(primaryKey(userdata)) { // COMPRUEBA QUE SEAN VALORES VALIDOS PARA PK
				
				/* EN CASO AFIRMATIVO */
				
				if(trowQuery(userdata,FILE_PATH+USER_FILE,"#","signup")) { // COMPRUEBA QUE SEAN UNICOS
					
					/* EN CASO NEGATIVO PREGUNTA SI DESEA VOLVER A INTENTARLO */
					
					if(!Config.confirmExit("\n\t¿Desea volver a intentarlo? Si - s: ","s")) {
						follow=false;
						break;
					}
					
				}else {
					
					/* EN CASO AFIRMATIVO SE DA UN AVISO Y SE COMIENZA A COMPROBAR EL RESTO DE DATOS */
					
					System.out.println(Config.VERDE+"\tTodos los datos son correctos y únicos en la base de datos."+Config.RESET);
					break;
				}
				
			}else {
				follow=false;
				break;
			}
			
		}while(true);	
		
		/* SI EL USUARIO HA DESISTIDO ESTE PASO SE SALTA */
		/* SI NO DESISTE Y LOS PK SON UNICOS Y CORRECTOS */
			
		while(follow){ // MIENTRAS NO SE CREA UN USUARIO O HASTA QUE USUARIO DESISTA
				
			if(secondaryKey(userdata)) { // SI DATOS SECUNDARIOS SON CORRECTOS if(secondaryKey2(userdata)) {
				
				createUser(FILE_PATH+USER_FILE,"#",userdata); // SE CREA UN NUEVO USUARIO EN EL FICHERO
				break;
				
			}else { // SI EL USUARIO DESISTE, EL PROGRAMA TERMINA Y NO SE CREA NINGÚN USUARIO
					
				break;
					
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
		
		if(Config.confirmExit("\n\t¿Seguro que desea cerrar la sesión? SI - s ","S")) { // PIDE CONFIRMACION ANTES DE CERRAR SESION
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
	
	/* METODO SECUNDARIO PARA INSERTAR UN NUEVO USUARIO EN EL FICHERO */
	/* SE UTILIZA EN EL METODO signUp() */
	
	private void createUser(String file, String symbol, String[] data) {
		
		/* ESTE METODO RECIBE UN ARRAY CON TODOS LOS DATOS CORRECTOS DEL USUARIO */
		
		 try {
		    	
			    File dataBase = new File(file);
	            BufferedWriter dataIn = new BufferedWriter(new FileWriter(dataBase, true));
			    
	            /* CONCATENA LA INFO CON EL CARACTER DESEADO Y LO ESCRIBE EN EL FICHERO */
	            
	            dataIn.write("\n"+data[0]+symbol+data[1]+symbol+data[2]+symbol+data[3]+symbol+data[4]+symbol+data[5]+symbol+data[6]+symbol+"user");
			    dataIn.close();
			    
			    System.out.println(Config.VERDE+"\n\tProceso finalizado, el usuario \""+data[0]+"\" ha quedado correctamente registrado."+Config.RESET);
			      
			  } catch (IOException e) {
			    	
			      System.out.println(Config.ROJO+"\tHa ocurrido un error al crear el usuario en el archivo."+Config.RESET);
			      
			  }
		
	}
	
	/* METODO SECUNDARIO PARA HACER LECTURAS EN EL FICHERO */
	/* SE UTILIZA EN EL METODO signUp(), ASÍ COMO EN EL MÉTODO logIn() */
	
	private boolean trowQuery(String[] userdata, String file, String symbol, String option) {
			
		boolean check = false;
			
			try {
				
				File dataBase = new File(file);
				Scanner query = new Scanner(dataBase);
				
				while(query.hasNextLine()) { // MIENTRAS QUEDE UNA NUEVA LINEA EN EL FICHERO ABIERTO...
					
					String[] data = query.nextLine().split(symbol); // SE OBTIENEN LOS DATOS DE CADA USUARIO
					
					if(option.equals("login")) { /* SI HEMOS ELEGIDO LA OPCION LOGIN */
						
						if(data.length<8||data.length>8) { // EN CASO DE QUE EL FICHERO SE MANIPULE DE FORMA ANORMAL
							
							/* ERROR */
							System.out.println(Config.ROJO+"\n\tERROR --> EL ARCHIVO PUEDE ESTAR DAÑADO.\n"+Config.RESET);
							System.out.println(Config.ROJO+"\tPONGASE EN CONTACTO CON EL SERVICIO TÉCNICO.\n"+Config.RESET);
							break; 
						}
						
						if(data[0].equals(userdata[0]) && data[1].equals(userdata[1])) { // COMPRUEBA SI USUARIO Y CONTRASEÑA COINCIDEN
							
							/* EN CASO AFIRMATIVO */
							
							System.out.println(Config.VERDE+"\tLogin Correcto: Bienvenido "+userdata[0]+"."+Config.RESET);
							this.logged=true;
							this.currentUser= new User(data[0], data[2], data[3], data[4], data[5], data[6], data[7]);
							check=true;
							break;
						}
						
					}else if(option.equals("signup")) { /* SI HEMOS ELEGIDO LA OPCION SIGNUP */
						
						if(data.length<8||data.length>8) { // EN CASO DE QUE EL FICHERO SE MANIPULE DE FORMA ANORMAL
							
							/* ERROR */
							System.out.println(Config.ROJO+"\n\tERROR --> EL ARCHIVO PUEDE ESTAR DAÑADO.\n"+Config.RESET);
							System.out.println(Config.ROJO+"\tPONGASE EN CONTACTO CON EL SERVICIO TÉCNICO.\n"+Config.RESET);
							check =true;
							break;
						}
						
						if(data[0].equals(userdata[0]) ) { // SI HAY ALGUNA COINCIDENCIA DE PK
							
							/* SE INDICAN LAS COINCIDENCIAS */
							System.out.println(Config.ROJO+"\n\t\tRegistro incorrecto (ERROR):"+Config.RESET);
							System.out.println(Config.ROJO+"\t\t- Nombre de usuario en uso."+Config.RESET);
							
							check = true;
					
						}
						
					}

				}
				
				query.close();
				
			}catch(FileNotFoundException e) {
				
				System.out.println(Config.ROJO+"\t--- Ha ocurrido un error durante la lectura del archivo ---\n"+Config.RESET);
			    
			}
			
			return check;	
	}
	
	/* COMPRUEBA QUE LOS DATOS INTRODUCIDOS SIGAN PAUTAS CORRECTAS PARA LAS PK */
	/* SE UTILIZA EN EL METODO signUp() */
	
	private boolean primaryKey(String[] userdata) {
			
			do { /* MIENTRAS NO SEAN DATOS VALIDOS O EL USUARIO PERSISTA */
				
				userdata[0] = Input.getString("\n\n\tIntroduzca un nombre de usuario: ");
				
				if(!Config.checkMaxLong(userdata[0],25)||!Config.checkSymbols(userdata[0])||!Config.checkName(userdata[0])) {
					
					System.out.println(Config.ROJO+"\t\tFormato de Nickname incorrecto."+Config.RESET);
					System.out.println(Config.ROJO+"\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
					
					if(!Config.confirmExit("\n\t¿Desea volver a intentarlo? Si - s: ","s")) { // SI NO DESEA SEGUIR SE DEVUELVE FALSE
						return false;
					}
					
				}else {
					
					return true;
					
				}
				
			}while(true);
		
	}
	
	/* METODO QUE COMPRUEBA QUE EL RESTO DE DATOS SECUNDARIOS INTRODUCIDOS SIGAN PAUTAS CORRECTAS */
	/* SE UTILIZA EN EL METODO signUp() */
	
	private boolean secondaryKey(String[] userdata) {
		
		do { /* MIENTRAS NO SEAN DATOS VALIDOS O EL USUARIO PERSISTA */
			
			int cont =6; // UTILIZADO PARA SABER SI HAY ALGUN ERROR   /*
			
			//----------------------------------------------------------
			
			userdata[3] = Input.getString("\tIntroduzca su NIF (12345678X): ");
			
			if(!Config.checkNif(userdata[3])) {
				cont --;
				System.out.println(Config.ROJO+"\t\tFormato de NIF incorrecto."+Config.RESET);
			}
			
			userdata[4] = Input.getString("\tIntroduzca su dirección de correo electronico: ");
			
			if(!Config.checkEmail(userdata[4])) {
				cont --;
				System.out.println(Config.ROJO+"\t\tFormato de Email incorrecto."+Config.RESET);
			}
			
			//------------------------------------------------------
			
			userdata[1] = Input.getString("\tIntroduzca una contraseña: ");
			if(!Config.checkMaxLong(userdata[1],25)) {
				cont--;
				System.out.println(Config.ROJO+"\t\tContraseña demasiado larga. (MAX 25)"+Config.RESET);
			}
			
			userdata[2] = Input.getString("\tIntroduzca su nombre completo: ");
			if(!Config.checkName(userdata[2])) {
				cont--;
				System.out.println(Config.ROJO+"\t\tFormato de nombre no valido."+Config.RESET);
			}
			
			userdata[5] = Input.getString("\tIntroduzca una dirección postal: ");
			if(!Config.checkMaxLong(userdata[5],100)) {
				cont--;
				System.out.println(Config.ROJO+"\t\tDireccion demasiado larga. (MAX 100)"+Config.RESET);
			}
			
			userdata[6] = Input.getString("\tIntroduzca su fecha de nacimiento (DD/MM/AA): "); 
			if(!Config.checkBirthdate(userdata[6],2023)) {
				cont--;
				System.out.println(Config.ROJO+"\t\tFormato de fecha no valido."+Config.RESET);
			}
			
			if(cont==6) { // SI NO HAY ERROR DEVUELVE TRUE
				
				System.out.println("\n\tCreando usuario, por favor espere...");
				return true;
				
			}else if(cont<6) { // SI HAY ALGUN ERROR PREGUNTA SI DESEA SEGUIR
				
				System.out.println(Config.ROJO+"\n\tPor favor, corrija los campos indicados antes de continuar con el registro."+Config.RESET);
				
				if(!Config.confirmExit("\n\t¿Desea volver a intentarlo? Si - s: ","s")) {
					return false;
				}
			}
			
		}while(true);
	
	}
	
}