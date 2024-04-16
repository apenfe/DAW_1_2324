package ejercicio_3;

public class Trabajador extends Persona implements java.lang.Comparable<Trabajador>{
	
	public double salario;
	public double horasTrabajadas;
	
	public Trabajador(double horasTrabajadas, String nombre, String apellidos) {
		
		super.setApellidos(apellidos);
		super.setNombre(nombre);
		this.horasTrabajadas = horasTrabajadas;
		
	}

	public void calcularSueldo(double precio) {
		
		this.salario = precio * this.horasTrabajadas;
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public String toString() {
		
		return super.toString() + "---> Trabajador [salario=" + salario + ", horasTrabajadas=" + horasTrabajadas + "]";
		
	}

	@Override
	public int compareTo(Trabajador o) {
		
		return Double.compare(this.salario, o.salario);
		
	}
	
}