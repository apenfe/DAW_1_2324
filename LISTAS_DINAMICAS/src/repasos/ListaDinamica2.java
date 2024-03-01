package repasos;

public class ListaDinamica2{
	
	public int numElementos;
	public final int NUM_INICIAL = 4;
	public Object[] arrayElementos;
	
	public ListaDinamica2() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public int size() {
		return numElementos;
	}
	
	public Object remove(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("INDICE ERRONEO");
		}
		
		Object eliminado = get(indice);
		
		System.arraycopy(arrayElementos, indice +1 , arrayElementos, indice, numElementos-(indice+1));
		arrayElementos[numElementos-1]=null;
		numElementos--;
		
		return eliminado;
		
	}
	
	public boolean remove(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			remove(indice);
			return true;
		}else {
			return false;
		}
		
	}
	
	public void add(Object dato) {
		
		comprobarLlenado();
		arrayElementos[numElementos]=dato;
		numElementos++;
		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("INDICE ERRONEO");
		}
		
		return arrayElementos[indice];
		
	}
	
	public boolean isEmpty() {
		
		return numElementos==0;
		
	}
	
	public int indexOf(Object dato) {
		
		if(dato==null) {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i] == null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i].equals(dato)) {
					return i;
				}
				
			}

		}
		
		return -1;
		
	}
	
	public boolean contains(Object dato) {
		
		int indice = indexOf(dato);
		
		if(indice!=-1) {
			return true;
		}
		
		return false;
		
	}
	
	public void clear() {
		
		this.arrayElementos=new Object[NUM_INICIAL];
		numElementos=0;
		
	}
	
	public void add(int indice, Object dato) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("INDICE ERRONEO");
		}
		
		comprobarLlenado();

		if(indice<numElementos) {
			
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos - indice);
			
		}
		
		arrayElementos[indice]=dato;
		numElementos++;
		
	}
	
	private void comprobarLlenado() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] nuevoArray = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, nuevoArray, 0, numElementos);
			arrayElementos=nuevoArray;
		}
		
	}
	
	public void removeAll(ListaDinamica2 datosAborrar) {
		
		for (int i = 0; i < datosAborrar.size(); i++) {
			
			remove(datosAborrar.get(i));
			
		}
		
	}
	
}