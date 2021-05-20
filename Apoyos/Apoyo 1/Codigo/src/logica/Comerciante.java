package logica;

import java.util.ArrayList;

public class Comerciante extends Usuario{
	private ArrayList<Producto> productos;

	public Comerciante(String nombre, ArrayList<Producto> productos) {
		super(nombre);
		this.productos = productos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
