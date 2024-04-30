package chatgpt_2;

public class Perro extends Mascota implements Pelaje{
	
	public String tamano;
	
	public Perro(String id, String nombre, int edad, String tamano) {
		
		super.setEdad(edad);
		super.setId(id);
		super.setNombre(nombre);
		this.tamano=tamano;
		
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
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

	@Override
	public void colorPelo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}