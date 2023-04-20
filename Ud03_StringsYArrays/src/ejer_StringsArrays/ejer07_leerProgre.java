package ejer_StringsArrays;

import java.util.Scanner;

public class ejer07_leerProgre {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// incializar cadena
		String str = " ";
		do {
			System.out.println("Introduce texto: ");
			str = teclado.nextLine();
			if(str == "" && str.length()==80)
				System.err.println("Error, introduce otro texto.");
		} while (str == "" && str.length()==80);
		
		
		//recorrer un string y acumular sus resultados
		String acum = "";
//		for (int i = 0; i < str.length(); i++) {
//			acum = acum + str.charAt(i);		
//			
//		}
		
		//Con dos bucle for
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(str.charAt(j)); //Pintamos todo el rato desde 0 hasta la posicion 
				//del iterador de arriba i. De 0 a iterador de arriba
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
