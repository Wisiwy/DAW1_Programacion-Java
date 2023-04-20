package ejer_StringsArrays;

import java.util.Iterator;
import java.util.Scanner;

public class ejer05_InvertidaStr {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
		} while (str == "");

//		System.out.println(str);
//		for (int i = str.length()-1; i < 0; i--) {
//			System.out.print(str.charAt(i));
//			
//		}Hoy no tengo el dia me faltaba el igual

		// mostrar letra a letra la palabra
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//Mostrar las letras al reves
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
			
		}
		

		teclado.close();
	}

}
