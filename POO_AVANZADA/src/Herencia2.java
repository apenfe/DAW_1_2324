import herencia.*;

public class Herencia2{
	
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno("Adrian","Peñalver","adrian@h.es","MCdonell","123456");
		//Persona p1 = new Persona("Adrian","Peñalver","adrian@h.es","MCdonell");
		//Profesor prof1 = new Profesor("David","Munuera","munuera@h.es","MCdonell","873223");
		Interino inter1 = new Interino("nombre", "String apellidos", "String email", "String direccion", "String nrp", "String sustituye");

		System.out.println("El alumno es " + alu1.getNombre() + " y su apellido es " + alu1.getApellidos());
		System.out.println(alu1);
		//System.out.println(prof1);
	}
	
}