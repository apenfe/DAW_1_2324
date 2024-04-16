package ejercicio_3;

public class Estudiante extends Persona implements java.lang.Comparable<Estudiante>{
	
	public int evaluacion;
	
	public Estudiante(int evaluacion, String nombre, String apellidos) {
		
		super.setApellidos(apellidos);
		super.setNombre(nombre);
		this.evaluacion = evaluacion;
		
	}

	public int getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}

	@Override
	public String toString() {
		
		return super.toString() + "---> Estudiante [evaluacion=" + evaluacion + "]";
		
	}

	@Override
	public int compareTo(Estudiante o) {
		
		return Float.compare(this.evaluacion,o.evaluacion);
		
	}
	
}