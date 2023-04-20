package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_11 {
	
	public static void main(String[] args) {
		
			
		Scanner teclado = new Scanner(System.in);
		String str="";
		
		do {
			System.out.print("Palabra: ");
			str = teclado.nextLine();
			if(Ej_10.palindromo(str.toLowerCase().replace(" ", "")) && str!="")
				System.out.println("Es palindromo.");
			else if(str!="")				
				System.out.println("No es palindromo");
		}while(str!="");
		
	}

}
