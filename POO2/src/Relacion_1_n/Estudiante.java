package Relacion_1_n;

public class Estudiante{
	
	private String codigo;
	private String nombre;
	private String curso;
	
	public Estudiante(String curso, String codigo, String nombre) {
		
		this.curso=curso;
		this.codigo=codigo;
		this.nombre=nombre;
		
	}
	
	

	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + "]";
	}
	
	
	
	
	
}