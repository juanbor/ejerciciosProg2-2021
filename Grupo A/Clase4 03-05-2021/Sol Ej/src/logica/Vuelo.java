package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vuelo {
	private LocalDate fecha;
	private LocalTime hora;
	
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	private Avion avion;
	
	private ArrayList<Pasajero> pasajeros;

	Vuelo(LocalDate fecha, LocalTime hora, Aeropuerto origen, Aeropuerto destino, Avion avion,
			ArrayList<Pasajero> pasajeros) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.origen = origen;
		this.destino = destino;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}
