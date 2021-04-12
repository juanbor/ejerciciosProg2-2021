package logica;

public class Main {
	
	/*
	 *  == 
	 *  String var1 = "hola"
	 *  String var2 = "hola"
	 *  var1 == var2 -> True
	 *  
	 *  .equals
	 *  String var1 = "hola"
	 *  String var2 = "hola"
	 *  var1.equals(var2) -> True
	 *  
	 *  .equalsIgnoreCase
	 *  String var1 = "Hola"
	 *  String var2 = "hola"
	 *  var1.equalsIgnoreCase(var2) -> True
	 *  
	 *  ----------------------------------------------------------
	 * 	== 
	 *  String var1 = new String("hola");
	 *  String var2 = "hola"
	 *  var1 == var2 -> False
	 *  
	 *  .equals
	 *  String var1 = new String("hola")
	 *  String var2 = "hola"
	 *  var1.equals(var2) -> True
	 *  
	 *  .equalsIgnoreCase
	 *  String var1 = new String("hola")
	 *  String var2 = "hola"
	 *  var1.equalsIgnoreCase(var2) -> True
	 */
	
	// b1 b2 b3 _ _ _ _ _ _ _ _ _ _ _ _ 
	//Quiero imprimir todos los blogs que tengan de autor a 'mailAutor'
	public static void printBlogsByAutor(String mailAutor, Blog[] blogs) {
		for(int i = 0; i<blogs.length-1; i++) {
			if ((blogs[i] != null) && (blogs[i].getUsuarioDelBlog().getMail().equalsIgnoreCase(mailAutor))) {
				System.out.println(blogs[i].getTitulo());
			}
		}
	}

	public static void main(String[] args) {
		Usuario[] usuarios = new Usuario[5];
		Blog[] blogs = new Blog[15];
		
		Usuario user1 = new Usuario("Juan", "juan@juan.com", "1234", 1);
		Usuario user2 = new Usuario("Carlos", "carlos@carlos.com", "1234", 2);
		Usuario user3 = new Usuario("Pedro", "pedro@pedro.com", "1234", 2);
		
		usuarios[0] = user1;
		usuarios[1] = user2;
		usuarios[2] = user3;
		
		for(int i = 0; i<blogs.length-1; i++) {
			blogs[i] = null;
		}
		
		blogs[0] = new Blog("Un dia mas en el universo", 
				"Es un libro muy bello, muy entretenido… o no...", 
				user1);
		
		blogs[1] = new Blog("La divina comedia", 
				"Es un libro muy bello, habla del infierno segun Dante", 
				user2);
		
		blogs[2] = new Blog("El hombre en busca de sentido", 
				"Es un libro muy bello, habla de que todos deberiamos tener un sentido de vida",
				user2);
		
		printBlogsByAutor("juan@juan.com", blogs);

	}

}
