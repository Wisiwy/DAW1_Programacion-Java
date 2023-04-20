package Excepciones;

import java.util.Scanner;

public class ej06_StringToLong {

	public static void main(String[] args) {
		boolean com = false;
		do {
			try {
				System.out.println("Intro una cadena: ");
				Scanner t = new Scanner(System.in);
				String cad = t.nextLine();
				compruebaLongitud(cad);
				com = true;
			} catch (StringTooLongException e) {
				System.err.println(e.getMessage());

			}
		} while (com == false);
		try {
			Scanner t = new Scanner(System.in);
			String cad = t.nextLine();
			compruebaLongitud(cad);
		} catch (StringTooLongException e) {
			System.err.println(e.getMessage());

		}
	}

	private static void compruebaLongitud(String cad) throws StringTooLongException {
		if (cad.length() < 2)
			throw new StringTooLongException(cad, "es menor de 2");
	}

}
