package logica;

import java.util.Scanner;

public class Sorting {
	
	// Constructor (completo)
	Sorting(){
	}
	
	// modificadorAcceso tipoRetorno nombreMetodo(TipoInput input1, ..., TipoInput inputN);
	public int[] BubbleSort(int[] arreglo) {
		boolean termine = false;
		
		while(!termine) {
			termine = true;
			
			for(int i = 0; i<arreglo.length-1; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					int temp = arreglo[i+1];
					arreglo[i+1] = arreglo[i];
					arreglo[i] = temp;
					termine = false;
					
//					int temp2 = arreglo[i];
//					arreglo[i] = arreglo[i+1];
//					arreglo[i+1] = temp2;
//					termine = false;
				}
			}
		}
		
		return arreglo;
		
		/*
		 * "1234" stringDeJuan -> "1" "2" "3" "4"
		 * [1,2,3,4] (charsDeJuan) -> charsDeJuan[0] -> '1' 
		 * [1,2,3,4] (charsDeJuan) -> charsDeJuan[1] -> '2' 
		 * ...
		 * 
		 * String.substring(indexIncial, indexFinal)
		 * stringDeJuan.substring(0,1) -> "1"
		 * stringDeJuan.substring(1,2) -> "2"
		 * stringDeJuan.substring(1,3) -> "23"
		 * 
		 * [5,4,1,2]
		 * [4,5,1,2]
		 * [4,1,5,2]
		 * [4,1,2,5]
		 * [1,4,2,5]
		 * [1,2,4,5]

		 */
		
		
		
		
	}

	public int[] QuickSort(int[] arreglo) {
		return null;
	}
	
	public int[] MergeSort(int[] arreglo) {
		return null;
	}
}
