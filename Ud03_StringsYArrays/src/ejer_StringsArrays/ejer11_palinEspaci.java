package ejer_StringsArrays;

import java.util.Scanner;

public class ejer11_palinEspaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		do {
			
			//pedimos string
			Scanner teclado = new Scanner(System.in);

			String str = " ";
			do {
				System.out.println("Introduce texto: ");
				str = teclado.nextLine();
				if (str == "" && str.length() == 80)
					System.err.println("Error, introduce otro texto.");
			} while (str == "" && str.length() == 100);
			//quitamos espacios
			str = str.replace(" ", "");
			
//			for (int i = 0; i < str.length(); i++) {
//				
//				if (str.charAt(i) == ' ' ) {
//					String a = "";
//					str.charAt(i) = a;
//				}
//			}
			//comparamos palindromo 
			boolean pal =false;
			int mitad = str.length()/2;
			
			for (int i = 0; i < mitad; i++) {

				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					System.out.println(str + " no es palindromo. ");
					break;
				} else {
					pal = true;
				}
			}
			if (pal = true) {
				System.out.println(str + " es palindromo.");				
			}

		} while (1 == 1);
		
		
	}

}
