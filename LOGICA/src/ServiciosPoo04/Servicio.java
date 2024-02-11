package ServiciosPoo04;

import java.time.LocalDate;

public abstract class Servicio{
	
	private String trabajador;
	private LocalDate fechaInicio;
	private String cliente;
	
	public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
		
		this.trabajador=trabajador;
		this.fechaInicio=fechaInicio;
		this.cliente=cliente;
		
	}

	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public abstract double costeMaterial(); 
	
	public abstract double costeManoObra();
		
	public abstract double costeTotal();
	
	public abstract String detalleServicio();
	
}