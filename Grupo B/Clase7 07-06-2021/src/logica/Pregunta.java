package logica;

import java.util.ArrayList;

public class Pregunta {
	private String enunciado;
	private ArrayList<Respuesta> respuesta;
	
	public Pregunta(String enunciado, ArrayList<Respuesta> respuesta) {
		super();
		this.enunciado = enunciado;
		this.respuesta = respuesta;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public ArrayList<Respuesta> getRespuesta() {
		return respuesta;
	}
	
	public void setRespuesta(ArrayList<Respuesta> respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
