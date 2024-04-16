package ejercicio_7;

public class Factura extends Documento{
	
	public String cod_factura;
	public String total;
	
	public Factura(String codigo, String total) {
		
		this.cod_factura=codigo;
		this.total=total;
		super.setPaginas("2");
		
	}

	@Override
	public String toString() {
		return "Factura [cod_factura=" + cod_factura + ", total=" + total + ", paginas=" + super.getPaginas() + "]";
	}
	
}