package repaso_chatgpt_1;

public class Gerente extends Empleado{
	
public int bono;
	
	public Gerente(String nombre, int id, double salario, int bono) {
		
		super.nombre=nombre;
		super.id=id;
		super.salario=salario;
		this.bono=bono;
		
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
		
		System.out.println("gerente");
		
	}
	
}