package Ejercicio02;

/* 
 * Ordenador.java
 * APF - 10-01-2024
 * 
 */

public class Ordenador{
	
	private String departamento;
	private String mac;
	private String ipfija;
	private String puesto;
	private String[] usuarios;
	
	public Ordenador() {
		
	}
	
	public Ordenador(String departamento, String mac, String ipfija, String puesto, String[] usuarios) {
		this.departamento=departamento;
		this.mac=mac;
		this.ipfija=ipfija;
		this.puesto=puesto;
		this.usuarios=usuarios;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIpfija() {
		return ipfija;
	}

	public void setIpfija(String ipfija) {
		this.ipfija = ipfija;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String[] usuarios) {
		this.usuarios = usuarios;
	}

	
	
	
}