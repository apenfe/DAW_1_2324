package VanTir;

import java.util.ArrayList;
import java.util.Collections;

public class Calculos{
	
	public static double[] tir(Proyecto x) {
		
		double inicio = x.getInversionInicial()*-1;
		double sumaCobros = 0;
		double k =0;
		double ratio =0.01;
		
		do {
			
			sumaCobros = 0;
			
			for(int i=0; i<x.getNumAnios();i++) {
				
				double cobro = ((x.getCobros()[i])/Math.pow((1+(k/100)), i+1));
				sumaCobros+=cobro;
			}
			
			k+=ratio;
			
		}while((inicio)*-1<=sumaCobros);
		
		double[] ks = {k/100,(k-ratio)/100};
		
		return ks;
		
	}
	
	public static void decisionTir(double[] tir, double retorno, boolean limit) {
		
		System.out.println();
		double limite =0;
		
		if(limit) {
			limite=Entrada.pedirDouble("Cual es el tope de presupuesto?", true);
		}else {
			limite=Double.MAX_VALUE;
		}
		
		ArrayList<Double> tirs = new ArrayList<Double>();
		
		for(int i=0; i<tir.length;i++) {
			
			if(tir[i]<=retorno) {
				System.out.println("\n\tProyecto "+(i+1)+" descartado. ");
			}else {
				System.out.println("\tProyecto "+(i+1)+" Valido. ");
				tirs.add(tir[i]);
			}
			
		}
		
		Collections.sort(tirs);
		System.out.println();
		double total=0;
		
		for(int i=tirs.size()-1; i>=0;i--) {
			
			total+=tirs.get(i);
			if(total<=limite) {
				System.out.println("\t"+(tirs.size()-i)+" - Proyecto de TIR: "+tirs.get(i));
			}else {
				System.out.println("\n\tPresupuesto alcanzado.");
				return;
			}

		}
		
	}
	
	public static double van(Proyecto x) {
		
		double inicio = x.getInversionInicial()*-1;
		double sumaCobros = 0;
		
		for(int i=0; i<x.getNumAnios();i++) {
			
			double cobro = ((x.getCobros()[i])/Math.pow((1+(x.getInteresEsperado()/100)), i+1));
			sumaCobros+=cobro;
		}
		
		double van = inicio + sumaCobros;
		
		return van;
	}
	
	public static void decisionVan(double[] van, boolean limit) {
		
		System.out.println();
		double limite =0;
		
		if(limit) {
			limite=Entrada.pedirDouble("Cual es el tope de presupuesto?", true);
		}else {
			limite=Double.MAX_VALUE;
		}
		
		ArrayList<Double> vans = new ArrayList<Double>();
		
		for(int i=0; i<van.length;i++) {
			
			if(van[i]<=0) {
				System.out.println("\n\tProyecto "+(i+1)+" descartado. ");
			}else {
				System.out.println("\tProyecto "+(i+1)+" Valido. ");
				vans.add(van[i]);
			}
			
		}
		
		Collections.sort(vans);
		System.out.println();
		double total=0;
		
		for(int i=vans.size()-1; i>=0;i--) {
			
			total+=vans.get(i);
			if(total<=limite) {
				System.out.println("\t"+(vans.size()-i)+" - Proyecto de VAN: "+vans.get(i));
			}else {
				System.out.println("\n\tPresupuesto alcanzado.");
				return;
			}

		}
		
	}
	
	public static Patrimonio ajustarBalance(Patrimonio balance) {
		
		System.out.println("\nDebe seleccionar que incognita falta: ");
		System.out.println("\tNeto patrimonial");
		System.out.println("\tPasivo No Corriente");
		System.out.println("\tPasivo Corriente");
			
		String incognita = Entrada.pedirTexto("\nSelecciona una opcion: ");
		incognita=incognita.toLowerCase().trim();
		
		Patrimonio nuevo = new Patrimonio(balance, incognita);
		
		System.out.println("\nBalance ajustado.");
		
		return nuevo;
			
	}
	
	public static void metodosEstaticos(Patrimonio balance) {
		
		System.out.println();
		System.out.println("\t1 - FONDO DE MANIOBRA: ");
		System.out.println();
		System.out.println("\t(HACER FRENTE A PAGOS A CORTO PLAZO) ");
		System.out.println("\t(ACTIVO CORRIENTE - PASIVO CORRIENTE) ");
		System.out.println("\t(PASIVO NO CORRIENTE + NETO PATRIMONIAL -ACTIVO NO CORRIENTE) ");
		
		double activoCorriente=0;
		
		for(int i=0; i<3; i++) {
			
			activoCorriente+=balance.getActivoCorriente()[i];
			
		}
		
		double fondoManiobra = activoCorriente-balance.getPasivoCorriente();
		
		if(fondoManiobra>0) {
			
			System.out.println("\t FONDO DE MANIOBRA +, SITUACION NORMAL: "+fondoManiobra);
			
		}else {
			
			System.out.println("\t FONDO DE MANIOBRA -, SITUACION ANORMAL: "+fondoManiobra);

		}
		
		System.out.println();
		
		System.out.println("\t2 - RATIO DE DISPONIBILIDAD: ");
		System.out.println();
		System.out.println("\t(RELACIONA TESORERIA CON DEUDAS A CORTO PLAZO) ");
		System.out.println("\t(EFECTIVO Y OTROS LIQUIDOS / PASIVO CORRIENTE) ");
		
		double ratioDisponibilidad = (balance.getActivoCorriente()[1])/balance.getPasivoCorriente();
		
		if(ratioDisponibilidad<1) {
			
			System.out.println("\tSITUACION NORMAL: (Cuanto mas pequeña, mas problemas)"+ratioDisponibilidad);
			
		}else {
			
			System.out.println("\tSITUACION ANORMAL: (DEBE SER <1) "+ratioDisponibilidad);

		}
		
		System.out.println();
		
		System.out.println("\t3 - RATIO DE TESORERIA: ");
		System.out.println();
		System.out.println("\t(RELACIONA TESORERIA CON DEUDAS A CORTO PLAZO) ");
		System.out.println("\t(EFECTIVO Y OTROS LIQUIDOS + DEUDORES COMERCIALES) / PASIVO CORRIENTE) ");
		
		double ratioTesoreria = (balance.getActivoCorriente()[2]+balance.getActivoCorriente()[2])/balance.getPasivoCorriente();
		
		if(ratioTesoreria>=0.8&&ratioTesoreria<=1) {
			
			System.out.println("\tSITUACION NORMAL: "+ratioTesoreria);
			
		}else {
			
			System.out.println("\tSITUACION ANORMAL: (DEBE SER ENTRE 0,8 Y 1) "+ratioTesoreria);

		}
		
		System.out.println();
		
		System.out.println("\t4 - RATIO DE LIQUIDEZ: ");
		System.out.println();
		System.out.println("\t(FONDO DE MANIOBRA EN FORMA DE COCIENTE) ");
		System.out.println("\tACTIVO CORRIENTE / PASIVO CORRIENTE) ");
		
		double activoCorriente2=0;
		
		for(int i=0; i<3; i++) {
			
			activoCorriente2+=balance.getActivoCorriente()[i];
			
		}
		
		double ratioLiquidez = activoCorriente2/balance.getPasivoCorriente();
		
		if(ratioTesoreria>=1.7&&ratioTesoreria<=1.9) {
			
			System.out.println("\tSITUACION NORMAL: ENTRE 1,7 Y 1,9 "+ratioLiquidez);
			
		}else {
			
			System.out.println("\tSITUACION ANORMAL: (DEBE SER SUPERIOR A 1 IDEAL ENTRE 1,7 Y 1,9) "+ratioLiquidez);

		}
		
		System.out.println();
		
		System.out.println("\t5 - RATIO DE SOLVENCIA (O GARANTIA): ");
		System.out.println();
		System.out.println("\t(SOLVENCIA A LARGO PLAZO) ");
		System.out.println("\t(ACTIVO / PASIVO CORRIENTE + PASIVO NO CORRIENTE) ");
		
		double ratioSolvencia = balance.getActivo()/(balance.getPasivoCorriente()+balance.getPasivoNoCorriente());
		
		if(ratioSolvencia>1) {
			
			System.out.println("\tSITUACION NORMAL: CUANTO MAYOR MEJOR "+ratioSolvencia);
			
		}else {
			
			System.out.println("\tSITUACION DE QUIEBRA: (DEBE SER SUPERIOR A 1) "+ratioSolvencia);

		}
		
		System.out.println();
		
		System.out.println("\t6 - RATIO DE ENDEUDAMIENTO: ");
		System.out.println();
		System.out.println("\t(PROPORCION ENTRE FONDOS PEDIDOS AL EXTERIOR Y FONDOS APORTADOS POR SOCIOS) ");
		System.out.println("\t(PASIVO CORRIENTE + PASIVO NO CORRIENTE)/(PASIVO CORRIENTE + PASIVO NO CORRIENTE + NETO) ");
		
		double ratioEndeudamiento = (balance.getPasivoCorriente()+balance.getPasivoNoCorriente())/balance.getPasivo();
		
		if(ratioEndeudamiento>0.6) {
			
			System.out.println("\tSITUACION ANORMAL: EXCESO DEUDAS "+ratioEndeudamiento);
			
		}else if(ratioEndeudamiento==0.6){
			
			System.out.println("\tSITUACION NORMAL: "+ratioEndeudamiento);

		}else {
			
			System.out.println("\tLA EMPRESA TIENE DEMASIADOS FONDOS PROPIOS: "+ratioEndeudamiento);
	
		}
		
		System.out.println();
		
		System.out.println("\t7 - RATIO DE ESTRUCTURA DE LA DEUDA: ");
		System.out.println();
		System.out.println("\t(COMPOSICION DE LA DEUDA) ");
		System.out.println("\t(PASIVO CORRIENTE)/(PASIVO CORRIENTE + PASIVO NO CORRIENTE) ");
		
		double ratioDeuda = (balance.getPasivoCorriente())/(balance.getPasivoNoCorriente()+balance.getPasivoCorriente());
		
		System.out.println("\tCUANTO MAS PEQUEÑA SEA MEJOR: "+ratioDeuda);
		System.out.println();
	
	}
	
}