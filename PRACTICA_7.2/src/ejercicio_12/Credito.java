package ejercicio_12;

public class Credito extends Cuenta{
	
	public int meses;
	
	public Credito(String nombre, boolean tipoCliente, double saldo, double interesMensual, int meses) {
		
		super.interesMensual=interesMensual;
		super.nombre=nombre;
		super.tipoCliente=tipoCliente;
		super.saldo=saldo;
		this.meses=meses;
		
	}

	@Override
	public void calcularInteres() {
		
		if((tipoCliente && meses>=2)||(!tipoCliente && meses>=3)) {
			
			System.out.println(meses*interesMensual);

		}else{
			
			System.out.println("0");

		}
		
	}
	
	
}