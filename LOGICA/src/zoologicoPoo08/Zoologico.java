package zoologicoPoo08;

import java.util.ArrayList;

/*
 * 
 * Para controlar todas las clases anteriores se creará una clase ZOOLÓGICO que contendrá lo
 * siguiente:
 * 
 * ◦ El nombre del zoológico.
 * ◦ Un array con las distintas zonas del zoológico.
 * ◦ Un array con las distintas instalaciones del zoológico.
 * ◦ Un array con los distintos animales del zoológico.
 * ◦ Un array con los distintos trabajadores del zoológico.
 * ◦ Un array con las distintas asignaciones de zonas del zoológico.
 * 
 * Para el diseño de esta aplicación se pide que no se creen arrays de datos en las clases
 * anteriores. Los únicos arrays serán los pertenecientes a la clase ZOOLÓGICO.
 * 
 */

public class Zoologico{
	
	private String nombre;
	
	private ArrayList<Zonas> zonas;
	private ArrayList<Instalaciones> instalaciones;
	private ArrayList<Animales> animales;
	private ArrayList<Trabajadores> trabajadores;
	private ArrayList<Asignacion> asignaciones;
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre) {
		
		this.nombre = nombre;
		this.zonas = new ArrayList<Zonas>();
		this.instalaciones = new ArrayList<Instalaciones>();
		this.animales = new ArrayList<Animales>();
		this.trabajadores = new ArrayList<Trabajadores>();
		this.asignaciones = new ArrayList<Asignacion>();
		
	}
	
	public ArrayList<Zonas> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zonas> zonas) {
		this.zonas = zonas;
	}

	public ArrayList<Instalaciones> getInstalaciones() {
		return instalaciones;
	}

	public void setInstalaciones(ArrayList<Instalaciones> instalaciones) {
		this.instalaciones = instalaciones;
	}

	public ArrayList<Animales> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animales> animales) {
		this.animales = animales;
	}

	public ArrayList<Trabajadores> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public ArrayList<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean setZona(String nombre, double superficie) {
		
		if(nombre.length()<3) {
			System.out.println("El nombre debe ser igual o superior a tres letras.");
			return false;
		}
		
		String codigo = setCodigoZona(nombre);
		
		Zonas actual = new Zonas(codigo,nombre,superficie);
		zonas.add(actual);
		return true;
	}
	
	public boolean setInstalacion(String descripcion, int anio, Zonas zona) {
		
		if(zonas.contains(zona)==false) {
			System.out.println("Esa zona no existe en el ZOO.");
			return false;
		}
		
		int codigo = setCodigoInstalacion();
		
		Instalaciones actual = new Instalaciones(codigo,descripcion,anio,zona);
		instalaciones.add(actual);
		return true;
		
	}

	public boolean setAnimal(String nombre, String especie, int anio, Instalaciones instalacion) {
		
		if(instalaciones.contains(instalacion)==false) {
			System.out.println("Esa instalacione no existe en el ZOO.");
			return false;
		}
		
		String codigo = setCodigoAnimal(nombre);
		
		Animales actual = new Animales(nombre,especie,anio,codigo,instalacion);
		animales.add(actual);
		return true;
	
	}

	public boolean setTrabajador(String nombre, String apellido, String especialidad, String dni) {
		
		Trabajadores actual = new Trabajadores(nombre,apellido, especialidad, dni);
		trabajadores.add(actual);
		return true;
	
	}

	public boolean setAsignacion(String horario, Trabajadores trabajador, Zonas zona) {	
		
		Asignacion actual = new Asignacion(horario,trabajador,zona);
		asignaciones.add(actual);
		return true;
	
	}
	
	private String setCodigoZona(String nombre) {
		
		String codigo = "";
		
		codigo+="0"+zonas.size()+1;
		
		nombre=nombre.toUpperCase();
		
		for(int i=0; i<3; i++) {
			
			codigo+=nombre.charAt(i);
			
		}
		
		return codigo;
		
	}
	
	private int setCodigoInstalacion() {
		
		int codigo = instalaciones.size()+1;
		
		return codigo;
		
	}
	
	private String setCodigoAnimal(String nombre) {
		
		String codigo = "";
			
		nombre=nombre.toUpperCase();
		codigo+=nombre.charAt(0)+nombre.charAt(1);
		codigo+="0"+animales.size()+1;
					
		return codigo;
		
	}

	public int getTamaioZonas() {
		
		return zonas.size();
		
	}
	
	public int getTamanioInstalaciones() {
		
		return instalaciones.size();
		
	}
	
	public int getTamanioAnimales() {
		
		return instalaciones.size();
		
	}

	public int getTamanioTrabajadores() {
	
	return instalaciones.size();
	
	}

	
}