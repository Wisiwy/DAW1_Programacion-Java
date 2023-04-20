package ejer_StringsArrays;

import java.util.Scanner;

//La letra no es m�s que un sistema de verificaci�n del n�mero de ocho d�gitos. Es decir, la letra de nuestro DNI depende directamente de los ocho n�meros que la precedan. Para calcular la letra del documento, se aplica la siguiente f�rmula:
//
//    Dividimos el n�mero completo del DNI entre 23, sin sacar decimales.
//    Utilizamos el resto de la divisi�n para calcular la letra. Dicho resto estar� siempre entre 0 y 22.
//    Seg�n el valor obtenido, sabremos qu� letra corresponde siguiendo el siguiente c�digo: TRWAGMYFPDXBNJZSQVHLCKE. Aqu�, la T corresponde al valor 0 y la E al 22.
//		TRWAGMYFPDXBNJZSQVHLCKE
public class extra_letraDni {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("*****CALCULADORA LETRA DNI*****");
		System.out.println("-------------------------------");

		do {
			int dni;
			do {
				System.out.println("\nIntro tu DNI: ");
				dni = teclado.nextInt();
				if (dni<0 || dni>100000000) {
					System.err.println("Dni no valido.");
				}

			} while (dni<0 || dni>100000000);

			// vector con las letras en el orden indicado por el gobierno
			char[] vLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
					'H', 'L', 'C', 'K', 'E' };

			System.out.println("Tu letra es: " + vLetras[dni % 23]);
		} while (1 == 1);

	}

}
