package listasEnlazadas;

public class Nodo {
//Atributos
	public Object elemento;
	public Nodo siguiente;

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
