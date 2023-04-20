package ejer_StringsArrays;

import java.util.Iterator;
import java.util.Scanner;

//Escriba un programa que sirva para examinar a un niño de las tablas de multiplicar.
//Para ello se generan de forma pseudoaleatoria diez preguntas que son planteadas al 
//niño.Ante cada pregunta(por ejemplo“4 x5=�?)el niño contestará con un número.
//Si la respuesta es la correcta se le felicita.Si la respuesta es incorrecta se le
//informará al niño de su error y se le volverá a plantear la misma pregunta hasta 
//que acierte.Después de concluir con la última pregunta se informará al niño sobre 
//cuántas preguntas acertó a la primera.

public class Ejer18_tablasMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("========Ejercicio tablas multiplicar=========");
		System.out.println();
		System.out.println("Realiza las siguiente multiplicaciones: ");

		int[] ope1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] ope2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Generar operaciones e imprimirlas
		int res, contador = 0;
		for (int i = 0; i < 10; i++) {
			int op1 = ope1[(int) (Math.random() * 10)];
			int op2 = ope2[(int) (Math.random() * 10)];

			System.out.println("\nRonda " + (i + 1));
			System.out.printf("\n %d x %d = ", op1, op2);
			res = teclado.nextInt();
			if (res == op1 * op2) {
				System.out.println("Respuesta correcta.FELICIDADES!");
				contador++;
				System.out.println("Puntos: " + contador);
			} else {
				do {
					System.err.println("Incorrecta. Prueba de nuevo. ");
					System.out.printf("\n %d x %d = ", op1, op2);
					res = teclado.nextInt();
					i++;
				} while (res != op1 * op2);
			}
		}
		System.out.printf("Has acertado a la primera %d preguntas", contador);
		System.out.println("==========================================");
	}

}
