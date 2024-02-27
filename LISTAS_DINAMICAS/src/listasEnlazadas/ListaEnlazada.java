package listasEnlazadas;

/**
 * Representa la implementación más sencilla y básica de una lista enlazada
 * simple con acceso sólo al principio de la serie de nodos.
 */

public class ListaEnlazada {

// Atributos

	private Nodo primero; // Referencia a nodo
	private int numElementos;

// Métodos

	/**
	 * Constructor que inicializa los atributos al valor por defecto. Lista vacía.
	 */

	public ListaEnlazada() {
		primero = null;
		numElementos = 0;
	}

	/**
	 * Añade un elemento al final de la lista.
	 * 
	 * @param elem - el elemento a añadir. Admite que el elemento a añadir sea null.
	 */
	public void add(Object dato) {

		// variables auxiliares
		Nodo nuevo = new Nodo(dato);

		if (numElementos == 0) {
			// Si la lista está vacía enlaza el nuevo nodo el primero.
			primero = nuevo;
		} else {
			// Obtiene el último nodo y enlaza el nuevo.
			Nodo ultimo = obtenerNodo(numElementos - 1);
			ultimo.siguiente = nuevo;
		}

		numElementos++; // Actualiza el número de elementos.
	}

	/**
	 * Obtiene el nodo correspondiente al índice. Recorre secuencialmente la cadena
	 * de enlaces.
	 * 
	 * @param indice - posición del nodo a obtener.
	 * @return - el nodo que ocupa la posición indicada por el índice.
	 */
	private Nodo obtenerNodo(int indice) {

		if (indice < 0 && indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}

		// Recorre la lista hasta llegar al nodo de posición buscada.
		Nodo actual = primero;

		for (int i = 0; i < indice; i++) {

			actual = actual.siguiente;

		}

		return actual;

	}

	/**
	 * Elimina el elemento indicado por el índice. Ignora índices negativos
	 * 
	 * @param indice - posición del elemento a eliminar
	 * @return - el elemento eliminado o null si la lista está vacía.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y
	 *                                      numElementos-1
	 */

	public Object remove(int indice) {

		// Lanza excepción si el índice no es válido.
		if (indice >= numElementos || indice < 0) { 
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		
		if (indice > 0) {
			return removeIntermedio(indice);
		}
		
		if (indice == 0) {
			return removePrimero();
		}
		
		return null;
	}

	/**
	 * Elimina el primer elemento.
	 * 
	 * @return - el elemento eliminado o null si la lista está vacía.
	 */
	private Object removePrimero() {
		// variables auxiliares
		Nodo actual = primero; // Guarda actual.
		primero = primero.siguiente; // Elimina elemento del principio.
		numElementos--;
		return actual.elemento;
	}

	/**
	 * Elimina el elemento indicado por el índice.
	 * 
	 * @param indice - posición del elemento a eliminar.
	 * @return - el elemento eliminado o null si la lista está vacía.
	 */
	private Object removeIntermedio(int indice) {

		// Busca nodo del elemento anterior correspondiente al índice.
		Nodo anterior = obtenerNodo(indice - 1);
		Nodo actual = anterior.siguiente; // Guarda actual.
		anterior.siguiente = actual.siguiente; // Elimina el elemento.
		numElementos--;
		return actual.elemento;
	}

	/**
	 * Elimina el dato especificado.
	 * 
	 * @param dato – a eliminar.
	 * @return - el índice del elemento eliminado o -1 si no existe.
	 */
	public int remove(Object dato) {
		// Obtiene el índice del elemento especificado.
		int actual = indexOf(dato);
		
		if (actual != -1) {
			remove(actual); // Elimina por índice.
		}
		return actual;
	}

	/**
	 * Busca el índice que corresponde a un elemento de la lista.
	 * 
	 * @param dato- el objeto elemento a buscar.
	 */
	
	public int indexOf(Object dato) {

		Nodo actual = primero;

		for (int i = 0; actual != null; i++) {

			if ((actual.elemento != null && actual.elemento.equals(dato)) || actual.elemento == dato) {
				return i;
			}

			actual = actual.siguiente;
		}

		return -1;
	}

	/**
	 * @param indice – obtiene un elemento por su índice.
	 * @return elemento contenido en el nodo indicado por el índice.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y
	 *                                      numElementos-1.
	 */
	public Object get(int indice) {
		// lanza excepción si el índice no es válido
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
		}
		
		Nodo aux = obtenerNodo(indice);
		return aux.elemento;
	}

	/**
	 * @return el número de elementos de la lista
	 */
	public int size() {
		
		return numElementos;
		
	}

}
