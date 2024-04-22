import java.util.Scanner;

public class Principal{
	
	/*
	 * 1- Listar todos los productos de un fabricante indicado por teclado (Sin utilizar la intersección de tablas INNER JOIN)
	 * 2- Listar todos los datos, incluido el nombre del fabricante, de los productos que tienen el mismo precio que el producto más caro de un fabricante indicado por teclado.
	 * 3- Lista el nombre del producto más caro de un fabricante indicado por teclado.
	 * 4- Lista el nombre del producto más barato de un fabricante indicado por teclado.
	 * 5- Devuelve todos los productos de la base de datos que tienen un precio mayor o igual al producto más caro de un fabricante indicado por teclado.
	 * 6- Lista todos los productos de un fabricante indicado por teclado que tienen un precio superior al precio medio de todos sus productos de ese mismo fabricante.
	 * 7- Muestra el producto más caro que existe en la tabla producto sin hacer uso de MAX, ORDER BY ni LIMIT.
	 * 8- Muestra el producto más barato que existe en la tabla producto sin hacer uso de MIN, ORDER BY ni LIMIT.
	 * 9- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando ALL o ANY).
	 * 10- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando ALL o ANY).
	 * 11- Lista los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
	 * 12- Lista los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
	 * 
	 */
	
	public static final Scanner TECLADO = new Scanner(System.in);
	public static final DAO TIENDA = new DAO();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("\tMENU___TIENDA___SUBCONSULTAS");
			System.out.println("1  ---> Listar todos los productos de un fabricante");
			System.out.println("2  ---> Total de clientes de cada uno de los países");
			System.out.println("3  ---> Mostrar la media del importe de pagos de un año indicado");
			System.out.println("4  ---> Mostrar la cantidad de pedidos para cada uno de los estados");
			System.out.println("5  ---> Mostrar el importe más alto y más bajo de los productos");
			System.out.println("6  ---> Cantidad total de clientes");
			System.out.println("7  ---> Cantidad total de clientes de una determinada ciudad");
			System.out.println("8  ---> Mostrar todos los representantes con su cantidad de clientes");
			System.out.println("9  ---> Mostrar cantidad de clientes sin representante de ventas");
			System.out.println("10 ---> Mostrar  nombre completo de clientes y las fechas de su primer y último pago realizado");
			System.out.println("11 ---> Cantidad de productos diferentes en cada uno de los pedidos");
			System.out.println("12 ---> Mostrar información de cada pedido junto con el importe total");
			System.out.println("0  ---> Salir");
			System.out.print("\tSeleccione una opción [0-12]: ");
			int opcion = Integer.parseInt(TECLADO.nextLine().trim());
			
			if(opcion == 0) {
				
				System.out.println("Saliendo...");
				break;
				
			}else if(opcion == 1) {
				
				System.out.print("Inserte el nombre del fabricante: ");
				String fabricante = TECLADO.nextLine().trim();
				System.err.println("\n"+TIENDA.consulta_1(fabricante)+"\n");
				
			}else if(opcion == 2) {
				
				System.out.print("Inserte el nombre del fabricante: ");
				String fabricante = TECLADO.nextLine().trim();
				System.err.println("\n"+TIENDA.consulta_2(fabricante)+"\n");
				
			}else if(opcion == 3) {
				
				System.out.print("Inserte el año: ");
				String fabricante = TECLADO.nextLine().trim();
				System.err.println("\n"+TIENDA.consulta_3(fabricante)+"\n");
				
			}else if(opcion == 4) {
				
				System.err.println("\n"+TIENDA.consulta_4()+"\n");
				
			}else if(opcion == 5) {
				
				System.err.println("\n"+TIENDA.consulta_5()+"\n");
				
			}else if(opcion == 6) {
				
				System.err.println("\n"+TIENDA.consulta_6()+"\n");
				
			}else if(opcion == 7) {
				
				System.out.print("Inserte una ciudad: ");
				String ciudad = TECLADO.nextLine().trim();
				System.err.println("\n"+TIENDA.consulta_7(ciudad)+"\n");
				
			}else if(opcion == 8) {
				
				System.err.println("\n"+TIENDA.consulta_8()+"\n");
				
			}else if(opcion == 9) {
				
				System.err.println("\n"+TIENDA.consulta_9()+"\n");
				
			}else if(opcion == 10) {
				
				System.err.println("\n"+TIENDA.consulta_10()+"\n");
				
			}else if(opcion == 11) {
				
				System.err.println("\n"+TIENDA.consulta_11()+"\n");
				
			}else if(opcion == 12) {
				
				System.err.println("\n"+TIENDA.consulta_12()+"\n");
				
			}else {
				
				System.out.println("Seleccione una opción valida entre 0 y 16.");
				System.out.println();
				
			}
			
		}while(true);
		
	}
	
}