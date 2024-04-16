package RRHH;

import ejercicio_7.*;

public class Contrato extends Documento{
	
	public String funcion;
	public String duarcion;
	
	

	public Contrato(String funcion, String duarcion, String paginas) {
		super(paginas);
		this.funcion = funcion;
		this.duarcion = duarcion;
	}

	@Override
	public String toString() {
		return "Contrato [funcion=" + funcion + ", duarcion=" + duarcion + ", paginas=" + super.getPaginas() +"]";
	}
	
}