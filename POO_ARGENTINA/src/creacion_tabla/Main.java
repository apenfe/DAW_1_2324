package creacion_tabla;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion = -1;
		DAO db = new DAO();
		
		do {
			
			System.out.println("menu");
			System.out.println("1 - crear tabla");
			System.out.println("2 - eliminar tabla");
			System.out.print("Selecciona una opcion: ");
			opcion = Integer.parseInt(teclado.nextLine().trim());
			
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