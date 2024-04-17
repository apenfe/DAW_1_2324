package ejercicio_9;

public class Trabajador extends Humano implements java.lang.Comparable<Trabajador>{
	
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

	@Override
	public int compareTo(Trabajador o) {
		
		return Double.compare(calcularSalarioHora(), o.calcularSalarioHora());
		
	}

	@Override
	public String toString() {
		
		return "Trabajador: " + super.toString() + " ---> Salario por hora = " + calcularSalarioHora() + "]";
		
	}
	
}