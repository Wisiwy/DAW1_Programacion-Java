package ejer_Estaticos;

import aUtilidad.Vali;

public class Ej08_Combinatorio {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		if (Vali.esPosi((int) (Math.pow(b, 2) * a * c)) == true) {

			raizEcuacion(a, b, c);

		} else
			System.err.println("Ecuacion negativa. Parametros no validos.");

	}

	public static double raizEcuacion(double a, double b, double c) {

		double r1 = 0;

		r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
		// Se puede devolver un string de double y meter las dos.
		// r2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
		return r1;

	}

}
