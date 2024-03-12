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
	
	// ----------------------- REPASO 3 ------------------------------------------------------
	
	public int removeV3(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			removeV3(indice);
		}
		
		return indice;
			
	}
	
	public Object removeV3(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(indice==0) {
			
			return removePrimeroV3();
			
		}else if(indice==numElementos-1) {
			
			return removeUltimoV3();
			
		}else {
			
			return removeIntermedioV3(indice);

		}
		
	}

	private Object removePrimeroV3() {
		
		NodoDoble actual = primero;
		
		if(primero.siguiente==null) {
			
			primero=null;
			ultimo=null;
			
		}else {
			
			NodoDoble sig = actual.siguiente;
			sig.anterior=null;
			primero=sig;
			
		}
	
		numElementos--;
		return actual.dato;

	}

	private Object removeUltimoV3() {
		
		NodoDoble actual = ultimo;
		
		if(ultimo.anterior==null) {
			
			primero=null;
			ultimo=null;
			
		}else {
			
			NodoDoble ant = actual.anterior;
			ant.siguiente=null;
			ultimo=ant;
			
		}
	
		numElementos--;
		return actual.dato;

	}
	
	private Object removeIntermedioV3(int indice) {
		
		NodoDoble actual = obtenerNodoV3(indice);
		NodoDoble ante = actual.anterior;
		NodoDoble sig = actual.siguiente;
		
		ante.siguiente=sig;
		sig.anterior=ante;
	
		numElementos--;
		return actual.dato;

	}
	
	public int indexOfV3(Object dato) {
		
		NodoDoble actual = primero;
		
		for (int i = 0; actual != null; i++) {
			
			if((actual.dato!=null && actual.dato.equals(dato))||(dato==actual.dato)) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	public Object getV3(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(numElementos>0) {
			
			NodoDoble salida = obtenerNodo(indice);
			return salida.dato;
			
		}
		
		return null;	
			
	}
	
	public void clearV3() {
		
		this.ultimo=null;
		this.primero=null;
		this.numElementos=0;
		
	}
	
	public int sizeV3() {
		
		return numElementos;
	
	}

	public void addV3(Object dato) {
		
		insertarUltimoV3(dato);
		
	}

	public void addV3(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if(indice==0) {
			
			insertarPrimeroV3(dato);
			
		}else if(indice==numElementos-1) {
			
			insertarUltimoV3(dato);
			
		}else {
			
			insertarIntermedioV3(indice,dato);

		}
		
	}

	private void insertarIntermedioV3(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Error");
		}
		
		NodoDoble nuevo = new NodoDoble(dato);
		NodoDoble actual = obtenerNodo(indice);
		NodoDoble ant = actual.anterior;
		
		ant.siguiente=nuevo;
		actual.anterior=nuevo;
		nuevo.anterior=ant;
		nuevo.siguiente=actual;
		
		numElementos++;
		
	}

	private void insertarPrimeroV3(Object dato) {
		
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

	private void insertarUltimoV3(Object dato) {
		
		NodoDoble nuevo = new NodoDoble(dato);
		
		if(numElementos==0) {
			
			primero=nuevo;
			ultimo=nuevo;
			
		}else {
			
			NodoDoble actual = ultimo;
			actual.siguiente=nuevo;
			nuevo.anterior=actual;
			ultimo=nuevo;
			
		}
		
		numElementos++;
		
	}

	private NodoDoble obtenerNodoV3(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		NodoDoble actual = null;
		
		if(indice<numElementos/2) {
			
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
	
	// ----------------------- REPASO 4 ------------------------------------------------------
	
		public int removeV4(Object dato) {
			
			int indice = indexOfV4(dato);
			
			if(indice!=-1) {
				remove(indice);
			}
			
			return indice;
				
		}
		
		public Object removeV4(int indice) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
			if(indice==0) {
				
				return removePrimeroV4();
				
			}else if(indice==numElementos-1) {
				
				return removeUltimoV4();
				
			}else {
				
				return removeIntermedioV4(indice);
				
			}
			
		}

		private Object removePrimeroV4() {
			
			NodoDoble actual = primero;
			
			if(primero.siguiente == null) {
				
				primero=null;
				ultimo=null;
				
			}else {
				
				NodoDoble sig = actual.siguiente;
				sig.anterior=null;
				primero=sig;
				
			}
			
			numElementos--;
			return actual.dato;

		}

		private Object removeUltimoV4() {
			
			NodoDoble actual = ultimo;
			
			if(ultimo.anterior == null) {
				
				primero=null;
				ultimo=null;
				
			}else {
				
				NodoDoble ant = actual.anterior;
				ant.siguiente=null;
				ultimo=ant;
				
			}
			
			numElementos--;
			return actual.dato;

		}
		
		private Object removeIntermedioV4(int indice) {
			
			NodoDoble actual = obtenerNodoV4(indice);
			NodoDoble ante = actual.anterior;
			NodoDoble sig = actual.siguiente;
			
			ante.siguiente=sig;
			sig.anterior=ante;
			
			numElementos--;
			return actual.dato;

		}
		
		public int indexOfV4(Object dato) {
			
			NodoDoble actual = primero;
			
			for (int i = 0; actual != null; i++) {
				
				if((actual.dato!=null&&actual.dato.equals(dato))||(dato==actual.dato)) {
					
					return i;
					
				}
				
				actual = actual.siguiente;
				
			}
			
			return -1;
			
		}
		
		public Object getV4(int indice) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
			if(numElementos>0) {
				
				return obtenerNodo(indice).dato;
			}
			
			return null;
				
		}
		
		public void clearV4() {
			
			this.primero=null;
			this.ultimo=null;
			this.numElementos=0;
			
		}
		
		public int sizeV4() {
			
			return numElementos;
		
		}

		public void addV4(Object dato) {
			
			insertarUltimoV4(dato);
			
		}

		public void addV4(int indice, Object dato) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
			if(indice==0) {
				
				insertarPrimeroV4(dato);
				
			}else if(indice==numElementos-1) {
				
				insertarUltimoV4(dato);
				
			}else {
				
				insertarIntermedioV4(indice,dato);
				
			}
			
		}

		private void insertarIntermedioV4(int indice, Object dato) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
			NodoDoble nuevo = new NodoDoble(dato);
			
			NodoDoble actual = obtenerNodoV4(indice);
			NodoDoble ant = actual.anterior;
			
			ant.siguiente=nuevo;
			actual.anterior=nuevo;
			nuevo.anterior=ant;
			nuevo.siguiente=actual;
			
			numElementos++;
			
		}

		private void insertarPrimeroV4(Object dato) {
			
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

		private void insertarUltimoV4(Object dato) {
			
			NodoDoble nuevo = new NodoDoble(dato);
			
			if(numElementos==0) {
				
				primero=nuevo;
				ultimo=nuevo;
				
			}else {
				
				NodoDoble actual = ultimo;
				actual.siguiente=nuevo;
				nuevo.anterior=actual;
				ultimo=nuevo;
				
			}
			
			numElementos++;
			
		}

		private NodoDoble obtenerNodoV4(int indice) {
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("ERROR");
			}
			
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
		
		// ----------------------- REPASO 5 ------------------------------------------------------
		
			public int removeV5(Object dato) {
				
				int indice = indexOfV5(dato);
				
				if(indice!=-1) {
					remove(indice);
				}
				
				return indice;
				
				
			}
			
			public Object removeV5(int indice) {
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				if(indice==0) {
					
					return removePrimeroV5();
					
				}else if(indice==numElementos-1) {
					
					return removeUltimoV5();
					
				}else {
					
					return removeIntermedioV5(indice);
					
				}	
				
			}

			private Object removePrimeroV5() {
				
				NodoDoble actual = primero;
				
				if(primero.siguiente==null) {
					
					primero=null;
					ultimo=null;
					
				}else {
					
					NodoDoble sig = actual.siguiente;
					sig.anterior=null;
					primero=sig;
					
				}
				
				numElementos--;
				return actual.dato;

			}

			private Object removeUltimoV5() {
				
				NodoDoble actual = ultimo;
				
				if(ultimo.anterior==null) {
					
					primero=null;
					ultimo=null;
					
				}else {
					
					NodoDoble ant = actual.anterior;
					ant.siguiente=null;
					ultimo=ant;
					
				}
				
				numElementos--;
				return actual.dato;

			}
			
			private Object removeIntermedioV5(int indice) {
				
				NodoDoble actual = obtenerNodo(indice);
				NodoDoble ant = actual.anterior;
				NodoDoble sig = actual.siguiente;
				
				ant.siguiente=sig;
				sig.anterior=ant;
				numElementos--;
				
				return actual.dato;
				

			}
			
			public int indexOfV5(Object dato) {
				
				NodoDoble actual = primero;
				
				for (int i = 0; actual!=null; i++) {
					
					if((actual.dato!=null&&actual.dato.equals(dato))||(actual.dato==dato)) {
						
						return i;
						
					}
					
					actual = actual.siguiente;
					
				}
				
				return -1;
				
			}
			
			public Object getV5(int indice) {
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				if(numElementos>0) {
					
					NodoDoble actual = obtenerNodoV5(indice);
					return actual.dato;
					
				}
				
				return null;
					
			}
			
			public void clearV5() {
			
				primero=null;
				ultimo=null;
				numElementos=0;
				
			}
			
			public int sizeV5() {
				
				return numElementos;
			
			}

			public void addV5(Object dato) {
				
				insertarUltimoV5(dato);
				
			}

			public void addV5(int indice, Object dato) {
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				if(indice==0) {
					
					insertarPrimeroV5(dato);
					
				}else if(indice==numElementos-1) {
					
					insertarUltimoV5(dato);
					
				}else {
					
					insertarIntermedioV5(indice,dato);
					
				}	
				
			}

			private void insertarIntermedioV5(int indice, Object dato) {
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("ERROR");
				}
				
				NodoDoble nuevo = new NodoDoble(dato);
				
				NodoDoble actual = obtenerNodoV4(indice);
				NodoDoble ant = actual.anterior;
				
				ant.siguiente=nuevo;
				actual.anterior=nuevo;
				
				nuevo.anterior=ant;
				nuevo.siguiente=actual;
				
				numElementos++;
				
			}

			private void insertarPrimeroV5(Object dato) {
				
				NodoDoble nuevo = new NodoDoble(dato);
				
				if(numElementos>0) {
					
					NodoDoble actual = primero;
					actual.anterior=nuevo;
					nuevo.siguiente=actual;
					
					primero=nuevo;
					
				}else {
					
					primero=nuevo;
					ultimo=nuevo;
					
				}
				
				numElementos++;
				
			}

			private void insertarUltimoV5(Object dato) {
				
				NodoDoble nuevo = new NodoDoble(dato);
				
				if(numElementos>0) {
				
					NodoDoble actual = ultimo;
					actual.siguiente=nuevo;
					nuevo.anterior=actual;
					ultimo=nuevo;
					
				}else {
					
					primero=nuevo;
					ultimo=nuevo;
					
				}
				
				numElementos++;
				
				
			}

			private NodoDoble obtenerNodoV5(int indice) {
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				NodoDoble actual = null;
				
				if(indice<numElementos/2) {
					
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
			
			// ----------------------- REPASO 6 ------------------------------------------------------
			
				public int removeV6(Object dato) {
					
					int indice = indexOf(dato);
					
					if(indice!=-1) {
						
						remove(indice);
						
					}
					
					return indice;
					
				}
				
				public Object removeV6(int indice) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("error");
					}
					
					if(indice==0) {
						
						return removePrimeroV6();
						
					}else if(indice==numElementos-1) {
						
						return removeUltimoV6();
						
					}else {
						
						return removeIntermedioV6(indice);
						
					}
					
				}

				private Object removePrimeroV6() {
					
					NodoDoble actual = primero;
					
					if(primero.siguiente==null) {
						
						primero=null;
						ultimo=null;
						
					}else {
						
						NodoDoble sig = actual.siguiente;
						sig.anterior=null;
						primero=sig;
						
					}
					
					numElementos--;
					return actual.dato;

				}

				private Object removeUltimoV6() {
					
					NodoDoble actual = ultimo;
					
					if(ultimo.anterior==null) {
						
						primero=null;
						ultimo=null;
						
					}else {
						
						NodoDoble ant = actual.anterior;
						ant.siguiente=null;
						ultimo=ant;
						
					}
					
					numElementos--;
					return actual.dato;
					

				}
				
				private Object removeIntermedioV6(int indice) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("ERROR");
					}
					
					NodoDoble actual = obtenerNodoV4(indice);
					NodoDoble ant = actual.anterior;
					NodoDoble sig = actual.siguiente;
					
					ant.siguiente=sig;
					sig.anterior=ant;
					
					numElementos--;
					
					return actual.dato;
					

				}
				
				public int indexOfV6(Object dato) {
					
					NodoDoble actual = primero;
					
					for (int i = 0; actual != null; i++) {
						
						if((actual.dato!=null&&actual.dato.equals(dato))||(actual.dato==dato)) {
							return i;
						}
						
						actual=actual.siguiente;
						
					}
					
					return -1;
					
				}
				
				public Object getV6(int indice) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("error");
					}
					
					if(numElementos>0) {
						
						return obtenerNodoV6(indice).dato;
						
					}
					
					return null;
						
				}
				
				public void clearV6() {
				
					primero=null;
					ultimo=null;
					numElementos=0;
					
				}
				
				public int sizeV6() {
					
					return numElementos;
				
				}

				public void addV6(Object dato) {
					
					insertarUltimoV6(dato);
					
				}

				public void addV6(int indice, Object dato) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("error");
					}
					
					if(indice==0) {
						
						insertarPrimeroV6(dato);
						
					}else if(indice==numElementos-1) {
						
						insertarUltimoV6(dato);
						
					}else {
						
						insertarIntermedioV6(indice,dato);
						
					}
					
				}

				private void insertarIntermedioV6(int indice, Object dato) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("ERROR");
					}
					
					NodoDoble nuevo = new NodoDoble(dato);						
					NodoDoble actual = obtenerNodoV4(indice);
					NodoDoble ant = actual.anterior;
					ant.siguiente=nuevo;
					actual.anterior=nuevo;
					nuevo.anterior=ant;
					nuevo.siguiente=actual;
					
					numElementos++;
					
				}

				private void insertarPrimeroV6(Object dato) {
					
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

				private void insertarUltimoV6(Object dato) {
					
					NodoDoble nuevo = new NodoDoble(dato);
					
					if(numElementos==0) {
						
						primero=nuevo;
						ultimo=nuevo;
						
					}else {
						
						NodoDoble actual = ultimo;
						actual.siguiente=nuevo;
						nuevo.anterior=actual;
						ultimo=nuevo;
						
					}
					
					numElementos++;
					
				}

				private NodoDoble obtenerNodoV6(int indice) {
					
					if(indice<0||indice>=numElementos) {
						throw new IndexOutOfBoundsException("error");
					}
					
					NodoDoble actual = null;
					
					if(indice<numElementos/2) {
						
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
		
		this.dato=dato;
		this.siguiente=null;
		this.anterior=null;
		
	}
	
}