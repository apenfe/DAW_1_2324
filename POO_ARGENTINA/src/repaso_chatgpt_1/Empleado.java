package repaso_chatgpt_1;

public abstract class Empleado{
	
	public String nombre;
	public int id;
	public double salario;
	
	public abstract double calcularSalario();
	public abstract String mostrarDetalles();
	
	public void tipoTrabajador() {
		
		System.out.println("empleado");
		
	}
	
}
