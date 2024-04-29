package chatgpt_2;

public interface RegistroMascotas{
	
	public static final String USER = "root";
	public static final String PASS = "1234";
	public static final String DB = "animales";
	public static final String PORT = "3306";
	public static final String IP = "127.0.0.1";
	public static final String URL = "jdbc:mysql://"+IP+":"+PORT+"/"+DB;
	
	public boolean cargarAnimal(Gato g);
	
	public boolean cargarAnimal(Pajaro p);
	
	public boolean cargarAnimal(Perro p);
	
	public boolean cargarAnimal(Mascota m);
	
	public void leerAlgo(String consulta);
	
}