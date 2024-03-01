package ejercicios;

public class Ejercicio6<E>{
	
	private final int NUM_INICIAL = 4;
	private int numElementos;
	private Object[] arrayElementos;
	
	public Ejercicio6() {
		
		this.arrayElementos = new Object[NUM_INICIAL];
		this.numElementos = 0;
		
	}
	
	public void clear() {
		
		this.arrayElementos = new Object[NUM_INICIAL];
		this.numElementos = 0;
		
	}
	
	public boolean contains(E objeto) {
		
		if(indexOf(objeto)!=-1) {
			return true;
		}
		return false;
		
	}
	
	public int indexOf(E objeto) {
		
		if(objeto==null) {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i]==null) {
					return i;
				}
				
			}
			
		}else {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i].equals(objeto)) {
					return i;
				}
				
			}
			
		}
		
		return -1;
		
	}
	
	public boolean isEmpty() {
		
		if(size()>0) {
			return false;
		}
		return true;
		
	}
	
	public int size() {
		return numElementos;
	}
	
	/*Object peek() 			- Obtiene el elemento de la cima de la pila sin quitarlo.
Object pop() 			- Extrae el elemento situado en la cima de la pila.
void push(Object) 		- Añade un elemento en la cima de la pila.

	 * 
	 */
	
	public Object peek() {
		
		if(!isEmpty()) {
			
			return arrayElementos[numElementos-1];
		}

		return null;
		
	}
	
	public Object pop() {
		
		if(!isEmpty()) {
			
			Object actual = arrayElementos[numElementos-1];
			arrayElementos[numElementos-1]=null;
			numElementos--;
			return actual;

		}

		return null;
		
	}
	
	private void revisarElementos() {
		
		if(numElementos+1==arrayElementos.length) {
			
			Object[] arrayAmpliado = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, arrayElementos.length);
			
			arrayElementos=arrayAmpliado;
			
		}
		
	}
	
	public void push(E objeto) {
		
		if(numElementos==0) {
			
			arrayElementos[0]= objeto;
			numElementos++;
			
		}else {
			
			revisarElementos();
			
			arrayElementos[numElementos]=objeto;
			numElementos++;
			
		}
		
	}
	
	public Object[] toArray() {
		
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			
			salida[i]=arrayElementos[i];
			
		}
		
		return salida;
		
	}
	
}