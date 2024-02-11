package Simulacro02repaso2;

public class principal{
	
	public static void main(String[] args) {
		
		Coordenada[] coordenadas = Fichero.leer();
		double total=0;
		
		for(int i=0; i<coordenadas.length-1;i++) {
			System.out.print("La primera coordenada es "+coordenadas[i].toString()+" y su distancia con la segunda coordenada "+coordenadas[i+1].toString()+" es:");
			System.out.println(Coordenada.distancia(coordenadas[i],coordenadas[i+1]));
			total+=Coordenada.distancia(coordenadas[i],coordenadas[i+1]);
		}

		System.out.print("La distancia total es: "+total);
		
		Coordenada x = new Coordenada(100,100);
		
		if(Fichero.escribir(x)) {
			System.out.println("Punto añadido correctamente");
		}else {
			System.out.println("Error al añadir punto");
		}
		
		total+=Coordenada.distancia(coordenadas[coordenadas.length-1],x);

		System.out.println("La distancia total es: "+total);
	}
	
}