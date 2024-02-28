package repasos;

public class ListaDinamica{
	
	private int numElementos;
	private final int NUM_INICIAL = 4;
	private Object[] arrayElementos;
	
	public ListaDinamica() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public int size() {
	       return numElementos;
	}

	/*
	 * remove()
	 */
	
	public void add(Object objeto) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=objeto;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=objeto;
			
		}
		
		numElementos++;
		
	}
	
	public void add(int indice, Object objeto) {
		
		if(indice<0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
		}
		
		comprobarLlenado();
		
		if(indice<numElementos) {
			
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
			
		}
		
		arrayElementos[indice]=objeto;
		numElementos++;	
		
	}
	
	private void comprobarLlenado() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] nuevo = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, nuevo, 0, numElementos);
			
			arrayElementos=nuevo;
		}
		
	}
	
	public int indexOf(Object objeto) {
		
		if(objeto==null) {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i]==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(objeto.equals(arrayElementos[i])) {
					return i;
				}
				
			}
			
		}
		
		return -1;
		
	}
	
	public void clear() {
		this.arrayElementos=new Object[NUM_INICIAL];
		numElementos=0;
	}
	
	public boolean contains(Object objeto) {
		
		if(indexOf(objeto)>=0) {
			return true;
		}
		
		return false;
		
	}
	
	public Object get(int indice) {
		
		if(indice<0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
		}
		
		return arrayElementos[indice];
		
	}
	
	public Object remove(int indice) {
		
		if(indice<0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
		}
		
		Object salida = get(indice);
		
		
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos-(indice+1));
		arrayElementos[numElementos-1] = null;
		return salida;
	}
	
	public int remove(Object objeto) {
		
		if(contains(objeto)) {
			
			int index = indexOf(objeto);
			remove(index);
			return index; 
			
		}
		
		return -1;
		
	}
	
}