package ejercicios;

/*
 * Escribe una implementación del TDA cola basada en un array.
 * Puede servir, restringiendo operaciones, la implementación de lista basada en array 
 * que se proporciona en el manual de Java, en el  Capítulo 9. Estructuras dinámicas lineales.
 * 
 * Deben seguirse los principios y estilo del código limpio. 
 */

public class ColaArray<E>{
	
	private int numElementos;
	private Object[] arrayElementos;
	private static final int NUM_INICIAL = 4;
	
	public ColaArray() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public void offer(E objeto) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=objeto;
			
		}else {
			
			comprobarEspacio();
			arrayElementos[numElementos]=objeto;
			
		}
		
		numElementos++;
		
	}
	
	private void comprobarEspacio() {
		
		if(numElementos+1 == arrayElementos.length) {
		
			Object[] ampliado = new Object[arrayElementos.length*2];
			System.arraycopy(arrayElementos, 0, ampliado, 0, numElementos);
			arrayElementos=ampliado;
			
		}
		
	}
	
	public Object poll() {
		
		if(!isEmpty()) {
			
			Object cabeza = arrayElementos[0];
			Object[] ampliado = new Object[numElementos];
			System.arraycopy(arrayElementos, 1, ampliado, 0, numElementos);
			arrayElementos=ampliado;
			numElementos --;
			return cabeza;
			
		}
		
		return null;
		
	}
	
	public Object peek() {
		
		if(!isEmpty()) {
			return arrayElementos[0];
		}
		
		return null;
	}
	
	public int size() {
		return numElementos;
	}
	
	public boolean isEmpty() {
		
		return size()==0;
		
	}
	
	public void clear() {
		
		this.numElementos=0;
		this.arrayElementos=new Object[NUM_INICIAL];
		
	}
	
	public boolean contains(E objeto) {
		
		return indexOf(objeto)!=-1;
		
	}
	
	public int indexOf(E objeto) {
		
		if(objeto==null) {
			
			for (int i = 0; i < arrayElementos.length; i++) {
				
				if(arrayElementos[i]==objeto) {
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
	
	
}