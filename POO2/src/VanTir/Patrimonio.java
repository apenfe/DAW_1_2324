package VanTir;

import java.util.Arrays;

public class Patrimonio{
	
	private double balance;
	
	private double activo;
	private double pasivo;
	
	private double pasivoNoCorriente;
	private double pasivoCorriente;
	private double netoPatrimonial;
	
	private double[] activoNoCorriente;
	private double[] activoCorriente;
	
	public Patrimonio(boolean check) {
		
		if(check) {
			
			this.activoNoCorriente= new double[3];
			System.out.println("\nACTIVO NO CORRIENTE: ");
			activoNoCorriente[0] = Entrada.pedirDouble("\tInserte el INMOBILIZADO MATERIAL: ", true);
			activoNoCorriente[1] = Entrada.pedirDouble("\tInserte el INMOBILIZADO INTANGIBLE: ", true);
			activoNoCorriente[2] = Entrada.pedirDouble("\tInserte el INMOBILIZADO FINANCIERO: ", true);
			
			this.activoCorriente= new double[3];
			System.out.println("\nACTIVO CORRIENTE: ");
			activoCorriente[0] = Entrada.pedirDouble("\tInserte las EXISTENCIAS: ", true);
			activoCorriente[1] = Entrada.pedirDouble("\tInserte el DISPONIBLE: ", true);
			activoCorriente[2] = Entrada.pedirDouble("\tInserte el REALIZABLE: ", true);
			
			pasivoCorriente = Entrada.pedirDouble("\nPASIVO CORRIENTE: ", true);
			pasivoNoCorriente = Entrada.pedirDouble("PASIVO NO CORRIENTE: ", true);
			netoPatrimonial = Entrada.pedirDouble("NETO PATRIMONIAL: ", true);
			
			this.pasivo=pasivoCorriente+pasivoNoCorriente+netoPatrimonial;
			
			for (int i = 0; i < 3; i++) {
			
				this.activo+=activoNoCorriente[i]+activoCorriente[i];
				
			}
			
			this.balance = pasivo-activo;
			System.out.println();
			
		}
		
	}
	
	public Patrimonio(Patrimonio anterior, String incognita) {

		this.activoNoCorriente = new double[3];
		activoNoCorriente[0] = anterior.getActivoNoCorriente()[0];
		activoNoCorriente[1] = anterior.getActivoNoCorriente()[1];
		activoNoCorriente[2] = anterior.getActivoNoCorriente()[2];

		this.activoCorriente = new double[3];
		activoCorriente[0] = anterior.getActivoCorriente()[0];
		activoCorriente[1] = anterior.getActivoCorriente()[1];
		activoCorriente[2] = anterior.getActivoCorriente()[2];

		if (incognita.equals("neto patrimonial")) {

			netoPatrimonial = anterior.getNetoPatrimonial() + (anterior.getBalance() * -1);
			pasivoNoCorriente = anterior.getPasivoNoCorriente();
			pasivoCorriente = anterior.getPasivoCorriente();

		} else if (incognita.equals("pasivo no corriente")) {

			pasivoNoCorriente = anterior.getPasivoNoCorriente() + (anterior.getBalance() * -1);
			netoPatrimonial = anterior.getNetoPatrimonial();
			pasivoCorriente = anterior.getPasivoCorriente();

		} else if (incognita.equals("pasivo corriente")) {

			pasivoCorriente = anterior.getPasivoCorriente() + (anterior.getBalance() * -1);
			pasivoNoCorriente = anterior.getPasivoNoCorriente();
			netoPatrimonial = anterior.getNetoPatrimonial();

		} else {

			pasivoCorriente = anterior.getPasivoCorriente();
			pasivoNoCorriente = anterior.getPasivoNoCorriente();
			netoPatrimonial = anterior.getNetoPatrimonial();

		}

		this.pasivo = pasivoCorriente + pasivoNoCorriente + netoPatrimonial;

		for (int i = 0; i < 3; i++) {

			this.activo += activoNoCorriente[i] + activoCorriente[i];

		}

		this.balance = pasivo - activo;
		System.out.println();

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getActivo() {
		return activo;
	}

	public void setActivo(double activo) {
		this.activo = activo;
	}

	public double getPasivo() {
		return pasivo;
	}

	public void setPasivo(double pasivo) {
		this.pasivo = pasivo;
	}

	public double getPasivoNoCorriente() {
		return pasivoNoCorriente;
	}

	public void setPasivoNoCorriente(double pasivoNoCorriente) {
		this.pasivoNoCorriente = pasivoNoCorriente;
	}

	public double getPasivoCorriente() {
		return pasivoCorriente;
	}

	public void setPasivoCorriente(double pasivoCorriente) {
		this.pasivoCorriente = pasivoCorriente;
	}

	public double getNetoPatrimonial() {
		return netoPatrimonial;
	}

	public void setNetoPatrimonial(double netoPatrimonial) {
		this.netoPatrimonial = netoPatrimonial;
	}

	public double[] getActivoNoCorriente() {
		return activoNoCorriente;
	}

	public void setActivoNoCorriente(double[] activoNoCorriente) {
		this.activoNoCorriente = activoNoCorriente;
	}

	public double[] getActivoCorriente() {
		return activoCorriente;
	}

	public void setActivoCorriente(double[] activoCorriente) {
		this.activoCorriente = activoCorriente;
	}

	@Override
	public String toString() {
		return "Patrimonio [balance=" + balance + ", activo=" + activo + ", pasivo=" + pasivo + ", pasivoNoCorriente="
				+ pasivoNoCorriente + ", pasivoCorriente=" + pasivoCorriente + ", netoPatrimonial=" + netoPatrimonial
				+ ", activoNoCorriente=" + Arrays.toString(activoNoCorriente) + ", activoCorriente="
				+ Arrays.toString(activoCorriente) + "]";
	}
	
	
	
}