package logica;

public class Usuario {
	private String nombre;
	private String username;
	private String password;
	
	public Usuario(String nombre, String username, String password) {
		super();
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}
	
	public String getUsername(boolean addPassword) {
		if(addPassword)
			return this.username + " " + this.password;
		else
			return this.username + " ****";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean logear(String username, String password){
		//aplico un algorito al password
		//autentico con la bd
		//hago mas cosas
		
		return true;
	}
	
	@Override
	public String toString() {
		String ret = this.nombre + " " + this.username + " " + this.password;
		
		return ret;
	}
	
}
