package logica;

public class Respuesta {
	private String enunciado;
	private int cantEncuestadosResp;
	
	public Respuesta(String enunciado, int cantEncuestadosResp) {
		super();
		this.enunciado = enunciado;
		this.cantEncuestadosResp = cantEncuestadosResp;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getCantEncuestadosResp() {
		return cantEncuestadosResp;
	}

	public void setCantEncuestadosResp(int cantEncuestadosResp) {
		this.cantEncuestadosResp = cantEncuestadosResp;
	}
	
	
}
