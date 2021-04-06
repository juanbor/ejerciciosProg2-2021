package logica;

import java.util.Scanner;

public class Main {
	
	public static int[] getNumeros() {
		//Ej 1.
		
		/*
		 * -> 3,2,1,6 -> 1,2,3,6
		 * 1 -> 2,3,1,6
		 * 2 -> 2,1,3,6
		 * 3 -> 2,1,3,6
		 * 4 -> 1,2,3,6
		 * 5 -> 1,2,3,6
		 */
		
		// Tipo_Var Nombre_Var = new Constructor(...);
		Scanner sc = new Scanner(System.in);
		String datos;
		
		System.out.print("Ingresa los datos amigui: ");
		
		datos = sc.next();
		
		// 0-9
		// 398892479582748973974239847
		// -> [3,9,8,..]
		// 348975839745893758971893745723947509237459872340957234752934759
		
		int arreglo[] = new int[datos.length()];
		
		for(int i = 0; i<datos.length(); i++) {
			String numero = datos.substring(i, i+1);
			int valorActual = Integer.parseInt(numero);               
			arreglo[i] = valorActual;
		}
		
		return arreglo;
	}
	
	// La guia definitiva para definir metodos:
	// public -> todos pueden usar
	// static -> es un metodo de clase (puedo usarlo como Main.imprimirNumeros())
	// void -> no retorna nada (si retorna int, queda como: public static int imprimirNumeros();)
	// nombre del metodo -> imprimirNumeros
	// parametros de entrada, que van dentro de los parentesis () -> en este caso
	//	necesito pasarle el arreglo a imprimir (int[] arregloAImprimir)
	public static void imprimirNumeros(int[] arregloAImprimir) {
		System.out.print("La salida es: ");
		for(int i = 0; i<arregloAImprimir.length; i++) {
			System.out.print(arregloAImprimir[i]);
		}
	}
	
	public static void main(String[] args) {
		int arreglo[] = getNumeros();
	
		Sorting sort = new Sorting();
		
		arreglo = sort.BubbleSort(arreglo);
		
		imprimirNumeros(arreglo);

	}

}
