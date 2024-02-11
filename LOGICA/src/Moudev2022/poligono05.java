package Moudev2022;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class poligono05{
	
	public static void main(String[] args) {
		
		String poligono ="";
		
		poligono=Entrada.pedirTexto("Inserte un tipo de poligono: ");
		
		poligono(poligono);
		
	}
	
	public static void poligono(String forma) {
		
		    forma=forma.toLowerCase().trim();
		    
		    if(forma.equals("triangulo")) {
		    	
		    	int base = Entrada.pedirEntero("Cual es la base del triangulo? ");
		    	int altura = Entrada.pedirEntero("Cual la altura del triangulo? ");
		    	System.out.println("Area cuadrado: "+(base*altura)/2);
		    	
		    }else if(forma.equals("cuadrado")) {
		    	
		    	int lado = Entrada.pedirEntero("Cual es el lado del cuadrado? ");
		    	System.out.println("Area cuadrado: "+lado*lado);
		    	
		    }else if(forma.equals("rectangulo")) {
		    	
		    	int lado1 = Entrada.pedirEntero("Cual es el lado a del rectangulo? ");
		    	int lado2 = Entrada.pedirEntero("Cual es el lado a del rectangulo? ");
		    	System.out.println("Area cuadrado: "+lado1*lado2);
		    	
		    }else {
		    	
		    	System.out.println("No es un polígono válido.");
		    	
		    }
	}

}