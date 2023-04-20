package ejer_StringsArrays;

import java.util.Scanner;

public class ejer04_strGuiones {

	public static void main(String[] args) {
		// inializar teclado
		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
		} while (str == "");
		
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length()-1)
			System.out.print(str.charAt(i) + " - ");
			else
			System.out.println(str.charAt(i));	
		}
		teclado.close();
		
		
	}

}
