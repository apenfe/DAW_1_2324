package Simulacro03repaso2;

import java.util.ArrayList;

public class Modulo{
	
	private String key;
	private String nombre;
	private String curso;
	private String horas;
	private String profesor;
	
	private Alumno[] alumnos = new Alumno[0];
	
	public Modulo() {
		
	}
	
	public Modulo(String[] linea) {
		
		this.key=linea[0];
		this.nombre=linea[1];
		this.curso=linea[2];
		this.horas=linea[3];
		this.profesor=linea[4];
		
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	public void asignarAlumnos(String[] llaves, Alumno[] alum) {
		
		ArrayList<String> llavesForaneas = new ArrayList<String>();
		
		for(int i=0; i<llaves.length; i++ ) {
			
			String[] linea = llaves[i].split(",");
				
				if(linea[0].equals(key)) {
					llavesForaneas.add(linea[1]);
				}
			
		}
		
		this.alumnos= new Alumno[llavesForaneas.size()];
		ArrayList<Alumno> nuevosAlumnos = new ArrayList<Alumno>();
		
		for(int i=0; i<alum.length; i++ ) {
				
			for(int j=0; j<llavesForaneas.size(); j++ ) {
				
				if(alum[i].getKey().equals(llavesForaneas.get(j))) {
					nuevosAlumnos.add(alum[i]);
				}
				
			}
			
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			
			alumnos[i]=nuevosAlumnos.get(i);
			
		}
		
	}
	
	public void listar() {
		
		System.out.println("MODULO: "+nombre);
		System.out.println("\tALUMNOS ASIGNADOS: ");
		
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println((i+1)+" ---> "+alumnos[i].getNombre()+" "+alumnos[i].getApellidos());
			
		}
		
		System.out.println();

	}
	
}