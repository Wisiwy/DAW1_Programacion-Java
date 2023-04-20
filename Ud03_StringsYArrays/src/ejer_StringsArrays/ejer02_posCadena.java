package ejer_StringsArrays;

import java.util.Scanner;

public class ejer02_posCadena {

	public static void main(String[] args) {
		// inializar teclado
		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";

		// Introducir cadena por teclado
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
		} while (str == "");

		int num;
		do {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt()-1;
		
			if (num <= str.length() && num>0)
				System.out.println(str.charAt(num));
			else
				System.err.println("Error, introduce un numero menor que: " + str.length());

		} while (num<0);

		teclado.close();
	}

}
