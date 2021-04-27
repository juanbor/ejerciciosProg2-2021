package logica;

public class Pasajero {
	/*
	 * - = private
	 * + = public
	 */
	
	private String nombre;
	private int documento;
	
	Pasajero(String nombre, int documento){
		this.nombre = nombre;
		this.documento = documento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDocumento() {
		return this.documento;
	}
}
