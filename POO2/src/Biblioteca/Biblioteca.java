package Biblioteca;

import java.util.ArrayList;

public class Biblioteca{
	
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Biblioteca() {	
		
	}
	
	public void addAutor(Autor autor) {
		autores.add(autor);
	}
	
	public void addLibro(Libro libro) {
		libros.add(libro);
	}
	
	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public Autor[] getAutores() {
		
		Autor[] salida = new Autor[autores.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=autores.get(i);
		}
		
		return salida;
		
	}
	
	public Libro[] getLibros() {
		
		Libro[] salida = new Libro[libros.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=libros.get(i);
		}
		
		return salida;
		
	}

	public Usuario[] getUsuarios() {
	
		Usuario[] salida = new Usuario[usuarios.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=usuarios.get(i);
		}
		
		return salida;
	
	}
	
	public boolean buscarLibroTitulo(String nombre) {
		
		for (int i = 0; i < libros.size(); i++) {
			
			if(libros.get(i).getTitulo().equals(nombre)) {
				
				System.out.println(libros.get(i).toString());
				
				return true;
				
			}
			
		}
		
		System.out.println("NO ENCONTRADO");
		return false;
	
	}
	
	public void librosPrestadosUsuario(Usuario usuario) {
		
		for (int i = 0; i < usuarios.size(); i++) {
			
			if(usuarios.get(i).getId().equals(usuario.getId())) {
				
				System.out.println("USUARIO ENCONTRADO - LIBROS: ");
				usuarios.get(i).verLibros();
				return;
				
			}
			
		}
		
		System.out.println("NO ENCONTARDO EL USUARIO");
	
	}
	
	public void autorLibro(String titulo) {
		
		for (int i = 0; i < libros.size(); i++) {
			
			if(libros.get(i).getTitulo().equals(titulo)) {
				
				for (int j = 0; j < autores.size(); j++) {
					
					if(autores.get(j).getId().equals(libros.get(i).getIdautor())){
						System.out.println("Autor del libro "+titulo+". es: "+autores.get(j).getNombre());
					}
					
				}
				
			}
			
		}
		
		System.out.println("NO ENCONTARDO EL USUARIO");
	
	}
	
}