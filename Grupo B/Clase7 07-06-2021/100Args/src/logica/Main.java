package logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manejador manejador = new Manejador();
		
		ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();
		respuestas.add(new Respuesta("Color",22));
		respuestas.add(new Respuesta("No machucada",14));
		respuestas.add(new Respuesta("Tamaño",12));
		respuestas.add(new Respuesta("No arenosa",8));
		respuestas.add(new Respuesta("Precio",7));
		respuestas.add(new Respuesta("Brillo",6));
		Pregunta pregunta = new Pregunta("¿En qué te fijas cuando elegís una manzana?",respuestas);
		
		//guardamos la primera pregunta
		manejador.addPregunta(pregunta);
		
		Jugador jugador1 = new Jugador("Nacho Ibarra", 11111111, 0, new ArrayList<Pregunta>());
		
		//guardamos el jugador1
		manejador.addJugador(jugador1);
		
		Pregunta preguntaActual = manejador.comenzarJuego(11111111);
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("Opción: ");
			int resp = scan.nextInt();
			manejador.contestarPregunta(resp);
		}
		
	}

}
