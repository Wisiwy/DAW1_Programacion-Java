package ejer_StringsArrays;

import java.util.Scanner;

public class ejer10_palindromoprof {

	public static void main(String[] args) {

			
			//Pedimos string
		Scanner teclado = new Scanner(System.in);
			
		String str ="";
		
		do {
			System.out.println("Palabra: ");
			str = teclado.nextLine();
			if (palindromo(str.toLowerCase()) && str!="")
				System.out.println("Es palindormo");
			else if (str!="") 
				System.out.println("o es palindromo");
				
		} while (str!="");
			
	}	
				
				// public lo ve todo el mundo //statico// tipo de dato que devuelve// (el
			// parametro que le pasamos)

	/**
	 * 
	 * @param str
	 * @return si es palindromo o no
	 */
	public static boolean palindromo(String str) {
		
		for (int i = 0; i < (str.length() / 2); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false; // devuelve el tipo de dato del metodo
			}
			// sale del bucle y returnara true
		}
		return true;
	}
}
