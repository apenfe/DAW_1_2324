package dobleEnlazada;

import listasEnlazadas.Nodo;

public class ListaDobleEnlazada<E> {

	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;
	
	public int remove(E dato) {
		
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

	private Object removePrimero() {

		Nodo actual = primero;
		Nodo siguiente = actual.siguiente;

		if (siguiente == null) {
			this.primero = null;
			this.ultimo = null;
			numElementos = 0;
			return actual.elemento;
		}

		siguiente.anterior = null;
		this.primero = siguiente;
		
		this.numElementos--;
		return actual.elemento;

	}

	private Object removeUltimo() {

		Nodo actual = ultimo;
		Nodo anterior = actual.anterior;

		anterior.siguiente = null;
		this.ultimo = anterior;
		this.numElementos--;
		return actual.elemento;

	}
	
	private Object removeIntermedio(int indice) {
		
		Nodo actual = obtenerNodo(indice);
		Nodo anterior = actual.anterior;
		Nodo sig = actual.siguiente;
		
		anterior.siguiente = sig;
		sig.anterior=anterior;
		
		numElementos--;
		return actual.elemento;
		
	}
	
	public int indexOf(E objeto) {
		
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

	public void add(E dato) {
		addUltimo(dato);
	}

	public void add(int indice, E dato) {

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

	private void insertarIntermedio(int indice, E dato) {
		
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

	private void insertarPrimero(E dato) {
		
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

	private void addUltimo(E dato) {
		
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
		
		Nodo actual = null;
		
	/*	actual = primero;
		
		for (int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}*/
		
		if(indice<numElementos/2) {
	
			actual = primero;
			
			for (int i = 0; i < indice; i++) {
				actual = actual.siguiente;
			}
			
		}else {

			actual = ultimo;
			
			for (int i = numElementos-1; i > indice; i--) {
				actual = actual.anterior;
			}
			
		}
		
		return actual;
		
	}

}