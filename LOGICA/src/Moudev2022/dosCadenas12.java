package Moudev2022;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

public class dosCadenas12{
	
	public static void main(String[] args) {
		
		String str1 = "murcielago";
		String str2 = "aeiouz";
		
		String[] salida = modificadas(str1,str2);
		
		for(int i=0; i<salida.length;i++) {
			System.out.println("Nuevo str"+(i+1)+": "+salida[i]);
		}
	}
	
	public static String[] modificadas(String cadena1, String cadena2) {
		
		String[] salida ={"",""};
		boolean check=false;
		
		for(int i=0; i<cadena1.length(); i++) {
			
			check= false;
			
			for(int j=0; j<cadena2.length(); j++) {
				
				if(cadena1.charAt(i)==cadena2.charAt(j)) {
					check=true;
					break;
				}
				
			}
			
			if(!check) {
				salida[0]+=cadena1.charAt(i);
			}
		}
		
		for(int i=0; i<cadena2.length(); i++) {
			
			check= false;
			
			for(int j=0; j<cadena1.length(); j++) {
				
				if(cadena2.charAt(i)==cadena1.charAt(j)) {
					check=true;
					break;
				}
				
			}
			
			if(!check) {
				salida[1]+=cadena2.charAt(i);
			}
		}
		
		
		return salida;
		
	}

}