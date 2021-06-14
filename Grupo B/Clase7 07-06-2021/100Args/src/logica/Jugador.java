package logica;

import java.util.ArrayList;

public class Jugador extends Usuario{
	private int puntajeActual;
	private ArrayList<Pregunta> preguntasQueRespondio;
	
	public Jugador(String nombre, int ci, int puntajeActual, ArrayList<Pregunta> preguntasQueRespondio) {
		super(nombre, ci);
		this.puntajeActual = puntajeActual;
		this.preguntasQueRespondio = preguntasQueRespondio;
	}

	public int getPuntajeActual() {
		return puntajeActual;
	}

	public void setPuntajeActual(int puntajeActual) {
		this.puntajeActual = puntajeActual;
	}

	public ArrayList<Pregunta> getPreguntasQueRespondio() {
		return preguntasQueRespondio;
	}

	public void setPreguntasQueRespondio(ArrayList<Pregunta> preguntasQueRespondio) {
		this.preguntasQueRespondio = preguntasQueRespondio;
	}
	
	
}
