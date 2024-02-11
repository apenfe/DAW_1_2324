package Biblioteca;

import java.util.ArrayList;

public class Usuario{
	
	private String id;
	private String nombre;
	private ArrayList<Libro> librosPrestados=new ArrayList<Libro>();
	
	public Usuario() {
		
	}
	
	public Usuario(String id, String nombre) {
		
		this.id=id;
		this.nombre=nombre;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addLibro(Libro libro) {
		this.librosPrestados.add(libro);
	}
	
	public void removeLibro(Libro libro) {
		
		for (int i = 0; i < librosPrestados.size(); i++) {
			
			if(librosPrestados.get(i)==libro) {
				librosPrestados.remove(i);
			}else {
				System.out.println("El usuario no tiene ese libro.");
			}
			
		}
	}
	
	public void verLibros() {
		
		for (int i = 0; i < librosPrestados.size(); i++) {
			System.out.println("LIBRO: "+librosPrestados.get(i).getTitulo());
		}
		
	}
	
	
}