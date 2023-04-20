package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String str;
		
		do {
		
			System.out.print("Texto: ");
			str = teclado.nextLine();
			
			if(str != "")
				System.out.println("  caracteres: "+str.length());
		
		}while(str != "");
		
		System.out.println("Fin del programa");
	}

}
