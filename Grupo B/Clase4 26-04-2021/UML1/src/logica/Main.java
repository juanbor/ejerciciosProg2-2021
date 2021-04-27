package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Terminal terminalOrigen = new Terminal(1, "Terminal de Rocha"); //terminalOrigen.getNombre();
		Terminal terminalDestino = new Terminal(2, "Terminal de Maldonado");
		
		Omnibus elBondi = new Omnibus("Merdeces Benz", "111ACA", 40);
		
		ArrayList<Pasajero> pasajerosArrayList = new ArrayList<Pasajero>();
		
		Pasajero pasajero = new Pasajero("Emir", 1234567);
		Pasajero pasajero1 = new Pasajero("Lyudmila", 7654321);
		Pasajero pasajero2 = new Pasajero("Veronica", 7651234);
		
		// .add(elemento)  ->  Guarda elemnto en el arraylist
		pasajerosArrayList.add(pasajero);
		pasajerosArrayList.add(pasajero1);
		pasajerosArrayList.add(pasajero2);
		
		// .get(indice)   ->   Me devuelve lo que esta guardando en el lugar "indice"
		// .size()    ->    Me devuelve el largo del ArrayList (es igual a length de array)
		for(int i = 0; i<pasajerosArrayList.size(); i++) {
			System.out.println(pasajerosArrayList.get(i));
		}

		Viaje viaje1 = new Viaje(LocalDate.now(), LocalTime.now(), terminalDestino, terminalOrigen, elBondi, pasajerosArrayList);
		
		/*
		 * Map
		 * (k1,E1) -> (k2,E2) -> (k3,E3) -> N
		 * 
		 * ArrayList
		 * Usuario1 -> Usuario2 -> Usuario3...
		 * 
		 * Map
		 * (cedula1, Usuario1) -> (cedula2, Usuario2)...
		 * 
		 */

	}

}
