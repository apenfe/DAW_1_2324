package zoologicoPoo08;

/*
 * 
 * El zoológico cuenta con TRABAJADORES especializados. Estos trabajadores están asignados
 * a zonas según su especialidad. Un trabajador puede hacerse cargo de varias zonas y en una
 * zona pueden trabajar varios trabajadores. De cada trabajador interesa almacenar el nombre
 * y apellidos, su especialidad y su DNI.
 * 
 * Por ejemplo, “Ana García Rojas” es “veterinaria” con DNI 33445566H y tiene asignada la
 * zona de los “Felinos”, la zona de los “Primates” y la zona de los “Pequeños mamíferos”. Por
 * otro lado, “Antonio Ruiz Méndez” es “jardinero” con DNI 12123434F y tiene asignado la
 * zona de los “Felinos”, la zona de las “Aves rapaces” y la zona del “Restaurante”.
 * 
 * NOTA: para relacionar la clase TRABAJADOR con la clase ZONA cree una clase intermedia
 * llamada ASIGNACIÓN, que definirá la asignación de una zona a un trabajador. Aproveche
 * esta clase para almacenar los días que trabaja cada trabajador en cada zona (para
 * simplificar puede crear un campo de texto para almacenar este dato)
 * 
 * Por ejemplo, “Ana García Rojas” trabaja en la zona de los “Felinos” los días “lunes y
 * miércoles de 9 a 12 de la mañana”, y trabaja “todos los días de 13:00 a 14:00” en la zona de
 * los “Primates”. En la zona de los “Pequeños mamíferos” trabaja solo “el jueves por la tarde”
 * 
 */

public class Trabajadores{
	
	// asignados a zonas a una o varias
	// en una zona pueden haber varios trabajadores
	
	private String nombre;
	private String apellido;
	private String especialidad;
	private String dni; // unico
	
	public Trabajadores() {
		
	}
	
	public Trabajadores(String nombre, String apellido, String especialidad, String dni) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.especialidad=especialidad;
		this.dni=dni;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}