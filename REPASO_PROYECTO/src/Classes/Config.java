package Classes;

public class Config{
	
	/* LISTADO DE ATRIBUTOS ESTATICOS */
	
	public static final String VERSION = "✅ -- Version: 0.1.0 --";
	public static final String WELCOME ="\nBIENVENIDO A ARIADNE-SOFT.\n";	
	public static final String GOODBYE = " FIN DEL PROGRAMA ";
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
	
	public static final String SOON = " PROXIMAMENTE ";
	   
	/* LISTADO DE MÉTODOS ESTATICOS */
	
	/* METODO PARA CONFIRMAR LA SALIDA CON UNA S u s */
	
	public static boolean confirmExit() {
		
		if(Input.getString("\n\t¿Está seguro que desea salir? SI -> s ").equalsIgnoreCase("S")) {
			return true;
		}else {
			return false;
		}
	}

}