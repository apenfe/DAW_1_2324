package repasos;

public class ListaEnlazada{
	
	private Nodo primero;
	private int numElementos;
	
	public ListaEnlazada() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	// add con obtener nodo ok
	// remove --- remove intermedio y remove primero ok
	// remove con objeto ok
	// indexof ok
	// get y size ok
	
	public int size() {
		return numElementos;
	}
	
	public Object get(int indice) {
		
		if(indice<0 || indice >=numElementos) {
			throw new IndexOutOfBoundsException("indice incorrecto");
		}
		
		Nodo aux = obtenerNodo(indice);
		
		return aux.dato;
		
	}
	
	private Nodo obtenerNodo(int indice) {
		
		if(indice<0 || indice >=numElementos) {
			throw new IndexOutOfBoundsException("indice incorrecto");
		}
		
		Nodo actual = primero;
		
		for (int i = 0; i < indice; i++) {
			
			actual=actual.siguiente;
			
		}
		
		return actual;
		
	}
	
	public void add(Object dato) {
		
		Nodo nuevo = new Nodo(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Nodo ultimo = obtenerNodo(numElementos-1);
			ultimo.siguiente=nuevo;
			
		}
		
		numElementos++;
	}
	
	public void add(int indice, Object dato) {
		
		if(indice<0||indice<=numElementos) {
			throw new IndexOutOfBoundsException("ERROR EN EL INDICE");
		}
		
		Nodo nuevo = new Nodo(dato);
		
		if(indice==0) {
			
			nuevo.siguiente=primero;
			primero=nuevo;	
			
		}
		
		if(indice>0) {
			
			Nodo anterior= obtenerNodo(indice-1);
			Nodo actual = anterior.siguiente;
			
			anterior.siguiente=nuevo;
			nuevo.siguiente=actual;
			
		}
		
		numElementos++;
		
	}
	
	public int indexOf(Object dato) {
		
		Nodo actual= primero;
		
		for (int i = 0; i < numElementos; i++) {
			
			if(actual.dato != null && actual.dato.equals(dato)||(actual.dato==dato)) {
				return i;
			}
			
			actual=actual.siguiente;
			
		}
		
		return -1;
		
	}
	
	public Object remove(int indice) {
		
		if(indice<0 || indice >=numElementos) {
			throw new IndexOutOfBoundsException("indice incorrecto");
		}
		
		if(indice==0) {
			
			return removePrimero();
			
		}
		
		if(indice>0){
			
			return removeIntermedio(indice);
			
		}
		
		return null;
		
	}
	
	public int remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	private Object removeIntermedio(int indice) {
		
		Nodo anterior =obtenerNodo(indice-1);
		Nodo actual = anterior.siguiente;
		
		anterior.siguiente=actual.siguiente;
		
		numElementos--;
		
		return actual.dato; 
		
	}
	
	private Object removePrimero() {
		
		Nodo actual = primero;
		
		primero = primero.siguiente;
		numElementos--;
		
		return actual.dato; 
		
	}
	
}