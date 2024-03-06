package repasos;

public class CompletoArray{
	
	private static final int NUM_INICIAL = 4;
	private int numElementos;
	private Object[] arrayElementos;
	
	public CompletoArray() {
		
		this.arrayElementos=new Object[NUM_INICIAL];
		this.numElementos=0;
		
	}
	
	/*
	 * ** void add(Object) 		- Añade un elemento al final de la lista.
	 * ** void add(int, Object) 		- Inserta un elemento en la posición indicada por un índice.
	 * ** void comprobarLlenado()
	 * ** void clear() 			- Elimina todos los elementos de la lista.
	 * ** boolean contains(Object) 	- Comprueba si el elemento está incluido en la lista.
	 * ** Object get(int) 			- Obtiene el elemento de la posición indicada por índice.
	 * ** int indexOf(Object) 		- Devuelve la posición del elemento.
	 * ** boolean isEmpty() 		- Comprueba si la lista está vacía.
	 * ** boolean remove(Object) 	- Elimina el elemento correspondiente.
	 * ** Object remove(int) 		- Elimina el elemento de la posición indicada por índice.
	 * ** int size() 			- Número de elementos de la estructura.
	 * void removeAll(Object[])
	 * 
	 */
	
	public void removeAll(CompletoArray lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			remove(lista.get(i));
			
		}
		
	}
	
	public Object remove(int indice) { // repasar he fallado
		
		if(indice<0||indice>=numElementos){
			throw new IndexOutOfBoundsException("error indice");
		}
		
		Object borrado = arrayElementos[indice];
		
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1));
		
		arrayElementos[numElementos-1]=null;
		numElementos--;
		
		return borrado;
		
	}
	
	public boolean remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			remove(indice);
			return true;
		}
		
		return false;
		
	}
	
	public void add(int indice, Object dato) { // repasar he fallado
		
		if(indice<0||indice>=numElementos){
			throw new IndexOutOfBoundsException("error");
		}
		
		comprobarLlenado();
		
		if(indice > 0) { // o indice < numElementos
			
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
			
		}
		
		arrayElementos[indice]=dato;
		numElementos++;
		
	}
	
	public void add(Object dato) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=dato;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=dato;
			
		}
		
		numElementos++;
		
	}
	
	private void comprobarLlenado() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] ampliado = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
			arrayElementos=ampliado;
			
		}
		
	}
	
	public int size() {
		
		return numElementos;
		
	}
	
	public void clear() {
		
		this.arrayElementos=new Object[NUM_INICIAL];
		this.numElementos=0;
		
	}
	
	public boolean isEmpty() {
		
		return numElementos==0;
		
	}
	
	public int indexOf(Object dato) {
		
		if(dato==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(arrayElementos[i]==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(dato.equals(arrayElementos[i])) {
					return i;
				}
				
			}
			
		}
		
		return -1;
		
	}
	
	public boolean contains(Object dato) {
		
		int indice = indexOf(dato);
		
		return indice >= 0;
		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos){
			throw new IndexOutOfBoundsException("error");
		}
		
		return arrayElementos[indice];
		
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
	
	public Object peek() {
		
		if(numElementos>0) {
			return arrayElementos[numElementos-1];
		}
		
		return null;
		
	}
	
	public Object pop() {
		
		if(numElementos>0) {
			
			Object salida = arrayElementos[numElementos-1];
			arrayElementos[numElementos-1]=null;
			numElementos--;
			return salida;	
			
		}
		
		return null;
		
	}
	
	public void push(Object dato) {
		
		comprobarLlenado();
		arrayElementos[numElementos]=dato;
		numElementos++;	
		
	}
	
	public Object[] toArray() {
		
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			
			salida[i]=arrayElementos[i];
			
		}
		
		return salida;
		
	}
	
	/*
	 * METODOS DE COLA / QUEUE
	 * 
	 * ** Object peekCola() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
	 * Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
	 * ** void offer(Object) 		- Añade un elemento al final de la cola.
	 * 
	 */
	
	public Object poll() { // REPASAR
		
		if(numElementos>0) {
			
			Object salida = arrayElementos[0];
			int indice = 0;
			System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1)); // CUIDADO CON ESTA LINEA
			//arrayElementos[numElementos-1]=null; CREO QUE NO HACE FALTA
			numElementos--;
			return salida;
		}
		
		return null;
		
	}
	
	public void offer(Object dato) {
		
		comprobarLlenado();
		arrayElementos[numElementos]=dato;
		numElementos++;
		
	}
	
	public Object peekCola() {
		
		if(numElementos>0) {
			return arrayElementos[0];
		}
		
		return null;
		
	}
	
}