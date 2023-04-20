package zProfe;

import java.util.Scanner;

public class Ej_03 {
	
	public static void main(String[] args) {
		
		//intercambio de variables
		Scanner teclado = new Scanner(System.in);
		
		//pido datos
		System.out.print("Introduce A: ");
		int a = teclado.nextInt();
		System.out.print("Introduce B: ");
		int b = teclado.nextInt();
		
		if( a > b) {
			int aux = a;
			a = b;
			b=aux;
		}
		
		System.out.println("A: "+a+" B: "+b);
		teclado.close();
	}

}
