package parkingPoo05;

public class ParkingException extends Exception{
	
	private final String mensaje;
	private final String matricula;
	
	public ParkingException(String mensaje, String matricula) {
		this.mensaje = mensaje;
		this.matricula = matricula;
	}
	
	public String getMessage() {
		return mensaje;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
}