package chatgpt_1;

public class Tecnico extends Empleado{
	
	public int proyectosAsigandos;
	
	public Tecnico(String nombre, String id, double salario, int proyectosAsignados) {
		
		super.setId(id);
		super.setNombre(nombre);
		super.setSalario(salario);
		this.proyectosAsigandos=proyectosAsignados;
		
	}

	@Override
	public double calcularSalario() {
		
		return super.getSalario()*(this.proyectosAsigandos/2);
	}

	@Override
	public String mostrarDetalles() {
		
		return super.toString()+" --> "+this.proyectosAsigandos;
		
	}
	
}
