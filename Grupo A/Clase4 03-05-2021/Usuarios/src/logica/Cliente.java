package logica;

public class Cliente extends Usuario {
	private int cantProductosFavs;
	private String ultimoProductoVisitado;
	
	public Cliente(String nombre, String username, String password, int cantProductosFavs,
			String ultimoProductoVisitado) {
		super(nombre, username, password);
		this.cantProductosFavs = cantProductosFavs;
		this.ultimoProductoVisitado = ultimoProductoVisitado;
	}

	public int getCantProductosFavs() {
		return cantProductosFavs;
	}

	public void setCantProductosFavs(int cantProductosFavs) {
		this.cantProductosFavs = cantProductosFavs;
	}

	public String getUltimoProductoVisitado() {
		return ultimoProductoVisitado;
	}

	public void setUltimoProductoVisitado(String ultimoProductoVisitado) {
		this.ultimoProductoVisitado = ultimoProductoVisitado;
	}
	
	
	
	
}
