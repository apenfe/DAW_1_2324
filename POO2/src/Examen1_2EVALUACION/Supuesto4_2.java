package Examen1_2EVALUACION;

import java.util.Scanner;

/*
 *  
 *  
 *  Para la opción 1, se deberá llamar a un método que obtenga todas las líneas del archivo textos.txt, 
 *  ordene los textos alfabéticamente, y los muestre numerados del 1 hasta el n.
 *  
 *  Para la opción 2, se deberá solicitar al usuario un texto con un mínimo de 5 caracteres, de lo 
 *  contrario devolverá al menú. Cuando introduzca el texto, lo escribirá en el archivo textos.txt 
 *  en una nueva línea, sin reemplazar lo que haya escrito previamente.
 *  
 */

public class Supuesto4_2{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("MENU");
			System.out.println("------");
			System.out.println("1 - Ver contenido del archivo");
			System.out.println("2 - Insertar frase");
			System.out.println("0 - Salir");
			int opcion = pedirInt("selecciona una opcion: ");
			
			if(opcion == 1) {
				
				Acceso.leer();
				
			}else if(opcion == 2) {
				
				Acceso.insertar();
				
			}else if(opcion == 0) {
				
				System.out.println("FIN DEL PROGRAMA");
				break;
				
			}else {
				
				System.out.println("SELECCIONA UNA OPCION VALIDA ENTRE 0 Y 2");
				
			}

		}while(true);
		
	}
	
	public static int pedirInt(String enunciado) {
		
		int opcion;
		System.out.print(enunciado);
		
		do {
			
			try {
				
				opcion = Integer.parseInt(teclado.nextLine().trim());
				return opcion;
				
			} catch (Exception e) {
				System.out.print("ERROR inserta un numero entero: ");
			}
			
		}while(true);
		
	}
		
}