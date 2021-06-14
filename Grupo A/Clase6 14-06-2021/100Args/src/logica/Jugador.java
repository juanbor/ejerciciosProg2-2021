package logica;

import java.util.ArrayList;

public class Jugador extends Usuario{
	private int puntaje;
	private ArrayList<Pregunta> preguntas;
	
	public Jugador(String nombre, int ci, int puntaje) {
		super(nombre, ci);
		this.puntaje = puntaje;
		this.preguntas = new ArrayList<Pregunta>();
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void addPreguntas(Pregunta pregunta) {
		this.preguntas.add(pregunta);
	}
	
	
}
