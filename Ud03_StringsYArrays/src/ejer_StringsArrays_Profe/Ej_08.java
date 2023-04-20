package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_08 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Palabra: ");
		String str = teclado.nextLine();
		
		
		int cont=1;
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i));
			
			if(str.charAt(i) == ' ') {
				System.out.println();
				cont++;
			}
		}	
		
		
		
		//*********************
		
		String[] vector = str.split(" ");
		
		System.out.println("He encontrado "+vector.length+" nombres.");
		
		for(int i=0 ; i < vector.length ; i++) {
			System.out.println(vector[i]);
		}
		
		
	}

}
