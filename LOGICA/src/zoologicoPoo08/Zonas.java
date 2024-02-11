package zoologicoPoo08;

/*
 * 
 * • El zoológico estará dividido en ZONAS. Cada zona tendrá un código identificativo, un
 * nombre y el número de metros cuadrados que ocupa.
 * 
 * Por ejemplo, la zona con código 01FEL, nombre “Felinos”, de 400 metros cuadrados
 * 
 */

public class Zonas{
	
	private String codigo;
	private String nombre;
	private double superficie;
	
	public Zonas() {
		
	}
	
	public Zonas(String codigo, String nombre, double superficie) {
		
		this.codigo=codigo;
		this.nombre=nombre;
		this.superficie=superficie;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
}