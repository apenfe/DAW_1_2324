package Simulacro02repaso;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] coordenadas = Fichero.leer();	
		
		double distancia=0;
		
		for(int i=0; i<coordenadas.length-1;i++) {
			
			System.out.print("La distancia del punto"+i+": "+coordenadas[i]+" al punto "+(i+1)+": "+coordenadas[i+1]+" es = ");
			System.out.println(Coordenada.distancia(coordenadas[i], coordenadas[i+1]));
			distancia+= Coordenada.distancia(coordenadas[i], coordenadas[i+1]);

		}
		
		System.out.print("La distancia total es: "+distancia);

		
	}
	
}