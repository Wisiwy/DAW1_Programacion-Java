package zProfe;

import java.util.Scanner;

public class Ej_13 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		int a = teclado.nextInt();
		System.out.println("El absoluto es: " + Math.abs(a));
		
		/*System.out.print("Introduce numero: ");
		int a = teclado.nextInt();
		if (a<0) {
			a = a * -1;
		}
		System.out.println("El absoluto es: " + a);*/
		
		
		
		
		
	teclado.close();	
	}

}
