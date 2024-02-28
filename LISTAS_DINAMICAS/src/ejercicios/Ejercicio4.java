package ejercicios;

/*
 * Escribe un método, que falta en la implementación de la lista dinámica que se proporciona 
 * en el manual de Java, en el  Capítulo 9. Estructuras dinámicas lineales. 
 * 
 * El método se llamará public void removeAll(ListaDinamica datosAborrar) sirve para poder 
 * eliminar de la lista todos los elementos que se le proporcionan en otra lista pasada como 
 * argumento.
 * 
 * Se recomienda echar un vistazo a la implementación hecha en la versión de lista dinámica.
 * Deben seguirse los principios y estilo del código limpio.
 * 
 */

public class Ejercicio4 {
	
	private final int NUM_INICIAL = 4;
	private int numElementos;
	private Object[] arrayElementos;
	
	public Ejercicio4() {
		
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
	
	public void removeAll(Ejercicio4 datosAborrar) {
		
		for (int i = 0; i < datosAborrar.size(); i++) {
			
			remove(datosAborrar.get(i));
			
		}
		
	}
	
}