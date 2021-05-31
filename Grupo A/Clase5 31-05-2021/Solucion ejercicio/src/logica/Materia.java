package logica;

public class Materia {
	private String nombre;
	private Docente Docente;
	
	public Materia(String nombre, logica.Docente docente) {
		super();
		this.nombre = nombre;
		Docente = docente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Docente getDocente() {
		return Docente;
	}
	public void setDocente(Docente docente) {
		Docente = docente;
	}
	
}
