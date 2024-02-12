package rArray14;

/* Array14.java
 * 
 * Escribe un método que se llame fechaValida() que recibe un texto correspondiente a una fecha
 * en formato dd/mm/aaaa . Devuelve el valor true si la fecha es válida y false en caso de que la fecha no sea válida.
 * 
 * El método debe tener en cuenta los meses de 28, 30 y 31 días, además de los febreros de 29 días de los años bisiestos.
 * La implementación del método debe hacerse mediante expresiones regulares y/o control manual, sin hacer uso de objetos de
 * tipo fecha que proporciona Java.
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array14{
	
	public static void main(String[] args) {
		
		String fecha = "11/05/1995";
		String fecha1 = "11/5/1995";
		
		if(fechaValida(fecha)) {
			
			System.out.println("Fecha valida.");
			
		}else {
			
			System.out.println("Fecha NO valida.");
			
		}
		
		if(fechaValida(fecha1)) {
			
			System.out.println("Fecha valida.");
			
		}else {
			
			System.out.println("Fecha NO valida.");
			
		}
		
	}
	
	public static boolean fechaValida(String fecha) {

		String regex = "\\d{2}/\\d{2}/\\d{4}";
		String[] datos = fecha.split("/");
		int dia = Integer.parseInt(datos[0]);
		int mes = Integer.parseInt(datos[1]);
		int ano = Integer.parseInt(datos[2]);
		boolean bisiesto = false;
		
		if(fecha.matches(regex)) {
			
			if(dia<=0||mes<=0||ano<=0||mes>12) {
				return false;
			}
			
			if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
				bisiesto = true;
			}
			
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				
				if (dia <= 31) {
					return true;
				} else {
					return false;
				}
				
			}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				
				if (dia <= 30) {
					return true;
				} else {
					return false;
				}
				
			}else {
				
				if (dia <= 29 && bisiesto) {
					return true;
				} else if(dia<=28 && !bisiesto){
					return true;
				}else {
					return false;
				}
				
			}
			
		}else {
			return false;
		}

	}


}