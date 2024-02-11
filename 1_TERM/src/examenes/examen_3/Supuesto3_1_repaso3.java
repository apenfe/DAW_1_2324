package examenes.examen_3;

import java.util.Scanner;

public class Supuesto3_1_repaso3{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] textos = new String[0];
		
		do {
			
			System.out.println("\n-- MENU ---");
			System.out.println("1 - SOLICITAR DATOS");
			System.out.println("2 - MOSTRAR DATOS");
			System.out.println("3 - ORDENAR ASCENDENTEMENTE");
			System.out.println("4 - ORDENAR DESCENDENTEMENTE");
			System.out.println("0 - SALIR");
			int opcion = pedirInt("Seleccione una opcion: ");
			
			if(opcion==1) {
				
				textos=solicitarDatos();
				
			}else if(opcion==2) {
				
				if(textos.length>=5) {
					
					imprimirDatos(textos);
					
				}else {
					
					System.out.println("Primero debe de crear un array.");
					
				}
				
			}else if(opcion==3) {
				
				if(textos.length>=5) {
					
					textos=ordenUp(textos);
					imprimirDatos(textos);
					
				}else {
					
					System.out.println("Primero debe de crear un array.");
					
				}
				
			}else if(opcion==4) {
				
				if(textos.length>=5) {
					
					textos=ordenDown(textos);
					imprimirDatos(textos);
					
				}else {
					
					System.out.println("Primero debe de crear un array.");
					
				}
				
			}else if(opcion==0) {
				
				System.out.println("FIN DEL PROGRAMA");
				break;
				
			}else {
				
				System.out.println("SELECCIONE UNA OPCION ENTRE 0 Y 4");
				
			}

		}while(true);	
		
	}
	
	public static int pedirInt(String enunciado) {
		
		int num=0;
		
		do {
			
		System.out.print(enunciado);
		
			try {
				
				num = Integer.parseInt(teclado.nextLine().trim());
				break;
				
			}catch(Exception e) {
				System.out.println("ERROR - INTRODUCE UN ENTERO");
			}
			
		}while(true);
		
		return num;
		
	}
	
	public static String[] solicitarDatos() {
		
		int cantidad=0;
		
		do {
			
			cantidad = pedirInt("Cuantos textos desea crear? ");
			
			if(cantidad<5||cantidad>15) {
				System.out.println("DESE SER COMO MINIMO 5 Y MAXIMO 15.");
			}
			
		}while(cantidad<5||cantidad>15);
		
		String[] salida = new String[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.print("Inserte el texto "+(i+1)+": ");
			salida[i]=teclado.nextLine().trim();			
		}
		
		return salida;
		
	}
	
	public static void imprimirDatos(String[] datos) {
	
		for (int i = 0; i < datos.length-1; i++) {
			
			System.out.print(datos[i]+", ");
		
		}
		
		System.out.print(datos[datos.length-1]+". ");
		System.out.println();
	
	}
	
	public static String[] ordenUp(String[] datos) {
		
		for (int i = 1; i < datos.length; i++) {
			
			for (int j = 0; j < datos.length-i; j++) {
				
				if(datos[j].compareToIgnoreCase(datos[j+1])>0) {
					
					String aux = datos[j];
					datos[j]=datos[j+1];
					datos[j+1]=aux;
					
				}
				
			}
			
		}
		
		return datos;
	
	}
	
	public static String[] ordenDown(String[] datos) {
		
		for (int i = 1; i < datos.length; i++) {
			
			for (int j = 0; j < datos.length-i; j++) {
				
				if(datos[j].compareToIgnoreCase(datos[j+1])<0) {
					
					String aux = datos[j];
					datos[j]=datos[j+1];
					datos[j+1]=aux;
					
				}
				
			}
			
		}
		
		return datos;
	
	}
	
}