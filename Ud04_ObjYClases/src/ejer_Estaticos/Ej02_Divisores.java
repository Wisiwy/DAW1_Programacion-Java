package ejer_Estaticos;

import java.util.Scanner;

public class Ej02_Divisores {

	public static void main(String[] args) {
		int P = leerIntPositivo("Intro n1 positivo (>0): ");
		int Q = leerIntPositivo("Intro n2 positivo (>0): ");
		System.out.println("----------------------");
		System.out.printf("P = %d divisores %n", calcDivi(P));
		System.out.printf("Q = %d divisores %n", calcDivi(Q));
		System.out.println("----------------------");
		if (calcDivi(P) > calcDivi(Q))
			System.out.println("P tiene mas divisores que Q");
		else if (calcDivi(P) == calcDivi(Q))
			System.out.println("P tiene los mismos divisores que Q");
		else
			System.out.println("Q tiene mas divisores que P");

	}

	private static int calcDivi(int q) {
		int divi = 2;
		for (int i = 2; i <= q; i++) {
			if (q % i == 0)
				divi++;
		}
		return divi;
	}

	private static int leerIntPositivo(String string) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print(string);
			valor = teclado.nextInt();
			if (valor < 0)
				System.err.println("Numero erroneo.");
		} while (valor < 0);

		return valor;
	}

}
