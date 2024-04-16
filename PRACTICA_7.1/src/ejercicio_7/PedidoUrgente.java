package ejercicio_7;

public class PedidoUrgente extends Pedido{
	
	public String urgencia;
	
	public PedidoUrgente(String codigo, String total, String urgencia) {
		
		super(codigo,total);
		this.urgencia=urgencia;
		
	}

	@Override
	public String toString() {
		return super.toString()+" [urgencia=" + urgencia + "]";
	}
	
}