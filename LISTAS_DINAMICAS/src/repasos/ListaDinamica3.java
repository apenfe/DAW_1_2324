package repasos;

/*
 * ADD INDICE
 */

public class ListaDinamica3{
	
	private int numElementos;
	private static final int NUM_INICIAL = 4;
	private Object[] arrayElementos;
	
	public ListaDinamica3() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public void add(int indice, Object objeto) {
		
		if(indice<0|| indice<=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		comprobarLlenado();
		
		if(indice<numElementos) {
			
			System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-(indice));
			
		}
		
		arrayElementos[indice]=objeto;
		numElementos++;
		
	}
	
	public Object remove(int indice) {
		
		if(indice<0|| indice<=numElementos) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Object salida = arrayElementos[indice];
		
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos-(indice+1));
		arrayElementos[numElementos-1]=null;
		numElementos--;
		
		return salida;
	}
	
	public int remove(Object object) {
		
		int indice = indexOf(object);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
	public void add(Object object) {
		
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
	
	public boolean contains(Object object) {
		
		int indice = indexOf(object);
		
		if(indice!=-1) {
			return true;
		}
		
		return false;
		
	}
	
	public int indexOf(Object object) {
		
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
	
	public void removeAll(ListaDinamica3 lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			remove(lista.get(i));
			
		}
		
	}
	
}