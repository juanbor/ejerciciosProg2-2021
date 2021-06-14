package logica;

import java.util.ArrayList;

public class Pregunta {
	private String enunciado;
	private ArrayList<Respuesta> respuestas;
	
	public Pregunta(String enunciado) {
		super();
		this.enunciado = enunciado;
		this.respuestas = new ArrayList<Respuesta>();
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void addRespuesta(Respuesta r) {
		this.respuestas.add(r);
	}
	
}
