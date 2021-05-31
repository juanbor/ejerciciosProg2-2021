package logica;

public class Usuario {
	private String nombre;
	private int ci;
	
	public Usuario(String nombre, int ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
}	
