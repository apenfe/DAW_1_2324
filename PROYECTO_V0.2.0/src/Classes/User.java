package classes;

/* 
 * User.java
 * 
 * Clase pública que contiene las propiedades que almacenan la información de un usuario:
 * 
 * - username
 * - name
 * - nif
 * - email
 * - address
 * - birthdate
 * - role
 * 
 * Se usará para crear un objeto de este tipo de clase cuando se inicie sesión y se almacene
 * en él los datos del usuario que ha iniciado sesión.
 * 
 * APF - 21-12-2023
 * VERSION: 0.1.0
 * 
 */

public class User{
	
	/* DECLARACIÓN DE LOS PARAMETROS */
	
	public String username;
	public String name;
	public String nif;
	public String email;
	public String addres;
	public String birthdate;
	public String role; // EN LA VERSION 0.1.0 SERÁ SIEMPRE "user"
	
	/* CONSTRUCTOR VACIO */
	
	public User() { 
		
	}
	
	/* CONSTRUCTOR QUE RECIBE TODOS LOS DATOS, EN EL ORDEN QUE SE ESCRIBEN EN EL ARCHIVO */
	
	public User(String username, String name, String nif, String email, String addres, String birthdate, String role) {
		
		this.username=username;
		this.name=name;
		this.nif=nif;
		this.email=email;
		this.addres=addres;
		this.birthdate=birthdate;
		this.role=role;
	}
	
	/* METODOS SET Y GET DE LOS PARAMETROS */
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	/* METODO PUBLICO QUE DEVUELVE TODA LA INFORMACIÓN RELATIVA A UN USUARIO */

	public void info() {
		
		System.out.println("\n\t- Nombre de usuario: [" + username+"]");
		System.out.println("\t- Nombre completo: [" + name+"]");
		System.out.println("\t- NIF: [" + nif+"]");
		System.out.println("\t- Dirección de correo electónico: [" + email+"]");
		System.out.println("\t- Dirección postal: [" + addres+"]");
		System.out.println("\t- Fecha de nacimiento: [" + birthdate+"]");
		System.out.println("\t- Tipo de rol / permisos: [" + role+"]");
	
	}

}