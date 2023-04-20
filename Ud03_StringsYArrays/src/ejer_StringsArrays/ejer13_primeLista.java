package ejer_StringsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejer13_primeLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// cuantos nomb quiere usuario
		System.out.println("Cantidad nombres quieres ordenar: ");
		int canti = Integer.parseInt(teclado.nextLine()); // mirar clase teclado

		String[] lista = new String[canti];
		System.out.println("Introduce " + canti + " nombres para ordenar.");
		// rellenar el array
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Nombre" + (i + 1) + ": ");
			lista[i] = teclado.nextLine();
		}
		// ordenar el array
		Arrays.sort(lista);
		// recorrer mostrando todo del array
		System.out.println(Arrays.toString(lista));
		/*
		 * RECORRER VECTOR y MOSTRARLO. Lo mismo pero sin metodo.toString(lista) 
		 * for
		 * (int i = 0; i < lista.length; i++) { 
		 * System.out.println(lista[i]); }
		 */

	}

}
