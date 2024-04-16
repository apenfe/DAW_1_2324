package ejercicio_7;

public class Pedido extends Documento{
	
	public String cod_pedido;
	public String total;
	
	public Pedido(String codigo, String total) {
		
		this.cod_pedido=codigo;
		this.total=total;
		super.setPaginas("3");
		
	}

	@Override
	public String toString() {
		return "Pedido [cod_pedido=" + cod_pedido + ", total=" + total + ", paginas=" + super.getPaginas() + "]";
	}
	
}