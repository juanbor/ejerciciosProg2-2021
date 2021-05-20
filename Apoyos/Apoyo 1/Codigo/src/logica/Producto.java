package logica;

public class Producto {
	private String nombre;
	private Comerciante comerciante;
	
	public Producto(String nombre, Comerciante comerciante) {
		super();
		this.nombre = nombre;
		this.comerciante = comerciante;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Comerciante getComerciante() {
		return this.comerciante;
	}

	public void setComerciante(Comerciante comerciante) {
		this.comerciante = comerciante;
	}
	
	
}
