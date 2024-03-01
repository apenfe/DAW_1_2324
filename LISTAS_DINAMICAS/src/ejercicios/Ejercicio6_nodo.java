package ejercicios;

public class Ejercicio6_nodo<E>{
	
	private Nodo inicial;
	private int numElementos;
	
	public Ejercicio6_nodo() {
		
		this.inicial=null;
		this.numElementos = 0;
		
	}
	
	public void clear() {
		
		this.inicial=null;
		this.numElementos = 0;
		
	}
	
	public boolean contains(E objeto) {
		
		if(indexOf(objeto)!=-1) {
			return true;
		}
		return false;
		
	}
	
	public int indexOf(E objeto) {
		
		Nodo actual = inicial;
		
		if(objeto==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.dato==null) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.dato.equals(objeto)) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}
		
		return -1;
		
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
	
	/*Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
Object pop() 			- Extrae el elemento situado en la cima de la pila.
void push(Object) 		- Añade un elemento en la cima de la pila.

	 * 
	 */
	
	public Object peek() {
		
		Nodo actual = inicial;
		
		if(!isEmpty()) {
			
			for (int i = 0; i < numElementos-1; i++) {
				
				actual=actual.siguiente;
				
			}
			
			return actual.dato;
			
		}

		return null;
		
	}
	
	/*Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
Object pop() 			- Extrae el elemento situado en la cima de la pila.
void push(Object) 		- Añade un elemento en la cima de la pila.

	 * 
	 */
	
	
	public Object pop() {
		
		Nodo anterior = inicial;
			
			for (int i = 0; i < numElementos-1; i++) {
				
				anterior=anterior.siguiente;
				
			}
			
			Object salida = anterior.dato;
			anterior.siguiente=null;
			numElementos--;
			return salida;
		
	}
	
	public void push(E objeto) {
		
		Nodo nuevo = new Nodo(objeto);

		if(numElementos==0) {
			
			inicial=nuevo;
			numElementos++;
			
		}else {
			
			Nodo actual = inicial;
			
			for (int i = 0; i < numElementos-1; i++) {
				
				actual=actual.siguiente;
				
			}
			
			actual.siguiente=nuevo;
			numElementos++;
			
		}
		
	}
	
	public Object[] toArray() {
		
		Nodo actual = inicial;
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			
			salida[i]=actual.dato;
			actual=actual.siguiente;
			
		}
		
		return salida;
		
	}
	
}