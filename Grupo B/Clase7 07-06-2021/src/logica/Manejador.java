package logica;

import java.util.ArrayList;

public class Manejador {
	private ArrayList<Pregunta> preguntas;
	private ArrayList<Usuario> usuarios;
	
	//atributos de control
	private int indice = 0; //indice de la pregunta actual
	private Usuario jugadorActual;
	
	public Manejador() {
		this.preguntas = new ArrayList<Pregunta>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public void addPregunta(Pregunta pregunta) {
		this.preguntas.add(pregunta);
	}
	
	public void addAdministrador(Administrador admin) {
		this.usuarios.add(admin);
	}
	
	public void addJugador(Jugador jugador) {
		this.usuarios.add(jugador);
	}
	
	public Pregunta comenzarJuego(int ci) {
		//buscar al jugador por CI en el arraylist de usuarios
		// this.usuarios.size() = [0..CantElementos]
		// los indices de arraylist = [0..CantElementos-1]
		for(int i = 0; i < this.usuarios.size() ;i++) {
			if(this.usuarios.get(i).getCi() == ci) {
				this.jugadorActual = this.usuarios.get(i);
			}
		}
		
		
		//agarrar la primera pregunta y devolverla
		if(this.preguntas.size() > 0) {
			
			Pregunta preguntaActual = this.preguntas.get(0);
			
			System.out.println("Juega: " + this.jugadorActual.getNombre());
			System.out.println("Contesta la pregunta: " + 
					preguntaActual.getEnunciado() + " con " + 
					preguntaActual.getRespuesta().size() + " respuestas!");
			
			return preguntaActual; // this.preguntas[this.indice]
		}else {
			return null;
		}

	}
	
	public void contestarPregunta(int indiceRespuesta) {
		//Usuario -> Jugador
		//Casteo...
		//int a = 10; //10.0
		//double b = (double)a; //Intentando castear el int A a un double
		
		ArrayList<Respuesta> respuestasPosibles = this.preguntas.get(this.indice).getRespuesta();
		
		if(indiceRespuesta <= respuestasPosibles.size()-1) {
			Jugador nacho;
			
			try {
				nacho = (Jugador)this.jugadorActual;
				
				int puntajeActual = nacho.getPuntajeActual();
				
				puntajeActual = puntajeActual + respuestasPosibles.get(indiceRespuesta).getCantEncuestadosResp();
				
				nacho.setPuntajeActual(puntajeActual);
				
				System.out.println(respuestasPosibles.get(indiceRespuesta).getEnunciado() + " " + 
						respuestasPosibles.get(indiceRespuesta).getCantEncuestadosResp() + " puntos!");
			
			}catch(ClassCastException e) {
				System.out.println("NO PUDIMOS CASTEAR EL JUGADOR ACTUAL (USUARIO) A JUGADOR");
			}
		}else {
			System.out.println("RESPUESTA INCORRECTA!");
		}
	}
	
	public Pregunta siguientePregunta() {
		this.indice++;
		
		if(this.preguntas.size() > this.indice) {
			return this.preguntas.get(this.indice); // this.preguntas[this.indice]
		}else {
			return null;
		}
	}
}
