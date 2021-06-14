package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Manejador {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Pregunta> preguntas;
	
	//Variables de control
	private Usuario jugadorActual;
	private int indicePreguntaActual;
	
	public Manejador() {
		this.usuarios = new ArrayList<Usuario>();
		this.preguntas = new ArrayList<Pregunta>();
	}
	
	public void crearPregunta(String enunciado, ArrayList<Respuesta> respuestas) {
		Pregunta preg = new Pregunta(enunciado);
		for(int i = 0; i < respuestas.size(); i++) {
			preg.addRespuesta(respuestas.get(i));
		}
		
		this.preguntas.add(preg);
	}
	
	public void crearJugador(String nombre, int ci, int puntaje) {
		Usuario jugador = new Jugador(nombre, ci, puntaje);
		this.usuarios.add(jugador);
	}
	
	public void crearAdmnistrador(String nombre, int ci, LocalDate fechaIngreso) {
		Usuario admin = new Administrador(nombre, ci, fechaIngreso);
		this.usuarios.add(admin);
	}
	
	public void comenzarJuego(int ci) {
		// Settear el jugadorActual dada la ci
		for(int i = 0; i<this.usuarios.size(); i++) {
			if(this.usuarios.get(i).getCi() == ci) {
				this.jugadorActual = this.usuarios.get(i);
			}
		}
		
		// Imprimir la primera pregunta
		this.indicePreguntaActual = 0;
		if(this.preguntas.size() > this.indicePreguntaActual) {
			
			imprimirStatusJuego();
			
		}
	}
	
	public void imprimirStatusJuego() {
		System.out.println("Juega " + this.jugadorActual.getNombre());
		System.out.println("Contesta la pregunta: " +
				this.preguntas.get(this.indicePreguntaActual).getEnunciado() + " con " +
				this.preguntas.get(this.indicePreguntaActual).getRespuestas().size() + " respuestas!");
	}
	
	public void contestarPregunta(int indiceRespuesta) {
		// respuestas -> [4, 2, 3, 5, 7] -> size() = 5, maxIndice = 4 / respuestas[4] = 7 y respuestas[0] = 4
		// Busco la respuesta por el indiceRespuesta
			// Si esta... Suma puntos -> Respuesta correcta!
		
			// Sino esta... No suma puntos -> Respuesta incorrecta!
		
		ArrayList<Respuesta> tempRespuestas = this.preguntas.get(this.indicePreguntaActual).getRespuestas();
		
		if(indiceRespuesta <= tempRespuestas.size() - 1) {
			Respuesta tempRespuesta = tempRespuestas.get(indiceRespuesta);
			
			try {
				Jugador jugador = (Jugador)this.jugadorActual;
				int puntajeActual = jugador.getPuntaje();
				puntajeActual = puntajeActual + tempRespuesta.getCantEncResp();
				jugador.setPuntaje(puntajeActual);
				
				System.out.println("Respuesta correcta! sumaste " + tempRespuesta.getCantEncResp() + " puntos!");
				
				//siguientePregunta();
			} catch (ClassCastException e) {
				System.out.println("No se puede castear un admin a un jugador, pillolino...");
			}
			
			
		} else {
			System.out.println("Respuesta incorrecta!");
		}
		
	}
	
	public void siguientePregunta() {
		this.indicePreguntaActual++;
		
	}
	
	
}
