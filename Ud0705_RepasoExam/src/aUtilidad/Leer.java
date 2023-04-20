
package aUtilidad;

import java.util.Scanner;


public class Leer {

	// Clase Leer que leer diferentes tipos. Clase static.
	/**
	 * Leer Entero (nextInt)
	 * 
	 * @param str - Escribir en pantalla
	 * @return valor - numero entero leido
	 */
	public static Integer leerInt(String str) {
		String valor;
		Integer num = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print(str);

		do {
			valor = teclado.nextLine();
			if (esNum(valor))
				num = Integer.parseInt(valor);
			else
				System.err.println("Error. Intro entero.");
		} while (esNum(valor) == false);
		return num;

	}
	/**
	 * Leer entero entre 1 y numero maximos
	 * @param str , integer numero maximo
	 * @return opcion elegida
	 */
	public static Integer leerIntRango(String str,Integer numMin, Integer numMax) {
		String valor;
		Integer num = 0;
		Scanner teclado = new Scanner(System.in);
		boolean aux;
		System.out.print(str);

		do {
			valor = teclado.nextLine();
			if (esNum(valor)) {
				num = Integer.parseInt(valor);
				if (!Vali.entreRangoNum(num, numMin, numMax))
					System.err.println("Error. Intro entero.");

		}
			else
				System.err.println("Error. Intro entero.");
		} while (!esNum(valor) || !Vali.entreRangoNum(num, numMin, numMax));
		
		return num;

	}

	public static boolean esNum(String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isDigit(str.charAt(i)) != true)
				return false;

		return true;
	}

	/**
	 * Leer entero POSITIVO.
	 * 
	 * @param str - Escribir en pantalla
	 * @return valor int positivo
	 */
	public static int leerIntPosi(String string) {

		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print(string);
			valor = teclado.nextInt();
			if (valor < 0)
				System.err.println("Numero erroneo.");
		} while (valor < 0);
		return valor;
	}

	public static double leerDouble(String str) {

		double valor;
		String valorSTR;
		Scanner teclado = new Scanner(System.in);

		System.out.print(str);
		// valor = teclado.nextDouble();
		valorSTR = teclado.next();
		if (valorSTR.indexOf(".") > 0) {
			valorSTR.replace(".", ",");
		}
		valor = Double.parseDouble(valorSTR);

		return valor;
	}

	public static String leerString(String str) {

		String valor;
		Scanner teclado = new Scanner(System.in);

		System.out.print(str);
		valor = teclado.nextLine();

		return valor;
	}

	/**
	 * BUSCAR dentro vector double. Busca un double dentro de un vector de doubles.
	 * 
	 * @param vector
	 * @param nota
	 * @return
	 */
	public static int miBusca(double[] vector, double nota) {
		int valor = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			// if(vector[i] == nota && encontrado == false) {
			if (vector[i] == nota && !encontrado) {
				valor = i + 1;
				encontrado = true;
			}

		}

		return valor;
	}

}
