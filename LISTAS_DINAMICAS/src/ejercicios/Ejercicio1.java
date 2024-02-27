package ejercicios;

/*
 * Copia y prueba de forma completa la implementación de lista basada en array que se 
 * proporciona en el manual de Java, en el  Capítulo 9. Estructuras dinámicas lineales
 * 
 * Haz una prueba completa de todos los métodos de la clase.
 * Deben seguirse los principios y estilo del código limpio.
 */

/*
 * boolean isEmpty() 		- Comprueba si la lista está vacía.
 * boolean remove(Object) 	- Elimina el elemento correspondiente.
 * Object remove(int) 		- Elimina el elemento de la posición indicada por índice.
 * 
 */

public class Ejercicio1 {
	
	private final int NUM_INICIAL = 4;
	private int numElementos;
	private Object[] arrayElementos;
	
	public Ejercicio1() {
		
		this.numElementos = 0;
		this.arrayElementos = new Object[NUM_INICIAL];
		
	}
	
	public void add(Object objeto) {
		
		if(numElementos==0) {
			
			arrayElementos[0]=objeto;
			numElementos ++;
			
		}else {
			
			comprobarLlenado();
			arrayElementos[numElementos]=objeto;
			numElementos ++;
			
		}
		
	}
	
	private void comprobarLlenado() {
		
		if(arrayElementos.length == numElementos+1) {
			
			Object[] arrayAmpliado = new Object[arrayElementos.length*2];
			
			System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
			
			arrayElementos=arrayAmpliado;
			
		}
		
	}
	
	public int size() {
		
		return numElementos;
				
	}
	
	private int indexOf(Object objeto) {
		
		if(objeto == null) {
			
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
	
	public void clear() {
		
		arrayElementos = new Object[NUM_INICIAL];
		numElementos=0;
		
	}
	
	public boolean contains(Object objeto) {
		
		if(indexOf(objeto)>=0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
			
		}
		
		return arrayElementos[indice];
		
	}
	
	public Object remove(int indice) {
		
		if(indice<0||indice>=numElementos) {
			
			throw new IndexOutOfBoundsException("Índice incorrecto: "+ indice);
			
		}
		
		// Elimina desplazando uno hacia la izquierda, sobre la posición a borrar.
		Object elemento = arrayElementos[indice];
		System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1));

		// Ajusta el último elemento.
		arrayElementos[numElementos-1] = null;
		numElementos--;
		return elemento;
		
		
	}
	
	public int remove(Object objeto) {
		
		int indice = indexOf(objeto);
		
		if(indice!=-1) {
			remove(indice);
		}
		
		return indice;
		
	}
	
}