package ejercicios;

/*
 * Copia y prueba de forma completa la implementación de lista basada en nodos enlazados 
 * que se proporciona en el manual de Java, en el tema: en el  Capítulo 9. Estructuras 
 * dinámicas lineales
 * 
 * Haz una prueba completa de todos los métodos de la clase.
 * Deben seguirse los principios y estilo del código limpio.
 */

public class Ejercicio2 {
	
	public Nodo primero;
	public int numElementos;
	
	public Ejercicio2() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	public void add(Object objeto) {
		
		Nodo nuevo = new Nodo(objeto);
		
		if(numElementos==0) {
			
			primero = nuevo;
			
		}else {
			
			Nodo ultimo = obtenerNodo(numElementos-1);
			ultimo.siguiente=nuevo;
			
		}
		
		numElementos++;
		
	}
	
	private Nodo obtenerNodo(int indice) {
		
		if(indice < 0 && indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
		}
		
		Nodo actual = primero;
		
		for (int i = 0; i < indice; i++) {
			
			actual=actual.siguiente;
			
		}
		
		return actual;
		
	}
		
}

class Nodo{
	
	public Nodo siguiente;
	public Object dato;
	
	public Nodo(Object dato) {
		
		this.dato=dato;
		this.siguiente=null;
		
	}
	
}