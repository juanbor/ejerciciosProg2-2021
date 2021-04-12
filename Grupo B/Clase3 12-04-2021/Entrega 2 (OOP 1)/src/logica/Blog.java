package logica;

public class Blog {
	//titulo, cuerpo, mailAutor
	private String titulo;
	private String cuerpo;
//	private String mailAutor;
	private Usuario usuarioDelBlog;
	
	Blog(String titulo, String cuerpo, Usuario userDelBlog){
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarioDelBlog = userDelBlog;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public Usuario getUsuarioDelBlog() {
		return this.usuarioDelBlog;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public void setUsuarioDelBlog(Usuario user) {
		this.usuarioDelBlog = user;
	}
}
