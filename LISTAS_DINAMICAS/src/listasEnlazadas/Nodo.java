package listasEnlazadas;

public class Nodo {
//Atributos
	Object elemento;
	Nodo siguiente;

	/**
	 * Constructor que inicializa atributos por defecto.
	 * 
	 * @param elem - el elemento de información útil a almacenar.
	 */
	public Nodo(Object elemento) {
		this.elemento = elemento;
		siguiente = null;
	}

} // class
