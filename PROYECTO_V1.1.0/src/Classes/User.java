package Classes;

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

/**
 * Clase User utilizada para crear un usuario y posteriormente poder usarlo en una sesión.
 * 
 * @author Adrián Peñalver Fernández
 * @version 1.0.0
 * 
 */

public class User{
	
	/* DECLARACIÓN DE LOS PARAMETROS */
	
	public int id;
	public String username;
	public String name;
	public String nif;
	public String email;
	public String addres;
	public String birthdate;
	public String role;
	
	/* CONSTRUCTOR VACIO */
	
	/**
	 * Constructor de la clase vacío.
	 */
	
	public User() { 
		
	}
	
	/* CONSTRUCTOR QUE RECIBE TODOS LOS DATOS, EN EL ORDEN QUE SE ESCRIBEN EN EL ARCHIVO */
	
	/**
	 * Constructor de la clase que recibe todos los datos del usuario.
	 * 
	 * @param username Nombre del usuario
	 * @param name Nombre real de usuario y apellidos
	 * @param nif DNI del usuario
	 * @param email Correo electrónico del usuario
	 * @param addres Dirección postal del usuario
	 * @param birthdate Fecha de nacimiento del usuario
	 * @param role Rol del usuario
	 * 
	 */
	
	public User(String id, String username, String name, String nif, String email, String addres, String birthdate, String role) {
		
		this.id=Integer.parseInt(id);
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
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return this.addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public int getId() {
		return this.id;
	}
	
	/* METODO PUBLICO QUE DEVUELVE TODA LA INFORMACIÓN RELATIVA A UN USUARIO */
	
	/**
	 * Método info que muestra la información completa del usuario.
	 */

	public void info() {
		
		System.out.println("\n\t- ID usuario: [" + this.id + "]");
		System.out.println("\t- Nombre de usuario: [" + this.username + "]");
		System.out.println("\t- Nombre completo: [" + this.name + "]");
		System.out.println("\t- NIF: [" + this.nif + "]");
		System.out.println("\t- Dirección de correo electónico: [" + this.email + "]");
		System.out.println("\t- Dirección postal: [" + this.addres + "]");
		System.out.println("\t- Fecha de nacimiento: [" + Utils.formatDateEU(birthdate) + "] ---> " + Utils.getAge(birthdate)+ " años.");
		System.out.println("\t- Tipo de rol / permisos: [" + this.role + "]");
	
	}

}