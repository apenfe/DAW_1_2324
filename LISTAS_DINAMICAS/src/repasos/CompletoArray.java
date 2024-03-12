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
		
		if(indice < numElementos) { 
			
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
	 * ** Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
	 * ** void offer(Object) 		- Añade un elemento al final de la cola.
	 * 
	 */
	
	public Object poll() { // REPASAR
		
		if(numElementos>0) {
			
			Object salida = arrayElementos[0];
			
			for (int i = 0; i < numElementos-1; i++) {
				arrayElementos[i]=arrayElementos[i+1];
			}
			
			arrayElementos[numElementos-1]=null;
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
	
	// ------------------- REPASO 2 ----------------------------------------------------
	
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
	
	public void removeAllV2(CompletoArray lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			remove(lista.get(i));
		}
		
	}
	
	public Object removeV2(int indice) { // repasar he fallado
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Object salida = arrayElementos[indice];
		
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1));
		
		arrayElementos[numElementos-1]=null;
		numElementos--;
		
		return salida;
		
	}
	
	public boolean removeV2(Object dato) {
		
		int indice = indexOfV2(dato);
		
		if(indice!=-1) {
			remove(indice);
			return true;
		}
		
		return false;
		
	}
	
	public void addV2(int indice, Object dato) { // repasar he fallado
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		comprobarLlenadoV2();
		
		if(numElementos>indice) {
			
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
			
		}
		
		arrayElementos[indice]=dato;
		numElementos++;
		
	}
	
	public void addV2(Object dato) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=dato;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=dato;	
			
		}
		
		numElementos++;
		
	}
	
	private void comprobarLlenadoV2() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] ampliado = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
			arrayElementos=ampliado;
			
		}
		
	}
	
	public int sizeV2() {
		
		return numElementos;
		
	}
	
	public void clearV2() {
		
		this.arrayElementos=new Object[NUM_INICIAL];
		this.numElementos=0;
		
	}
	
	public boolean isEmptyV2() {
		
		return numElementos==0;
		
	}
	
	public int indexOfV2(Object dato) {
		
		if(dato==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(dato==arrayElementos[i]) {
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
	
	public Object peekV2() {
		
		if(numElementos>0) {
			return arrayElementos[numElementos-1];
		}
		
		return null;
		
	}
	
	public Object popV2() {
		
		if(numElementos>0) {
			
			Object salida = arrayElementos[numElementos-1];
			arrayElementos[numElementos-1]=null;
			numElementos--;
			return salida;
			
		}
		
		return null;
		
	}
	
	public void pushV2(Object dato) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=dato;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=dato;	
			
		}
		
		numElementos++;
		
	}
	
	public Object[] toArrayV2() {
		
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=arrayElementos[i];
		}
		
		return salida;
		
	}
	
	/*
	 * METODOS DE COLA / QUEUE
	 * 
	 * ** Object peekCola() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
	 * ** Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
	 * ** void offer(Object) 		- Añade un elemento al final de la cola.
	 * 
	 */
	
	public Object pollV2() { // REPASAR
		
		if(numElementos>0) {
			
			Object salida = arrayElementos[0];
			System.arraycopy(arrayElementos, 1, arrayElementos, 0, numElementos-1);
			arrayElementos[numElementos-1]=null;
			numElementos--;
			return salida;
			
		}
		
		return null;
		
	}
	
	public void offerV2(Object dato) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=dato;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=dato;	
			
		}
		
		numElementos++;
		
	}
	
	public Object peekColaV2() {
		
		if(numElementos>0) {
			return arrayElementos[0];
		}
		
		return null;
		
	}
	
	// ------------------- REPASO 3 ----------------------------------------------------
	
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
		
		public void removeAllV3(CompletoArray lista) {
			
			for (int i = 0; i < lista.size(); i++) {
				
				remove(lista.get(i));
				
			}
			
		}
		
		public Object removeV3(int indice) { // repasar he fallado
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
			
			Object salida = arrayElementos[indice];
			
			System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1));
			
			arrayElementos[numElementos-1]=null;
			numElementos--;
			
			return salida;
			
		}
		
		public boolean removeV3(Object dato) {
			
			int indice = indexOfV3(dato);
			
			if(indice!=-1) {
				
				remove(indice);
				return true;
			}
			
			return false;
			
		}
		
		public void addV3(int indice, Object dato) { // repasar he fallado
			
			if(indice<0||indice>=numElementos) {
				throw new IndexOutOfBoundsException("error");
			}
			
			comprobarLlenadoV3();
			
			if(indice<numElementos) {
				
				System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
				
			}
			
			arrayElementos[indice]=dato;
			numElementos++;
			
		}
		
		public void addV3(Object dato) {
			
			if(numElementos==0) {
				
				arrayElementos[0]=dato;
						
			}else {
				
				comprobarLlenadoV3();
				arrayElementos[numElementos]=dato;
				
			}
			
			numElementos++;
			
		}
		
		private void comprobarLlenadoV3() {
			
			if(numElementos+1==arrayElementos.length) {
				
				Object[] ampliado = new Object[arrayElementos.length*2];
				System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
				arrayElementos=ampliado;
				
			}	
			
		}
		
		public int sizeV3() {
			
			return numElementos;
			
		}
		
		public void clearV3() {
			
			this.numElementos = 0;
			this.arrayElementos = new Object[NUM_INICIAL];
			
		}
		
		public boolean isEmptyV3() {
			
			if(numElementos==0) {
				
				return true;
				
			}
			
			return false;
			
		}
		
		public int indexOfV3(Object dato) {
			
			if(dato==null) {
				
				for (int i = 0; i < numElementos; i++) {
					
					if(dato==arrayElementos[i]) {
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
		
		public Object peekV3() {
			
			if(numElementos>0) {
				
				return arrayElementos[numElementos-1];
				
			}
			
			return null;
			
		}
		
		public Object popV3() {
			
			if(numElementos>0) {
				
				Object salida = arrayElementos[numElementos-1];
				arrayElementos[numElementos-1]=null;
				numElementos--;
				return salida;
				
			}
			
			return null;
			
		}
		
		public void pushV3(Object dato) {
			
			if(numElementos==0) {
				
				arrayElementos[0]=dato;
						
			}else {
				
				comprobarLlenadoV3();
				arrayElementos[numElementos]=dato;
				
			}
			
			numElementos++;
				
		}
		
		public Object[] toArrayV3() {
			
			Object[] salida = new Object[numElementos];
			
			for (int i = 0; i < salida.length; i++) {
				salida[i]=arrayElementos[i];
			}
			
			return salida;
			
		}
		
		/*
		 * METODOS DE COLA / QUEUE
		 * 
		 * ** Object peekCola() 			- Obtiene el elemento de la cabeza de la cola sin quitarlo.
		 * ** Object poll() 			- Extrae el elemento situado en la cabeza de la cola.
		 * ** void offer(Object) 		- Añade un elemento al final de la cola.
		 * 
		 */
		
		public Object pollV3() { // REPASAR
			
			if(numElementos>0) {
				
				Object salida = arrayElementos[0];
				
				System.arraycopy(arrayElementos, 1, arrayElementos, 0, numElementos-(1));
				arrayElementos[numElementos-1]=null;
				
				numElementos--;
				return salida;
				
			}
			
			return null;
				
		}
		
		public void offerV3(Object dato) {
			
			if(numElementos==0) {
				
				arrayElementos[0]=dato;
						
			}else {
				
				comprobarLlenadoV3();
				arrayElementos[numElementos]=dato;
				
			}
			
			numElementos++;
			
		}
		
		public Object peekColaV3() {
			
			if(numElementos>0) {
				
				return arrayElementos[0];
				
			}
			
			return null;
			
			
		}
		
	// ------------------- REPASO 4 ----------------------------------------------------
		
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
			
			public void removeAllV4(CompletoArray lista) {
				
				for (int i = 0; i < lista.size(); i++) {
					
					remove(lista.get(i));
					
				}
				
			}
			
			public Object removeV4(int indice) { // repasar he fallado
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				Object actual = arrayElementos[indice];
				System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos-(indice+1));
				arrayElementos[numElementos-1]=null;
				numElementos--;
				return actual;
				
			}
			
			public boolean removeV4(Object dato) {
				
				int indice = indexOf(dato);
				
				if(indice!=-1) {
					remove(indice);
					return true;
				}
				
				return false;
				
			}
			
			public void addV4(int indice, Object dato) { // repasar he fallado
				
				if(indice<0||indice>=numElementos) {
					throw new IndexOutOfBoundsException("error");
				}
				
				comprobarLlenadoV4();
				
				if(indice<numElementos) {
					System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
				}
				
				arrayElementos[indice]=dato;
				numElementos++;
				
			}
			
			public void addV4(Object dato) {
				
				if(numElementos==0) {
					arrayElementos[0]=dato;
				}else {
					comprobarLlenado();
					arrayElementos[numElementos]=dato;
				}
				
				numElementos++;
				
			}
			
			private void comprobarLlenadoV4() {
				
				if(numElementos+1 == arrayElementos.length ) {
					
					Object[] ampliado = new Object[arrayElementos.length*2];
					System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
					arrayElementos=ampliado;
					
				}
				
			}
			
			public int sizeV4() {
				
				return numElementos;
								
			}
			
			public void clearV4() {
				
				this.numElementos=0;
				this.arrayElementos= new Object[NUM_INICIAL];
				
			}
			
			public boolean isEmptyV4() {
				
				if(numElementos==0) {
					return true;
				}
				
				return false;
				
			}
			
			public int indexOfV4(Object dato) {
				
				if(dato==null) {
					
					for (int i = 0; i < numElementos; i++) {
						
						if(dato==arrayElementos[i]) {
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
			
			public boolean containsV4(Object dato) {
				
				int indice = indexOf(dato);
				
				if(indice!=-1) {
					return true;
				}
				
				return false;
				
			}
			
			public Object getV4(int indice) {
				
				if(numElementos>0) {
					return arrayElementos[indice];
				}
				
				return null;
				
			}
			
	
}