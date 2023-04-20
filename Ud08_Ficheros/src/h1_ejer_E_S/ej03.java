package h1_ejer_E_S;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		System.out.println("Lado cuadrado: ");
		Scanner t = new Scanner(System.in);
		boolean nega = true;
		while (nega) {
			int l = t.nextInt();
			if (l > 0) {
				nega = false;
				System.out.println("Area: " + (l * l));
			} else
				System.err.println("Numero erroneo intro otro: ");
		}

		System.out.println("Adios!");
	}

}
