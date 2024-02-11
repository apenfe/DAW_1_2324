package Relacion_1_n;

public class Curso{
	
	private String codigo;
	private String nombre;
	
	private Estudiante[] estudintes =new Estudiante[0];
	
	public Curso(String codigo, String nombre) {
		
		this.codigo=codigo;
		this.nombre=nombre;
		
	}
	
	public void setEstudiantes(Estudiante[] lineas) {
		
		estudintes =lineas;
		
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
	
	public void listar() {
		
		System.out.println("CURSO: "+nombre);
		
		for (int i = 0; i < estudintes.length; i++) {
			
			System.out.println("Estudiante: "+estudintes[i].getNombre());
			
		}
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}