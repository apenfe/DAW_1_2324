package chatgpt_1;

public interface BaseDatos{
	
	public final String USER = "root";
	public final String PASS = "1234";
	public final String DB = "cgpt";
	public final String IP = "127.0.0.1";
	public final String PORT = "3306";
	public final String URL = "jdbc:mysql://"+IP+":"+PORT+"/"+DB;
	
	public void leerEmpleados();
	
	public void insertarEmpleado(Empleado e, int b);
	
}