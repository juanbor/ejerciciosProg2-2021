package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Viaje {
	/*
	 * public static LocalDate of(int year, int month, int dayOfMonth)
	 * 
	 */
	private LocalDate fecha;
	private LocalTime hora;
	
	private Terminal destino;
	private Terminal origen;
	private Omnibus bondi;
	
	//ArrayList<Pasajero>
	private ArrayList<Pasajero> pasajeros;
	
	Viaje(LocalDate fecha, LocalTime hora, Terminal destino, Terminal origen, Omnibus bondi, ArrayList<Pasajero> pasajeros){
		this.fecha = fecha;
		this.hora = hora;
		
		this.destino = destino;	
		this.origen = origen;
		this.bondi = bondi;
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

	public Terminal getDestino() {
		return destino;
	}

	public void setDestino(Terminal destino) {
		this.destino = destino;
	}

	public Terminal getOrigen() {
		return origen;
	}

	public void setOrigen(Terminal origen) {
		this.origen = origen;
	}

	public Omnibus getBondi() {
		return bondi;
	}

	public void setBondi(Omnibus bondi) {
		this.bondi = bondi;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
}
