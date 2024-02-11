package Simulacro2repaso6;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] coordenadas = Fichero.leer();
		double max =0;
		
		for (int i = 0; i < coordenadas.length-1; i++) {
			max+=coordenadas[i].distancia(coordenadas[i+1]);
		}
		
		System.out.println("La distancia total es de: "+max);
		
	}
	
}