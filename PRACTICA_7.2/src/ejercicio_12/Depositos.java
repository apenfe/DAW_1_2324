package ejercicio_12;

public class Depositos extends Cuenta implements Retirar{
	
	/*
	 * Un banco tiene clientes que pueden ser particulares o empresas y los siguientes tipos de cuentas:
	 * 
	 * 1. Depósitos.
	 * Permiten retirar dinero.
	 * 
	 * 
	 */

	public int meses;
	
	public Depositos(String nombre, boolean tipoCliente, double saldo, double interesMensual, int meses) {
		
		super.interesMensual=interesMensual;
		super.nombre=nombre;
		super.tipoCliente=tipoCliente;
		super.saldo=saldo;
		this.meses=meses;
		
	}
	
	@Override
	public void calcularInteres() {
		
		if(saldo>=1000) {
			
			System.out.println(meses*interesMensual);

		}else {
			
			System.out.println("0");

		}
		
	}

	@Override
	public boolean PosibleRetirar() {
		
		if(saldo>0) {
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean retirar(double cantidad) {
		
		if(PosibleRetirar() && cantidad<= saldo) {
			
			saldo -= cantidad;
			return true;
		}else {
			
			return false;
			
		}

	}	
	
}