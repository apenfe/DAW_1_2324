package examenes.examen_3;

import java.util.Scanner;

/*
Escribe un programa en Java llamado Supuesto3_1 que muestre un menú el cual se repetirá
continuamente hasta que el usuario seleccione la opción 0, para finalizar el programa. 
Las opciones que mostrará serán las siguientes:

1 - Solicitar datos
2 - Mostrar datos
3 - Ordenar ascendentemente
4 - Ordenar descendentemente
0 - Salir

Al pulsar la opción "1", el programa llamará a un método que pedirá al usuario una cantidad
 de textos a introducir, entre 5 y 15. En el caso de que la cantidad no fuera válida, deberá
  insistir hasta que el usuario indique una cantidad válida. Cuando indique la cantidad de textos
   que quiere, el programa deberá solicitar tantas cadenas de caracteres como cantidad haya indicado
    y devolver dicha colección de cadenas de caracteres al programa principal.

Al pulsar la opción "2", el programa deberá asegurarse de que se han introducido textos previamente y
 avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a
  un método que reciba dicha colección de cadenas de caracteres, y las mostrará separadas por el carácter 
  coma y un espacio en blanco ", " a excepción del último elemento que no tendrá esta separación por su derecha.

Al pulsar la opción "3", el programa deberá asegurarse de que se han introducido textos previamente y 
avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que
 reciba dicha colección de cadenas de caracteres, los ordenará de forma ascendente (alfabéticamente, de menor a 
 mayor) y devolverá esa colección ordenada al programa principal.

Al pulsar la opción "4", el programa deberá asegurarse de que se han introducido textos previamente y avisar
 al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que 
 reciba dicha colección de cadenas de caracteres, los ordenará de forma descendente (de mayor a menor, 
 ordena alfabético inverso) y devolverá esa colección ordenada al programa principal.


/*
  Supuesto3_1.java
  Adrián Peñalver Fernández  
  05/01/2024
*/

public class Repaso3_1{
	
	public static Scanner teclado = new Scanner(System.in);
	public static String[] textos = new String[0];
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("--- MENU ---");
			System.out.println("0 - SALIR");
			System.out.println("1 - INTRODUCIR TEXTOS");
			System.out.println("2 - MOSTRAR DATOS");
			System.out.println("3 - ORDENAR ASCENDENTE");
			System.out.println("4 - ORDENAR DESCENDENTE");
			System.out.print("SELECCIONA UNA OPCION: ");
			int opcion = pedirInt("SELECCIONE UNA OPCION");
			
			if(opcion==1) {
				
				textos=pedirTextos();
				
			}else if(opcion==2) {
				
				if(textos.length>0) {
					mostrarTextos(textos);
		
				}else {
			
					System.out.println("PRIMERO DEBE INTRODUCIR DATOS");
				}
				
			}else if(opcion==3) {
				
				if(textos.length>0) {
					textos=ascendente(textos);
					mostrarTextos(textos);
				}else {
					System.out.println("PRIMERO DEBE INTRODUCIR DATOS");
				}
				
			}else if(opcion==4) {
				
				if(textos.length>0) {
					textos=descendente(textos);
					mostrarTextos(textos);
				}else {
					System.out.println("PRIMERO DEBE INTRODUCIR DATOS");
				}
				
			}else if(opcion==0) {
				System.out.println("FIN DEL PROGRAMA...");
				return;
			}else {
				System.out.println("SELECCIONE UNA OPCION VALIDA ENTRE 1 Y 4...");
			}
	
		}while(true);
		
	}
	
	public static int pedirInt(String enunciado) {
		
		System.out.println(enunciado);
		boolean check=true;
		int opcion=0;
		
		do {
			
			try {
				opcion = Integer.parseInt(teclado.nextLine().trim());
				check=false;
			}catch(Exception e) {
				System.out.println("ERROR --- INTEGER");

			}
			
		}while(check);
		
		return opcion;

	}
	
	public static String[] pedirTextos() {
		
		int num=0;
		
		do {
			
			num=pedirInt("Introduce la cantidad de textos: ");
			
			if(num<5||num>15) {
				System.out.println("Debe ser entre 5 y 15.");
			}
			
		}while(num<5||num>15);
		
		String[] textos = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("Inserte el texto "+(i+1)+": ");
			textos[i]= teclado.nextLine().trim();
		}
		
		return textos;

	}
	
	public static void mostrarTextos(String[] textos) {
	
	/*
	 * Al pulsar la opción "2", el programa deberá asegurarse de que se han introducido textos previamente y
 avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a
  un método que reciba dicha colección de cadenas de caracteres, y las mostrará separadas por el carácter 
  coma y un espacio en blanco ", " a excepción del último elemento que no tendrá esta separación por su derecha.
	 */
		
		for(int i=0; i<textos.length-1; i++) {
			System.out.print(textos[i]+", ");
		}
		
		System.out.print(textos[textos.length-1]+".");
		System.out.println();

	}
	
	public static String[] ascendente(String[] textos) {
		
		String aux="";
		
		for(int i=1; i<textos.length;i++) {
			
			for(int j=0; j<textos.length-i;j++) {
				
				if(textos[j].compareToIgnoreCase(textos[j+1])>0) {
					aux=textos[j];
					textos[j]=textos[j+1];
					textos[j+1]=aux;
				}
				
			}
		}
		
		return textos;
	
	}
	
	public static String[] descendente(String[] textos) {
		
		String aux="";
		
		for(int i=1; i<textos.length;i++) {
			
			for(int j=0; j<textos.length-i;j++) {
				
				if(textos[j].compareToIgnoreCase(textos[j+1])<0) {
					aux=textos[j];
					textos[j]=textos[j+1];
					textos[j+1]=aux;
				}
				
			}
		}
		
		return textos;
		
	}
}