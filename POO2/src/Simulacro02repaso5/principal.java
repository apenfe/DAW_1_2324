package Simulacro02repaso5;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] puntos = Fichero.leer();
		
		double maximo=0;
		
		for (int i = 0; i < puntos.length-1; i++) {
			
			maximo+=puntos[i].distancia(puntos[i+1]);
			
		}
		
		System.out.println("La distancia total es: "+maximo);
	
	}
	
}