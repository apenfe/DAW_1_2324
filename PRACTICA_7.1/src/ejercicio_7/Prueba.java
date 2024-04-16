package ejercicio_7;

import java.util.ArrayList;

import RRHH.*;

public class Prueba{
	
	public static void main(String[] args) {
		
		Factura f1 = new Factura("1234","23");
		Pedido p0 = new Pedido("2313","10");
		PedidoUrgente p1 = new PedidoUrgente("2313","10","maxima");
		Contrato c1 = new Contrato("delineante","6 meses","23");
		CV cv1 = new CV("adrian fernandez","5 años","2");
		
		ArrayList<Documento> lista = new ArrayList<Documento>();
		
		lista.add(f1);
		lista.add(p0);
		lista.add(p1);
		lista.add(c1);
		lista.add(cv1);
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i).toString());
			
		}
		
	}
	
}