package ejer_Estaticos;

import java.util.Scanner;

public class Ej03_Factorial {

	public static void main(String[] args) {

		System.out.println("CALCULADORA FACTORIAL");
		System.out.println("---------------------");
		int n = leerIntPositivo("Intro n� positivo (>0):" );
		
		System.out.printf("Factorial de %d = %3d \n",n,esFactorial(n));
		
		
	}

	
	private static int esFactorial(int n) {
		int fact = 1;
		System.out.printf("F(%2d)/",n);
		for (int i = 1; i <= n; i++) {
			fact = i * fact;
		}
		return fact;
		
		
	}


	private static int leerIntPositivo(String string) {

		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print(string);
			valor = teclado.nextInt();
			if (valor < 0)
				System.err.println("Numero erroneo.");
		} while (valor < 0);
		return valor;
	}
}
