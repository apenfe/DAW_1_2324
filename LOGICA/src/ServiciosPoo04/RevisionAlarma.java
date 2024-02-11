package ServiciosPoo04;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
	
	private int alarmasRevisar;
	
	public RevisionAlarma(LocalDate fechaInicio, String cliente, int alarmasRevisar) {
		
		super("Especialista contraincendios",fechaInicio,cliente);
		this.alarmasRevisar=alarmasRevisar;
		
	}

	public int getAlarmasRevisar() {
		return alarmasRevisar;
	}

	public void setAlarmasRevisar(int alarmasRevisar) {
		this.alarmasRevisar = alarmasRevisar;
	}

	@Override
	public double costeMaterial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costeManoObra() {
		// TODO Auto-generated method stub
		return (alarmasRevisar/3)*40;
	}

	@Override
	public double costeTotal() {
		// TODO Auto-generated method stub
			return costeManoObra();
	
	}

	@Override
	public String detalleServicio() {

		String salida="";
		
		salida+="REVISION ALARMAS\n";
		salida+="cliente: "+getCliente()+"\n";
		salida+="Fecha Inicio: "+getFechaInicio()+"\n";
		salida+="----------------------------------------------\n";
		salida+="Coste Total ... "+(costeTotal())+"\n";
		salida+="----------------------------------------------\n";
		
		return salida;

	}
	
	

	
}