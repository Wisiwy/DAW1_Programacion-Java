package ejer_StringsArrays;

import java.util.Scanner;

//Pedir una frase por teclado y codificarla de la siguiente manera:
//Se pedir� un n�mero por teclado entre 1 y 5,y a cada car�cter de 
//la frase se le sumar� dicho n�mero.Por ejemplo,si la frase inicial es 
//PROGRAMACION,y el n�mero de codificaci�n es el 3,el resultado ser� SURJUDPDFLRQ
public class ejer09_asciCambio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// pedir frase
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
			if (str == "" && str.length() == 80)
				System.err.println("Error, introduce otro texto.");
		} while (str == "" && str.length() == 80);

		// pedit num
		int num = 0;
		do {
			System.out.println("Introduce un numero (1-5): ");
			num = teclado.nextInt();
			if (num < 1 || num > 5)
				System.err.println("Error, introduce otro texto.");
		} while (num < 1 || num > 5);

		// Cambiar numero asci de las letras

		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			int a = (int) c + num;
//			c = (char) a;
//			System.out.print(c);

			System.out.print((char) (num + (int) (str.charAt(i)))); //resumido con casteo de variables

		}

	}

}
