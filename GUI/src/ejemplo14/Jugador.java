package ejemplo14;

public class Jugador{
	
	public String nombre;
	public String dorsal;
	public String fechaNacimiento;
	public String nacionalidad;
	public String posicion;
	public String equipo;
	
	public Jugador(String nombre, String dorsal, String posicion, String fechaNacimiento, String nacionalidad, String equipo) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
		this.posicion=posicion;
	}
	
}