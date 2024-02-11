package Simulacro02repaso3;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] puntos = Fichero.leer();
		
		double total=0;
		
		for(int i=0; i<puntos.length-1;i++) {
			
			System.out.println("El punto "+puntos[i]+" esta del punto "+puntos[i+1]+" a unas distancia de: "+puntos[i].distancia(puntos[i+1]));
			total+=puntos[i].distancia(puntos[i+1]);
		}
		
		System.out.println("La distancia total es de: "+total);
		
	}
	
}