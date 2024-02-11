/*
 * Dado un array con nombre de alumno y nota, mostar si esta suspendo o aprobado
 */

package UDEMY;

public class Ejemplo45{
	
	public static void main (String[] args) {
		
		String[] alumnos = {"Adrian 10", "Lucia 3"};
		
		aprobados(alumnos);
		
	}
	
	public static void aprobados(String[] alumnos){
		
		for (int i = 0; i < alumnos.length; i++) {
			
				
				if(alumnos[i].charAt(alumnos[i].length()-1)-'0'>=5) {
					System.out.println("Aprobado");
				}else if(alumnos[i].charAt(alumnos[i].length()-1)-'0'==0) {
					if(alumnos[i].charAt(alumnos[i].length()-2)-'0'==1) {
						System.out.println("Aprobado");	
					}
				}else {
					System.out.println("Suspendido");
				}
			
		}
		
	}
	
}