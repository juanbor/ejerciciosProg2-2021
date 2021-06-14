package logica;

public class Respuesta {
	private int cantEncResp;
	private String enunciado;
	
	public Respuesta(int cantEncResp, String enunciado) {
		super();
		this.cantEncResp = cantEncResp;
		this.enunciado = enunciado;
	}

	public int getCantEncResp() {
		return cantEncResp;
	}

	public void setCantEncResp(int cantEncResp) {
		this.cantEncResp = cantEncResp;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	
}
