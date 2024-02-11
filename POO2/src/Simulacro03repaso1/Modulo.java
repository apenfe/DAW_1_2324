package Simulacro03repaso1;

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
	
	public void asignarAlumnos(String[] llaves, Alumno[] alumnos) {
		
		ArrayList<String> clavesAlum = new ArrayList<String>();
		ArrayList<Alumno> alumns = new ArrayList<Alumno>();
		
		for (int i = 0; i < llaves.length; i++) {
			
			String[] actual = llaves[i].split(",");
			
			if(actual[0].equals(key)) {
				
				clavesAlum.add(actual[1]);
				
			}
			
		}
		
		for (int i = 0; i < clavesAlum.size(); i++) {
			
			String alumnoactual = clavesAlum.get(i);
			
			for (int j = 0; j < alumnos.length; j++) {
				
				if(alumnoactual.equals(alumnos[j].getKey())) {
					
					alumns.add(alumnos[j]);
					
				}
				
			}
			
		}
		
		Alumno[] salida = new Alumno[alumns.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=alumns.get(i);
		}
		
		setAlumnos(salida);
		
	}
	
	public void listar() {
		
		System.out.println("\nModulo: "+nombre);
		
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("\tAlumno nº "+(i+1)+": "+alumnos[i].getNombre()+" "+alumnos[i].getApellidos());
			
		}
		
		System.out.println();
		
	}
	
}