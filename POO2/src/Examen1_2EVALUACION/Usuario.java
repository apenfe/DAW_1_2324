package Examen1_2EVALUACION;

/*
 * Se pide un programa que pida secuencialmente los datos de una cantidad determinada de usuarios.
 *  Dicha cantidad será un atributo constante de la clase Supuesto 4_1.
 *  
 *  Una vez se hayan recogido los datos de todos los usuarios, deberá mostrar un listado ordenado 
 *  alfabéticamente por apellido para seleccionar un usuario y mostrar sus datos.
 *  
 *  El programa debe cumplir con las siguientes consideraciones:
 *  
 *  pedirUsuarios(): Método que pide los datos inviduales de cada usuario y los guarda en objetos dentro de 
 *  un array de la longitud que tiene el atributo constante de la clase principal. Finalmente, debe devolver 
 *  el array Usuario ya ordenado alfabéticamente por apellido, por lo que debe llamar al método 
 *  "ordenarUsuarios()" antes de finalizar el método.
 *  
 *  ordenarUsuarios(): Método que recibe el array de usuarios y lo ordena alfabéticamente por apellidos. 
 *  Finalmente, debe devolver el array ya ordenado.
 *  
 *  En el programa principal, después de obtener el array de Usuario y llamar a la ordenación, se debe 
 *  mostrar un menú listando todos los usuarios de acuerdo al ejemplo y pedir un número de opción para llamar 
 *  a un método que muestra únicamente al usuario seleccionado. No hace falta que muestre el menú con los usuarios 
 *  en bucle, con mostrarlo una única vez es suficiente.
 *  mostrarUsuario(): Método que recibe el array de usuario y la opción seleccionada por el usuario, para mostrar 
 *  la información del usuario seleccionado de acuerdo al ejemplo anterior.
 *  
 *   IMPORTANTE: Se debe controlar que la 
 *  opción corresponda con un elemento existente en el array.
 *  
 *  Para aclarar dudas, los métodos "pedirUsuarios", "ordenarUsuarios" y "mostrarUsuario" se deben crear en la clase 
 *  Supuesto4_1, NUNCA en la clase Usuario.
 */

public class Usuario{
	
	private String nombre;
	private String apellidos;
	private String email;
	
	public Usuario(String nombre, String apellidos, String email) {
		
		setNombre(nombre);
		setApellidos(apellidos);
		setEmail(email);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if(nombre.length()<4) {
			
			this.nombre = "Not set";
			
		}else {
			
			this.nombre=nombre;
			
		}
		
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		
		if(apellidos.length()<4) {
			
			this.apellidos = "Not set";
			
		}else {
			
			this.apellidos=apellidos;
			
		}
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		String regex = ".+@.+";
		
		if(email.length()>=6 && email.matches(regex)) {
			
			this.email = email;
			
		}else {
			
			this.email="Not set";
			
		}
		
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}
	
	
	
	

	
}