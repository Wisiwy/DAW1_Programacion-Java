package Ejercicios;

import java.util.Scanner;

public class Ejercicio32_Crapulo {

	public static void main(String[] args) {
		System.out.println("*******CRAPULOS*******");
		System.out.println("-----------------------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nº a crapular: ");
		int num = teclado.nextInt();
		do {
			int acu = 0, cociente;
			do {
				cociente = num / 10;
				int resto = num % 10;
				acu = acu + resto;
				if (cociente >= 10) {
					num = cociente;
				} else {
					acu = acu + cociente;
				}

			} while (cociente >= 10);
			System.out.println("Suma: " + acu);
			num = acu; // fijarse en los reseteos

		} while (num >= 10);
		System.out.println("Crapulo: " + num);

	}

}
