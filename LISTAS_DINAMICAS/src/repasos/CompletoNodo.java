package repasos;

public class CompletoNodo{
	
	private int numElementos;
	private Node primero;
	
	public CompletoNodo() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	/*
	 * ** void add(Object) 		- Añade un elemento al final de la lista.
	 * ** void add(int, Object) 		- Inserta un elemento en la posición indicada por un índice.
	 * ** Nodo obtenerNodo(int indice)
	 * ** void clear() 			- Elimina todos los elementos de la lista.
	 * ** boolean contains(Object) 	- Comprueba si el elemento está incluido en la lista.
	 * ** Object get(int) 			- Obtiene el elemento de la posición indicada por índice.
	 * ** int indexOf(Object) 		- Devuelve la posición del elemento.
	 * ** boolean isEmpty() 		- Comprueba si la lista está vacía.
	 * ** boolean remove(Object) 	- Elimina el elemento correspondiente.
	 * ** Object remove(int) 		- Elimina el elemento de la posición indicada por índice.
	 * ** Object removePrimero()
	 * ** Object removeIntermedio(int)
	 * ** int size() 			- Número de elementos de la estructura.
	 * ** void removeAll(Object[])
	 * 
	 */
	
	public void removeAll(CompletoNodo lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			remove(lista.get(i));
			
		}
		
	}
	
	public Object remove(int indice) { 
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR INDICE");
		}
		
		if(indice==0) {
			return removePrimero();
		}
		
		if(indice>0) {
			return removeIntermedio(indice);
		}
		
		return null;	
		
	}
	
	public Object removePrimero() { 
		
		Node actual = primero;
		
		primero = actual.siguiente;
		numElementos--;
		return actual.dato;
		
	}
	
	public Object removeIntermedio(int indice) { 
		
		Node anterior = obtenerNodo(indice-1);
		Node actual = anterior.siguiente;
		
		anterior.siguiente=actual.siguiente;
		numElementos--;
		
		return actual.dato;
		
	}
	
	public boolean remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice != -1) {
			remove(indice);
			return true;
		}
		
		return false;
	
	}
	
	public void add(int indice, Object dato) { 
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR INDICE");
		}
		
		Node nuevo = new Node(dato);
		
		if(indice==0) {
			
			nuevo.siguiente=primero;
			primero=nuevo;
			numElementos++;
			
		}else if(indice==numElementos-1) {
			
			add(dato);
			
		}else {
			
			Node anterior = obtenerNodo(indice);
			Node actual = anterior.siguiente;
			
			anterior.siguiente=nuevo;
			nuevo.siguiente=actual;
			
			numElementos++;
			
		}
		
	}
	
	public void add(Object dato) {
		
		Node nuevo = new Node(dato);
		Node ultimo = obtenerNodo(numElementos-1);
		
		if(numElementos==0) {
			primero=nuevo;
		}else {
			ultimo.siguiente=nuevo;
		}
		
		numElementos++;
		
	}
	
	public Node obtenerNodo(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR INDICE");
		}
		
		Node actual = primero;
		
		for (int i = 0; i < indice; i++) {
			
			actual=actual.siguiente;
			
		}
		
		return actual;
		
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
	public void clear() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	public boolean isEmpty() {
		
		return numElementos==0;
		
	}
	
	public int indexOf(Object dato) { // repasar esta forma
		
		Node actual = primero;
		
		for (int i = 0; actual!=null ; i++) {
			
			if((actual.dato != null && actual.dato.equals(dato))||(actual.dato==dato)) {
				return i;
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
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR INDICE");
		}
		
		Node salida = obtenerNodo(indice);
		
		return salida.dato;
		
	}
	
	/*
	 * METODOS DE PILA / STACK
	 * 
	 * ** Object[] toArray()- Devuelve un array con todos los elementos de la pila.
	 * Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
	 * Object pop() 			- Extrae el elemento situado en la cima de la pila.
	 * void push(Object) 		- Añade un elemento en la cima de la pila.
	 * 
	 */
	
	public Object[] toArray() {
		
		Object[] salida = new Object[numElementos];
		
		Node actual = primero;
		
		for (int i = 0; actual!=null; i++) {
			salida[i]=actual.dato;
			actual=actual.siguiente;
		}
		
		return salida;
		
	}
	
	/*
	 * METODOS DE COLA / QUEUE
	 * 
	 * Object peek() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
	 * Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
	 * void offer(Object) 		- Añade un elemento al final de la cola.
	 * 
	 */
	
	public Object peek() {
		
		if(numElementos>0) {
			return primero.dato;
		}
		
		return null;
		
	}
	
	public Object poll() {
		
		if(numElementos>0) {
			
			Node actual = primero;
			
			primero=actual.siguiente;
			numElementos--;
			
			return actual.dato;
		}
		
		return null;
		
	}
	
	public void offer(Object dato) {
		
		Node nuevo = new Node(dato);
		Node ultimo = obtenerNodo(numElementos-1);
		
		ultimo.siguiente=nuevo;
		numElementos++;
		
	}
}