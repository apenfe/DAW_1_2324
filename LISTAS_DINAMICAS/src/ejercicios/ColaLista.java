package ejercicios;

/*
 * Escribe una implementación del TDA cola basada en una lista dinámica.
 * Puede servir, restringiendo operaciones, la implementación de lista dinámica que se proporciona 
 * en el manual de Java, en el  Capítulo 9. Estructuras dinámicas lineales.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 */

/*
 * void offer(Object) 		- Añade un elemento al final de la cola.
 */

public class ColaLista<E>{
	
	public int numElementos;
	public Nodo2 primero;
	
	public ColaLista() {
		
		this.numElementos=0;
		this.primero=null;
		
	}
	
	private Nodo2 obtenerNodo(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Nodo2 actual = primero;
		
		for (int i = 0; i < indice; i++) {
			actual=actual.siguiente;
		}
		
		return actual;
		
	}
	
	public void offer(E objeto) {
		
		Nodo2 nuevo = new Nodo2(objeto);
		
		if(isEmpty()) {
			
			primero=nuevo;
		}
		
		Nodo2 ultimo = obtenerNodo(numElementos-1);
		ultimo.siguiente=nuevo;
		numElementos++;
		
	}
	
	public Object poll() {
		
		if(isEmpty()) {
			
			return null;
		}
		
		Object salida = primero.dato;
		Nodo2 siguiente = primero.siguiente;
		primero=siguiente;
		numElementos--;
		return salida;
		
	}
	
	public Object peek() {
		
		if(isEmpty()) {
			
			return null;
		}
		
		return primero.dato;
	}
	
	public boolean contains(E objeto) {
		
		return indexOf(objeto)!=-1;
		
	}
	
	public int indexOf(E objeto) {
		
		Nodo2 actual = primero;
		
		if(objeto==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.dato==null) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(objeto.equals(actual.dato)) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}
		
		return -1;
		
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
	public boolean isEmpty() {
		
		return size()==0;
		
	}
	
	public void clear() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	
}

class Nodo2{
	
	public Nodo2 siguiente;
	public Object dato;
	
	public Nodo2(Object dato) {
		
		this.siguiente=null;
		this.dato=dato;
		
	}
	
}