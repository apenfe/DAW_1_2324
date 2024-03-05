package repasos;

import java.util.ArrayList;

public class ejercicio5repaso1{
	
	/*
	 * Escribe una nueva versión del programa Ejemplo: Unión e intersección de dos listas que aparece 
	 * en el manual de Java, en el  Capítulo 9. Estructuras dinámicas lineales para que haga exactamente 
	 * lo mismo utilizando los métodos disponibles en la clase ArrayList de la API Collection de Java:
	 * 
	 * addAll()
	 * removeAll()
	 * retainAll()
	 * 
	 * Se deben escribir nuevas versiones de los correspondientes métodos especializados en obtener la unión 
	 * y la intersección sin utilizar bucles.
	 */
	
	public static ArrayList<Integer> unionListas(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.addAll(list1);
		all.addAll(list2);
		
		all.removeAll(intersecListas(list1,list2));
		all.addAll(intersecListas(list1,list2));
		return all;
	}
	
	public static ArrayList<Integer> intersecListas(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.addAll(list1);
		all.retainAll(list2);

		return all;
	}
	
	public static void printLista(ArrayList<Integer> lista) {
		
		System.out.print("{ ");
		for (Integer elem : lista) {
			System.out.print(elem);
			System.out.print(" ");
		}
		System.out.println("}");
	}

	
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		System.out.print("Primera lista:\t\t");
		printLista(lista1);

		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		System.out.print("Segunda lista:\t\t");
		printLista(lista2);

		ArrayList<Integer> listaUnion = unionListas(lista1, lista2);
		System.out.print("Lista unión:\t\t");
		printLista(listaUnion);

		ArrayList<Integer> listaIntersec = intersecListas(lista1, lista2);
		System.out.print("Lista intersección:\t");
		printLista(listaIntersec);
	}

	
}