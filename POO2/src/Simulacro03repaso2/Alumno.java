package Simulacro03repaso2;

import java.util.ArrayList;

public class Alumno{
	
	private String key;
	private String nombre;
	private String apellidos;
	private String dni;
	private String correo;
	private String direccion;
	private String telefono;
	
	private Modulo[] modulos = new Modulo[0];
	
	public Alumno() {
		
	}
	
	public Alumno(String[] linea) {
		
		this.key=linea[0];
		this.nombre=linea[1];
		this.apellidos=linea[2];
		this.dni=linea[3];
		this.correo=linea[4];
		this.direccion=linea[5];
		this.telefono=linea[6];
		
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Modulo[] getModulos() {
		return modulos;
	}

	public void setModulos(Modulo[] modulos) {
		this.modulos = modulos;
	}
	
	public void asignarModulos(String[] llaves, Modulo[] moduls) {
		
		ArrayList<String> llavesForaneas = new ArrayList<String>();
		
		for(int i=0; i<llaves.length; i++ ) {
			
			String[] linea = llaves[i].split(",");
				
				if(linea[1].equals(key)) {
					llavesForaneas.add(linea[0]);
				}
			
		}
		
		this.modulos= new Modulo[llavesForaneas.size()];
		ArrayList<Modulo> nuevosModulos = new ArrayList<Modulo>();
		
		for(int i=0; i<moduls.length; i++ ) {
				
			for(int j=0; j<llavesForaneas.size(); j++ ) {
				
				if(moduls[i].getKey().equals(llavesForaneas.get(j))) {
					nuevosModulos.add(moduls[i]);
				}
				
			}
			
		}
		
		for (int i = 0; i < modulos.length; i++) {
			
			modulos[i]=nuevosModulos.get(i);
			
		}
		
		
		
	}
	
	public void listar() {
		
		System.out.println("ALUMNO: "+nombre+" "+apellidos);
		System.out.println("\tMODULOS MATRICULADOS: ");
		
		for (int i = 0; i < modulos.length; i++) {
			
			System.out.println((i+1)+" ---> "+modulos[i].getNombre());
			
		}
		
		System.out.println();
		
	}
	
	
}