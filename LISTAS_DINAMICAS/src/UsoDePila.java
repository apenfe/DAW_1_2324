import java.util.Arrays;

import ejercicios.Ejercicio6;
import ejercicios.Ejercicio6_nodo;

public class UsoDePila {

	public static void main(String[] args) {

		Ejercicio6<String> pila = new Ejercicio6<String>();
		pila.push("1. Camelia");
		pila.push("2. Azalea");
		pila.push("3. Jazmín");
		pila.push("4. Datura");

//Convierte el Stack en array.
		Object[] plantas = pila.toArray();

//Muestra la pila de nombres de plantas.
		System.out.println("Cima de la pila: " + pila.peek());
		while (pila.size() > 0) {
			String nombrePlanta = pila.pop().toString();
			System.out.println(nombrePlanta);
		}
//Muestra el array de nombres de plantas. La pila ya está vacía.
		System.out.println("Array:\n" + Arrays.toString(plantas));
		System.out.println();
		Ejercicio6_nodo<String> pile = new Ejercicio6_nodo<String>();
		pile.push("1. Camelia");
		pile.push("2. Azalea");
		pile.push("3. Jazmín");
		pile.push("4. Datura");

//Convierte el Stack en array.
		 plantas = pile.toArray();

//Muestra la pila de nombres de plantas.
		System.out.println("Cima de la pila: " + pile.peek());
		while (pile.size() > 0) {
			String nombrePlanta = pile.pop().toString();
			System.out.println(nombrePlanta);
		}
//Muestra el array de nombres de plantas. La pila ya está vacía.
		System.out.println("Array:\n" + Arrays.toString(plantas));

	}

}
