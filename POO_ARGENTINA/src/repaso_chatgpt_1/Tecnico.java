package repaso_chatgpt_1;

public class Tecnico extends Empleado{
	
	public int proyectos;
	
	public Tecnico(String nombre, int id, double salario, int proyectos) {
		
		super.nombre=nombre;
		super.id=id;
		super.salario=salario;
		this.proyectos=proyectos;
		
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String mostrarDetalles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void tipoTrabajador() {
		
		System.out.println("tecnico");
		
	}
	
}
