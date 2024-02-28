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
	
	public Object remove(int indice) {
		
		if(indice < 0 && indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
		}
		
		if(indice==0) {
			
			return removePrimero();
			
		}
		
		if(indice>0) {
			
			return removeIntermedio(indice);
			
		}
		
		return null;
		
	}
	
	private Object removePrimero() {
		
		Nodo actual = primero;			
		primero = primero.siguiente;	   
		numElementos--;
		return actual.dato;

	}
	
	private Object removeIntermedio(int indice) {
		
		Nodo anterior = obtenerNodo(indice-1);
		Nodo actual = obtenerNodo(indice);
		anterior.siguiente=actual.siguiente;   
		numElementos--;
		return actual.dato;
		
	}
	
	public int indexOf(Object objeto) {
		
		Nodo actual = primero;
		
		for (int i = 0; actual !=null; i++) {
			
			if((actual.dato != null && actual.dato.equals(objeto)) || actual.dato == objeto) {
				return i;
			}
			
			actual=actual.siguiente;
			
		}
		
		return -1;
		
	}
	
	public int remove(Object objeto) {
		
		int indice = indexOf(objeto);
		
		if(indice>=0) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	public Object get(int indice) {
		
		 if (indice >= numElementos || indice < 0) {
	   		 throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
	   	 }
		 
		 Nodo aux = obtenerNodo(indice);
		 
		 return aux.dato;
		
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
	/////////////////
	
	public void add(int indice, Object dato) {
		
		if (indice >= numElementos || indice < 0) {
	   		 throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
	   	}
		
		Nodo nuevo = new Nodo(dato);
		
		if (indice==0) {
			
			nuevo.siguiente=this.primero;
			this.primero=nuevo;
			
		}else {
			
			Nodo anterior = obtenerNodo(indice-1);
			Nodo actual = anterior.siguiente;

			anterior.siguiente=nuevo;
			nuevo.siguiente=actual;
			
		}
		
		numElementos++;
		
	}
	
	/////////////////

		
}

class Nodo{
	
	public Nodo siguiente;
	public Object dato;
	
	public Nodo(Object dato) {
		
		this.dato=dato;
		this.siguiente=null;
		
	}
	
}