package ejercicio_12;

/*
 * Un banco tiene clientes que pueden ser particulares o empresas y los siguientes tipos de cuentas:
 * 
 * 1. Depósitos.
 * Permiten retirar dinero.
 * 
 * 2. Crédito.
 * El cálculo de  su interés se realiza por meses utilizando la fórmula: numeroMeses * tipo de interés.
 * Si son clientes particulares no tienen ningún tipo de interés durante los 3 primeros meses.
 * Si son de empresas no tienen ningún tipo de interés durante los 2 primeros meses.
 * 
 * 3. Hipotecas.
 * El cálculo de  su interés se realiza por meses utilizando la fórmula: numeroMeses * tipo de interés.
 * Para particulares tienen la mitad de la tasa de interés durante los 6 primeros meses.
 * Para empresas, tienen la mitad de la tasa de interés durante los 12 primeros meses.
 * 
 * Se deben identificar las clases, interfaces y clases base abstractas e implementar la funcionalidad 
 * necesaria para el cálculo de intereses.
 * Deben seguirse los principios y estilo del código limpio.
 * 
 */

public abstract class Cuenta{
	
	public String nombre;
	public boolean tipoCliente;
	public double saldo;
	public double interesMensual;
	
	public void depositar(double cantidad) {
		
		saldo+=cantidad;
		
	}
	
	public abstract void calcularInteres();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(boolean tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}
	
}