package ejer_StringsArrays;

import java.util.Scanner;

public class ejer01_CadVacia {

	public static void main(String[] args) {
		//inializar teclado
		Scanner teclado = new Scanner(System.in);
		//incializar cadena
		String cad = " ";
		//condicion hasta que capte una vacia
		while(cad != "" ) {
			//Introducimos cadena por teclado
			System.out.println("Introduce texto: ");
			cad = teclado.nextLine();
			//imprimimos la longitud de la cad
			System.out.println(cad.length());
		}
		System.out.println("fin");
	teclado.close();	
	}

}
