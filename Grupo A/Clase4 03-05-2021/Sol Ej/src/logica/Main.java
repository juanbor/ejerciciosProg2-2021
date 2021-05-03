package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeropuerto destino = new Aeropuerto(1, "Aeropuerto de Miami");
		Aeropuerto origen = new Aeropuerto(2, "Aeropuerto de Montevideo");
		
		Avion avion = new Avion("Boeing 747", "AAA737", 366);
		
		Pasajero[] pasajeros = new Pasajero[3];
		
		pasajeros[0] = new Pasajero("Carlos", 11111111);
		pasajeros[1] = new Pasajero("Pedro", 22222222);
		pasajeros[2] = new Pasajero("Jose", 33333333);
		
		ArrayList<Pasajero> pasajerosArrayList = new ArrayList<Pasajero>();
		//pasajerosArrayList.add( pasajeros[0] );
		// pas1 -> pas2 -> pas3
		Pasajero pas1 = new Pasajero("Carlos", 11111111);
		pasajerosArrayList.add( pas1 );
		
		Pasajero pas2 = new Pasajero("Pedro", 22222222);
		pasajerosArrayList.add( pas2 );
		
		Pasajero pas3 = new Pasajero("Jose", 33333333);
		pasajerosArrayList.add( pas3 );
		
		for(int i = 0; i < pasajerosArrayList.size(); i++) {
			System.out.println(pasajerosArrayList.get(i).toString());
		}

		Vuelo vuelo = new Vuelo(LocalDate.of(2021, 2, 13), LocalTime.now(), origen, destino, avion, pasajerosArrayList);
	}

}
