package logica;

public class Usuario {
	private String nombre;
	private String mail;
	private String contrasenia;
	private int tipo;
	
	Usuario(String nombre, String mail, String contrasenia, int tipo){
		this.nombre = nombre;
		this.mail = mail;
		this.contrasenia = contrasenia;
		this.tipo = tipo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public String getContrasenia() {
		return this.contrasenia;
	}
	
	public int getTipo() {
		return this.tipo;
	}

}
