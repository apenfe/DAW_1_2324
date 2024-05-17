package ejemplo17;

public class Usuario{
	
	public String id;
	public String username;
	public String password;
	public String nombre;
	
	public Usuario(String username, String password, String nombre) {
		super();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}