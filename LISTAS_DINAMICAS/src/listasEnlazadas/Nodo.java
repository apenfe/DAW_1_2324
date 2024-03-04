package listasEnlazadas;

public class Nodo {
//Atributos
	public Object elemento;
	public Nodo siguiente;
	public Nodo anterior;

	/**
	 * Constructor que inicializa atributos por defecto.
	 * 
	 * @param elem - el elemento de información útil a almacenar.
	 */
	public Nodo(Object elemento) {
		this.elemento = elemento;
		this.siguiente = null;
		this.anterior=null;
	
	}

} // class
