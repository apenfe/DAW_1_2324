package dobleEnlazada;

import listasEnlazadas.Nodo;

public class ListaDobleEnlazada {

	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;
	
	
	public int remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	public Object remove(int indice) {
		
		if (indice < 0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		
		if(indice==0) {
			
			return removePrimero();
			
		}else if(indice==numElementos-1) {
			
			return removeUltimo();

		}else {
			
			return removeIntermedio(indice);
			
		}	
		
	}
	
	private Object removePrimero() { // ver

		if (numElementos == 0) {
			
			primero = null;
			ultimo = null;
			return null;
			
		} else {
			
			Nodo actual = primero;
			Nodo segundo = primero.siguiente;
			
			primero=segundo;
			segundo.anterior=ultimo;
			this.numElementos--;
			return actual.elemento;
			
		}
		
	}
	
	private Object removeUltimo() {  // ver 
		
		if (numElementos == 0) {
			
			primero = null;
			ultimo = null;
			return null;
			
		} else {
			
			Nodo actual = ultimo;
			Nodo anterior = ultimo.anterior;
			
			ultimo=anterior;
			anterior.siguiente=primero;
			this.numElementos--;
			return actual.elemento;
			
		}
		
	}
	
	private Object removeIntermedio(int indice) {
		
		Nodo actual = obtenerNodo(indice);
		Nodo anterior = actual.anterior;
		Nodo sig = actual.siguiente;
		
		anterior.siguiente = sig;
		sig.anterior=anterior;
		actual.anterior = null;
		actual.siguiente = null;
		
		numElementos--;
		return actual.elemento;
		
	}
	
	public int indexOf(Object objeto) {
		
		Nodo actual = primero;
		
		if(objeto==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.elemento==null) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(objeto.equals(actual.elemento)) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}
		
		return -1;
		
	}
	
	public Object get(int indice) {
		
		if (indice < 0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		
		Nodo salida = obtenerNodo(indice);
		return salida.elemento;
		
	}
	
	public void clear() {
		
		primero = null;
		ultimo = null;
		numElementos = 0;
		
	}
	
	public int size() {
		return numElementos;
	}

	public ListaDobleEnlazada() {

		primero = null;
		ultimo = null;
		numElementos = 0;

	}

	public void add(Object dato) {
		addUltimo(dato);
	}

	public void add(int indice, Object dato) {

		if (indice < 0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}

		if (indice == 0) {
			insertarPrimero(dato);
		}

		if (indice > 0) {
			insertarIntermedio(indice, dato);
		}
		
	}

	private void insertarIntermedio(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}

		Nodo nuevo = new Nodo(dato);
		Nodo actual = obtenerNodo(indice); // Donde insertar.
		Nodo anterior = actual.anterior; // Obtiene el anterior.
		
		actual.anterior = nuevo; // Enlaza el nuevo nodo.
		anterior.siguiente = nuevo;
		nuevo.anterior = anterior; // Ajusta enlaces.
		nuevo.siguiente = actual;
		
		numElementos++; // Actualiza tamaño.
		
	}

	private void insertarPrimero(Object dato) {
		
		Nodo nuevo = new Nodo(dato);

		// La lista está vacía; el nuevo nodo es primero y último.
		if (numElementos == 0) {
			primero = nuevo;
			ultimo = nuevo;
		}
		// La lista no está vacía; el nuevo nodo pasa a ser el primero.
		else {
			
			Nodo actual = primero; // Dónde insertar.
			actual.anterior = nuevo; // Enlaza el nuevo nodo.
			nuevo.siguiente = actual; // Ajusta enlace.
			primero = nuevo; // Actualiza el nuevo primero.
			
		}
		
		this.numElementos++;
		
	}

	private void addUltimo(Object dato) {
		Nodo nuevo = new Nodo(dato);
		// La lista está vacía; el nuevo nodo es último y primero.
		if (numElementos == 0) {
			
			this.ultimo = nuevo;
			this.primero = nuevo;
			
		}
		// La lista no está vacía; el nuevo nodo pasa a ser el último.
		else {
			
			Nodo actual = ultimo; // Dónde insertar.
			actual.siguiente = nuevo; // Enlaza el nuevo nodo.
			nuevo.anterior = actual; // Ajusta enlace.
			this.ultimo = nuevo; // Actualiza el nuevo último.
			
		}
		
		this.numElementos++;
		
	}

	private Nodo obtenerNodo(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}
		
		Nodo actual = primero;
		
		for (int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}
		
		return actual;
		
	}

}