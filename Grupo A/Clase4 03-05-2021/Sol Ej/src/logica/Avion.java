package logica;

public class Avion {
	private String modelo;
	private String patente;
	private int capacidad;
	
	Avion(String modelo, String patente, int capacidad){
		this.modelo = modelo;
		this.patente = patente;
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
