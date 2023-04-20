package ejer_StringsArrays;

import java.util.Scanner;

public class ejer06_vocales {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
		} while (str == "");
		str = str.toLowerCase();//pasarlo a m�nuscula por si acaso. 
		
		int cont = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
			cont++;
			}
		}
		System.out.printf("Hay %2d vocales.", cont);

		teclado.close();
	}

}
