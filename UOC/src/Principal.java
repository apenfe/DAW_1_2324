import VanTir.Calculos;
import VanTir.Entrada;
import VanTir.Patrimonio;
import VanTir.Proyecto;


public class Principal{
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("\n--- MENU ---");
			System.out.println("0 - SALIR");
			System.out.println("1 - COMPARAR VAN DE VARIOS PROYECTOS");
			System.out.println("2 - COMPARAR TIR DE PROYECTOS");
			System.out.println("3 - BALANCE");
			int opcion = Entrada.pedirEntero("Selecciona una opcion: ", true);
			
			if(opcion==1) {
				
				comparaVAN();

			}else if(opcion==2) {
				
				comparaTIR();
				
			}else if(opcion==3) {
				
				int opcion2=0;
				Patrimonio balance = new Patrimonio(false);
				
				while(true) {
					
					System.out.println("\n--- MENU ---");
					System.out.println("1 - HACER BALANCE");
					System.out.println("2 - AJUSTAR BALACE");
					System.out.println("3 - CALCULOS ESTATICOS");
					System.out.println("0 - SALIR");
					opcion2 = Entrada.pedirEntero("Selecciona una opcion: ", true);
					
					if(opcion2==1) {
						
						balance= new Patrimonio(true);
						
						balance.toString();
						
						if(balance.getBalance()<0) {
							
							System.out.println("El balance de la empresa es NEGATIVO "+balance.getBalance());
							System.out.println("El balance debe ser positivo o 0, es necesario ajustarlo.");
							
						}else if(balance.getBalance()==0) {
							
							System.out.println("El balance de la empresa es "+balance.getBalance());
							System.out.println("El balance esta ajustado.");
							
						}else {
							
							System.out.println("El balance de la empresa es "+balance.getBalance());
							System.out.println("El balance es positivo, es posible. Aunque es mejor revisar si las entradas son correctas.");
							
						}
				
					}else if(opcion2==2) {
						
						balance=Calculos.ajustarBalance(balance);
						System.out.println("El balance de la empresa es "+balance.getBalance());
						System.out.println(balance.toString());
						
					}else if(opcion2==3) {
						
						Calculos.metodosEstaticos(balance);
						
					}else if(opcion2==0) {
						
						break;
						
					}else {
						
						System.out.println("\nSeleccione una opcion valida entre 0 y 3.");
						
					}
					
				}
				
			}else if(opcion==0) {
				
				System.out.println("\nFIN DEL PROGRAMA");
				return;
				
			}else {
				
				System.out.println("\nSeleccione una opcion valida");
				
			}
			
		}
		
	}
	
	public static void comparaVAN() {
		
		int proyectos=0;
		
		do {
			
			proyectos = Entrada.pedirEntero("\n\tCuantos proyectos desea comparar: ", true);
			
			if(proyectos<=0) {
				System.out.println("\n\tAl menos debe crear un proyecto");
			}
			
		}while(proyectos<=0);
		
		Proyecto[] project = new Proyecto[proyectos];
		double[] van = new double[proyectos];
		
		for(int i=0; i<project.length;i++) {
			
			double inicial = Entrada.pedirDouble("\n\tInversion inicial proyecto "+(i+1)+": ", true);
			int anios = Entrada.pedirEntero("\tAños proyecto "+(i+1)+": ", true);
			double interes = Entrada.pedirDouble("\tInteres esperado del proyecto "+(i+1)+": ", true);

			project[i]=new Proyecto(inicial,anios,interes);
		}
		
		System.out.println();

		for(int i=0; i<project.length;i++) {
			
			System.out.println("\tVAN del proyecto "+(i+1)+": "+Calculos.van(project[i]));
			van[i]=Calculos.van(project[i]);
			
		}
		
		Calculos.decisionVan(van,false);
		
	}
	
	public static void comparaTIR() {
		
		int proyectos=0;
		
		do {
			
			proyectos = Entrada.pedirEntero("\n\tCuantos proyectos desea comparar: ", true);
			
			if(proyectos<=0) {
				System.out.println("\n\tAl menos debe crear un proyecto");
			}
			
		}while(proyectos<=0);
		
		Proyecto[] project = new Proyecto[proyectos];
		double[] tir = new double[proyectos];
		
		for(int i=0; i<project.length;i++) {
			
			double inicial = Entrada.pedirDouble("\n\tInversion inicial proyecto "+(i+1)+": ", true);
			int anios = Entrada.pedirEntero("\tAños proyecto "+(i+1)+": ", true);
			double interes = Entrada.pedirDouble("\tInteres esperado del proyecto "+(i+1)+": ", true);

			project[i]=new Proyecto(inicial,anios,interes);
		}
		
		System.out.println();

		for(int i=0; i<project.length;i++) {
			
			System.out.print("\tTIR del proyecto "+(i+1)+" entre: ");
			System.out.println(" ( "+Calculos.tir(project[i])[0]+", "+Calculos.tir(project[i])[1]+")");
			double tirMedio = (Calculos.tir(project[i])[0]+Calculos.tir(project[i])[1])/2;
			tir[i]=tirMedio;

		}
		System.out.println();

		double retorno = Entrada.pedirDouble("Cual es el retorno esperado para los proyectos?", true);
		
		Calculos.decisionTir(tir,retorno/100, false);
		
	}
	
}