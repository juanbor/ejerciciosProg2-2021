package logica;

public class Blog {
	private String titulo;
	private String cuerpo;
	private Usuario usuarioDelBlog;
	
	Blog(String titulo, String cuerpo, Usuario usuarioDelBlog){
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarioDelBlog = usuarioDelBlog;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public Usuario getUsuarioDelBlog() {
		return this.usuarioDelBlog;
	}
	
	public void setUsuarioDelBlog(Usuario usuario) {
		this.usuarioDelBlog = usuario;
	}
	
}
