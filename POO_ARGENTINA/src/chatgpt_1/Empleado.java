package chatgpt_1;

public abstract class Empleado{
	
	private String nombre;
	private String id;
	private double salario;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double calcularSalario();
	
	public abstract String mostrarDetalles();

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", salario=" + salario + "]";
	}
	
}
