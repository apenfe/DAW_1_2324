package repaso_general_1;

import java.util.Scanner;

public class Main{
	
	public static Scanner teclado = new Scanner(System.in);
	public static DB db = new DB();
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("1 --- CREAR TABLA");
			System.out.println("2 --- BORRAR TABLA");
			System.out.println("3 --- INSERTAR DATO");
			System.out.println("4 --- HACER CONSULTA");
			System.out.println("5 --- SALIR");
			int opcion = pedirInt("Selecciona una opcion");
			
			if(opcion==1) {
				
				db.crearTabla();
				
			}else if(opcion==2) {
				
				db.borrarTabla();
				
			}else if(opcion==3) {
				
				db.insertarDato("adrian");
				
			}else if(opcion==4) {
				
				db.hacerConsulta();
				
			}else if(opcion==5) {
				
				break;
				
			}else {
				
				System.out.println("seleccione una opcion valida");
				
			}
			
		}
		
	}
	
	public static int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		
		do {
			
			try {
				
				return Integer.parseInt(teclado.nextLine().trim());
				
			} catch (Exception e) {
				
				System.out.print("Inserte un numero entero ---> ");
				
			}
			
		}while(true);
		
	}
	
}