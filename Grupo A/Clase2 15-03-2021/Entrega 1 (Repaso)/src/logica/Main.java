package logica;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("Ingrese su arreglo: ");
		
		// Obtenemos los numeros
		Scanner sc = new Scanner(System.in);
		String numeros = sc.next();
		
		// Defninimos el arreglo que guarda los nuemros
		int[] arreglo = new int[numeros.length()];

		// Guardamos los numeros
		for(int i = 0; i<numeros.length(); i++) {
			//Obtengo el i-esimo numero de la cadena
			String num = numeros.substring(i, i+1);
			//Lo casteo a int
			arreglo[i] = Integer.parseInt(num);
		}
		
		
		// Genero una instancia del tipo Sorting
		Sorting algoritmo = new Sorting();
		
		int[] arregloOrdenado = algoritmo.BubbleSort(arreglo);
		
		for(int i = 0; i<arregloOrdenado.length; i++) {
			System.out.print(arregloOrdenado[i]);
		}
	
	}

}
