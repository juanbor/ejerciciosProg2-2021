package logica;

import java.time.LocalDate;

public class Administrador extends Usuario{
	private LocalDate fechaIngreso;

	public Administrador(String nombre, int ci, LocalDate fechaIngreso) {
		super(nombre, ci);
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
