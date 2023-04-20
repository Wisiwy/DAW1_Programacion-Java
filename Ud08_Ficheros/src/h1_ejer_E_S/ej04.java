package h1_ejer_E_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej04 {
	public static void main(String[] args) {

		// declarar buffered reader con Scanner
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0;
		boolean error = false;
		

		do {

			try {
				a = Integer.valueOf(entrada.readLine());
				b = Integer.valueOf(entrada.readLine());
				error=false;
			} catch (NumberFormatException e) {
				error = true;
				System.err.println("Formato incorrecto. Vuelva a introducir.");
			} catch (IOException e) {
				error = true;
				System.err.println("Error In and Out IO.");
			}
		} while (error);
		System.out.println(" a: " + a + " b: " + b);
		int aux = a;
		a = b;
		b = aux;
		System.out.println(" a: " + a + " b: " + b);

	}

}
