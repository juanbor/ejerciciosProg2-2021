package logica;

import java.time.LocalDate;

public class Docente extends Usuario{
	private LocalDate fechaIngreso;
	private Materia Materia;
	
	public Docente(String nombre, int ci, LocalDate fechaIngreso, logica.Materia materia) {
		super(nombre, ci);
		this.fechaIngreso = fechaIngreso;
		Materia = materia;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Materia getMateria() {
		return Materia;
	}
	public void setMateria(Materia materia) {
		Materia = materia;
	}
	
}
