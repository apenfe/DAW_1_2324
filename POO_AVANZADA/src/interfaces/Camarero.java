package interfaces;

public class Camarero extends Persona implements Acciones, Acciones2{
	
	public int codigo;

	@Override
	public void atenderCliente() {
		System.out.println("atendido");
		
	}

	@Override
	public void recogerMesa() {
		System.out.println("recogida");		
	}

	@Override
	public void cobrarCliente() {
		System.out.println("cobrado");		
	}
	
	@Override
	public void recogerTodo() {
		System.out.println("recogido");		
	}
		
}