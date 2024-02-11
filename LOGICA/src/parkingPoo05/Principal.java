package parkingPoo05;

public class Principal{
	
	public static void main(String[] args) {
		
		Parking parking = new Parking("Parking Centro", 10);
		
		do {
			
			System.out.println("--- MENU PARKING ---");
			System.out.println("1 - ENTRADA DE COCHE");
			System.out.println("2 - SALIDA DE COCHE");
			System.out.println("3 - MOSTRAR PARKING");
			System.out.println("4 - SALIR DEL PROGRAMA");
			int opcion = Entrada.pedirEntero("Seleccione una opción: ",true);
			
			if(opcion==1) { // entrada
			
					
					try {
						
						String matricula = Entrada.pedirTexto("Introduzca la matricula: ");
						int plaza = Entrada.pedirEntero("Introduzca la plaza: ",true);

						parking.entrada(matricula, plaza);
				
						
					}catch(ParkingException e) {
						 System.out.println("ERROR: "+e.getMessage());
				         System.out.println("No se realizó la entrada del coche con matrícula " +
				         e.getMatricula()+" en el parking");
					}finally {
						System.out.println("Las plazas totales del parking son: "+ parking.getPlazasTotales());
						System.out.println("Las plazas disponibles son: "+ parking.getPlazasLibres());
						System.out.println("Las plazas ocupadas son: "+ parking.getPlazasOcupadas());
						System.out.println();
					}


			}else if(opcion ==2) {
				
				try {
					
					String matricula = Entrada.pedirTexto("Introduzca la matricula: ");

					parking.salida(matricula);
					
				}catch(ParkingException e) {
					
					 System.out.println("ERROR: "+e.getMessage());
			         System.out.println("No se realizó la entrada del coche con matrícula " +
			         e.getMatricula()+" en el parking");
				}finally {
					
					System.out.println("Las plazas totales del parking son: "+ parking.getPlazasTotales());
					System.out.println("Las plazas disponibles son: "+ parking.getPlazasLibres());
					System.out.println("Las plazas ocupadas son: "+ parking.getPlazasOcupadas());
					System.out.println();
				}
				
			}else if(opcion ==3) {
				
				System.out.println(parking.toString());
				
			}else if(opcion ==4) {
				System.out.println("FIN DEL PROGRAMA.");
				return;
			}else {
				System.out.println("\nEL VALOR DEBE SER ENTRE 1 Y 4.\n");
			}
			
		}while(true);		
		
	}
	
}