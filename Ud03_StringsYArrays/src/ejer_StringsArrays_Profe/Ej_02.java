package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_02 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Texto: ");
		String str = teclado.nextLine();
		
		int num;
		
		do {
		
			System.out.print("Num(1-"+str.length()+"): ");
			
			num = teclado.nextInt();
			if(num <= str.length() && num > 0) 
				System.out.println(str.charAt(num-1));
			else
				System.err.println("introduce otro n�mero entre (1-"+str.length()+")");
			
			
		}while(num > 0);
		System.out.println("Fin del programa");
		
	}

}
