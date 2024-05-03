package repaso_chatgpt_1;

public class Administrativo extends Empleado{
	
	public int horasExtra;
	
	public Administrativo(String nombre, int id, double salario, int horasExtra) {
		
		super.nombre=nombre;
		super.id=id;
		super.salario=salario;
		this.horasExtra=horasExtra;
		
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
		
		System.out.println("administrativo");
		
	}
	
	
}