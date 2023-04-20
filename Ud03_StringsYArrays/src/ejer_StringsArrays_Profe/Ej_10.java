package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_10 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String str="";
		
		do {
			System.out.print("Palabra: ");
			str = teclado.nextLine();
			if(palindromo(str.toLowerCase()) && str!="")
				System.out.println("Es palindromo.");
			else if(str!="")				
				System.out.println("No es palindromo");
		}while(str!="");
		
	}
	

	/**
	 * 
	 * @param str cadena que verifica si es un palindromo
	 * @return true si la cadena es palindromo, false sino.
	 */
	public static boolean palindromo(String str) {
		
		for(int i=0 ; i< (str.length()/2) ; i++) 
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		
		return true;
	}

}
