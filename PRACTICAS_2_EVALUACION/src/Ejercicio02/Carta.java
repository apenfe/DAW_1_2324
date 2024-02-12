package Ejercicio02;

/* 
 * Carta.java
 * APF - 10-01-2024
 * 
 */

public class Carta{
	
	private String emisor;
	private String receptor;
	private String dirEmi;
	private String dirRecep;
	private String id;
	private String tipoCarta;
	
	public Carta() {
		
	}
	
	public Carta(String emisor, String receptor, String dirEmi, String dirRecep, String id, String tipoCarta) {
		this.emisor=emisor;
		this.receptor=receptor;
		this.dirEmi=dirEmi;
		this.dirRecep=dirRecep;
		this.id=id;
		this.tipoCarta=tipoCarta;
		
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getDirEmi() {
		return dirEmi;
	}

	public void setDirEmi(String dirEmi) {
		this.dirEmi = dirEmi;
	}

	public String getDirRecep() {
		return dirRecep;
	}

	public void setDirRecep(String dirRecep) {
		this.dirRecep = dirRecep;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoCarta() {
		return tipoCarta;
	}

	public void setTipoCarta(String tipoCarta) {
		this.tipoCarta = tipoCarta;
	}
	
	
}