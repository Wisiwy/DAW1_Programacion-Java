package Ejercicios;

import java.util.Scanner;

public class Ejercicio30_numPerfecto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("******CALCULADORA DE PERFECTOS******");
		System.out.println("------------------------------------");
		// int num = teclado.nextInt();
		int sum = 0, cont = 2, num = 1;
		// Para solo sacar 4 perfectos.
		while (cont > 0) {
			for (int i = 1; i < num; i++) {

				//System.out.print(num + "->");
				if (num % i == 0) {
					//System.out.print(i);
					sum = sum + i;
				}
			}
			//System.out.print(sum);
			if (sum == num) {
				System.out.print(num);
				System.out.println(" Es perfecto! ");
				cont--;
			}
			sum = 0;
			num++;
		}
		teclado.close();

	}

}
