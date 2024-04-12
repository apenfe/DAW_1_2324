import java.util.Scanner;

public class Principal{
	
	public static final Scanner TECLADO = new Scanner(System.in);
	public static final DAO JARDINERIA = new DAO();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("MENU___JARDINERIA");
			System.out.println("1 ---> Total de empleados en la empresa");
			System.out.println("2 ---> Total de clientes de cada uno de los países");
			System.out.println("3 ---> Mostrar la media del importe de pagos de un año indicado");
			System.out.println("4 ---> Mostrar la cantidad de pedidos para cada uno de los estados");
			System.out.println("5 ---> Mostrar el importe más alto y más bajo de los productos");
			System.out.println("6 ---> Cantidad total de clientes");
			System.out.println("7 ---> Cantidad total de clientes de una determinada ciudad");
			System.out.println("8 ---> Mostrar todos los representantes con su cantidad de clientes");
			System.out.println("9 ---> Mostrar cantidad de clientes sin representante de ventas");
			System.out.println("10 ---> Mostrar  nombre completo de clientes y las fechas de su primer y último pago realizado");
			System.out.println("11 ---> Cantidad de productos diferentes en cada uno de los pedidos");
			System.out.println("12 ---> Mostrar información de cada pedido junto con el importe total");
			System.out.println("13 ---> Los 20 productos más vendidos");
			System.out.println("14 ---> Facturación total de la empresa");
			System.out.println("15 ---> Ventas totales de los productos que facturen más de cierta cantidad");
			System.out.println("16 ---> Suma total de todos los pagos realizados agrupados por año");
			System.out.println("0 ---> Salir");
			System.out.print("Seleccione una opción [0-16]: ");
			int opcion = Integer.parseInt(TECLADO.nextLine().trim());
			
			if(opcion == 0) {
				
				System.out.println("Saliendo...");
				break;
				
			}else if(opcion == 1) {
				
				System.err.println("\n\tEl total de empleados en la empresa es de: "+ JARDINERIA.consulta_1() +" trabajadores.\n");
				
			}else if(opcion == 2) {
				
				System.err.println("\n\t"+JARDINERIA.consulta_2()+"\n");
				
			}else if(opcion == 3) {
				
				System.out.print("Inserte el año: ");
				int year = Integer.parseInt(TECLADO.nextLine().trim());
				System.err.println("\n\t"+JARDINERIA.consulta_3(year)+"\n");
				
			}else if(opcion == 4) {
				
				System.err.println("\n\t"+JARDINERIA.consulta_4()+"\n");
				
			}else if(opcion == 5) {
				
				System.err.println("\n\t"+JARDINERIA.consulta_5()+"\n");
				
			}else if(opcion == 6) {
				
				System.err.println("\n\t"+JARDINERIA.consulta_6()+"\n");
				
			}else if(opcion == 7) {
				
				System.out.print("Inserte una ciudad: ");
				String ciudad = TECLADO.nextLine().trim();
				System.err.println("\n\t"+JARDINERIA.consulta_7(ciudad)+"\n");
				
			}else if(opcion == 8) {  // ver
				
				//System.err.println("\n\t"+JARDINERIA.consulta_8()+"\n");
				
			}else if(opcion == 9) {
				
			}else if(opcion == 10) {
				
				System.err.println("\n\t"+JARDINERIA.consulta_10()+"\n");
				
			}else if(opcion == 11) {
				
			}else if(opcion == 12) {
				
			}else if(opcion == 13) {
				
			}else if(opcion == 14) {
				
			}else if(opcion == 15) {
				
			}else if(opcion == 16) {
				
			}else {
				
				System.out.println("Seleccione una opción valida entre 0 y 16.");
				System.out.println();
				
			}
			
		}while(true);
		
	}
	
}