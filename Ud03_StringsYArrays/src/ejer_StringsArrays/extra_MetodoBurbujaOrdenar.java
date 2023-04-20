package ejer_StringsArrays;

import java.util.Iterator;
import java.util.Scanner;

public class extra_MetodoBurbujaOrdenar {

	public static void main(String[] args) {
		// rellenar vector
//		Scanner teclado = new Scanner(System.in);
//		int[] vector = new int[5];
//		for (int l = 0; l < vector.length; i++) {
//			System.out.println("Intro numero array:");
//			vector[l] = teclado.nextInt();
//		}

		int[] vector = { 5, 4, 3, 2, 1 };

		// for (int k = 0; k < vector.length; k++) {
		int vec = 0;
		do {
			for (int i = 0; i < vector.length - 1; i++) {
				
				//comparar con la siguiente posicion
				if (vector[i] > vector[i + 1]) {
				//intercabiar valores
					int aux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = aux;
				}
					
			}
			vec++;
		} while (vec <= vector.length);
		//comprobar con la solucion del profe
		//hacerlo hasta la longitud vector
		
		for (int i = 0; i < vector.length; i++) {
		System.out.println(vector[i]);
			
		}
		
			
		}

	}
