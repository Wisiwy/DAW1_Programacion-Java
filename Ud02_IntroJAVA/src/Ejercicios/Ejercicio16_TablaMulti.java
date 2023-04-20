package Ejercicios;

import java.util.Scanner;

public class Ejercicio16_TablaMulti {
//	Escriba un programa que pida dos números enteros y nos muestre 
//	la tabla de multiplicar del primero hasta el número que indique el segundo.
	public static void main(String[] args) {

		System.out.println("*******TABLAS DE MULTIPLICAR*******");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nº a multiplicar: ");
		int multA = teclado.nextInt();
		System.out.println("Introduce hasta que nº quieres multiplicar. ");
		int multB = teclado.nextInt();
		// Recorremos desde 0 hasta el nº dado MultB
		for (int i = 0; i <= multB; i++) {
			// ATENCION: fijarse que el limite del iterador se define con <= (== ESTA MAL)
			System.out.printf("%d * %d = %d \n", multA, i, (multA * i));
		}

		teclado.close();
	}

}
