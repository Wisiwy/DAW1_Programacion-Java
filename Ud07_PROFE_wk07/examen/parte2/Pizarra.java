package parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizarra {
	
	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		
			
		System.out.print("Número: ");
		int num = 0;
		try {	
			num = t.nextInt();
			
			System.out.println("Has introducido: "+num);
		}catch(InputMismatchException e) {
			System.out.println("Error en la entrada");
		}
		
		System.out.println("sigo en el programa");
	}

}
