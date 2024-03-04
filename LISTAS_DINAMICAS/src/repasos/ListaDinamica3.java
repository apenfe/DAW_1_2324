package repasos;

/*
 * ADD INDICE
 * REMOVE INDICE
 */

public class ListaDinamica3<E>{
	
	private int numElementos;
	private static final int NUM_INICIAL = 4;
	private Object[] arrayElementos;
	
	public ListaDinamica3() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public int remove(E object) {
		
		int indice = indexOf(object);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	public void add(E object) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=object;
			
		}else {
			
			comprobarLlenado();
			
			arrayElementos[numElementos]=object;
			
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
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
	}
	
	public Object get(int indice) {
		
		if(indice<0|| indice<=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		return arrayElementos[indice];
		
	}
	
	public boolean contains(E object) {
		
		int indice = indexOf(object);
		
		if(indice!=-1) {
			return true;
		}
		
		return false;
		
	}
	
	public int indexOf(E object) {
		
		if(object==null) {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i]==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(object.equals(arrayElementos[i])) {
					return i;
				}
				
			}
			
		}
		
		return -1;
		
	}
	
}