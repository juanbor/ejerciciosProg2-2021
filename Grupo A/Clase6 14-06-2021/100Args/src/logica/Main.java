package logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manejador manejador = new Manejador();
		
		manejador.crearJugador("Luca", 11111111, 0);
		
		ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();
		respuestas.add(new Respuesta(22, "Color"));
		respuestas.add(new Respuesta(14, "No Machucada"));
		respuestas.add(new Respuesta(12, "Tamaño"));
		respuestas.add(new Respuesta(8, "No Arenosa"));
		respuestas.add(new Respuesta(7, "Precio"));
		respuestas.add(new Respuesta(6, "Brillo"));
		
		manejador.crearPregunta("¿En qué te fijas cuando elegís una manzana?", respuestas);
		
		manejador.comenzarJuego(11111111);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Respuesta: ");
			int indiceRespuesta = scan.nextInt();
			
			manejador.contestarPregunta(indiceRespuesta);
			
		}
		
	}

}
