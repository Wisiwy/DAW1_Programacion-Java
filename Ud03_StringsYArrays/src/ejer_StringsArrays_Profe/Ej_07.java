package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_07 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Palabra: ");
		String str = teclado.nextLine();
		
		if(str.length() > 80) {
			str = str.substring(0, 80);
		}
		
		
		for(int i=0 ; i<str.length() ; i++) {
			for(int j=0 ; j <=i ; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		
		String acum="";
		for(int i=0 ; i<str.length() ; i++) {
			acum = acum+str.charAt(i);
			System.out.println(acum);
		}
		
		for(int i=0 ; i<str.length() ; i++) {
			System.out.println(str.substring(0,i+1));
		}
		
	}

}
