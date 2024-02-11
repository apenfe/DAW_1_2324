package Simulacro02;

public class Principal{
	
	public static final String RUTA = ".\\src\\Simulacro02\\coordenadas.txt";
	
	public static void main(String[] args) {
		
		Coordenada[] coordenadas = Fichero.leer(RUTA);	
		
		double cont=0;
		
		for(int i=0; i<coordenadas.length-1;i++) {
			
			System.out.println("Distancia de punto "+i+" hasta punto "+(i+1)+": " + Coordenada.getDistancia(coordenadas[i], coordenadas[i+1]));
			cont+=Coordenada.getDistancia(coordenadas[i], coordenadas[i+1]);
		}
		
		System.out.println("En total: "+cont);
		
	}
		
}