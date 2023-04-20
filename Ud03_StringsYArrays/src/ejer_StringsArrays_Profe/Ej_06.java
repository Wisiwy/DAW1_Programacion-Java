package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_06 {
	
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Palabra: ");
		String str = teclado.nextLine();
		
		str = str.toLowerCase();
		int cont=0;
		//mostrar letra a letra
		for(int i=0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i));
			if( str.toLowerCase().charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.print("  VOCAL");
				cont++;
			}
			System.out.println();
		}
		
		//System.out.printf("He encontrado %d vocales",cont);
		String salida = String.format("He encontrado %d vocales \n", cont);
		System.out.println(salida);
		
		
	}

}
