package repasos;

import listasEnlazadas.Nodo;

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
	
	// --------------------------- Repaso 2 -------------------------------
	
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
	
	public void removeAllV2(CompletoNodo lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			remove(lista.get(i));
		}
		
	}
	
	public Object removeV2(int indice) { 
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(indice==0) {
			return removePrimeroV2();
		}
		
		if(indice>0) {
			return removeIntermedioV2(indice);
		}
		
		return null;
		
	}
	
	public Object removePrimeroV2() { 
		
		if(numElementos>0) {
			
			Node actual = primero;
			Node sig = actual.siguiente;
			primero=sig;
			
			numElementos--;
			return actual.dato;
			
		}
		
		return null;	
		
	}
	
	public Object removeIntermedioV2(int indice) { 
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Node ant = obtenerNodo(indice-1);
		Node actual = ant.siguiente;
		
		ant.siguiente=actual.siguiente;
		numElementos--;
		
		return actual.dato;
		
	}
	
	public boolean removeV2(Object dato) {
		
		int indice = indexOfV2(dato);
		
		if(indice!=-1) {
			remove(indice);
			return true;
		}
		
		return false;
	
	}
	
	public void addV2(int indice, Object dato) { 
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Node nuevo = new Node(dato);
		
		if(indice==0) {
			
			nuevo.siguiente=primero;
			primero=nuevo;
			numElementos++;
			
		}else if(indice==numElementos-1) {
			
			addV2(dato);
			
		}else {
			
			Node ant = obtenerNodo(indice-1);
			Node actual = ant.siguiente;
			
			ant.siguiente=nuevo;
			nuevo.siguiente=actual;
			numElementos++;
		}
		
	}
	
	public void addV2(Object dato) {
		
		Node nuevo = new Node(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Node actual = obtenerNodo(numElementos-1);
			actual.siguiente=nuevo;
			
		}
		
		numElementos++;
		
	}
	
	public Node obtenerNodoV2(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Node actual = primero;
		
		for (int i = 0; i < indice; i++) {
			
			actual=actual.siguiente;
			
		}
		
		return actual;
		
	}
	
	public int sizeV2() {
		
		return numElementos;
		
	}
	
	public void clearV2() {
		
		this.primero=null;
		this.numElementos=0;
		
	}
	
	public boolean isEmptyV2() {
		
		return numElementos==0;
		
	}
	
	public int indexOfV2(Object dato) { // repasar esta forma
		
		Node actual = primero;
		
		for (int i = 0; actual!=null; i++) {
			
			if((actual.dato!=null && actual.dato.equals(dato))||(dato==actual.dato)) {
				return i;
			}
			
			actual=actual.siguiente;
			
		}
		
		return -1;
		
	}
	
	public boolean containsV2(Object dato) {
		
		int indice = indexOfV2(dato);
		
		if(indice!=-1) {
			return true;
		}
		
		return false;
		
	}
	
	public Object getV2(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(numElementos>0) {
			
			Node salida = obtenerNodoV2(indice);
			
			return salida.dato;
			
		}
		
		return null;
		
	}
	
	/*
	 * METODOS DE PILA / STACK
	 * 
	 * ** Object[] toArray()- Devuelve un array con todos los elementos de la pila.
	 * ** Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
	 * ** Object pop() 			- Extrae el elemento situado en la cima de la pila.
	 * ** void push(Object) 		- Añade un elemento en la cima de la pila.
	 * 
	 */
	
	public Object[] toArrayV2() {
		
		Object[] salida = new Object[numElementos];
		
		Node actual = primero;
		
		for (int i = 0; actual!=null; i++) {
			
			salida[i]=actual.dato;
			actual=actual.siguiente;
			
		}
		
		return salida;
		
	}
	
	public Object peekV2() {
		
		if(numElementos>0) {
			
			Node ultimo = obtenerNodo(numElementos-1);
			return ultimo.dato;
			
		}
		
		return null;
		
	}
	
	public Object popV2() {
		
		if(numElementos==0) {
			
			return null;
			
		}else if(numElementos==1) {
			
			Node salida = primero;
			
			primero=null;
			numElementos=0;
			
			return salida.dato;
			
		}else {
			
			Node penultimo = obtenerNodo(numElementos-2);
			Node ultimo = penultimo.siguiente;
			
			penultimo.siguiente=null;
			
			numElementos--;
			return ultimo.dato;
			
		}
		
	}
	
	public void pushV2(Object objeto) {
		
		Node nuevo = new Node(objeto);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Node ultimo = obtenerNodo(numElementos-1);
			ultimo.siguiente=nuevo;
			
		}
		
		numElementos++;
	
	}
	
	/*
	 * METODOS DE COLA / QUEUE
	 * 
	 * ** Object peek() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
	 * ** Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
	 * ** void offer(Object) 		- Añade un elemento al final de la cola.
	 * 
	 */
	
	public Object peekCola() {
		
		if(numElementos>0) {
			
			return primero.dato;
			
		}
		
		return null;
		
	}
	
	public Object pollV2() {
		
		if(numElementos>0) {
			
			Node actual = primero;
			primero = actual.siguiente;
			numElementos--;
			
			return actual.dato;
			
		}
		
		return null;
		
	}
	
	public void offerV2(Object dato) {
		
		Node nuevo = new Node(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			
		}else {
			
			Node actual = obtenerNodo(numElementos-1);
			actual.siguiente=nuevo;
			
		}
		
		numElementos++;
		
	}
	
	// --------------------------- Repaso 3 -------------------------------
	
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
		
		public void removeAllV3(CompletoNodo lista) {
			
			for (int i = 0; i < lista.size(); i++) {
				remove(lista.get(i));
			}
			
		}
		
		public Object removeV3(int indice) { 
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
			
			if(indice==0) {
				
				return removePrimeroV3();
				
			}
			
			if(indice>0) {
				
				return removeIntermedioV3(indice);
				
			}
			
			return null;
			
		}
		
		public Object removePrimeroV3() { 
			
			if(numElementos>0) {
				
				Node actual = primero;
				
				primero=actual.siguiente;
				
				numElementos--;
				return actual.dato;
				
			}
			
			return null;
			
		}
		
		public Object removeIntermedioV3(int indice) { 
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
				
				Node ant = obtenerNodo(indice-1);
				Node actual = ant.siguiente;
				
				ant.siguiente=actual.siguiente;
				numElementos--;
				
				return actual.dato;
				
			
		}
		
		public boolean removeV3(Object dato) {
			
			int indice = indexOf(dato);
			
			if(indice!=-1) {
				remove(indice);
				return true;
			}
			
			return false;
		
		}
		
		public void addV3(int indice, Object dato) { 
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
			
			Node nuevo = new Node(dato);
			
			if(indice==0) {
				
				nuevo.siguiente=primero;
				primero=nuevo;
				numElementos++;
				
			}else if(indice==numElementos-1) {
				
				addV3(dato);
				
			}else {
				
				Node ant = obtenerNodo(indice-1);
				Node actual = ant.siguiente;
				
				ant.siguiente=nuevo;
				nuevo.siguiente=actual;
				numElementos++;
				
			}
			
			
		}
		
		public void addV3(Object dato) {
			
			Node nuevo = new Node(dato);
			
			if(numElementos==0) {
				
				primero=nuevo;
				
			}else {
				
				Node actual = obtenerNodo(numElementos-1);
				actual.siguiente=nuevo;
				
			}
			
			numElementos++;
			
		}
		
		public Node obtenerNodoV3(int indice) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
			Node actual = primero;
			
			for (int i = 0; i < indice; i++) {
				actual=actual.siguiente;
			}
			
			return actual;
			
		}
		
		
		public int sizeV3() {
			
			return numElementos;
			
		}
		
		public void clearV3() {
			
			primero=null;
			numElementos=0;
			
		}
		
		public boolean isEmptyV3() {
			
			if(numElementos==0) {
				return true;
			}
	
			return false;
			
		}
		
		public int indexOfV3(Object dato) {
			
			Node actual= primero;
			
			for (int i = 0; actual != null; i++) {
				
				if((actual.dato!=null &&  actual.dato.equals(dato))||(actual.dato==dato)) {
					
					return i;
					
				}
				
			}
			
			return -1;
			
		}
		
		public boolean containsV3(Object dato) {
			
			int indice = indexOfV3(dato);
			
			if(indice!=-1) {
				return true;
			}
	
			return false;
			
		}
		
		public Object getV3(int indice) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
			
			if(numElementos>0) {
				
				Node salida = obtenerNodoV3(indice);
				return salida.dato;
			}
			
			return null;
			
		}
		
		/*
		 * METODOS DE PILA / STACK
		 * 
		 * ** Object[] toArray()- Devuelve un array con todos los elementos de la pila.
		 * ** Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
		 * ** Object pop() 			- Extrae el elemento situado en la cima de la pila.
		 * ** void push(Object) 		- Añade un elemento en la cima de la pila.
		 * 
		 */
		
		public Object[] toArrayV3() {
			
			Object[] salida = new Object[numElementos];
			
			Node actual = primero;
			
			for (int i = 0; i < numElementos; i++) {
				salida[i]=actual.dato;
				actual=actual.siguiente;
			}
			
			return salida;
			
		}
		
		public Object peekV3() {
			
			if(numElementos>0) {
				
				Node salida = obtenerNodo(numElementos-1);
				
				return salida.dato;
			}
			
			return null;
			
			
		}
		
		public Object popV3() {
			
			if(numElementos==0) {
				
				return null;
				
			}else if(numElementos==1) {
				
				Node actual = primero;
				numElementos = 0;
				primero=null;
				
				return actual.dato;
				
			}else {
				
				Node ant = obtenerNodo(numElementos-2);
				Node actual = ant.siguiente;
				
				ant.siguiente=null;
		
				
				numElementos--;
				return actual.dato;
				
			}
			
		}
		
		public void pushV3(Object dato) {
			
			Node nuevo = new Node(dato);
			
			if(numElementos==0) {
				
				primero=nuevo;
				
			}else {
				
				Node actual = obtenerNodo(numElementos-1);
				actual.siguiente=nuevo;
				
			}
			
			numElementos++;
		
		}
		
		/*
		 * METODOS DE COLA / QUEUE
		 * 
		 * ** Object peek() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
		 * ** Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
		 * ** void offer(Object) 		- Añade un elemento al final de la cola.
		 * 
		 */
		
		public Object peekCola3() {
			
			if(numElementos>0) {
				return primero.dato;
			}
			
			return null;
			
		}
		
		public Object pollV3() {
			
			if(numElementos==0) {
				return null;
				
			}else if(numElementos==1) {
				
				Node actual = primero;
				primero=null;
				numElementos--;
				return actual.dato;
				
			}else {
				
				Node actual = primero;
				primero=actual.siguiente;
				numElementos--;
				return actual.dato;
				
			}
			
		}
		
		public void offerV3(Object dato) {
			
			Node nuevo = new Node(dato);
			
			if(numElementos==0) {
				
				primero=nuevo;
				
			}else {
				
				Node actual = obtenerNodo(numElementos-1);
				actual.siguiente=nuevo;
				
			}
			
			numElementos++;
			
		}
}