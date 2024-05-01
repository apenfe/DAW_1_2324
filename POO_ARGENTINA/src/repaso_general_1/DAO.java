package repaso_general_1;

public interface DAO{
	
	public static final String USER="root";
	public static final String PASS="1234";
	public static final String DB="segunda";
	public static final String PORT="3306";
	public static final String HOST="127.0.0.1";
	public static final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DB;
	
	public boolean crearTabla();
	public boolean borrarTabla();
	public boolean insertarDato(String nombre);
	public void hacerConsulta();
	
}