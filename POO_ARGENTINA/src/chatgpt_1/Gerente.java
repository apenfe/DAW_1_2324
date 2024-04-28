package chatgpt_1;

public class Gerente extends Empleado{
	
	public int bono;
	
	public Gerente(String nombre, String id, double salario, int bono) {
		
		super.setId(id);
		super.setNombre(nombre);
		super.setSalario(salario);
		this.bono=bono;
		
	}

	@Override
	public double calcularSalario() {
		
		return super.getSalario()*(this.bono/2);
	}

	@Override
	public String mostrarDetalles() {
		
		return super.toString()+" --> "+this.bono;
		
	}
	
}