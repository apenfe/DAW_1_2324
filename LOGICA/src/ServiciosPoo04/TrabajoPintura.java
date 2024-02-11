package ServiciosPoo04;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
	
	private double superficie;
	private double precioPintura;
	
	public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
		
		super(trabajador,fechaInicio,cliente);
		this.superficie=superficie;
		this.precioPintura= precioPintura;
		
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPrecioPintura() {
		return precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	@Override
	public double costeMaterial() {
		// TODO Auto-generated method stub
		return (superficie/7.8)*precioPintura;
	}

	@Override
	public double costeManoObra() {
		// TODO Auto-generated method stub
		return (superficie/10)*9.5;
	}

	@Override
	public double costeTotal() {
		// TODO Auto-generated method stub
		if(superficie<=50) {
			return (costeManoObra()+costeMaterial())*1.15;
		}else {
			return costeManoObra()+costeMaterial();
		}
	
	}

	@Override
	public String detalleServicio() {

		String salida="";
		
		salida+="TRABAJO DE PINTURA\n";
		salida+="cliente: "+getCliente()+"\n";
		salida+="Fecha Inicio: "+getFechaInicio()+"\n";
		salida+="----------------------------------------------\n";
		salida+="Pintor: "+getTrabajador()+"\n";
		salida+="Coste material ... "+costeMaterial()+"\n";
		salida+="Coste mano de obra ... "+costeManoObra()+"\n";
		salida+="Coste Adicional ... "+(costeTotal()-costeMaterial()-costeManoObra())+"\n";
		salida+="Coste Total ... "+(costeTotal())+"\n";
		
		return salida;

	}
	
	

	
}