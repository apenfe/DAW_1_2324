package repasos;

/*
Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
Object pop() 			- Extrae el elemento situado en la cima de la pila.
void push(Object) 		- Añade un elemento en la cima de la pila.

 */

public class PilaArray{
	
	public int numElementos;
	public static final int NUM_INICIAL = 4;
	public Object[] arrayElementos;
	
	public PilaArray() {
		
		this.arrayElementos = new Object[NUM_INICIAL];
		this.numElementos = 0;	
		
	}
	
	public Object peek() {
		
		if(numElementos==0) {
			return null;
		}
		
		return arrayElementos[numElementos-1];
		
	}
	
	public Object pop() {
		
		if(numElementos==0) {
			return null;
		}
		
		Object elimino = arrayElementos[numElementos-1];
		arrayElementos[numElementos-1]=null;
		numElementos--;
		
		return elimino;
		
	}

	public void push(Object objeto) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=objeto;
			
		}else {
			
			comprobarLlenado();
			
			arrayElementos[numElementos]=objeto;
			
		}
		
		numElementos++;
	
	}
	
	public void comprobarLlenado() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] ampliado = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
			arrayElementos=ampliado;
			
		}
		
	}
	
	public Object[] toArray() {
		
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			
			salida[i]=arrayElementos[i];
			
		}
		
		return salida;
		
	}
	
	public void clear() {
		
		this.arrayElementos = new Object[NUM_INICIAL];
		this.numElementos = 0;
		
	}
	
	public int indexOf(Object dato) {
		
		if(dato==null) {
		
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i]==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(dato.equals(arrayElementos[i])) {
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
	
	public boolean isEmpty() {
		
		if(size()==0) {
			return true;
		}
		
		return false;
	}
	
	public int size() {
		return numElementos;
	}
	
}