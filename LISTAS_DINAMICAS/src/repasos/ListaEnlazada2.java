package repasos;

public class ListaEnlazada2<E>{
	
	private int numElementos;
	private Node primero;
	
	/*
	 * remove objeto
	 */
	
	public ListaEnlazada2() {
		
		this.numElementos=0;
		this.primero=null;
		
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
	public Node obtenerNodo(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}
		
		Node actual = primero;
		
		for (int i = 0; i < indice; i++) {
			actual=actual.siguiente;
		}
		
		return actual;
		
	}
	
	public int remove(E object) {
		
		int indice = indexOf(object);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	public Object remove(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}
		
		if(indice==0) {
			
			return removePrimero();
			
		}
		
		if(indice>0) {
			
			return removeIntermedio(indice);
			
		}
		
		return null;
		
	}
	
	private Object removeIntermedio(int indice) {
		
		Node anterior = obtenerNodo(indice-1);
		Node actual = anterior.siguiente;
		
		anterior.siguiente=actual.siguiente;
		numElementos--;
		
		return actual.dato;
		
	}
	
	private Object removePrimero() {
		
		Node actual = primero;
		primero = primero.siguiente;	
		numElementos--;
		return actual.dato;

		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}
		
		Node salida = obtenerNodo(indice);
		
		return salida.dato;
		
	}
	
	public void add(E objeto) {
		
		Node nuevo = new Node(objeto);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Node ultimo = obtenerNodo(numElementos-1);
			ultimo.siguiente=nuevo;
			
		}
		
		numElementos++;
		
	}
	
	public int indexOf(E objeto) {
		
		Node actual = primero;
		
		if(objeto==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.dato==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(objeto.equals(actual.dato)) {
					return i;
				}
				
			}
			
		}
		
		return -1;
		
	}
	

}

class Node{
	
	public Node siguiente;
	public Object dato;
	
	public Node(Object dato) {
		this.dato=dato;
		this.siguiente=null;
	}
	
}