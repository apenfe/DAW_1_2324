package ServiciosPoo04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		
		ArrayList<Servicio> servicios = new ArrayList<>();
		
		TrabajoPintura pintura1 = new TrabajoPintura("pepe", LocalDate.of(2024, 1, 3), "INDRA", 150, 5);
		TrabajoPintura pintura2 = new TrabajoPintura("LUis", LocalDate.of(2024, 3, 3), "NTT", 40, 6);

		RevisionAlarma revision1 = new RevisionAlarma(LocalDate.of(2024, 3, 3), "Bropincel", 3);

		servicios.add(revision1);
		servicios.add(pintura2);
		servicios.add(pintura1);
		
		double sueldo=0;
		
		for (Servicio servicio : servicios) {
			
			System.out.println(servicio.detalleServicio());
			sueldo+=servicio.costeManoObra();
			
		}
		
		System.out.println("Sueldo total a pagar: "+sueldo);
		
	}
	
}