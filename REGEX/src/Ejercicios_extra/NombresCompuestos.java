package Ejercicios_extra;

/*
 * Nombre
 */

public class NombresCompuestos{
	
	public static void main(String[] args) {
		
		int x = 3;
		
		String[] validar = {"Juan Mateo De Los Montes toledanos","Mª Del Carmen Rosamentera","Adrián Peñalever Fernández"};
		
		//String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñª ]+$";
		String regex = "^([A-ZÑÁÉÍÓÚ]{1}[a-záéíóúñª]+[ ]?)+$";
		
		for (int i = 0; i < validar.length; i++) {
			
			System.out.println();
			System.out.print("Validacion nº "+(i+1)+": "+validar[i]+" --> ");
			
			if(validar[i].matches(regex)) {
				
				System.out.println("SI es Real");
				
			}else {
				
				System.out.println("NO es Real");				
			}
			
		}
		
	}
		
}