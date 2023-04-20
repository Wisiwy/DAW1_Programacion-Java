package ejer_StringsArrays;

import java.util.Scanner;

public class ejer08_leerProgre2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
			if (str == "" && str.length() == 80)
				System.err.println("Error, introduce otro texto.");
		} while (str == "" && str.length() == 80);
		int acu = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j)); 
			}
			System.out.println();
			if (str.charAt(i) == ' ')
				acu++;
		}
		System.out.printf("En total hay %2d palabras.", (acu+1));
		System.out.println();
//******************Metodo String.Split******************************
		String strspli = "Raul--Lyris--Kuis--David"; //Split devuelve un vector de strings
		String[] vector = strspli.split("--"); //marcamos en que caracteres tiene que separar y lo recoge en u
		//bloque del vector
		System.out.println("He encontrado "+vector.length+"nombres.");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		
		teclado.close();
	}

}
