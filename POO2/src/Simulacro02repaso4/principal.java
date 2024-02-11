package Simulacro02repaso4;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] coordenadas = Fichero.leer();	
		
		double total = 0;
		
		for (int i = 0; i < coordenadas.length-1; i++) {
			
			System.out.println("La distancia del "+coordenadas[i]+" al "+coordenadas[i+1]+" es: "+coordenadas[i].distancia(coordenadas[i+1]));
			total+=coordenadas[i].distancia(coordenadas[i+1]);
			
		}
		
		System.out.println("La distancia total es: "+total);
	}
	
}