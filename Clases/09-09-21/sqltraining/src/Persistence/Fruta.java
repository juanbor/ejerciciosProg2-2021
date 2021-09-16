package Persistence;

public class Fruta {
	//CREATE TABLE frutas(nombre VARCHAR(15), color VARCHAR(10), tamanio VARCHAR(10), precio INT)
	
	private String nombre;
	private String color;
	private String tamanio;
	private int precio;
	
	public Fruta(String nombre, String color, String tamanio, int precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tamanio = tamanio;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
