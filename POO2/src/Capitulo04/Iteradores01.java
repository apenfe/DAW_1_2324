package Capitulo04;

import java.util.ArrayList;
import java.util.Iterator;

import Static.Entrada;

public class Iteradores01{
	
	public static void main(String[] args) {
		
		ArrayList<String> textos = new ArrayList<String>();
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		/* varias formas de recorrer las listas dinamicas
		 * 
		 * 1. mediante un for comun hasta el tamaño maximo de la coleccion y puedo interrumpir cuando quiera
		 * 2. mediante un for each (cuando se que los quiero recorrer absolutamente todos) no se puede interrumpir cuando quiera.
		 * 		no permite modificar elementos, añadir ni eliminar
		 * 3. mediante un while para hacer busquedas, con la busqueda booleana y un contador de emergencia
		 * 4. tipo iterator
		 */
		
		for(int i=0; i<4; i++) {
			textos.add("palabra"+(i+1));
		}
		
		for(int i=0; i<3; i++) {
			
			String nombre = Entrada.pedirTexto("Cual es el nombre? ");
			int edad = Entrada.pedirEntero("Cual es su edad? ");
			
			Persona actual = new Persona(nombre,edad);
			
			personas.add(actual);
		}
		
		
	
		
		
	}
}

class Persona{
	
	public String nombre;
	public int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String info() {
		
		return nombre+" tiene "+edad+" años.";
		
	}
	
	
}