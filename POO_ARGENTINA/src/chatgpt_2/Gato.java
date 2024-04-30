package chatgpt_2;

public class Gato extends Mascota implements Pelaje{
	
	public String sexo;
	
	public Gato(String id, String nombre, int edad, String sexo) {
		
		super.setEdad(edad);
		super.setId(id);
		super.setNombre(nombre);
		this.sexo=sexo;
		
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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