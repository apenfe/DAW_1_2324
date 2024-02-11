package Simulacro03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulo{
	
	public static final String RUTA = ".\\src\\Simulacro03\\";
	public static final String ALUMNOS = "alumnos.txt";
	public static final String MODULOS = "modulos.txt";
	public static final String RELACIONES = "modulo_alumno.txt";
	
	private int pk;
	private String nombre;
	private int curso;
	private int horas;
	private String profesor;
	
	private Alumno[] alumnos = new Alumno[0];
	
	public Modulo() {
		
	}
	
	public Modulo(int pk, String nombre, int curso, int horas, String profesor) {
		
		this.pk=pk;
		this.nombre=nombre;
		this.curso=curso;
		this.horas=horas;
		this.profesor=profesor;
		//this.alumnos=leerCodAlumnos();		
	}
	
	public void createAlums() {
		this.alumnos=leerCodAlumnos();
		
	}
	

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
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
	
	public Alumno[] leerCodAlumnos() {
		
		ArrayList<Integer> codAlumnos = new ArrayList<Integer>();
		
		try {
			
			File archivo = new File(RUTA+RELACIONES);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				
				if(pk==Integer.parseInt(linea[0])) {
					codAlumnos.add(Integer.parseInt(linea[1]));
				}
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			
			File archivo = new File(RUTA+ALUMNOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				
				int codAlu = Integer.parseInt(linea[0]);
				
				for(int i=0; i<codAlumnos.size();i++) {
					
					if(codAlu==codAlumnos.get(i)) {
						
						alumnos.add(new Alumno(Integer.parseInt(linea[0]),linea[1],linea[2],linea[3],linea[4],linea[5],linea[6]));
					}
					
				}
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		Alumno[] salida = new Alumno[alumnos.size()];
		
		for(int i=0; i<alumnos.size();i++) {
			salida[i]=alumnos.get(i);
		}
		
		return salida;
		
	}
	
	
	
}