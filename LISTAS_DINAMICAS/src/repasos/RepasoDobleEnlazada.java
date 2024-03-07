package repasos;

public class RepasoDobleEnlazada{
	
	private int numElementos;
	private NodoDoble primero;
	private NodoDoble ultimo;
	
	public int remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			
			remove(indice);
			
		}
		
		return indice;
			
	}
	
	public Object remove(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error indice");
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
		
		NodoDoble actual = primero;
		NodoDoble siguiente = actual.siguiente;
		
		if(siguiente==null) {
			
			primero = null;
			ultimo = null;
			numElementos = 0;
			
		}else {
			
			siguiente.anterior=null;
			primero=siguiente;
			numElementos--;
			
		}

		return actual.dato;

	}

	private Object removeUltimo() {
		
		NodoDoble actual = ultimo;
		NodoDoble ant = actual.anterior;
		
		if(ant==null) {
			
			primero = null;
			ultimo = null;
			numElementos = 0;
			
		}else {
			
			ant.siguiente=null;
			ultimo=ant;
			numElementos--;
			
		}

		return actual.dato;

	}
	
	private Object removeIntermedio(int indice) {
		
		NodoDoble actual = obtenerNodo(indice);
		NodoDoble ant = actual.anterior;
		NodoDoble sig = actual.siguiente;

		ant.siguiente=sig;
		sig.anterior=ant;
	
		numElementos--;
		return actual.dato;
		
	}
	
	public int indexOf(Object dato) {
		
		NodoDoble actual = primero;
		
		for (int i = 0; actual!=null ; i++) {
			
			if((actual.dato != null && actual.dato.equals(dato))||(actual.dato==dato)) {
				return i;
			}
			
			actual=actual.siguiente;
			
		}
		
		return -1;
		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error indice");
		}
		
		if(size()>0) {
			
			NodoDoble actual = obtenerNodo(indice);
			return actual.dato;
			
		}
		
		return null;
			
	}
	
	public void clear() {
		
		primero = null;
		ultimo = null;
		numElementos = 0;
		
	}
	
	public int size() {
		
		return numElementos;
	
	}

	public RepasoDobleEnlazada() {

		primero = null;
		ultimo = null;
		numElementos = 0;

	}

	public void add(Object dato) {
		
		insertarUltimo(dato);
		
	}

	public void add(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error indice");
		}
		
		if(indice==0) {
			
			insertarPrimero(dato);
			
		}else if(indice==numElementos-1) {
			
			insertarUltimo(dato);
			
		}else {
			
			insertarIntermedio(indice,dato);
			
		}
		
	}

	private void insertarIntermedio(int indice, Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		NodoDoble actual = obtenerNodo(indice);
		NodoDoble ant = actual.anterior;
		
		actual.anterior=nuevo;
		ant.siguiente=nuevo;
		nuevo.siguiente=actual;
		nuevo.anterior=ant;
		
		numElementos++;
		
	}

	private void insertarPrimero(Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			ultimo=nuevo;
			
		}else {
			
			NodoDoble actual = primero;
			actual.anterior=nuevo;
			nuevo.siguiente=actual;
			primero=nuevo;
				
		}
		
		numElementos++;
		
	}

	private void insertarUltimo(Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			ultimo=nuevo;
			
		}else {
			
			NodoDoble actual= ultimo;
			actual.siguiente=nuevo;
			nuevo.anterior=actual;
			ultimo=nuevo;
			
		}
		
		numElementos++;

	}

	private NodoDoble obtenerNodo(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error indice");
		}
		
		NodoDoble actual = null;
		
		if (indice < numElementos/2) {
			
			actual = primero;
			
			for (int i = 0; i < indice; i++) {
				
				actual=actual.siguiente;
				
			}	
			
		}else {
			
			actual= ultimo;
			
			for (int i = numElementos-1; i > indice; i--) {
				
				actual=actual.anterior;
				
			}
			
		}
		
		return actual;
		
	}
	
	// -----------------------------------------------------------------------------------------------------
	
	public int removeV2(Object dato) {
		
		int indice = indexOfV2(dato);
		
		if(indice!=-1) {
			removeV2(indice);
		}
		
		return indice;	
			
	}
	
	public Object removeV2(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(indice==0) {
			
			return removePrimeroV2();
			
		}else if(indice==numElementos-1) {
			
			return removeUltimoV2();
			
		}else {
			
			return removeIntermedioV2(indice);
			
		}	
		
	}

	private Object removePrimeroV2() {
		
		NodoDoble actual = primero;
		
		if(actual.siguiente==null) {
			
			clearV2();
			
		}else {
			
			NodoDoble sig = actual.siguiente;
			sig.anterior=null;
			primero=sig;
			
			numElementos--;
			
		}
		
		return actual.dato;

	}

	private Object removeUltimoV2() {
		
		NodoDoble actual = ultimo;
		
		if(actual.anterior==null) {
			
			clearV2();
			
		}else {
			
			NodoDoble ant = actual.anterior;
			ant.siguiente=null;
			ultimo=ant;
			
			numElementos--;
			
		}
		
		return actual.dato;

	}
	
	private Object removeIntermedioV2(int indice) {
		
		NodoDoble actual = obtenerNodoV2(indice);
		NodoDoble ant = actual.anterior;
		NodoDoble sig = actual.siguiente;
		
		ant.siguiente=sig;
		sig.anterior=ant;
		
		numElementos--;
		return actual.dato;

	}
	
	public int indexOfV2(Object dato) {
		
		NodoDoble actual = primero;
		
		for (int i = 0; actual != null; i++) {
			
			if((dato!=null && dato.equals(actual.dato))||(dato==actual.dato)) {
				
				return i;
				
			}
			
			actual=actual.siguiente;
			
		}
		
		return -1;
		
	}
	
	public Object getV2(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		NodoDoble salida = obtenerNodo(indice);
		
		return salida.dato;	
			
	}
	
	public void clearV2() {
		
		this.primero=null;
		this.ultimo=null;
		this.numElementos=0;
		
	}
	
	public int sizeV2() {
		
		return numElementos;
	
	}

	public void addV2(Object dato) {
		
		insertarUltimoV2(dato);
		
	}

	public void addV2(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(indice==0) {
			
			insertarPrimeroV2(dato);
			
		}else if(indice==numElementos-1) {
			
			insertarUltimoV2(dato);
			
		}else {
			
			insertarIntermedioV2(indice,dato);
			
		}
		
	}

	private void insertarIntermedioV2(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error");
		}
		
		NodoDoble nuevo = new NodoDoble(dato);
		NodoDoble actual = obtenerNodoV2(indice);
		NodoDoble ant = actual.anterior;
		
		actual.anterior=nuevo;
		ant.siguiente=nuevo;
		nuevo.siguiente=actual;
		nuevo.anterior=ant;
		
		numElementos++;
		
	}

	private void insertarPrimeroV2(Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		if(numElementos==0) {
			
			this.primero=nuevo;
			this.ultimo=nuevo;
			
		}else {
			
			NodoDoble actual= primero;
			actual.anterior=nuevo;
			nuevo.siguiente=actual;
			primero=nuevo;
			
		}
		
		numElementos++;
		
	}

	private void insertarUltimoV2(Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		if(numElementos==0) {
			
			this.primero=nuevo;
			this.ultimo=nuevo;
			
		}else {
			
			NodoDoble actual= ultimo;
			actual.siguiente=nuevo;
			nuevo.anterior=actual;
			ultimo=nuevo;
			
		}
		
		numElementos++;

	}

	private NodoDoble obtenerNodoV2(int indice) {
		
		NodoDoble actual = null;
		
		if(indice < numElementos/2) {
			
			actual=primero;
			
			for (int i = 0; i < indice; i++) {
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			actual=ultimo;
			
			for (int i = numElementos-1; i > indice; i--) {
				
				actual=actual.anterior;
				
			}
			
		}
		
		return actual;
		
	}

}

class NodoDoble{
	
	public Object dato;
	public NodoDoble siguiente;
	public NodoDoble anterior;
	
	public NodoDoble(Object dato) {
		
		this.siguiente=null;
		this.anterior=null;
		
	}
	
}