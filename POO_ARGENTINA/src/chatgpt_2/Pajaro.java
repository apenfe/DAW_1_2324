package chatgpt_2;

public class Pajaro extends Mascota{
	
	public String tipo;

	public Pajaro(String id, String nombre, int edad, String tipo) {
		
		super.setEdad(edad);
		super.setId(id);
		super.setNombre(nombre);
		this.tipo=tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String calcularCostoMensaul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrarDetalles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}