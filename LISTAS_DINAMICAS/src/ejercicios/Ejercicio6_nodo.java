package ejercicios;

import listasEnlazadas.Nodo;

public class Ejercicio6_nodo<E>{
	
	private Nodo inicial;
	private int numElementos;
	
	public Ejercicio6_nodo() {
		
		this.inicial=null;
		this.numElementos = 0;
		
	}
	
	public void clear() {
		
		this.inicial=null;
		this.numElementos = 0;
		
	}
	
	public boolean contains(E objeto) {
		
		if(indexOf(objeto)!=-1) {
			return true;
		}
		return false;
		
	}
	
	public int indexOf(E objeto) {
		
		Nodo actual = inicial;
		
		if(objeto==null) {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.elemento==null) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}else {
			
			for (int i = 0; i < numElementos; i++) {
				
				if(actual.elemento.equals(objeto)) {
					return i;
				}
				
				actual=actual.siguiente;
				
			}
			
		}
		
		return -1;
		
	}
	
	public Object get(int indice) {
		
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("error");
		}
		
		Nodo actual = this.inicial;
		
		for (int i = 0; i < indice; i++) {
			actual=actual.siguiente;
		}
		
		return actual.elemento;
	}
	
	public boolean isEmpty() {
		
		return size()<=0;
		
	}
	
	public int size() {
		return numElementos;
	}
	
	public Object peek() {
		
		Nodo actual = inicial;
		
		if(!isEmpty()) {
			
			for (int i = 0; i < numElementos-1; i++) {
				
				actual=actual.siguiente;
				
			}
			
			return actual.elemento;
			
		}

		return null;
		
	}
	
	public Object pop() {
		
		if(numElementos==0) {
			return null;
		}
		
		Nodo anterior = inicial;
			
			for (int i = 0; i < numElementos-1; i++) {
				
				anterior=anterior.siguiente;
				
			}
			
			Object salida = anterior.elemento;
			anterior.siguiente=null;
			numElementos--;
			return salida;
		
	}
	
	public void push(E objeto) {
		
		Nodo nuevo = new Nodo(objeto);

		if(numElementos==0) {
			
			inicial=nuevo;
			numElementos++;
			
		}else {
			
			Nodo actual = inicial;
			
			for (int i = 0; i < numElementos-1; i++) {
				
				actual=actual.siguiente;
				
			}
			
			actual.siguiente=nuevo;
			numElementos++;
			
		}
		
	}
	
	public Object[] toArray() {
		
		Nodo actual = inicial;
		Object[] salida = new Object[numElementos];
		
		for (int i = 0; i < numElementos; i++) {
			
			salida[i]=actual.elemento;
			actual=actual.siguiente;
			
		}
		
		return salida;
		
	}
	
}