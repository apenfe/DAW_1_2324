package Simulacro03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno{
	
	public static final String RUTA = ".\\src\\Simulacro03\\";
	public static final String ALUMNOS = "alumnos.txt";
	public static final String MODULOS = "modulos.txt";
	public static final String RELACIONES = "modulo_alumno.txt";
	
	private int pk;
	private String nombre;
	private String apellidos;
	private String dni;
	private String correo;
	private String direccion;
	private String telefono;
	
	private Modulo[] modulos = new Modulo[0];
	
	public Alumno() {
		
	}
	
	public Alumno(int pk, String nombre, String apellidos, String dni, String correo, String direccion, String telefono) {
		
		this.pk=pk;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.correo=correo;
		this.direccion=direccion;
		this.telefono=telefono;
		//this.modulos=leerCodModulos();
		
	}
	
	public void createModuls() {
		this.modulos=leerCodModulos();
		
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
	
	public Modulo[] leerCodModulos() {
		
		ArrayList<Integer> codModulos = new ArrayList<Integer>();
		
		try {
			
			File archivo = new File(RUTA+RELACIONES);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				
				if(pk==Integer.parseInt(linea[1])) {
					codModulos.add(Integer.parseInt(linea[0]));
				}
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		ArrayList<Modulo> modulos = new ArrayList<Modulo>();
		
		try {
			
			File archivo = new File(RUTA+MODULOS);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("&");
				
				int codMod = Integer.parseInt(linea[0]);
				
				for(int i=0; i<codModulos.size();i++) {
					
					if(codMod==codModulos.get(i)) {
						
						modulos.add(new Modulo(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),Integer.parseInt(linea[3]),linea[4]));
					}
					
				}
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		Modulo[] salida = new Modulo[modulos.size()];
		
		for(int i=0; i<modulos.size();i++) {
			salida[i]=modulos.get(i);
		}
		
		return salida;
		
	}
	
	
}