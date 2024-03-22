import herencia.*;

public class Herencia1{
	
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno("Adrian","Peñalver","adrian@h.es","MCdonell","123456");
		Persona p1 = new Persona("Adrian","Peñalver","adrian@h.es","MCdonell");
	

		Profesor prof1 = new Profesor("David","Munuera","munuera@h.es","MCdonell","873223");

		System.out.println("El alumno es " + alu1.getNombre() + " y su apellido es " + alu1.getApellidos());
		System.out.println(alu1);
		System.out.println(prof1);
	}
	
}