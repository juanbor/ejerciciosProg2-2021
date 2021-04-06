package logica;

public class Usuario {
	//Estado
	String nombre;
	String apellido;
	int ci;
	int edad;
	
	//Comportamiento
	//Contructor COMPLETO.
	Usuario(String nombre, String apellido, int ci, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.edad = edad;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	String getApellido() {
		return this.apellido;
	}
	
	void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	
	
}
