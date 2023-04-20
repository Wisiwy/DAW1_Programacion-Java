package Ejercicios;

import java.util.Scanner;

public class Ejercicio26_Divisores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("******CALCULADORA DE DIVISORES******");
		System.out.println("------------------------------------");
		int num = teclado.nextInt();
		
		for (int i = 1; i<=num; i++) {
			if (num%i == 0) {
				System.out.print(i);
			}
		}
			teclado.close();	
	}

}
