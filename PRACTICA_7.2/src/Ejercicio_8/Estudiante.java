package Ejercicio_8;

public class Estudiante extends Humano implements java.lang.Comparable<Estudiante>{
	
	public Double[] listaNotas;
	
	public Estudiante(Double[] listaNotas, String nombre, String apellidos) {
		
		super.setApellidos(apellidos);
		super.setNombre(nombre);
		this.listaNotas=listaNotas;
		
	}
	
	private double media() {
		
		double total = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			total+=listaNotas[i];
			
		}
		
		return total/listaNotas.length;
		
	}

	@Override
	public int compareTo(Estudiante o) {
		
		return Double.compare(o.media(),media());
		
	}

	@Override
	public String toString() {
		
		return "Estudiante: "+super.toString()+" ---> Media = " + media() + "]";
		
	}	
	
	
	
}