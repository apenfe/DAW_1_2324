package chatgpt_1;

public class Administrativo extends Empleado{
	
	public int horasExtra;
	
	public Administrativo(String nombre, String id, double salario, int horasExtra) {
		
		super.setId(id);
		super.setNombre(nombre);
		super.setSalario(salario);
		this.horasExtra=horasExtra;
		
	}

	@Override
	public double calcularSalario() {
		
		return super.getSalario()*this.horasExtra;
	}

	@Override
	public String mostrarDetalles() {
		
		return super.toString()+" --> "+this.horasExtra;
		
	}
	
}
