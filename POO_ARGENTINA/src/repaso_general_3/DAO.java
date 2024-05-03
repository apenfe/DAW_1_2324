package repaso_general_3;

public interface DAO{
	
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/segunda";
	public static final String USER = "root";
	public static final String PASS = "1234";

	public boolean crearTabla();
	public boolean borrarTabla();
	public boolean insertarDato(String[] nombres);
	public void hacerConsulta();
	
}