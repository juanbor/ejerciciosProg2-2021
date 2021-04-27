package logica;

public class Terminal {
	private int id;
	private String nombre;
	
	Terminal(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
