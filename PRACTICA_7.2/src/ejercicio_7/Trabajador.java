package ejercicio_7;

public class Trabajador extends Humano{
	
	public double sueldo;
	public int horasTrabajadas;
	
	public Trabajador(double sueldo, int horasTrabajadas, String nombre, String apellidos) {
		
		super.setApellidos(apellidos);
		super.setNombre(nombre);
		this.sueldo=sueldo;
		this.horasTrabajadas=horasTrabajadas;
		
	}
	
	public double calcularSalarioHora() {
		
		return sueldo/horasTrabajadas;
		
	}
	
}