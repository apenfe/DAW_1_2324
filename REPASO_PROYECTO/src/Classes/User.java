package Classes;

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

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", nif=" + nif + ", email=" + email + ", addres="
				+ addres + ", birthdate=" + birthdate + ", role=" + role + "]";
	}
	
	/* METODO PUBLICO QUE DEVUELVE TODA LA INFORMACIÓN RELATIVA A UN USUARIO */
	

}