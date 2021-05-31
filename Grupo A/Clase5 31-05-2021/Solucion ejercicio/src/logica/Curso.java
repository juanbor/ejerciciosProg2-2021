package logica;

import java.util.ArrayList;

public class Curso {
	private String nombre;
	
	ArrayList<Materia> Materia;

	public Curso(String nombre, ArrayList<logica.Materia> materia) {
		super();
		this.nombre = nombre;
		Materia = materia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Materia> getMateria() {
		return Materia;
	}

	public void setMateria(ArrayList<Materia> materia) {
		Materia = materia;
	}
	
}
