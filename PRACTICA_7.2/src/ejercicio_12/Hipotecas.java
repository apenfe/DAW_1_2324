package ejercicio_12;

public class Hipotecas extends Cuenta{
	
	public int meses;
	
	public Hipotecas(String nombre, boolean tipoCliente, double saldo, double interesMensual, int meses) {
		
		super.interesMensual=interesMensual;
		super.nombre=nombre;
		super.tipoCliente=tipoCliente;
		super.saldo=saldo;
		this.meses=meses;
		
	}

	@Override
	public void calcularInteres() {
		
		if(tipoCliente && meses<12) {
			
			System.out.println(meses*(interesMensual/2));
			
		}else if(tipoCliente && meses>=12) {
			
			System.out.println(meses*(interesMensual));
			
		}else if(!tipoCliente && meses<6) {
			
			System.out.println(meses*(interesMensual/2));
			
		}else if(!tipoCliente && meses>=6) {
			
			System.out.println(meses*(interesMensual));
			
		}
		
	}
	
}