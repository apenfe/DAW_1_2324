package creacion_tabla;

import java.util.Scanner;

public class Main{
	
	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = -1;
		DAO db = new DAO();
		
		do {
			
			System.out.println("menu");
			System.out.println("1 - crear tabla");
			System.out.println("2 - eliminar tabla");
			System.out.print("Selecciona una opcion: ");
			opcion = Integer.parseInt(TECLADO.nextLine().trim());
			
			if(opcion==1) {
				
				db.crearTabla();
				
			}else if(opcion ==2) {
				
				db.borrarTabla();
				
			}else {
				
				break;
				
			}
			
		}while(true);
		
	}
	
}