package logica;

public class Main {
	
	// blogs[i].mailAutor X
	
	// Usuario userDelBlog = blogs[i].getUsuarioDelBlog()
	// userDelBlog.getMail()
	
	// blogs[i].getUsuarioDelBlog().getMail();
	
	public static void printBlogsByAutor(String mailAutor, int contadorBlogs, Blog[] blogs) {
		System.out.println(mailAutor);
		for(int i = 0; i < contadorBlogs; i++) {
			if((blogs[i] != null) && (blogs[i].getUsuarioDelBlog().getMail().equals(mailAutor))) {
				System.out.println("Blog: "+ "\n" + blogs[i].getTitulo() + "\n" + 
							blogs[i].getCuerpo() + "\n" + 
							blogs[i].getUsuarioDelBlog().getMail());
			}
		}
		
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario[] usuarios = new Usuario[5];
		// u1 u2 u3 _ _ 
		int contadorUsuarios = 0;
		
		Blog[] blogs = new Blog[15];
		int contadorBlogs = 0;
		
		Usuario user1 = new Usuario("Juan", "juan@juan.com", "1234", 1);
		Usuario user2 = new Usuario("Carlos", "carlos@carlos.com", "1234", 2);
		Usuario user3 = new Usuario("Pedro", "pedro@pedro.com", "1234", 2);
		
		usuarios[0] = user1;
		contadorUsuarios++;
		usuarios[1] = user2;
		contadorUsuarios++;
		usuarios[2] = user3;
		contadorUsuarios++;

		blogs[0] = new Blog("Un dia mas en el universo", 
					"Es un libro muy bello, muy entretenido… o no...", 
					user1);
		contadorBlogs++;
		
		blogs[1] = new Blog("La divina comedia", 
				"Es un libro muy bello, habla del infierno segun Dante", 
				user2);
		contadorBlogs++;
		
		blogs[2] = new Blog("El hombre en busca de sentido", 
				"Es un libro muy bello, habla de que todos deberiamos tener un sentido de vida", 
				user2);
		contadorBlogs++;
		
		
		printBlogsByAutor("juan@juan.com", contadorBlogs, blogs);
		printBlogsByAutor("carlos@carlos.com", contadorBlogs, blogs);
		printBlogsByAutor("pedro@pedro.com", contadorBlogs, blogs);
		

	}

}
