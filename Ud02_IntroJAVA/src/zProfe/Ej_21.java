package zProfe;

import java.util.Scanner;

public class Ej_21 {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("a: ");
		int a = teclado.nextInt();
		System.out.print("b: ");
		int b = teclado.nextInt();
		
		
		for(int i=a; i<=b ; i++) {
			//System.out.print(i);
			if(Ej_20.esPrimo(i))
				System.out.print(" "+i);
				//System.out.print("  <-- Es primo");
			//System.out.println();
		}
		
		teclado.close();
	}

}
