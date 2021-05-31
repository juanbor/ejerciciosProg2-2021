package logica;

public class Estudiante extends Usuario{
	private String Dirección;
	private Curso curso;

	public Estudiante(String nombre, int ci, String dirección, Curso curso) {
		super(nombre, ci);
		Dirección = dirección;
		this.curso = curso;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
}
