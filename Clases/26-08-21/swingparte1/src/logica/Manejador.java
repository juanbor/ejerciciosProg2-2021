package logica;

public class Manejador {
	private String usuario;
	private String password;
	
	public Manejador() {
		this.usuario = "juan";
		this.password = "123";
	}
	
	public boolean login(String user, String pass) {
		return this.usuario.equals(user) && this.password.equals(pass);
	}
}

//https://codeshare.io/8pJpMj
