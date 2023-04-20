package teoria_StringsArrays;

import java.util.Iterator;
import java.util.Scanner;

public class Clase01_Arrays {
	public static void main(String[] args) {
		// ARRAYS. Pueden estar rellenos de lo que sea.

		// Vector1-----------------------------------
		int[] vector1 = new int[4]; // Llamo a constructor "new"

		vector1[0] = 5;
		vector1[3] = 7;
		vector1[2] = 2;
		vector1[1] = 7;

		// Recorrer un vector
		for (int i = 0; i < 4; i++) { // vector.length funciona
			System.out.println("Vector: " + vector1[i]);
		}

		// Vector2--------------------------------
		int[] vector2 = { 5, 1, 2, 4 };
		for (int i = 0; i < vector2.length; i++) {
			System.out.println("Vector2 (" + i + "): " + vector2[i]);
		}
		;

		// Vector 3: Usuario nos rellena el vector.
		Scanner teclado = new Scanner(System.in);
		
		int[] vector3 = new int[4];

		for (int i = 0; i < vector3.length; i++) { // Importante iterador
			System.out.println("Num (" + i + "): ");
			vector3[i] = teclado.nextInt(); // Recogemos en cada posicion
		}

		System.out.println();
		for(int i=0 ; i < vector3.length ; i++) 
			System.out.println(vector3[i]);
		// Graba en la variable "num" el valor del vector. Por cada entero. Lo muestra.
		for(int num : vector3)		// Bucle de duracion el vector.
										
			System.out.println(num);
			
		

	}
}
