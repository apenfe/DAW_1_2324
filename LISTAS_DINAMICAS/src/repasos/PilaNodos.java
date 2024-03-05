package repasos;

/*
Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
Object pop() 			- Extrae el elemento situado en la cima de la pila.
void push(Object) 		- Añade un elemento en la cima de la pila.

 */

public class PilaNodos{
	
	public int numElementos;
	public Node primero;
	
	public PilaNodos() {
		
		this.primero = null;
		this.numElementos = 0;	
		
	}
	
	public Object peek() {
		
		if(numElementos==0) {
			return null;
		}
		
		Node actual = primero;
		
		for (int i = 0; i < numElementos-1; i++) {
			actual=actual.siguiente;
		}
		
		return actual.dato;
		
	}
	
	public Object pop() {
		
		if(numElementos==0) {
			
			return null;
			
		}else if(numElementos==1) {
			
			Object salida = primero.dato;
			clear();
			return salida;
			
		}else {
			
			Node actual = primero;
			for (int i = 0; i < numElementos-2; i++) {
				actual=actual.siguiente;
			}
			
			Object salida = actual.siguiente.dato;
			actual.siguiente=null;
			numElementos--;
			return salida;
			
		}
		
	}

	public void push(Object objeto) {
		
		Node nuevo = new Node(objeto);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Node actual = primero;
			for (int i = 0; i < numElementos-1; i++) {
				actual=actual.siguiente;
			}
			
			actual.siguiente=nuevo;
			
		}
	
		numElementos++;
	
	}
	
	public Object[] toArray() {
		
		Object[] salida = new Object[numElementos];
		
		Node actual = primero;
		
		for (int i = 0; i<numElementos ; i++) {
			
			salida[i]=actual.dato;
			actual=actual.siguiente;
			
		}
		
		return salida;
		
	}
	
	public void clear() {
		
		this.primero = null;
		this.numElementos = 0;	
		
	}
	
	public int indexOf(Object dato) {
		
		Node actual = primero;
		
		if(dato==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.dato==null) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(dato.equals(actual.dato)) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}
		
		return -1;
		
	}
	
	public boolean contains(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			return true;
		}
		
		return false;
		
	}
	
	public boolean isEmpty() {
		
		if(size()>0) {
			return false;
		}
		
		return true;
			
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
}