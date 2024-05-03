package repaso_chatgpt_1;

public interface BaseDatos{
	
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/segunda";
	public static final String USER = "root";
	public static final String PASS = "1234";
	
	public void insertarGerente(Gerente g);
	public void leerGerentes();

}