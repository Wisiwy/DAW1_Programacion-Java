package ejer_StringsArrays;

import java.util.Scanner;

//En el programa principal se pedir� una frase y se mostrar� un mensaje diciendo 
//si es pal�ndromo o no, continuar� pidiendo frases hasta que se pulse enter. 
public class ejer10_palindromo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String str = " ";
		String str2 = "";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
			if (str == "" && str.length() == 80)
				System.err.println("Error, introduce otro texto.");
		} while (str == "" && str.length() == 100);

		
		// sacar palindromo
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
			System.out.println(str2);
		}
		
		// comprobar palindromo con original
		boolean pal = true;
		
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) != str2.charAt(j)) {
				System.out.println(str + " no es palindromo. ");
				break;
			} else
				pal = false;

		}
		if (pal == false) {
			System.out.println(str + " es palindromo. ");
		}

	}
}
