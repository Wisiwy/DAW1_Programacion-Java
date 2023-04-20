package ejer_Estaticos;

import java.util.Scanner;

import aUtilidad.Leer;
import aUtilidad.Vali;



public class Ej01_Primo {

	public static void main(String[] args) {

		// COMPROBAR SI ALGO INTRO POR TECLADO ES NUMERO O NO, SI LO ES LO METO EN UN
		// INT
		Scanner teclado = new Scanner(System.in);
		String str = teclado.nextLine(); // Integer.parseInt convierte el entero que haya dentro del
		// string a entero. Parsea el entero dentro del string a Int.
		if (Vali.esNum(str));

		int n = Leer.leerInt("Intro un numero: ");
		if (esPrimo(n))
			System.out.printf("%6d es primo.", n);
		else
			System.out.printf("%6d no es primo.", n);

		System.out.println();

	}

	/**
	 * Num es primo
	 * 
	 * @param num
	 * @return boolean dice si es o no es primo
	 */
	private static boolean esPrimo(int num) {
		for (int n = 2; n < num; n++) { // comprobar si es divisible entre 1 y si mism, empezar desde 0
			if (num % n == 0)
				return false;// break point romper bucle cuando encuentre uno divisible salga bucle
								// devolviendo false
		}
		return true; // si ha pasado por tod
	}

}
