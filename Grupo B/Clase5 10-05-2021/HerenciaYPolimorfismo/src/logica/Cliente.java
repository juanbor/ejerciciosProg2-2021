package logica;

public class Cliente extends Usuario {
	private int cantProductosFav;
	private String ultimoProdVisitado;
	
	public Cliente(String nombre, String username, String password, int cantProductosFav, String ultimoProdVisitado) {
		super(nombre, username, password);
		this.cantProductosFav = cantProductosFav;
		this.ultimoProdVisitado = ultimoProdVisitado;
	}

	public int getCantProductosFav() {
		return cantProductosFav;
	}

	public void setCantProductosFav(int cantProductosFav) {
		this.cantProductosFav = cantProductosFav;
	}

	public String getUltimoProdVisitado() {
		return ultimoProdVisitado;
	}

	public void setUltimoProdVisitado(String ultimoProdVisitado) {
		this.ultimoProdVisitado = ultimoProdVisitado;
	}
	
	
}
