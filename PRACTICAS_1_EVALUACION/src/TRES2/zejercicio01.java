package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio01.java
 *
 * Escribe un programa para calcular los salarios semanales de empleados a los que se les paga 15 euros 
 * por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
 * El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro 
 * si se quiere seguir. El salario que se le debe pagar se calcula utilizando un método especializado llamado
 * calcularSalario().
 * El método  calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio01{
	
	public static Scanner teclado = new Scanner(System.in);
	public static final int HORA_NORMAL= 15;
	public static final int HORA_EXTRA= 22;
	public static final int LIMITE_NORMAL= 35;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.print("Horas realizadas? ");
			int horas = Integer.parseInt(teclado.nextLine().trim());
			
			System.out.println(salario(horas));
			
			System.out.print("Desea calcular otro sueldo? ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static int salario(int horas) {
		
		if(horas<=LIMITE_NORMAL&&horas>0) {
			
			return horas*HORA_NORMAL;
			
		}else if(horas>LIMITE_NORMAL) {
			
			return (LIMITE_NORMAL*HORA_NORMAL)+((horas-LIMITE_NORMAL)*HORA_EXTRA);
			
		}else {
			return 0;
		}
	}
	
}