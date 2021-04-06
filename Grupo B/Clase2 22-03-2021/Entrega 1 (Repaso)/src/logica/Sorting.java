package logica;

public class Sorting {
	//Estado
	
	
	//Comportamiento
	//Constructor
	Sorting(){
		
	}
	
	// La guia definitiva para definir metodos:
	// public -> todos pueden usar
	// int[] -> retorna un arreglo de int
	// nombre del metodo -> BubbleSort
	// parametros de entrada, que van dentro de los parentesis () -> en este caso
	//	necesito pasarle el arreglo a ordenar (int[] arreglo)
	public int[] BubbleSort(int[] arreglo){
		
		boolean algoCambio = true;
		
		while(algoCambio) {
			algoCambio = false;
			
			for(int i = 0; i<arreglo.length-1; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					algoCambio = true;
					int swipe = arreglo[i+1];
					arreglo[i+1] = arreglo[i];
					arreglo[i] = swipe;
				}
			}
		}
		
		return arreglo;
	}
	
	
	
	
	/*
	 * -> [1, 2, 3]
	 * -> [1.1, 2.8, 4.6]
	 * 
	 * -> [sort1, sort2, sort3]
	 * Sorting[] arregloDeSortings = { new Sorting(), new Sorting(), new Sorting() }
	 * 
	 * Usuario user1 = new Usuario ("Juan", "...")
	 * 
	 * Blog blog1 = new Blog(...)
	 * 
	 * Usuario[] usuarios = { user1, new Usuario("Carlos"..) }
	 * Blog[] blogs = { new Blog("Juan",...), new Blog("Carlos"..) }
	 * 
	 * mail = "juan@juan.com"
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
